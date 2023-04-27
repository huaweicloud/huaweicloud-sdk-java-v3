package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListNextflowJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_name")

    private String workflowName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_start_time")

    private Long createStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_end_time")

    private Long createEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_start_time")

    private Long finishStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_end_time")

    private Long finishEndTime;

    public ListNextflowJobRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 医疗智能体平台项目ID，您可以在EIHealth平台单击所需的项目名称，进入项目设置页面查看。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public ListNextflowJobRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 限制量，单次查询总量，必须由数字组成，默认为100，取值范围[1,1000]
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListNextflowJobRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，查询起始偏移，必须由数字组成，默认为0，取值范围[0,100000000]
     * minimum: 0
     * maximum: 100000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListNextflowJobRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序规则 目前默认时间降序
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListNextflowJobRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序规则 目前默认时间降序，支持根据status
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListNextflowJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ListNextflowJobRequest withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ListNextflowJobRequest addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ListNextflowJobRequest withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 标签列表
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public ListNextflowJobRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业运行状态 取值（SUBMITTED|RUNNING|COMPLETED|FAILED|CANCELLED|UNKNOWN）
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListNextflowJobRequest withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    /**
     * workflow名称
     * @return workflowName
     */
    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public ListNextflowJobRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 作业创建者
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListNextflowJobRequest withCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }

    /**
     * 最小创建时间
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return createStartTime
     */
    public Long getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
    }

    public ListNextflowJobRequest withCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }

    /**
     * 最大创建时间
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return createEndTime
     */
    public Long getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
    }

    public ListNextflowJobRequest withFinishStartTime(Long finishStartTime) {
        this.finishStartTime = finishStartTime;
        return this;
    }

    /**
     * 最小结束时间
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return finishStartTime
     */
    public Long getFinishStartTime() {
        return finishStartTime;
    }

    public void setFinishStartTime(Long finishStartTime) {
        this.finishStartTime = finishStartTime;
    }

    public ListNextflowJobRequest withFinishEndTime(Long finishEndTime) {
        this.finishEndTime = finishEndTime;
        return this;
    }

    /**
     * 最大结束时间
     * minimum: 1000000000000
     * maximum: 9999999999999
     * @return finishEndTime
     */
    public Long getFinishEndTime() {
        return finishEndTime;
    }

    public void setFinishEndTime(Long finishEndTime) {
        this.finishEndTime = finishEndTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNextflowJobRequest listNextflowJobRequest = (ListNextflowJobRequest) o;
        return Objects.equals(this.eihealthProjectId, listNextflowJobRequest.eihealthProjectId)
            && Objects.equals(this.limit, listNextflowJobRequest.limit)
            && Objects.equals(this.offset, listNextflowJobRequest.offset)
            && Objects.equals(this.sortDir, listNextflowJobRequest.sortDir)
            && Objects.equals(this.sortKey, listNextflowJobRequest.sortKey)
            && Objects.equals(this.jobName, listNextflowJobRequest.jobName)
            && Objects.equals(this.labels, listNextflowJobRequest.labels)
            && Objects.equals(this.status, listNextflowJobRequest.status)
            && Objects.equals(this.workflowName, listNextflowJobRequest.workflowName)
            && Objects.equals(this.userName, listNextflowJobRequest.userName)
            && Objects.equals(this.createStartTime, listNextflowJobRequest.createStartTime)
            && Objects.equals(this.createEndTime, listNextflowJobRequest.createEndTime)
            && Objects.equals(this.finishStartTime, listNextflowJobRequest.finishStartTime)
            && Objects.equals(this.finishEndTime, listNextflowJobRequest.finishEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId,
            limit,
            offset,
            sortDir,
            sortKey,
            jobName,
            labels,
            status,
            workflowName,
            userName,
            createStartTime,
            createEndTime,
            finishStartTime,
            finishEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNextflowJobRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    createStartTime: ").append(toIndentedString(createStartTime)).append("\n");
        sb.append("    createEndTime: ").append(toIndentedString(createEndTime)).append("\n");
        sb.append("    finishStartTime: ").append(toIndentedString(finishStartTime)).append("\n");
        sb.append("    finishEndTime: ").append(toIndentedString(finishEndTime)).append("\n");
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
