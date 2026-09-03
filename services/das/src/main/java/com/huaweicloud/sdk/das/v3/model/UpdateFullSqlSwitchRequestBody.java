package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 全量SQL开关请求体
 */
public class UpdateFullSqlSwitchRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_switch")

    private Integer openSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_hours")

    private Long retentionHours;

    public UpdateFullSqlSwitchRequestBody withInstanceId(String instanceId) {
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

    public UpdateFullSqlSwitchRequestBody withOpenSwitch(Integer openSwitch) {
        this.openSwitch = openSwitch;
        return this;
    }

    /**
     * 开关。取值范围：1（开启）、0（关闭）
     * @return openSwitch
     */
    public Integer getOpenSwitch() {
        return openSwitch;
    }

    public void setOpenSwitch(Integer openSwitch) {
        this.openSwitch = openSwitch;
    }

    public UpdateFullSqlSwitchRequestBody withEngineType(String engineType) {
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

    public UpdateFullSqlSwitchRequestBody withRetentionHours(Long retentionHours) {
        this.retentionHours = retentionHours;
        return this;
    }

    /**
     * 保存时长
     * @return retentionHours
     */
    public Long getRetentionHours() {
        return retentionHours;
    }

    public void setRetentionHours(Long retentionHours) {
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
        UpdateFullSqlSwitchRequestBody that = (UpdateFullSqlSwitchRequestBody) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.openSwitch, that.openSwitch)
            && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.retentionHours, that.retentionHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, openSwitch, engineType, retentionHours);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFullSqlSwitchRequestBody {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    openSwitch: ").append(toIndentedString(openSwitch)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
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
