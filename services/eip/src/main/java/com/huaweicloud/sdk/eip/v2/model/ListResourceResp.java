package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源实例详情
 */
public class ListResourceResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resouce_detail")

    private Object resouceDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTagResp> tags = null;

    public ListResourceResp withResouceDetail(Object resouceDetail) {
        this.resouceDetail = resouceDetail;
        return this;
    }

    /**
     * 资源详情。 资源对象，用于扩展。默认为空
     * @return resouceDetail
     */
    public Object getResouceDetail() {
        return resouceDetail;
    }

    public void setResouceDetail(Object resouceDetail) {
        this.resouceDetail = resouceDetail;
    }

    public ListResourceResp withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListResourceResp withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称，没有默认为空字符串
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ListResourceResp withTags(List<ResourceTagResp> tags) {
        this.tags = tags;
        return this;
    }

    public ListResourceResp addTagsItem(ResourceTagResp tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListResourceResp withTags(Consumer<List<ResourceTagResp>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，没有标签默认为空数组
     * @return tags
     */
    public List<ResourceTagResp> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTagResp> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResourceResp listResourceResp = (ListResourceResp) o;
        return Objects.equals(this.resouceDetail, listResourceResp.resouceDetail)
            && Objects.equals(this.resourceId, listResourceResp.resourceId)
            && Objects.equals(this.resourceName, listResourceResp.resourceName)
            && Objects.equals(this.tags, listResourceResp.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resouceDetail, resourceId, resourceName, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceResp {\n");
        sb.append("    resouceDetail: ").append(toIndentedString(resouceDetail)).append("\n");
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
