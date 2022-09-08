package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDeviceTemplateByIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_template_id")

    private String deviceTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeviceTemplateUpdate body;

    public UpdateDeviceTemplateByIdRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /**
     * 铂金版实例ID，专业版实例为空值
     * @return iefInstanceId
     */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public UpdateDeviceTemplateByIdRequest withDeviceTemplateId(String deviceTemplateId) {
        this.deviceTemplateId = deviceTemplateId;
        return this;
    }

    /**
     * 设备模板ID
     * @return deviceTemplateId
     */
    public String getDeviceTemplateId() {
        return deviceTemplateId;
    }

    public void setDeviceTemplateId(String deviceTemplateId) {
        this.deviceTemplateId = deviceTemplateId;
    }

    public UpdateDeviceTemplateByIdRequest withBody(DeviceTemplateUpdate body) {
        this.body = body;
        return this;
    }

    public UpdateDeviceTemplateByIdRequest withBody(Consumer<DeviceTemplateUpdate> bodySetter) {
        if (this.body == null) {
            this.body = new DeviceTemplateUpdate();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeviceTemplateUpdate getBody() {
        return body;
    }

    public void setBody(DeviceTemplateUpdate body) {
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
        UpdateDeviceTemplateByIdRequest updateDeviceTemplateByIdRequest = (UpdateDeviceTemplateByIdRequest) o;
        return Objects.equals(this.iefInstanceId, updateDeviceTemplateByIdRequest.iefInstanceId)
            && Objects.equals(this.deviceTemplateId, updateDeviceTemplateByIdRequest.deviceTemplateId)
            && Objects.equals(this.body, updateDeviceTemplateByIdRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, deviceTemplateId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeviceTemplateByIdRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    deviceTemplateId: ").append(toIndentedString(deviceTemplateId)).append("\n");
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
