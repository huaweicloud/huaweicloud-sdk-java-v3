package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * notebook镜像
 */
public class NotebookImage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private DevelopImageType imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_info")

    private ImageInfo imageInfo;

    public NotebookImage withImageType(DevelopImageType imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * Get imageType
     * @return imageType
     */
    public DevelopImageType getImageType() {
        return imageType;
    }

    public void setImageType(DevelopImageType imageType) {
        this.imageType = imageType;
    }

    public NotebookImage withImageInfo(ImageInfo imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }

    public NotebookImage withImageInfo(Consumer<ImageInfo> imageInfoSetter) {
        if (this.imageInfo == null) {
            this.imageInfo = new ImageInfo();
            imageInfoSetter.accept(this.imageInfo);
        }

        return this;
    }

    /**
     * Get imageInfo
     * @return imageInfo
     */
    public ImageInfo getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(ImageInfo imageInfo) {
        this.imageInfo = imageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotebookImage notebookImage = (NotebookImage) o;
        return Objects.equals(this.imageType, notebookImage.imageType)
            && Objects.equals(this.imageInfo, notebookImage.imageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageType, imageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotebookImage {\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
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
