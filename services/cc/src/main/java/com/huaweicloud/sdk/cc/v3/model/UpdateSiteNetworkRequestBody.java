package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新分支网络的请求体。
 */
public class UpdateSiteNetworkRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_network")

    private UpdateSiteNetwork siteNetwork;

    public UpdateSiteNetworkRequestBody withSiteNetwork(UpdateSiteNetwork siteNetwork) {
        this.siteNetwork = siteNetwork;
        return this;
    }

    public UpdateSiteNetworkRequestBody withSiteNetwork(Consumer<UpdateSiteNetwork> siteNetworkSetter) {
        if (this.siteNetwork == null) {
            this.siteNetwork = new UpdateSiteNetwork();
            siteNetworkSetter.accept(this.siteNetwork);
        }

        return this;
    }

    /**
     * Get siteNetwork
     * @return siteNetwork
     */
    public UpdateSiteNetwork getSiteNetwork() {
        return siteNetwork;
    }

    public void setSiteNetwork(UpdateSiteNetwork siteNetwork) {
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
        UpdateSiteNetworkRequestBody that = (UpdateSiteNetworkRequestBody) obj;
        return Objects.equals(this.siteNetwork, that.siteNetwork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteNetwork);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSiteNetworkRequestBody {\n");
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
