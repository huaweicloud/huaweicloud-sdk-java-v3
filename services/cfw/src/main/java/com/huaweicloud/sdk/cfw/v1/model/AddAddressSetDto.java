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
 * 添加地址组请求体
 */
public class AddAddressSetDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 地址类型0 ipv4,1 ipv6
     */
    public static final class AddressTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final AddressTypeEnum NUMBER_0 = new AddressTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AddressTypeEnum NUMBER_1 = new AddressTypeEnum(1);

        private static final Map<Integer, AddressTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AddressTypeEnum> createStaticFields() {
            Map<Integer, AddressTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AddressTypeEnum(Integer value) {
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
        public static AddressTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AddressTypeEnum(value));
        }

        public static AddressTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AddressTypeEnum) {
                return this.value.equals(((AddressTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private AddressTypeEnum addressType;

    public AddAddressSetDto withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 互联网边界防护对象id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)，type为0的为互联网边界防护对象id。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public AddAddressSetDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 地址组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddAddressSetDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 地址组描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddAddressSetDto withAddressType(AddressTypeEnum addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * 地址类型0 ipv4,1 ipv6
     * @return addressType
     */
    public AddressTypeEnum getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressTypeEnum addressType) {
        this.addressType = addressType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddAddressSetDto that = (AddAddressSetDto) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.addressType, that.addressType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, name, description, addressType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddAddressSetDto {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
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
