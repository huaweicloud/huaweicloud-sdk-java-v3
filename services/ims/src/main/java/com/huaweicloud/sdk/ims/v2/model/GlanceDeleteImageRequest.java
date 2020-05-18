package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.GlanceDeleteImageRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class GlanceDeleteImageRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_id")
    
    private String imageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private GlanceDeleteImageRequestBody body = null;

    public GlanceDeleteImageRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    


    /**
     * Get imageId
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public GlanceDeleteImageRequest withBody(GlanceDeleteImageRequestBody body) {
        this.body = body;
        return this;
    }

    public GlanceDeleteImageRequest withBody(Consumer<GlanceDeleteImageRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new GlanceDeleteImageRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public GlanceDeleteImageRequestBody getBody() {
        return body;
    }

    public void setBody(GlanceDeleteImageRequestBody body) {
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
        GlanceDeleteImageRequest glanceDeleteImageRequest = (GlanceDeleteImageRequest) o;
        return Objects.equals(this.imageId, glanceDeleteImageRequest.imageId) &&
            Objects.equals(this.body, glanceDeleteImageRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imageId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceDeleteImageRequest {\n");
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

