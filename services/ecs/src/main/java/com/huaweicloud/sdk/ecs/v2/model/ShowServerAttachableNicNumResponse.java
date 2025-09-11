package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowServerAttachableNicNumResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachableQuantity")

    private AttachableQuantityForNic attachableQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interfaceAttachments")

    private List<InterfaceExt> interfaceAttachments = null;

    public ShowServerAttachableNicNumResponse withAttachableQuantity(AttachableQuantityForNic attachableQuantity) {
        this.attachableQuantity = attachableQuantity;
        return this;
    }

    public ShowServerAttachableNicNumResponse withAttachableQuantity(
        Consumer<AttachableQuantityForNic> attachableQuantitySetter) {
        if (this.attachableQuantity == null) {
            this.attachableQuantity = new AttachableQuantityForNic();
            attachableQuantitySetter.accept(this.attachableQuantity);
        }

        return this;
    }

    /**
     * Get attachableQuantity
     * @return attachableQuantity
     */
    public AttachableQuantityForNic getAttachableQuantity() {
        return attachableQuantity;
    }

    public void setAttachableQuantity(AttachableQuantityForNic attachableQuantity) {
        this.attachableQuantity = attachableQuantity;
    }

    public ShowServerAttachableNicNumResponse withInterfaceAttachments(List<InterfaceExt> interfaceAttachments) {
        this.interfaceAttachments = interfaceAttachments;
        return this;
    }

    public ShowServerAttachableNicNumResponse addInterfaceAttachmentsItem(InterfaceExt interfaceAttachmentsItem) {
        if (this.interfaceAttachments == null) {
            this.interfaceAttachments = new ArrayList<>();
        }
        this.interfaceAttachments.add(interfaceAttachmentsItem);
        return this;
    }

    public ShowServerAttachableNicNumResponse withInterfaceAttachments(
        Consumer<List<InterfaceExt>> interfaceAttachmentsSetter) {
        if (this.interfaceAttachments == null) {
            this.interfaceAttachments = new ArrayList<>();
        }
        interfaceAttachmentsSetter.accept(this.interfaceAttachments);
        return this;
    }

    /**
     * Get interfaceAttachments
     * @return interfaceAttachments
     */
    public List<InterfaceExt> getInterfaceAttachments() {
        return interfaceAttachments;
    }

    public void setInterfaceAttachments(List<InterfaceExt> interfaceAttachments) {
        this.interfaceAttachments = interfaceAttachments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerAttachableNicNumResponse that = (ShowServerAttachableNicNumResponse) obj;
        return Objects.equals(this.attachableQuantity, that.attachableQuantity)
            && Objects.equals(this.interfaceAttachments, that.interfaceAttachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachableQuantity, interfaceAttachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerAttachableNicNumResponse {\n");
        sb.append("    attachableQuantity: ").append(toIndentedString(attachableQuantity)).append("\n");
        sb.append("    interfaceAttachments: ").append(toIndentedString(interfaceAttachments)).append("\n");
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
