package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DisassociateSiteNetworkBandwidthRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_network_id")

    private String siteNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_connection_id")

    private String siteConnectionId;

    public DisassociateSiteNetworkBandwidthRequest withSiteNetworkId(String siteNetworkId) {
        this.siteNetworkId = siteNetworkId;
        return this;
    }

    /**
     * 分支网络的ID。
     * @return siteNetworkId
     */
    public String getSiteNetworkId() {
        return siteNetworkId;
    }

    public void setSiteNetworkId(String siteNetworkId) {
        this.siteNetworkId = siteNetworkId;
    }

    public DisassociateSiteNetworkBandwidthRequest withSiteConnectionId(String siteConnectionId) {
        this.siteConnectionId = siteConnectionId;
        return this;
    }

    /**
     * 实例ID。
     * @return siteConnectionId
     */
    public String getSiteConnectionId() {
        return siteConnectionId;
    }

    public void setSiteConnectionId(String siteConnectionId) {
        this.siteConnectionId = siteConnectionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisassociateSiteNetworkBandwidthRequest that = (DisassociateSiteNetworkBandwidthRequest) obj;
        return Objects.equals(this.siteNetworkId, that.siteNetworkId)
            && Objects.equals(this.siteConnectionId, that.siteConnectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteNetworkId, siteConnectionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateSiteNetworkBandwidthRequest {\n");
        sb.append("    siteNetworkId: ").append(toIndentedString(siteNetworkId)).append("\n");
        sb.append("    siteConnectionId: ").append(toIndentedString(siteConnectionId)).append("\n");
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
