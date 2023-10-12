package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListOneClickAlarmRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "one_click_alarm_id")

    private String oneClickAlarmId;

    public ListOneClickAlarmRulesRequest withOneClickAlarmId(String oneClickAlarmId) {
        this.oneClickAlarmId = oneClickAlarmId;
        return this;
    }

    /**
     * 一键告警ID
     * @return oneClickAlarmId
     */
    public String getOneClickAlarmId() {
        return oneClickAlarmId;
    }

    public void setOneClickAlarmId(String oneClickAlarmId) {
        this.oneClickAlarmId = oneClickAlarmId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOneClickAlarmRulesRequest that = (ListOneClickAlarmRulesRequest) obj;
        return Objects.equals(this.oneClickAlarmId, that.oneClickAlarmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oneClickAlarmId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOneClickAlarmRulesRequest {\n");
        sb.append("    oneClickAlarmId: ").append(toIndentedString(oneClickAlarmId)).append("\n");
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
