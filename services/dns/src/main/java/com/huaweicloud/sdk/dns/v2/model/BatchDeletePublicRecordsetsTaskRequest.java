package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeletePublicRecordsetsTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchDeletePublicRecordsetsTaskRequestBody body;

    public BatchDeletePublicRecordsetsTaskRequest withBody(BatchDeletePublicRecordsetsTaskRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeletePublicRecordsetsTaskRequest withBody(
        Consumer<BatchDeletePublicRecordsetsTaskRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeletePublicRecordsetsTaskRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchDeletePublicRecordsetsTaskRequestBody getBody() {
        return body;
    }

    public void setBody(BatchDeletePublicRecordsetsTaskRequestBody body) {
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
        BatchDeletePublicRecordsetsTaskRequest that = (BatchDeletePublicRecordsetsTaskRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeletePublicRecordsetsTaskRequest {\n");
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
