package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListFlinkJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_job_id")

    private Long rootJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_detail")

    private Boolean showDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_enterprise_project_name")

    private String sysEnterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public ListFlinkJobsRequest withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public ListFlinkJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回的数据条数。默认为10。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListFlinkJobsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称。长度限制：0-57个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListFlinkJobsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 作业偏移量。
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListFlinkJobsRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 查询结果排序，升序asc和降序desc两种可选，默认降序。
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ListFlinkJobsRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 队列名称。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ListFlinkJobsRequest withRootJobId(Long rootJobId) {
        this.rootJobId = rootJobId;
        return this;
    }

    /**
     * 边缘父作业ID, 用于查询指定边缘作业的子作业。不带该参数时, 查询所有非边缘作业和边缘父作业, 不包括边缘子作业。
     * @return rootJobId
     */
    public Long getRootJobId() {
        return rootJobId;
    }

    public void setRootJobId(Long rootJobId) {
        this.rootJobId = rootJobId;
    }

    public ListFlinkJobsRequest withShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
        return this;
    }

    /**
     * 是否返回作业详情信息。默认为false。
     * @return showDetail
     */
    public Boolean getShowDetail() {
        return showDetail;
    }

    public void setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
    }

    public ListFlinkJobsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态。 作业的状态如下： job_init：草稿 job_submitting：提交中 job_submit_fail：提交失败 job_running：运行中（开始计费，提交作业后，返回正常结果） job_running_exception：运行异常（停止计费。作业发生运行时异常，停止运行作业） job_downloading：下载中 job_idle：空闲 job_canceling：停止中 job_cancel_success：已停止 job_cancel_fail：停止失败 job_savepointing：保存点创建中 job_arrearage_stopped：因欠费被停止（结束计费。用户账户欠费，作业停止） job_arrearage_recovering：欠费作业恢复中（用户账户欠费，账户充值，作业恢复中） job_finish：已完成
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListFlinkJobsRequest withSysEnterpriseProjectName(String sysEnterpriseProjectName) {
        this.sysEnterpriseProjectName = sysEnterpriseProjectName;
        return this;
    }

    /**
     * Get sysEnterpriseProjectName
     * @return sysEnterpriseProjectName
     */
    public String getSysEnterpriseProjectName() {
        return sysEnterpriseProjectName;
    }

    public void setSysEnterpriseProjectName(String sysEnterpriseProjectName) {
        this.sysEnterpriseProjectName = sysEnterpriseProjectName;
    }

    public ListFlinkJobsRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListFlinkJobsRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名，可作为筛选条件
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFlinkJobsRequest that = (ListFlinkJobsRequest) obj;
        return Objects.equals(this.jobType, that.jobType) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.name, that.name) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.order, that.order) && Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.rootJobId, that.rootJobId) && Objects.equals(this.showDetail, that.showDetail)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.sysEnterpriseProjectName, that.sysEnterpriseProjectName)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobType,
            limit,
            name,
            offset,
            order,
            queueName,
            rootJobId,
            showDetail,
            status,
            sysEnterpriseProjectName,
            tags,
            userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlinkJobsRequest {\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    rootJobId: ").append(toIndentedString(rootJobId)).append("\n");
        sb.append("    showDetail: ").append(toIndentedString(showDetail)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sysEnterpriseProjectName: ").append(toIndentedString(sysEnterpriseProjectName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
