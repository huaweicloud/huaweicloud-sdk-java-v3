package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApiTemplateVariable
 */
public class ApiTemplateVariable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_name")

    private String tempName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_index")

    private Integer variableIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_type")

    private String variableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_length")

    private Integer variableLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_desc")

    private String variableDesc;

    public ApiTemplateVariable withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 变量id
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ApiTemplateVariable withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ApiTemplateVariable withTempName(String tempName) {
        this.tempName = tempName;
        return this;
    }

    /**
     * 模板名称
     * @return tempName
     */
    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }

    public ApiTemplateVariable withVariableIndex(Integer variableIndex) {
        this.variableIndex = variableIndex;
        return this;
    }

    /**
     * 变量索引
     * minimum: 1
     * maximum: 20
     * @return variableIndex
     */
    public Integer getVariableIndex() {
        return variableIndex;
    }

    public void setVariableIndex(Integer variableIndex) {
        this.variableIndex = variableIndex;
    }

    public ApiTemplateVariable withVariableType(String variableType) {
        this.variableType = variableType;
        return this;
    }

    /**
     * 变量类型
     * @return variableType
     */
    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    public ApiTemplateVariable withVariableLength(Integer variableLength) {
        this.variableLength = variableLength;
        return this;
    }

    /**
     * 变量长度
     * minimum: 1
     * maximum: 2147483647
     * @return variableLength
     */
    public Integer getVariableLength() {
        return variableLength;
    }

    public void setVariableLength(Integer variableLength) {
        this.variableLength = variableLength;
    }

    public ApiTemplateVariable withVariableDesc(String variableDesc) {
        this.variableDesc = variableDesc;
        return this;
    }

    /**
     * 变量描述
     * @return variableDesc
     */
    public String getVariableDesc() {
        return variableDesc;
    }

    public void setVariableDesc(String variableDesc) {
        this.variableDesc = variableDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiTemplateVariable that = (ApiTemplateVariable) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.tempName, that.tempName) && Objects.equals(this.variableIndex, that.variableIndex)
            && Objects.equals(this.variableType, that.variableType)
            && Objects.equals(this.variableLength, that.variableLength)
            && Objects.equals(this.variableDesc, that.variableDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, tempName, variableIndex, variableType, variableLength, variableDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiTemplateVariable {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    tempName: ").append(toIndentedString(tempName)).append("\n");
        sb.append("    variableIndex: ").append(toIndentedString(variableIndex)).append("\n");
        sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
        sb.append("    variableLength: ").append(toIndentedString(variableLength)).append("\n");
        sb.append("    variableDesc: ").append(toIndentedString(variableDesc)).append("\n");
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
