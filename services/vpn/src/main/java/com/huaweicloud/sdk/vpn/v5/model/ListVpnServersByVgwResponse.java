package com.huaweicloud.sdk.vpn.v5.model;

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
public class ListVpnServersByVgwResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_servers")

    private List<ShowServerResponse> vpnServers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header-response-token")

    private String headerResponseToken;

    public ListVpnServersByVgwResponse withVpnServers(List<ShowServerResponse> vpnServers) {
        this.vpnServers = vpnServers;
        return this;
    }

    public ListVpnServersByVgwResponse addVpnServersItem(ShowServerResponse vpnServersItem) {
        if (this.vpnServers == null) {
            this.vpnServers = new ArrayList<>();
        }
        this.vpnServers.add(vpnServersItem);
        return this;
    }

    public ListVpnServersByVgwResponse withVpnServers(Consumer<List<ShowServerResponse>> vpnServersSetter) {
        if (this.vpnServers == null) {
            this.vpnServers = new ArrayList<>();
        }
        vpnServersSetter.accept(this.vpnServers);
        return this;
    }

    /**
     * Get vpnServers
     * @return vpnServers
     */
    public List<ShowServerResponse> getVpnServers() {
        return vpnServers;
    }

    public void setVpnServers(List<ShowServerResponse> vpnServers) {
        this.vpnServers = vpnServers;
    }

    public ListVpnServersByVgwResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListVpnServersByVgwResponse withHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
        return this;
    }

    /**
     * Get headerResponseToken
     * @return headerResponseToken
     */
    public String getHeaderResponseToken() {
        return headerResponseToken;
    }

    public void setHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVpnServersByVgwResponse that = (ListVpnServersByVgwResponse) obj;
        return Objects.equals(this.vpnServers, that.vpnServers) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.headerResponseToken, that.headerResponseToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnServers, requestId, headerResponseToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpnServersByVgwResponse {\n");
        sb.append("    vpnServers: ").append(toIndentedString(vpnServers)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    headerResponseToken: ").append(toIndentedString(headerResponseToken)).append("\n");
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
