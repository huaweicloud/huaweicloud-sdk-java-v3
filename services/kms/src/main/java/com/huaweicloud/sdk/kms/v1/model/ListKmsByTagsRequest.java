package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kms.v1.model.ListKmsByTagsRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListKmsByTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_instances")
    
    private String resourceInstances;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_id")
    
    private String versionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ListKmsByTagsRequestBody body;

    public ListKmsByTagsRequest withResourceInstances(String resourceInstances) {
        this.resourceInstances = resourceInstances;
        return this;
    }

    


    /**
     * Get resourceInstances
     * @return resourceInstances
     */
    public String getResourceInstances() {
        return resourceInstances;
    }

    public void setResourceInstances(String resourceInstances) {
        this.resourceInstances = resourceInstances;
    }

    

    public ListKmsByTagsRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    


    /**
     * Get versionId
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    

    public ListKmsByTagsRequest withBody(ListKmsByTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public ListKmsByTagsRequest withBody(Consumer<ListKmsByTagsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ListKmsByTagsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ListKmsByTagsRequestBody getBody() {
        return body;
    }

    public void setBody(ListKmsByTagsRequestBody body) {
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
        ListKmsByTagsRequest listKmsByTagsRequest = (ListKmsByTagsRequest) o;
        return Objects.equals(this.resourceInstances, listKmsByTagsRequest.resourceInstances) &&
            Objects.equals(this.versionId, listKmsByTagsRequest.versionId) &&
            Objects.equals(this.body, listKmsByTagsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceInstances, versionId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKmsByTagsRequest {\n");
        sb.append("    resourceInstances: ").append(toIndentedString(resourceInstances)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

