package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchUpdateVaultRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchUpdateVaultRequestBody body;

    public BatchUpdateVaultRequest withBody(BatchUpdateVaultRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchUpdateVaultRequest withBody(Consumer<BatchUpdateVaultRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchUpdateVaultRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchUpdateVaultRequestBody getBody() {
        return body;
    }

    public void setBody(BatchUpdateVaultRequestBody body) {
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
        BatchUpdateVaultRequest batchUpdateVaultRequest = (BatchUpdateVaultRequest) o;
        return Objects.equals(this.body, batchUpdateVaultRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateVaultRequest {\n");
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
