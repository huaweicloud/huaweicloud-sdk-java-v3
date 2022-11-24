package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowVpcAttachmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_attachment_id")

    private String vpcAttachmentId;

    public ShowVpcAttachmentRequest withErId(String erId) {
        this.erId = erId;
        return this;
    }

    /**
     * 企业路由器实例ID
     * @return erId
     */
    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public ShowVpcAttachmentRequest withVpcAttachmentId(String vpcAttachmentId) {
        this.vpcAttachmentId = vpcAttachmentId;
        return this;
    }

    /**
     * VPC连接ID
     * @return vpcAttachmentId
     */
    public String getVpcAttachmentId() {
        return vpcAttachmentId;
    }

    public void setVpcAttachmentId(String vpcAttachmentId) {
        this.vpcAttachmentId = vpcAttachmentId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowVpcAttachmentRequest showVpcAttachmentRequest = (ShowVpcAttachmentRequest) o;
        return Objects.equals(this.erId, showVpcAttachmentRequest.erId)
            && Objects.equals(this.vpcAttachmentId, showVpcAttachmentRequest.vpcAttachmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, vpcAttachmentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVpcAttachmentRequest {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    vpcAttachmentId: ").append(toIndentedString(vpcAttachmentId)).append("\n");
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
