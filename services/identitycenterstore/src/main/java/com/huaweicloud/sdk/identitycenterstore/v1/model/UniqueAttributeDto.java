package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * An entity attribute that&#39;s unique to a specific entity.
 */
public class UniqueAttributeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute_path")

    private String attributePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute_value")

    private String attributeValue;

    public UniqueAttributeDto withAttributePath(String attributePath) {
        this.attributePath = attributePath;
        return this;
    }

    /**
     * 属性路径
     * @return attributePath
     */
    public String getAttributePath() {
        return attributePath;
    }

    public void setAttributePath(String attributePath) {
        this.attributePath = attributePath;
    }

    public UniqueAttributeDto withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }

    /**
     * 属性的值
     * @return attributeValue
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UniqueAttributeDto that = (UniqueAttributeDto) obj;
        return Objects.equals(this.attributePath, that.attributePath)
            && Objects.equals(this.attributeValue, that.attributeValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributePath, attributeValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UniqueAttributeDto {\n");
        sb.append("    attributePath: ").append(toIndentedString(attributePath)).append("\n");
        sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
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
