package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTaskInstanceMetricDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_index")

    private String taskIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_time")

    private Long fromTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_time")

    private Long toTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    public ShowTaskInstanceMetricDataRequest withEihealthProjectId(String eihealthProjectId) {
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

    public ShowTaskInstanceMetricDataRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowTaskInstanceMetricDataRequest withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 子任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ShowTaskInstanceMetricDataRequest withTaskIndex(String taskIndex) {
        this.taskIndex = taskIndex;
        return this;
    }

    /**
     * 子任务的并发序号
     * @return taskIndex
     */
    public String getTaskIndex() {
        return taskIndex;
    }

    public void setTaskIndex(String taskIndex) {
        this.taskIndex = taskIndex;
    }

    public ShowTaskInstanceMetricDataRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 子任务实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ShowTaskInstanceMetricDataRequest withFromTime(Long fromTime) {
        this.fromTime = fromTime;
        return this;
    }

    /**
     * 查询监控数据起始时间，UNIX时间戳，单位毫秒，不填时默认为当前时间
     * @return fromTime
     */
    public Long getFromTime() {
        return fromTime;
    }

    public void setFromTime(Long fromTime) {
        this.fromTime = fromTime;
    }

    public ShowTaskInstanceMetricDataRequest withToTime(Long toTime) {
        this.toTime = toTime;
        return this;
    }

    /**
     * 查询监控数据截止时间，UNIX时间戳，单位毫秒，不填时默认为当前时间
     * @return toTime
     */
    public Long getToTime() {
        return toTime;
    }

    public void setToTime(Long toTime) {
        this.toTime = toTime;
    }

    public ShowTaskInstanceMetricDataRequest withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * 统计方法。枚举值，取值范围：maximum（最大值）、minimum（最小值）、average（平均值），不填时默认为maximum
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ShowTaskInstanceMetricDataRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 查询的监控指标名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskInstanceMetricDataRequest that = (ShowTaskInstanceMetricDataRequest) obj;
        return Objects.equals(this.eihealthProjectId, that.eihealthProjectId) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.taskIndex, that.taskIndex)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.fromTime, that.fromTime)
            && Objects.equals(this.toTime, that.toTime) && Objects.equals(this.method, that.method)
            && Objects.equals(this.metricName, that.metricName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(eihealthProjectId, jobId, taskName, taskIndex, instanceName, fromTime, toTime, method, metricName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskInstanceMetricDataRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskIndex: ").append(toIndentedString(taskIndex)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
        sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
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
