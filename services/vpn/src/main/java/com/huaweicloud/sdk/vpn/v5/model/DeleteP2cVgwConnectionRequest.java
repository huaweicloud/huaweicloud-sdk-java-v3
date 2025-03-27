package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteP2cVgwConnectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "p2c_vgw_id")

    private String p2cVgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    public DeleteP2cVgwConnectionRequest withP2cVgwId(String p2cVgwId) {
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

    public DeleteP2cVgwConnectionRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 连接ID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteP2cVgwConnectionRequest that = (DeleteP2cVgwConnectionRequest) obj;
        return Objects.equals(this.p2cVgwId, that.p2cVgwId) && Objects.equals(this.connectionId, that.connectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p2cVgwId, connectionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteP2cVgwConnectionRequest {\n");
        sb.append("    p2cVgwId: ").append(toIndentedString(p2cVgwId)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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
