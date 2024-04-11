package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据加工信息。
 */
public class CreateDataCompareTransformationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transformation_type")

    private String transformationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public CreateDataCompareTransformationInfo withTransformationType(String transformationType) {
        this.transformationType = transformationType;
        return this;
    }

    /**
     * 加工规则，值为contentConditionalFilter。
     * @return transformationType
     */
    public String getTransformationType() {
        return transformationType;
    }

    public void setTransformationType(String transformationType) {
        this.transformationType = transformationType;
    }

    public CreateDataCompareTransformationInfo withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 过滤条件，值为sql条件语句，例如id>100，长度限制256。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDataCompareTransformationInfo that = (CreateDataCompareTransformationInfo) obj;
        return Objects.equals(this.transformationType, that.transformationType)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transformationType, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDataCompareTransformationInfo {\n");
        sb.append("    transformationType: ").append(toIndentedString(transformationType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
