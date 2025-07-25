package com.huaweicloud.sdk.workspace.v2.model;

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
    @JsonProperty(value = "resource_detail")

    private String resourceDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public TagResource withResourceDetail(String resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    /**
     * 计算机信息。
     * @return resourceDetail
     */
    public String getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(String resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    public TagResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 计算机id。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public TagResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 计算机名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public TagResource withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public TagResource addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TagResource withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签对象。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
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
        return Objects.equals(this.resourceDetail, that.resourceDetail)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceDetail, resourceId, resourceName, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagResource {\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
