package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分支网络ID。
 */
public class SiteNetworkId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_network_id")

    private String siteNetworkId;

    public SiteNetworkId withSiteNetworkId(String siteNetworkId) {
        this.siteNetworkId = siteNetworkId;
        return this;
    }

    /**
     * 分支网络ID。
     * @return siteNetworkId
     */
    public String getSiteNetworkId() {
        return siteNetworkId;
    }

    public void setSiteNetworkId(String siteNetworkId) {
        this.siteNetworkId = siteNetworkId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SiteNetworkId that = (SiteNetworkId) obj;
        return Objects.equals(this.siteNetworkId, that.siteNetworkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteNetworkId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SiteNetworkId {\n");
        sb.append("    siteNetworkId: ").append(toIndentedString(siteNetworkId)).append("\n");
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
