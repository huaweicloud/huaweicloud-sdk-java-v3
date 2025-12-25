package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 告警历史详细信息 
 */
public class AlarmHistoryInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_name")

    private String alarmName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_description")

    private String alarmDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private MetricInfoResp metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private ConditionResp condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private Integer alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_type")

    private String alarmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_enabled")

    private Boolean alarmEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_action_enabled")

    private Boolean alarmActionEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_actions")

    private List<List<NotificationResp>> alarmActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok_actions")

    private List<List<NotificationResp>> okActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insufficientdata_actions")

    private List<List<NotificationResp>> insufficientdataActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_time")

    private Long triggerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_status")

    private String alarmStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datapoints")

    private List<DataPointForAlarmHistoryResp> datapoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_info")

    private AdditionalInfoResp additionalInfo;

    /**
     * **参数解释** 通知方式 **取值范围**： 枚举值： - NOTIFICATION_POLICY：通知策略 - NOTIFICATION_GROUP：通知组 - TOPIC_SUBSCRIPTION：主题订阅 
     */
    public static final class NotificationMannerEnum {

        /**
         * Enum NOTIFICATION_POLICY for value: "NOTIFICATION_POLICY"
         */
        public static final NotificationMannerEnum NOTIFICATION_POLICY =
            new NotificationMannerEnum("NOTIFICATION_POLICY");

        /**
         * Enum NOTIFICATION_GROUP for value: "NOTIFICATION_GROUP"
         */
        public static final NotificationMannerEnum NOTIFICATION_GROUP =
            new NotificationMannerEnum("NOTIFICATION_GROUP");

        /**
         * Enum TOPIC_SUBSCRIPTION for value: "TOPIC_SUBSCRIPTION"
         */
        public static final NotificationMannerEnum TOPIC_SUBSCRIPTION =
            new NotificationMannerEnum("TOPIC_SUBSCRIPTION");

        private static final Map<String, NotificationMannerEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotificationMannerEnum> createStaticFields() {
            Map<String, NotificationMannerEnum> map = new HashMap<>();
            map.put("NOTIFICATION_POLICY", NOTIFICATION_POLICY);
            map.put("NOTIFICATION_GROUP", NOTIFICATION_GROUP);
            map.put("TOPIC_SUBSCRIPTION", TOPIC_SUBSCRIPTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotificationMannerEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NotificationMannerEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotificationMannerEnum(value));
        }

        public static NotificationMannerEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotificationMannerEnum) {
                return this.value.equals(((NotificationMannerEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_manner")

    private NotificationMannerEnum notificationManner;

    public AlarmHistoryInfoResp withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * **参数解释**： 告警规则的ID，如：al1603131199286dzxpqK3Ez。 **取值范围**： 字符串长度为24 
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public AlarmHistoryInfoResp withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * **参数解释**： 告警规则的名称，如：alarm-test01 **取值范围**： 字符串长度在 1 到 128 之间 
     * @return alarmName
     */
    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public AlarmHistoryInfoResp withAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
        return this;
    }

    /**
     * **参数解释**： 告警规则的描述 **取值范围**： 字符串长度在 0 到 256 之间 
     * @return alarmDescription
     */
    public String getAlarmDescription() {
        return alarmDescription;
    }

    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }

    public AlarmHistoryInfoResp withMetric(MetricInfoResp metric) {
        this.metric = metric;
        return this;
    }

    public AlarmHistoryInfoResp withMetric(Consumer<MetricInfoResp> metricSetter) {
        if (this.metric == null) {
            this.metric = new MetricInfoResp();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public MetricInfoResp getMetric() {
        return metric;
    }

    public void setMetric(MetricInfoResp metric) {
        this.metric = metric;
    }

    public AlarmHistoryInfoResp withCondition(ConditionResp condition) {
        this.condition = condition;
        return this;
    }

    public AlarmHistoryInfoResp withCondition(Consumer<ConditionResp> conditionSetter) {
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

    public AlarmHistoryInfoResp withAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * **参数解释**： 告警记录的告警级别。 **取值范围**： 枚举值： - 1：紧急 - 2：重要 - 3：次要 - 4：提示 
     * @return alarmLevel
     */
    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public AlarmHistoryInfoResp withAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    /**
     * **参数解释**： 告警规则类型 **取值范围**： 枚举值: - ALL_INSTANCE：全部资源指标告警 - RESOURCE_GROUP：资源分组指标告警 - MULTI_INSTANCE：指定资源指标告警 - EVENT.SYS：系统事件告警 - EVENT.CUSTOM：自定义事件告警 - DNSHealthCheck：健康检查告警 
     * @return alarmType
     */
    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public AlarmHistoryInfoResp withAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
        return this;
    }

    /**
     * **参数解释**： 告警规则是否被启用 **取值范围**： 值为true或者false - true：开启 - false：关闭 
     * @return alarmEnabled
     */
    public Boolean getAlarmEnabled() {
        return alarmEnabled;
    }

    public void setAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
    }

    public AlarmHistoryInfoResp withAlarmActionEnabled(Boolean alarmActionEnabled) {
        this.alarmActionEnabled = alarmActionEnabled;
        return this;
    }

    /**
     * **参数解释**： 是否发送通知 **取值范围**： 值为true或者false - true：发送通知 - false：不发送通知 
     * @return alarmActionEnabled
     */
    public Boolean getAlarmActionEnabled() {
        return alarmActionEnabled;
    }

    public void setAlarmActionEnabled(Boolean alarmActionEnabled) {
        this.alarmActionEnabled = alarmActionEnabled;
    }

    public AlarmHistoryInfoResp withAlarmActions(List<List<NotificationResp>> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    public AlarmHistoryInfoResp addAlarmActionsItem(List<NotificationResp> alarmActionsItem) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        this.alarmActions.add(alarmActionsItem);
        return this;
    }

    public AlarmHistoryInfoResp withAlarmActions(Consumer<List<List<NotificationResp>>> alarmActionsSetter) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        alarmActionsSetter.accept(this.alarmActions);
        return this;
    }

    /**
     * **参数解释**： 告警触发时，通知组/主题订阅的信息。结构如下：{  \"type\": \"notification\", \"notificationList\": [\"urn:smn:southchina:68438a86d98e427e907e0097b7e35d47:sd\"]  } 
     * @return alarmActions
     */
    public List<List<NotificationResp>> getAlarmActions() {
        return alarmActions;
    }

    public void setAlarmActions(List<List<NotificationResp>> alarmActions) {
        this.alarmActions = alarmActions;
    }

    public AlarmHistoryInfoResp withOkActions(List<List<NotificationResp>> okActions) {
        this.okActions = okActions;
        return this;
    }

    public AlarmHistoryInfoResp addOkActionsItem(List<NotificationResp> okActionsItem) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        this.okActions.add(okActionsItem);
        return this;
    }

    public AlarmHistoryInfoResp withOkActions(Consumer<List<List<NotificationResp>>> okActionsSetter) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        okActionsSetter.accept(this.okActions);
        return this;
    }

    /**
     * **参数解释**： 告警恢复时，通知组/主题订阅的信息。结构如下：{  \"type\": \"notification\", \"notificationList\": [\"urn:smn:southchina:68438a86d98e427e907e0097b7e35d47:sd\"]  } 
     * @return okActions
     */
    public List<List<NotificationResp>> getOkActions() {
        return okActions;
    }

    public void setOkActions(List<List<NotificationResp>> okActions) {
        this.okActions = okActions;
    }

    public AlarmHistoryInfoResp withInsufficientdataActions(List<List<NotificationResp>> insufficientdataActions) {
        this.insufficientdataActions = insufficientdataActions;
        return this;
    }

    public AlarmHistoryInfoResp addInsufficientdataActionsItem(List<NotificationResp> insufficientdataActionsItem) {
        if (this.insufficientdataActions == null) {
            this.insufficientdataActions = new ArrayList<>();
        }
        this.insufficientdataActions.add(insufficientdataActionsItem);
        return this;
    }

    public AlarmHistoryInfoResp withInsufficientdataActions(
        Consumer<List<List<NotificationResp>>> insufficientdataActionsSetter) {
        if (this.insufficientdataActions == null) {
            this.insufficientdataActions = new ArrayList<>();
        }
        insufficientdataActionsSetter.accept(this.insufficientdataActions);
        return this;
    }

    /**
     * **参数解释**： 数据不足时触发告警时，通知组/主题订阅的信息。结构如下：{  \"type\": \"notification\", \"notificationList\": [\"urn:smn:southchina:68438a86d98e427e907e0097b7e35d47:sd\"]  } 
     * @return insufficientdataActions
     */
    public List<List<NotificationResp>> getInsufficientdataActions() {
        return insufficientdataActions;
    }

    public void setInsufficientdataActions(List<List<NotificationResp>> insufficientdataActions) {
        this.insufficientdataActions = insufficientdataActions;
    }

    public AlarmHistoryInfoResp withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 告警状态变更的时间，UNIX时间戳，单位毫秒，如：1603131199000 **取值范围**： 不涉及 
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public AlarmHistoryInfoResp withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID **取值范围**： 只能包含小写字母、数字、“-”、“_”，可以自定义企业项目ID，长度为36个字符。也可以为0（代表默认企业项目ID），all_granted_eps（代表所有企业项目ID） 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public AlarmHistoryInfoResp withTriggerTime(Long triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    /**
     * **参数解释**： 计算出该条告警历史的时间，UNIX时间戳，单位毫秒，如：1603131199469 **取值范围**： 不涉及 
     * @return triggerTime
     */
    public Long getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(Long triggerTime) {
        this.triggerTime = triggerTime;
    }

    public AlarmHistoryInfoResp withAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    /**
     * **参数解释**： 告警规则的状态 **取值范围**： 枚举值： - ok：正常 - alarm：告警 - insufficient_data：数据不足 - invalid：已失效 
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public AlarmHistoryInfoResp withDatapoints(List<DataPointForAlarmHistoryResp> datapoints) {
        this.datapoints = datapoints;
        return this;
    }

    public AlarmHistoryInfoResp addDatapointsItem(DataPointForAlarmHistoryResp datapointsItem) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        this.datapoints.add(datapointsItem);
        return this;
    }

    public AlarmHistoryInfoResp withDatapoints(Consumer<List<DataPointForAlarmHistoryResp>> datapointsSetter) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        datapointsSetter.accept(this.datapoints);
        return this;
    }

    /**
     * **参数解释**： 计算出该条告警历史的资源监控数据的一组数据上报时间和监控数值 
     * @return datapoints
     */
    public List<DataPointForAlarmHistoryResp> getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(List<DataPointForAlarmHistoryResp> datapoints) {
        this.datapoints = datapoints;
    }

    public AlarmHistoryInfoResp withAdditionalInfo(AdditionalInfoResp additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public AlarmHistoryInfoResp withAdditionalInfo(Consumer<AdditionalInfoResp> additionalInfoSetter) {
        if (this.additionalInfo == null) {
            this.additionalInfo = new AdditionalInfoResp();
            additionalInfoSetter.accept(this.additionalInfo);
        }

        return this;
    }

    /**
     * Get additionalInfo
     * @return additionalInfo
     */
    public AdditionalInfoResp getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(AdditionalInfoResp additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public AlarmHistoryInfoResp withNotificationManner(NotificationMannerEnum notificationManner) {
        this.notificationManner = notificationManner;
        return this;
    }

    /**
     * **参数解释** 通知方式 **取值范围**： 枚举值： - NOTIFICATION_POLICY：通知策略 - NOTIFICATION_GROUP：通知组 - TOPIC_SUBSCRIPTION：主题订阅 
     * @return notificationManner
     */
    public NotificationMannerEnum getNotificationManner() {
        return notificationManner;
    }

    public void setNotificationManner(NotificationMannerEnum notificationManner) {
        this.notificationManner = notificationManner;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmHistoryInfoResp that = (AlarmHistoryInfoResp) obj;
        return Objects.equals(this.alarmId, that.alarmId) && Objects.equals(this.alarmName, that.alarmName)
            && Objects.equals(this.alarmDescription, that.alarmDescription) && Objects.equals(this.metric, that.metric)
            && Objects.equals(this.condition, that.condition) && Objects.equals(this.alarmLevel, that.alarmLevel)
            && Objects.equals(this.alarmType, that.alarmType) && Objects.equals(this.alarmEnabled, that.alarmEnabled)
            && Objects.equals(this.alarmActionEnabled, that.alarmActionEnabled)
            && Objects.equals(this.alarmActions, that.alarmActions) && Objects.equals(this.okActions, that.okActions)
            && Objects.equals(this.insufficientdataActions, that.insufficientdataActions)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.triggerTime, that.triggerTime) && Objects.equals(this.alarmStatus, that.alarmStatus)
            && Objects.equals(this.datapoints, that.datapoints)
            && Objects.equals(this.additionalInfo, that.additionalInfo)
            && Objects.equals(this.notificationManner, that.notificationManner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmId,
            alarmName,
            alarmDescription,
            metric,
            condition,
            alarmLevel,
            alarmType,
            alarmEnabled,
            alarmActionEnabled,
            alarmActions,
            okActions,
            insufficientdataActions,
            updateTime,
            enterpriseProjectId,
            triggerTime,
            alarmStatus,
            datapoints,
            additionalInfo,
            notificationManner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmHistoryInfoResp {\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    alarmName: ").append(toIndentedString(alarmName)).append("\n");
        sb.append("    alarmDescription: ").append(toIndentedString(alarmDescription)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
        sb.append("    alarmEnabled: ").append(toIndentedString(alarmEnabled)).append("\n");
        sb.append("    alarmActionEnabled: ").append(toIndentedString(alarmActionEnabled)).append("\n");
        sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
        sb.append("    okActions: ").append(toIndentedString(okActions)).append("\n");
        sb.append("    insufficientdataActions: ").append(toIndentedString(insufficientdataActions)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    triggerTime: ").append(toIndentedString(triggerTime)).append("\n");
        sb.append("    alarmStatus: ").append(toIndentedString(alarmStatus)).append("\n");
        sb.append("    datapoints: ").append(toIndentedString(datapoints)).append("\n");
        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    notificationManner: ").append(toIndentedString(notificationManner)).append("\n");
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
