package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateSiteNetworkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_network")

    private SiteNetworkEntry siteNetwork;

    public UpdateSiteNetworkResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateSiteNetworkResponse withSiteNetwork(SiteNetworkEntry siteNetwork) {
        this.siteNetwork = siteNetwork;
        return this;
    }

    public UpdateSiteNetworkResponse withSiteNetwork(Consumer<SiteNetworkEntry> siteNetworkSetter) {
        if (this.siteNetwork == null) {
            this.siteNetwork = new SiteNetworkEntry();
            siteNetworkSetter.accept(this.siteNetwork);
        }

        return this;
    }

    /**
     * Get siteNetwork
     * @return siteNetwork
     */
    public SiteNetworkEntry getSiteNetwork() {
        return siteNetwork;
    }

    public void setSiteNetwork(SiteNetworkEntry siteNetwork) {
        this.siteNetwork = siteNetwork;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSiteNetworkResponse that = (UpdateSiteNetworkResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.siteNetwork, that.siteNetwork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, siteNetwork);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSiteNetworkResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    siteNetwork: ").append(toIndentedString(siteNetwork)).append("\n");
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
