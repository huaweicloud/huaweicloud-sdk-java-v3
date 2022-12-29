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
public class ListRuleAclsUsingGetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    /**
     * 规则Type0：互联网规则,1：vpc规则, 2:nat规则
     */
    public static final class TypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final TypeEnum NUMBER_0 = new TypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final TypeEnum NUMBER_1 = new TypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final TypeEnum NUMBER_2 = new TypeEnum(2);

        private static final Map<Integer, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TypeEnum> createStaticFields() {
            Map<Integer, TypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TypeEnum(Integer value) {
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
        public static TypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    /**
     * 协议类型:TCP为6, UDP为17,ICMP为1,ICMPV6为58,ANY为-1
     */
    public static final class ProtocolEnum {

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final ProtocolEnum NUMBER_6 = new ProtocolEnum(6);

        /**
         * Enum NUMBER_17 for value: 17
         */
        public static final ProtocolEnum NUMBER_17 = new ProtocolEnum(17);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ProtocolEnum NUMBER_1 = new ProtocolEnum(1);

        /**
         * Enum NUMBER_58 for value: 58
         */
        public static final ProtocolEnum NUMBER_58 = new ProtocolEnum(58);

        private static final Map<Integer, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProtocolEnum> createStaticFields() {
            Map<Integer, ProtocolEnum> map = new HashMap<>();
            map.put(6, NUMBER_6);
            map.put(17, NUMBER_17);
            map.put(1, NUMBER_1);
            map.put(58, NUMBER_58);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ProtocolEnum(Integer value) {
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
        public static ProtocolEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private Integer direction;

    /**
     * 规则下发状态 0：禁用,1：启用
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
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
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    /**
     * 动作0：permit,1：deny
     */
    public static final class ActionTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ActionTypeEnum NUMBER_0 = new ActionTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ActionTypeEnum NUMBER_1 = new ActionTypeEnum(1);

        private static final Map<Integer, ActionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ActionTypeEnum> createStaticFields() {
            Map<Integer, ActionTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ActionTypeEnum(Integer value) {
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
        public static ActionTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            ActionTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionTypeEnum(value);
            }
            return result;
        }

        public static ActionTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            ActionTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionTypeEnum) {
                return this.value.equals(((ActionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private ActionTypeEnum actionType;

    /**
     * 地址类型0 ipv4,1 ipv6,2 domain
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

    public ListRuleAclsUsingGetRequest withObjectId(String objectId) {
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

    public ListRuleAclsUsingGetRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 规则Type0：互联网规则,1：vpc规则, 2:nat规则
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListRuleAclsUsingGetRequest withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型:TCP为6, UDP为17,ICMP为1,ICMPV6为58,ANY为-1
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public ListRuleAclsUsingGetRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * ip地址
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ListRuleAclsUsingGetRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListRuleAclsUsingGetRequest withDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 方向0：外到内1：内到外
     * @return direction
     */
    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public ListRuleAclsUsingGetRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 规则下发状态 0：禁用,1：启用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListRuleAclsUsingGetRequest withActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * 动作0：permit,1：deny
     * @return actionType
     */
    public ActionTypeEnum getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
    }

    public ListRuleAclsUsingGetRequest withAddressType(AddressTypeEnum addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * 地址类型0 ipv4,1 ipv6,2 domain
     * @return addressType
     */
    public AddressTypeEnum getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressTypeEnum addressType) {
        this.addressType = addressType;
    }

    public ListRuleAclsUsingGetRequest withLimit(Integer limit) {
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

    public ListRuleAclsUsingGetRequest withOffset(Integer offset) {
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

    public ListRuleAclsUsingGetRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListRuleAclsUsingGetRequest withFwInstanceId(String fwInstanceId) {
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
        ListRuleAclsUsingGetRequest listRuleAclsUsingGetRequest = (ListRuleAclsUsingGetRequest) o;
        return Objects.equals(this.objectId, listRuleAclsUsingGetRequest.objectId)
            && Objects.equals(this.type, listRuleAclsUsingGetRequest.type)
            && Objects.equals(this.protocol, listRuleAclsUsingGetRequest.protocol)
            && Objects.equals(this.ip, listRuleAclsUsingGetRequest.ip)
            && Objects.equals(this.name, listRuleAclsUsingGetRequest.name)
            && Objects.equals(this.direction, listRuleAclsUsingGetRequest.direction)
            && Objects.equals(this.status, listRuleAclsUsingGetRequest.status)
            && Objects.equals(this.actionType, listRuleAclsUsingGetRequest.actionType)
            && Objects.equals(this.addressType, listRuleAclsUsingGetRequest.addressType)
            && Objects.equals(this.limit, listRuleAclsUsingGetRequest.limit)
            && Objects.equals(this.offset, listRuleAclsUsingGetRequest.offset)
            && Objects.equals(this.enterpriseProjectId, listRuleAclsUsingGetRequest.enterpriseProjectId)
            && Objects.equals(this.fwInstanceId, listRuleAclsUsingGetRequest.fwInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId,
            type,
            protocol,
            ip,
            name,
            direction,
            status,
            actionType,
            addressType,
            limit,
            offset,
            enterpriseProjectId,
            fwInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRuleAclsUsingGetRequest {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
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
