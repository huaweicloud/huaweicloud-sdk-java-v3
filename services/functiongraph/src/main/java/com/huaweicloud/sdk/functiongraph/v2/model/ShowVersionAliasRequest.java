package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowVersionAliasRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    @JacksonXmlProperty(localName = "function_urn")

    private String functionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_name")

    @JacksonXmlProperty(localName = "alias_name")

    private String aliasName;

    public ShowVersionAliasRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /**
     * 函数的URN，详细解释见FunctionGraph函数模型的描述。
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public ShowVersionAliasRequest withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * 要查询的别名名称。
     * @return aliasName
     */
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowVersionAliasRequest showVersionAliasRequest = (ShowVersionAliasRequest) o;
        return Objects.equals(this.functionUrn, showVersionAliasRequest.functionUrn)
            && Objects.equals(this.aliasName, showVersionAliasRequest.aliasName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, aliasName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVersionAliasRequest {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
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
