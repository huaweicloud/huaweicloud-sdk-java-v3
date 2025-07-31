package com.huaweicloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExportImageInSafeModeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExportImageRequestBody body;

    public ExportImageInSafeModeRequest withImageId(String imageId) {
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

    public ExportImageInSafeModeRequest withBody(ExportImageRequestBody body) {
        this.body = body;
        return this;
    }

    public ExportImageInSafeModeRequest withBody(Consumer<ExportImageRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ExportImageRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExportImageRequestBody getBody() {
        return body;
    }

    public void setBody(ExportImageRequestBody body) {
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
        ExportImageInSafeModeRequest that = (ExportImageInSafeModeRequest) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportImageInSafeModeRequest {\n");
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
