package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新中心网络GDGW附件的请求体。
 */
public class UpdateCentralNetworkGdgwAttachmentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_gdgw_attachment")

    private UpdateCentralNetworkGdgwAttachment centralNetworkGdgwAttachment;

    public UpdateCentralNetworkGdgwAttachmentRequestBody withCentralNetworkGdgwAttachment(
        UpdateCentralNetworkGdgwAttachment centralNetworkGdgwAttachment) {
        this.centralNetworkGdgwAttachment = centralNetworkGdgwAttachment;
        return this;
    }

    public UpdateCentralNetworkGdgwAttachmentRequestBody withCentralNetworkGdgwAttachment(
        Consumer<UpdateCentralNetworkGdgwAttachment> centralNetworkGdgwAttachmentSetter) {
        if (this.centralNetworkGdgwAttachment == null) {
            this.centralNetworkGdgwAttachment = new UpdateCentralNetworkGdgwAttachment();
            centralNetworkGdgwAttachmentSetter.accept(this.centralNetworkGdgwAttachment);
        }

        return this;
    }

    /**
     * Get centralNetworkGdgwAttachment
     * @return centralNetworkGdgwAttachment
     */
    public UpdateCentralNetworkGdgwAttachment getCentralNetworkGdgwAttachment() {
        return centralNetworkGdgwAttachment;
    }

    public void setCentralNetworkGdgwAttachment(UpdateCentralNetworkGdgwAttachment centralNetworkGdgwAttachment) {
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
        UpdateCentralNetworkGdgwAttachmentRequestBody that = (UpdateCentralNetworkGdgwAttachmentRequestBody) obj;
        return Objects.equals(this.centralNetworkGdgwAttachment, that.centralNetworkGdgwAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centralNetworkGdgwAttachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCentralNetworkGdgwAttachmentRequestBody {\n");
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
