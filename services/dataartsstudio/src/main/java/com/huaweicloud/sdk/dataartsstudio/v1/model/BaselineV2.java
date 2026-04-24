package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
 * 基线任务
 */
public class BaselineV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    /**
     * 基线任务类型。
     */
    public static final class TypeEnum {

        /**
         * Enum DAY for value: "DAY"
         */
        public static final TypeEnum DAY = new TypeEnum("DAY");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final TypeEnum HOUR = new TypeEnum("HOUR");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("DAY", DAY);
            map.put("HOUR", HOUR);
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
    @JsonProperty(value = "owner_id")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_task_ids")

    private List<String> slaTaskIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_min")

    private Integer slaMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buffer")

    private Integer buffer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_hour")

    private Integer slaHour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exp_min")

    private Integer expMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exp_hour")

    private Integer expHour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hour_exp_detail")

    private String hourExpDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hour_sla_detail")

    private String hourSlaDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_enable")

    private Boolean alarmEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_alarm_enable")

    private Boolean baselineAlarmEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_topics")

    private List<SmnTopic> smnTopics = null;

    /**
     * Gets or Sets eventAlarm
     */
    public static final class EventAlarmEnum {

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final EventAlarmEnum ERROR = new EventAlarmEnum("ERROR");

        /**
         * Enum SLOW_DOWN for value: "SLOW_DOWN"
         */
        public static final EventAlarmEnum SLOW_DOWN = new EventAlarmEnum("SLOW_DOWN");

        private static final Map<String, EventAlarmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventAlarmEnum> createStaticFields() {
            Map<String, EventAlarmEnum> map = new HashMap<>();
            map.put("ERROR", ERROR);
            map.put("SLOW_DOWN", SLOW_DOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventAlarmEnum(String value) {
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
        public static EventAlarmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventAlarmEnum(value));
        }

        public static EventAlarmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventAlarmEnum) {
                return this.value.equals(((EventAlarmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_alarm")

    private List<EventAlarmEnum> eventAlarm = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_smn_topics")

    private List<SmnTopic> eventSmnTopics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_enable")

    private Boolean signEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private List<PeriodSlaTimeV2> period = null;

    public BaselineV2 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 基线任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BaselineV2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 基线任务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaselineV2 withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号。
     * minimum: 0
     * maximum: 10000
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BaselineV2 withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间戳，单位毫秒。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public BaselineV2 withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最后更新时间戳，单位毫秒。
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public BaselineV2 withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 基线任务类型。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public BaselineV2 withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 责任人用户ID。
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public BaselineV2 withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 责任人用户名称。
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public BaselineV2 withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 责任人租户ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public BaselineV2 withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 责任人租户名称。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public BaselineV2 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BaselineV2 withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * DataArts Studio实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BaselineV2 withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public BaselineV2 withSlaTaskIds(List<String> slaTaskIds) {
        this.slaTaskIds = slaTaskIds;
        return this;
    }

    public BaselineV2 addSlaTaskIdsItem(String slaTaskIdsItem) {
        if (this.slaTaskIds == null) {
            this.slaTaskIds = new ArrayList<>();
        }
        this.slaTaskIds.add(slaTaskIdsItem);
        return this;
    }

    public BaselineV2 withSlaTaskIds(Consumer<List<String>> slaTaskIdsSetter) {
        if (this.slaTaskIds == null) {
            this.slaTaskIds = new ArrayList<>();
        }
        slaTaskIdsSetter.accept(this.slaTaskIds);
        return this;
    }

    /**
     * 保障作业ID列表。
     * @return slaTaskIds
     */
    public List<String> getSlaTaskIds() {
        return slaTaskIds;
    }

    public void setSlaTaskIds(List<String> slaTaskIds) {
        this.slaTaskIds = slaTaskIds;
    }

    public BaselineV2 withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级。
     * minimum: 0
     * maximum: 100
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public BaselineV2 withSlaMin(Integer slaMin) {
        this.slaMin = slaMin;
        return this;
    }

    /**
     * 天基线承诺分钟。
     * minimum: 0
     * maximum: 59
     * @return slaMin
     */
    public Integer getSlaMin() {
        return slaMin;
    }

    public void setSlaMin(Integer slaMin) {
        this.slaMin = slaMin;
    }

    public BaselineV2 withBuffer(Integer buffer) {
        this.buffer = buffer;
        return this;
    }

    /**
     * 预警余量。
     * minimum: 0
     * maximum: 86400000
     * @return buffer
     */
    public Integer getBuffer() {
        return buffer;
    }

    public void setBuffer(Integer buffer) {
        this.buffer = buffer;
    }

    public BaselineV2 withSlaHour(Integer slaHour) {
        this.slaHour = slaHour;
        return this;
    }

    /**
     * 天基线承诺小时。
     * minimum: 0
     * maximum: 47
     * @return slaHour
     */
    public Integer getSlaHour() {
        return slaHour;
    }

    public void setSlaHour(Integer slaHour) {
        this.slaHour = slaHour;
    }

    public BaselineV2 withExpMin(Integer expMin) {
        this.expMin = expMin;
        return this;
    }

    /**
     * 天基线预警分钟。
     * minimum: 0
     * maximum: 59
     * @return expMin
     */
    public Integer getExpMin() {
        return expMin;
    }

    public void setExpMin(Integer expMin) {
        this.expMin = expMin;
    }

    public BaselineV2 withExpHour(Integer expHour) {
        this.expHour = expHour;
        return this;
    }

    /**
     * 天基线预警小时。
     * minimum: 0
     * maximum: 47
     * @return expHour
     */
    public Integer getExpHour() {
        return expHour;
    }

    public void setExpHour(Integer expHour) {
        this.expHour = expHour;
    }

    public BaselineV2 withHourExpDetail(String hourExpDetail) {
        this.hourExpDetail = hourExpDetail;
        return this;
    }

    /**
     * 小时基线的预警时间配置（JSON格式），key为周期号，value为hh:mm格式。hh的取值范围为[0,47]，mm的取值范围为[0,59]。
     * @return hourExpDetail
     */
    public String getHourExpDetail() {
        return hourExpDetail;
    }

    public void setHourExpDetail(String hourExpDetail) {
        this.hourExpDetail = hourExpDetail;
    }

    public BaselineV2 withHourSlaDetail(String hourSlaDetail) {
        this.hourSlaDetail = hourSlaDetail;
        return this;
    }

    /**
     * 小时基线的承诺时间配置（JSON格式），key为周期号，value为hh:mm格式。hh的取值范围为[0,47]，mm的取值范围为[0,59]。
     * @return hourSlaDetail
     */
    public String getHourSlaDetail() {
        return hourSlaDetail;
    }

    public void setHourSlaDetail(String hourSlaDetail) {
        this.hourSlaDetail = hourSlaDetail;
    }

    public BaselineV2 withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否生效。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public BaselineV2 withAlarmEnable(Boolean alarmEnable) {
        this.alarmEnable = alarmEnable;
        return this;
    }

    /**
     * 报警是否打开。
     * @return alarmEnable
     */
    public Boolean getAlarmEnable() {
        return alarmEnable;
    }

    public void setAlarmEnable(Boolean alarmEnable) {
        this.alarmEnable = alarmEnable;
    }

    public BaselineV2 withBaselineAlarmEnable(Boolean baselineAlarmEnable) {
        this.baselineAlarmEnable = baselineAlarmEnable;
        return this;
    }

    /**
     * 基线报警是否打开。
     * @return baselineAlarmEnable
     */
    public Boolean getBaselineAlarmEnable() {
        return baselineAlarmEnable;
    }

    public void setBaselineAlarmEnable(Boolean baselineAlarmEnable) {
        this.baselineAlarmEnable = baselineAlarmEnable;
    }

    public BaselineV2 withSmnTopics(List<SmnTopic> smnTopics) {
        this.smnTopics = smnTopics;
        return this;
    }

    public BaselineV2 addSmnTopicsItem(SmnTopic smnTopicsItem) {
        if (this.smnTopics == null) {
            this.smnTopics = new ArrayList<>();
        }
        this.smnTopics.add(smnTopicsItem);
        return this;
    }

    public BaselineV2 withSmnTopics(Consumer<List<SmnTopic>> smnTopicsSetter) {
        if (this.smnTopics == null) {
            this.smnTopics = new ArrayList<>();
        }
        smnTopicsSetter.accept(this.smnTopics);
        return this;
    }

    /**
     * SMN主题列表。
     * @return smnTopics
     */
    public List<SmnTopic> getSmnTopics() {
        return smnTopics;
    }

    public void setSmnTopics(List<SmnTopic> smnTopics) {
        this.smnTopics = smnTopics;
    }

    public BaselineV2 withEventAlarm(List<EventAlarmEnum> eventAlarm) {
        this.eventAlarm = eventAlarm;
        return this;
    }

    public BaselineV2 addEventAlarmItem(EventAlarmEnum eventAlarmItem) {
        if (this.eventAlarm == null) {
            this.eventAlarm = new ArrayList<>();
        }
        this.eventAlarm.add(eventAlarmItem);
        return this;
    }

    public BaselineV2 withEventAlarm(Consumer<List<EventAlarmEnum>> eventAlarmSetter) {
        if (this.eventAlarm == null) {
            this.eventAlarm = new ArrayList<>();
        }
        eventAlarmSetter.accept(this.eventAlarm);
        return this;
    }

    /**
     * 事件告警开启类型。
     * @return eventAlarm
     */
    public List<EventAlarmEnum> getEventAlarm() {
        return eventAlarm;
    }

    public void setEventAlarm(List<EventAlarmEnum> eventAlarm) {
        this.eventAlarm = eventAlarm;
    }

    public BaselineV2 withEventSmnTopics(List<SmnTopic> eventSmnTopics) {
        this.eventSmnTopics = eventSmnTopics;
        return this;
    }

    public BaselineV2 addEventSmnTopicsItem(SmnTopic eventSmnTopicsItem) {
        if (this.eventSmnTopics == null) {
            this.eventSmnTopics = new ArrayList<>();
        }
        this.eventSmnTopics.add(eventSmnTopicsItem);
        return this;
    }

    public BaselineV2 withEventSmnTopics(Consumer<List<SmnTopic>> eventSmnTopicsSetter) {
        if (this.eventSmnTopics == null) {
            this.eventSmnTopics = new ArrayList<>();
        }
        eventSmnTopicsSetter.accept(this.eventSmnTopics);
        return this;
    }

    /**
     * 事件告警SMN主题列表。
     * @return eventSmnTopics
     */
    public List<SmnTopic> getEventSmnTopics() {
        return eventSmnTopics;
    }

    public void setEventSmnTopics(List<SmnTopic> eventSmnTopics) {
        this.eventSmnTopics = eventSmnTopics;
    }

    public BaselineV2 withSignEnable(Boolean signEnable) {
        this.signEnable = signEnable;
        return this;
    }

    /**
     * 基线签署是否打开。
     * @return signEnable
     */
    public Boolean getSignEnable() {
        return signEnable;
    }

    public void setSignEnable(Boolean signEnable) {
        this.signEnable = signEnable;
    }

    public BaselineV2 withPeriod(List<PeriodSlaTimeV2> period) {
        this.period = period;
        return this;
    }

    public BaselineV2 addPeriodItem(PeriodSlaTimeV2 periodItem) {
        if (this.period == null) {
            this.period = new ArrayList<>();
        }
        this.period.add(periodItem);
        return this;
    }

    public BaselineV2 withPeriod(Consumer<List<PeriodSlaTimeV2>> periodSetter) {
        if (this.period == null) {
            this.period = new ArrayList<>();
        }
        periodSetter.accept(this.period);
        return this;
    }

    /**
     * 承诺时间周期列表，小时基线时生效。
     * @return period
     */
    public List<PeriodSlaTimeV2> getPeriod() {
        return period;
    }

    public void setPeriod(List<PeriodSlaTimeV2> period) {
        this.period = period;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaselineV2 that = (BaselineV2) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.version, that.version) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime) && Objects.equals(this.type, that.type)
            && Objects.equals(this.ownerId, that.ownerId) && Objects.equals(this.ownerName, that.ownerName)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.slaTaskIds, that.slaTaskIds)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.slaMin, that.slaMin)
            && Objects.equals(this.buffer, that.buffer) && Objects.equals(this.slaHour, that.slaHour)
            && Objects.equals(this.expMin, that.expMin) && Objects.equals(this.expHour, that.expHour)
            && Objects.equals(this.hourExpDetail, that.hourExpDetail)
            && Objects.equals(this.hourSlaDetail, that.hourSlaDetail) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.alarmEnable, that.alarmEnable)
            && Objects.equals(this.baselineAlarmEnable, that.baselineAlarmEnable)
            && Objects.equals(this.smnTopics, that.smnTopics) && Objects.equals(this.eventAlarm, that.eventAlarm)
            && Objects.equals(this.eventSmnTopics, that.eventSmnTopics)
            && Objects.equals(this.signEnable, that.signEnable) && Objects.equals(this.period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            version,
            createTime,
            lastUpdateTime,
            type,
            ownerId,
            ownerName,
            domainId,
            domainName,
            projectId,
            instanceId,
            workspaceId,
            slaTaskIds,
            priority,
            slaMin,
            buffer,
            slaHour,
            expMin,
            expHour,
            hourExpDetail,
            hourSlaDetail,
            enable,
            alarmEnable,
            baselineAlarmEnable,
            smnTopics,
            eventAlarm,
            eventSmnTopics,
            signEnable,
            period);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaselineV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    slaTaskIds: ").append(toIndentedString(slaTaskIds)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    slaMin: ").append(toIndentedString(slaMin)).append("\n");
        sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
        sb.append("    slaHour: ").append(toIndentedString(slaHour)).append("\n");
        sb.append("    expMin: ").append(toIndentedString(expMin)).append("\n");
        sb.append("    expHour: ").append(toIndentedString(expHour)).append("\n");
        sb.append("    hourExpDetail: ").append(toIndentedString(hourExpDetail)).append("\n");
        sb.append("    hourSlaDetail: ").append(toIndentedString(hourSlaDetail)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    alarmEnable: ").append(toIndentedString(alarmEnable)).append("\n");
        sb.append("    baselineAlarmEnable: ").append(toIndentedString(baselineAlarmEnable)).append("\n");
        sb.append("    smnTopics: ").append(toIndentedString(smnTopics)).append("\n");
        sb.append("    eventAlarm: ").append(toIndentedString(eventAlarm)).append("\n");
        sb.append("    eventSmnTopics: ").append(toIndentedString(eventSmnTopics)).append("\n");
        sb.append("    signEnable: ").append(toIndentedString(signEnable)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
