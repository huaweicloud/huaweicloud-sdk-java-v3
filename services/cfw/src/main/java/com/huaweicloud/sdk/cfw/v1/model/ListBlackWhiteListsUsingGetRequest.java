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
public class ListBlackWhiteListsUsingGetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

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

    /**
     * IP地址类型0：ipv4,1:ipv6,2:domain
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

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final AddressTypeEnum NUMBER_2 = new AddressTypeEnum(2);

        private static final Map<Integer, AddressTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AddressTypeEnum> createStaticFields() {
            Map<Integer, AddressTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
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
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    public ListBlackWhiteListsUsingGetRequest withObjectId(String objectId) {
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

    public ListBlackWhiteListsUsingGetRequest withListType(ListTypeEnum listType) {
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

    public ListBlackWhiteListsUsingGetRequest withAddressType(AddressTypeEnum addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * IP地址类型0：ipv4,1:ipv6,2:domain
     * @return addressType
     */
    public AddressTypeEnum getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressTypeEnum addressType) {
        this.addressType = addressType;
    }

    public ListBlackWhiteListsUsingGetRequest withAddress(String address) {
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

    public ListBlackWhiteListsUsingGetRequest withPort(String port) {
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

    public ListBlackWhiteListsUsingGetRequest withLimit(Integer limit) {
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

    public ListBlackWhiteListsUsingGetRequest withOffset(Integer offset) {
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

    public ListBlackWhiteListsUsingGetRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListBlackWhiteListsUsingGetRequest withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙实例id，创建云防火墙后用于标志防火墙由系统自动生成的标志id，可通过调用查询防火墙实例接口获得。具体可参考APIExlorer和帮助中心FAQ。
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
        ListBlackWhiteListsUsingGetRequest listBlackWhiteListsUsingGetRequest = (ListBlackWhiteListsUsingGetRequest) o;
        return Objects.equals(this.objectId, listBlackWhiteListsUsingGetRequest.objectId)
            && Objects.equals(this.listType, listBlackWhiteListsUsingGetRequest.listType)
            && Objects.equals(this.addressType, listBlackWhiteListsUsingGetRequest.addressType)
            && Objects.equals(this.address, listBlackWhiteListsUsingGetRequest.address)
            && Objects.equals(this.port, listBlackWhiteListsUsingGetRequest.port)
            && Objects.equals(this.limit, listBlackWhiteListsUsingGetRequest.limit)
            && Objects.equals(this.offset, listBlackWhiteListsUsingGetRequest.offset)
            && Objects.equals(this.enterpriseProjectId, listBlackWhiteListsUsingGetRequest.enterpriseProjectId)
            && Objects.equals(this.fwInstanceId, listBlackWhiteListsUsingGetRequest.fwInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(objectId, listType, addressType, address, port, limit, offset, enterpriseProjectId, fwInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBlackWhiteListsUsingGetRequest {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
