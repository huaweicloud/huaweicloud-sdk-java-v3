package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * items
 */
public class BlackWhiteListResponseDataRecords {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_id")

    private String listId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private Integer direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private Integer addressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private Integer protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public BlackWhiteListResponseDataRecords withListId(String listId) {
        this.listId = listId;
        return this;
    }

    /**
     * 黑白名单列表id
     * @return listId
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public BlackWhiteListResponseDataRecords withDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 黑白地址方向0：源地址1：目的地址
     * @return direction
     */
    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public BlackWhiteListResponseDataRecords withAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * IP地址类型0：ipv4,1:ipv6
     * @return addressType
     */
    public Integer getAddressType() {
        return addressType;
    }

    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    public BlackWhiteListResponseDataRecords withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * ip地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BlackWhiteListResponseDataRecords withProtocol(Integer protocol) {
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

    public BlackWhiteListResponseDataRecords withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 端口
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public BlackWhiteListResponseDataRecords withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BlackWhiteListResponseDataRecords that = (BlackWhiteListResponseDataRecords) obj;
        return Objects.equals(this.listId, that.listId) && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.addressType, that.addressType) && Objects.equals(this.address, that.address)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.port, that.port)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listId, direction, addressType, address, protocol, port, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BlackWhiteListResponseDataRecords {\n");
        sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
