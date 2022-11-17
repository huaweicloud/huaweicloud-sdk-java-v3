package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * service item
 */
public class ServiceItemListResponseDtoDataRecords {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private Integer protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_port")

    private String sourcePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_port")

    private String destPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ServiceItemListResponseDtoDataRecords withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * 服务成员id
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public ServiceItemListResponseDtoDataRecords withProtocol(Integer protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型:TCP为6,UDP为17,ICMP为1,ICMPV6为58,ANY为-1,手动类型不为空，自动类型为空
     * @return protocol
     */
    public Integer getProtocol() {
        return protocol;
    }

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    public ServiceItemListResponseDtoDataRecords withSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    /**
     * 源端口
     * @return sourcePort
     */
    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    public ServiceItemListResponseDtoDataRecords withDestPort(String destPort) {
        this.destPort = destPort;
        return this;
    }

    /**
     * 目的端口
     * @return destPort
     */
    public String getDestPort() {
        return destPort;
    }

    public void setDestPort(String destPort) {
        this.destPort = destPort;
    }

    public ServiceItemListResponseDtoDataRecords withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 服务成员名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceItemListResponseDtoDataRecords withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 服务成员描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceItemListResponseDtoDataRecords serviceItemListResponseDtoDataRecords =
            (ServiceItemListResponseDtoDataRecords) o;
        return Objects.equals(this.itemId, serviceItemListResponseDtoDataRecords.itemId)
            && Objects.equals(this.protocol, serviceItemListResponseDtoDataRecords.protocol)
            && Objects.equals(this.sourcePort, serviceItemListResponseDtoDataRecords.sourcePort)
            && Objects.equals(this.destPort, serviceItemListResponseDtoDataRecords.destPort)
            && Objects.equals(this.name, serviceItemListResponseDtoDataRecords.name)
            && Objects.equals(this.description, serviceItemListResponseDtoDataRecords.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, protocol, sourcePort, destPort, name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceItemListResponseDtoDataRecords {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
        sb.append("    destPort: ").append(toIndentedString(destPort)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
