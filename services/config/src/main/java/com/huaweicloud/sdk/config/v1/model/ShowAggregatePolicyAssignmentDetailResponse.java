package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAggregatePolicyAssignmentDetailResponse extends SdkResponse {

    /**
     * 规则类型，包括预定义合规规则(builtin)和用户自定义合规规则(custom)
     */
    public static final class PolicyAssignmentTypeEnum {

        /**
         * Enum BUILTIN for value: "builtin"
         */
        public static final PolicyAssignmentTypeEnum BUILTIN = new PolicyAssignmentTypeEnum("builtin");

        /**
         * Enum CUSTOM for value: "custom"
         */
        public static final PolicyAssignmentTypeEnum CUSTOM = new PolicyAssignmentTypeEnum("custom");

        private static final Map<String, PolicyAssignmentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyAssignmentTypeEnum> createStaticFields() {
            Map<String, PolicyAssignmentTypeEnum> map = new HashMap<>();
            map.put("builtin", BUILTIN);
            map.put("custom", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyAssignmentTypeEnum(String value) {
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
        public static PolicyAssignmentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyAssignmentTypeEnum(value));
        }

        public static PolicyAssignmentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyAssignmentTypeEnum) {
                return this.value.equals(((PolicyAssignmentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_type")

    private PolicyAssignmentTypeEnum policyAssignmentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_filter")

    private PolicyFilterDefinition policyFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_definition_id")

    private String policyDefinitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_policy")

    private CustomPolicy customPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, PolicyParameterValue> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    public ShowAggregatePolicyAssignmentDetailResponse withPolicyAssignmentType(
        PolicyAssignmentTypeEnum policyAssignmentType) {
        this.policyAssignmentType = policyAssignmentType;
        return this;
    }

    /**
     * 规则类型，包括预定义合规规则(builtin)和用户自定义合规规则(custom)
     * @return policyAssignmentType
     */
    public PolicyAssignmentTypeEnum getPolicyAssignmentType() {
        return policyAssignmentType;
    }

    public void setPolicyAssignmentType(PolicyAssignmentTypeEnum policyAssignmentType) {
        this.policyAssignmentType = policyAssignmentType;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withPolicyFilter(PolicyFilterDefinition policyFilter) {
        this.policyFilter = policyFilter;
        return this;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withPolicyFilter(
        Consumer<PolicyFilterDefinition> policyFilterSetter) {
        if (this.policyFilter == null) {
            this.policyFilter = new PolicyFilterDefinition();
            policyFilterSetter.accept(this.policyFilter);
        }

        return this;
    }

    /**
     * Get policyFilter
     * @return policyFilter
     */
    public PolicyFilterDefinition getPolicyFilter() {
        return policyFilter;
    }

    public void setPolicyFilter(PolicyFilterDefinition policyFilter) {
        this.policyFilter = policyFilter;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 触发周期值，可选值：One_Hour, Three_Hours, Six_Hours, Twelve_Hours, TwentyFour_Hours
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 规则状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 规则创建时间
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 规则更新时间
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * 规则的策略ID
     * @return policyDefinitionId
     */
    public String getPolicyDefinitionId() {
        return policyDefinitionId;
    }

    public void setPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withCustomPolicy(CustomPolicy customPolicy) {
        this.customPolicy = customPolicy;
        return this;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withCustomPolicy(Consumer<CustomPolicy> customPolicySetter) {
        if (this.customPolicy == null) {
            this.customPolicy = new CustomPolicy();
            customPolicySetter.accept(this.customPolicy);
        }

        return this;
    }

    /**
     * Get customPolicy
     * @return customPolicy
     */
    public CustomPolicy getCustomPolicy() {
        return customPolicy;
    }

    public void setCustomPolicy(CustomPolicy customPolicy) {
        this.customPolicy = customPolicy;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withParameters(Map<String, PolicyParameterValue> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ShowAggregatePolicyAssignmentDetailResponse putParametersItem(String key,
        PolicyParameterValue parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withParameters(
        Consumer<Map<String, PolicyParameterValue>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 规则参数
     * @return parameters
     */
    public Map<String, PolicyParameterValue> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, PolicyParameterValue> parameters) {
        this.parameters = parameters;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowAggregatePolicyAssignmentDetailResponse addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 规则的创建者
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 合规规则修正方式。
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public ShowAggregatePolicyAssignmentDetailResponse withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 修正执行的目标id。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAggregatePolicyAssignmentDetailResponse that = (ShowAggregatePolicyAssignmentDetailResponse) obj;
        return Objects.equals(this.policyAssignmentType, that.policyAssignmentType) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.policyFilter, that.policyFilter) && Objects.equals(this.period, that.period)
            && Objects.equals(this.state, that.state) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.policyDefinitionId, that.policyDefinitionId)
            && Objects.equals(this.customPolicy, that.customPolicy) && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.targetType, that.targetType) && Objects.equals(this.targetId, that.targetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyAssignmentType,
            id,
            name,
            description,
            policyFilter,
            period,
            state,
            created,
            updated,
            policyDefinitionId,
            customPolicy,
            parameters,
            tags,
            createdBy,
            targetType,
            targetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAggregatePolicyAssignmentDetailResponse {\n");
        sb.append("    policyAssignmentType: ").append(toIndentedString(policyAssignmentType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyFilter: ").append(toIndentedString(policyFilter)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    policyDefinitionId: ").append(toIndentedString(policyDefinitionId)).append("\n");
        sb.append("    customPolicy: ").append(toIndentedString(customPolicy)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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
