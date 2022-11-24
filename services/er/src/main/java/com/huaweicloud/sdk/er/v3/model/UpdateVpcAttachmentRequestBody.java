package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateVpcAttachmentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_attachment")

    private UpdateVpcAttachmentBody vpcAttachment;

    public UpdateVpcAttachmentRequestBody withVpcAttachment(UpdateVpcAttachmentBody vpcAttachment) {
        this.vpcAttachment = vpcAttachment;
        return this;
    }

    public UpdateVpcAttachmentRequestBody withVpcAttachment(Consumer<UpdateVpcAttachmentBody> vpcAttachmentSetter) {
        if (this.vpcAttachment == null) {
            this.vpcAttachment = new UpdateVpcAttachmentBody();
            vpcAttachmentSetter.accept(this.vpcAttachment);
        }

        return this;
    }

    /**
     * Get vpcAttachment
     * @return vpcAttachment
     */
    public UpdateVpcAttachmentBody getVpcAttachment() {
        return vpcAttachment;
    }

    public void setVpcAttachment(UpdateVpcAttachmentBody vpcAttachment) {
        this.vpcAttachment = vpcAttachment;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVpcAttachmentRequestBody updateVpcAttachmentRequestBody = (UpdateVpcAttachmentRequestBody) o;
        return Objects.equals(this.vpcAttachment, updateVpcAttachmentRequestBody.vpcAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcAttachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpcAttachmentRequestBody {\n");
        sb.append("    vpcAttachment: ").append(toIndentedString(vpcAttachment)).append("\n");
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
