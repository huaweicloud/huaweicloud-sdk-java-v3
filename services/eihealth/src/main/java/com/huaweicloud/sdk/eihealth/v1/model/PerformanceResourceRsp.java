package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PerformanceResourceRsp
 */
public class PerformanceResourceRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private SpecDto spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private String availabilityZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space")

    private Integer space;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_space")

    private Double freeSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_job_count")

    private Integer runningJobCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_quota")

    private Integer jobQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_reason")

    private String failureReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedulable")

    private Boolean schedulable;

    public PerformanceResourceRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PerformanceResourceRsp withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public PerformanceResourceRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PerformanceResourceRsp withSpec(SpecDto spec) {
        this.spec = spec;
        return this;
    }

    public PerformanceResourceRsp withSpec(Consumer<SpecDto> specSetter) {
        if (this.spec == null) {
            this.spec = new SpecDto();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public SpecDto getSpec() {
        return spec;
    }

    public void setSpec(SpecDto spec) {
        this.spec = spec;
    }

    public PerformanceResourceRsp withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * 可用区
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public PerformanceResourceRsp withSpace(Integer space) {
        this.space = space;
        return this;
    }

    /**
     * 最大容量, 单位GB
     * @return space
     */
    public Integer getSpace() {
        return space;
    }

    public void setSpace(Integer space) {
        this.space = space;
    }

    public PerformanceResourceRsp withFreeSpace(Double freeSpace) {
        this.freeSpace = freeSpace;
        return this;
    }

    /**
     * 可用容量，单位GB
     * @return freeSpace
     */
    public Double getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(Double freeSpace) {
        this.freeSpace = freeSpace;
    }

    public PerformanceResourceRsp withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public PerformanceResourceRsp withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 购买周期
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public PerformanceResourceRsp withRunningJobCount(Integer runningJobCount) {
        this.runningJobCount = runningJobCount;
        return this;
    }

    /**
     * 作业运行数
     * @return runningJobCount
     */
    public Integer getRunningJobCount() {
        return runningJobCount;
    }

    public void setRunningJobCount(Integer runningJobCount) {
        this.runningJobCount = runningJobCount;
    }

    public PerformanceResourceRsp withJobQuota(Integer jobQuota) {
        this.jobQuota = jobQuota;
        return this;
    }

    /**
     * 运行的最大作业数量
     * @return jobQuota
     */
    public Integer getJobQuota() {
        return jobQuota;
    }

    public void setJobQuota(Integer jobQuota) {
        this.jobQuota = jobQuota;
    }

    public PerformanceResourceRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 购买时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public PerformanceResourceRsp withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * 失败原因
     * @return failureReason
     */
    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public PerformanceResourceRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PerformanceResourceRsp withSchedulable(Boolean schedulable) {
        this.schedulable = schedulable;
        return this;
    }

    /**
     * 资源是否可调度
     * @return schedulable
     */
    public Boolean getSchedulable() {
        return schedulable;
    }

    public void setSchedulable(Boolean schedulable) {
        this.schedulable = schedulable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PerformanceResourceRsp that = (PerformanceResourceRsp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.availabilityZoneId, that.availabilityZoneId)
            && Objects.equals(this.space, that.space) && Objects.equals(this.freeSpace, that.freeSpace)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.runningJobCount, that.runningJobCount)
            && Objects.equals(this.jobQuota, that.jobQuota) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.failureReason, that.failureReason) && Objects.equals(this.status, that.status)
            && Objects.equals(this.schedulable, that.schedulable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            resourceId,
            name,
            spec,
            availabilityZoneId,
            space,
            freeSpace,
            chargeMode,
            periodNum,
            runningJobCount,
            jobQuota,
            createTime,
            failureReason,
            status,
            schedulable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PerformanceResourceRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    space: ").append(toIndentedString(space)).append("\n");
        sb.append("    freeSpace: ").append(toIndentedString(freeSpace)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    runningJobCount: ").append(toIndentedString(runningJobCount)).append("\n");
        sb.append("    jobQuota: ").append(toIndentedString(jobQuota)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    schedulable: ").append(toIndentedString(schedulable)).append("\n");
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
