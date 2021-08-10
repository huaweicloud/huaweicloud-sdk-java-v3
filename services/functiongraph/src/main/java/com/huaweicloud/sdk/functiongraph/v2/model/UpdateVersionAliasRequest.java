package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateVersionAliasRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    private String functionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_name")

    private String aliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateVersionAliasRequestBody body;

    public UpdateVersionAliasRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /** 函数的URN，详细解释见FunctionGraph函数模型的描述。
     * 
     * @return functionUrn */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public UpdateVersionAliasRequest withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /** 要更新的别名名称。
     * 
     * @return aliasName */
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public UpdateVersionAliasRequest withBody(UpdateVersionAliasRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateVersionAliasRequest withBody(Consumer<UpdateVersionAliasRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateVersionAliasRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateVersionAliasRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateVersionAliasRequestBody body) {
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
        UpdateVersionAliasRequest updateVersionAliasRequest = (UpdateVersionAliasRequest) o;
        return Objects.equals(this.functionUrn, updateVersionAliasRequest.functionUrn)
            && Objects.equals(this.aliasName, updateVersionAliasRequest.aliasName)
            && Objects.equals(this.body, updateVersionAliasRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, aliasName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVersionAliasRequest {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
