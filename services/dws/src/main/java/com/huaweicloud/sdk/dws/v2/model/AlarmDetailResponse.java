package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 告警详情。 **取值范围**： 不涉及。
 */
public class AlarmDetailResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_name")

    private String alarmName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private String alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_source")

    private String alarmSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_message")

    private String alarmMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_location")

    private String alarmLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id_name")

    private String resourceIdName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_generate_date")

    private String alarmGenerateDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_status")

    private String alarmStatus;

    public AlarmDetailResponse withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * **参数解释**： 告警定义ID。 **取值范围**： 不涉及。
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public AlarmDetailResponse withAlarmName(String alarmName) {
        this.alarmName = alarmName;
        return this;
    }

    /**
     * **参数解释**： 告警名称。 **取值范围**： 不涉及。
     * @return alarmName
     */
    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public AlarmDetailResponse withAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * **参数解释**： 告警级别。 **取值范围**： 不涉及。
     * @return alarmLevel
     */
    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public AlarmDetailResponse withAlarmSource(String alarmSource) {
        this.alarmSource = alarmSource;
        return this;
    }

    /**
     * **参数解释**： 告警服务。 **取值范围**： 不涉及。
     * @return alarmSource
     */
    public String getAlarmSource() {
        return alarmSource;
    }

    public void setAlarmSource(String alarmSource) {
        this.alarmSource = alarmSource;
    }

    public AlarmDetailResponse withAlarmMessage(String alarmMessage) {
        this.alarmMessage = alarmMessage;
        return this;
    }

    /**
     * **参数解释**： 告警消息。 **取值范围**： 不涉及。
     * @return alarmMessage
     */
    public String getAlarmMessage() {
        return alarmMessage;
    }

    public void setAlarmMessage(String alarmMessage) {
        this.alarmMessage = alarmMessage;
    }

    public AlarmDetailResponse withAlarmLocation(String alarmLocation) {
        this.alarmLocation = alarmLocation;
        return this;
    }

    /**
     * **参数解释**： 告警定位信息。 **取值范围**： 不涉及。
     * @return alarmLocation
     */
    public String getAlarmLocation() {
        return alarmLocation;
    }

    public void setAlarmLocation(String alarmLocation) {
        this.alarmLocation = alarmLocation;
    }

    public AlarmDetailResponse withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释**： 告警源ID。 **取值范围**： 不涉及。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public AlarmDetailResponse withResourceIdName(String resourceIdName) {
        this.resourceIdName = resourceIdName;
        return this;
    }

    /**
     * **参数解释**： 告警源名称。 **取值范围**： 不涉及。
     * @return resourceIdName
     */
    public String getResourceIdName() {
        return resourceIdName;
    }

    public void setResourceIdName(String resourceIdName) {
        this.resourceIdName = resourceIdName;
    }

    public AlarmDetailResponse withAlarmGenerateDate(String alarmGenerateDate) {
        this.alarmGenerateDate = alarmGenerateDate;
        return this;
    }

    /**
     * **参数解释**： 告警日期。 **取值范围**： 不涉及。
     * @return alarmGenerateDate
     */
    public String getAlarmGenerateDate() {
        return alarmGenerateDate;
    }

    public void setAlarmGenerateDate(String alarmGenerateDate) {
        this.alarmGenerateDate = alarmGenerateDate;
    }

    public AlarmDetailResponse withAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    /**
     * **参数解释**： 告警状态。 **取值范围**： - 0：未恢复。 - 1：已恢复。
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmDetailResponse that = (AlarmDetailResponse) obj;
        return Objects.equals(this.alarmId, that.alarmId) && Objects.equals(this.alarmName, that.alarmName)
            && Objects.equals(this.alarmLevel, that.alarmLevel) && Objects.equals(this.alarmSource, that.alarmSource)
            && Objects.equals(this.alarmMessage, that.alarmMessage)
            && Objects.equals(this.alarmLocation, that.alarmLocation)
            && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceIdName, that.resourceIdName)
            && Objects.equals(this.alarmGenerateDate, that.alarmGenerateDate)
            && Objects.equals(this.alarmStatus, that.alarmStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmId,
            alarmName,
            alarmLevel,
            alarmSource,
            alarmMessage,
            alarmLocation,
            resourceId,
            resourceIdName,
            alarmGenerateDate,
            alarmStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmDetailResponse {\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    alarmName: ").append(toIndentedString(alarmName)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    alarmSource: ").append(toIndentedString(alarmSource)).append("\n");
        sb.append("    alarmMessage: ").append(toIndentedString(alarmMessage)).append("\n");
        sb.append("    alarmLocation: ").append(toIndentedString(alarmLocation)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceIdName: ").append(toIndentedString(resourceIdName)).append("\n");
        sb.append("    alarmGenerateDate: ").append(toIndentedString(alarmGenerateDate)).append("\n");
        sb.append("    alarmStatus: ").append(toIndentedString(alarmStatus)).append("\n");
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
