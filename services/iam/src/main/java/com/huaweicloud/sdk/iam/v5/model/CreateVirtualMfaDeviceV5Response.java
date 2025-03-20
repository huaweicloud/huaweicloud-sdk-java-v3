package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateVirtualMfaDeviceV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_mfa_device")

    private VirtualMfaDevice virtualMfaDevice;

    public CreateVirtualMfaDeviceV5Response withVirtualMfaDevice(VirtualMfaDevice virtualMfaDevice) {
        this.virtualMfaDevice = virtualMfaDevice;
        return this;
    }

    public CreateVirtualMfaDeviceV5Response withVirtualMfaDevice(Consumer<VirtualMfaDevice> virtualMfaDeviceSetter) {
        if (this.virtualMfaDevice == null) {
            this.virtualMfaDevice = new VirtualMfaDevice();
            virtualMfaDeviceSetter.accept(this.virtualMfaDevice);
        }

        return this;
    }

    /**
     * Get virtualMfaDevice
     * @return virtualMfaDevice
     */
    public VirtualMfaDevice getVirtualMfaDevice() {
        return virtualMfaDevice;
    }

    public void setVirtualMfaDevice(VirtualMfaDevice virtualMfaDevice) {
        this.virtualMfaDevice = virtualMfaDevice;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVirtualMfaDeviceV5Response that = (CreateVirtualMfaDeviceV5Response) obj;
        return Objects.equals(this.virtualMfaDevice, that.virtualMfaDevice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualMfaDevice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVirtualMfaDeviceV5Response {\n");
        sb.append("    virtualMfaDevice: ").append(toIndentedString(virtualMfaDevice)).append("\n");
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
