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
public class ListJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

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
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_name")

    private String toolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_start_time")

    private Long finishStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_end_time")

    private Long finishEndTime;

    public ListJobRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 平台项目ID，您可以在平台单击所需的项目名称，进入项目设置页面查看。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public ListJobRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 最大开始时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称 取值范围：长度为[1,63]，以小写字母开头，允许出现中划线(-)、小写字母和数字，且必须以小写字母或数字结尾。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ListJobRequest withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ListJobRequest addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ListJobRequest withLabels(Consumer<List<String>> labelsSetter) {
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

    public ListJobRequest withLimit(Integer limit) {
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

    public ListJobRequest withOffset(Integer offset) {
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

    public ListJobRequest withSortDir(String sortDir) {
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

    public ListJobRequest withSortKey(String sortKey) {
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

    public ListJobRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 最小开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListJobRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业运行状态 取值（Succeeded|Running|Pending|Failed|Cancelling|Cancelled|Unknown）
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListJobRequest withToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }

    /**
     * 作业依赖的组件名称(有可能是Workflow，有可能是app), 取值范围：长度为[1,56]，以小写字母开头，允许出现中划线(-)、小写字母和数字，且必须以小写字母或数字结尾。
     * @return toolName
     */
    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public ListJobRequest withUserName(String userName) {
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

    public ListJobRequest withFinishStartTime(Long finishStartTime) {
        this.finishStartTime = finishStartTime;
        return this;
    }

    /**
     * 最小结束时间
     * @return finishStartTime
     */
    public Long getFinishStartTime() {
        return finishStartTime;
    }

    public void setFinishStartTime(Long finishStartTime) {
        this.finishStartTime = finishStartTime;
    }

    public ListJobRequest withFinishEndTime(Long finishEndTime) {
        this.finishEndTime = finishEndTime;
        return this;
    }

    /**
     * 最大结束时间
     * @return finishEndTime
     */
    public Long getFinishEndTime() {
        return finishEndTime;
    }

    public void setFinishEndTime(Long finishEndTime) {
        this.finishEndTime = finishEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobRequest that = (ListJobRequest) obj;
        return Objects.equals(this.eihealthProjectId, that.eihealthProjectId)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.toolName, that.toolName)
            && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.finishStartTime, that.finishStartTime)
            && Objects.equals(this.finishEndTime, that.finishEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId,
            endTime,
            jobName,
            labels,
            limit,
            offset,
            sortDir,
            sortKey,
            startTime,
            status,
            toolName,
            userName,
            finishStartTime,
            finishEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    toolName: ").append(toIndentedString(toolName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
