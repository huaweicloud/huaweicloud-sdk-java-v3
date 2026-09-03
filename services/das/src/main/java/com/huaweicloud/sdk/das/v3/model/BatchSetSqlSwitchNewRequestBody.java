package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量设置SQL开关请求体
 */
public class BatchSetSqlSwitchNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_on")

    private Boolean switchOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_type")

    private String switchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_hours")

    private Long retentionHours;

    public BatchSetSqlSwitchNewRequestBody withSwitchOn(Boolean switchOn) {
        this.switchOn = switchOn;
        return this;
    }

    /**
     * 是否开启
     * @return switchOn
     */
    public Boolean getSwitchOn() {
        return switchOn;
    }

    public void setSwitchOn(Boolean switchOn) {
        this.switchOn = switchOn;
    }

    public BatchSetSqlSwitchNewRequestBody withEngineType(String engineType) {
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

    public BatchSetSqlSwitchNewRequestBody withSwitchType(String switchType) {
        this.switchType = switchType;
        return this;
    }

    /**
     * 设置开关的类型，取值范围：fullsql、slowsql
     * @return switchType
     */
    public String getSwitchType() {
        return switchType;
    }

    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }

    public BatchSetSqlSwitchNewRequestBody withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public BatchSetSqlSwitchNewRequestBody addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public BatchSetSqlSwitchNewRequestBody withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 实例ID列表
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public BatchSetSqlSwitchNewRequestBody withRetentionHours(Long retentionHours) {
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
        BatchSetSqlSwitchNewRequestBody that = (BatchSetSqlSwitchNewRequestBody) obj;
        return Objects.equals(this.switchOn, that.switchOn) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.switchType, that.switchType) && Objects.equals(this.instanceIds, that.instanceIds)
            && Objects.equals(this.retentionHours, that.retentionHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchOn, engineType, switchType, instanceIds, retentionHours);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetSqlSwitchNewRequestBody {\n");
        sb.append("    switchOn: ").append(toIndentedString(switchOn)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    switchType: ").append(toIndentedString(switchType)).append("\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
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
