package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTasksListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_result_types")

    private String reviewResultTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_status_types")

    private String jobStatusTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by_execute_time")

    private String orderByExecuteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_classification_id")

    private String taskClassificationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_order")

    private String sortOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_url")

    private String repoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_url_full_match")

    private String repoUrlFullMatch;

    public ShowTasksListRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * **参数解释：** 分页页码。 **约束限制：** 分页页码≥1。 **取值范围:** 1-2147483647 **默认取值：**  不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ShowTasksListRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * **参数解释：** 分页大小。 **约束限制：** 数字1-200之间。 **取值范围:** 1-200 **默认取值：** 不涉及。
     * minimum: 1
     * maximum: 200
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ShowTasksListRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * **参数解释：** 需要搜索的任务名。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ShowTasksListRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目的32位UUID，项目唯一标识，通过[[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)](tag:hws)[[查询项目列表](https://support.huaweicloud.com/intl/zh-cn/api-projectman/ListProjectsV4.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)接口获取。 **约束条件：** 不涉及。 **取值范围：** 长度为[1~32]个字符。 **默认取值：** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowTasksListRequest withReviewResultTypes(String reviewResultTypes) {
        this.reviewResultTypes = reviewResultTypes;
        return this;
    }

    /**
     * **参数解释：** 门禁结果。 **约束限制：** 不涉及。 **取值范围：** - success：门禁通过。 - error：门禁不通过。 **默认取值：** 不涉及。
     * @return reviewResultTypes
     */
    public String getReviewResultTypes() {
        return reviewResultTypes;
    }

    public void setReviewResultTypes(String reviewResultTypes) {
        this.reviewResultTypes = reviewResultTypes;
    }

    public ShowTasksListRequest withJobStatusTypes(String jobStatusTypes) {
        this.jobStatusTypes = jobStatusTypes;
        return this;
    }

    /**
     * **参数解释：** 检查状态。 **约束限制：** 不涉及。 **取值范围：** - success：检查成功。 - failed：检查失败。 - aborted：检查终止。 - executing：检查中。 - never_execute：未检查。 **默认取值：** 不涉及。
     * @return jobStatusTypes
     */
    public String getJobStatusTypes() {
        return jobStatusTypes;
    }

    public void setJobStatusTypes(String jobStatusTypes) {
        this.jobStatusTypes = jobStatusTypes;
    }

    public ShowTasksListRequest withOrderByExecuteTime(String orderByExecuteTime) {
        this.orderByExecuteTime = orderByExecuteTime;
        return this;
    }

    /**
     * **参数解释：** 是否按照执行时间排序。 **约束限制：** 不涉及。 **取值范围：** - up：按照执行时间升序排序。 - down：按照执行时间降序排序。 **默认取值：** 不涉及。
     * @return orderByExecuteTime
     */
    public String getOrderByExecuteTime() {
        return orderByExecuteTime;
    }

    public void setOrderByExecuteTime(String orderByExecuteTime) {
        this.orderByExecuteTime = orderByExecuteTime;
    }

    public ShowTasksListRequest withTaskClassificationId(String taskClassificationId) {
        this.taskClassificationId = taskClassificationId;
        return this;
    }

    /**
     * **参数解释：** 任务的分组ID，可通过列出项目下的分组信息接口获取任务的分组ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return taskClassificationId
     */
    public String getTaskClassificationId() {
        return taskClassificationId;
    }

    public void setTaskClassificationId(String taskClassificationId) {
        this.taskClassificationId = taskClassificationId;
    }

    public ShowTasksListRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 列表类接口参数
     * minimum: 1
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowTasksListRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 列表类接口参数
     * minimum: 1
     * maximum: 50
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowTasksListRequest withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * **参数解释：** 排序字段,任务列表每次只能根据一个字段进行排序。 **约束限制：** 不涉及。
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public ShowTasksListRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * **参数解释：** 排序顺序，取值范围：\"up\"（升序）、\"down\"（降序） **约束限制：** 不涉及。
     * @return sortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public ShowTasksListRequest withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * **参数解释：** 操作人，填写账号用户名。 **约束限制：** 不涉及。 **取值范围：** 长度为[1~128]个字符。 **默认取值：** 不涉及。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ShowTasksListRequest withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    /**
     * **参数解释：** 代码仓地址。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return repoUrl
     */
    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public ShowTasksListRequest withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * **参数解释：** 分支。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public ShowTasksListRequest withRepoUrlFullMatch(String repoUrlFullMatch) {
        this.repoUrlFullMatch = repoUrlFullMatch;
        return this;
    }

    /**
     * **参数解释：** 和repo_url配合使用，查询任务时是否完全匹配repo_url。 **约束限制：** 不涉及。 **取值范围：** - true：只查询代码仓地址为repo_url的任务。 - false：查询ssh协议的代码仓地址或http协议的代码仓地址和repo_url匹配的任务。 **默认取值：** false。
     * @return repoUrlFullMatch
     */
    public String getRepoUrlFullMatch() {
        return repoUrlFullMatch;
    }

    public void setRepoUrlFullMatch(String repoUrlFullMatch) {
        this.repoUrlFullMatch = repoUrlFullMatch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTasksListRequest that = (ShowTasksListRequest) obj;
        return Objects.equals(this.page, that.page) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.search, that.search) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.reviewResultTypes, that.reviewResultTypes)
            && Objects.equals(this.jobStatusTypes, that.jobStatusTypes)
            && Objects.equals(this.orderByExecuteTime, that.orderByExecuteTime)
            && Objects.equals(this.taskClassificationId, that.taskClassificationId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.sortField, that.sortField) && Objects.equals(this.sortOrder, that.sortOrder)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.repoUrl, that.repoUrl)
            && Objects.equals(this.branch, that.branch) && Objects.equals(this.repoUrlFullMatch, that.repoUrlFullMatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page,
            pageSize,
            search,
            projectId,
            reviewResultTypes,
            jobStatusTypes,
            orderByExecuteTime,
            taskClassificationId,
            offset,
            limit,
            sortField,
            sortOrder,
            operator,
            repoUrl,
            branch,
            repoUrlFullMatch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTasksListRequest {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    reviewResultTypes: ").append(toIndentedString(reviewResultTypes)).append("\n");
        sb.append("    jobStatusTypes: ").append(toIndentedString(jobStatusTypes)).append("\n");
        sb.append("    orderByExecuteTime: ").append(toIndentedString(orderByExecuteTime)).append("\n");
        sb.append("    taskClassificationId: ").append(toIndentedString(taskClassificationId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    repoUrl: ").append(toIndentedString(repoUrl)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    repoUrlFullMatch: ").append(toIndentedString(repoUrlFullMatch)).append("\n");
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
