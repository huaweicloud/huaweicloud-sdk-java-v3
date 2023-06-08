package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListEnterpriseResourceResult
 */
public class ListEnterpriseResourceResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_detail")

    private ListFunctionResult resourceDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Map<String, String>> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<Map<String, String>> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    public ListEnterpriseResourceResult withResourceId(String resourceId) {
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

    public ListEnterpriseResourceResult withResourceDetail(ListFunctionResult resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    public ListEnterpriseResourceResult withResourceDetail(Consumer<ListFunctionResult> resourceDetailSetter) {
        if (this.resourceDetail == null) {
            this.resourceDetail = new ListFunctionResult();
            resourceDetailSetter.accept(this.resourceDetail);
        }

        return this;
    }

    /**
     * Get resourceDetail
     * @return resourceDetail
     */
    public ListFunctionResult getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(ListFunctionResult resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    public ListEnterpriseResourceResult withTags(List<Map<String, String>> tags) {
        this.tags = tags;
        return this;
    }

    public ListEnterpriseResourceResult addTagsItem(Map<String, String> tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListEnterpriseResourceResult withTags(Consumer<List<Map<String, String>>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<Map<String, String>> getTags() {
        return tags;
    }

    public void setTags(List<Map<String, String>> tags) {
        this.tags = tags;
    }

    public ListEnterpriseResourceResult withSysTags(List<Map<String, String>> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ListEnterpriseResourceResult addSysTagsItem(Map<String, String> sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ListEnterpriseResourceResult withSysTags(Consumer<List<Map<String, String>>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签列表
     * @return sysTags
     */
    public List<Map<String, String>> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<Map<String, String>> sysTags) {
        this.sysTags = sysTags;
    }

    public ListEnterpriseResourceResult withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
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
        ListEnterpriseResourceResult listEnterpriseResourceResult = (ListEnterpriseResourceResult) o;
        return Objects.equals(this.resourceId, listEnterpriseResourceResult.resourceId)
            && Objects.equals(this.resourceDetail, listEnterpriseResourceResult.resourceDetail)
            && Objects.equals(this.tags, listEnterpriseResourceResult.tags)
            && Objects.equals(this.sysTags, listEnterpriseResourceResult.sysTags)
            && Objects.equals(this.resourceName, listEnterpriseResourceResult.resourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceDetail, tags, sysTags, resourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnterpriseResourceResult {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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
