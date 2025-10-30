package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNetworkDeviceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_device")

    private NetworkDevice networkDevice;

    public ShowNetworkDeviceResponse withNetworkDevice(NetworkDevice networkDevice) {
        this.networkDevice = networkDevice;
        return this;
    }

    public ShowNetworkDeviceResponse withNetworkDevice(Consumer<NetworkDevice> networkDeviceSetter) {
        if (this.networkDevice == null) {
            this.networkDevice = new NetworkDevice();
            networkDeviceSetter.accept(this.networkDevice);
        }

        return this;
    }

    /**
     * Get networkDevice
     * @return networkDevice
     */
    public NetworkDevice getNetworkDevice() {
        return networkDevice;
    }

    public void setNetworkDevice(NetworkDevice networkDevice) {
        this.networkDevice = networkDevice;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNetworkDeviceResponse that = (ShowNetworkDeviceResponse) obj;
        return Objects.equals(this.networkDevice, that.networkDevice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkDevice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNetworkDeviceResponse {\n");
        sb.append("    networkDevice: ").append(toIndentedString(networkDevice)).append("\n");
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
