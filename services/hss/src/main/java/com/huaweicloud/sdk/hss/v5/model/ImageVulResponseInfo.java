package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 镜像漏洞列表 
 */
public class ImageVulResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_name")

    private String vulName;

    public ImageVulResponseInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**: 镜像id **取值范围**: 字符长度0-512 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ImageVulResponseInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **取值范围**: 字符长度0-512 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ImageVulResponseInfo withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * **参数解释**: 漏洞id **取值范围**: 字符长度0-512 
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public ImageVulResponseInfo withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * **参数解释**: 漏洞名称 **取值范围**: 字符长度0-512 
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageVulResponseInfo that = (ImageVulResponseInfo) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.vulId, that.vulId) && Objects.equals(this.vulName, that.vulName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, imageName, vulId, vulName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageVulResponseInfo {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
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
