package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建标签请求
 */
public class ReqCreateTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ResourceTagBody> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CreateTagRequest> tags = null;

    public ReqCreateTag withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，resource_type为region级别服务时为必选项。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ReqCreateTag withResources(List<ResourceTagBody> resources) {
        this.resources = resources;
        return this;
    }

    public ReqCreateTag addResourcesItem(ResourceTagBody resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ReqCreateTag withResources(Consumer<List<ResourceTagBody>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源列表
     * @return resources
     */
    public List<ResourceTagBody> getResources() {
        return resources;
    }

    public void setResources(List<ResourceTagBody> resources) {
        this.resources = resources;
    }

    public ReqCreateTag withTags(List<CreateTagRequest> tags) {
        this.tags = tags;
        return this;
    }

    public ReqCreateTag addTagsItem(CreateTagRequest tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ReqCreateTag withTags(Consumer<List<CreateTagRequest>> tagsSetter) {
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
    public List<CreateTagRequest> getTags() {
        return tags;
    }

    public void setTags(List<CreateTagRequest> tags) {
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
        ReqCreateTag reqCreateTag = (ReqCreateTag) o;
        return Objects.equals(this.projectId, reqCreateTag.projectId)
            && Objects.equals(this.resources, reqCreateTag.resources) && Objects.equals(this.tags, reqCreateTag.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, resources, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqCreateTag {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
