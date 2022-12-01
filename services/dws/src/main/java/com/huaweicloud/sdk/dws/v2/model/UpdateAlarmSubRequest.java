package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAlarmSubRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_sub_id")

    private String alarmSubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AlarmSubUpdateRequest body;

    public UpdateAlarmSubRequest withAlarmSubId(String alarmSubId) {
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

    public UpdateAlarmSubRequest withBody(AlarmSubUpdateRequest body) {
        this.body = body;
        return this;
    }

    public UpdateAlarmSubRequest withBody(Consumer<AlarmSubUpdateRequest> bodySetter) {
        if (this.body == null) {
            this.body = new AlarmSubUpdateRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AlarmSubUpdateRequest getBody() {
        return body;
    }

    public void setBody(AlarmSubUpdateRequest body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAlarmSubRequest updateAlarmSubRequest = (UpdateAlarmSubRequest) o;
        return Objects.equals(this.alarmSubId, updateAlarmSubRequest.alarmSubId)
            && Objects.equals(this.body, updateAlarmSubRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmSubId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmSubRequest {\n");
        sb.append("    alarmSubId: ").append(toIndentedString(alarmSubId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
