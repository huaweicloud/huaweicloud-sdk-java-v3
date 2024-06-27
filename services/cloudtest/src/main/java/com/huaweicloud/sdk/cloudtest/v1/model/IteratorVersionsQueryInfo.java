package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IteratorVersionsQueryInfo
 */
public class IteratorVersionsQueryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private IteratorListFilterInfo filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "own")

    private Boolean own;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_uri")

    private String branchUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_uri")

    private String iteratorUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_ids")

    private List<String> ownerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_stage")

    private String currentStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    public IteratorVersionsQueryInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 迭代计划名称（支持模糊搜索）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IteratorVersionsQueryInfo withFilter(IteratorListFilterInfo filter) {
        this.filter = filter;
        return this;
    }

    public IteratorVersionsQueryInfo withFilter(Consumer<IteratorListFilterInfo> filterSetter) {
        if (this.filter == null) {
            this.filter = new IteratorListFilterInfo();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public IteratorListFilterInfo getFilter() {
        return filter;
    }

    public void setFilter(IteratorListFilterInfo filter) {
        this.filter = filter;
    }

    public IteratorVersionsQueryInfo withOwn(Boolean own) {
        this.own = own;
        return this;
    }

    /**
     * 是否是我的
     * @return own
     */
    public Boolean getOwn() {
        return own;
    }

    public void setOwn(Boolean own) {
        this.own = own;
    }

    public IteratorVersionsQueryInfo withBranchUri(String branchUri) {
        this.branchUri = branchUri;
        return this;
    }

    /**
     * 分支URI
     * @return branchUri
     */
    public String getBranchUri() {
        return branchUri;
    }

    public void setBranchUri(String branchUri) {
        this.branchUri = branchUri;
    }

    public IteratorVersionsQueryInfo withIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
        return this;
    }

    /**
     * 迭代计划URI
     * @return iteratorUri
     */
    public String getIteratorUri() {
        return iteratorUri;
    }

    public void setIteratorUri(String iteratorUri) {
        this.iteratorUri = iteratorUri;
    }

    public IteratorVersionsQueryInfo withOwnerIds(List<String> ownerIds) {
        this.ownerIds = ownerIds;
        return this;
    }

    public IteratorVersionsQueryInfo addOwnerIdsItem(String ownerIdsItem) {
        if (this.ownerIds == null) {
            this.ownerIds = new ArrayList<>();
        }
        this.ownerIds.add(ownerIdsItem);
        return this;
    }

    public IteratorVersionsQueryInfo withOwnerIds(Consumer<List<String>> ownerIdsSetter) {
        if (this.ownerIds == null) {
            this.ownerIds = new ArrayList<>();
        }
        ownerIdsSetter.accept(this.ownerIds);
        return this;
    }

    /**
     * 迭代计划责任人集合
     * @return ownerIds
     */
    public List<String> getOwnerIds() {
        return ownerIds;
    }

    public void setOwnerIds(List<String> ownerIds) {
        this.ownerIds = ownerIds;
    }

    public IteratorVersionsQueryInfo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目ID
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public IteratorVersionsQueryInfo withCurrentStage(String currentStage) {
        this.currentStage = currentStage;
        return this;
    }

    /**
     * 迭代计划所处节点
     * @return currentStage
     */
    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public IteratorVersionsQueryInfo withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 当前页数
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public IteratorVersionsQueryInfo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页条数
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IteratorVersionsQueryInfo that = (IteratorVersionsQueryInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.own, that.own) && Objects.equals(this.branchUri, that.branchUri)
            && Objects.equals(this.iteratorUri, that.iteratorUri) && Objects.equals(this.ownerIds, that.ownerIds)
            && Objects.equals(this.projectUuid, that.projectUuid)
            && Objects.equals(this.currentStage, that.currentStage) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, filter, own, branchUri, iteratorUri, ownerIds, projectUuid, currentStage, pageNo, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IteratorVersionsQueryInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    own: ").append(toIndentedString(own)).append("\n");
        sb.append("    branchUri: ").append(toIndentedString(branchUri)).append("\n");
        sb.append("    iteratorUri: ").append(toIndentedString(iteratorUri)).append("\n");
        sb.append("    ownerIds: ").append(toIndentedString(ownerIds)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    currentStage: ").append(toIndentedString(currentStage)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
