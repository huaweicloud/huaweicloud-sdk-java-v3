package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建委托请求参数
 */
public class AgencyTypeBody {

    /**
     * Gets or Sets policyTypes
     */
    public static final class PolicyTypesEnum {

        /**
         * Enum FABRIC_COMMON_POLICY for value: "FABRIC_COMMON_POLICY"
         */
        public static final PolicyTypesEnum FABRIC_COMMON_POLICY = new PolicyTypesEnum("FABRIC_COMMON_POLICY");

        /**
         * Enum FABRIC_SMN_POLICY for value: "FABRIC_SMN_POLICY"
         */
        public static final PolicyTypesEnum FABRIC_SMN_POLICY = new PolicyTypesEnum("FABRIC_SMN_POLICY");

        /**
         * Enum FABRIC_LAKEFORMATION_POLICY for value: "FABRIC_LAKEFORMATION_POLICY"
         */
        public static final PolicyTypesEnum FABRIC_LAKEFORMATION_POLICY =
            new PolicyTypesEnum("FABRIC_LAKEFORMATION_POLICY");

        /**
         * Enum FABRIC_AOM_POLICY for value: "FABRIC_AOM_POLICY"
         */
        public static final PolicyTypesEnum FABRIC_AOM_POLICY = new PolicyTypesEnum("FABRIC_AOM_POLICY");

        private static final Map<String, PolicyTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyTypesEnum> createStaticFields() {
            Map<String, PolicyTypesEnum> map = new HashMap<>();
            map.put("FABRIC_COMMON_POLICY", FABRIC_COMMON_POLICY);
            map.put("FABRIC_SMN_POLICY", FABRIC_SMN_POLICY);
            map.put("FABRIC_LAKEFORMATION_POLICY", FABRIC_LAKEFORMATION_POLICY);
            map.put("FABRIC_AOM_POLICY", FABRIC_AOM_POLICY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyTypesEnum(String value) {
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
        public static PolicyTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyTypesEnum(value));
        }

        public static PolicyTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyTypesEnum) {
                return this.value.equals(((PolicyTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_types")

    private List<PolicyTypesEnum> policyTypes = null;

    public AgencyTypeBody withPolicyTypes(List<PolicyTypesEnum> policyTypes) {
        this.policyTypes = policyTypes;
        return this;
    }

    public AgencyTypeBody addPolicyTypesItem(PolicyTypesEnum policyTypesItem) {
        if (this.policyTypes == null) {
            this.policyTypes = new ArrayList<>();
        }
        this.policyTypes.add(policyTypesItem);
        return this;
    }

    public AgencyTypeBody withPolicyTypes(Consumer<List<PolicyTypesEnum>> policyTypesSetter) {
        if (this.policyTypes == null) {
            this.policyTypes = new ArrayList<>();
        }
        policyTypesSetter.accept(this.policyTypes);
        return this;
    }

    /**
     * 权限类型列表，使用Fabric的功能，可能需要授权一些权限策略，可以在policy_types中加入策略类型来授权权限。FABRIC_COMMON_POLICY：基础通用服务权限策略，是委托必需的权限策略；FABRIC_SMN_POLICY：消息通知功能相关权限策略，用来将系统通知消息转发到SMN；FABRIC_LAKEFORMATION_POLICY：LakeFormation功能相关权限策略；FABRIC_AOM_POLICY：AOM功能相关权限策略。
     * @return policyTypes
     */
    public List<PolicyTypesEnum> getPolicyTypes() {
        return policyTypes;
    }

    public void setPolicyTypes(List<PolicyTypesEnum> policyTypes) {
        this.policyTypes = policyTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgencyTypeBody that = (AgencyTypeBody) obj;
        return Objects.equals(this.policyTypes, that.policyTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyTypeBody {\n");
        sb.append("    policyTypes: ").append(toIndentedString(policyTypes)).append("\n");
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
