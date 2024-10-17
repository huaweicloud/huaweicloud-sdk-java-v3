package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 被挂载的企业路由器的连接ID。
 */
public class AttachedEnterpriseRouterAttachmentId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_attachment_id")

    private String attachedErAttachmentId;

    public AttachedEnterpriseRouterAttachmentId withAttachedErAttachmentId(String attachedErAttachmentId) {
        this.attachedErAttachmentId = attachedErAttachmentId;
        return this;
    }

    /**
     * 被挂载的企业路由器的连接ID。
     * @return attachedErAttachmentId
     */
    public String getAttachedErAttachmentId() {
        return attachedErAttachmentId;
    }

    public void setAttachedErAttachmentId(String attachedErAttachmentId) {
        this.attachedErAttachmentId = attachedErAttachmentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachedEnterpriseRouterAttachmentId that = (AttachedEnterpriseRouterAttachmentId) obj;
        return Objects.equals(this.attachedErAttachmentId, that.attachedErAttachmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedErAttachmentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachedEnterpriseRouterAttachmentId {\n");
        sb.append("    attachedErAttachmentId: ").append(toIndentedString(attachedErAttachmentId)).append("\n");
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
