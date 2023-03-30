package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateResourceShareTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_id")

    private String resourceShareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TagResourceReqBody body;

    public BatchCreateResourceShareTagsRequest withResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }

    /**
     * 资源共享实例的ID。
     * @return resourceShareId
     */
    public String getResourceShareId() {
        return resourceShareId;
    }

    public void setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
    }

    public BatchCreateResourceShareTagsRequest withBody(TagResourceReqBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateResourceShareTagsRequest withBody(Consumer<TagResourceReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new TagResourceReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TagResourceReqBody getBody() {
        return body;
    }

    public void setBody(TagResourceReqBody body) {
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
        BatchCreateResourceShareTagsRequest batchCreateResourceShareTagsRequest =
            (BatchCreateResourceShareTagsRequest) o;
        return Objects.equals(this.resourceShareId, batchCreateResourceShareTagsRequest.resourceShareId)
            && Objects.equals(this.body, batchCreateResourceShareTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShareId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateResourceShareTagsRequest {\n");
        sb.append("    resourceShareId: ").append(toIndentedString(resourceShareId)).append("\n");
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
