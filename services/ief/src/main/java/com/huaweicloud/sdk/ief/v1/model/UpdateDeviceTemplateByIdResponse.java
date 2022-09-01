package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDeviceTemplateByIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_template")

    @JacksonXmlProperty(localName = "device_template")

    private EdgemgrDevice deviceTemplate;

    public UpdateDeviceTemplateByIdResponse withDeviceTemplate(EdgemgrDevice deviceTemplate) {
        this.deviceTemplate = deviceTemplate;
        return this;
    }

    public UpdateDeviceTemplateByIdResponse withDeviceTemplate(Consumer<EdgemgrDevice> deviceTemplateSetter) {
        if (this.deviceTemplate == null) {
            this.deviceTemplate = new EdgemgrDevice();
            deviceTemplateSetter.accept(this.deviceTemplate);
        }

        return this;
    }

    /**
     * Get deviceTemplate
     * @return deviceTemplate
     */
    public EdgemgrDevice getDeviceTemplate() {
        return deviceTemplate;
    }

    public void setDeviceTemplate(EdgemgrDevice deviceTemplate) {
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
        UpdateDeviceTemplateByIdResponse updateDeviceTemplateByIdResponse = (UpdateDeviceTemplateByIdResponse) o;
        return Objects.equals(this.deviceTemplate, updateDeviceTemplateByIdResponse.deviceTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeviceTemplateByIdResponse {\n");
        sb.append("    deviceTemplate: ").append(toIndentedString(deviceTemplate)).append("\n");
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
