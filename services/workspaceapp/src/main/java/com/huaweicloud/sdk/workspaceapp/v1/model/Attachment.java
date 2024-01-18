package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置关联成员。
 */
public class Attachment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach")

    private String attach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_type")

    private AttachType attachType;

    public Attachment withAttach(String attach) {
        this.attach = attach;
        return this;
    }

    /**
     * 目标。
     * @return attach
     */
    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public Attachment withAttachType(AttachType attachType) {
        this.attachType = attachType;
        return this;
    }

    /**
     * Get attachType
     * @return attachType
     */
    public AttachType getAttachType() {
        return attachType;
    }

    public void setAttachType(AttachType attachType) {
        this.attachType = attachType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attachment that = (Attachment) obj;
        return Objects.equals(this.attach, that.attach) && Objects.equals(this.attachType, that.attachType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attach, attachType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Attachment {\n");
        sb.append("    attach: ").append(toIndentedString(attach)).append("\n");
        sb.append("    attachType: ").append(toIndentedString(attachType)).append("\n");
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
