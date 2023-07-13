package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改裸金属服务器所绑定的弹性网卡属性：终止时删除，即删除裸金属服务器，或者解绑网卡时是否删除该网卡
 */
public class UpdateBaremetalServerInterfaceAttachmentsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface_attachment")

    private InterfaceAttachmentsReq interfaceAttachment;

    public UpdateBaremetalServerInterfaceAttachmentsReq withInterfaceAttachment(
        InterfaceAttachmentsReq interfaceAttachment) {
        this.interfaceAttachment = interfaceAttachment;
        return this;
    }

    public UpdateBaremetalServerInterfaceAttachmentsReq withInterfaceAttachment(
        Consumer<InterfaceAttachmentsReq> interfaceAttachmentSetter) {
        if (this.interfaceAttachment == null) {
            this.interfaceAttachment = new InterfaceAttachmentsReq();
            interfaceAttachmentSetter.accept(this.interfaceAttachment);
        }

        return this;
    }

    /**
     * Get interfaceAttachment
     * @return interfaceAttachment
     */
    public InterfaceAttachmentsReq getInterfaceAttachment() {
        return interfaceAttachment;
    }

    public void setInterfaceAttachment(InterfaceAttachmentsReq interfaceAttachment) {
        this.interfaceAttachment = interfaceAttachment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBaremetalServerInterfaceAttachmentsReq that = (UpdateBaremetalServerInterfaceAttachmentsReq) obj;
        return Objects.equals(this.interfaceAttachment, that.interfaceAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interfaceAttachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBaremetalServerInterfaceAttachmentsReq {\n");
        sb.append("    interfaceAttachment: ").append(toIndentedString(interfaceAttachment)).append("\n");
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
