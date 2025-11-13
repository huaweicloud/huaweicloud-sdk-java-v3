package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLiveWarningInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_warning_info")

    private List<LiveWarningItem> liveWarningInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_duration")

    private Integer limitDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowLiveWarningInfoResponse withLiveWarningInfo(List<LiveWarningItem> liveWarningInfo) {
        this.liveWarningInfo = liveWarningInfo;
        return this;
    }

    public ShowLiveWarningInfoResponse addLiveWarningInfoItem(LiveWarningItem liveWarningInfoItem) {
        if (this.liveWarningInfo == null) {
            this.liveWarningInfo = new ArrayList<>();
        }
        this.liveWarningInfo.add(liveWarningInfoItem);
        return this;
    }

    public ShowLiveWarningInfoResponse withLiveWarningInfo(Consumer<List<LiveWarningItem>> liveWarningInfoSetter) {
        if (this.liveWarningInfo == null) {
            this.liveWarningInfo = new ArrayList<>();
        }
        liveWarningInfoSetter.accept(this.liveWarningInfo);
        return this;
    }

    /**
     * 开播风险告警列表。
     * @return liveWarningInfo
     */
    public List<LiveWarningItem> getLiveWarningInfo() {
        return liveWarningInfo;
    }

    public void setLiveWarningInfo(List<LiveWarningItem> liveWarningInfo) {
        this.liveWarningInfo = liveWarningInfo;
    }

    public ShowLiveWarningInfoResponse withLimitDuration(Integer limitDuration) {
        this.limitDuration = limitDuration;
        return this;
    }

    /**
     * **参数解释**： 配置的最大直播时长。单位小时。 0 为不限制。 **约束限制**： 停止直播逻辑配置为立即停止则直播停止误差在5分钟之内。其他逻辑则加上处理时长。 **默认取值**： 不设置则表示不限时。
     * minimum: 0
     * maximum: 168
     * @return limitDuration
     */
    public Integer getLimitDuration() {
        return limitDuration;
    }

    public void setLimitDuration(Integer limitDuration) {
        this.limitDuration = limitDuration;
    }

    public ShowLiveWarningInfoResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLiveWarningInfoResponse that = (ShowLiveWarningInfoResponse) obj;
        return Objects.equals(this.liveWarningInfo, that.liveWarningInfo)
            && Objects.equals(this.limitDuration, that.limitDuration)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liveWarningInfo, limitDuration, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLiveWarningInfoResponse {\n");
        sb.append("    liveWarningInfo: ").append(toIndentedString(liveWarningInfo)).append("\n");
        sb.append("    limitDuration: ").append(toIndentedString(limitDuration)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
