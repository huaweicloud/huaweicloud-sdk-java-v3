package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDeviceTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_templates")

    @JacksonXmlProperty(localName = "device_templates")

    private List<EdgemgrDevice> deviceTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    public ListDeviceTemplatesResponse withDeviceTemplates(List<EdgemgrDevice> deviceTemplates) {
        this.deviceTemplates = deviceTemplates;
        return this;
    }

    public ListDeviceTemplatesResponse addDeviceTemplatesItem(EdgemgrDevice deviceTemplatesItem) {
        if (this.deviceTemplates == null) {
            this.deviceTemplates = new ArrayList<>();
        }
        this.deviceTemplates.add(deviceTemplatesItem);
        return this;
    }

    public ListDeviceTemplatesResponse withDeviceTemplates(Consumer<List<EdgemgrDevice>> deviceTemplatesSetter) {
        if (this.deviceTemplates == null) {
            this.deviceTemplates = new ArrayList<>();
        }
        deviceTemplatesSetter.accept(this.deviceTemplates);
        return this;
    }

    /**
     * 终端设备属性
     * @return deviceTemplates
     */
    public List<EdgemgrDevice> getDeviceTemplates() {
        return deviceTemplates;
    }

    public void setDeviceTemplates(List<EdgemgrDevice> deviceTemplates) {
        this.deviceTemplates = deviceTemplates;
    }

    public ListDeviceTemplatesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 模板数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDeviceTemplatesResponse listDeviceTemplatesResponse = (ListDeviceTemplatesResponse) o;
        return Objects.equals(this.deviceTemplates, listDeviceTemplatesResponse.deviceTemplates)
            && Objects.equals(this.count, listDeviceTemplatesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceTemplates, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeviceTemplatesResponse {\n");
        sb.append("    deviceTemplates: ").append(toIndentedString(deviceTemplates)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
