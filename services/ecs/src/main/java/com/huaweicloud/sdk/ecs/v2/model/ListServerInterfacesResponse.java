package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.InterfaceAttachment;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListServerInterfacesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interfaceAttachments")
    
    private List<InterfaceAttachment> interfaceAttachments = null;
    
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

    public ListServerInterfacesResponse withInterfaceAttachments(Consumer<List<InterfaceAttachment>> interfaceAttachmentsSetter) {
        if(this.interfaceAttachments == null ){
            this.interfaceAttachments = new ArrayList<>();
        }
        interfaceAttachmentsSetter.accept(this.interfaceAttachments);
        return this;
    }

    /**
     * 云服务器网卡信息列表
     * @return interfaceAttachments
     */
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
        return Objects.equals(this.interfaceAttachments, listServerInterfacesResponse.interfaceAttachments);
    }
    @Override
    public int hashCode() {
        return Objects.hash(interfaceAttachments);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerInterfacesResponse {\n");
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

