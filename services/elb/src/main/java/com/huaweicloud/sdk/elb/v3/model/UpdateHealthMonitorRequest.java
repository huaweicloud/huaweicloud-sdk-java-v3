package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateHealthMonitorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor_id")

    private String healthmonitorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateHealthMonitorRequestBody body;

    public UpdateHealthMonitorRequest withHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
        return this;
    }

    /** 健康检查ID
     * 
     * @return healthmonitorId */
    public String getHealthmonitorId() {
        return healthmonitorId;
    }

    public void setHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
    }

    public UpdateHealthMonitorRequest withBody(UpdateHealthMonitorRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateHealthMonitorRequest withBody(Consumer<UpdateHealthMonitorRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateHealthMonitorRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateHealthMonitorRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateHealthMonitorRequestBody body) {
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
        UpdateHealthMonitorRequest updateHealthMonitorRequest = (UpdateHealthMonitorRequest) o;
        return Objects.equals(this.healthmonitorId, updateHealthMonitorRequest.healthmonitorId)
            && Objects.equals(this.body, updateHealthMonitorRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthmonitorId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHealthMonitorRequest {\n");
        sb.append("    healthmonitorId: ").append(toIndentedString(healthmonitorId)).append("\n");
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
