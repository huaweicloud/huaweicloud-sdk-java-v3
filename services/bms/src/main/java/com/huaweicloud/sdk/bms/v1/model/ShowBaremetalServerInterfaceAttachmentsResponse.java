package com.huaweicloud.sdk.bms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.InterfaceAttachments;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowBaremetalServerInterfaceAttachmentsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="interfaceAttachments")
    
    private List<InterfaceAttachments> interfaceAttachments = null;
    
    public ShowBaremetalServerInterfaceAttachmentsResponse withInterfaceAttachments(List<InterfaceAttachments> interfaceAttachments) {
        this.interfaceAttachments = interfaceAttachments;
        return this;
    }

    
    public ShowBaremetalServerInterfaceAttachmentsResponse addInterfaceAttachmentsItem(InterfaceAttachments interfaceAttachmentsItem) {
        if (this.interfaceAttachments == null) {
            this.interfaceAttachments = new ArrayList<>();
        }
        this.interfaceAttachments.add(interfaceAttachmentsItem);
        return this;
    }

    public ShowBaremetalServerInterfaceAttachmentsResponse withInterfaceAttachments(Consumer<List<InterfaceAttachments>> interfaceAttachmentsSetter) {
        if(this.interfaceAttachments == null ){
            this.interfaceAttachments = new ArrayList<>();
        }
        interfaceAttachmentsSetter.accept(this.interfaceAttachments);
        return this;
    }

    /**
     * 裸金属服务器网卡信息列表，详情请参见表2 interfaceAttachments字段数据结构说明。
     * @return interfaceAttachments
     */
    public List<InterfaceAttachments> getInterfaceAttachments() {
        return interfaceAttachments;
    }

    public void setInterfaceAttachments(List<InterfaceAttachments> interfaceAttachments) {
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
        ShowBaremetalServerInterfaceAttachmentsResponse showBaremetalServerInterfaceAttachmentsResponse = (ShowBaremetalServerInterfaceAttachmentsResponse) o;
        return Objects.equals(this.interfaceAttachments, showBaremetalServerInterfaceAttachmentsResponse.interfaceAttachments);
    }
    @Override
    public int hashCode() {
        return Objects.hash(interfaceAttachments);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBaremetalServerInterfaceAttachmentsResponse {\n");
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

