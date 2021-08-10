package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 创建网络ACL请求体。 */
public class CreateFirewallRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall")

    private CreateFirewallOption firewall;

    public CreateFirewallRequestBody withFirewall(CreateFirewallOption firewall) {
        this.firewall = firewall;
        return this;
    }

    public CreateFirewallRequestBody withFirewall(Consumer<CreateFirewallOption> firewallSetter) {
        if (this.firewall == null) {
            this.firewall = new CreateFirewallOption();
            firewallSetter.accept(this.firewall);
        }

        return this;
    }

    /** Get firewall
     * 
     * @return firewall */
    public CreateFirewallOption getFirewall() {
        return firewall;
    }

    public void setFirewall(CreateFirewallOption firewall) {
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
        CreateFirewallRequestBody createFirewallRequestBody = (CreateFirewallRequestBody) o;
        return Objects.equals(this.firewall, createFirewallRequestBody.firewall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewall);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFirewallRequestBody {\n");
        sb.append("    firewall: ").append(toIndentedString(firewall)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
