package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateCentralNetworkGdgwAttachmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_id")

    private String centralNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gdgw_attachment_id")

    private String gdgwAttachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateCentralNetworkGdgwAttachmentRequestBody body;

    public UpdateCentralNetworkGdgwAttachmentRequest withCentralNetworkId(String centralNetworkId) {
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

    public UpdateCentralNetworkGdgwAttachmentRequest withGdgwAttachmentId(String gdgwAttachmentId) {
        this.gdgwAttachmentId = gdgwAttachmentId;
        return this;
    }

    /**
     * 中心网络DGW附件ID。
     * @return gdgwAttachmentId
     */
    public String getGdgwAttachmentId() {
        return gdgwAttachmentId;
    }

    public void setGdgwAttachmentId(String gdgwAttachmentId) {
        this.gdgwAttachmentId = gdgwAttachmentId;
    }

    public UpdateCentralNetworkGdgwAttachmentRequest withBody(UpdateCentralNetworkGdgwAttachmentRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateCentralNetworkGdgwAttachmentRequest withBody(
        Consumer<UpdateCentralNetworkGdgwAttachmentRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateCentralNetworkGdgwAttachmentRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateCentralNetworkGdgwAttachmentRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateCentralNetworkGdgwAttachmentRequestBody body) {
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
        UpdateCentralNetworkGdgwAttachmentRequest that = (UpdateCentralNetworkGdgwAttachmentRequest) obj;
        return Objects.equals(this.centralNetworkId, that.centralNetworkId)
            && Objects.equals(this.gdgwAttachmentId, that.gdgwAttachmentId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centralNetworkId, gdgwAttachmentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCentralNetworkGdgwAttachmentRequest {\n");
        sb.append("    centralNetworkId: ").append(toIndentedString(centralNetworkId)).append("\n");
        sb.append("    gdgwAttachmentId: ").append(toIndentedString(gdgwAttachmentId)).append("\n");
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
