package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：委托中授权的权限策略。 **取值范围**：不涉及。
 */
public class V2AgencyPolicy {

    /**
     * **参数解释**：权限策略名称，指定授权给AI DataLake服务的权限策略。 **取值范围**：   - AI_DATALAKE_COMMON_POLICY：基础服务相关权限策略。   - AI_DATALAKE_SELF_POLICY：服务自身访问权限策略，用于服务内部资源访问。   - AI_DATALAKE_SMN_POLICY：消息通知功能相关权限策略，用来将系统通知消息转发到SMN。   - AI_DATALAKE_LAKEFORMATION_POLICY：LakeFormation功能相关权限策略。   - AI_DATALAKE_AOM_POLICY：AOM功能相关权限策略。   - AI_DATALAKE_SWR_POLICY：镜像包注册功能相关权限策略。   - AI_DATALAKE_LTS_POLICY：日志功能相关权限策略。   - AI_DATALAKE_VPCEP_POLICY：网络打通功能相关权限策略。   - AI_DATALAKE_DNS_POLICY：DNS相关权限策略。   - AI_DATALAKE_OBS_POLICY：OBS相关权限策略。   - AI_DATALAKE_VPC_POLICY：VPC相关权限策略。   - AI_DATALAKE_DCS_POLICY：DCS相关权限策略。   - AI_DATALAKE_DEW_POLICY：DEW相关权限策略。
     */
    public static final class PolicyNameEnum {

        /**
         * Enum AI_DATALAKE_COMMON_POLICY for value: "AI_DATALAKE_COMMON_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_COMMON_POLICY = new PolicyNameEnum("AI_DATALAKE_COMMON_POLICY");

        /**
         * Enum AI_DATALAKE_SELF_POLICY for value: "AI_DATALAKE_SELF_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_SELF_POLICY = new PolicyNameEnum("AI_DATALAKE_SELF_POLICY");

        /**
         * Enum AI_DATALAKE_SMN_POLICY for value: "AI_DATALAKE_SMN_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_SMN_POLICY = new PolicyNameEnum("AI_DATALAKE_SMN_POLICY");

        /**
         * Enum AI_DATALAKE_LAKEFORMATION_POLICY for value: "AI_DATALAKE_LAKEFORMATION_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_LAKEFORMATION_POLICY =
            new PolicyNameEnum("AI_DATALAKE_LAKEFORMATION_POLICY");

        /**
         * Enum AI_DATALAKE_AOM_POLICY for value: "AI_DATALAKE_AOM_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_AOM_POLICY = new PolicyNameEnum("AI_DATALAKE_AOM_POLICY");

        /**
         * Enum AI_DATALAKE_SWR_POLICY for value: "AI_DATALAKE_SWR_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_SWR_POLICY = new PolicyNameEnum("AI_DATALAKE_SWR_POLICY");

        /**
         * Enum AI_DATALAKE_LTS_POLICY for value: "AI_DATALAKE_LTS_POLICY"
         */
        public static final PolicyNameEnum AI_DATALAKE_LTS_POLICY = new PolicyNameEnum("AI_DATALAKE_LTS_POLICY");

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_required")

    private Boolean isRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enable")

    private Boolean isEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_details")

    private List<ActionDetail> actionDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changed_action_details")

    private List<ChangedActionDetail> changedActionDetails = null;

