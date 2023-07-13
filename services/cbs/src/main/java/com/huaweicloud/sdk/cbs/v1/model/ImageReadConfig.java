package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ImageReadConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_content")

    private String readContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution")

    private Resolution resolution;

    public ImageReadConfig withReadContent(String readContent) {
        this.readContent = readContent;
        return this;
    }

    /**
     * 播报内容，长度为1~2500
     * @return readContent
     */
    public String getReadContent() {
        return readContent;
    }

    public void setReadContent(String readContent) {
        this.readContent = readContent;
    }

    public ImageReadConfig withImageId(String imageId) {
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

    public ImageReadConfig withResolution(Resolution resolution) {
        this.resolution = resolution;
        return this;
    }

    public ImageReadConfig withResolution(Consumer<Resolution> resolutionSetter) {
        if (this.resolution == null) {
            this.resolution = new Resolution();
            resolutionSetter.accept(this.resolution);
        }

        return this;
    }

    /**
     * Get resolution
     * @return resolution
     */
    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageReadConfig that = (ImageReadConfig) obj;
        return Objects.equals(this.readContent, that.readContent) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.resolution, that.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readContent, imageId, resolution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageReadConfig {\n");
        sb.append("    readContent: ").append(toIndentedString(readContent)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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
