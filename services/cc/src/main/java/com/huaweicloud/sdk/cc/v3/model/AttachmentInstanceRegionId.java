package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 中心网络附件对端实例的regionID。
 */
public class AttachmentInstanceRegionId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_instance_region_id")

    private String attachmentInstanceRegionId;

    public AttachmentInstanceRegionId withAttachmentInstanceRegionId(String attachmentInstanceRegionId) {
        this.attachmentInstanceRegionId = attachmentInstanceRegionId;
        return this;
    }

    /**
     * 中心网络附件对端实例的regionID。
     * @return attachmentInstanceRegionId
     */
    public String getAttachmentInstanceRegionId() {
        return attachmentInstanceRegionId;
    }

    public void setAttachmentInstanceRegionId(String attachmentInstanceRegionId) {
        this.attachmentInstanceRegionId = attachmentInstanceRegionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachmentInstanceRegionId that = (AttachmentInstanceRegionId) obj;
        return Objects.equals(this.attachmentInstanceRegionId, that.attachmentInstanceRegionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachmentInstanceRegionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachmentInstanceRegionId {\n");
        sb.append("    attachmentInstanceRegionId: ").append(toIndentedString(attachmentInstanceRegionId)).append("\n");
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
