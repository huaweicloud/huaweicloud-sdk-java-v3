package com.huaweicloud.sdk.dataartsfabric.v1.model;

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
public class DeleteAgencyRequest {

    /**
     * 权限策略类型。FABRIC_COMMON_POLICY：基础通用服务相关的权限策略；FABRIC_SMN_POLICY：消息通知功能相关的权限策略；FABRIC_LAKEFORMATION_POLICY：LakeFormation功能相关的权限策略；FABRIC_AOM_POLICY：AOM功能相关的权限策略。
     */
    public static final class PolicyTypeEnum {

        /**
         * Enum FABRIC_COMMON_POLICY for value: "FABRIC_COMMON_POLICY"
         */
        public static final PolicyTypeEnum FABRIC_COMMON_POLICY = new PolicyTypeEnum("FABRIC_COMMON_POLICY");

        /**
         * Enum FABRIC_SMN_POLICY for value: "FABRIC_SMN_POLICY"
         */
        public static final PolicyTypeEnum FABRIC_SMN_POLICY = new PolicyTypeEnum("FABRIC_SMN_POLICY");

        /**
         * Enum FABRIC_LAKEFORMATION_POLICY for value: "FABRIC_LAKEFORMATION_POLICY"
         */
        public static final PolicyTypeEnum FABRIC_LAKEFORMATION_POLICY =
            new PolicyTypeEnum("FABRIC_LAKEFORMATION_POLICY");

        /**
         * Enum FABRIC_AOM_POLICY for value: "FABRIC_AOM_POLICY"
         */
        public static final PolicyTypeEnum FABRIC_AOM_POLICY = new PolicyTypeEnum("FABRIC_AOM_POLICY");

        private static final Map<String, PolicyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyTypeEnum> createStaticFields() {
            Map<String, PolicyTypeEnum> map = new HashMap<>();
            map.put("FABRIC_COMMON_POLICY", FABRIC_COMMON_POLICY);
            map.put("FABRIC_SMN_POLICY", FABRIC_SMN_POLICY);
            map.put("FABRIC_LAKEFORMATION_POLICY", FABRIC_LAKEFORMATION_POLICY);
            map.put("FABRIC_AOM_POLICY", FABRIC_AOM_POLICY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyTypeEnum(String value) {
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
        public static PolicyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyTypeEnum(value));
        }

        public static PolicyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyTypeEnum) {
                return this.value.equals(((PolicyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private PolicyTypeEnum policyType;

    public DeleteAgencyRequest withPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * 权限策略类型。FABRIC_COMMON_POLICY：基础通用服务相关的权限策略；FABRIC_SMN_POLICY：消息通知功能相关的权限策略；FABRIC_LAKEFORMATION_POLICY：LakeFormation功能相关的权限策略；FABRIC_AOM_POLICY：AOM功能相关的权限策略。
     * @return policyType
     */
    public PolicyTypeEnum getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAgencyRequest that = (DeleteAgencyRequest) obj;
        return Objects.equals(this.policyType, that.policyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAgencyRequest {\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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
