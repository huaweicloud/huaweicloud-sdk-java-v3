package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 资源参数数据结构 */
public class ResourceParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_detail")

    private ShowProtectedInstanceParams resourceDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    public ResourceParams withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /** 保护实例ID。
     * 
     * @return resourceId */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ResourceParams withResourceDetail(ShowProtectedInstanceParams resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    public ResourceParams withResourceDetail(Consumer<ShowProtectedInstanceParams> resourceDetailSetter) {
        if (this.resourceDetail == null) {
            this.resourceDetail = new ShowProtectedInstanceParams();
            resourceDetailSetter.accept(this.resourceDetail);
        }

        return this;
    }

    /** Get resourceDetail
     * 
     * @return resourceDetail */
    public ShowProtectedInstanceParams getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(ShowProtectedInstanceParams resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    public ResourceParams withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ResourceParams addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ResourceParams withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 标签列表，没有标签默认为空数组。
     * 
     * @return tags */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public ResourceParams withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /** 保护实例名称，没有名称时默认为空字符串。
     * 
     * @return resourceName */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceParams resourceParams = (ResourceParams) o;
        return Objects.equals(this.resourceId, resourceParams.resourceId)
            && Objects.equals(this.resourceDetail, resourceParams.resourceDetail)
            && Objects.equals(this.tags, resourceParams.tags)
            && Objects.equals(this.resourceName, resourceParams.resourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceDetail, tags, resourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceParams {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
