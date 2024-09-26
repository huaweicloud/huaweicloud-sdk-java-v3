package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DeleteCentralNetworkAttachmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_attachment")

    private CentralNetworkAttachment centralNetworkAttachment;

    public DeleteCentralNetworkAttachmentResponse withRequestId(String requestId) {
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

    public DeleteCentralNetworkAttachmentResponse withCentralNetworkAttachment(
        CentralNetworkAttachment centralNetworkAttachment) {
        this.centralNetworkAttachment = centralNetworkAttachment;
        return this;
    }

    public DeleteCentralNetworkAttachmentResponse withCentralNetworkAttachment(
        Consumer<CentralNetworkAttachment> centralNetworkAttachmentSetter) {
        if (this.centralNetworkAttachment == null) {
            this.centralNetworkAttachment = new CentralNetworkAttachment();
            centralNetworkAttachmentSetter.accept(this.centralNetworkAttachment);
        }

        return this;
    }

    /**
     * Get centralNetworkAttachment
     * @return centralNetworkAttachment
     */
    public CentralNetworkAttachment getCentralNetworkAttachment() {
        return centralNetworkAttachment;
    }

    public void setCentralNetworkAttachment(CentralNetworkAttachment centralNetworkAttachment) {
        this.centralNetworkAttachment = centralNetworkAttachment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCentralNetworkAttachmentResponse that = (DeleteCentralNetworkAttachmentResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.centralNetworkAttachment, that.centralNetworkAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, centralNetworkAttachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCentralNetworkAttachmentResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    centralNetworkAttachment: ").append(toIndentedString(centralNetworkAttachment)).append("\n");
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
