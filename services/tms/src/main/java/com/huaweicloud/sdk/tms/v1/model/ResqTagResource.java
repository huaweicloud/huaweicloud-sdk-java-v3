package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取标签下资源请求
 */
public class ResqTagResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_types")

    private List<String> resourceTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ResqTagResource withProjectId(String projectId) {
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

    public ResqTagResource withResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    public ResqTagResource addResourceTypesItem(String resourceTypesItem) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        this.resourceTypes.add(resourceTypesItem);
        return this;
    }

    public ResqTagResource withResourceTypes(Consumer<List<String>> resourceTypesSetter) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        resourceTypesSetter.accept(this.resourceTypes);
        return this;
    }

    /**
     * 资源类型， 此参数为可输入的值（区分大小写）。例如：ecs,scaling_group, images, disk,vpcs,security-groups, shared_bandwidth,eip, cdn等，具体请参见“附录-标签支持的资源类型”章节。
     * @return resourceTypes
     */
    public List<String> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public ResqTagResource withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public ResqTagResource addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ResqTagResource withTags(Consumer<List<Tag>> tagsSetter) {
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
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ResqTagResource withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置， 从offset指定的下一条数据开始查询，必须为数字，不能为负数，默认为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ResqTagResource withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数，不传默认为200，limit最多为200, 最小值为1。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResqTagResource resqTagResource = (ResqTagResource) o;
        return Objects.equals(this.projectId, resqTagResource.projectId)
            && Objects.equals(this.resourceTypes, resqTagResource.resourceTypes)
            && Objects.equals(this.tags, resqTagResource.tags) && Objects.equals(this.offset, resqTagResource.offset)
            && Objects.equals(this.limit, resqTagResource.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, resourceTypes, tags, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResqTagResource {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
