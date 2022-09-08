package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDeviceTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_template_id")

    private String deviceTemplateId;

    public ShowDeviceTemplateRequest withIefInstanceId(String iefInstanceId) {
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

    public ShowDeviceTemplateRequest withDeviceTemplateId(String deviceTemplateId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDeviceTemplateRequest showDeviceTemplateRequest = (ShowDeviceTemplateRequest) o;
        return Objects.equals(this.iefInstanceId, showDeviceTemplateRequest.iefInstanceId)
            && Objects.equals(this.deviceTemplateId, showDeviceTemplateRequest.deviceTemplateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, deviceTemplateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeviceTemplateRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    deviceTemplateId: ").append(toIndentedString(deviceTemplateId)).append("\n");
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
