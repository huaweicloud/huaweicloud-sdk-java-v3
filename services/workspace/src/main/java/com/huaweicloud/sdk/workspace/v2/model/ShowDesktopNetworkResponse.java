package com.huaweicloud.sdk.workspace.v2.model;

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
public class ShowDesktopNetworkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_id")

    private String computerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_infos")

    private List<NetworkInfo> networkInfos = null;

    public ShowDesktopNetworkResponse withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 桌面名称
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public ShowDesktopNetworkResponse withComputerId(String computerId) {
        this.computerId = computerId;
        return this;
    }

    /**
     * 桌面ID
     * @return computerId
     */
    public String getComputerId() {
        return computerId;
    }

    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }

    public ShowDesktopNetworkResponse withNetworkInfos(List<NetworkInfo> networkInfos) {
        this.networkInfos = networkInfos;
        return this;
    }

    public ShowDesktopNetworkResponse addNetworkInfosItem(NetworkInfo networkInfosItem) {
        if (this.networkInfos == null) {
            this.networkInfos = new ArrayList<>();
        }
        this.networkInfos.add(networkInfosItem);
        return this;
    }

    public ShowDesktopNetworkResponse withNetworkInfos(Consumer<List<NetworkInfo>> networkInfosSetter) {
        if (this.networkInfos == null) {
            this.networkInfos = new ArrayList<>();
        }
        networkInfosSetter.accept(this.networkInfos);
        return this;
    }

    /**
     * 桌面网络信息
     * @return networkInfos
     */
    public List<NetworkInfo> getNetworkInfos() {
        return networkInfos;
    }

    public void setNetworkInfos(List<NetworkInfo> networkInfos) {
        this.networkInfos = networkInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDesktopNetworkResponse that = (ShowDesktopNetworkResponse) obj;
        return Objects.equals(this.computerName, that.computerName) && Objects.equals(this.computerId, that.computerId)
            && Objects.equals(this.networkInfos, that.networkInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computerName, computerId, networkInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDesktopNetworkResponse {\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    computerId: ").append(toIndentedString(computerId)).append("\n");
        sb.append("    networkInfos: ").append(toIndentedString(networkInfos)).append("\n");
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
