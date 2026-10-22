package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class DetachV2AgencyPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    /**
     * **参数解释**：权限策略名称，使用AI DataLake的功能，需要授权一些权限策略。 **约束限制**：不支持移除必选策略。 **取值范围**：   - AI_DATALAKE_SMN_POLICY：消息通知功能相关权限策略，用来将系统通知消息转发到SMN。   - AI_DATALAKE_AOM_POLICY：AOM功能相关权限策略。   - AI_DATALAKE_SWR_POLICY：镜像包注册功能相关权限策略。   - AI_DATALAKE_VPCEP_POLICY：网络打通功能相关权限策略。   - AI_DATALAKE_DNS_POLICY：DNS相关权限策略。   - AI_DATALAKE_OBS_POLICY：OBS相关权限策略。   - AI_DATALAKE_VPC_POLICY：VPC相关权限策略。   - AI_DATALAKE_DCS_POLICY：DCS相关权限策略。   - AI_DATALAKE_DEW_POLICY：DEW相关权限策略。 **默认取值**：不涉及。
     */
    public static final class PolicyNameEnum {

        /**
         * Enum AI_DATALAKE_SMN_POLICY for value: "AI_DATALAKE_SMN_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_SMN_POLICY = new PolicyNameEnum("AI_DATALAKE_SMN_POLICY");

        /**
         * Enum AI_DATALAKE_AOM_POLICY for value: "AI_DATALAKE_AOM_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_AOM_POLICY = new PolicyNameEnum("AI_DATALAKE_AOM_POLICY");

        /**
         * Enum AI_DATALAKE_SWR_POLICY for value: "AI_DATALAKE_SWR_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_SWR_POLICY = new PolicyNameEnum("AI_DATALAKE_SWR_POLICY");

        /**
         * Enum AI_DATALAKE_VPCEP_POLICY for value: "AI_DATALAKE_VPCEP_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_VPCEP_POLICY = new PolicyNameEnum("AI_DATALAKE_VPCEP_POLICY");

        /**
         * Enum AI_DATALAKE_DNS_POLICY for value: "AI_DATALAKE_DNS_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_DNS_POLICY = new PolicyNameEnum("AI_DATALAKE_DNS_POLICY");

        /**
         * Enum AI_DATALAKE_OBS_POLICY for value: "AI_DATALAKE_OBS_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_OBS_POLICY = new PolicyNameEnum("AI_DATALAKE_OBS_POLICY");

        /**
         * Enum AI_DATALAKE_VPC_POLICY for value: "AI_DATALAKE_VPC_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_VPC_POLICY = new PolicyNameEnum("AI_DATALAKE_VPC_POLICY");

        /**
         * Enum AI_DATALAKE_DCS_POLICY for value: "AI_DATALAKE_DCS_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_DCS_POLICY = new PolicyNameEnum("AI_DATALAKE_DCS_POLICY");

        /**
         * Enum AI_DATALAKE_DEW_POLICY for value: "AI_DATALAKE_DEW_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_DEW_POLICY = new PolicyNameEnum("AI_DATALAKE_DEW_POLICY");

        private static final Map<String, PolicyNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyNameEnum> createStaticFields() {
            Map<String, PolicyNameEnum> map = new HashMap<>();
            map.put("AI_DATALAKE_SMN_POLICY", AI_DATALAKE_SMN_POLICY);
            map.put("AI_DATALAKE_AOM_POLICY", AI_DATALAKE_AOM_POLICY);
            map.put("AI_DATALAKE_SWR_POLICY", AI_DATALAKE_SWR_POLICY);
            map.put("AI_DATALAKE_VPCEP_POLICY", AI_DATALAKE_VPCEP_POLICY);
            map.put("AI_DATALAKE_DNS_POLICY", AI_DATALAKE_DNS_POLICY);
            map.put("AI_DATALAKE_OBS_POLICY", AI_DATALAKE_OBS_POLICY);
            map.put("AI_DATALAKE_VPC_POLICY", AI_DATALAKE_VPC_POLICY);
            map.put("AI_DATALAKE_DCS_POLICY", AI_DATALAKE_DCS_POLICY);
            map.put("AI_DATALAKE_DEW_POLICY", AI_DATALAKE_DEW_POLICY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyNameEnum(String value) {
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
        public static PolicyNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyNameEnum(value));
        }

        public static PolicyNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyNameEnum) {
                return this.value.equals(((PolicyNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private PolicyNameEnum policyName;

    public DetachV2AgencyPolicyRequest withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释**：委托名称。 **约束限制**：固定值ai_datalake_admin_trust。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public DetachV2AgencyPolicyRequest withPolicyName(PolicyNameEnum policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * **参数解释**：权限策略名称，使用AI DataLake的功能，需要授权一些权限策略。 **约束限制**：不支持移除必选策略。 **取值范围**：   - AI_DATALAKE_SMN_POLICY：消息通知功能相关权限策略，用来将系统通知消息转发到SMN。   - AI_DATALAKE_AOM_POLICY：AOM功能相关权限策略。   - AI_DATALAKE_SWR_POLICY：镜像包注册功能相关权限策略。   - AI_DATALAKE_VPCEP_POLICY：网络打通功能相关权限策略。   - AI_DATALAKE_DNS_POLICY：DNS相关权限策略。   - AI_DATALAKE_OBS_POLICY：OBS相关权限策略。   - AI_DATALAKE_VPC_POLICY：VPC相关权限策略。   - AI_DATALAKE_DCS_POLICY：DCS相关权限策略。   - AI_DATALAKE_DEW_POLICY：DEW相关权限策略。 **默认取值**：不涉及。
     * @return policyName
     */
    public PolicyNameEnum getPolicyName() {
        return policyName;
    }

    public void setPolicyName(PolicyNameEnum policyName) {
        this.policyName = policyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetachV2AgencyPolicyRequest that = (DetachV2AgencyPolicyRequest) obj;
        return Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.policyName, that.policyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyName, policyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachV2AgencyPolicyRequest {\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
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
