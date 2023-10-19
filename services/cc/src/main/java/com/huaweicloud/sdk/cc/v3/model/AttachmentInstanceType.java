package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 连接类型。
 */
public class AttachmentInstanceType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_instance_type")

    private AttachmentInstanceTypeEnum attachmentInstanceType;

    public AttachmentInstanceType withAttachmentInstanceType(AttachmentInstanceTypeEnum attachmentInstanceType) {
        this.attachmentInstanceType = attachmentInstanceType;
        return this;
    }

    /**
     * Get attachmentInstanceType
     * @return attachmentInstanceType
     */
    public AttachmentInstanceTypeEnum getAttachmentInstanceType() {
        return attachmentInstanceType;
    }

    public void setAttachmentInstanceType(AttachmentInstanceTypeEnum attachmentInstanceType) {
        this.attachmentInstanceType = attachmentInstanceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachmentInstanceType that = (AttachmentInstanceType) obj;
        return Objects.equals(this.attachmentInstanceType, that.attachmentInstanceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachmentInstanceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachmentInstanceType {\n");
        sb.append("    attachmentInstanceType: ").append(toIndentedString(attachmentInstanceType)).append("\n");
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
