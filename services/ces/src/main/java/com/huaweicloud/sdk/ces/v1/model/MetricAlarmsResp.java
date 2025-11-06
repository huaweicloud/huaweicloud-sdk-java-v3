package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MetricAlarmsResp
 */
public class MetricAlarmsResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_name")

    private String alarmName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_description")

    private String alarmDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private ListAlarmMetricResp metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private ConditionResp condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_enabled")

    private Boolean alarmEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private Integer alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_type")

    private String alarmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_action_enabled")

    private Boolean alarmActionEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_actions")

    private List<NotificationResp> alarmActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok_actions")

    private List<NotificationResp> okActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insufficientdata_actions")

    private List<NotificationResp> insufficientdataActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_action_begin_time")

    private String alarmActionBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_action_end_time")

    private String alarmActionEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_timezone")

    private String effectiveTimezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_state")

    private String alarmState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public MetricAlarmsResp withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * **参数解释**： 告警名称。 **取值范围**： 只能包含0-9/a-z/A-Z/_/-或汉字，字符长度为[1,128]。 
     * @return alarmName
     */
    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public MetricAlarmsResp withAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    /**
     * **参数解释**： 告警描述。 **取值范围**： 长度[0,256]个字符。 
     * @return alarmDescription
     */
    public String getAlarmDescription() {
        return alarmDescription;
    }

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    public MetricAlarmsResp withMetric(ListAlarmMetricResp metric) {
        this.metric = metric;
        return this;
    }

    public MetricAlarmsResp withMetric(Consumer<ListAlarmMetricResp> metricSetter) {
        if (this.metric == null) {
            this.metric = new ListAlarmMetricResp();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public ListAlarmMetricResp getMetric() {
        return metric;
    }

    public void setMetric(ListAlarmMetricResp metric) {
        this.metric = metric;
    }

    public MetricAlarmsResp withCondition(ConditionResp condition) {
        this.condition = condition;
        return this;
    }

    public MetricAlarmsResp withCondition(Consumer<ConditionResp> conditionSetter) {
        if (this.condition == null) {
            this.condition = new ConditionResp();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public ConditionResp getCondition() {
        return condition;
    }

    public void setCondition(ConditionResp condition) {
        this.condition = condition;
    }

    public MetricAlarmsResp withAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
        return this;
    }

    /**
     * **参数解释**： 是否启用该条告警。 **取值范围**： 布尔值。 true:开启。 false:关闭。 
     * @return alarmEnabled
     */
    public Boolean getAlarmEnabled() {
        return alarmEnabled;
    }

    public void setAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
    }

    public MetricAlarmsResp withAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * **参数解释**： 告警级别。 **取值范围**： 级别为1、2、3、4。分别对应紧急、重要、次要、提示。 
     * minimum: 1
     * maximum: 4
     * @return alarmLevel
     */
    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public MetricAlarmsResp withAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    /**
     * **参数解释**： 告警类型。 **取值范围**： 针对事件类型的告警时，告警类型为EVENT.SYS（系统事件）或EVENT.CUSTOM（自定义事件）。 针对资源分组的告警时，告警类型为RESOURCE_GROUP。 针对指定资源的告警时，告警类型为MULTI_INSTANCE。 - EVENT.SYS：针对系统事件的告警类型 - EVENT.CUSTOM：针对自定义事件的告警类型 - RESOURCE_GROUP：针对资源分组的告警类型 - MULTI_INSTANCE：指定资源的告警类型 
     * @return alarmType
     */
    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public MetricAlarmsResp withAlarmActionEnabled(Boolean alarmActionEnabled) {
        this.alarmActionEnabled = alarmActionEnabled;
        return this;
    }

    /**
     * **参数解释**： 该条告警触发时，是否开启告警通知。 **取值范围**： 布尔值。 - true：开启告警通知。 - false：不开启告警通知。 
     * @return alarmActionEnabled
     */
    public Boolean getAlarmActionEnabled() {
        return alarmActionEnabled;
    }

    public void setAlarmActionEnabled(Boolean alarmActionEnabled) {
        this.alarmActionEnabled = alarmActionEnabled;
    }

    public MetricAlarmsResp withAlarmActions(List<NotificationResp> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    public MetricAlarmsResp addAlarmActionsItem(NotificationResp alarmActionsItem) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        this.alarmActions.add(alarmActionsItem);
        return this;
    }

    public MetricAlarmsResp withAlarmActions(Consumer<List<NotificationResp>> alarmActionsSetter) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        alarmActionsSetter.accept(this.alarmActions);
        return this;
    }

    /**
     * **参数解释**： 告警触发时，通知组/主题订阅的信息。 
     * @return alarmActions
     */
    public List<NotificationResp> getAlarmActions() {
        return alarmActions;
    }

    public void setAlarmActions(List<NotificationResp> alarmActions) {
        this.alarmActions = alarmActions;
    }

    public MetricAlarmsResp withOkActions(List<NotificationResp> okActions) {
        this.okActions = okActions;
        return this;
    }

    public MetricAlarmsResp addOkActionsItem(NotificationResp okActionsItem) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        this.okActions.add(okActionsItem);
        return this;
    }

    public MetricAlarmsResp withOkActions(Consumer<List<NotificationResp>> okActionsSetter) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        okActionsSetter.accept(this.okActions);
        return this;
    }

    /**
     * **参数解释**： 告警触发时，通知组/主题订阅的信息。 
     * @return okActions
     */
    public List<NotificationResp> getOkActions() {
        return okActions;
    }

    public void setOkActions(List<NotificationResp> okActions) {
        this.okActions = okActions;
    }

    public MetricAlarmsResp withInsufficientdataActions(List<NotificationResp> insufficientdataActions) {
        this.insufficientdataActions = insufficientdataActions;
        return this;
    }

    public MetricAlarmsResp addInsufficientdataActionsItem(NotificationResp insufficientdataActionsItem) {
        if (this.insufficientdataActions == null) {
            this.insufficientdataActions = new ArrayList<>();
        }
        this.insufficientdataActions.add(insufficientdataActionsItem);
        return this;
    }

    public MetricAlarmsResp withInsufficientdataActions(
        Consumer<List<NotificationResp>> insufficientdataActionsSetter) {
        if (this.insufficientdataActions == null) {
            this.insufficientdataActions = new ArrayList<>();
        }
        insufficientdataActionsSetter.accept(this.insufficientdataActions);
        return this;
    }

    /**
     * **参数解释**： 告警触发时，通知组/主题订阅的信息。 
     * @return insufficientdataActions
     */
    public List<NotificationResp> getInsufficientdataActions() {
        return insufficientdataActions;
    }

    public void setInsufficientdataActions(List<NotificationResp> insufficientdataActions) {
        this.insufficientdataActions = insufficientdataActions;
    }

    public MetricAlarmsResp withAlarmActionBeginTime(String alarmActionBeginTime) {
        this.alarmActionBeginTime = alarmActionBeginTime;
        return this;
    }

    /**
     * **参数解释**： 告警规则生效的开始时间，告警规则仅在生效时间内发送通知消息。例如alarm_action_begin_time为8:00，alarm_action_end_time为20:00时，则对应的告警规则仅在08:00-20:00发送通知消息。 **取值范围**： 只能包含数字、“:”，长度为[1,64]个字符。 
     * @return alarmActionBeginTime
     */
    public String getAlarmActionBeginTime() {
        return alarmActionBeginTime;
    }

    public void setAlarmActionBeginTime(String alarmActionBeginTime) {
        this.alarmActionBeginTime = alarmActionBeginTime;
    }

    public MetricAlarmsResp withAlarmActionEndTime(String alarmActionEndTime) {
        this.alarmActionEndTime = alarmActionEndTime;
        return this;
    }

    /**
     * **参数解释**： 告警规则生效的结束时间，告警规则仅在生效时间内发送通知消息。例如alarm_action_begin_time为8:00，alarm_action_end_time为20:00时，则对应的告警规则仅在08:00-20:00发送通知消息。 **取值范围**： 只能包含数字、“:”，长度为[1,64]个字符。 
     * @return alarmActionEndTime
     */
    public String getAlarmActionEndTime() {
        return alarmActionEndTime;
    }

    public void setAlarmActionEndTime(String alarmActionEndTime) {
        this.alarmActionEndTime = alarmActionEndTime;
    }

    public MetricAlarmsResp withEffectiveTimezone(String effectiveTimezone) {
        this.effectiveTimezone = effectiveTimezone;
        return this;
    }

    /**
     * **参数解释**： 时区，形如：\"GMT-08:00\"、\"GMT+08:00\"、\"GMT+0:00\" **取值范围**： 长度为[1,16]个字符。 
     * @return effectiveTimezone
     */
    public String getEffectiveTimezone() {
        return effectiveTimezone;
    }

    public void setEffectiveTimezone(String effectiveTimezone) {
        this.effectiveTimezone = effectiveTimezone;
    }

    public MetricAlarmsResp withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * **参数解释**： 告警规则的ID。 **取值范围**： 以al开头，后跟22个数字或字母。字符长度为24 
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public MetricAlarmsResp withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 告警状态变更的时间，UNIX时间戳，单位毫秒。 **取值范围** 0 - 9999999999999 
     * minimum: 0
     * maximum: 9999999999999
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public MetricAlarmsResp withAlarmState(String alarmState) {
        this.alarmState = alarmState;
        return this;
    }

    /**
     * **参数解释**： 告警状态。 **取值范围**： 只能为ok、alarm、insufficient_data。字符长度为[0,17] - ok：正常 - alarm：告警 - insufficient_data：数据不足 
     * @return alarmState
     */
    public String getAlarmState() {
        return alarmState;
    }

    public void setAlarmState(String alarmState) {
        this.alarmState = alarmState;
    }

    public MetricAlarmsResp withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID。 **取值范围**： 只能包含小写字母、数字、“-”、“_”，长度为36个字符。也可取值0或all_granted_eps。0：代表默认企业项目ID，all_granted_eps：代表所有企业项目ID。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricAlarmsResp that = (MetricAlarmsResp) obj;
        return Objects.equals(this.alarmName, that.alarmName)
            && Objects.equals(this.alarmDescription, that.alarmDescription) && Objects.equals(this.metric, that.metric)
            && Objects.equals(this.condition, that.condition) && Objects.equals(this.alarmEnabled, that.alarmEnabled)
            && Objects.equals(this.alarmLevel, that.alarmLevel) && Objects.equals(this.alarmType, that.alarmType)
            && Objects.equals(this.alarmActionEnabled, that.alarmActionEnabled)
            && Objects.equals(this.alarmActions, that.alarmActions) && Objects.equals(this.okActions, that.okActions)
            && Objects.equals(this.insufficientdataActions, that.insufficientdataActions)
            && Objects.equals(this.alarmActionBeginTime, that.alarmActionBeginTime)
            && Objects.equals(this.alarmActionEndTime, that.alarmActionEndTime)
            && Objects.equals(this.effectiveTimezone, that.effectiveTimezone)
            && Objects.equals(this.alarmId, that.alarmId) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.alarmState, that.alarmState)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmName,
            alarmDescription,
            metric,
            condition,
            alarmEnabled,
            alarmLevel,
            alarmType,
            alarmActionEnabled,
            alarmActions,
            okActions,
            insufficientdataActions,
            alarmActionBeginTime,
            alarmActionEndTime,
            effectiveTimezone,
            alarmId,
            updateTime,
            alarmState,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricAlarmsResp {\n");
        sb.append("    alarmName: ").append(toIndentedString(alarmName)).append("\n");
        sb.append("    alarmDescription: ").append(toIndentedString(alarmDescription)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    alarmEnabled: ").append(toIndentedString(alarmEnabled)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
        sb.append("    alarmActionEnabled: ").append(toIndentedString(alarmActionEnabled)).append("\n");
        sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
        sb.append("    okActions: ").append(toIndentedString(okActions)).append("\n");
        sb.append("    insufficientdataActions: ").append(toIndentedString(insufficientdataActions)).append("\n");
        sb.append("    alarmActionBeginTime: ").append(toIndentedString(alarmActionBeginTime)).append("\n");
        sb.append("    alarmActionEndTime: ").append(toIndentedString(alarmActionEndTime)).append("\n");
        sb.append("    effectiveTimezone: ").append(toIndentedString(effectiveTimezone)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    alarmState: ").append(toIndentedString(alarmState)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
