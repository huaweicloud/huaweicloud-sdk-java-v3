package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteBatchFlinkJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private DeleteFlinkJobInBatch body;

    public DeleteBatchFlinkJobRequest withBody(DeleteFlinkJobInBatch body) {
        this.body = body;
        return this;
    }

    public DeleteBatchFlinkJobRequest withBody(Consumer<DeleteFlinkJobInBatch> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteFlinkJobInBatch();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeleteFlinkJobInBatch getBody() {
        return body;
    }

    public void setBody(DeleteFlinkJobInBatch body) {
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
        DeleteBatchFlinkJobRequest deleteBatchFlinkJobRequest = (DeleteBatchFlinkJobRequest) o;
        return Objects.equals(this.body, deleteBatchFlinkJobRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBatchFlinkJobRequest {\n");
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