    public V2AgencyPolicy withPolicyName(PolicyNameEnum policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * **参数解释**：权限策略名称，指定授权给AI DataLake服务的权限策略。 **取值范围**：   - AI_DATALAKE_COMMON_POLICY：基础服务相关权限策略。   - AI_DATALAKE_SELF_POLICY：服务自身访问权限策略，用于服务内部资源访问。   - AI_DATALAKE_SMN_POLICY：消息通知功能相关权限策略，用来将系统通知消息转发到SMN。   - AI_DATALAKE_LAKEFORMATION_POLICY：LakeFormation功能相关权限策略。   - AI_DATALAKE_AOM_POLICY：AOM功能相关权限策略。   - AI_DATALAKE_SWR_POLICY：镜像包注册功能相关权限策略。   - AI_DATALAKE_LTS_POLICY：日志功能相关权限策略。   - AI_DATALAKE_VPCEP_POLICY：网络打通功能相关权限策略。   - AI_DATALAKE_DNS_POLICY：DNS相关权限策略。   - AI_DATALAKE_OBS_POLICY：OBS相关权限策略。   - AI_DATALAKE_VPC_POLICY：VPC相关权限策略。   - AI_DATALAKE_DCS_POLICY：DCS相关权限策略。   - AI_DATALAKE_DEW_POLICY：DEW相关权限策略。
     * @return policyName
     */
    public PolicyNameEnum getPolicyName() {
        return policyName;
    }

    public void setPolicyName(PolicyNameEnum policyName) {
        this.policyName = policyName;
    }

    public V2AgencyPolicy withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**：权限策略名称。 **取值范围**：支持中文字符、英文字母、数字及特殊字符，长度0~128个字符。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public V2AgencyPolicy withIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * **参数解释**：是否是必需的。 **取值范围**：   - true：必需。   - false：非必需。
     * @return isRequired
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public V2AgencyPolicy withIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }

    /**
     * **参数解释**：是否已开启。只要授权过（策略存在且 effect 为 Allow），即为 true。 **取值范围**：   - true：已开启。   - false：未开启。
     * @return isEnable
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public V2AgencyPolicy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：策略描述。 **取值范围**：支持中文字符、英文字母、数字及特殊字符，长度0~128个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public V2AgencyPolicy withActionDetails(List<ActionDetail> actionDetails) {
        this.actionDetails = actionDetails;
        return this;
    }

    public V2AgencyPolicy addActionDetailsItem(ActionDetail actionDetailsItem) {
        if (this.actionDetails == null) {
            this.actionDetails = new ArrayList<>();
        }
        this.actionDetails.add(actionDetailsItem);
        return this;
    }

    public V2AgencyPolicy withActionDetails(Consumer<List<ActionDetail>> actionDetailsSetter) {
        if (this.actionDetails == null) {
            this.actionDetails = new ArrayList<>();
        }
        actionDetailsSetter.accept(this.actionDetails);
        return this;
    }

    /**
     * **参数解释**：权限策略的action详情列表，详细说明该策略包含的权限操作。
     * @return actionDetails
     */
    public List<ActionDetail> getActionDetails() {
        return actionDetails;
    }

    public void setActionDetails(List<ActionDetail> actionDetails) {
        this.actionDetails = actionDetails;
    }

    public V2AgencyPolicy withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：资源创建时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public V2AgencyPolicy withChangedActionDetails(List<ChangedActionDetail> changedActionDetails) {
        this.changedActionDetails = changedActionDetails;
        return this;
    }

    public V2AgencyPolicy addChangedActionDetailsItem(ChangedActionDetail changedActionDetailsItem) {
        if (this.changedActionDetails == null) {
            this.changedActionDetails = new ArrayList<>();
        }
        this.changedActionDetails.add(changedActionDetailsItem);
        return this;
    }

    public V2AgencyPolicy withChangedActionDetails(Consumer<List<ChangedActionDetail>> changedActionDetailsSetter) {
        if (this.changedActionDetails == null) {
            this.changedActionDetails = new ArrayList<>();
        }
        changedActionDetailsSetter.accept(this.changedActionDetails);
        return this;
    }

    /**
     * **参数解释**：策略内容与预期不一致时的 action 变更详情列表。只展示需要新增的 action（代码有但 IAM 没有的）。策略内容完全一致或策略完全缺失时返回空数组。
     * @return changedActionDetails
     */
    public List<ChangedActionDetail> getChangedActionDetails() {
        return changedActionDetails;
    }

    public void setChangedActionDetails(List<ChangedActionDetail> changedActionDetails) {
        this.changedActionDetails = changedActionDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2AgencyPolicy that = (V2AgencyPolicy) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.isRequired, that.isRequired) && Objects.equals(this.isEnable, that.isEnable)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.actionDetails, that.actionDetails)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.changedActionDetails, that.changedActionDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName,
            displayName,
            isRequired,
            isEnable,
            description,
            actionDetails,
            createTime,
            changedActionDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2AgencyPolicy {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
        sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    actionDetails: ").append(toIndentedString(actionDetails)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    changedActionDetails: ").append(toIndentedString(changedActionDetails)).append("\n");
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
