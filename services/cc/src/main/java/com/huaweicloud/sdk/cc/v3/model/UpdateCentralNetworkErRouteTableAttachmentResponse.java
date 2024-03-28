package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateCentralNetworkErRouteTableAttachmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_er_route_table_attachment")

    private CentralNetworkErRouteTableAttachment centralNetworkErRouteTableAttachment;

    public UpdateCentralNetworkErRouteTableAttachmentResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateCentralNetworkErRouteTableAttachmentResponse withCentralNetworkErRouteTableAttachment(
        CentralNetworkErRouteTableAttachment centralNetworkErRouteTableAttachment) {
        this.centralNetworkErRouteTableAttachment = centralNetworkErRouteTableAttachment;
        return this;
    }

    public UpdateCentralNetworkErRouteTableAttachmentResponse withCentralNetworkErRouteTableAttachment(
        Consumer<CentralNetworkErRouteTableAttachment> centralNetworkErRouteTableAttachmentSetter) {
        if (this.centralNetworkErRouteTableAttachment == null) {
            this.centralNetworkErRouteTableAttachment = new CentralNetworkErRouteTableAttachment();
            centralNetworkErRouteTableAttachmentSetter.accept(this.centralNetworkErRouteTableAttachment);
        }

        return this;
    }

    /**
     * Get centralNetworkErRouteTableAttachment
     * @return centralNetworkErRouteTableAttachment
     */
    public CentralNetworkErRouteTableAttachment getCentralNetworkErRouteTableAttachment() {
        return centralNetworkErRouteTableAttachment;
    }

    public void setCentralNetworkErRouteTableAttachment(
        CentralNetworkErRouteTableAttachment centralNetworkErRouteTableAttachment) {
        this.centralNetworkErRouteTableAttachment = centralNetworkErRouteTableAttachment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCentralNetworkErRouteTableAttachmentResponse that =
            (UpdateCentralNetworkErRouteTableAttachmentResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.centralNetworkErRouteTableAttachment, that.centralNetworkErRouteTableAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, centralNetworkErRouteTableAttachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCentralNetworkErRouteTableAttachmentResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    centralNetworkErRouteTableAttachment: ")
            .append(toIndentedString(centralNetworkErRouteTableAttachment))
            .append("\n");
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
