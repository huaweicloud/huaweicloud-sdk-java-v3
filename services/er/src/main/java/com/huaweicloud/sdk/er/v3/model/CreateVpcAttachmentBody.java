package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateVpcAttachmentBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_attachment")

    private VpcAttachmentCreateRequest vpcAttachment;

    public CreateVpcAttachmentBody withVpcAttachment(VpcAttachmentCreateRequest vpcAttachment) {
        this.vpcAttachment = vpcAttachment;
        return this;
    }

    public CreateVpcAttachmentBody withVpcAttachment(Consumer<VpcAttachmentCreateRequest> vpcAttachmentSetter) {
        if (this.vpcAttachment == null) {
            this.vpcAttachment = new VpcAttachmentCreateRequest();
            vpcAttachmentSetter.accept(this.vpcAttachment);
        }

        return this;
    }

    /**
     * Get vpcAttachment
     * @return vpcAttachment
     */
    public VpcAttachmentCreateRequest getVpcAttachment() {
        return vpcAttachment;
    }

    public void setVpcAttachment(VpcAttachmentCreateRequest vpcAttachment) {
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
        CreateVpcAttachmentBody createVpcAttachmentBody = (CreateVpcAttachmentBody) o;
        return Objects.equals(this.vpcAttachment, createVpcAttachmentBody.vpcAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcAttachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcAttachmentBody {\n");
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
