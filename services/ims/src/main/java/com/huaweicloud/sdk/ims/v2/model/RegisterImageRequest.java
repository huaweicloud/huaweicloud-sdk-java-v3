package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.RegisterImageRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class RegisterImageRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_id")
    
    private String imageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private RegisterImageRequestBody body = null;

    public RegisterImageRequest withImageId(String imageId) {
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

    public RegisterImageRequest withBody(RegisterImageRequestBody body) {
        this.body = body;
        return this;
    }

    public RegisterImageRequest withBody(Consumer<RegisterImageRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new RegisterImageRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RegisterImageRequestBody getBody() {
        return body;
    }

    public void setBody(RegisterImageRequestBody body) {
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
        RegisterImageRequest registerImageRequest = (RegisterImageRequest) o;
        return Objects.equals(this.imageId, registerImageRequest.imageId) &&
            Objects.equals(this.body, registerImageRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imageId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterImageRequest {\n");
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

