package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class NovaAttachInterfaceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interfaceAttachment")

    private NovaAttachInterfaceOption interfaceAttachment;

    public NovaAttachInterfaceRequestBody withInterfaceAttachment(NovaAttachInterfaceOption interfaceAttachment) {
        this.interfaceAttachment = interfaceAttachment;
        return this;
    }

    public NovaAttachInterfaceRequestBody withInterfaceAttachment(
        Consumer<NovaAttachInterfaceOption> interfaceAttachmentSetter) {
        if (this.interfaceAttachment == null) {
            this.interfaceAttachment = new NovaAttachInterfaceOption();
            interfaceAttachmentSetter.accept(this.interfaceAttachment);
        }

        return this;
    }

    /**
     * Get interfaceAttachment
     * @return interfaceAttachment
     */
    public NovaAttachInterfaceOption getInterfaceAttachment() {
        return interfaceAttachment;
    }

    public void setInterfaceAttachment(NovaAttachInterfaceOption interfaceAttachment) {
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
        NovaAttachInterfaceRequestBody that = (NovaAttachInterfaceRequestBody) obj;
        return Objects.equals(this.interfaceAttachment, that.interfaceAttachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interfaceAttachment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaAttachInterfaceRequestBody {\n");
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
