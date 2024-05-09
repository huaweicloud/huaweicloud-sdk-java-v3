package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 对象级对比详情信息体。
 */
public class ObjectsCompareDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_name")

    private String sourceDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_name")

    private String targetDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_value")

    private String sourceDbValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_value")

    private String targetDbValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public ObjectsCompareDetailInfo withSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
        return this;
    }

    /**
     * 源库名称。
     * @return sourceDbName
     */
    public String getSourceDbName() {
        return sourceDbName;
    }

    public void setSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
    }

    public ObjectsCompareDetailInfo withTargetDbName(String targetDbName) {
        this.targetDbName = targetDbName;
        return this;
    }

    /**
     * 目标库名称。
     * @return targetDbName
     */
    public String getTargetDbName() {
        return targetDbName;
    }

    public void setTargetDbName(String targetDbName) {
        this.targetDbName = targetDbName;
    }

    public ObjectsCompareDetailInfo withSourceDbValue(String sourceDbValue) {
        this.sourceDbValue = sourceDbValue;
        return this;
    }

    /**
     * 在源库的值。
     * @return sourceDbValue
     */
    public String getSourceDbValue() {
        return sourceDbValue;
    }

    public void setSourceDbValue(String sourceDbValue) {
        this.sourceDbValue = sourceDbValue;
    }

    public ObjectsCompareDetailInfo withTargetDbValue(String targetDbValue) {
        this.targetDbValue = targetDbValue;
        return this;
    }

    /**
     * 在目标库的值。
     * @return targetDbValue
     */
    public String getTargetDbValue() {
        return targetDbValue;
    }

    public void setTargetDbValue(String targetDbValue) {
        this.targetDbValue = targetDbValue;
    }

    public ObjectsCompareDetailInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 对比结果，0为不一致，2为一致，3为未完成。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ObjectsCompareDetailInfo withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectsCompareDetailInfo that = (ObjectsCompareDetailInfo) obj;
        return Objects.equals(this.sourceDbName, that.sourceDbName)
            && Objects.equals(this.targetDbName, that.targetDbName)
            && Objects.equals(this.sourceDbValue, that.sourceDbValue)
            && Objects.equals(this.targetDbValue, that.targetDbValue) && Objects.equals(this.status, that.status)
            && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDbName, targetDbName, sourceDbValue, targetDbValue, status, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectsCompareDetailInfo {\n");
        sb.append("    sourceDbName: ").append(toIndentedString(sourceDbName)).append("\n");
        sb.append("    targetDbName: ").append(toIndentedString(targetDbName)).append("\n");
        sb.append("    sourceDbValue: ").append(toIndentedString(sourceDbValue)).append("\n");
        sb.append("    targetDbValue: ").append(toIndentedString(targetDbValue)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
