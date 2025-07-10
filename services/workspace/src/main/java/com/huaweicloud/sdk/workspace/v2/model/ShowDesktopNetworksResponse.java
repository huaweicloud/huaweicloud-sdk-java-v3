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
public class ShowDesktopNetworksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networks")

    private List<DesktopNetworkResult> networks = null;

    public ShowDesktopNetworksResponse withNetworks(List<DesktopNetworkResult> networks) {
        this.networks = networks;
        return this;
    }

    public ShowDesktopNetworksResponse addNetworksItem(DesktopNetworkResult networksItem) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        this.networks.add(networksItem);
        return this;
    }

    public ShowDesktopNetworksResponse withNetworks(Consumer<List<DesktopNetworkResult>> networksSetter) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        networksSetter.accept(this.networks);
        return this;
    }

    /**
     * 桌面网络信息列表。
     * @return networks
     */
    public List<DesktopNetworkResult> getNetworks() {
        return networks;
    }

    public void setNetworks(List<DesktopNetworkResult> networks) {
        this.networks = networks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDesktopNetworksResponse that = (ShowDesktopNetworksResponse) obj;
        return Objects.equals(this.networks, that.networks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDesktopNetworksResponse {\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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
