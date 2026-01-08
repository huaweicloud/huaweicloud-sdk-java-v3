package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 告警记录详细信息 
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

    /**
     * **参数解释**： 告警规则状态 **取值范围**： 枚举值。 - ok：正常 - alarm：告警 - invalid：已失效 - insufficient_data: 数据不足 - ok_manual: 手动恢复 
     */
    public static final class StatusEnum {

        /**
         * Enum OK for value: "ok"
         */
        public static final StatusEnum OK = new StatusEnum("ok");

        /**
         * Enum ALARM for value: "alarm"
         */
        public static final StatusEnum ALARM = new StatusEnum("alarm");

        /**
         * Enum INVALID for value: "invalid"
         */
        public static final StatusEnum INVALID = new StatusEnum("invalid");

        /**
         * Enum INSUFFICIENT_DATA for value: "insufficient_data"
         */
        public static final StatusEnum INSUFFICIENT_DATA = new StatusEnum("insufficient_data");

        /**
         * Enum OK_MANUAL for value: "ok_manual"
         */
        public static final StatusEnum OK_MANUAL = new StatusEnum("ok_manual");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ok", OK);
            map.put("alarm", ALARM);
            map.put("invalid", INVALID);
            map.put("insufficient_data", INSUFFICIENT_DATA);
            map.put("ok_manual", OK_MANUAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    /**
     * **参数解释**： 告警记录的告警级别。 **取值范围**： 值为1,2,3,4 - 1：紧急 - 2：重要 - 3：次要 - 4：提示 
     */
    public static final class LevelEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final LevelEnum NUMBER_1 = new LevelEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final LevelEnum NUMBER_2 = new LevelEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final LevelEnum NUMBER_3 = new LevelEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final LevelEnum NUMBER_4 = new LevelEnum(4);

        private static final Map<Integer, LevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, LevelEnum> createStaticFields() {
            Map<Integer, LevelEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        LevelEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LevelEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LevelEnum(value));
        }

        public static LevelEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LevelEnum) {
                return this.value.equals(((LevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private LevelEnum level;

    /**
     * **参数解释**： 告警规则类型。 **取值范围**： 枚举值 - ALL_INSTANCE：全部资源指标告警 - RESOURCE_GROUP：资源分组指标告警 - MULTI_INSTANCE：指定资源指标告警 - EVENT.SYS：系统事件告警 - EVENT.CUSTOM：自定义事件告警 - DNSHealthCheck：健康检查告警 
     */
    public static final class TypeEnum {

        /**
         * Enum EVENT_SYS for value: "EVENT.SYS"
         */
        public static final TypeEnum EVENT_SYS = new TypeEnum("EVENT.SYS");

        /**
         * Enum EVENT_CUSTOM for value: "EVENT.CUSTOM"
         */
        public static final TypeEnum EVENT_CUSTOM = new TypeEnum("EVENT.CUSTOM");

        /**
         * Enum DNSHEALTHCHECK for value: "DNSHealthCheck"
         */
        public static final TypeEnum DNSHEALTHCHECK = new TypeEnum("DNSHealthCheck");

        /**
         * Enum RESOURCE_GROUP for value: "RESOURCE_GROUP"
         */
        public static final TypeEnum RESOURCE_GROUP = new TypeEnum("RESOURCE_GROUP");

        /**
         * Enum MULTI_INSTANCE for value: "MULTI_INSTANCE"
         */
        public static final TypeEnum MULTI_INSTANCE = new TypeEnum("MULTI_INSTANCE");

        /**
         * Enum ALL_INSTANCE for value: "ALL_INSTANCE"
         */
        public static final TypeEnum ALL_INSTANCE = new TypeEnum("ALL_INSTANCE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("EVENT.SYS", EVENT_SYS);
            map.put("EVENT.CUSTOM", EVENT_CUSTOM);
            map.put("DNSHealthCheck", DNSHEALTHCHECK);
            map.put("RESOURCE_GROUP", RESOURCE_GROUP);
            map.put("MULTI_INSTANCE", MULTI_INSTANCE);
            map.put("ALL_INSTANCE", ALL_INSTANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

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
    @JsonProperty(value = "first_alarm_time")

    private OffsetDateTime firstAlarmTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_alarm_time")

    private OffsetDateTime lastAlarmTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_recovery_time")

    private OffsetDateTime alarmRecoveryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private AlarmHistoryItemV2Metric metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private AlarmHistoryItemV2Condition condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_info")

    private AdditionalInfo additionalInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_actions")

    private List<AlarmHistoryItemV2AlarmActions> alarmActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok_actions")

    private List<AlarmHistoryItemV2AlarmActions> okActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_points")

    private List<DataPointInfo> dataPoints = null;

    /**
     * **参数解释**： 告警屏蔽状态。 **取值范围**： - MASKED：已屏蔽 - UN_MASKED：未屏蔽 
     */
    public static final class MaskStatusEnum {

        /**
         * Enum MASKED for value: "MASKED"
         */
        public static final MaskStatusEnum MASKED = new MaskStatusEnum("MASKED");

        /**
         * Enum UN_MASKED for value: "UN_MASKED"
         */
        public static final MaskStatusEnum UN_MASKED = new MaskStatusEnum("UN_MASKED");

        private static final Map<String, MaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MaskStatusEnum> createStaticFields() {
            Map<String, MaskStatusEnum> map = new HashMap<>();
            map.put("MASKED", MASKED);
            map.put("UN_MASKED", UN_MASKED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MaskStatusEnum(String value) {
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
        public static MaskStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MaskStatusEnum(value));
        }

        public static MaskStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MaskStatusEnum) {
                return this.value.equals(((MaskStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_status")

    private MaskStatusEnum maskStatus;

    public AlarmHistoryItemV2 withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * **参数解释**： 告警流水号。优化告警流水号生成规则，由 ah1655717086704DEnBrJ999 更改为 ah251222T092004SAD2yARym **取值范围**： 以ah开头，后跟22位由字母或数字组成的字符串，字符串长度为24。 
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
     * **参数解释**： 告警规则ID。 **取值范围**： 以al开头，后跟22位的字母或数字。 
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
     * **参数解释**： 告警名称。 **取值范围**： 只能包含0-9/a-z/A-Z/_/-或汉字，长度为[1,128]个字符。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlarmHistoryItemV2 withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 告警规则状态 **取值范围**： 枚举值。 - ok：正常 - alarm：告警 - invalid：已失效 - insufficient_data: 数据不足 - ok_manual: 手动恢复 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AlarmHistoryItemV2 withLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释**： 告警记录的告警级别。 **取值范围**： 值为1,2,3,4 - 1：紧急 - 2：重要 - 3：次要 - 4：提示 
     * @return level
     */
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public AlarmHistoryItemV2 withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 告警规则类型。 **取值范围**： 枚举值 - ALL_INSTANCE：全部资源指标告警 - RESOURCE_GROUP：资源分组指标告警 - MULTI_INSTANCE：指定资源指标告警 - EVENT.SYS：系统事件告警 - EVENT.CUSTOM：自定义事件告警 - DNSHealthCheck：健康检查告警 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AlarmHistoryItemV2 withActionEnabled(Boolean actionEnabled) {
        this.actionEnabled = actionEnabled;
        return this;
    }

    /**
     * **参数解释**： 是否发送通知 **取值范围**： - true：发送通知 - false：不发送通知 
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
     * **参数解释**： 产生时间,UTC时间 **取值范围**： 不涉及。 
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
     * **参数解释**： 结束时间，UTC时间 **取值范围**： 不涉及。 
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public AlarmHistoryItemV2 withFirstAlarmTime(OffsetDateTime firstAlarmTime) {
        this.firstAlarmTime = firstAlarmTime;
        return this;
    }

    /**
     * **参数解释**： 第一次告警时间，UTC时间 **取值范围**： 不涉及。 
     * @return firstAlarmTime
     */
    public OffsetDateTime getFirstAlarmTime() {
        return firstAlarmTime;
    }

    public void setFirstAlarmTime(OffsetDateTime firstAlarmTime) {
        this.firstAlarmTime = firstAlarmTime;
    }

    public AlarmHistoryItemV2 withLastAlarmTime(OffsetDateTime lastAlarmTime) {
        this.lastAlarmTime = lastAlarmTime;
        return this;
    }

    /**
     * **参数解释**： 最后一次告警时间，UTC时间。 **取值范围**： 不涉及。 
     * @return lastAlarmTime
     */
    public OffsetDateTime getLastAlarmTime() {
        return lastAlarmTime;
    }

    public void setLastAlarmTime(OffsetDateTime lastAlarmTime) {
        this.lastAlarmTime = lastAlarmTime;
    }

    public AlarmHistoryItemV2 withAlarmRecoveryTime(OffsetDateTime alarmRecoveryTime) {
        this.alarmRecoveryTime = alarmRecoveryTime;
        return this;
    }

    /**
     * **参数解释**： 告警恢复时间，UTC时间。 **取值范围**： 不涉及。 
     * @return alarmRecoveryTime
     */
    public OffsetDateTime getAlarmRecoveryTime() {
        return alarmRecoveryTime;
    }

    public void setAlarmRecoveryTime(OffsetDateTime alarmRecoveryTime) {
        this.alarmRecoveryTime = alarmRecoveryTime;
    }

    public AlarmHistoryItemV2 withMetric(AlarmHistoryItemV2Metric metric) {
        this.metric = metric;
        return this;
    }

    public AlarmHistoryItemV2 withMetric(Consumer<AlarmHistoryItemV2Metric> metricSetter) {
        if (this.metric == null) {
            this.metric = new AlarmHistoryItemV2Metric();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public AlarmHistoryItemV2Metric getMetric() {
        return metric;
    }

    public void setMetric(AlarmHistoryItemV2Metric metric) {
        this.metric = metric;
    }

    public AlarmHistoryItemV2 withCondition(AlarmHistoryItemV2Condition condition) {
        this.condition = condition;
        return this;
    }

    public AlarmHistoryItemV2 withCondition(Consumer<AlarmHistoryItemV2Condition> conditionSetter) {
        if (this.condition == null) {
            this.condition = new AlarmHistoryItemV2Condition();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public AlarmHistoryItemV2Condition getCondition() {
        return condition;
    }

    public void setCondition(AlarmHistoryItemV2Condition condition) {
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

    public AlarmHistoryItemV2 withAlarmActions(List<AlarmHistoryItemV2AlarmActions> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    public AlarmHistoryItemV2 addAlarmActionsItem(AlarmHistoryItemV2AlarmActions alarmActionsItem) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        this.alarmActions.add(alarmActionsItem);
        return this;
    }

    public AlarmHistoryItemV2 withAlarmActions(Consumer<List<AlarmHistoryItemV2AlarmActions>> alarmActionsSetter) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        alarmActionsSetter.accept(this.alarmActions);
        return this;
    }

    /**
     * **参数解释**： 告警触发时，通知组/主题订阅的信息。结构如下：  {  \"type\": \"notification\", \"notification_list\": [\"urn:smn:southchina:68438a86d98e427e907e0097b7e35d47:sd\"]  } 
     * @return alarmActions
     */
    public List<AlarmHistoryItemV2AlarmActions> getAlarmActions() {
        return alarmActions;
    }

    public void setAlarmActions(List<AlarmHistoryItemV2AlarmActions> alarmActions) {
        this.alarmActions = alarmActions;
    }

    public AlarmHistoryItemV2 withOkActions(List<AlarmHistoryItemV2AlarmActions> okActions) {
        this.okActions = okActions;
        return this;
    }

    public AlarmHistoryItemV2 addOkActionsItem(AlarmHistoryItemV2AlarmActions okActionsItem) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        this.okActions.add(okActionsItem);
        return this;
    }

    public AlarmHistoryItemV2 withOkActions(Consumer<List<AlarmHistoryItemV2AlarmActions>> okActionsSetter) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        okActionsSetter.accept(this.okActions);
        return this;
    }

    /**
     * **参数解释**： 告警恢复时，通知组/主题订阅的信息。结构如下：  {  \"type\": \"notification\", \"notification_list\": [\"urn:smn:southchina:68438a86d98e427e907e0097b7e35d47:sd\"]  } 
     * @return okActions
     */
    public List<AlarmHistoryItemV2AlarmActions> getOkActions() {
        return okActions;
    }

    public void setOkActions(List<AlarmHistoryItemV2AlarmActions> okActions) {
        this.okActions = okActions;
    }

    public AlarmHistoryItemV2 withDataPoints(List<DataPointInfo> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }

    public AlarmHistoryItemV2 addDataPointsItem(DataPointInfo dataPointsItem) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        this.dataPoints.add(dataPointsItem);
        return this;
    }

    public AlarmHistoryItemV2 withDataPoints(Consumer<List<DataPointInfo>> dataPointsSetter) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        dataPointsSetter.accept(this.dataPoints);
        return this;
    }

    /**
     * **参数解释**： 计算出该条告警记录的资源监控数据上报时间和监控数值。 
     * @return dataPoints
     */
    public List<DataPointInfo> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<DataPointInfo> dataPoints) {
        this.dataPoints = dataPoints;
    }

    public AlarmHistoryItemV2 withMaskStatus(MaskStatusEnum maskStatus) {
        this.maskStatus = maskStatus;
        return this;
    }

    /**
     * **参数解释**： 告警屏蔽状态。 **取值范围**： - MASKED：已屏蔽 - UN_MASKED：未屏蔽 
     * @return maskStatus
     */
    public MaskStatusEnum getMaskStatus() {
        return maskStatus;
    }

    public void setMaskStatus(MaskStatusEnum maskStatus) {
        this.maskStatus = maskStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmHistoryItemV2 that = (AlarmHistoryItemV2) obj;
        return Objects.equals(this.recordId, that.recordId) && Objects.equals(this.alarmId, that.alarmId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.level, that.level) && Objects.equals(this.type, that.type)
            && Objects.equals(this.actionEnabled, that.actionEnabled) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.firstAlarmTime, that.firstAlarmTime)
            && Objects.equals(this.lastAlarmTime, that.lastAlarmTime)
            && Objects.equals(this.alarmRecoveryTime, that.alarmRecoveryTime)
            && Objects.equals(this.metric, that.metric) && Objects.equals(this.condition, that.condition)
            && Objects.equals(this.additionalInfo, that.additionalInfo)
            && Objects.equals(this.alarmActions, that.alarmActions) && Objects.equals(this.okActions, that.okActions)
            && Objects.equals(this.dataPoints, that.dataPoints) && Objects.equals(this.maskStatus, that.maskStatus);
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
            firstAlarmTime,
            lastAlarmTime,
            alarmRecoveryTime,
            metric,
            condition,
            additionalInfo,
            alarmActions,
            okActions,
            dataPoints,
            maskStatus);
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
        sb.append("    firstAlarmTime: ").append(toIndentedString(firstAlarmTime)).append("\n");
        sb.append("    lastAlarmTime: ").append(toIndentedString(lastAlarmTime)).append("\n");
        sb.append("    alarmRecoveryTime: ").append(toIndentedString(alarmRecoveryTime)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
        sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
        sb.append("    okActions: ").append(toIndentedString(okActions)).append("\n");
        sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
        sb.append("    maskStatus: ").append(toIndentedString(maskStatus)).append("\n");
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
