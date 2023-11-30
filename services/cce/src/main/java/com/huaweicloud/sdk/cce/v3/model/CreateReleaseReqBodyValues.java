package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模板实例的值
 */
public class CreateReleaseReqBodyValues {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imagePullPolicy")

    private String imagePullPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageTag")

    private String imageTag;

    public CreateReleaseReqBodyValues withImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    /**
     * 镜像拉取策略
     * @return imagePullPolicy
     */
    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public CreateReleaseReqBodyValues withImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }

    /**
     * 镜像标签
     * @return imageTag
     */
    public String getImageTag() {
        return imageTag;
    }

    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateReleaseReqBodyValues that = (CreateReleaseReqBodyValues) obj;
        return Objects.equals(this.imagePullPolicy, that.imagePullPolicy)
            && Objects.equals(this.imageTag, that.imageTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imagePullPolicy, imageTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReleaseReqBodyValues {\n");
        sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
        sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
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
