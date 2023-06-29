package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchExportCloudPhoneDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchExportCloudPhoneDataRequestBody body;

    public BatchExportCloudPhoneDataRequest withBody(BatchExportCloudPhoneDataRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchExportCloudPhoneDataRequest withBody(Consumer<BatchExportCloudPhoneDataRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchExportCloudPhoneDataRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchExportCloudPhoneDataRequestBody getBody() {
        return body;
    }

    public void setBody(BatchExportCloudPhoneDataRequestBody body) {
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
        BatchExportCloudPhoneDataRequest that = (BatchExportCloudPhoneDataRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchExportCloudPhoneDataRequest {\n");
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
