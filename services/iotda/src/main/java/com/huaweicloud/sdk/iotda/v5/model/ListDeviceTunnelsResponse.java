package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListDeviceTunnelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnels")

    private List<TunnelInfo> tunnels = null;

    public ListDeviceTunnelsResponse withTunnels(List<TunnelInfo> tunnels) {
        this.tunnels = tunnels;
        return this;
    }

    public ListDeviceTunnelsResponse addTunnelsItem(TunnelInfo tunnelsItem) {
        if (this.tunnels == null) {
            this.tunnels = new ArrayList<>();
        }
        this.tunnels.add(tunnelsItem);
        return this;
    }

    public ListDeviceTunnelsResponse withTunnels(Consumer<List<TunnelInfo>> tunnelsSetter) {
        if (this.tunnels == null) {
            this.tunnels = new ArrayList<>();
        }
        tunnelsSetter.accept(this.tunnels);
        return this;
    }

    /**
     * 隧道信息列表。
     * @return tunnels
     */
    public List<TunnelInfo> getTunnels() {
        return tunnels;
    }

    public void setTunnels(List<TunnelInfo> tunnels) {
        this.tunnels = tunnels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDeviceTunnelsResponse that = (ListDeviceTunnelsResponse) obj;
        return Objects.equals(this.tunnels, that.tunnels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tunnels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeviceTunnelsResponse {\n");
        sb.append("    tunnels: ").append(toIndentedString(tunnels)).append("\n");
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
