package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateGlobalValueRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "var_name")

    @JacksonXmlProperty(localName = "var_name")

    private String varName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateGlobalValueReq body;

    public UpdateGlobalValueRequest withVarName(String varName) {
        this.varName = varName;
        return this;
    }

    /**
     * 全局变量名，名称只能包含数字、英文字母和下划线，但不能是纯数字，不能以下划线开头，且不能超过128字符
     * @return varName
     */
    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public UpdateGlobalValueRequest withBody(UpdateGlobalValueReq body) {
        this.body = body;
        return this;
    }

    public UpdateGlobalValueRequest withBody(Consumer<UpdateGlobalValueReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateGlobalValueReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateGlobalValueReq getBody() {
        return body;
    }

    public void setBody(UpdateGlobalValueReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateGlobalValueRequest updateGlobalValueRequest = (UpdateGlobalValueRequest) o;
        return Objects.equals(this.varName, updateGlobalValueRequest.varName)
            && Objects.equals(this.body, updateGlobalValueRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(varName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGlobalValueRequest {\n");
        sb.append("    varName: ").append(toIndentedString(varName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
