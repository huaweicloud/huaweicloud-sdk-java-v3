package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业详情信息
 */
public class JobResultV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_instance_status")

    private String lastInstanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_instance_end_time")

    private Long lastInstanceEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_user")

    private String lastUpdateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flink_job_info")

    private String flinkJobInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_node_job_flag")

    private Boolean singleNodeJobFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarms")

    private List<JobAlarm> alarms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_node_job_type")

    private String singleNodeJobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "empty_running_job")

    private String emptyRunningJob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_plan_time")

    private String nextPlanTime;

    public JobResultV2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobResultV2 withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型： - BATCH: 批处理作业 - REAL_TIME: 实时作业
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public JobResultV2 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JobResultV2 withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 作业创建者。
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public JobResultV2 withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 作业创建时间，13位时间戳。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public JobResultV2 withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 作业开始时间，13位时间戳。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public JobResultV2 withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 作业结束时间，13位时间戳。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public JobResultV2 withLastInstanceStatus(String lastInstanceStatus) {
        this.lastInstanceStatus = lastInstanceStatus;
        return this;
    }

    /**
     * 上次实例运行状态。
     * @return lastInstanceStatus
     */
    public String getLastInstanceStatus() {
        return lastInstanceStatus;
    }

    public void setLastInstanceStatus(String lastInstanceStatus) {
        this.lastInstanceStatus = lastInstanceStatus;
    }

    public JobResultV2 withLastInstanceEndTime(Long lastInstanceEndTime) {
        this.lastInstanceEndTime = lastInstanceEndTime;
        return this;
    }

    /**
     * 上次实例结束时间，13位时间戳。
     * @return lastInstanceEndTime
     */
    public Long getLastInstanceEndTime() {
        return lastInstanceEndTime;
    }

    public void setLastInstanceEndTime(Long lastInstanceEndTime) {
        this.lastInstanceEndTime = lastInstanceEndTime;
    }

    public JobResultV2 withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 作业负责人。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public JobResultV2 withLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
        return this;
    }

    /**
     * 最后更新人。
     * @return lastUpdateUser
     */
    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public JobResultV2 withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 作业优先级。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public JobResultV2 withFlinkJobInfo(String flinkJobInfo) {
        this.flinkJobInfo = flinkJobInfo;
        return this;
    }

    /**
     * Flink作业信息。
     * @return flinkJobInfo
     */
    public String getFlinkJobInfo() {
        return flinkJobInfo;
    }

    public void setFlinkJobInfo(String flinkJobInfo) {
        this.flinkJobInfo = flinkJobInfo;
    }

    public JobResultV2 withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 作业路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public JobResultV2 withSingleNodeJobFlag(Boolean singleNodeJobFlag) {
        this.singleNodeJobFlag = singleNodeJobFlag;
        return this;
    }

    /**
     * 是否为单节点作业。
     * @return singleNodeJobFlag
     */
    public Boolean getSingleNodeJobFlag() {
        return singleNodeJobFlag;
    }

    public void setSingleNodeJobFlag(Boolean singleNodeJobFlag) {
        this.singleNodeJobFlag = singleNodeJobFlag;
    }

    public JobResultV2 withAlarms(List<JobAlarm> alarms) {
        this.alarms = alarms;
        return this;
    }

    public JobResultV2 addAlarmsItem(JobAlarm alarmsItem) {
        if (this.alarms == null) {
            this.alarms = new ArrayList<>();
        }
        this.alarms.add(alarmsItem);
        return this;
    }

    public JobResultV2 withAlarms(Consumer<List<JobAlarm>> alarmsSetter) {
        if (this.alarms == null) {
            this.alarms = new ArrayList<>();
        }
        alarmsSetter.accept(this.alarms);
        return this;
    }

    /**
     * 告警信息列表。
     * @return alarms
     */
    public List<JobAlarm> getAlarms() {
        return alarms;
    }

    public void setAlarms(List<JobAlarm> alarms) {
        this.alarms = alarms;
    }

    public JobResultV2 withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最后更新时间，13位时间戳。
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public JobResultV2 withSingleNodeJobType(String singleNodeJobType) {
        this.singleNodeJobType = singleNodeJobType;
        return this;
    }

    /**
     * 单节点作业类型。
     * @return singleNodeJobType
     */
    public String getSingleNodeJobType() {
        return singleNodeJobType;
    }

    public void setSingleNodeJobType(String singleNodeJobType) {
        this.singleNodeJobType = singleNodeJobType;
    }

    public JobResultV2 withEmptyRunningJob(String emptyRunningJob) {
        this.emptyRunningJob = emptyRunningJob;
        return this;
    }

    /**
     * 空跑作业标识。
     * @return emptyRunningJob
     */
    public String getEmptyRunningJob() {
        return emptyRunningJob;
    }

    public void setEmptyRunningJob(String emptyRunningJob) {
        this.emptyRunningJob = emptyRunningJob;
    }

    public JobResultV2 withNextPlanTime(String nextPlanTime) {
        this.nextPlanTime = nextPlanTime;
        return this;
    }

    /**
     * 下次计划执行时间。
     * @return nextPlanTime
     */
    public String getNextPlanTime() {
        return nextPlanTime;
    }

    public void setNextPlanTime(String nextPlanTime) {
        this.nextPlanTime = nextPlanTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobResultV2 that = (JobResultV2) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.lastInstanceStatus, that.lastInstanceStatus)
            && Objects.equals(this.lastInstanceEndTime, that.lastInstanceEndTime)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.lastUpdateUser, that.lastUpdateUser)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.flinkJobInfo, that.flinkJobInfo)
            && Objects.equals(this.path, that.path) && Objects.equals(this.singleNodeJobFlag, that.singleNodeJobFlag)
            && Objects.equals(this.alarms, that.alarms) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.singleNodeJobType, that.singleNodeJobType)
            && Objects.equals(this.emptyRunningJob, that.emptyRunningJob)
            && Objects.equals(this.nextPlanTime, that.nextPlanTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            jobType,
            status,
            createUser,
            createTime,
            startTime,
            endTime,
            lastInstanceStatus,
            lastInstanceEndTime,
            owner,
            lastUpdateUser,
            priority,
            flinkJobInfo,
            path,
            singleNodeJobFlag,
            alarms,
            lastUpdateTime,
            singleNodeJobType,
            emptyRunningJob,
            nextPlanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobResultV2 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    lastInstanceStatus: ").append(toIndentedString(lastInstanceStatus)).append("\n");
        sb.append("    lastInstanceEndTime: ").append(toIndentedString(lastInstanceEndTime)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    lastUpdateUser: ").append(toIndentedString(lastUpdateUser)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    flinkJobInfo: ").append(toIndentedString(flinkJobInfo)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    singleNodeJobFlag: ").append(toIndentedString(singleNodeJobFlag)).append("\n");
        sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    singleNodeJobType: ").append(toIndentedString(singleNodeJobType)).append("\n");
        sb.append("    emptyRunningJob: ").append(toIndentedString(emptyRunningJob)).append("\n");
        sb.append("    nextPlanTime: ").append(toIndentedString(nextPlanTime)).append("\n");
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
