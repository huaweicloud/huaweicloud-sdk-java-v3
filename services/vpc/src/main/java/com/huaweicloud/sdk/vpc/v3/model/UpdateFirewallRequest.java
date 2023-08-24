package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateFirewallRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_id")

    private String firewallId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateFirewallRequestBody body;

    public UpdateFirewallRequest withFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }

    /**
     * 网络ACL的唯一标识
     * @return firewallId
     */
    public String getFirewallId() {
        return firewallId;
    }

    public void setFirewallId(String firewallId) {
        this.firewallId = firewallId;
    }

    public UpdateFirewallRequest withBody(UpdateFirewallRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateFirewallRequest withBody(Consumer<UpdateFirewallRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateFirewallRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateFirewallRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateFirewallRequestBody body) {
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
        UpdateFirewallRequest that = (UpdateFirewallRequest) obj;
        return Objects.equals(this.firewallId, that.firewallId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFirewallRequest {\n");
        sb.append("    firewallId: ").append(toIndentedString(firewallId)).append("\n");
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
