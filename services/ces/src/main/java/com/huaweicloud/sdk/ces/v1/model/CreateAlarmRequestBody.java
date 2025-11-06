package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateAlarmRequestBody
 */
public class CreateAlarmRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_name")

    private String alarmName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_description")

    private String alarmDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private CreateAlarmMetric metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private Condition condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_enabled")

    private Boolean alarmEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_action_enabled")

    private Boolean alarmActionEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private Integer alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_type")

    private String alarmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_actions")

    private List<Notification> alarmActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insufficientdata_actions")

    private List<Notification> insufficientdataActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok_actions")

    private List<Notification> okActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_action_begin_time")

    private String alarmActionBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_action_end_time")

    private String alarmActionEndTime;

    public CreateAlarmRequestBody withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * **参数解释**： 告警名称。 **约束限制**： 不涉及。 **取值范围**： 只能包含0-9/a-z/A-Z/_/-或汉字，长度1-128。 **默认取值**： 不涉及。 
     * @return alarmName
     */
    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public CreateAlarmRequestBody withAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    /**
     * **参数解释**： 告警描述。 **约束限制**： 不涉及。 **取值范围**： 长度[0,256]个字符。 **默认取值**： 不涉及。 
     * @return alarmDescription
     */
    public String getAlarmDescription() {
        return alarmDescription;
    }

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    public CreateAlarmRequestBody withMetric(CreateAlarmMetric metric) {
        this.metric = metric;
        return this;
    }

    public CreateAlarmRequestBody withMetric(Consumer<CreateAlarmMetric> metricSetter) {
        if (this.metric == null) {
            this.metric = new CreateAlarmMetric();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public CreateAlarmMetric getMetric() {
        return metric;
    }

    public void setMetric(CreateAlarmMetric metric) {
        this.metric = metric;
    }

    public CreateAlarmRequestBody withCondition(Condition condition) {
        this.condition = condition;
        return this;
    }

    public CreateAlarmRequestBody withCondition(Consumer<Condition> conditionSetter) {
        if (this.condition == null) {
            this.condition = new Condition();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public CreateAlarmRequestBody withAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
        return this;
    }

    /**
     * **参数解释**： 是否启用该条告警。 **约束限制**： 不涉及。 **取值范围**： 布尔值。 - true：开启告警。 - false：不开启告警。 **默认取值**： true 
     * @return alarmEnabled
     */
    public Boolean getAlarmEnabled() {
        return alarmEnabled;
    }

    public void setAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
    }

    public CreateAlarmRequestBody withAlarmActionEnabled(Boolean alarmActionEnabled) {
        this.alarmActionEnabled = alarmActionEnabled;
        return this;
    }

    /**
     * **参数解释**： 该条告警触发时，是否启用告警通知。 **约束限制**： 若alarm_action_enabled为true，对应的alarm_actions、ok_actions至少有一个不能为空。若alarm_actions、ok_actions同时存在时，alarm_actions和ok_actions中的notification_list值保持一致。 **取值范围**： 布尔值。 - true：开启告警通知。 - false：不开启告警通知。 **默认取值**： true 
     * @return alarmActionEnabled
     */
    public Boolean getAlarmActionEnabled() {
        return alarmActionEnabled;
    }

    public void setAlarmActionEnabled(Boolean alarmActionEnabled) {
        this.alarmActionEnabled = alarmActionEnabled;
    }

    public CreateAlarmRequestBody withAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * **参数解释**： 告警级别。 **约束限制**： 不涉及。 **取值范围**： 只能为1、2、3、4。分别对应紧急、重要、次要、提示。 **默认取值**： 2 
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

    public CreateAlarmRequestBody withAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    /**
     * **参数解释**： 告警类型。 **约束限制**： 针对事件类型的告警时，告警类型为EVENT.SYS（系统事件）或EVENT.CUSTOM（自定义事件）。 针对资源分组的告警时，告警类型为RESOURCE_GROUP。 针对指定资源的告警时，告警类型为MULTI_INSTANCE。 **取值范围**： - EVENT.SYS：针对系统事件的告警规则。 - EVENT.CUSTOM：针对自定义事件的告警规则。 - RESOURCE_GROUP：针对资源分组的告警规则。 - MULTI_INSTANCE： 针对多实例的告警规则。 **默认取值**： 不涉及。 
     * @return alarmType
     */
    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public CreateAlarmRequestBody withAlarmActions(List<Notification> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    public CreateAlarmRequestBody addAlarmActionsItem(Notification alarmActionsItem) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        this.alarmActions.add(alarmActionsItem);
        return this;
    }

    public CreateAlarmRequestBody withAlarmActions(Consumer<List<Notification>> alarmActionsSetter) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        alarmActionsSetter.accept(this.alarmActions);
        return this;
    }

    /**
     * **参数解释**： 告警触发时，通知组/主题订阅的信息。 **约束限制**： 最多包含20个动作。 
     * @return alarmActions
     */
    public List<Notification> getAlarmActions() {
        return alarmActions;
    }

    public void setAlarmActions(List<Notification> alarmActions) {
        this.alarmActions = alarmActions;
    }

    public CreateAlarmRequestBody withInsufficientdataActions(List<Notification> insufficientdataActions) {
        this.insufficientdataActions = insufficientdataActions;
        return this;
    }

    public CreateAlarmRequestBody addInsufficientdataActionsItem(Notification insufficientdataActionsItem) {
        if (this.insufficientdataActions == null) {
            this.insufficientdataActions = new ArrayList<>();
        }
        this.insufficientdataActions.add(insufficientdataActionsItem);
        return this;
    }

    public CreateAlarmRequestBody withInsufficientdataActions(
        Consumer<List<Notification>> insufficientdataActionsSetter) {
        if (this.insufficientdataActions == null) {
            this.insufficientdataActions = new ArrayList<>();
        }
        insufficientdataActionsSetter.accept(this.insufficientdataActions);
        return this;
    }

    /**
     * **参数解释**： 告警触发时，通知组/主题订阅的信息。 **约束限制**： 最多包含20个动作。 
     * @return insufficientdataActions
     */
    public List<Notification> getInsufficientdataActions() {
        return insufficientdataActions;
    }

    public void setInsufficientdataActions(List<Notification> insufficientdataActions) {
        this.insufficientdataActions = insufficientdataActions;
    }

    public CreateAlarmRequestBody withOkActions(List<Notification> okActions) {
        this.okActions = okActions;
        return this;
    }

    public CreateAlarmRequestBody addOkActionsItem(Notification okActionsItem) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        this.okActions.add(okActionsItem);
        return this;
    }

    public CreateAlarmRequestBody withOkActions(Consumer<List<Notification>> okActionsSetter) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        okActionsSetter.accept(this.okActions);
        return this;
    }

    /**
     * **参数解释**： 告警触发时，通知组/主题订阅的信息。 **约束限制**： 最多包含20个动作。 
     * @return okActions
     */
    public List<Notification> getOkActions() {
        return okActions;
    }

    public void setOkActions(List<Notification> okActions) {
        this.okActions = okActions;
    }

    public CreateAlarmRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID。如何查询企业项目ID，请参考“[9.5-获取企业项目ID](ces_03_0061.xml)”。 **约束限制**： 不涉及。 **取值范围**： 长度为0或者32个字符。 **默认取值**： 0，表示默认的企业项目default。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateAlarmRequestBody withAlarmActionBeginTime(String alarmActionBeginTime) {
        this.alarmActionBeginTime = alarmActionBeginTime;
        return this;
    }

    /**
     * **参数解释**： 告警通知开启时间。 **约束限制**： 不涉及。 **取值范围**： 只能包含数字、“:”，长度为[1,64]个字符。 **默认取值**： 不涉及。 
     * @return alarmActionBeginTime
     */
    public String getAlarmActionBeginTime() {
        return alarmActionBeginTime;
    }

    public void setAlarmActionBeginTime(String alarmActionBeginTime) {
        this.alarmActionBeginTime = alarmActionBeginTime;
    }

    public CreateAlarmRequestBody withAlarmActionEndTime(String alarmActionEndTime) {
        this.alarmActionEndTime = alarmActionEndTime;
        return this;
    }

    /**
     * **参数解释**： 告警通知关闭时间。 **约束限制**： 不涉及。 **取值范围**： 只能包含数字、“:”，长度为[1,64]个字符。 **默认取值**： 不涉及。 
     * @return alarmActionEndTime
     */
    public String getAlarmActionEndTime() {
        return alarmActionEndTime;
    }

    public void setAlarmActionEndTime(String alarmActionEndTime) {
        this.alarmActionEndTime = alarmActionEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAlarmRequestBody that = (CreateAlarmRequestBody) obj;
        return Objects.equals(this.alarmName, that.alarmName)
            && Objects.equals(this.alarmDescription, that.alarmDescription) && Objects.equals(this.metric, that.metric)
            && Objects.equals(this.condition, that.condition) && Objects.equals(this.alarmEnabled, that.alarmEnabled)
            && Objects.equals(this.alarmActionEnabled, that.alarmActionEnabled)
            && Objects.equals(this.alarmLevel, that.alarmLevel) && Objects.equals(this.alarmType, that.alarmType)
            && Objects.equals(this.alarmActions, that.alarmActions)
            && Objects.equals(this.insufficientdataActions, that.insufficientdataActions)
            && Objects.equals(this.okActions, that.okActions)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.alarmActionBeginTime, that.alarmActionBeginTime)
            && Objects.equals(this.alarmActionEndTime, that.alarmActionEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmName,
            alarmDescription,
            metric,
            condition,
            alarmEnabled,
            alarmActionEnabled,
            alarmLevel,
            alarmType,
            alarmActions,
            insufficientdataActions,
            okActions,
            enterpriseProjectId,
            alarmActionBeginTime,
            alarmActionEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAlarmRequestBody {\n");
        sb.append("    alarmName: ").append(toIndentedString(alarmName)).append("\n");
        sb.append("    alarmDescription: ").append(toIndentedString(alarmDescription)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    alarmEnabled: ").append(toIndentedString(alarmEnabled)).append("\n");
        sb.append("    alarmActionEnabled: ").append(toIndentedString(alarmActionEnabled)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
        sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
        sb.append("    insufficientdataActions: ").append(toIndentedString(insufficientdataActions)).append("\n");
        sb.append("    okActions: ").append(toIndentedString(okActions)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    alarmActionBeginTime: ").append(toIndentedString(alarmActionBeginTime)).append("\n");
        sb.append("    alarmActionEndTime: ").append(toIndentedString(alarmActionEndTime)).append("\n");
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
