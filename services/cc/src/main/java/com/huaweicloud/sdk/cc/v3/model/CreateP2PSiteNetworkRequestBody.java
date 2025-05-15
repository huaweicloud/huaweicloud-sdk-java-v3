package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建P2P类型的分支网络的请求体。
 */
public class CreateP2PSiteNetworkRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "p2p_site_network")

    private CreateP2PSiteNetwork p2pSiteNetwork;

    public CreateP2PSiteNetworkRequestBody withP2pSiteNetwork(CreateP2PSiteNetwork p2pSiteNetwork) {
        this.p2pSiteNetwork = p2pSiteNetwork;
        return this;
    }

    public CreateP2PSiteNetworkRequestBody withP2pSiteNetwork(Consumer<CreateP2PSiteNetwork> p2pSiteNetworkSetter) {
        if (this.p2pSiteNetwork == null) {
            this.p2pSiteNetwork = new CreateP2PSiteNetwork();
            p2pSiteNetworkSetter.accept(this.p2pSiteNetwork);
        }

        return this;
    }

    /**
     * Get p2pSiteNetwork
     * @return p2pSiteNetwork
     */
    public CreateP2PSiteNetwork getP2pSiteNetwork() {
        return p2pSiteNetwork;
    }

    public void setP2pSiteNetwork(CreateP2PSiteNetwork p2pSiteNetwork) {
        this.p2pSiteNetwork = p2pSiteNetwork;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateP2PSiteNetworkRequestBody that = (CreateP2PSiteNetworkRequestBody) obj;
        return Objects.equals(this.p2pSiteNetwork, that.p2pSiteNetwork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p2pSiteNetwork);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateP2PSiteNetworkRequestBody {\n");
        sb.append("    p2pSiteNetwork: ").append(toIndentedString(p2pSiteNetwork)).append("\n");
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
