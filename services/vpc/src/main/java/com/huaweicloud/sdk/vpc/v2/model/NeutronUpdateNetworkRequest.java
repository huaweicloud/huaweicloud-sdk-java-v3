package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class NeutronUpdateNetworkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_id")

    private String networkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private NeutronUpdateNetworkRequestBody body;

    public NeutronUpdateNetworkRequest withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * 网络ID
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public NeutronUpdateNetworkRequest withBody(NeutronUpdateNetworkRequestBody body) {
        this.body = body;
        return this;
    }

    public NeutronUpdateNetworkRequest withBody(Consumer<NeutronUpdateNetworkRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new NeutronUpdateNetworkRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public NeutronUpdateNetworkRequestBody getBody() {
        return body;
    }

    public void setBody(NeutronUpdateNetworkRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronUpdateNetworkRequest that = (NeutronUpdateNetworkRequest) obj;
        return Objects.equals(this.networkId, that.networkId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateNetworkRequest {\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
