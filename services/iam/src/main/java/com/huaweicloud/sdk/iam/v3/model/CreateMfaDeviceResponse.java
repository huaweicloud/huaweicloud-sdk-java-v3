package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateMfaDeviceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_mfa_device")

    @JacksonXmlProperty(localName = "virtual_mfa_device")

    private CreateMfaDeviceRespon virtualMfaDevice;

    public CreateMfaDeviceResponse withVirtualMfaDevice(CreateMfaDeviceRespon virtualMfaDevice) {
        this.virtualMfaDevice = virtualMfaDevice;
        return this;
    }

    public CreateMfaDeviceResponse withVirtualMfaDevice(Consumer<CreateMfaDeviceRespon> virtualMfaDeviceSetter) {
        if (this.virtualMfaDevice == null) {
            this.virtualMfaDevice = new CreateMfaDeviceRespon();
            virtualMfaDeviceSetter.accept(this.virtualMfaDevice);
        }

        return this;
    }

    /**
     * Get virtualMfaDevice
     * @return virtualMfaDevice
     */
    public CreateMfaDeviceRespon getVirtualMfaDevice() {
        return virtualMfaDevice;
    }

    public void setVirtualMfaDevice(CreateMfaDeviceRespon virtualMfaDevice) {
        this.virtualMfaDevice = virtualMfaDevice;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMfaDeviceResponse createMfaDeviceResponse = (CreateMfaDeviceResponse) o;
        return Objects.equals(this.virtualMfaDevice, createMfaDeviceResponse.virtualMfaDevice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualMfaDevice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMfaDeviceResponse {\n");
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
