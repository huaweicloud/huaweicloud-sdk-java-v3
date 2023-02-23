package com.huaweicloud.sdk.dbss.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.ResourceInstanceTagRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CountResourceInstanceByTagRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private ResourceInstanceTagRequest body;

    public CountResourceInstanceByTagRequest withResourceType(String resourceType) {
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

    

    public CountResourceInstanceByTagRequest withBody(ResourceInstanceTagRequest body) {
        this.body = body;
        return this;
    }

    public CountResourceInstanceByTagRequest withBody(Consumer<ResourceInstanceTagRequest> bodySetter) {
        if(this.body == null ){
            this.body = new ResourceInstanceTagRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ResourceInstanceTagRequest getBody() {
        return body;
    }

    public void setBody(ResourceInstanceTagRequest body) {
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
        CountResourceInstanceByTagRequest countResourceInstanceByTagRequest = (CountResourceInstanceByTagRequest) o;
        return Objects.equals(this.resourceType, countResourceInstanceByTagRequest.resourceType) &&
            Objects.equals(this.body, countResourceInstanceByTagRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceType, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountResourceInstanceByTagRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

