package com.huaweicloud.sdk.ims.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.BatchAddOrDeleteTagsRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchAddOrDeleteTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_id")
    
    private String imageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchAddOrDeleteTagsRequestBody body;

    public BatchAddOrDeleteTagsRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    


    /**
     * 镜像ID。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    

    public BatchAddOrDeleteTagsRequest withBody(BatchAddOrDeleteTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchAddOrDeleteTagsRequest withBody(Consumer<BatchAddOrDeleteTagsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new BatchAddOrDeleteTagsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchAddOrDeleteTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchAddOrDeleteTagsRequestBody body) {
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
        BatchAddOrDeleteTagsRequest batchAddOrDeleteTagsRequest = (BatchAddOrDeleteTagsRequest) o;
        return Objects.equals(this.imageId, batchAddOrDeleteTagsRequest.imageId) &&
            Objects.equals(this.body, batchAddOrDeleteTagsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imageId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddOrDeleteTagsRequest {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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

