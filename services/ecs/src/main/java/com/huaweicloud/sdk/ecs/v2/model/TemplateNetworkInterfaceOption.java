package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网络接口，网卡
 */
public class TemplateNetworkInterfaceOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment")

    private TemplateNetworkInterfaceAttachmentOption attachment;

    public TemplateNetworkInterfaceOption withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * 子网ID
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public TemplateNetworkInterfaceOption withAttachment(TemplateNetworkInterfaceAttachmentOption attachment) {
        this.attachment = attachment;
        return this;
    }

    public TemplateNetworkInterfaceOption withAttachment(
        Consumer<TemplateNetworkInterfaceAttachmentOption> attachmentSetter) {
        if (this.attachment == null) {
            this.attachment = new TemplateNetworkInterfaceAttachmentOption();
            attachmentSetter.accept(this.attachment);
        }

        return this;
    }

    /**
     * Get attachment
     * @return attachment
     */
    public TemplateNetworkInterfaceAttachmentOption getAttachment() {
        return attachment;
    }

    public void setAttachment(TemplateNetworkInterfaceAttachmentOption attachment) {
        this.attachment = attachment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateNetworkInterfaceOption that = (TemplateNetworkInterfaceOption) obj;
        return Objects.equals(this.virsubnetId, that.virsubnetId) && Objects.equals(this.attachment, that.attachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virsubnetId, attachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateNetworkInterfaceOption {\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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
