package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 中心网络附件对端实例ID，企业路由器的路由表ID或者GDGW的ID。
 */
public class AttachmentInstanceId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_instance_id")

    private String attachmentInstanceId;

    public AttachmentInstanceId withAttachmentInstanceId(String attachmentInstanceId) {
        this.attachmentInstanceId = attachmentInstanceId;
        return this;
    }

    /**
     * 中心网络附件对端实例ID，企业路由器的路由表ID或者GDGW的ID。
     * @return attachmentInstanceId
     */
    public String getAttachmentInstanceId() {
        return attachmentInstanceId;
    }

    public void setAttachmentInstanceId(String attachmentInstanceId) {
        this.attachmentInstanceId = attachmentInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachmentInstanceId that = (AttachmentInstanceId) obj;
        return Objects.equals(this.attachmentInstanceId, that.attachmentInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachmentInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachmentInstanceId {\n");
        sb.append("    attachmentInstanceId: ").append(toIndentedString(attachmentInstanceId)).append("\n");
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
