package com.huaweicloud.sdk.rms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowResourceByIdRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider")
    
    private String provider;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;

    public ShowResourceByIdRequest withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    


    /**
     * Get provider
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    

    public ShowResourceByIdRequest withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ShowResourceByIdRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * Get resourceId
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResourceByIdRequest showResourceByIdRequest = (ShowResourceByIdRequest) o;
        return Objects.equals(this.provider, showResourceByIdRequest.provider) &&
            Objects.equals(this.type, showResourceByIdRequest.type) &&
            Objects.equals(this.resourceId, showResourceByIdRequest.resourceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(provider, type, resourceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceByIdRequest {\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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

