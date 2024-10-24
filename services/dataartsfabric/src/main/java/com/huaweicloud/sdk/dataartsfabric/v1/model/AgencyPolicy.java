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
 * 委托中授权的权限策略
 */
public class AgencyPolicy {

    /**
     * 权限类型列表，使用Fabric的功能，可能需要授权一些权限策略，可以在policy_types中加入策略类型来授权权限。FABRIC_COMMON_POLICY：基础通用服务相关权限策略，是委托必需的权限策略；FABRIC_SMN_POLICY：消息通知功能相关权限策略，用来将系统通知消息转发到SMN；FABRIC_LAKEFORMATION_POLICY：LakeFormation功能相关权限策略；FABRIC_AOM_POLICY：AOM功能相关权限策略。
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_required")

    private Boolean isRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enable")

    private Boolean isEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public AgencyPolicy withPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * 权限类型列表，使用Fabric的功能，可能需要授权一些权限策略，可以在policy_types中加入策略类型来授权权限。FABRIC_COMMON_POLICY：基础通用服务相关权限策略，是委托必需的权限策略；FABRIC_SMN_POLICY：消息通知功能相关权限策略，用来将系统通知消息转发到SMN；FABRIC_LAKEFORMATION_POLICY：LakeFormation功能相关权限策略；FABRIC_AOM_POLICY：AOM功能相关权限策略。
     * @return policyType
     */
    public PolicyTypeEnum getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
    }

    public AgencyPolicy withIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * 是否是必需的。
     * @return isRequired
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public AgencyPolicy withIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }

    /**
     * 是否已开启。
     * @return isEnable
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public AgencyPolicy withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public AgencyPolicy addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public AgencyPolicy withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 权限列表
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public AgencyPolicy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 策略描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgencyPolicy that = (AgencyPolicy) obj;
        return Objects.equals(this.policyType, that.policyType) && Objects.equals(this.isRequired, that.isRequired)
            && Objects.equals(this.isEnable, that.isEnable) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyType, isRequired, isEnable, actions, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyPolicy {\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
        sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
