package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TasksQueryInfo
 */
public class TasksQueryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uris")

    private List<String> uris = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "own")

    private Boolean own;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private Integer serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_dev_list")

    private List<String> releaseDevList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_codes")

    private List<String> resultCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_codes")

    private List<String> statusCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_ids")

    private List<String> ownerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_ids")

    private List<String> executorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_ids")

    private List<String> creatorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_type")

    private String sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_polling_query")

    private Boolean isPollingQuery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_query_associated_case_list")

    private Boolean isQueryAssociatedCaseList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_start_timestamp")

    private Long planStartStartTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_end_timestamp")

    private Long planStartEndTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_start_timestamp")

    private Long planEndStartTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_end_timestamp")

    private Long planEndEndTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_status_list")

    private List<Integer> expirationStatusList = null;

    public TasksQueryInfo withUris(List<String> uris) {
        this.uris = uris;
        return this;
    }

    public TasksQueryInfo addUrisItem(String urisItem) {
        if (this.uris == null) {
            this.uris = new ArrayList<>();
        }
        this.uris.add(urisItem);
        return this;
    }

    public TasksQueryInfo withUris(Consumer<List<String>> urisSetter) {
        if (this.uris == null) {
            this.uris = new ArrayList<>();
        }
        urisSetter.accept(this.uris);
        return this;
    }

    /**
     * 测试任务URI集合
     * @return uris
     */
    public List<String> getUris() {
        return uris;
    }

    public void setUris(List<String> uris) {
        this.uris = uris;
    }

    public TasksQueryInfo withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字查询，任务名或编号
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public TasksQueryInfo withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public TasksQueryInfo addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TasksQueryInfo withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签集合
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public TasksQueryInfo withOwn(Boolean own) {
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

    public TasksQueryInfo withServiceType(Integer serviceType) {
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

    public TasksQueryInfo withReleaseDevList(List<String> releaseDevList) {
        this.releaseDevList = releaseDevList;
        return this;
    }

    public TasksQueryInfo addReleaseDevListItem(String releaseDevListItem) {
        if (this.releaseDevList == null) {
            this.releaseDevList = new ArrayList<>();
        }
        this.releaseDevList.add(releaseDevListItem);
        return this;
    }

    public TasksQueryInfo withReleaseDevList(Consumer<List<String>> releaseDevListSetter) {
        if (this.releaseDevList == null) {
            this.releaseDevList = new ArrayList<>();
        }
        releaseDevListSetter.accept(this.releaseDevList);
        return this;
    }

    /**
     * 发布版本号集合
     * @return releaseDevList
     */
    public List<String> getReleaseDevList() {
        return releaseDevList;
    }

    public void setReleaseDevList(List<String> releaseDevList) {
        this.releaseDevList = releaseDevList;
    }

    public TasksQueryInfo withResultCodes(List<String> resultCodes) {
        this.resultCodes = resultCodes;
        return this;
    }

    public TasksQueryInfo addResultCodesItem(String resultCodesItem) {
        if (this.resultCodes == null) {
            this.resultCodes = new ArrayList<>();
        }
        this.resultCodes.add(resultCodesItem);
        return this;
    }

    public TasksQueryInfo withResultCodes(Consumer<List<String>> resultCodesSetter) {
        if (this.resultCodes == null) {
            this.resultCodes = new ArrayList<>();
        }
        resultCodesSetter.accept(this.resultCodes);
        return this;
    }

    /**
     * 结果Code集合
     * @return resultCodes
     */
    public List<String> getResultCodes() {
        return resultCodes;
    }

    public void setResultCodes(List<String> resultCodes) {
        this.resultCodes = resultCodes;
    }

    public TasksQueryInfo withStatusCodes(List<String> statusCodes) {
        this.statusCodes = statusCodes;
        return this;
    }

    public TasksQueryInfo addStatusCodesItem(String statusCodesItem) {
        if (this.statusCodes == null) {
            this.statusCodes = new ArrayList<>();
        }
        this.statusCodes.add(statusCodesItem);
        return this;
    }

    public TasksQueryInfo withStatusCodes(Consumer<List<String>> statusCodesSetter) {
        if (this.statusCodes == null) {
            this.statusCodes = new ArrayList<>();
        }
        statusCodesSetter.accept(this.statusCodes);
        return this;
    }

    /**
     * 状态Code集合
     * @return statusCodes
     */
    public List<String> getStatusCodes() {
        return statusCodes;
    }

    public void setStatusCodes(List<String> statusCodes) {
        this.statusCodes = statusCodes;
    }

    public TasksQueryInfo withOwnerIds(List<String> ownerIds) {
        this.ownerIds = ownerIds;
        return this;
    }

    public TasksQueryInfo addOwnerIdsItem(String ownerIdsItem) {
        if (this.ownerIds == null) {
            this.ownerIds = new ArrayList<>();
        }
        this.ownerIds.add(ownerIdsItem);
        return this;
    }

    public TasksQueryInfo withOwnerIds(Consumer<List<String>> ownerIdsSetter) {
        if (this.ownerIds == null) {
            this.ownerIds = new ArrayList<>();
        }
        ownerIdsSetter.accept(this.ownerIds);
        return this;
    }

    /**
     * 责任人ID集合
     * @return ownerIds
     */
    public List<String> getOwnerIds() {
        return ownerIds;
    }

    public void setOwnerIds(List<String> ownerIds) {
        this.ownerIds = ownerIds;
    }

    public TasksQueryInfo withExecutorIds(List<String> executorIds) {
        this.executorIds = executorIds;
        return this;
    }

    public TasksQueryInfo addExecutorIdsItem(String executorIdsItem) {
        if (this.executorIds == null) {
            this.executorIds = new ArrayList<>();
        }
        this.executorIds.add(executorIdsItem);
        return this;
    }

    public TasksQueryInfo withExecutorIds(Consumer<List<String>> executorIdsSetter) {
        if (this.executorIds == null) {
            this.executorIds = new ArrayList<>();
        }
        executorIdsSetter.accept(this.executorIds);
        return this;
    }

    /**
     * 执行者ID集合
     * @return executorIds
     */
    public List<String> getExecutorIds() {
        return executorIds;
    }

    public void setExecutorIds(List<String> executorIds) {
        this.executorIds = executorIds;
    }

    public TasksQueryInfo withCreatorIds(List<String> creatorIds) {
        this.creatorIds = creatorIds;
        return this;
    }

    public TasksQueryInfo addCreatorIdsItem(String creatorIdsItem) {
        if (this.creatorIds == null) {
            this.creatorIds = new ArrayList<>();
        }
        this.creatorIds.add(creatorIdsItem);
        return this;
    }

    public TasksQueryInfo withCreatorIds(Consumer<List<String>> creatorIdsSetter) {
        if (this.creatorIds == null) {
            this.creatorIds = new ArrayList<>();
        }
        creatorIdsSetter.accept(this.creatorIds);
        return this;
    }

    /**
     * 创建者ID集合
     * @return creatorIds
     */
    public List<String> getCreatorIds() {
        return creatorIds;
    }

    public void setCreatorIds(List<String> creatorIds) {
        this.creatorIds = creatorIds;
    }

    public TasksQueryInfo withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public TasksQueryInfo withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * 排序方式
     * @return sortType
     */
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public TasksQueryInfo withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 当前页数
     * minimum: 1
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public TasksQueryInfo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页条数
     * minimum: 1
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public TasksQueryInfo withIsPollingQuery(Boolean isPollingQuery) {
        this.isPollingQuery = isPollingQuery;
        return this;
    }

    /**
     * 是否轮询查询
     * @return isPollingQuery
     */
    public Boolean getIsPollingQuery() {
        return isPollingQuery;
    }

    public void setIsPollingQuery(Boolean isPollingQuery) {
        this.isPollingQuery = isPollingQuery;
    }

    public TasksQueryInfo withIsQueryAssociatedCaseList(Boolean isQueryAssociatedCaseList) {
        this.isQueryAssociatedCaseList = isQueryAssociatedCaseList;
        return this;
    }

    /**
     * 是否获取关联用例列表
     * @return isQueryAssociatedCaseList
     */
    public Boolean getIsQueryAssociatedCaseList() {
        return isQueryAssociatedCaseList;
    }

    public void setIsQueryAssociatedCaseList(Boolean isQueryAssociatedCaseList) {
        this.isQueryAssociatedCaseList = isQueryAssociatedCaseList;
    }

    public TasksQueryInfo withPlanStartStartTimestamp(Long planStartStartTimestamp) {
        this.planStartStartTimestamp = planStartStartTimestamp;
        return this;
    }

    /**
     * 计划开始时间过滤起始时间戳
     * @return planStartStartTimestamp
     */
    public Long getPlanStartStartTimestamp() {
        return planStartStartTimestamp;
    }

    public void setPlanStartStartTimestamp(Long planStartStartTimestamp) {
        this.planStartStartTimestamp = planStartStartTimestamp;
    }

    public TasksQueryInfo withPlanStartEndTimestamp(Long planStartEndTimestamp) {
        this.planStartEndTimestamp = planStartEndTimestamp;
        return this;
    }

    /**
     * 计划开始时间过滤结束时间戳
     * @return planStartEndTimestamp
     */
    public Long getPlanStartEndTimestamp() {
        return planStartEndTimestamp;
    }

    public void setPlanStartEndTimestamp(Long planStartEndTimestamp) {
        this.planStartEndTimestamp = planStartEndTimestamp;
    }

    public TasksQueryInfo withPlanEndStartTimestamp(Long planEndStartTimestamp) {
        this.planEndStartTimestamp = planEndStartTimestamp;
        return this;
    }

    /**
     * 计划结束时间过滤起始时间戳
     * @return planEndStartTimestamp
     */
    public Long getPlanEndStartTimestamp() {
        return planEndStartTimestamp;
    }

    public void setPlanEndStartTimestamp(Long planEndStartTimestamp) {
        this.planEndStartTimestamp = planEndStartTimestamp;
    }

    public TasksQueryInfo withPlanEndEndTimestamp(Long planEndEndTimestamp) {
        this.planEndEndTimestamp = planEndEndTimestamp;
        return this;
    }

    /**
     * 计划结束时间过滤结束时间戳
     * @return planEndEndTimestamp
     */
    public Long getPlanEndEndTimestamp() {
        return planEndEndTimestamp;
    }

    public void setPlanEndEndTimestamp(Long planEndEndTimestamp) {
        this.planEndEndTimestamp = planEndEndTimestamp;
    }

    public TasksQueryInfo withExpirationStatusList(List<Integer> expirationStatusList) {
        this.expirationStatusList = expirationStatusList;
        return this;
    }

    public TasksQueryInfo addExpirationStatusListItem(Integer expirationStatusListItem) {
        if (this.expirationStatusList == null) {
            this.expirationStatusList = new ArrayList<>();
        }
        this.expirationStatusList.add(expirationStatusListItem);
        return this;
    }

    public TasksQueryInfo withExpirationStatusList(Consumer<List<Integer>> expirationStatusListSetter) {
        if (this.expirationStatusList == null) {
            this.expirationStatusList = new ArrayList<>();
        }
        expirationStatusListSetter.accept(this.expirationStatusList);
        return this;
    }

    /**
     * 测试套超期状态过滤，超期状态值分别为：无状态(null)、未超期(0)、即将超期(1)、已超期(2)、延期完成(3)、按期完成(4)
     * @return expirationStatusList
     */
    public List<Integer> getExpirationStatusList() {
        return expirationStatusList;
    }

    public void setExpirationStatusList(List<Integer> expirationStatusList) {
        this.expirationStatusList = expirationStatusList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TasksQueryInfo that = (TasksQueryInfo) obj;
        return Objects.equals(this.uris, that.uris) && Objects.equals(this.keyword, that.keyword)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.own, that.own)
            && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.releaseDevList, that.releaseDevList)
            && Objects.equals(this.resultCodes, that.resultCodes) && Objects.equals(this.statusCodes, that.statusCodes)
            && Objects.equals(this.ownerIds, that.ownerIds) && Objects.equals(this.executorIds, that.executorIds)
            && Objects.equals(this.creatorIds, that.creatorIds) && Objects.equals(this.sortField, that.sortField)
            && Objects.equals(this.sortType, that.sortType) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.isPollingQuery, that.isPollingQuery)
            && Objects.equals(this.isQueryAssociatedCaseList, that.isQueryAssociatedCaseList)
            && Objects.equals(this.planStartStartTimestamp, that.planStartStartTimestamp)
            && Objects.equals(this.planStartEndTimestamp, that.planStartEndTimestamp)
            && Objects.equals(this.planEndStartTimestamp, that.planEndStartTimestamp)
            && Objects.equals(this.planEndEndTimestamp, that.planEndEndTimestamp)
            && Objects.equals(this.expirationStatusList, that.expirationStatusList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uris,
            keyword,
            tags,
            own,
            serviceType,
            releaseDevList,
            resultCodes,
            statusCodes,
            ownerIds,
            executorIds,
            creatorIds,
            sortField,
            sortType,
            pageNo,
            pageSize,
            isPollingQuery,
            isQueryAssociatedCaseList,
            planStartStartTimestamp,
            planStartEndTimestamp,
            planEndStartTimestamp,
            planEndEndTimestamp,
            expirationStatusList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TasksQueryInfo {\n");
        sb.append("    uris: ").append(toIndentedString(uris)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    own: ").append(toIndentedString(own)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    releaseDevList: ").append(toIndentedString(releaseDevList)).append("\n");
        sb.append("    resultCodes: ").append(toIndentedString(resultCodes)).append("\n");
        sb.append("    statusCodes: ").append(toIndentedString(statusCodes)).append("\n");
        sb.append("    ownerIds: ").append(toIndentedString(ownerIds)).append("\n");
        sb.append("    executorIds: ").append(toIndentedString(executorIds)).append("\n");
        sb.append("    creatorIds: ").append(toIndentedString(creatorIds)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    isPollingQuery: ").append(toIndentedString(isPollingQuery)).append("\n");
        sb.append("    isQueryAssociatedCaseList: ").append(toIndentedString(isQueryAssociatedCaseList)).append("\n");
        sb.append("    planStartStartTimestamp: ").append(toIndentedString(planStartStartTimestamp)).append("\n");
        sb.append("    planStartEndTimestamp: ").append(toIndentedString(planStartEndTimestamp)).append("\n");
        sb.append("    planEndStartTimestamp: ").append(toIndentedString(planEndStartTimestamp)).append("\n");
        sb.append("    planEndEndTimestamp: ").append(toIndentedString(planEndEndTimestamp)).append("\n");
        sb.append("    expirationStatusList: ").append(toIndentedString(expirationStatusList)).append("\n");
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
