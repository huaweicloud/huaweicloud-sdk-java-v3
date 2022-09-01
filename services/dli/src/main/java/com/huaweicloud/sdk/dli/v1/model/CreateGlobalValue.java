package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 全局变量
 */
public class CreateGlobalValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "var_name")

    @JacksonXmlProperty(localName = "var_name")

    private String varName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "var_value")

    @JacksonXmlProperty(localName = "var_value")

    private String varValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    @JacksonXmlProperty(localName = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    public CreateGlobalValue withVarName(String varName) {
        this.varName = varName;
        return this;
    }

    /**
     * 变量名称
     * @return varName
     */
    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public CreateGlobalValue withVarValue(String varValue) {
        this.varValue = varValue;
        return this;
    }

    /**
     * 变量的值
     * @return varValue
     */
    public String getVarValue() {
        return varValue;
    }

    public void setVarValue(String varValue) {
        this.varValue = varValue;
    }

    public CreateGlobalValue withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateGlobalValue withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CreateGlobalValue withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 全局变量ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateGlobalValue createGlobalValue = (CreateGlobalValue) o;
        return Objects.equals(this.varName, createGlobalValue.varName)
            && Objects.equals(this.varValue, createGlobalValue.varValue)
            && Objects.equals(this.projectId, createGlobalValue.projectId)
            && Objects.equals(this.userId, createGlobalValue.userId) && Objects.equals(this.id, createGlobalValue.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(varName, varValue, projectId, userId, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGlobalValue {\n");
        sb.append("    varName: ").append(toIndentedString(varName)).append("\n");
        sb.append("    varValue: ").append(toIndentedString(varValue)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
