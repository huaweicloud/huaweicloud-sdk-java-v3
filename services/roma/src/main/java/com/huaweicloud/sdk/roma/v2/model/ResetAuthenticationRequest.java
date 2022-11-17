package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ResetAuthenticationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private Integer deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ResetAuthenticationRequestBody body;

    public ResetAuthenticationRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ResetAuthenticationRequest withDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备ID
     * minimum: 0
     * maximum: 200376420520689663
     * @return deviceId
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public ResetAuthenticationRequest withBody(ResetAuthenticationRequestBody body) {
        this.body = body;
        return this;
    }

    public ResetAuthenticationRequest withBody(Consumer<ResetAuthenticationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ResetAuthenticationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ResetAuthenticationRequestBody getBody() {
        return body;
    }

    public void setBody(ResetAuthenticationRequestBody body) {
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
        ResetAuthenticationRequest resetAuthenticationRequest = (ResetAuthenticationRequest) o;
        return Objects.equals(this.instanceId, resetAuthenticationRequest.instanceId)
            && Objects.equals(this.deviceId, resetAuthenticationRequest.deviceId)
            && Objects.equals(this.body, resetAuthenticationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, deviceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetAuthenticationRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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
