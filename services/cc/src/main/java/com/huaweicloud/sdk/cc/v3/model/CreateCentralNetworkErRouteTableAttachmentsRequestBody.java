package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建中心网络ER路由表附件的请求体。
 */
public class CreateCentralNetworkErRouteTableAttachmentsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_er_route_table_attachment")

    private CreateCentralNetworkErRouteTableAttachment centralNetworkErRouteTableAttachment;

    public CreateCentralNetworkErRouteTableAttachmentsRequestBody withCentralNetworkErRouteTableAttachment(
        CreateCentralNetworkErRouteTableAttachment centralNetworkErRouteTableAttachment) {
        this.centralNetworkErRouteTableAttachment = centralNetworkErRouteTableAttachment;
        return this;
    }

    public CreateCentralNetworkErRouteTableAttachmentsRequestBody withCentralNetworkErRouteTableAttachment(
        Consumer<CreateCentralNetworkErRouteTableAttachment> centralNetworkErRouteTableAttachmentSetter) {
        if (this.centralNetworkErRouteTableAttachment == null) {
            this.centralNetworkErRouteTableAttachment = new CreateCentralNetworkErRouteTableAttachment();
            centralNetworkErRouteTableAttachmentSetter.accept(this.centralNetworkErRouteTableAttachment);
        }

        return this;
    }

    /**
     * Get centralNetworkErRouteTableAttachment
     * @return centralNetworkErRouteTableAttachment
     */
    public CreateCentralNetworkErRouteTableAttachment getCentralNetworkErRouteTableAttachment() {
        return centralNetworkErRouteTableAttachment;
    }

    public void setCentralNetworkErRouteTableAttachment(
        CreateCentralNetworkErRouteTableAttachment centralNetworkErRouteTableAttachment) {
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
        CreateCentralNetworkErRouteTableAttachmentsRequestBody that =
            (CreateCentralNetworkErRouteTableAttachmentsRequestBody) obj;
        return Objects.equals(this.centralNetworkErRouteTableAttachment, that.centralNetworkErRouteTableAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centralNetworkErRouteTableAttachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCentralNetworkErRouteTableAttachmentsRequestBody {\n");
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
