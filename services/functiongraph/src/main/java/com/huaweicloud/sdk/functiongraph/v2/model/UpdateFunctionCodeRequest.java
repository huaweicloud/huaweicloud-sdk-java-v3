package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateFunctionCodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    @JacksonXmlProperty(localName = "function_urn")

    private String functionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateFunctionCodeRequestBody body;

    public UpdateFunctionCodeRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /**
     * 函数的URN，详细解释见表1 FunctionGraph函数字段说明表的描述。
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public UpdateFunctionCodeRequest withBody(UpdateFunctionCodeRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateFunctionCodeRequest withBody(Consumer<UpdateFunctionCodeRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateFunctionCodeRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateFunctionCodeRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateFunctionCodeRequestBody body) {
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
        UpdateFunctionCodeRequest updateFunctionCodeRequest = (UpdateFunctionCodeRequest) o;
        return Objects.equals(this.functionUrn, updateFunctionCodeRequest.functionUrn)
            && Objects.equals(this.body, updateFunctionCodeRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFunctionCodeRequest {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
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
