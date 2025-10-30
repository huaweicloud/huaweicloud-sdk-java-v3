package com.huaweicloud.sdk.cloudpond.v2.model;

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
public class ListNetworkDevicesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_devices")

    private List<NetworkDevice> networkDevices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListNetworkDevicesResponse withNetworkDevices(List<NetworkDevice> networkDevices) {
        this.networkDevices = networkDevices;
        return this;
    }

    public ListNetworkDevicesResponse addNetworkDevicesItem(NetworkDevice networkDevicesItem) {
        if (this.networkDevices == null) {
            this.networkDevices = new ArrayList<>();
        }
        this.networkDevices.add(networkDevicesItem);
        return this;
    }

    public ListNetworkDevicesResponse withNetworkDevices(Consumer<List<NetworkDevice>> networkDevicesSetter) {
        if (this.networkDevices == null) {
            this.networkDevices = new ArrayList<>();
        }
        networkDevicesSetter.accept(this.networkDevices);
        return this;
    }

    /**
     * 网络设备列表
     * @return networkDevices
     */
    public List<NetworkDevice> getNetworkDevices() {
        return networkDevices;
    }

    public void setNetworkDevices(List<NetworkDevice> networkDevices) {
        this.networkDevices = networkDevices;
    }

    public ListNetworkDevicesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListNetworkDevicesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNetworkDevicesResponse that = (ListNetworkDevicesResponse) obj;
        return Objects.equals(this.networkDevices, that.networkDevices) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkDevices, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNetworkDevicesResponse {\n");
        sb.append("    networkDevices: ").append(toIndentedString(networkDevices)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
