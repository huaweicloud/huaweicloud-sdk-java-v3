package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PublishAssetReq
 */
public class PublishAssetReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picture")

    private String picture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private String summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    public PublishAssetReq withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像id
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public PublishAssetReq withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 镜像tag
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public PublishAssetReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资产名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublishAssetReq withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 资产版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PublishAssetReq withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 展示名
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PublishAssetReq withPicture(String picture) {
        this.picture = picture;
        return this;
    }

    /**
     * 封面图片base64编码
     * @return picture
     */
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public PublishAssetReq withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * 短描述
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public PublishAssetReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 长描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PublishAssetReq withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public PublishAssetReq addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public PublishAssetReq withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 标签列表
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublishAssetReq publishAssetReq = (PublishAssetReq) o;
        return Objects.equals(this.imageId, publishAssetReq.imageId) && Objects.equals(this.tag, publishAssetReq.tag)
            && Objects.equals(this.name, publishAssetReq.name) && Objects.equals(this.version, publishAssetReq.version)
            && Objects.equals(this.title, publishAssetReq.title)
            && Objects.equals(this.picture, publishAssetReq.picture)
            && Objects.equals(this.summary, publishAssetReq.summary)
            && Objects.equals(this.description, publishAssetReq.description)
            && Objects.equals(this.labels, publishAssetReq.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, tag, name, version, title, picture, summary, description, labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishAssetReq {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
