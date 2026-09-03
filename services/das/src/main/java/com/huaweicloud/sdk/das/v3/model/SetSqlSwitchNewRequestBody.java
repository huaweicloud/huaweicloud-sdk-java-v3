package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置SQL开关请求体
 */
public class SetSqlSwitchNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sql_switch_on")

    private Boolean fullSqlSwitchOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sql_retention_hours")

    private Long fullSqlRetentionHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sql_switch_on")

    private Boolean slowSqlSwitchOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sql_retention_hours")

    private Long slowSqlRetentionHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_lock_switch_on")

    private Boolean deadLockSwitchOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_lock_retention_hours")

    private Long deadLockRetentionHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_blocking_switch_on")

    private Boolean lockBlockingSwitchOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_blocking_retention_hours")

    private Long lockBlockingRetentionHours;

    public SetSqlSwitchNewRequestBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public SetSqlSwitchNewRequestBody withInstanceId(String instanceId) {
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

    public SetSqlSwitchNewRequestBody withFullSqlSwitchOn(Boolean fullSqlSwitchOn) {
        this.fullSqlSwitchOn = fullSqlSwitchOn;
        return this;
    }

    /**
     * 全量SQL开关
     * @return fullSqlSwitchOn
     */
    public Boolean getFullSqlSwitchOn() {
        return fullSqlSwitchOn;
    }

    public void setFullSqlSwitchOn(Boolean fullSqlSwitchOn) {
        this.fullSqlSwitchOn = fullSqlSwitchOn;
    }

    public SetSqlSwitchNewRequestBody withFullSqlRetentionHours(Long fullSqlRetentionHours) {
        this.fullSqlRetentionHours = fullSqlRetentionHours;
        return this;
    }

    /**
     * 全量SQL存储时长
     * @return fullSqlRetentionHours
     */
    public Long getFullSqlRetentionHours() {
        return fullSqlRetentionHours;
    }

    public void setFullSqlRetentionHours(Long fullSqlRetentionHours) {
        this.fullSqlRetentionHours = fullSqlRetentionHours;
    }

    public SetSqlSwitchNewRequestBody withSlowSqlSwitchOn(Boolean slowSqlSwitchOn) {
        this.slowSqlSwitchOn = slowSqlSwitchOn;
        return this;
    }

    /**
     * 慢SQL开关
     * @return slowSqlSwitchOn
     */
    public Boolean getSlowSqlSwitchOn() {
        return slowSqlSwitchOn;
    }

    public void setSlowSqlSwitchOn(Boolean slowSqlSwitchOn) {
        this.slowSqlSwitchOn = slowSqlSwitchOn;
    }

    public SetSqlSwitchNewRequestBody withSlowSqlRetentionHours(Long slowSqlRetentionHours) {
        this.slowSqlRetentionHours = slowSqlRetentionHours;
        return this;
    }

    /**
     * 慢SQL存储时长
     * @return slowSqlRetentionHours
     */
    public Long getSlowSqlRetentionHours() {
        return slowSqlRetentionHours;
    }

    public void setSlowSqlRetentionHours(Long slowSqlRetentionHours) {
        this.slowSqlRetentionHours = slowSqlRetentionHours;
    }

    public SetSqlSwitchNewRequestBody withDeadLockSwitchOn(Boolean deadLockSwitchOn) {
        this.deadLockSwitchOn = deadLockSwitchOn;
        return this;
    }

    /**
     * 死锁开关
     * @return deadLockSwitchOn
     */
    public Boolean getDeadLockSwitchOn() {
        return deadLockSwitchOn;
    }

    public void setDeadLockSwitchOn(Boolean deadLockSwitchOn) {
        this.deadLockSwitchOn = deadLockSwitchOn;
    }

    public SetSqlSwitchNewRequestBody withDeadLockRetentionHours(Long deadLockRetentionHours) {
        this.deadLockRetentionHours = deadLockRetentionHours;
        return this;
    }

    /**
     * 死锁存储时长
     * @return deadLockRetentionHours
     */
    public Long getDeadLockRetentionHours() {
        return deadLockRetentionHours;
    }

    public void setDeadLockRetentionHours(Long deadLockRetentionHours) {
        this.deadLockRetentionHours = deadLockRetentionHours;
    }

    public SetSqlSwitchNewRequestBody withLockBlockingSwitchOn(Boolean lockBlockingSwitchOn) {
        this.lockBlockingSwitchOn = lockBlockingSwitchOn;
        return this;
    }

    /**
     * 锁等待开关
     * @return lockBlockingSwitchOn
     */
    public Boolean getLockBlockingSwitchOn() {
        return lockBlockingSwitchOn;
    }

    public void setLockBlockingSwitchOn(Boolean lockBlockingSwitchOn) {
        this.lockBlockingSwitchOn = lockBlockingSwitchOn;
    }

    public SetSqlSwitchNewRequestBody withLockBlockingRetentionHours(Long lockBlockingRetentionHours) {
        this.lockBlockingRetentionHours = lockBlockingRetentionHours;
        return this;
    }

    /**
     * 锁等待存储时长
     * @return lockBlockingRetentionHours
     */
    public Long getLockBlockingRetentionHours() {
        return lockBlockingRetentionHours;
    }

    public void setLockBlockingRetentionHours(Long lockBlockingRetentionHours) {
        this.lockBlockingRetentionHours = lockBlockingRetentionHours;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetSqlSwitchNewRequestBody that = (SetSqlSwitchNewRequestBody) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.fullSqlSwitchOn, that.fullSqlSwitchOn)
            && Objects.equals(this.fullSqlRetentionHours, that.fullSqlRetentionHours)
            && Objects.equals(this.slowSqlSwitchOn, that.slowSqlSwitchOn)
            && Objects.equals(this.slowSqlRetentionHours, that.slowSqlRetentionHours)
            && Objects.equals(this.deadLockSwitchOn, that.deadLockSwitchOn)
            && Objects.equals(this.deadLockRetentionHours, that.deadLockRetentionHours)
            && Objects.equals(this.lockBlockingSwitchOn, that.lockBlockingSwitchOn)
            && Objects.equals(this.lockBlockingRetentionHours, that.lockBlockingRetentionHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType,
            instanceId,
            fullSqlSwitchOn,
            fullSqlRetentionHours,
            slowSqlSwitchOn,
            slowSqlRetentionHours,
            deadLockSwitchOn,
            deadLockRetentionHours,
            lockBlockingSwitchOn,
            lockBlockingRetentionHours);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetSqlSwitchNewRequestBody {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    fullSqlSwitchOn: ").append(toIndentedString(fullSqlSwitchOn)).append("\n");
        sb.append("    fullSqlRetentionHours: ").append(toIndentedString(fullSqlRetentionHours)).append("\n");
        sb.append("    slowSqlSwitchOn: ").append(toIndentedString(slowSqlSwitchOn)).append("\n");
        sb.append("    slowSqlRetentionHours: ").append(toIndentedString(slowSqlRetentionHours)).append("\n");
        sb.append("    deadLockSwitchOn: ").append(toIndentedString(deadLockSwitchOn)).append("\n");
        sb.append("    deadLockRetentionHours: ").append(toIndentedString(deadLockRetentionHours)).append("\n");
        sb.append("    lockBlockingSwitchOn: ").append(toIndentedString(lockBlockingSwitchOn)).append("\n");
        sb.append("    lockBlockingRetentionHours: ").append(toIndentedString(lockBlockingRetentionHours)).append("\n");
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
