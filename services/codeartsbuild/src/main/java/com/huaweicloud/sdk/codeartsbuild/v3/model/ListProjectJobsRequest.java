package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListProjectJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_index")

    private Integer pageIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_order")

    private String sortOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_status")

    private String buildStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "by_group")

    private Boolean byGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_path_id")

    private String groupPathId;

    public ListProjectJobsRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * CodeArts项目ID，32位数字、小写字母组合。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListProjectJobsRequest withPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * **参数解释**： 分页页码， 表示从此页开始查询。 **约束限制**： 不涉及。 **取值范围**： 只能使用数字，大于等于0。
     * minimum: 0
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public ListProjectJobsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * **参数解释**： 每页显示的条目数量。 **约束限制**： 不涉及。 **取值范围**： 只能使用数字，小于等于100。
     * minimum: 0
     * maximum: 100
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListProjectJobsRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * 查询条件
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListProjectJobsRequest withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序的字段
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public ListProjectJobsRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * 排序顺序
     * @return sortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public ListProjectJobsRequest withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建人ID
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ListProjectJobsRequest withBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
        return this;
    }

    /**
     * 构建状态过滤条件
     * @return buildStatus
     */
    public String getBuildStatus() {
        return buildStatus;
    }

    public void setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
    }

    public ListProjectJobsRequest withByGroup(Boolean byGroup) {
        this.byGroup = byGroup;
        return this;
    }

    /**
     * 是否分组
     * @return byGroup
     */
    public Boolean getByGroup() {
        return byGroup;
    }

    public void setByGroup(Boolean byGroup) {
        this.byGroup = byGroup;
    }

    public ListProjectJobsRequest withGroupPathId(String groupPathId) {
        this.groupPathId = groupPathId;
        return this;
    }

    /**
     * 分组ID
     * @return groupPathId
     */
    public String getGroupPathId() {
        return groupPathId;
    }

    public void setGroupPathId(String groupPathId) {
        this.groupPathId = groupPathId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectJobsRequest that = (ListProjectJobsRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.pageIndex, that.pageIndex)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.search, that.search)
            && Objects.equals(this.sortField, that.sortField) && Objects.equals(this.sortOrder, that.sortOrder)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.buildStatus, that.buildStatus)
            && Objects.equals(this.byGroup, that.byGroup) && Objects.equals(this.groupPathId, that.groupPathId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            pageIndex,
            pageSize,
            search,
            sortField,
            sortOrder,
            creatorId,
            buildStatus,
            byGroup,
            groupPathId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectJobsRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    buildStatus: ").append(toIndentedString(buildStatus)).append("\n");
        sb.append("    byGroup: ").append(toIndentedString(byGroup)).append("\n");
        sb.append("    groupPathId: ").append(toIndentedString(groupPathId)).append("\n");
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
