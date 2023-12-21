package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 状态信息。
 */
public class InstanceDetailStatusInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_instance_status")

    private String createInstanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_description")

    private String instanceDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    public InstanceDetailStatusInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 云堡垒机实例状态。 - SHUTOFF：已关闭 - ACTIVE：运行中 - DELETING：删除中 - BUILD：创建中 - DELETED：已删除 - ERROR：故障 - HAWAIT：等待备机创建成功 - FROZEN：已冻结 - UPGRADING：升级中 - UNPAID：待支付 - RESIZE：规格变更中 - DILATATION：扩容中 - HA：配置HA中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceDetailStatusInfo withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 云堡垒机实例当前的任务状态。 - powering-on：开启 - powering-off：关闭 - rebooting：重启 - delete_wait：删除 - frozen：冻结 - NO_TASK：运行 - unfrozen：解冻 - alter：变更 - updating：升级中 - configuring-ha：配置HA - data-migrating：数据迁移中 - rollback：版本回滚中 - traffic-switchover：流量切换中
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public InstanceDetailStatusInfo withCreateInstanceStatus(String createInstanceStatus) {
        this.createInstanceStatus = createInstanceStatus;
        return this;
    }

    /**
     * 云堡垒机实例在创建实例过程中的状态信息。 - Waiting for payment：等待支付 - creating-network：创建网络 - creating-server：创建服务 - tranfering-horizontal-network：网络打通 - adding-policy-route：添加路由策略 - configing-dns：配置DNS - starting-cbs-service：服务运行中 - setting-init-conf：初始化 - buying-EIP：购买弹性公网IP
     * @return createInstanceStatus
     */
    public String getCreateInstanceStatus() {
        return createInstanceStatus;
    }

    public void setCreateInstanceStatus(String createInstanceStatus) {
        this.createInstanceStatus = createInstanceStatus;
    }

    public InstanceDetailStatusInfo withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * 云堡垒机实例状态。 - building：创建中 - deleting：删除中 - deleted：删除了 - unpaid：未支付 - upgrading：升级中 - resizing：扩容中 - abnormal：异常 - error：故障 - ok：正常
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public InstanceDetailStatusInfo withInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }

    /**
     * 云堡垒机实例信息描述。
     * @return instanceDescription
     */
    public String getInstanceDescription() {
        return instanceDescription;
    }

    public void setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
    }

    public InstanceDetailStatusInfo withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 云堡垒机实例创建实例失败原因。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDetailStatusInfo that = (InstanceDetailStatusInfo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.taskStatus, that.taskStatus)
            && Objects.equals(this.createInstanceStatus, that.createInstanceStatus)
            && Objects.equals(this.instanceStatus, that.instanceStatus)
            && Objects.equals(this.instanceDescription, that.instanceDescription)
            && Objects.equals(this.failReason, that.failReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, taskStatus, createInstanceStatus, instanceStatus, instanceDescription, failReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDetailStatusInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    createInstanceStatus: ").append(toIndentedString(createInstanceStatus)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    instanceDescription: ").append(toIndentedString(instanceDescription)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
