package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class BatchUpdateServersNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchUpdateServersNameRequestBody body;

    public BatchUpdateServersNameRequest withBody(BatchUpdateServersNameRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchUpdateServersNameRequest withBody(Consumer<BatchUpdateServersNameRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchUpdateServersNameRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public BatchUpdateServersNameRequestBody getBody() {
        return body;
    }

    public void setBody(BatchUpdateServersNameRequestBody body) {
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
        BatchUpdateServersNameRequest batchUpdateServersNameRequest = (BatchUpdateServersNameRequest) o;
        return Objects.equals(this.body, batchUpdateServersNameRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateServersNameRequest {\n");
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
