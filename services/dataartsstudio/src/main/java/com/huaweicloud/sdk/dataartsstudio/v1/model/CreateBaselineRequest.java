package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateBaselineRequest
 */
public class CreateBaselineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_task_ids")

    private List<String> slaTaskIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buffer")

    private Integer buffer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_enable")

    private Boolean alarmEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_enable")

    private Boolean signEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_hour")

    private String slaHour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_min")

    private String slaMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_alarm_enable")

    private Boolean baselineAlarmEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_topics")

    private List<SmnTopicRequest> smnTopics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_smn_topics")

    private List<SmnTopicRequest> eventSmnTopics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_alarm")

    private List<String> eventAlarm = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private List<PeriodObject> period = null;

    public CreateBaselineRequest withWorkspaceId(String workspaceId) {
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

    public CreateBaselineRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 基线任务名称。只能包含：英文字母、数字、中文、中划线、下划线和点号，且长度不超过128位。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateBaselineRequest withOwnerName(String ownerName) {
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

    public CreateBaselineRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 基线任务类型。取值为 DAY和HOUR。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateBaselineRequest withSlaTaskIds(List<String> slaTaskIds) {
        this.slaTaskIds = slaTaskIds;
        return this;
    }

    public CreateBaselineRequest addSlaTaskIdsItem(String slaTaskIdsItem) {
        if (this.slaTaskIds == null) {
            this.slaTaskIds = new ArrayList<>();
        }
        this.slaTaskIds.add(slaTaskIdsItem);
        return this;
    }

    public CreateBaselineRequest withSlaTaskIds(Consumer<List<String>> slaTaskIdsSetter) {
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

    public CreateBaselineRequest withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级，取值范围是1到5。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public CreateBaselineRequest withBuffer(Integer buffer) {
        this.buffer = buffer;
        return this;
    }

    /**
     * 预警余量。单位毫秒，取值范围在0到86400000之间，且必须是整数分钟级别的毫秒。
     * @return buffer
     */
    public Integer getBuffer() {
        return buffer;
    }

    public void setBuffer(Integer buffer) {
        this.buffer = buffer;
    }

    public CreateBaselineRequest withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否生效，取值为true或者false。默认为true。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public CreateBaselineRequest withAlarmEnable(Boolean alarmEnable) {
        this.alarmEnable = alarmEnable;
        return this;
    }

    /**
     * 报警是否打开，取值为true或者false，默认为true。
     * @return alarmEnable
     */
    public Boolean getAlarmEnable() {
        return alarmEnable;
    }

    public void setAlarmEnable(Boolean alarmEnable) {
        this.alarmEnable = alarmEnable;
    }

    public CreateBaselineRequest withSignEnable(Boolean signEnable) {
        this.signEnable = signEnable;
        return this;
    }

    /**
     * 基线签署是否打开，取值为true或者false。默认为false。
     * @return signEnable
     */
    public Boolean getSignEnable() {
        return signEnable;
    }

    public void setSignEnable(Boolean signEnable) {
        this.signEnable = signEnable;
    }

    public CreateBaselineRequest withSlaHour(String slaHour) {
        this.slaHour = slaHour;
        return this;
    }

    /**
     * 天基线承诺小时。
     * @return slaHour
     */
    public String getSlaHour() {
        return slaHour;
    }

    public void setSlaHour(String slaHour) {
        this.slaHour = slaHour;
    }

    public CreateBaselineRequest withSlaMin(String slaMin) {
        this.slaMin = slaMin;
        return this;
    }

    /**
     * 天基线承诺分钟。
     * @return slaMin
     */
    public String getSlaMin() {
        return slaMin;
    }

    public void setSlaMin(String slaMin) {
        this.slaMin = slaMin;
    }

    public CreateBaselineRequest withBaselineAlarmEnable(Boolean baselineAlarmEnable) {
        this.baselineAlarmEnable = baselineAlarmEnable;
        return this;
    }

    /**
     * 基线报警是否打开，取值为true或者false。
     * @return baselineAlarmEnable
     */
    public Boolean getBaselineAlarmEnable() {
        return baselineAlarmEnable;
    }

    public void setBaselineAlarmEnable(Boolean baselineAlarmEnable) {
        this.baselineAlarmEnable = baselineAlarmEnable;
    }

    public CreateBaselineRequest withSmnTopics(List<SmnTopicRequest> smnTopics) {
        this.smnTopics = smnTopics;
        return this;
    }

    public CreateBaselineRequest addSmnTopicsItem(SmnTopicRequest smnTopicsItem) {
        if (this.smnTopics == null) {
            this.smnTopics = new ArrayList<>();
        }
        this.smnTopics.add(smnTopicsItem);
        return this;
    }

    public CreateBaselineRequest withSmnTopics(Consumer<List<SmnTopicRequest>> smnTopicsSetter) {
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
    public List<SmnTopicRequest> getSmnTopics() {
        return smnTopics;
    }

    public void setSmnTopics(List<SmnTopicRequest> smnTopics) {
        this.smnTopics = smnTopics;
    }

    public CreateBaselineRequest withEventSmnTopics(List<SmnTopicRequest> eventSmnTopics) {
        this.eventSmnTopics = eventSmnTopics;
        return this;
    }

    public CreateBaselineRequest addEventSmnTopicsItem(SmnTopicRequest eventSmnTopicsItem) {
        if (this.eventSmnTopics == null) {
            this.eventSmnTopics = new ArrayList<>();
        }
        this.eventSmnTopics.add(eventSmnTopicsItem);
        return this;
    }

    public CreateBaselineRequest withEventSmnTopics(Consumer<List<SmnTopicRequest>> eventSmnTopicsSetter) {
        if (this.eventSmnTopics == null) {
            this.eventSmnTopics = new ArrayList<>();
        }
        eventSmnTopicsSetter.accept(this.eventSmnTopics);
        return this;
    }

    /**
     * 事件报警信息。
     * @return eventSmnTopics
     */
    public List<SmnTopicRequest> getEventSmnTopics() {
        return eventSmnTopics;
    }

    public void setEventSmnTopics(List<SmnTopicRequest> eventSmnTopics) {
        this.eventSmnTopics = eventSmnTopics;
    }

    public CreateBaselineRequest withEventAlarm(List<String> eventAlarm) {
        this.eventAlarm = eventAlarm;
        return this;
    }

    public CreateBaselineRequest addEventAlarmItem(String eventAlarmItem) {
        if (this.eventAlarm == null) {
            this.eventAlarm = new ArrayList<>();
        }
        this.eventAlarm.add(eventAlarmItem);
        return this;
    }

    public CreateBaselineRequest withEventAlarm(Consumer<List<String>> eventAlarmSetter) {
        if (this.eventAlarm == null) {
            this.eventAlarm = new ArrayList<>();
        }
        eventAlarmSetter.accept(this.eventAlarm);
        return this;
    }

    /**
     * 事件告警开启类型，取值为ERROR：出错，SLOW_DOWN：变慢。
     * @return eventAlarm
     */
    public List<String> getEventAlarm() {
        return eventAlarm;
    }

    public void setEventAlarm(List<String> eventAlarm) {
        this.eventAlarm = eventAlarm;
    }

    public CreateBaselineRequest withPeriod(List<PeriodObject> period) {
        this.period = period;
        return this;
    }

    public CreateBaselineRequest addPeriodItem(PeriodObject periodItem) {
        if (this.period == null) {
            this.period = new ArrayList<>();
        }
        this.period.add(periodItem);
        return this;
    }

    public CreateBaselineRequest withPeriod(Consumer<List<PeriodObject>> periodSetter) {
        if (this.period == null) {
            this.period = new ArrayList<>();
        }
        periodSetter.accept(this.period);
        return this;
    }

    /**
     * 当type取值为HOUR时，该值需要填写。
     * @return period
     */
    public List<PeriodObject> getPeriod() {
        return period;
    }

    public void setPeriod(List<PeriodObject> period) {
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
        CreateBaselineRequest that = (CreateBaselineRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.ownerName, that.ownerName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.slaTaskIds, that.slaTaskIds) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.buffer, that.buffer) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.alarmEnable, that.alarmEnable) && Objects.equals(this.signEnable, that.signEnable)
            && Objects.equals(this.slaHour, that.slaHour) && Objects.equals(this.slaMin, that.slaMin)
            && Objects.equals(this.baselineAlarmEnable, that.baselineAlarmEnable)
            && Objects.equals(this.smnTopics, that.smnTopics)
            && Objects.equals(this.eventSmnTopics, that.eventSmnTopics)
            && Objects.equals(this.eventAlarm, that.eventAlarm) && Objects.equals(this.period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId,
            name,
            ownerName,
            type,
            slaTaskIds,
            priority,
            buffer,
            enable,
            alarmEnable,
            signEnable,
            slaHour,
            slaMin,
            baselineAlarmEnable,
            smnTopics,
            eventSmnTopics,
            eventAlarm,
            period);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBaselineRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    slaTaskIds: ").append(toIndentedString(slaTaskIds)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    alarmEnable: ").append(toIndentedString(alarmEnable)).append("\n");
        sb.append("    signEnable: ").append(toIndentedString(signEnable)).append("\n");
        sb.append("    slaHour: ").append(toIndentedString(slaHour)).append("\n");
        sb.append("    slaMin: ").append(toIndentedString(slaMin)).append("\n");
        sb.append("    baselineAlarmEnable: ").append(toIndentedString(baselineAlarmEnable)).append("\n");
        sb.append("    smnTopics: ").append(toIndentedString(smnTopics)).append("\n");
        sb.append("    eventSmnTopics: ").append(toIndentedString(eventSmnTopics)).append("\n");
        sb.append("    eventAlarm: ").append(toIndentedString(eventAlarm)).append("\n");
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
