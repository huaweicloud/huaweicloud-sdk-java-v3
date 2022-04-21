package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 告警历史详细信息
 */
public class AlarmHistoryItemV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_enabled")

    private Boolean actionEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private OffsetDateTime beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private Metric metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private AlarmCondition condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_info")

    private AdditionalInfo additionalInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_actions")

    private List<SMNAction> alarmActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok_actions")

    private List<SMNAction> okActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_points")

    private List<Object> dataPoints = null;

    public AlarmHistoryItemV2 withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * 告警历史ID
     * @return recordId
     */
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public AlarmHistoryItemV2 withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * 告警规则的ID，如：al1603131199286dzxpqK3Ez。
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public AlarmHistoryItemV2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 告警规则的名称，如：alarm-test01。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlarmHistoryItemV2 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 告警历史的状态，取值为ok，alarm，insufficient_data； ok为正常，alarm为告警，insufficient_data数据不足。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AlarmHistoryItemV2 withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 告警历史的告警级别，值为1,2,3,4；1为紧急，2为重要，3为次要，4为提示。
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public AlarmHistoryItemV2 withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 告警类型； 仅针对事件告警的参数，枚举类型：值为EVENT.SYS或者EVENT.CUSTOM
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AlarmHistoryItemV2 withActionEnabled(Boolean actionEnabled) {
        this.actionEnabled = actionEnabled;
        return this;
    }

    /**
     * 是否发送通知，值为true或者false。
     * @return actionEnabled
     */
    public Boolean getActionEnabled() {
        return actionEnabled;
    }

    public void setActionEnabled(Boolean actionEnabled) {
        this.actionEnabled = actionEnabled;
    }

    public AlarmHistoryItemV2 withBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 产生时间,UTC时间
     * @return beginTime
     */
    public OffsetDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public AlarmHistoryItemV2 withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，UTC时间
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public AlarmHistoryItemV2 withMetric(Metric metric) {
        this.metric = metric;
        return this;
    }

    public AlarmHistoryItemV2 withMetric(Consumer<Metric> metricSetter) {
        if (this.metric == null) {
            this.metric = new Metric();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public Metric getMetric() {
        return metric;
    }

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    public AlarmHistoryItemV2 withCondition(AlarmCondition condition) {
        this.condition = condition;
        return this;
    }

    public AlarmHistoryItemV2 withCondition(Consumer<AlarmCondition> conditionSetter) {
        if (this.condition == null) {
            this.condition = new AlarmCondition();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public AlarmCondition getCondition() {
        return condition;
    }

    public void setCondition(AlarmCondition condition) {
        this.condition = condition;
    }

    public AlarmHistoryItemV2 withAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public AlarmHistoryItemV2 withAdditionalInfo(Consumer<AdditionalInfo> additionalInfoSetter) {
        if (this.additionalInfo == null) {
            this.additionalInfo = new AdditionalInfo();
            additionalInfoSetter.accept(this.additionalInfo);
        }

        return this;
    }

    /**
     * Get additionalInfo
     * @return additionalInfo
     */
    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public AlarmHistoryItemV2 withAlarmActions(List<SMNAction> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    public AlarmHistoryItemV2 addAlarmActionsItem(SMNAction alarmActionsItem) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        this.alarmActions.add(alarmActionsItem);
        return this;
    }

    public AlarmHistoryItemV2 withAlarmActions(Consumer<List<SMNAction>> alarmActionsSetter) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        alarmActionsSetter.accept(this.alarmActions);
        return this;
    }

    /**
     * 告警触发的动作。  结构如下：  {  \"type\": \"notification\", \"notificationList\": [\"urn:smn:southchina:68438a86d98e427e907e0097b7e35d47:sd\"]  }  type取值： notification：通知。 autoscaling：弹性伸缩。 notificationList：告警状态发生变化时，被通知对象的列表。
     * @return alarmActions
     */
    public List<SMNAction> getAlarmActions() {
        return alarmActions;
    }

    public void setAlarmActions(List<SMNAction> alarmActions) {
        this.alarmActions = alarmActions;
    }

    public AlarmHistoryItemV2 withOkActions(List<SMNAction> okActions) {
        this.okActions = okActions;
        return this;
    }

    public AlarmHistoryItemV2 addOkActionsItem(SMNAction okActionsItem) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        this.okActions.add(okActionsItem);
        return this;
    }

    public AlarmHistoryItemV2 withOkActions(Consumer<List<SMNAction>> okActionsSetter) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        okActionsSetter.accept(this.okActions);
        return this;
    }

    /**
     * 告警恢复触发的动作。  结构如下：  {  \"type\": \"notification\", \"notificationList\": [\"urn:smn:southchina:68438a86d98e427e907e0097b7e35d47:sd\"]  } type取值：  notification：通知。  notificationList：告警状态发生变化时，被通知对象的列表。
     * @return okActions
     */
    public List<SMNAction> getOkActions() {
        return okActions;
    }

    public void setOkActions(List<SMNAction> okActions) {
        this.okActions = okActions;
    }

    public AlarmHistoryItemV2 withDataPoints(List<Object> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }

    public AlarmHistoryItemV2 addDataPointsItem(Object dataPointsItem) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        this.dataPoints.add(dataPointsItem);
        return this;
    }

    public AlarmHistoryItemV2 withDataPoints(Consumer<List<Object>> dataPointsSetter) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        dataPointsSetter.accept(this.dataPoints);
        return this;
    }

    /**
     * 计算出该条告警历史的资源监控数据上报时间和监控数值。
     * @return dataPoints
     */
    public List<Object> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<Object> dataPoints) {
        this.dataPoints = dataPoints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlarmHistoryItemV2 alarmHistoryItemV2 = (AlarmHistoryItemV2) o;
        return Objects.equals(this.recordId, alarmHistoryItemV2.recordId)
            && Objects.equals(this.alarmId, alarmHistoryItemV2.alarmId)
            && Objects.equals(this.name, alarmHistoryItemV2.name)
            && Objects.equals(this.status, alarmHistoryItemV2.status)
            && Objects.equals(this.level, alarmHistoryItemV2.level)
            && Objects.equals(this.type, alarmHistoryItemV2.type)
            && Objects.equals(this.actionEnabled, alarmHistoryItemV2.actionEnabled)
            && Objects.equals(this.beginTime, alarmHistoryItemV2.beginTime)
            && Objects.equals(this.endTime, alarmHistoryItemV2.endTime)
            && Objects.equals(this.metric, alarmHistoryItemV2.metric)
            && Objects.equals(this.condition, alarmHistoryItemV2.condition)
            && Objects.equals(this.additionalInfo, alarmHistoryItemV2.additionalInfo)
            && Objects.equals(this.alarmActions, alarmHistoryItemV2.alarmActions)
            && Objects.equals(this.okActions, alarmHistoryItemV2.okActions)
            && Objects.equals(this.dataPoints, alarmHistoryItemV2.dataPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId,
            alarmId,
            name,
            status,
            level,
            type,
            actionEnabled,
            beginTime,
            endTime,
            metric,
            condition,
            additionalInfo,
            alarmActions,
            okActions,
            dataPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmHistoryItemV2 {\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    actionEnabled: ").append(toIndentedString(actionEnabled)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
        sb.append("    okActions: ").append(toIndentedString(okActions)).append("\n");
        sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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
