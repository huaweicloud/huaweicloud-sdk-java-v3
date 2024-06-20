package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 预调配模板设备资源结构体。
 */
public class TemplateResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private DeviceResource device;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private PolicyResource policy;

    public TemplateResource withDevice(DeviceResource device) {
        this.device = device;
        return this;
    }

    public TemplateResource withDevice(Consumer<DeviceResource> deviceSetter) {
        if (this.device == null) {
            this.device = new DeviceResource();
            deviceSetter.accept(this.device);
        }

        return this;
    }

    /**
     * Get device
     * @return device
     */
    public DeviceResource getDevice() {
        return device;
    }

    public void setDevice(DeviceResource device) {
        this.device = device;
    }

    public TemplateResource withPolicy(PolicyResource policy) {
        this.policy = policy;
        return this;
    }

    public TemplateResource withPolicy(Consumer<PolicyResource> policySetter) {
        if (this.policy == null) {
            this.policy = new PolicyResource();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public PolicyResource getPolicy() {
        return policy;
    }

    public void setPolicy(PolicyResource policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateResource that = (TemplateResource) obj;
        return Objects.equals(this.device, that.device) && Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device, policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateResource {\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
