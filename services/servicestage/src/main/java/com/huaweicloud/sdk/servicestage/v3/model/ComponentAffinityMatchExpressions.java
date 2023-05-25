package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComponentAffinityMatchExpressions
 */
public class ComponentAffinityMatchExpressions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    public ComponentAffinityMatchExpressions withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ComponentAffinityMatchExpressions withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ComponentAffinityMatchExpressions withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get operation
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentAffinityMatchExpressions componentAffinityMatchExpressions = (ComponentAffinityMatchExpressions) o;
        return Objects.equals(this.key, componentAffinityMatchExpressions.key)
            && Objects.equals(this.value, componentAffinityMatchExpressions.value)
            && Objects.equals(this.operation, componentAffinityMatchExpressions.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, operation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentAffinityMatchExpressions {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
