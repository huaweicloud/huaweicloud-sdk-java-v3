package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateTracingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    private String functionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateTracingRequestBody body;

    public UpdateTracingRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /** 函数的URN（Uniform Resource Name），唯一标识函数。
     * 
     * @return functionUrn */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public UpdateTracingRequest withBody(UpdateTracingRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTracingRequest withBody(Consumer<UpdateTracingRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateTracingRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateTracingRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateTracingRequestBody body) {
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
        UpdateTracingRequest updateTracingRequest = (UpdateTracingRequest) o;
        return Objects.equals(this.functionUrn, updateTracingRequest.functionUrn)
            && Objects.equals(this.body, updateTracingRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTracingRequest {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
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
