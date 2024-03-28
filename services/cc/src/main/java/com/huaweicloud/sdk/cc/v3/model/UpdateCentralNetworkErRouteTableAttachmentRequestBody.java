package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新中心网络ER附件的请求体。
 */
public class UpdateCentralNetworkErRouteTableAttachmentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_er_route_table_attachment")

    private UpdateCentralNetworkErRouteTableAttachment centralNetworkErRouteTableAttachment;

    public UpdateCentralNetworkErRouteTableAttachmentRequestBody withCentralNetworkErRouteTableAttachment(
        UpdateCentralNetworkErRouteTableAttachment centralNetworkErRouteTableAttachment) {
        this.centralNetworkErRouteTableAttachment = centralNetworkErRouteTableAttachment;
        return this;
    }

    public UpdateCentralNetworkErRouteTableAttachmentRequestBody withCentralNetworkErRouteTableAttachment(
        Consumer<UpdateCentralNetworkErRouteTableAttachment> centralNetworkErRouteTableAttachmentSetter) {
        if (this.centralNetworkErRouteTableAttachment == null) {
            this.centralNetworkErRouteTableAttachment = new UpdateCentralNetworkErRouteTableAttachment();
            centralNetworkErRouteTableAttachmentSetter.accept(this.centralNetworkErRouteTableAttachment);
        }

        return this;
    }

    /**
     * Get centralNetworkErRouteTableAttachment
     * @return centralNetworkErRouteTableAttachment
     */
    public UpdateCentralNetworkErRouteTableAttachment getCentralNetworkErRouteTableAttachment() {
        return centralNetworkErRouteTableAttachment;
    }

    public void setCentralNetworkErRouteTableAttachment(
        UpdateCentralNetworkErRouteTableAttachment centralNetworkErRouteTableAttachment) {
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
        UpdateCentralNetworkErRouteTableAttachmentRequestBody that =
            (UpdateCentralNetworkErRouteTableAttachmentRequestBody) obj;
        return Objects.equals(this.centralNetworkErRouteTableAttachment, that.centralNetworkErRouteTableAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centralNetworkErRouteTableAttachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCentralNetworkErRouteTableAttachmentRequestBody {\n");
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
