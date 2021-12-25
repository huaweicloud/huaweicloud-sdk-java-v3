package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 设备模板 */
public class DeviceTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_template")

    private EdgemgrDeviceReq deviceTemplate;

    public DeviceTemplate withDeviceTemplate(EdgemgrDeviceReq deviceTemplate) {
        this.deviceTemplate = deviceTemplate;
        return this;
    }

    public DeviceTemplate withDeviceTemplate(Consumer<EdgemgrDeviceReq> deviceTemplateSetter) {
        if (this.deviceTemplate == null) {
            this.deviceTemplate = new EdgemgrDeviceReq();
            deviceTemplateSetter.accept(this.deviceTemplate);
        }

        return this;
    }

    /** Get deviceTemplate
     * 
     * @return deviceTemplate */
    public EdgemgrDeviceReq getDeviceTemplate() {
        return deviceTemplate;
    }

    public void setDeviceTemplate(EdgemgrDeviceReq deviceTemplate) {
        this.deviceTemplate = deviceTemplate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceTemplate deviceTemplate = (DeviceTemplate) o;
        return Objects.equals(this.deviceTemplate, deviceTemplate.deviceTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceTemplate {\n");
        sb.append("    deviceTemplate: ").append(toIndentedString(deviceTemplate)).append("\n");
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
