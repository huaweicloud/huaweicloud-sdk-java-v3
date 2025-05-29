package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 镜像模版信息
 */
public class ShowImageTemplateListResponseBodyResultImageTemplates {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private String organization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_label")

    private String imageLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_image")

    private String baseImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public ShowImageTemplateListResponseBodyResultImageTemplates withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像模版ID
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ShowImageTemplateListResponseBodyResultImageTemplates withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * swr镜像组织
     * @return organization
     */
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public ShowImageTemplateListResponseBodyResultImageTemplates withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ShowImageTemplateListResponseBodyResultImageTemplates withImageLabel(String imageLabel) {
        this.imageLabel = imageLabel;
        return this;
    }

    /**
     * 镜像label
     * @return imageLabel
     */
    public String getImageLabel() {
        return imageLabel;
    }

    public void setImageLabel(String imageLabel) {
        this.imageLabel = imageLabel;
    }

    public ShowImageTemplateListResponseBodyResultImageTemplates withBaseImage(String baseImage) {
        this.baseImage = baseImage;
        return this;
    }

    /**
     * 操作系统
     * @return baseImage
     */
    public String getBaseImage() {
        return baseImage;
    }

    public void setBaseImage(String baseImage) {
        this.baseImage = baseImage;
    }

    public ShowImageTemplateListResponseBodyResultImageTemplates withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 镜像标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowImageTemplateListResponseBodyResultImageTemplates withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 镜像描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowImageTemplateListResponseBodyResultImageTemplates withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 镜像创建日期
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowImageTemplateListResponseBodyResultImageTemplates that =
            (ShowImageTemplateListResponseBodyResultImageTemplates) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.organization, that.organization)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageLabel, that.imageLabel)
            && Objects.equals(this.baseImage, that.baseImage) && Objects.equals(this.title, that.title)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, organization, imageName, imageLabel, baseImage, title, description, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageTemplateListResponseBodyResultImageTemplates {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageLabel: ").append(toIndentedString(imageLabel)).append("\n");
        sb.append("    baseImage: ").append(toIndentedString(baseImage)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
