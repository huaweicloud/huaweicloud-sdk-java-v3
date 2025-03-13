package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据分级分类诊断结果
 */
public class ClassificationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private DiagnoseResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_level")

    private Boolean securityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification")

    private Boolean classification;

    public ClassificationResult withResult(DiagnoseResult result) {
        this.result = result;
        return this;
    }

    /**
     * Get result
     * @return result
     */
    public DiagnoseResult getResult() {
        return result;
    }

    public void setResult(DiagnoseResult result) {
        this.result = result;
    }

    public ClassificationResult withSecurityLevel(Boolean securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }

    /**
     * 是否配置了密级
     * @return securityLevel
     */
    public Boolean getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(Boolean securityLevel) {
        this.securityLevel = securityLevel;
    }

    public ClassificationResult withClassification(Boolean classification) {
        this.classification = classification;
        return this;
    }

    /**
     * 是否配置了分类
     * @return classification
     */
    public Boolean getClassification() {
        return classification;
    }

    public void setClassification(Boolean classification) {
        this.classification = classification;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassificationResult that = (ClassificationResult) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.securityLevel, that.securityLevel)
            && Objects.equals(this.classification, that.classification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, securityLevel, classification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClassificationResult {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
        sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
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
