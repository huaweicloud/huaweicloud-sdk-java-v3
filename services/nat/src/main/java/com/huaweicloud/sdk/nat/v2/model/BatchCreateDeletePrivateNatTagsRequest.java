package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateDeletePrivateNatTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchOperateResourceTagsRequestBody body;

    public BatchCreateDeletePrivateNatTagsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 私网NAT网关的ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BatchCreateDeletePrivateNatTagsRequest withBody(BatchOperateResourceTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateDeletePrivateNatTagsRequest withBody(Consumer<BatchOperateResourceTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchOperateResourceTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchOperateResourceTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchOperateResourceTagsRequestBody body) {
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
        BatchCreateDeletePrivateNatTagsRequest batchCreateDeletePrivateNatTagsRequest =
            (BatchCreateDeletePrivateNatTagsRequest) o;
        return Objects.equals(this.resourceId, batchCreateDeletePrivateNatTagsRequest.resourceId)
            && Objects.equals(this.body, batchCreateDeletePrivateNatTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateDeletePrivateNatTagsRequest {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
