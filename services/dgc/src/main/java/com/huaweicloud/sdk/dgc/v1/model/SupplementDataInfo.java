package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SupplementDataInfo
 */
public class SupplementDataInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobName")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startDate")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endDate")

    private String endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel")

    private Integer parallel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependJobs")

    private List<JobInfo> dependJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isDayGranularity")

    private Boolean isDayGranularity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_stop_when_fail")

    private Boolean isStopWhenFail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverseOrder")

    private Integer reverseOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force")

    private String force;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supplement_data_run_time")

    private SupplementDataInfoSupplementDataRunTime supplementDataRunTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supplement_data_instance_time")

    private SupplementDataInfoSupplementDataInstanceTime supplementDataInstanceTime;

    public SupplementDataInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 补数据实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SupplementDataInfo withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 补数据依赖的作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public SupplementDataInfo withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 补数据开始时间
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public SupplementDataInfo withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 补数据结束时间
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public SupplementDataInfo withParallel(Integer parallel) {
        this.parallel = parallel;
        return this;
    }

    /**
     * 并行周期数
     * @return parallel
     */
    public Integer getParallel() {
        return parallel;
    }

    public void setParallel(Integer parallel) {
        this.parallel = parallel;
    }

    public SupplementDataInfo withDependJobs(List<JobInfo> dependJobs) {
        this.dependJobs = dependJobs;
        return this;
    }

    public SupplementDataInfo addDependJobsItem(JobInfo dependJobsItem) {
        if (this.dependJobs == null) {
            this.dependJobs = new ArrayList<>();
        }
        this.dependJobs.add(dependJobsItem);
        return this;
    }

    public SupplementDataInfo withDependJobs(Consumer<List<JobInfo>> dependJobsSetter) {
        if (this.dependJobs == null) {
            this.dependJobs = new ArrayList<>();
        }
        dependJobsSetter.accept(this.dependJobs);
        return this;
    }

    /**
     * 依赖的作业信息
     * @return dependJobs
     */
    public List<JobInfo> getDependJobs() {
        return dependJobs;
    }

    public void setDependJobs(List<JobInfo> dependJobs) {
        this.dependJobs = dependJobs;
    }

    public SupplementDataInfo withIsDayGranularity(Boolean isDayGranularity) {
        this.isDayGranularity = isDayGranularity;
        return this;
    }

    /**
     * 是否按天粒度补数据
     * @return isDayGranularity
     */
    public Boolean getIsDayGranularity() {
        return isDayGranularity;
    }

    public void setIsDayGranularity(Boolean isDayGranularity) {
        this.isDayGranularity = isDayGranularity;
    }

    public SupplementDataInfo withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public SupplementDataInfo withIsStopWhenFail(Boolean isStopWhenFail) {
        this.isStopWhenFail = isStopWhenFail;
        return this;
    }

    /**
     * 失败时作业是否停止
     * @return isStopWhenFail
     */
    public Boolean getIsStopWhenFail() {
        return isStopWhenFail;
    }

    public void setIsStopWhenFail(Boolean isStopWhenFail) {
        this.isStopWhenFail = isStopWhenFail;
    }

    public SupplementDataInfo withReverseOrder(Integer reverseOrder) {
        this.reverseOrder = reverseOrder;
        return this;
    }

    /**
     * 按照时间倒序补跑
     * @return reverseOrder
     */
    public Integer getReverseOrder() {
        return reverseOrder;
    }

    public void setReverseOrder(Integer reverseOrder) {
        this.reverseOrder = reverseOrder;
    }

    public SupplementDataInfo withForce(String force) {
        this.force = force;
        return this;
    }

    /**
     * 当前有补数据实例在运行时，是否强制补数据
     * @return force
     */
    public String getForce() {
        return force;
    }

    public void setForce(String force) {
        this.force = force;
    }

    public SupplementDataInfo withSupplementDataRunTime(SupplementDataInfoSupplementDataRunTime supplementDataRunTime) {
        this.supplementDataRunTime = supplementDataRunTime;
        return this;
    }

    public SupplementDataInfo withSupplementDataRunTime(
        Consumer<SupplementDataInfoSupplementDataRunTime> supplementDataRunTimeSetter) {
        if (this.supplementDataRunTime == null) {
            this.supplementDataRunTime = new SupplementDataInfoSupplementDataRunTime();
            supplementDataRunTimeSetter.accept(this.supplementDataRunTime);
        }

        return this;
    }

    /**
     * Get supplementDataRunTime
     * @return supplementDataRunTime
     */
    public SupplementDataInfoSupplementDataRunTime getSupplementDataRunTime() {
        return supplementDataRunTime;
    }

    public void setSupplementDataRunTime(SupplementDataInfoSupplementDataRunTime supplementDataRunTime) {
        this.supplementDataRunTime = supplementDataRunTime;
    }

    public SupplementDataInfo withSupplementDataInstanceTime(
        SupplementDataInfoSupplementDataInstanceTime supplementDataInstanceTime) {
        this.supplementDataInstanceTime = supplementDataInstanceTime;
        return this;
    }

    public SupplementDataInfo withSupplementDataInstanceTime(
        Consumer<SupplementDataInfoSupplementDataInstanceTime> supplementDataInstanceTimeSetter) {
        if (this.supplementDataInstanceTime == null) {
            this.supplementDataInstanceTime = new SupplementDataInfoSupplementDataInstanceTime();
            supplementDataInstanceTimeSetter.accept(this.supplementDataInstanceTime);
        }

        return this;
    }

    /**
     * Get supplementDataInstanceTime
     * @return supplementDataInstanceTime
     */
    public SupplementDataInfoSupplementDataInstanceTime getSupplementDataInstanceTime() {
        return supplementDataInstanceTime;
    }

    public void setSupplementDataInstanceTime(SupplementDataInfoSupplementDataInstanceTime supplementDataInstanceTime) {
        this.supplementDataInstanceTime = supplementDataInstanceTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupplementDataInfo that = (SupplementDataInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.endDate, that.endDate)
            && Objects.equals(this.parallel, that.parallel) && Objects.equals(this.dependJobs, that.dependJobs)
            && Objects.equals(this.isDayGranularity, that.isDayGranularity)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.isStopWhenFail, that.isStopWhenFail)
            && Objects.equals(this.reverseOrder, that.reverseOrder) && Objects.equals(this.force, that.force)
            && Objects.equals(this.supplementDataRunTime, that.supplementDataRunTime)
            && Objects.equals(this.supplementDataInstanceTime, that.supplementDataInstanceTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            jobName,
            startDate,
            endDate,
            parallel,
            dependJobs,
            isDayGranularity,
            priority,
            isStopWhenFail,
            reverseOrder,
            force,
            supplementDataRunTime,
            supplementDataInstanceTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupplementDataInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
        sb.append("    dependJobs: ").append(toIndentedString(dependJobs)).append("\n");
        sb.append("    isDayGranularity: ").append(toIndentedString(isDayGranularity)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    isStopWhenFail: ").append(toIndentedString(isStopWhenFail)).append("\n");
        sb.append("    reverseOrder: ").append(toIndentedString(reverseOrder)).append("\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
        sb.append("    supplementDataRunTime: ").append(toIndentedString(supplementDataRunTime)).append("\n");
        sb.append("    supplementDataInstanceTime: ").append(toIndentedString(supplementDataInstanceTime)).append("\n");
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
