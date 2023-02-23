package com.huaweicloud.sdk.dbss.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.ResourceTagRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchAddResourceTagRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private ResourceTagRequest body;

    public BatchAddResourceTagRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 资源类型。审计：auditInstance
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    

    public BatchAddResourceTagRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    public BatchAddResourceTagRequest withBody(ResourceTagRequest body) {
        this.body = body;
        return this;
    }

    public BatchAddResourceTagRequest withBody(Consumer<ResourceTagRequest> bodySetter) {
        if(this.body == null ){
            this.body = new ResourceTagRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ResourceTagRequest getBody() {
        return body;
    }

    public void setBody(ResourceTagRequest body) {
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
        BatchAddResourceTagRequest batchAddResourceTagRequest = (BatchAddResourceTagRequest) o;
        return Objects.equals(this.resourceType, batchAddResourceTagRequest.resourceType) &&
            Objects.equals(this.resourceId, batchAddResourceTagRequest.resourceId) &&
            Objects.equals(this.body, batchAddResourceTagRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddResourceTagRequest {\n");
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

