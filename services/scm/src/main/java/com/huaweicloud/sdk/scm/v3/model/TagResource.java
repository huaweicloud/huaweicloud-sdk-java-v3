package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TagResource
 */
public class TagResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ScsResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_detail")

    private TagResourceResourceDetail resourceDetail;

    public TagResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 证书的资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public TagResource withTags(List<ScsResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public TagResource addTagsItem(ScsResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TagResource withTags(Consumer<List<ScsResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，没有标签默认为空数组。
     * @return tags
     */
    public List<ScsResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ScsResourceTag> tags) {
        this.tags = tags;
    }

    public TagResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称，默认为空字符串。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public TagResource withResourceDetail(TagResourceResourceDetail resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    public TagResource withResourceDetail(Consumer<TagResourceResourceDetail> resourceDetailSetter) {
        if (this.resourceDetail == null) {
            this.resourceDetail = new TagResourceResourceDetail();
            resourceDetailSetter.accept(this.resourceDetail);
        }

        return this;
    }

    /**
     * Get resourceDetail
     * @return resourceDetail
     */
    public TagResourceResourceDetail getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(TagResourceResourceDetail resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TagResource that = (TagResource) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceDetail, that.resourceDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, tags, resourceName, resourceDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagResource {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
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
