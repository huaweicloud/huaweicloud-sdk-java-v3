package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComponentEnvironment
 */
public class ComponentEnvironment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_from")

    private ComponentEnvironmentValueFrom valueFrom;

    public ComponentEnvironment withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentEnvironment withValue(String value) {
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

    public ComponentEnvironment withValueFrom(ComponentEnvironmentValueFrom valueFrom) {
        this.valueFrom = valueFrom;
        return this;
    }

    public ComponentEnvironment withValueFrom(Consumer<ComponentEnvironmentValueFrom> valueFromSetter) {
        if (this.valueFrom == null) {
            this.valueFrom = new ComponentEnvironmentValueFrom();
            valueFromSetter.accept(this.valueFrom);
        }

        return this;
    }

    /**
     * Get valueFrom
     * @return valueFrom
     */
    public ComponentEnvironmentValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(ComponentEnvironmentValueFrom valueFrom) {
        this.valueFrom = valueFrom;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentEnvironment componentEnvironment = (ComponentEnvironment) o;
        return Objects.equals(this.name, componentEnvironment.name)
            && Objects.equals(this.value, componentEnvironment.value)
            && Objects.equals(this.valueFrom, componentEnvironment.valueFrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, valueFrom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentEnvironment {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
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
