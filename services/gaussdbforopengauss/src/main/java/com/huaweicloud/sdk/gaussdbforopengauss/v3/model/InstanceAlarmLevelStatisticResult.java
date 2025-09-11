package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceAlarmLevelStatisticResult
 */
public class InstanceAlarmLevelStatisticResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level_statistics")

    private List<AlarmLevelStatisticsResult> alarmLevelStatistics = null;

    public InstanceAlarmLevelStatisticResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 实例ID。 **取值范围**: 只能由英文字母、数字组成，且长度为36个字符。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceAlarmLevelStatisticResult withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释**: 实例名称。 **取值范围**: 不涉及。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public InstanceAlarmLevelStatisticResult withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 告警总数。 **取值范围**: 不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public InstanceAlarmLevelStatisticResult withAlarmLevelStatistics(
        List<AlarmLevelStatisticsResult> alarmLevelStatistics) {
        this.alarmLevelStatistics = alarmLevelStatistics;
        return this;
    }

    public InstanceAlarmLevelStatisticResult addAlarmLevelStatisticsItem(
        AlarmLevelStatisticsResult alarmLevelStatisticsItem) {
        if (this.alarmLevelStatistics == null) {
            this.alarmLevelStatistics = new ArrayList<>();
        }
        this.alarmLevelStatistics.add(alarmLevelStatisticsItem);
        return this;
    }

    public InstanceAlarmLevelStatisticResult withAlarmLevelStatistics(
        Consumer<List<AlarmLevelStatisticsResult>> alarmLevelStatisticsSetter) {
        if (this.alarmLevelStatistics == null) {
            this.alarmLevelStatistics = new ArrayList<>();
        }
        alarmLevelStatisticsSetter.accept(this.alarmLevelStatistics);
        return this;
    }

    /**
     * **参数解释**: 实例级别的各等级告警数量统计。
     * @return alarmLevelStatistics
     */
    public List<AlarmLevelStatisticsResult> getAlarmLevelStatistics() {
        return alarmLevelStatistics;
    }

    public void setAlarmLevelStatistics(List<AlarmLevelStatisticsResult> alarmLevelStatistics) {
        this.alarmLevelStatistics = alarmLevelStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceAlarmLevelStatisticResult that = (InstanceAlarmLevelStatisticResult) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.alarmLevelStatistics, that.alarmLevelStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, totalCount, alarmLevelStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceAlarmLevelStatisticResult {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    alarmLevelStatistics: ").append(toIndentedString(alarmLevelStatistics)).append("\n");
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
