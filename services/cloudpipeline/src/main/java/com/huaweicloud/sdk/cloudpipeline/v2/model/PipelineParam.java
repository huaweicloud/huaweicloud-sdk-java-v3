package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 流水线参数 */
public class PipelineParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_type")

    private String paramType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_static")

    private Boolean isStatic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    public PipelineParam withName(String name) {
        this.name = name;
        return this;
    }

    /** 流水线参数名字
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineParam withValue(String value) {
        this.value = value;
        return this;
    }

    /** 流水线参数值
     * 
     * @return value */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PipelineParam withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 流水线参数描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PipelineParam withParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }

    /** 流水线参数类型
     * 
     * @return paramType */
    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public PipelineParam withIsStatic(Boolean isStatic) {
        this.isStatic = isStatic;
        return this;
    }

    /** 是否静态参数
     * 
     * @return isStatic */
    public Boolean getIsStatic() {
        return isStatic;
    }

    public void setIsStatic(Boolean isStatic) {
        this.isStatic = isStatic;
    }

    public PipelineParam withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /** 是否默认参数
     * 
     * @return isDefault */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PipelineParam pipelineParam = (PipelineParam) o;
        return Objects.equals(this.name, pipelineParam.name) && Objects.equals(this.value, pipelineParam.value)
            && Objects.equals(this.description, pipelineParam.description)
            && Objects.equals(this.paramType, pipelineParam.paramType)
            && Objects.equals(this.isStatic, pipelineParam.isStatic)
            && Objects.equals(this.isDefault, pipelineParam.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, description, paramType, isStatic, isDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineParam {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    paramType: ").append(toIndentedString(paramType)).append("\n");
        sb.append("    isStatic: ").append(toIndentedString(isStatic)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
