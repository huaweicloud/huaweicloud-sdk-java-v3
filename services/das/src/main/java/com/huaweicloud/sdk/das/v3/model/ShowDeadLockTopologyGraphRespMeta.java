package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 死锁概况
 */
public class ShowDeadLockTopologyGraphRespMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_lock_id")

    private String deadLockId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occur_time")

    private Long occurTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_transactions_in_cycle")

    private Integer totalTransactionsInCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_transactions_returned")

    private Long totalTransactionsReturned;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "truncated")

    private Boolean truncated;

    public ShowDeadLockTopologyGraphRespMeta withDeadLockId(String deadLockId) {
        this.deadLockId = deadLockId;
        return this;
    }

    /**
     * 死锁唯一标识
     * @return deadLockId
     */
    public String getDeadLockId() {
        return deadLockId;
    }

    public void setDeadLockId(String deadLockId) {
        this.deadLockId = deadLockId;
    }

    public ShowDeadLockTopologyGraphRespMeta withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowDeadLockTopologyGraphRespMeta withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowDeadLockTopologyGraphRespMeta withOccurTime(Long occurTime) {
        this.occurTime = occurTime;
        return this;
    }

    /**
     * 死锁的发生时间，Unix 毫秒时间戳
     * @return occurTime
     */
    public Long getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Long occurTime) {
        this.occurTime = occurTime;
    }

    public ShowDeadLockTopologyGraphRespMeta withTotalTransactionsInCycle(Integer totalTransactionsInCycle) {
        this.totalTransactionsInCycle = totalTransactionsInCycle;
        return this;
    }

    /**
     * 死锁的事务总数
     * @return totalTransactionsInCycle
     */
    public Integer getTotalTransactionsInCycle() {
        return totalTransactionsInCycle;
    }

    public void setTotalTransactionsInCycle(Integer totalTransactionsInCycle) {
        this.totalTransactionsInCycle = totalTransactionsInCycle;
    }

    public ShowDeadLockTopologyGraphRespMeta withTotalTransactionsReturned(Long totalTransactionsReturned) {
        this.totalTransactionsReturned = totalTransactionsReturned;
        return this;
    }

    /**
     * 本次实际返回的事务数
     * @return totalTransactionsReturned
     */
    public Long getTotalTransactionsReturned() {
        return totalTransactionsReturned;
    }

    public void setTotalTransactionsReturned(Long totalTransactionsReturned) {
        this.totalTransactionsReturned = totalTransactionsReturned;
    }

    public ShowDeadLockTopologyGraphRespMeta withTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    /**
     * 是否裁剪（>10 事务只返回 10 个）
     * @return truncated
     */
    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeadLockTopologyGraphRespMeta that = (ShowDeadLockTopologyGraphRespMeta) obj;
        return Objects.equals(this.deadLockId, that.deadLockId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.occurTime, that.occurTime)
            && Objects.equals(this.totalTransactionsInCycle, that.totalTransactionsInCycle)
            && Objects.equals(this.totalTransactionsReturned, that.totalTransactionsReturned)
            && Objects.equals(this.truncated, that.truncated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deadLockId,
            instanceId,
            projectId,
            occurTime,
            totalTransactionsInCycle,
            totalTransactionsReturned,
            truncated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeadLockTopologyGraphRespMeta {\n");
        sb.append("    deadLockId: ").append(toIndentedString(deadLockId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    occurTime: ").append(toIndentedString(occurTime)).append("\n");
        sb.append("    totalTransactionsInCycle: ").append(toIndentedString(totalTransactionsInCycle)).append("\n");
        sb.append("    totalTransactionsReturned: ").append(toIndentedString(totalTransactionsReturned)).append("\n");
        sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
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
