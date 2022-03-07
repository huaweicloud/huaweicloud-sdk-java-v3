package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class AddAlarmResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ResourcesReqV2 body;

    public AddAlarmResourcesRequest withAlarmId(String alarmId) {
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

    public AddAlarmResourcesRequest withBody(ResourcesReqV2 body) {
        this.body = body;
        return this;
    }

    public AddAlarmResourcesRequest withBody(Consumer<ResourcesReqV2> bodySetter) {
        if (this.body == null) {
            this.body = new ResourcesReqV2();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ResourcesReqV2 getBody() {
        return body;
    }

    public void setBody(ResourcesReqV2 body) {
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
        AddAlarmResourcesRequest addAlarmResourcesRequest = (AddAlarmResourcesRequest) o;
        return Objects.equals(this.alarmId, addAlarmResourcesRequest.alarmId)
            && Objects.equals(this.body, addAlarmResourcesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddAlarmResourcesRequest {\n");
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
