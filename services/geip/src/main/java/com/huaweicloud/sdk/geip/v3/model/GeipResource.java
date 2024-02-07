package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询过滤标签的资源
 */
public class GeipResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_detail")

    private Object resourceDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CreateTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    public GeipResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public GeipResource withResourceDetail(Object resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    /**
     * 资源详情。
     * @return resourceDetail
     */
    public Object getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(Object resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    public GeipResource withTags(List<CreateTag> tags) {
        this.tags = tags;
        return this;
    }

    public GeipResource addTagsItem(CreateTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public GeipResource withTags(Consumer<List<CreateTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签。
     * @return tags
     */
    public List<CreateTag> getTags() {
        return tags;
    }

    public void setTags(List<CreateTag> tags) {
        this.tags = tags;
    }

    public GeipResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 实例名字。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeipResource that = (GeipResource) obj;
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceDetail, that.resourceDetail) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.resourceName, that.resourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceDetail, tags, resourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeipResource {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
