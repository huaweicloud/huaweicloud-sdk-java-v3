package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateOneClickAlarmResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "one_click_alarm_id")

    private String oneClickAlarmId;

    public CreateOneClickAlarmResponse withOneClickAlarmId(String oneClickAlarmId) {
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
        CreateOneClickAlarmResponse that = (CreateOneClickAlarmResponse) obj;
        return Objects.equals(this.oneClickAlarmId, that.oneClickAlarmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oneClickAlarmId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOneClickAlarmResponse {\n");
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
