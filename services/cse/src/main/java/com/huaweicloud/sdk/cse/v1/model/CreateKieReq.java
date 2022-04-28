package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateKieReq
 */
public class CreateKieReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Object labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private String valueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CreateKieReq withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 配置项的key。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CreateKieReq withLabels(Object labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 配置项的标签
     * @return labels
     */
    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    public CreateKieReq withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 配置项的值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CreateKieReq withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * 配置项value的类型。
     * @return valueType
     */
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public CreateKieReq withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 配置项的状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateKieReq createKieReq = (CreateKieReq) o;
        return Objects.equals(this.key, createKieReq.key) && Objects.equals(this.labels, createKieReq.labels)
            && Objects.equals(this.value, createKieReq.value) && Objects.equals(this.valueType, createKieReq.valueType)
            && Objects.equals(this.status, createKieReq.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, labels, value, valueType, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKieReq {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
