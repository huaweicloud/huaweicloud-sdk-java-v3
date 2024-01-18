package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmsTemplateVariableAttrReq
 */
public class SmsTemplateVariableAttrReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_desc")

    private String variableDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_index")

    private Integer variableIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_type")

    private String variableType;

    public SmsTemplateVariableAttrReq withVariableDesc(String variableDesc) {
        this.variableDesc = variableDesc;
        return this;
    }

    /**
     * 变量说明，当变量类型为TEXT时，必填
     * @return variableDesc
     */
    public String getVariableDesc() {
        return variableDesc;
    }

    public void setVariableDesc(String variableDesc) {
        this.variableDesc = variableDesc;
    }

    public SmsTemplateVariableAttrReq withVariableIndex(Integer variableIndex) {
        this.variableIndex = variableIndex;
        return this;
    }

    /**
     * 变量索引，对应模板内容变量索引
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

    public SmsTemplateVariableAttrReq withVariableType(String variableType) {
        this.variableType = variableType;
        return this;
    }

    /**
     * 变量类型，目前支持：PHONE|CHARDIGIT|DATETIME|MONEY|TEXT|NEWTEXT|LONGTEXT
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
        SmsTemplateVariableAttrReq that = (SmsTemplateVariableAttrReq) obj;
        return Objects.equals(this.variableDesc, that.variableDesc)
            && Objects.equals(this.variableIndex, that.variableIndex)
            && Objects.equals(this.variableType, that.variableType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableDesc, variableIndex, variableType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsTemplateVariableAttrReq {\n");
        sb.append("    variableDesc: ").append(toIndentedString(variableDesc)).append("\n");
        sb.append("    variableIndex: ").append(toIndentedString(variableIndex)).append("\n");
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
