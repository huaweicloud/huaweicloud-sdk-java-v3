package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MicroserviceLabel
 */
public class MicroserviceLabel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_name")

    private String labelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_value")

    private String labelValue;

    public MicroserviceLabel withLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    /**
     * 标签名称。  以字母或者数字开头和结尾，由字母、数字、连接符('-')、下划线('_')、点号('.')组成且63个字符之内。
     * @return labelName
     */
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public MicroserviceLabel withLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }

    /**
     * 标签值。  以字母或者数字开头和结尾，由字母、数字、连接符('-')、下划线('_')、点号('.')组成且63个字符之内。
     * @return labelValue
     */
    public String getLabelValue() {
        return labelValue;
    }

    public void setLabelValue(String labelValue) {
        this.labelValue = labelValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MicroserviceLabel microserviceLabel = (MicroserviceLabel) o;
        return Objects.equals(this.labelName, microserviceLabel.labelName)
            && Objects.equals(this.labelValue, microserviceLabel.labelValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelName, labelValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicroserviceLabel {\n");
        sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
        sb.append("    labelValue: ").append(toIndentedString(labelValue)).append("\n");
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
