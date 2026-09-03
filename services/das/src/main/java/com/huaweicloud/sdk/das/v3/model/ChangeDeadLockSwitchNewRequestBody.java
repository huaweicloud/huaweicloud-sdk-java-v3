package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改死锁开关请求体
 */
public class ChangeDeadLockSwitchNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_on")

    private Boolean switchOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_hours")

    private Integer retentionHours;

    public ChangeDeadLockSwitchNewRequestBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库引擎类型，取值范围：mysql
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public ChangeDeadLockSwitchNewRequestBody withSwitchOn(Boolean switchOn) {
        this.switchOn = switchOn;
        return this;
    }

    /**
     * 开关状态，取值范围：false（关闭）、true（开启）
     * @return switchOn
     */
    public Boolean getSwitchOn() {
        return switchOn;
    }

    public void setSwitchOn(Boolean switchOn) {
        this.switchOn = switchOn;
    }

    public ChangeDeadLockSwitchNewRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，实例的唯一标识
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ChangeDeadLockSwitchNewRequestBody withRetentionHours(Integer retentionHours) {
        this.retentionHours = retentionHours;
        return this;
    }

    /**
     * 保存时长
     * @return retentionHours
     */
    public Integer getRetentionHours() {
        return retentionHours;
    }

    public void setRetentionHours(Integer retentionHours) {
        this.retentionHours = retentionHours;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeDeadLockSwitchNewRequestBody that = (ChangeDeadLockSwitchNewRequestBody) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.switchOn, that.switchOn)
            && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.retentionHours, that.retentionHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, switchOn, instanceId, retentionHours);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeDeadLockSwitchNewRequestBody {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    switchOn: ").append(toIndentedString(switchOn)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    retentionHours: ").append(toIndentedString(retentionHours)).append("\n");
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
