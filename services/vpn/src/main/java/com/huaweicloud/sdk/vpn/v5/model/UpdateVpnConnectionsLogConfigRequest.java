package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateVpnConnectionsLogConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "p2c_vgw_id")

    private String p2cVgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateVpnLogConfigRequestBody body;

    public UpdateVpnConnectionsLogConfigRequest withP2cVgwId(String p2cVgwId) {
        this.p2cVgwId = p2cVgwId;
        return this;
    }

    /**
     * P2C VPN网关实例ID
     * @return p2cVgwId
     */
    public String getP2cVgwId() {
        return p2cVgwId;
    }

    public void setP2cVgwId(String p2cVgwId) {
        this.p2cVgwId = p2cVgwId;
    }

    public UpdateVpnConnectionsLogConfigRequest withBody(UpdateVpnLogConfigRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateVpnConnectionsLogConfigRequest withBody(Consumer<UpdateVpnLogConfigRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateVpnLogConfigRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateVpnLogConfigRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateVpnLogConfigRequestBody body) {
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
        UpdateVpnConnectionsLogConfigRequest that = (UpdateVpnConnectionsLogConfigRequest) obj;
        return Objects.equals(this.p2cVgwId, that.p2cVgwId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p2cVgwId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpnConnectionsLogConfigRequest {\n");
        sb.append("    p2cVgwId: ").append(toIndentedString(p2cVgwId)).append("\n");
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
