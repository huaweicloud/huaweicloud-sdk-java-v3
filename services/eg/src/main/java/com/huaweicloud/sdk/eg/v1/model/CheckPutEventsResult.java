package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckPutEventsResult
 */
public class CheckPutEventsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_name")

    private String sourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_result")

    private Boolean checkResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_detail")

    private String checkDetail;

    public CheckPutEventsResult withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 事件通道id
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public CheckPutEventsResult withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * 事件源名称
     * @return sourceName
     */
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public CheckPutEventsResult withCheckResult(Boolean checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    /**
     * 发送事件是否成功检查结果
     * @return checkResult
     */
    public Boolean getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Boolean checkResult) {
        this.checkResult = checkResult;
    }

    public CheckPutEventsResult withCheckDetail(String checkDetail) {
        this.checkDetail = checkDetail;
        return this;
    }

    /**
     * 发送事件是否成功检查明细
     * @return checkDetail
     */
    public String getCheckDetail() {
        return checkDetail;
    }

    public void setCheckDetail(String checkDetail) {
        this.checkDetail = checkDetail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckPutEventsResult checkPutEventsResult = (CheckPutEventsResult) o;
        return Objects.equals(this.channelId, checkPutEventsResult.channelId)
            && Objects.equals(this.sourceName, checkPutEventsResult.sourceName)
            && Objects.equals(this.checkResult, checkPutEventsResult.checkResult)
            && Objects.equals(this.checkDetail, checkPutEventsResult.checkDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId, sourceName, checkResult, checkDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckPutEventsResult {\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
        sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
        sb.append("    checkDetail: ").append(toIndentedString(checkDetail)).append("\n");
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
