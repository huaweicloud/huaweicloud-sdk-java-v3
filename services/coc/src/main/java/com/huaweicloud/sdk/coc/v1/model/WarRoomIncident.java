package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WarRoom存储事件有关信息
 */
public class WarRoomIncident {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_id")

    private String incidentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_change_event")

    private Boolean isChangeEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private Long sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_level")

    private String failureLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_url")

    private String incidentUrl;

    public WarRoomIncident withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WarRoomIncident withIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }

    /**
     * 事件id
     * @return incidentId
     */
    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public WarRoomIncident withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * 告警id
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public WarRoomIncident withIsChangeEvent(Boolean isChangeEvent) {
        this.isChangeEvent = isChangeEvent;
        return this;
    }

    /**
     * 是否变更事件
     * @return isChangeEvent
     */
    public Boolean getIsChangeEvent() {
        return isChangeEvent;
    }

    public void setIsChangeEvent(Boolean isChangeEvent) {
        this.isChangeEvent = isChangeEvent;
    }

    public WarRoomIncident withSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 源id
     * minimum: 0
     * maximum: 9223372036854775807
     * @return sourceId
     */
    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public WarRoomIncident withFailureLevel(String failureLevel) {
        this.failureLevel = failureLevel;
        return this;
    }

    /**
     * 事件级别
     * @return failureLevel
     */
    public String getFailureLevel() {
        return failureLevel;
    }

    public void setFailureLevel(String failureLevel) {
        this.failureLevel = failureLevel;
    }

    public WarRoomIncident withIncidentUrl(String incidentUrl) {
        this.incidentUrl = incidentUrl;
        return this;
    }

    /**
     * 事件单号链接
     * @return incidentUrl
     */
    public String getIncidentUrl() {
        return incidentUrl;
    }

    public void setIncidentUrl(String incidentUrl) {
        this.incidentUrl = incidentUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WarRoomIncident that = (WarRoomIncident) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.incidentId, that.incidentId)
            && Objects.equals(this.alarmId, that.alarmId) && Objects.equals(this.isChangeEvent, that.isChangeEvent)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.failureLevel, that.failureLevel)
            && Objects.equals(this.incidentUrl, that.incidentUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, incidentId, alarmId, isChangeEvent, sourceId, failureLevel, incidentUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarRoomIncident {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    isChangeEvent: ").append(toIndentedString(isChangeEvent)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    failureLevel: ").append(toIndentedString(failureLevel)).append("\n");
        sb.append("    incidentUrl: ").append(toIndentedString(incidentUrl)).append("\n");
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
