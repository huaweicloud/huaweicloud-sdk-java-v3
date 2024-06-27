package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回放异常SQL分类数据项
 */
public class ReplayErrorClassification {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_name")

    private String targetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_type")

    private String errorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_cnt")

    private String errorCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_template_cnt")

    private String errorTemplateCnt;

    public ReplayErrorClassification withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * 目标库标识
     * @return targetName
     */
    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public ReplayErrorClassification withErrorType(String errorType) {
        this.errorType = errorType;
        return this;
    }

    /**
     * 异常SQL分类
     * @return errorType
     */
    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public ReplayErrorClassification withErrorCnt(String errorCnt) {
        this.errorCnt = errorCnt;
        return this;
    }

    /**
     * 异常SQL数量
     * @return errorCnt
     */
    public String getErrorCnt() {
        return errorCnt;
    }

    public void setErrorCnt(String errorCnt) {
        this.errorCnt = errorCnt;
    }

    public ReplayErrorClassification withErrorTemplateCnt(String errorTemplateCnt) {
        this.errorTemplateCnt = errorTemplateCnt;
        return this;
    }

    /**
     * 异常SQL模板数量
     * @return errorTemplateCnt
     */
    public String getErrorTemplateCnt() {
        return errorTemplateCnt;
    }

    public void setErrorTemplateCnt(String errorTemplateCnt) {
        this.errorTemplateCnt = errorTemplateCnt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplayErrorClassification that = (ReplayErrorClassification) obj;
        return Objects.equals(this.targetName, that.targetName) && Objects.equals(this.errorType, that.errorType)
            && Objects.equals(this.errorCnt, that.errorCnt)
            && Objects.equals(this.errorTemplateCnt, that.errorTemplateCnt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetName, errorType, errorCnt, errorTemplateCnt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplayErrorClassification {\n");
        sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
        sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
        sb.append("    errorCnt: ").append(toIndentedString(errorCnt)).append("\n");
        sb.append("    errorTemplateCnt: ").append(toIndentedString(errorTemplateCnt)).append("\n");
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
