package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 发布订阅报错详情。
 */
public class ListReplicationErrorsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occur_time")

    private String occurTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type_id")

    private String sourceTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_name")

    private String sourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_text")

    private String errorText;

    public ListReplicationErrorsResult withOccurTime(String occurTime) {
        this.occurTime = occurTime;
        return this;
    }

    /**
     * 报错发生时间。
     * @return occurTime
     */
    public String getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(String occurTime) {
        this.occurTime = occurTime;
    }

    public ListReplicationErrorsResult withSourceTypeId(String sourceTypeId) {
        this.sourceTypeId = sourceTypeId;
        return this;
    }

    /**
     * 错误源类型id。
     * @return sourceTypeId
     */
    public String getSourceTypeId() {
        return sourceTypeId;
    }

    public void setSourceTypeId(String sourceTypeId) {
        this.sourceTypeId = sourceTypeId;
    }

    public ListReplicationErrorsResult withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * 错误源名称。
     * @return sourceName
     */
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public ListReplicationErrorsResult withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误代码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ListReplicationErrorsResult withErrorText(String errorText) {
        this.errorText = errorText;
        return this;
    }

    /**
     * 错误消息。
     * @return errorText
     */
    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReplicationErrorsResult that = (ListReplicationErrorsResult) obj;
        return Objects.equals(this.occurTime, that.occurTime) && Objects.equals(this.sourceTypeId, that.sourceTypeId)
            && Objects.equals(this.sourceName, that.sourceName) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorText, that.errorText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(occurTime, sourceTypeId, sourceName, errorCode, errorText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReplicationErrorsResult {\n");
        sb.append("    occurTime: ").append(toIndentedString(occurTime)).append("\n");
        sb.append("    sourceTypeId: ").append(toIndentedString(sourceTypeId)).append("\n");
        sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorText: ").append(toIndentedString(errorText)).append("\n");
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
