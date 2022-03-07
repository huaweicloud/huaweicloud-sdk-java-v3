package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateAlarmActionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PutAlarmActionsReq body;

    public UpdateAlarmActionRequest withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /** Alarm实例ID
     * 
     * @return alarmId */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public UpdateAlarmActionRequest withBody(PutAlarmActionsReq body) {
        this.body = body;
        return this;
    }

    public UpdateAlarmActionRequest withBody(Consumer<PutAlarmActionsReq> bodySetter) {
        if (this.body == null) {
            this.body = new PutAlarmActionsReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public PutAlarmActionsReq getBody() {
        return body;
    }

    public void setBody(PutAlarmActionsReq body) {
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
        UpdateAlarmActionRequest updateAlarmActionRequest = (UpdateAlarmActionRequest) o;
        return Objects.equals(this.alarmId, updateAlarmActionRequest.alarmId)
            && Objects.equals(this.body, updateAlarmActionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmActionRequest {\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
