package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowNetworkDeviceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_device_id")

    private String networkDeviceId;

    public ShowNetworkDeviceRequest withNetworkDeviceId(String networkDeviceId) {
        this.networkDeviceId = networkDeviceId;
        return this;
    }

    /**
     * 网络设备ID
     * @return networkDeviceId
     */
    public String getNetworkDeviceId() {
        return networkDeviceId;
    }

    public void setNetworkDeviceId(String networkDeviceId) {
        this.networkDeviceId = networkDeviceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNetworkDeviceRequest that = (ShowNetworkDeviceRequest) obj;
        return Objects.equals(this.networkDeviceId, that.networkDeviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkDeviceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNetworkDeviceRequest {\n");
        sb.append("    networkDeviceId: ").append(toIndentedString(networkDeviceId)).append("\n");
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
