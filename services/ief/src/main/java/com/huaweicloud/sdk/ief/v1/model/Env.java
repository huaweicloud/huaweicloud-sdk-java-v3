package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 环境变量 */
public class Env {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_from")

    private EnvValueFrom valueFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_path")

    private String fieldPath;

    public Env withName(String name) {
        this.name = name;
        return this;
    }

    /** 环境变量的key，由大小写字母或下划线开头，由数字、大小写字母、下划线组成，最大长度2048个字符，不允许重复
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Env withValue(String value) {
        this.value = value;
        return this;
    }

    /** 环境变量的value，最大长度20480个字符。value、value_from和field_path必须三选一使用。
     * 
     * @return value */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Env withValueFrom(EnvValueFrom valueFrom) {
        this.valueFrom = valueFrom;
        return this;
    }

    public Env withValueFrom(Consumer<EnvValueFrom> valueFromSetter) {
        if (this.valueFrom == null) {
            this.valueFrom = new EnvValueFrom();
            valueFromSetter.accept(this.valueFrom);
        }

        return this;
    }

    /** Get valueFrom
     * 
     * @return valueFrom */
    public EnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(EnvValueFrom valueFrom) {
        this.valueFrom = valueFrom;
    }

    public Env withFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
        return this;
    }

    /** 该参数目前只支持赋值\"status.hostIP\"，即引用边缘节点的IP地址作为环境变量。
     * 
     * @return fieldPath */
    public String getFieldPath() {
        return fieldPath;
    }

    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Env env = (Env) o;
        return Objects.equals(this.name, env.name) && Objects.equals(this.value, env.value)
            && Objects.equals(this.valueFrom, env.valueFrom) && Objects.equals(this.fieldPath, env.fieldPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, valueFrom, fieldPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Env {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
        sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
