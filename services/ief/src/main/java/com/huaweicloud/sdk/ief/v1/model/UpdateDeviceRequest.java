package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateDeviceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EdgemgrDevicesUpdate body;

    public UpdateDeviceRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /** 铂金版实例ID，专业版实例为空值
     * 
     * @return iefInstanceId */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public UpdateDeviceRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /** 设备ID
     * 
     * @return deviceId */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public UpdateDeviceRequest withBody(EdgemgrDevicesUpdate body) {
        this.body = body;
        return this;
    }

    public UpdateDeviceRequest withBody(Consumer<EdgemgrDevicesUpdate> bodySetter) {
        if (this.body == null) {
            this.body = new EdgemgrDevicesUpdate();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public EdgemgrDevicesUpdate getBody() {
        return body;
    }

    public void setBody(EdgemgrDevicesUpdate body) {
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
        UpdateDeviceRequest updateDeviceRequest = (UpdateDeviceRequest) o;
        return Objects.equals(this.iefInstanceId, updateDeviceRequest.iefInstanceId)
            && Objects.equals(this.deviceId, updateDeviceRequest.deviceId)
            && Objects.equals(this.body, updateDeviceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, deviceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeviceRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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
