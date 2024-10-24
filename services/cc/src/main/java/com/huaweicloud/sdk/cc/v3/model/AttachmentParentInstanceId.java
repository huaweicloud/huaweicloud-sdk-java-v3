package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 连接的父资源ID，这里表示企业路由器ID。
 */
public class AttachmentParentInstanceId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_parent_instance_id")

    private String attachmentParentInstanceId;

    public AttachmentParentInstanceId withAttachmentParentInstanceId(String attachmentParentInstanceId) {
        this.attachmentParentInstanceId = attachmentParentInstanceId;
        return this;
    }

    /**
     * 连接的父资源ID，这里表示企业路由器ID。
     * @return attachmentParentInstanceId
     */
    public String getAttachmentParentInstanceId() {
        return attachmentParentInstanceId;
    }

    public void setAttachmentParentInstanceId(String attachmentParentInstanceId) {
        this.attachmentParentInstanceId = attachmentParentInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachmentParentInstanceId that = (AttachmentParentInstanceId) obj;
        return Objects.equals(this.attachmentParentInstanceId, that.attachmentParentInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachmentParentInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachmentParentInstanceId {\n");
        sb.append("    attachmentParentInstanceId: ").append(toIndentedString(attachmentParentInstanceId)).append("\n");
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
