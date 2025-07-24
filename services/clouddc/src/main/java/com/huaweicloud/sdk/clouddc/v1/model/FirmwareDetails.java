package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 固件详细信息
 */
public class FirmwareDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_name")

    private String componentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturer")

    private String manufacturer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public FirmwareDetails withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * 组件
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public FirmwareDetails withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 型号
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public FirmwareDetails withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * 制造商
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public FirmwareDetails withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FirmwareDetails that = (FirmwareDetails) obj;
        return Objects.equals(this.componentName, that.componentName) && Objects.equals(this.model, that.model)
            && Objects.equals(this.manufacturer, that.manufacturer) && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentName, model, manufacturer, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirmwareDetails {\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
