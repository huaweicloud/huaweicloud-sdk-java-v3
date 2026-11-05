package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageUploadItem
 */
public class ImageUploadItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private Long imageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_content_type")

    private String uploadContentType;

    public ImageUploadItem withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 图片名称（后缀必须为jpg/jpeg/png/bmp）
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ImageUploadItem withImageSize(Long imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * 图片大小（字节，不超过max_image_size默认5MB）
     * minimum: 1
     * @return imageSize
     */
    public Long getImageSize() {
        return imageSize;
    }

    public void setImageSize(Long imageSize) {
        this.imageSize = imageSize;
    }

    public ImageUploadItem withUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
        return this;
    }

    /**
     * 上传内容类型（作为Content-Type请求头纳入OBS预签名，客户端PUT上传时须用相同值）
     * @return uploadContentType
     */
    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageUploadItem that = (ImageUploadItem) obj;
        return Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.uploadContentType, that.uploadContentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageName, imageSize, uploadContentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageUploadItem {\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    uploadContentType: ").append(toIndentedString(uploadContentType)).append("\n");
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
