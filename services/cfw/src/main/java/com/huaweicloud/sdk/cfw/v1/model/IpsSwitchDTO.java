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
 * description
 */
public class IpsSwitchDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    /**
     * 补丁类型，仅支持虚拟补丁，值为2。
     */
    public static final class IpsTypeEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IpsTypeEnum NUMBER_1 = new IpsTypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final IpsTypeEnum NUMBER_2 = new IpsTypeEnum(2);

        private static final Map<Integer, IpsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IpsTypeEnum> createStaticFields() {
            Map<Integer, IpsTypeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IpsTypeEnum(Integer value) {
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
        public static IpsTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpsTypeEnum(value));
        }

        public static IpsTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpsTypeEnum) {
                return this.value.equals(((IpsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_type")

    private IpsTypeEnum ipsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public IpsSwitchDTO withObjectId(String objectId) {
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

    public IpsSwitchDTO withIpsType(IpsTypeEnum ipsType) {
        this.ipsType = ipsType;
        return this;
    }

    /**
     * 补丁类型，仅支持虚拟补丁，值为2。
     * @return ipsType
     */
    public IpsTypeEnum getIpsType() {
        return ipsType;
    }

    public void setIpsType(IpsTypeEnum ipsType) {
        this.ipsType = ipsType;
    }

    public IpsSwitchDTO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * ips特性开关状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpsSwitchDTO that = (IpsSwitchDTO) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.ipsType, that.ipsType)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, ipsType, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpsSwitchDTO {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    ipsType: ").append(toIndentedString(ipsType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
