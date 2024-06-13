package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryIssueTreeInfo
 */
public class QueryIssueTreeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private Integer serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_types")

    private List<Integer> serviceTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    private Integer pageNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private IssueListFilterInfo filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private String trackerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_uri")

    private String taskUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_sub_issue")

    private Boolean includeSubIssue;

    public QueryIssueTreeInfo withServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型
     * @return serviceType
     */
    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public QueryIssueTreeInfo withServiceTypes(List<Integer> serviceTypes) {
        this.serviceTypes = serviceTypes;
        return this;
    }

    public QueryIssueTreeInfo addServiceTypesItem(Integer serviceTypesItem) {
        if (this.serviceTypes == null) {
            this.serviceTypes = new ArrayList<>();
        }
        this.serviceTypes.add(serviceTypesItem);
        return this;
    }

    public QueryIssueTreeInfo withServiceTypes(Consumer<List<Integer>> serviceTypesSetter) {
        if (this.serviceTypes == null) {
            this.serviceTypes = new ArrayList<>();
        }
        serviceTypesSetter.accept(this.serviceTypes);
        return this;
    }

    /**
     * 服务类型集合
     * @return serviceTypes
     */
    public List<Integer> getServiceTypes() {
        return serviceTypes;
    }

    public void setServiceTypes(List<Integer> serviceTypes) {
        this.serviceTypes = serviceTypes;
    }

    public QueryIssueTreeInfo withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父节点id
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public QueryIssueTreeInfo withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * 页码
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public QueryIssueTreeInfo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页数量
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public QueryIssueTreeInfo withFilter(IssueListFilterInfo filter) {
        this.filter = filter;
        return this;
    }

    public QueryIssueTreeInfo withFilter(Consumer<IssueListFilterInfo> filterSetter) {
        if (this.filter == null) {
            this.filter = new IssueListFilterInfo();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public IssueListFilterInfo getFilter() {
        return filter;
    }

    public void setFilter(IssueListFilterInfo filter) {
        this.filter = filter;
    }

    public QueryIssueTreeInfo withTrackerId(String trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * trackerId
     * @return trackerId
     */
    public String getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(String trackerId) {
        this.trackerId = trackerId;
    }

    public QueryIssueTreeInfo withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 模块id
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public QueryIssueTreeInfo withTaskUri(String taskUri) {
        this.taskUri = taskUri;
        return this;
    }

    /**
     * 任务udi
     * @return taskUri
     */
    public String getTaskUri() {
        return taskUri;
    }

    public void setTaskUri(String taskUri) {
        this.taskUri = taskUri;
    }

    public QueryIssueTreeInfo withIncludeSubIssue(Boolean includeSubIssue) {
        this.includeSubIssue = includeSubIssue;
        return this;
    }

    /**
     * 是否统计子需求的用例数，默认true
     * @return includeSubIssue
     */
    public Boolean getIncludeSubIssue() {
        return includeSubIssue;
    }

    public void setIncludeSubIssue(Boolean includeSubIssue) {
        this.includeSubIssue = includeSubIssue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryIssueTreeInfo that = (QueryIssueTreeInfo) obj;
        return Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.serviceTypes, that.serviceTypes) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.pageNumber, that.pageNumber) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.filter, that.filter) && Objects.equals(this.trackerId, that.trackerId)
            && Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.taskUri, that.taskUri)
            && Objects.equals(this.includeSubIssue, that.includeSubIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceType,
            serviceTypes,
            parentId,
            pageNumber,
            pageSize,
            filter,
            trackerId,
            moduleId,
            taskUri,
            includeSubIssue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryIssueTreeInfo {\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    serviceTypes: ").append(toIndentedString(serviceTypes)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    taskUri: ").append(toIndentedString(taskUri)).append("\n");
        sb.append("    includeSubIssue: ").append(toIndentedString(includeSubIssue)).append("\n");
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
