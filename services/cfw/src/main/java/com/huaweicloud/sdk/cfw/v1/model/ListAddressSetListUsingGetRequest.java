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
 * Request Object
 */
public class ListAddressSetListUsingGetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_word")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

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
            AddressTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AddressTypeEnum(value);
            }
            return result;
        }

        public static AddressTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            AddressTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    public ListAddressSetListUsingGetRequest withObjectId(String objectId) {
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

    public ListAddressSetListUsingGetRequest withKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    /**
     * 关键字
     * @return keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public ListAddressSetListUsingGetRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAddressSetListUsingGetRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAddressSetListUsingGetRequest withAddress(String address) {
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

    public ListAddressSetListUsingGetRequest withAddressType(AddressTypeEnum addressType) {
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

    public ListAddressSetListUsingGetRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id，用户支持企业项目后，由企业项目生成的id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListAddressSetListUsingGetRequest withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙实例id，创建云防火墙后用于标志防火墙由系统自动生成的标志id，可通过调用查询防火墙实例接口获得。具体可参考APIExlorer和帮助中心FAQ。默认情况下，fw_instance_Id为空时，返回帐号下第一个墙的信息；fw_instance_Id非空时，返回与fw_instance_Id对应墙的信息。
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAddressSetListUsingGetRequest listAddressSetListUsingGetRequest = (ListAddressSetListUsingGetRequest) o;
        return Objects.equals(this.objectId, listAddressSetListUsingGetRequest.objectId)
            && Objects.equals(this.keyWord, listAddressSetListUsingGetRequest.keyWord)
            && Objects.equals(this.limit, listAddressSetListUsingGetRequest.limit)
            && Objects.equals(this.offset, listAddressSetListUsingGetRequest.offset)
            && Objects.equals(this.address, listAddressSetListUsingGetRequest.address)
            && Objects.equals(this.addressType, listAddressSetListUsingGetRequest.addressType)
            && Objects.equals(this.enterpriseProjectId, listAddressSetListUsingGetRequest.enterpriseProjectId)
            && Objects.equals(this.fwInstanceId, listAddressSetListUsingGetRequest.fwInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, keyWord, limit, offset, address, addressType, enterpriseProjectId, fwInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAddressSetListUsingGetRequest {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
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
