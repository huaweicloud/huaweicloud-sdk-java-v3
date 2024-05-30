package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BridgeResponse
 */
public class BridgeResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bridge_id")

    private String bridgeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bridge_name")

    private String bridgeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public BridgeResponse withBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }

    /**
     * 网桥ID
     * @return bridgeId
     */
    public String getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
    }

    public BridgeResponse withBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
        return this;
    }

    /**
     * 网桥名称。
     * @return bridgeName
     */
    public String getBridgeName() {
        return bridgeName;
    }

    public void setBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
    }

    public BridgeResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 网桥状态。 - ONLINE：网桥在线。 - OFFLINE：网桥离线。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BridgeResponse that = (BridgeResponse) obj;
        return Objects.equals(this.bridgeId, that.bridgeId) && Objects.equals(this.bridgeName, that.bridgeName)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bridgeId, bridgeName, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BridgeResponse {\n");
        sb.append("    bridgeId: ").append(toIndentedString(bridgeId)).append("\n");
        sb.append("    bridgeName: ").append(toIndentedString(bridgeName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
