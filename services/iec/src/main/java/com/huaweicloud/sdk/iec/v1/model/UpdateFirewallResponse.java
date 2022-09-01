package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateFirewallResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall")

    @JacksonXmlProperty(localName = "firewall")

    private UpdateFirewallResp firewall;

    public UpdateFirewallResponse withFirewall(UpdateFirewallResp firewall) {
        this.firewall = firewall;
        return this;
    }

    public UpdateFirewallResponse withFirewall(Consumer<UpdateFirewallResp> firewallSetter) {
        if (this.firewall == null) {
            this.firewall = new UpdateFirewallResp();
            firewallSetter.accept(this.firewall);
        }

        return this;
    }

    /**
     * Get firewall
     * @return firewall
     */
    public UpdateFirewallResp getFirewall() {
        return firewall;
    }

    public void setFirewall(UpdateFirewallResp firewall) {
        this.firewall = firewall;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFirewallResponse updateFirewallResponse = (UpdateFirewallResponse) o;
        return Objects.equals(this.firewall, updateFirewallResponse.firewall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewall);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFirewallResponse {\n");
        sb.append("    firewall: ").append(toIndentedString(firewall)).append("\n");
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
