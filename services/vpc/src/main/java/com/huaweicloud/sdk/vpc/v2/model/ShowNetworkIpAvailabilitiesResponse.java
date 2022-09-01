package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNetworkIpAvailabilitiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_ip_availability")

    @JacksonXmlProperty(localName = "network_ip_availability")

    private NetworkIpAvailability networkIpAvailability;

    public ShowNetworkIpAvailabilitiesResponse withNetworkIpAvailability(NetworkIpAvailability networkIpAvailability) {
        this.networkIpAvailability = networkIpAvailability;
        return this;
    }

    public ShowNetworkIpAvailabilitiesResponse withNetworkIpAvailability(
        Consumer<NetworkIpAvailability> networkIpAvailabilitySetter) {
        if (this.networkIpAvailability == null) {
            this.networkIpAvailability = new NetworkIpAvailability();
            networkIpAvailabilitySetter.accept(this.networkIpAvailability);
        }

        return this;
    }

    /**
     * Get networkIpAvailability
     * @return networkIpAvailability
     */
    public NetworkIpAvailability getNetworkIpAvailability() {
        return networkIpAvailability;
    }

    public void setNetworkIpAvailability(NetworkIpAvailability networkIpAvailability) {
        this.networkIpAvailability = networkIpAvailability;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowNetworkIpAvailabilitiesResponse showNetworkIpAvailabilitiesResponse =
            (ShowNetworkIpAvailabilitiesResponse) o;
        return Objects.equals(this.networkIpAvailability, showNetworkIpAvailabilitiesResponse.networkIpAvailability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkIpAvailability);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNetworkIpAvailabilitiesResponse {\n");
        sb.append("    networkIpAvailability: ").append(toIndentedString(networkIpAvailability)).append("\n");
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
