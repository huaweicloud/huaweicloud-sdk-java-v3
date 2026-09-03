package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskExtParam
 */
public class TaskExtParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete")

    private Boolean delete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitiveInfo")

    private Boolean sensitiveInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variableType")

    private String variableType;

    public TaskExtParam withDelete(Boolean delete) {
        this.delete = delete;
        return this;
    }

    /**
     * 是否删除
     * @return delete
     */
    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public TaskExtParam withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TaskExtParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskExtParam withSensitiveInfo(Boolean sensitiveInfo) {
        this.sensitiveInfo = sensitiveInfo;
        return this;
    }

    /**
     * 是否敏感信息：true-敏感信息，false-非敏感信息
     * @return sensitiveInfo
     */
    public Boolean getSensitiveInfo() {
        return sensitiveInfo;
    }

    public void setSensitiveInfo(Boolean sensitiveInfo) {
        this.sensitiveInfo = sensitiveInfo;
    }

    public TaskExtParam withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 参数值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TaskExtParam withVariableType(String variableType) {
        this.variableType = variableType;
        return this;
    }

    /**
     * 参数类型
     * @return variableType
     */
    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskExtParam that = (TaskExtParam) obj;
        return Objects.equals(this.delete, that.delete) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.sensitiveInfo, that.sensitiveInfo)
            && Objects.equals(this.value, that.value) && Objects.equals(this.variableType, that.variableType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delete, id, name, sensitiveInfo, value, variableType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskExtParam {\n");
        sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sensitiveInfo: ").append(toIndentedString(sensitiveInfo)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
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
