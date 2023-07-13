package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateVpcAttachmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_attachment")

    private VpcAttachmentDetails vpcAttachment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Client-Token")

    private String xClientToken;

    public CreateVpcAttachmentResponse withVpcAttachment(VpcAttachmentDetails vpcAttachment) {
        this.vpcAttachment = vpcAttachment;
        return this;
    }

    public CreateVpcAttachmentResponse withVpcAttachment(Consumer<VpcAttachmentDetails> vpcAttachmentSetter) {
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

    public CreateVpcAttachmentResponse withRequestId(String requestId) {
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

    public CreateVpcAttachmentResponse withXClientToken(String xClientToken) {
        this.xClientToken = xClientToken;
        return this;
    }

    /**
     * Get xClientToken
     * @return xClientToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Client-Token")
    public String getXClientToken() {
        return xClientToken;
    }

    public void setXClientToken(String xClientToken) {
        this.xClientToken = xClientToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVpcAttachmentResponse that = (CreateVpcAttachmentResponse) obj;
        return Objects.equals(this.vpcAttachment, that.vpcAttachment) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.xClientToken, that.xClientToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcAttachment, requestId, xClientToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcAttachmentResponse {\n");
        sb.append("    vpcAttachment: ").append(toIndentedString(vpcAttachment)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    xClientToken: ").append(toIndentedString(xClientToken)).append("\n");
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
