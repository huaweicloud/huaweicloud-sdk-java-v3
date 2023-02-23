package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源聚合器状态响应体。
 */
public class AggregatedSourceStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_error_code")

    private String lastErrorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_error_message")

    private String lastErrorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_status")

    private String lastUpdateStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    public AggregatedSourceStatus withLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
        return this;
    }

    /**
     * 源帐号最近一次聚合失败时返回的错误码。
     * @return lastErrorCode
     */
    public String getLastErrorCode() {
        return lastErrorCode;
    }

    public void setLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
    }

    public AggregatedSourceStatus withLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
        return this;
    }

    /**
     * 源帐号最近一次聚合失败时返回的错误消息。
     * @return lastErrorMessage
     */
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    public AggregatedSourceStatus withLastUpdateStatus(String lastUpdateStatus) {
        this.lastUpdateStatus = lastUpdateStatus;
        return this;
    }

    /**
     * 最近一次更新的状态类型。
     * @return lastUpdateStatus
     */
    public String getLastUpdateStatus() {
        return lastUpdateStatus;
    }

    public void setLastUpdateStatus(String lastUpdateStatus) {
        this.lastUpdateStatus = lastUpdateStatus;
    }

    public AggregatedSourceStatus withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最近一次更新的时间。
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public AggregatedSourceStatus withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 源帐号ID或组织。
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public AggregatedSourceStatus withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 源帐号类型（ACCOUNT | ORGANIZATION）。
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AggregatedSourceStatus aggregatedSourceStatus = (AggregatedSourceStatus) o;
        return Objects.equals(this.lastErrorCode, aggregatedSourceStatus.lastErrorCode)
            && Objects.equals(this.lastErrorMessage, aggregatedSourceStatus.lastErrorMessage)
            && Objects.equals(this.lastUpdateStatus, aggregatedSourceStatus.lastUpdateStatus)
            && Objects.equals(this.lastUpdateTime, aggregatedSourceStatus.lastUpdateTime)
            && Objects.equals(this.sourceId, aggregatedSourceStatus.sourceId)
            && Objects.equals(this.sourceType, aggregatedSourceStatus.sourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastErrorCode, lastErrorMessage, lastUpdateStatus, lastUpdateTime, sourceId, sourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregatedSourceStatus {\n");
        sb.append("    lastErrorCode: ").append(toIndentedString(lastErrorCode)).append("\n");
        sb.append("    lastErrorMessage: ").append(toIndentedString(lastErrorMessage)).append("\n");
        sb.append("    lastUpdateStatus: ").append(toIndentedString(lastUpdateStatus)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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
