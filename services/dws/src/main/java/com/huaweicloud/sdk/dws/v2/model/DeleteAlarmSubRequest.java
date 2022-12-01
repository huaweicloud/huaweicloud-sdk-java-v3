package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAlarmSubRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_sub_id")

    private String alarmSubId;

    public DeleteAlarmSubRequest withAlarmSubId(String alarmSubId) {
        this.alarmSubId = alarmSubId;
        return this;
    }

    /**
     * 告警订阅ID
     * @return alarmSubId
     */
    public String getAlarmSubId() {
        return alarmSubId;
    }

    public void setAlarmSubId(String alarmSubId) {
        this.alarmSubId = alarmSubId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAlarmSubRequest deleteAlarmSubRequest = (DeleteAlarmSubRequest) o;
        return Objects.equals(this.alarmSubId, deleteAlarmSubRequest.alarmSubId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmSubId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAlarmSubRequest {\n");
        sb.append("    alarmSubId: ").append(toIndentedString(alarmSubId)).append("\n");
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
