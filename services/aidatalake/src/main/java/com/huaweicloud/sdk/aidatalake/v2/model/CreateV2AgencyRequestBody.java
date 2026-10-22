package com.huaweicloud.sdk.aidatalake.v2.model;

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
 * **参数解释**：创建委托请求参数。 **约束限制**：必须包含以下必选策略：   - AI_DATALAKE_COMMON_POLICY   - AI_DATALAKE_SELF_POLICY   - AI_DATALAKE_LAKEFORMATION_POLICY   - AI_DATALAKE_LTS_POLICY **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class CreateV2AgencyRequestBody {

    /**
     * Gets or Sets policyNames
     */
    public static final class PolicyNamesEnum {

        /**
         * Enum AI_DATALAKE_COMMON_POLICY for value: "AI_DATALAKE_COMMON_POLICY"
         */
        public static final PolicyNamesEnum AI_DATALAKE_COMMON_POLICY =
            new PolicyNamesEnum("AI_DATALAKE_COMMON_POLICY");

        /**
         * Enum AI_DATALAKE_SELF_POLICY for value: "AI_DATALAKE_SELF_POLICY"
         */
        public static final PolicyNamesEnum AI_DATALAKE_SELF_POLICY = new PolicyNamesEnum("AI_DATALAKE_SELF_POLICY");

        /**
         * Enum AI_DATALAKE_SMN_POLICY for value: "AI_DATALAKE_SMN_POLICY"
         */
        public static final PolicyNamesEnum AI_DATALAKE_SMN_POLICY = new PolicyNamesEnum("AI_DATALAKE_SMN_POLICY");

        /**
         * Enum AI_DATALAKE_LAKEFORMATION_POLICY for value: "AI_DATALAKE_LAKEFORMATION_POLICY"
         */
        public static final PolicyNamesEnum AI_DATALAKE_LAKEFORMATION_POLICY =
            new PolicyNamesEnum("AI_DATALAKE_LAKEFORMATION_POLICY");

        /**
         * Enum AI_DATALAKE_AOM_POLICY for value: "AI_DATALAKE_AOM_POLICY"
         */
        public static final PolicyNamesEnum AI_DATALAKE_AOM_POLICY = new PolicyNamesEnum("AI_DATALAKE_AOM_POLICY");

        /**
         * Enum AI_DATALAKE_SWR_POLICY for value: "AI_DATALAKE_SWR_POLICY"
         */
        public static final PolicyNamesEnum AI_DATALAKE_SWR_POLICY = new PolicyNamesEnum("AI_DATALAKE_SWR_POLICY");

        /**
         * Enum AI_DATALAKE_LTS_POLICY for value: "AI_DATALAKE_LTS_POLICY"
         */
        public static final PolicyNamesEnum AI_DATALAKE_LTS_POLICY = new PolicyNamesEnum("AI_DATALAKE_LTS_POLICY");

        /**
         * Enum AI_DATALAKE_VPCEP_POLICY for value: "AI_DATALAKE_VPCEP_POLICY"
         */
        public static final PolicyNamesEnum AI_DATALAKE_VPCEP_POLICY = new PolicyNamesEnum("AI_DATALAKE_VPCEP_POLICY");

        /**
         * Enum AI_DATALAKE_DNS_POLICY for value: "AI_DATALAKE_DNS_POLICY"
         */
        public static final PolicyNamesEnum AI_DATALAKE_DNS_POLICY = new PolicyNamesEnum("AI_DATALAKE_DNS_POLICY");

        /**
         * Enum AI_DATALAKE_OBS_POLICY for value: "AI_DATALAKE_OBS_POLICY"
         */
        public static final PolicyNamesEnum AI_DATALAKE_OBS_POLICY = new PolicyNamesEnum("AI_DATALAKE_OBS_POLICY");

        /**
         * Enum AI_DATALAKE_VPC_POLICY for value: "AI_DATALAKE_VPC_POLICY"
         */
        public static final PolicyNamesEnum AI_DATALAKE_VPC_POLICY = new PolicyNamesEnum("AI_DATALAKE_VPC_POLICY");

        /**
         * Enum AI_DATALAKE_DCS_POLICY for value: "AI_DATALAKE_DCS_POLICY"
         */
        public static final PolicyNamesEnum AI_DATALAKE_DCS_POLICY = new PolicyNamesEnum("AI_DATALAKE_DCS_POLICY");

        /**
         * Enum AI_DATALAKE_DEW_POLICY for value: "AI_DATALAKE_DEW_POLICY"
         */
        public static final PolicyNamesEnum AI_DATALAKE_DEW_POLICY = new PolicyNamesEnum("AI_DATALAKE_DEW_POLICY");

        private static final Map<String, PolicyNamesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyNamesEnum> createStaticFields() {
            Map<String, PolicyNamesEnum> map = new HashMap<>();
            map.put("AI_DATALAKE_COMMON_POLICY", AI_DATALAKE_COMMON_POLICY);
            map.put("AI_DATALAKE_SELF_POLICY", AI_DATALAKE_SELF_POLICY);
            map.put("AI_DATALAKE_SMN_POLICY", AI_DATALAKE_SMN_POLICY);
            map.put("AI_DATALAKE_LAKEFORMATION_POLICY", AI_DATALAKE_LAKEFORMATION_POLICY);
            map.put("AI_DATALAKE_AOM_POLICY", AI_DATALAKE_AOM_POLICY);
            map.put("AI_DATALAKE_SWR_POLICY", AI_DATALAKE_SWR_POLICY);
            map.put("AI_DATALAKE_LTS_POLICY", AI_DATALAKE_LTS_POLICY);
            map.put("AI_DATALAKE_VPCEP_POLICY", AI_DATALAKE_VPCEP_POLICY);
            map.put("AI_DATALAKE_DNS_POLICY", AI_DATALAKE_DNS_POLICY);
            map.put("AI_DATALAKE_OBS_POLICY", AI_DATALAKE_OBS_POLICY);
            map.put("AI_DATALAKE_VPC_POLICY", AI_DATALAKE_VPC_POLICY);
            map.put("AI_DATALAKE_DCS_POLICY", AI_DATALAKE_DCS_POLICY);
            map.put("AI_DATALAKE_DEW_POLICY", AI_DATALAKE_DEW_POLICY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyNamesEnum(String value) {
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
        public static PolicyNamesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyNamesEnum(value));
        }

        public static PolicyNamesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyNamesEnum) {
                return this.value.equals(((PolicyNamesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_names")

    private List<PolicyNamesEnum> policyNames = null;

    public CreateV2AgencyRequestBody withPolicyNames(List<PolicyNamesEnum> policyNames) {
        this.policyNames = policyNames;
        return this;
    }

    public CreateV2AgencyRequestBody addPolicyNamesItem(PolicyNamesEnum policyNamesItem) {
        if (this.policyNames == null) {
            this.policyNames = new ArrayList<>();
        }
        this.policyNames.add(policyNamesItem);
        return this;
    }

    public CreateV2AgencyRequestBody withPolicyNames(Consumer<List<PolicyNamesEnum>> policyNamesSetter) {
        if (this.policyNames == null) {
            this.policyNames = new ArrayList<>();
        }
        policyNamesSetter.accept(this.policyNames);
        return this;
    }

    /**
     * **参数解释**：权限策略列表，指定需要授权给AI DataLake服务的权限策略，取值包括：   - AI_DATALAKE_COMMON_POLICY：基础服务权限策略。   - AI_DATALAKE_SELF_POLICY：AIDataLake服务自身访问权限策略，用于服务内部资源访问。   - AI_DATALAKE_LAKEFORMATION_POLICY：LakeFormation功能相关权限策略。   - AI_DATALAKE_LTS_POLICY：日志功能相关权限策略。   - AI_DATALAKE_SMN_POLICY：消息通知功能相关权限策略，用来将系统通知消息转发到SMN。   - AI_DATALAKE_AOM_POLICY：AOM功能相关权限策略。   - AI_DATALAKE_SWR_POLICY：镜像包注册功能相关权限策略。   - AI_DATALAKE_VPCEP_POLICY：网络打通功能相关权限策略。   - AI_DATALAKE_DNS_POLICY：DNS相关权限策略。   - AI_DATALAKE_OBS_POLICY：OBS相关权限策略。   - AI_DATALAKE_VPC_POLICY：VPC相关权限策略。   - AI_DATALAKE_DCS_POLICY：DCS相关权限策略。   - AI_DATALAKE_DEW_POLICY：DEW相关权限策略。 **约束限制**：创建委托时，必须包含以下四个必需策略：   - AI_DATALAKE_COMMON_POLICY：基础服务权限策略。   - AI_DATALAKE_SELF_POLICY：AIDataLake服务自身访问权限策略，用于服务内部资源访问。   - AI_DATALAKE_LAKEFORMATION_POLICY：LakeFormation功能相关权限策略。   - AI_DATALAKE_LTS_POLICY：日志功能相关权限策略。
     * @return policyNames
     */
    public List<PolicyNamesEnum> getPolicyNames() {
        return policyNames;
    }

    public void setPolicyNames(List<PolicyNamesEnum> policyNames) {
        this.policyNames = policyNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateV2AgencyRequestBody that = (CreateV2AgencyRequestBody) obj;
        return Objects.equals(this.policyNames, that.policyNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateV2AgencyRequestBody {\n");
        sb.append("    policyNames: ").append(toIndentedString(policyNames)).append("\n");
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
