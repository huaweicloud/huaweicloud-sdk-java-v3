package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListUserMfaDevicesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_mfa_devices")

    private List<MfaDeviceResult> virtualMfaDevices = null;

    public ListUserMfaDevicesResponse withVirtualMfaDevices(List<MfaDeviceResult> virtualMfaDevices) {
        this.virtualMfaDevices = virtualMfaDevices;
        return this;
    }

    public ListUserMfaDevicesResponse addVirtualMfaDevicesItem(MfaDeviceResult virtualMfaDevicesItem) {
        if (this.virtualMfaDevices == null) {
            this.virtualMfaDevices = new ArrayList<>();
        }
        this.virtualMfaDevices.add(virtualMfaDevicesItem);
        return this;
    }

    public ListUserMfaDevicesResponse withVirtualMfaDevices(Consumer<List<MfaDeviceResult>> virtualMfaDevicesSetter) {
        if (this.virtualMfaDevices == null) {
            this.virtualMfaDevices = new ArrayList<>();
        }
        virtualMfaDevicesSetter.accept(this.virtualMfaDevices);
        return this;
    }

    /**
     * 虚拟MFA设备信息列表。
     * @return virtualMfaDevices
     */
    public List<MfaDeviceResult> getVirtualMfaDevices() {
        return virtualMfaDevices;
    }

    public void setVirtualMfaDevices(List<MfaDeviceResult> virtualMfaDevices) {
        this.virtualMfaDevices = virtualMfaDevices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUserMfaDevicesResponse that = (ListUserMfaDevicesResponse) obj;
        return Objects.equals(this.virtualMfaDevices, that.virtualMfaDevices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualMfaDevices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserMfaDevicesResponse {\n");
        sb.append("    virtualMfaDevices: ").append(toIndentedString(virtualMfaDevices)).append("\n");
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
