package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateFunctionAsyncInvokeConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    @JacksonXmlProperty(localName = "function_urn")

    private String functionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateFunctionAsyncInvokeConfigRequestBody body;

    public UpdateFunctionAsyncInvokeConfigRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /**
     * 函数的URN（Uniform Resource Name），唯一标识函数。
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public UpdateFunctionAsyncInvokeConfigRequest withBody(UpdateFunctionAsyncInvokeConfigRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateFunctionAsyncInvokeConfigRequest withBody(
        Consumer<UpdateFunctionAsyncInvokeConfigRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateFunctionAsyncInvokeConfigRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateFunctionAsyncInvokeConfigRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateFunctionAsyncInvokeConfigRequestBody body) {
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
        UpdateFunctionAsyncInvokeConfigRequest updateFunctionAsyncInvokeConfigRequest =
            (UpdateFunctionAsyncInvokeConfigRequest) o;
        return Objects.equals(this.functionUrn, updateFunctionAsyncInvokeConfigRequest.functionUrn)
            && Objects.equals(this.body, updateFunctionAsyncInvokeConfigRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFunctionAsyncInvokeConfigRequest {\n");
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
