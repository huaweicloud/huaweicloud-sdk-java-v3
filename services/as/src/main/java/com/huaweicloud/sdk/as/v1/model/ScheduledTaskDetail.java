package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ScheduledTaskDetail
 */
public class ScheduledTaskDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_group_id")

    private String scalingGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_policy")

    private ScheduledTaskPolicy scheduledPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_number")

    private IntegerRange instanceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public ScheduledTaskDetail withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 计划任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ScheduledTaskDetail withScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }

    /**
     * 伸缩组ID
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public ScheduledTaskDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScheduledTaskDetail withScheduledPolicy(ScheduledTaskPolicy scheduledPolicy) {
        this.scheduledPolicy = scheduledPolicy;
        return this;
    }

    public ScheduledTaskDetail withScheduledPolicy(Consumer<ScheduledTaskPolicy> scheduledPolicySetter) {
        if (this.scheduledPolicy == null) {
            this.scheduledPolicy = new ScheduledTaskPolicy();
            scheduledPolicySetter.accept(this.scheduledPolicy);
        }

        return this;
    }

    /**
     * Get scheduledPolicy
     * @return scheduledPolicy
     */
    public ScheduledTaskPolicy getScheduledPolicy() {
        return scheduledPolicy;
    }

    public void setScheduledPolicy(ScheduledTaskPolicy scheduledPolicy) {
        this.scheduledPolicy = scheduledPolicy;
    }

    public ScheduledTaskDetail withInstanceNumber(IntegerRange instanceNumber) {
        this.instanceNumber = instanceNumber;
        return this;
    }

    public ScheduledTaskDetail withInstanceNumber(Consumer<IntegerRange> instanceNumberSetter) {
        if (this.instanceNumber == null) {
            this.instanceNumber = new IntegerRange();
            instanceNumberSetter.accept(this.instanceNumber);
        }

        return this;
    }

    /**
     * Get instanceNumber
     * @return instanceNumber
     */
    public IntegerRange getInstanceNumber() {
        return instanceNumber;
    }

    public void setInstanceNumber(IntegerRange instanceNumber) {
        this.instanceNumber = instanceNumber;
    }

    public ScheduledTaskDetail withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ScheduledTaskDetail withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ScheduledTaskDetail withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ScheduledTaskDetail withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduledTaskDetail that = (ScheduledTaskDetail) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.scalingGroupId, that.scalingGroupId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.scheduledPolicy, that.scheduledPolicy)
            && Objects.equals(this.instanceNumber, that.instanceNumber)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            scalingGroupId,
            name,
            scheduledPolicy,
            instanceNumber,
            createTime,
            tenantId,
            domainId,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduledTaskDetail {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scheduledPolicy: ").append(toIndentedString(scheduledPolicy)).append("\n");
        sb.append("    instanceNumber: ").append(toIndentedString(instanceNumber)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
