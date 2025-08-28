package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageWhiteListDetailResponseInfoImageInfo
 */
public class ImageWhiteListDetailResponseInfoImageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    public ImageWhiteListDetailResponseInfoImageInfo withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 仓库镜像ID **取值范围**： 取值1-9223372036854775807 
     * minimum: 1
     * maximum: 9223372036854775807
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ImageWhiteListDetailResponseInfoImageInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**： 本地镜像ID **取值范围**： 字符长度1-64位 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ImageWhiteListDetailResponseInfoImageInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**： 镜像名称 **取值范围**： 字符长度1-256位 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageWhiteListDetailResponseInfoImageInfo that = (ImageWhiteListDetailResponseInfoImageInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageName, that.imageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imageId, imageName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageWhiteListDetailResponseInfoImageInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
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
