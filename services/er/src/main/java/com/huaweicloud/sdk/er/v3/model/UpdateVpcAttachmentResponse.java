package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateVpcAttachmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_attachment")

    private VpcAttachmentDetails vpcAttachment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public UpdateVpcAttachmentResponse withVpcAttachment(VpcAttachmentDetails vpcAttachment) {
        this.vpcAttachment = vpcAttachment;
        return this;
    }

    public UpdateVpcAttachmentResponse withVpcAttachment(Consumer<VpcAttachmentDetails> vpcAttachmentSetter) {
        if (this.vpcAttachment == null) {
            this.vpcAttachment = new VpcAttachmentDetails();
            vpcAttachmentSetter.accept(this.vpcAttachment);
        }

        return this;
    }

    /**
     * Get vpcAttachment
     * @return vpcAttachment
     */
    public VpcAttachmentDetails getVpcAttachment() {
        return vpcAttachment;
    }

    public void setVpcAttachment(VpcAttachmentDetails vpcAttachment) {
        this.vpcAttachment = vpcAttachment;
    }

    public UpdateVpcAttachmentResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVpcAttachmentResponse that = (UpdateVpcAttachmentResponse) obj;
        return Objects.equals(this.vpcAttachment, that.vpcAttachment) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcAttachment, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcAttachmentResponse {\n");
        sb.append("    vpcAttachment: ").append(toIndentedString(vpcAttachment)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
