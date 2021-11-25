package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class BatchAddOrRemoveResourceInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchAddOrRemoveResourceInstanceBody body;

    public BatchAddOrRemoveResourceInstanceRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /** 资源类型，值为：endpoint_service或endpoint。
     * 
     * @return resourceType */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public BatchAddOrRemoveResourceInstanceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /** 资源ID，Endpoint ServiceID或Endpoint ID。
     * 
     * @return resourceId */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BatchAddOrRemoveResourceInstanceRequest withBody(BatchAddOrRemoveResourceInstanceBody body) {
        this.body = body;
        return this;
    }

    public BatchAddOrRemoveResourceInstanceRequest withBody(Consumer<BatchAddOrRemoveResourceInstanceBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchAddOrRemoveResourceInstanceBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public BatchAddOrRemoveResourceInstanceBody getBody() {
        return body;
    }

    public void setBody(BatchAddOrRemoveResourceInstanceBody body) {
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
        BatchAddOrRemoveResourceInstanceRequest batchAddOrRemoveResourceInstanceRequest =
            (BatchAddOrRemoveResourceInstanceRequest) o;
        return Objects.equals(this.resourceType, batchAddOrRemoveResourceInstanceRequest.resourceType)
            && Objects.equals(this.resourceId, batchAddOrRemoveResourceInstanceRequest.resourceId)
            && Objects.equals(this.body, batchAddOrRemoveResourceInstanceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddOrRemoveResourceInstanceRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
