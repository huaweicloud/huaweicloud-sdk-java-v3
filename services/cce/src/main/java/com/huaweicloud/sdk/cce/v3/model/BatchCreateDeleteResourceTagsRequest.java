package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateDeleteResourceTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateDeleteResourceTags body;

    public BatchCreateDeleteResourceTagsRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public BatchCreateDeleteResourceTagsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BatchCreateDeleteResourceTagsRequest withBody(BatchCreateDeleteResourceTags body) {
        this.body = body;
        return this;
    }

    public BatchCreateDeleteResourceTagsRequest withBody(Consumer<BatchCreateDeleteResourceTags> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateDeleteResourceTags();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchCreateDeleteResourceTags getBody() {
        return body;
    }

    public void setBody(BatchCreateDeleteResourceTags body) {
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
        BatchCreateDeleteResourceTagsRequest that = (BatchCreateDeleteResourceTagsRequest) obj;
        return Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateDeleteResourceTagsRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
