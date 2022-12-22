package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateBlackWhiteListDto
 */
public class UpdateBlackWhiteListDto {

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

    /**
     * 黑白名单类型4：黑名单，5：白名单
     */
    public static final class ListTypeEnum {

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final ListTypeEnum NUMBER_4 = new ListTypeEnum(4);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final ListTypeEnum NUMBER_5 = new ListTypeEnum(5);

        private static final Map<Integer, ListTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ListTypeEnum> createStaticFields() {
            Map<Integer, ListTypeEnum> map = new HashMap<>();
            map.put(4, NUMBER_4);
            map.put(5, NUMBER_5);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ListTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ListTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            ListTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ListTypeEnum(value);
            }
            return result;
        }

        public static ListTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            ListTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ListTypeEnum) {
                return this.value.equals(((ListTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_type")

    private ListTypeEnum listType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    public UpdateBlackWhiteListDto withDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 地址方向0：源地址1：目的地址
     * @return direction
     */
    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public UpdateBlackWhiteListDto withAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * 地址类型0：ipv4,1:ipv6,2:domain
     * @return addressType
     */
    public Integer getAddressType() {
        return addressType;
    }

    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    public UpdateBlackWhiteListDto withAddress(String address) {
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

    public UpdateBlackWhiteListDto withProtocol(Integer protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型:TCP为6, UDP为17,ICMP为1,ICMPV6为58,ANY为-1
     * @return protocol
     */
    public Integer getProtocol() {
        return protocol;
    }

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    public UpdateBlackWhiteListDto withPort(String port) {
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

    public UpdateBlackWhiteListDto withListType(ListTypeEnum listType) {
        this.listType = listType;
        return this;
    }

    /**
     * 黑白名单类型4：黑名单，5：白名单
     * @return listType
     */
    public ListTypeEnum getListType() {
        return listType;
    }

    public void setListType(ListTypeEnum listType) {
        this.listType = listType;
    }

    public UpdateBlackWhiteListDto withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用查询防火墙实例接口获得，注意type为0的为互联网边界防护对象id，type为1的为VPC边界防护对象id。具体可参考APIExlorer和帮助中心FAQ。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateBlackWhiteListDto updateBlackWhiteListDto = (UpdateBlackWhiteListDto) o;
        return Objects.equals(this.direction, updateBlackWhiteListDto.direction)
            && Objects.equals(this.addressType, updateBlackWhiteListDto.addressType)
            && Objects.equals(this.address, updateBlackWhiteListDto.address)
            && Objects.equals(this.protocol, updateBlackWhiteListDto.protocol)
            && Objects.equals(this.port, updateBlackWhiteListDto.port)
            && Objects.equals(this.listType, updateBlackWhiteListDto.listType)
            && Objects.equals(this.objectId, updateBlackWhiteListDto.objectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, addressType, address, protocol, port, listType, objectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBlackWhiteListDto {\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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
