package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 最大回看录制时长。在此时间段内会连续不断的录制，为必选项  单位：秒。取值为“0”时，表示不支持录制；最大支持录制14天
 */
public class ModifyOttChannelRecordSettingsRecordSettings {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollingbuffer_duration")

    private Integer rollingbufferDuration;

    public ModifyOttChannelRecordSettingsRecordSettings withRollingbufferDuration(Integer rollingbufferDuration) {
        this.rollingbufferDuration = rollingbufferDuration;
        return this;
    }

    /**
     * 最大回看录制时长。在此时间段内会连续不断的录制，为必选项  单位：秒。取值为“0”时，表示不支持录制；最大支持录制14天。
     * minimum: 0
     * maximum: 1209600
     * @return rollingbufferDuration
     */
    public Integer getRollingbufferDuration() {
        return rollingbufferDuration;
    }

    public void setRollingbufferDuration(Integer rollingbufferDuration) {
        this.rollingbufferDuration = rollingbufferDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyOttChannelRecordSettingsRecordSettings that = (ModifyOttChannelRecordSettingsRecordSettings) obj;
        return Objects.equals(this.rollingbufferDuration, that.rollingbufferDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollingbufferDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyOttChannelRecordSettingsRecordSettings {\n");
        sb.append("    rollingbufferDuration: ").append(toIndentedString(rollingbufferDuration)).append("\n");
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
