package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云外资产IP扩展信息
 */
public class OcaIpExtendProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private OcaIpDevice device;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system")

    private OcaIpSystem system;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "services")

    private List<OcaIpService> services = null;

    public OcaIpExtendProperties withDevice(OcaIpDevice device) {
        this.device = device;
        return this;
    }

    public OcaIpExtendProperties withDevice(Consumer<OcaIpDevice> deviceSetter) {
        if (this.device == null) {
            this.device = new OcaIpDevice();
            deviceSetter.accept(this.device);
        }

        return this;
    }

    /**
     * Get device
     * @return device
     */
    public OcaIpDevice getDevice() {
        return device;
    }

    public void setDevice(OcaIpDevice device) {
        this.device = device;
    }

    public OcaIpExtendProperties withSystem(OcaIpSystem system) {
        this.system = system;
        return this;
    }

    public OcaIpExtendProperties withSystem(Consumer<OcaIpSystem> systemSetter) {
        if (this.system == null) {
            this.system = new OcaIpSystem();
            systemSetter.accept(this.system);
        }

        return this;
    }

    /**
     * Get system
     * @return system
     */
    public OcaIpSystem getSystem() {
        return system;
    }

    public void setSystem(OcaIpSystem system) {
        this.system = system;
    }

    public OcaIpExtendProperties withServices(List<OcaIpService> services) {
        this.services = services;
        return this;
    }

    public OcaIpExtendProperties addServicesItem(OcaIpService servicesItem) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        this.services.add(servicesItem);
        return this;
    }

    public OcaIpExtendProperties withServices(Consumer<List<OcaIpService>> servicesSetter) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        servicesSetter.accept(this.services);
        return this;
    }

    /**
     * 应用信息
     * @return services
     */
    public List<OcaIpService> getServices() {
        return services;
    }

    public void setServices(List<OcaIpService> services) {
        this.services = services;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OcaIpExtendProperties that = (OcaIpExtendProperties) obj;
        return Objects.equals(this.device, that.device) && Objects.equals(this.system, that.system)
            && Objects.equals(this.services, that.services);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device, system, services);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OcaIpExtendProperties {\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
