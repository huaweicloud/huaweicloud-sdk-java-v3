package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchStopMigrationTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private BatchStopMigrationTasksBody body;

    public BatchStopMigrationTasksRequest withBody(BatchStopMigrationTasksBody body) {
        this.body = body;
        return this;
    }

    public BatchStopMigrationTasksRequest withBody(Consumer<BatchStopMigrationTasksBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchStopMigrationTasksBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchStopMigrationTasksBody getBody() {
        return body;
    }

    public void setBody(BatchStopMigrationTasksBody body) {
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
        BatchStopMigrationTasksRequest batchStopMigrationTasksRequest = (BatchStopMigrationTasksRequest) o;
        return Objects.equals(this.body, batchStopMigrationTasksRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStopMigrationTasksRequest {\n");
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
