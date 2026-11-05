package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PresignUploadUrlBody
 */
public class PresignUploadUrlBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "images")

    private List<ImageUploadItem> images = null;

    public PresignUploadUrlBody withImages(List<ImageUploadItem> images) {
        this.images = images;
        return this;
    }

    public PresignUploadUrlBody addImagesItem(ImageUploadItem imagesItem) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(imagesItem);
        return this;
    }

    public PresignUploadUrlBody withImages(Consumer<List<ImageUploadItem>> imagesSetter) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        imagesSetter.accept(this.images);
        return this;
    }

    /**
     * 待获取预签名上传地址的图片列表
     * @return images
     */
    public List<ImageUploadItem> getImages() {
        return images;
    }

    public void setImages(List<ImageUploadItem> images) {
        this.images = images;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PresignUploadUrlBody that = (PresignUploadUrlBody) obj;
        return Objects.equals(this.images, that.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(images);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresignUploadUrlBody {\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
