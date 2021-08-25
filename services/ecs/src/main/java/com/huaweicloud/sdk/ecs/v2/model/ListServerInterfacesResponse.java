package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListServerInterfacesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachableQuantity")

    private InterfaceAttachableQuantity attachableQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interfaceAttachments")

    private List<InterfaceAttachment> interfaceAttachments = null;

    public ListServerInterfacesResponse withAttachableQuantity(InterfaceAttachableQuantity attachableQuantity) {
        this.attachableQuantity = attachableQuantity;
        return this;
    }

    public ListServerInterfacesResponse withAttachableQuantity(
        Consumer<InterfaceAttachableQuantity> attachableQuantitySetter) {
        if (this.attachableQuantity == null) {
            this.attachableQuantity = new InterfaceAttachableQuantity();
            attachableQuantitySetter.accept(this.attachableQuantity);
        }

        return this;
    }

    /** Get attachableQuantity
     * 
     * @return attachableQuantity */
    public InterfaceAttachableQuantity getAttachableQuantity() {
        return attachableQuantity;
    }

    public void setAttachableQuantity(InterfaceAttachableQuantity attachableQuantity) {
        this.attachableQuantity = attachableQuantity;
    }

    public ListServerInterfacesResponse withInterfaceAttachments(List<InterfaceAttachment> interfaceAttachments) {
        this.interfaceAttachments = interfaceAttachments;
        return this;
    }

    public ListServerInterfacesResponse addInterfaceAttachmentsItem(InterfaceAttachment interfaceAttachmentsItem) {
        if (this.interfaceAttachments == null) {
            this.interfaceAttachments = new ArrayList<>();
        }
        this.interfaceAttachments.add(interfaceAttachmentsItem);
        return this;
    }

    public ListServerInterfacesResponse withInterfaceAttachments(
        Consumer<List<InterfaceAttachment>> interfaceAttachmentsSetter) {
        if (this.interfaceAttachments == null) {
            this.interfaceAttachments = new ArrayList<>();
        }
        interfaceAttachmentsSetter.accept(this.interfaceAttachments);
        return this;
    }

    /** 云服务器网卡信息列表
     * 
     * @return interfaceAttachments */
    public List<InterfaceAttachment> getInterfaceAttachments() {
        return interfaceAttachments;
    }

    public void setInterfaceAttachments(List<InterfaceAttachment> interfaceAttachments) {
        this.interfaceAttachments = interfaceAttachments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServerInterfacesResponse listServerInterfacesResponse = (ListServerInterfacesResponse) o;
        return Objects.equals(this.attachableQuantity, listServerInterfacesResponse.attachableQuantity)
            && Objects.equals(this.interfaceAttachments, listServerInterfacesResponse.interfaceAttachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachableQuantity, interfaceAttachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerInterfacesResponse {\n");
        sb.append("    attachableQuantity: ").append(toIndentedString(attachableQuantity)).append("\n");
        sb.append("    interfaceAttachments: ").append(toIndentedString(interfaceAttachments)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
