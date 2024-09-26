package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCentralNetworkGdgwAttachmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_gdgw_attachment")

    private CentralNetworkGdgwAttachment centralNetworkGdgwAttachment;

    public ShowCentralNetworkGdgwAttachmentResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowCentralNetworkGdgwAttachmentResponse withCentralNetworkGdgwAttachment(
        CentralNetworkGdgwAttachment centralNetworkGdgwAttachment) {
        this.centralNetworkGdgwAttachment = centralNetworkGdgwAttachment;
        return this;
    }

    public ShowCentralNetworkGdgwAttachmentResponse withCentralNetworkGdgwAttachment(
        Consumer<CentralNetworkGdgwAttachment> centralNetworkGdgwAttachmentSetter) {
        if (this.centralNetworkGdgwAttachment == null) {
            this.centralNetworkGdgwAttachment = new CentralNetworkGdgwAttachment();
            centralNetworkGdgwAttachmentSetter.accept(this.centralNetworkGdgwAttachment);
        }

        return this;
    }

    /**
     * Get centralNetworkGdgwAttachment
     * @return centralNetworkGdgwAttachment
     */
    public CentralNetworkGdgwAttachment getCentralNetworkGdgwAttachment() {
        return centralNetworkGdgwAttachment;
    }

    public void setCentralNetworkGdgwAttachment(CentralNetworkGdgwAttachment centralNetworkGdgwAttachment) {
        this.centralNetworkGdgwAttachment = centralNetworkGdgwAttachment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCentralNetworkGdgwAttachmentResponse that = (ShowCentralNetworkGdgwAttachmentResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.centralNetworkGdgwAttachment, that.centralNetworkGdgwAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, centralNetworkGdgwAttachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCentralNetworkGdgwAttachmentResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    centralNetworkGdgwAttachment: ")
            .append(toIndentedString(centralNetworkGdgwAttachment))
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
