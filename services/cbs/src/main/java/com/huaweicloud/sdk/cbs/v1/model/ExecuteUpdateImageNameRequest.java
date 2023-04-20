package com.huaweicloud.sdk.cbs.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.UpdateImageNameReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ExecuteUpdateImageNameRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_id")
    

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private UpdateImageNameReq body;

    public ExecuteUpdateImageNameRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    


    /**
     * 图片id
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    

    public ExecuteUpdateImageNameRequest withBody(UpdateImageNameReq body) {
        this.body = body;
        return this;
    }

    public ExecuteUpdateImageNameRequest withBody(Consumer<UpdateImageNameReq> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateImageNameReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateImageNameReq getBody() {
        return body;
    }

    public void setBody(UpdateImageNameReq body) {
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
        ExecuteUpdateImageNameRequest executeUpdateImageNameRequest = (ExecuteUpdateImageNameRequest) o;
        return Objects.equals(this.imageId, executeUpdateImageNameRequest.imageId) &&
            Objects.equals(this.body, executeUpdateImageNameRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imageId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteUpdateImageNameRequest {\n");
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

