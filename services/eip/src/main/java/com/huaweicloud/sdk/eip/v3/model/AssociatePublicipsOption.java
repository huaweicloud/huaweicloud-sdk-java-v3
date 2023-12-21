package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AssociatePublicipsOption
 */
public class AssociatePublicipsOption {

    /**
     * 功能说明：端口所属实例类型 取值范围：PORT、NATGW、VPN、ELB 约束：associate_instance_type和associate_instance_id都不为空时表示绑定实例 约束：associate_instance_type字段不允许为空 约束：双栈公网IP不允许修改绑定的实例
     */
    public static final class AssociateInstanceTypeEnum {

        /**
         * Enum PORT for value: "PORT"
         */
        public static final AssociateInstanceTypeEnum PORT = new AssociateInstanceTypeEnum("PORT");

        /**
         * Enum NATGW for value: "NATGW"
         */
        public static final AssociateInstanceTypeEnum NATGW = new AssociateInstanceTypeEnum("NATGW");

        /**
         * Enum VPN for value: "VPN"
         */
        public static final AssociateInstanceTypeEnum VPN = new AssociateInstanceTypeEnum("VPN");

        /**
         * Enum ELB for value: "ELB"
         */
        public static final AssociateInstanceTypeEnum ELB = new AssociateInstanceTypeEnum("ELB");

        private static final Map<String, AssociateInstanceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssociateInstanceTypeEnum> createStaticFields() {
            Map<String, AssociateInstanceTypeEnum> map = new HashMap<>();
            map.put("PORT", PORT);
            map.put("NATGW", NATGW);
            map.put("VPN", VPN);
            map.put("ELB", ELB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssociateInstanceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AssociateInstanceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssociateInstanceTypeEnum(value));
        }

        public static AssociateInstanceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssociateInstanceTypeEnum) {
                return this.value.equals(((AssociateInstanceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_type")

    private AssociateInstanceTypeEnum associateInstanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_id")

    private String associateInstanceId;

    public AssociatePublicipsOption withAssociateInstanceType(AssociateInstanceTypeEnum associateInstanceType) {
        this.associateInstanceType = associateInstanceType;
        return this;
    }

    /**
     * 功能说明：端口所属实例类型 取值范围：PORT、NATGW、VPN、ELB 约束：associate_instance_type和associate_instance_id都不为空时表示绑定实例 约束：associate_instance_type字段不允许为空 约束：双栈公网IP不允许修改绑定的实例
     * @return associateInstanceType
     */
    public AssociateInstanceTypeEnum getAssociateInstanceType() {
        return associateInstanceType;
    }

    public void setAssociateInstanceType(AssociateInstanceTypeEnum associateInstanceType) {
        this.associateInstanceType = associateInstanceType;
    }

    public AssociatePublicipsOption withAssociateInstanceId(String associateInstanceId) {
        this.associateInstanceId = associateInstanceId;
        return this;
    }

    /**
     * 功能说明：端口所属实例ID，例如RDS实例ID 约束：associate_instance_type和associate_instance_id都不为空时表示绑定实例； 约束：associate_instance_id不允许为空 约束：双栈公网IP不允许修改绑定的实例
     * @return associateInstanceId
     */
    public String getAssociateInstanceId() {
        return associateInstanceId;
    }

    public void setAssociateInstanceId(String associateInstanceId) {
        this.associateInstanceId = associateInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociatePublicipsOption that = (AssociatePublicipsOption) obj;
        return Objects.equals(this.associateInstanceType, that.associateInstanceType)
            && Objects.equals(this.associateInstanceId, that.associateInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associateInstanceType, associateInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociatePublicipsOption {\n");
        sb.append("    associateInstanceType: ").append(toIndentedString(associateInstanceType)).append("\n");
        sb.append("    associateInstanceId: ").append(toIndentedString(associateInstanceId)).append("\n");
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
