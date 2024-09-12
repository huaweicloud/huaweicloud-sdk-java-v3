package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RTC回调事件配置。兼容处理，未携带配置则默认订阅LIVE_PROGRESS
 */
public class RTCLiveEventCallBackConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtc_callback_event_type")

    private List<String> rtcCallbackEventType = null;

    public RTCLiveEventCallBackConfig withRtcCallbackEventType(List<String> rtcCallbackEventType) {
        this.rtcCallbackEventType = rtcCallbackEventType;
        return this;
    }

    public RTCLiveEventCallBackConfig addRtcCallbackEventTypeItem(String rtcCallbackEventTypeItem) {
        if (this.rtcCallbackEventType == null) {
            this.rtcCallbackEventType = new ArrayList<>();
        }
        this.rtcCallbackEventType.add(rtcCallbackEventTypeItem);
        return this;
    }

    public RTCLiveEventCallBackConfig withRtcCallbackEventType(Consumer<List<String>> rtcCallbackEventTypeSetter) {
        if (this.rtcCallbackEventType == null) {
            this.rtcCallbackEventType = new ArrayList<>();
        }
        rtcCallbackEventTypeSetter.accept(this.rtcCallbackEventType);
        return this;
    }

    /**
     * RTC回调的直播事件类型列表。  当前仅支持如下取值： * LIVE_PROGRESS：直播剧本进度通知。  * REPLY_COMMAND_FINISH：回复播放完成通知。  回调事件结构体定义： * message_type：消息类型。 * data：消息描述。   - LIVE_PROGRESS事件回调定义如下：     ```json     {         \"message_type\": \"live_progress_notify\",         \"data\": {             \"script_name\": \"场景一\",             \"shoot_script_sequence_no\": 2,             \"shoot_script_title\": \"引导语\",             \"offset\": \"247\",             \"reply_id\": \"e87104f76d7546ce8a46ac6b04c49c3c\"         }     }     ```   - REPLY_COMMAND_FINISH回调定义如下：     ```json     {       \"message_type\": \"reply_command_finish_notify\",       \"data\":\"{         \"reply_id\":\"e87104f76d7546ce8a46ac6b04c49c3c\"       }\"     }     ```
     * @return rtcCallbackEventType
     */
    public List<String> getRtcCallbackEventType() {
        return rtcCallbackEventType;
    }

    public void setRtcCallbackEventType(List<String> rtcCallbackEventType) {
        this.rtcCallbackEventType = rtcCallbackEventType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RTCLiveEventCallBackConfig that = (RTCLiveEventCallBackConfig) obj;
        return Objects.equals(this.rtcCallbackEventType, that.rtcCallbackEventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rtcCallbackEventType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RTCLiveEventCallBackConfig {\n");
        sb.append("    rtcCallbackEventType: ").append(toIndentedString(rtcCallbackEventType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
