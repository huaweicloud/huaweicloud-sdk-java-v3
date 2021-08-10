package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 根据标签查询资源响应返回对象。 */
public class ResourcesByTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_detail")

    private String resourceDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "super_resource_id")

    private String superResourceId;

    public ResourcesByTag withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /** 资源ID.
     * 
     * @return resourceId */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ResourcesByTag withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /** 资源名称。
     * 
     * @return resourceName */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ResourcesByTag withResourceDetail(String resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    /** 资源描述。
     * 
     * @return resourceDetail */
    public String getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(String resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    public ResourcesByTag withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ResourcesByTag addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ResourcesByTag withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 资源标签。
     * 
     * @return tags */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public ResourcesByTag withSuperResourceId(String superResourceId) {
        this.superResourceId = superResourceId;
        return this;
    }

    /** 父级资源ID。
     * 
     * @return superResourceId */
    public String getSuperResourceId() {
        return superResourceId;
    }

    public void setSuperResourceId(String superResourceId) {
        this.superResourceId = superResourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesByTag resourcesByTag = (ResourcesByTag) o;
        return Objects.equals(this.resourceId, resourcesByTag.resourceId)
            && Objects.equals(this.resourceName, resourcesByTag.resourceName)
            && Objects.equals(this.resourceDetail, resourcesByTag.resourceDetail)
            && Objects.equals(this.tags, resourcesByTag.tags)
            && Objects.equals(this.superResourceId, resourcesByTag.superResourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceName, resourceDetail, tags, superResourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcesByTag {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    superResourceId: ").append(toIndentedString(superResourceId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
