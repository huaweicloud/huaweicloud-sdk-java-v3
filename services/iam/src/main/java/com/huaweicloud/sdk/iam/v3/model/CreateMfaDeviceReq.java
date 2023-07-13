package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class CreateMfaDeviceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_mfa_device")

    private CreateMfaDevice virtualMfaDevice;

    public CreateMfaDeviceReq withVirtualMfaDevice(CreateMfaDevice virtualMfaDevice) {
        this.virtualMfaDevice = virtualMfaDevice;
        return this;
    }

    public CreateMfaDeviceReq withVirtualMfaDevice(Consumer<CreateMfaDevice> virtualMfaDeviceSetter) {
        if (this.virtualMfaDevice == null) {
            this.virtualMfaDevice = new CreateMfaDevice();
            virtualMfaDeviceSetter.accept(this.virtualMfaDevice);
        }

        return this;
    }

    /**
     * Get virtualMfaDevice
     * @return virtualMfaDevice
     */
    public CreateMfaDevice getVirtualMfaDevice() {
        return virtualMfaDevice;
    }

    public void setVirtualMfaDevice(CreateMfaDevice virtualMfaDevice) {
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
        CreateMfaDeviceReq that = (CreateMfaDeviceReq) obj;
        return Objects.equals(this.virtualMfaDevice, that.virtualMfaDevice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualMfaDevice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMfaDeviceReq {\n");
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
