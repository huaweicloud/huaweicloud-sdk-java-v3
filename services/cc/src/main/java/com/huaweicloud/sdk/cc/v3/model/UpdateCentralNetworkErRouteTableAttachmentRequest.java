package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateCentralNetworkErRouteTableAttachmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_id")

    private String centralNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_route_table_attachment_id")

    private String erRouteTableAttachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateCentralNetworkErRouteTableAttachmentRequestBody body;

    public UpdateCentralNetworkErRouteTableAttachmentRequest withCentralNetworkId(String centralNetworkId) {
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

    public UpdateCentralNetworkErRouteTableAttachmentRequest withErRouteTableAttachmentId(
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

    public UpdateCentralNetworkErRouteTableAttachmentRequest withBody(
        UpdateCentralNetworkErRouteTableAttachmentRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateCentralNetworkErRouteTableAttachmentRequest withBody(
        Consumer<UpdateCentralNetworkErRouteTableAttachmentRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateCentralNetworkErRouteTableAttachmentRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateCentralNetworkErRouteTableAttachmentRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateCentralNetworkErRouteTableAttachmentRequestBody body) {
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
        UpdateCentralNetworkErRouteTableAttachmentRequest that =
            (UpdateCentralNetworkErRouteTableAttachmentRequest) obj;
        return Objects.equals(this.centralNetworkId, that.centralNetworkId)
            && Objects.equals(this.erRouteTableAttachmentId, that.erRouteTableAttachmentId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centralNetworkId, erRouteTableAttachmentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCentralNetworkErRouteTableAttachmentRequest {\n");
        sb.append("    centralNetworkId: ").append(toIndentedString(centralNetworkId)).append("\n");
        sb.append("    erRouteTableAttachmentId: ").append(toIndentedString(erRouteTableAttachmentId)).append("\n");
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
