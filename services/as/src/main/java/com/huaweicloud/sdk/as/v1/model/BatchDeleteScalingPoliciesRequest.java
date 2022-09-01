package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteScalingPoliciesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private BatchDeleteScalingPoliciesOption body;

    public BatchDeleteScalingPoliciesRequest withBody(BatchDeleteScalingPoliciesOption body) {
        this.body = body;
        return this;
    }

    public BatchDeleteScalingPoliciesRequest withBody(Consumer<BatchDeleteScalingPoliciesOption> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeleteScalingPoliciesOption();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchDeleteScalingPoliciesOption getBody() {
        return body;
    }

    public void setBody(BatchDeleteScalingPoliciesOption body) {
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
        BatchDeleteScalingPoliciesRequest batchDeleteScalingPoliciesRequest = (BatchDeleteScalingPoliciesRequest) o;
        return Objects.equals(this.body, batchDeleteScalingPoliciesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteScalingPoliciesRequest {\n");
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
