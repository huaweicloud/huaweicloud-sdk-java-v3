package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 中心网络附件对端实例的连接ID，企业路由器的连接ID或者GDGW的连接ID。
 */
public class AttachmentId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_id")

    private String attachmentId;

    public AttachmentId withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * 中心网络附件对端实例的连接ID，企业路由器的连接ID或者GDGW的连接ID。
     * @return attachmentId
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachmentId that = (AttachmentId) obj;
        return Objects.equals(this.attachmentId, that.attachmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachmentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachmentId {\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
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
