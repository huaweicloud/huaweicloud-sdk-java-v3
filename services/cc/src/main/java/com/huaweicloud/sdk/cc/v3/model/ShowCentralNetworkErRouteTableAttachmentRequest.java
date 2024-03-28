package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCentralNetworkErRouteTableAttachmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_id")

    private String centralNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_route_table_attachment_id")

    private String erRouteTableAttachmentId;

    public ShowCentralNetworkErRouteTableAttachmentRequest withCentralNetworkId(String centralNetworkId) {
        this.centralNetworkId = centralNetworkId;
        return this;
    }

    /**
     * 中心网络的ID。
     * @return centralNetworkId
     */
    public String getCentralNetworkId() {
        return centralNetworkId;
    }

    public void setCentralNetworkId(String centralNetworkId) {
        this.centralNetworkId = centralNetworkId;
    }

    public ShowCentralNetworkErRouteTableAttachmentRequest withErRouteTableAttachmentId(
        String erRouteTableAttachmentId) {
        this.erRouteTableAttachmentId = erRouteTableAttachmentId;
        return this;
    }

    /**
     * 中心网络ER路由表附件ID。
     * @return erRouteTableAttachmentId
     */
    public String getErRouteTableAttachmentId() {
        return erRouteTableAttachmentId;
    }

    public void setErRouteTableAttachmentId(String erRouteTableAttachmentId) {
        this.erRouteTableAttachmentId = erRouteTableAttachmentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCentralNetworkErRouteTableAttachmentRequest that = (ShowCentralNetworkErRouteTableAttachmentRequest) obj;
        return Objects.equals(this.centralNetworkId, that.centralNetworkId)
            && Objects.equals(this.erRouteTableAttachmentId, that.erRouteTableAttachmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centralNetworkId, erRouteTableAttachmentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCentralNetworkErRouteTableAttachmentRequest {\n");
        sb.append("    centralNetworkId: ").append(toIndentedString(centralNetworkId)).append("\n");
        sb.append("    erRouteTableAttachmentId: ").append(toIndentedString(erRouteTableAttachmentId)).append("\n");
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
