package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分类映射函数参数信息
 */
public class Params {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "example")

    private String example;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mandatory")

    private Boolean mandatory;

    public Params withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 分类映射id
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Params withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 分类映射id
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Params withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Params withExample(String example) {
        this.example = example;
        return this;
    }

    /**
     * 示例
     * @return example
     */
    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public Params withMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
        return this;
    }

    /**
     * 是否必填
     * @return mandatory
     */
    public Boolean getMandatory() {
        return mandatory;
    }

    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Params that = (Params) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value)
            && Objects.equals(this.description, that.description) && Objects.equals(this.example, that.example)
            && Objects.equals(this.mandatory, that.mandatory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, description, example, mandatory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Params {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    example: ").append(toIndentedString(example)).append("\n");
        sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
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
