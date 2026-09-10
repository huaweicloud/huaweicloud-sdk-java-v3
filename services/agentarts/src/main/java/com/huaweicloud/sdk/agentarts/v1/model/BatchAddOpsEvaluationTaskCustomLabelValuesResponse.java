package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchAddOpsEvaluationTaskCustomLabelValuesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchTagValueMsg body;

    public BatchAddOpsEvaluationTaskCustomLabelValuesResponse withBody(BatchTagValueMsg body) {
        this.body = body;
        return this;
    }

    public BatchAddOpsEvaluationTaskCustomLabelValuesResponse withBody(Consumer<BatchTagValueMsg> bodySetter) {
        if (this.body == null) {
            this.body = new BatchTagValueMsg();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchTagValueMsg getBody() {
        return body;
    }

    public void setBody(BatchTagValueMsg body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAddOpsEvaluationTaskCustomLabelValuesResponse that =
            (BatchAddOpsEvaluationTaskCustomLabelValuesResponse) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddOpsEvaluationTaskCustomLabelValuesResponse {\n");
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
