package com.huaweicloud.sdk.eip.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.BatchCreatePublicipTagsRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchCreatePublicipTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip_id")
    
    private String publicipId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchCreatePublicipTagsRequestBody body;

    public BatchCreatePublicipTagsRequest withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    


    /**
     * Get publicipId
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    

    public BatchCreatePublicipTagsRequest withBody(BatchCreatePublicipTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreatePublicipTagsRequest withBody(Consumer<BatchCreatePublicipTagsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new BatchCreatePublicipTagsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchCreatePublicipTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreatePublicipTagsRequestBody body) {
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
        BatchCreatePublicipTagsRequest batchCreatePublicipTagsRequest = (BatchCreatePublicipTagsRequest) o;
        return Objects.equals(this.publicipId, batchCreatePublicipTagsRequest.publicipId) &&
            Objects.equals(this.body, batchCreatePublicipTagsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicipId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreatePublicipTagsRequest {\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
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

