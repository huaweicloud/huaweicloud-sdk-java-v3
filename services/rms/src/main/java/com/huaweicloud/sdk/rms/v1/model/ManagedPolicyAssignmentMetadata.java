package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 托管规则元数据。
 */
public class ManagedPolicyAssignmentMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 触发周期。
     */
    public static final class PeriodEnum {

        /**
         * Enum ONE_HOUR for value: "One_Hour"
         */
        public static final PeriodEnum ONE_HOUR = new PeriodEnum("One_Hour");

        /**
         * Enum THREE_HOURS for value: "Three_Hours"
         */
        public static final PeriodEnum THREE_HOURS = new PeriodEnum("Three_Hours");

        /**
         * Enum SIX_HOURS for value: "Six_Hours"
         */
        public static final PeriodEnum SIX_HOURS = new PeriodEnum("Six_Hours");

        /**
         * Enum TWELVE_HOURS for value: "Twelve_Hours"
         */
        public static final PeriodEnum TWELVE_HOURS = new PeriodEnum("Twelve_Hours");

        /**
         * Enum TWENTYFOUR_HOURS for value: "TwentyFour_Hours"
         */
        public static final PeriodEnum TWENTYFOUR_HOURS = new PeriodEnum("TwentyFour_Hours");

        private static final Map<String, PeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodEnum> createStaticFields() {
            Map<String, PeriodEnum> map = new HashMap<>();
            map.put("One_Hour", ONE_HOUR);
            map.put("Three_Hours", THREE_HOURS);
            map.put("Six_Hours", SIX_HOURS);
            map.put("Twelve_Hours", TWELVE_HOURS);
            map.put("TwentyFour_Hours", TWENTYFOUR_HOURS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PeriodEnum(String value) {
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
        public static PeriodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PeriodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PeriodEnum(value);
            }
            return result;
        }

        public static PeriodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PeriodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodEnum) {
                return this.value.equals(((PeriodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private PeriodEnum period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, PolicyParameterValue> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_filter")

    private PolicyFilterDefinition policyFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_definition_id")

    private String policyDefinitionId;

    public ManagedPolicyAssignmentMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ManagedPolicyAssignmentMetadata withPeriod(PeriodEnum period) {
        this.period = period;
        return this;
    }

    /**
     * 触发周期。
     * @return period
     */
    public PeriodEnum getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEnum period) {
        this.period = period;
    }

    public ManagedPolicyAssignmentMetadata withParameters(Map<String, PolicyParameterValue> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ManagedPolicyAssignmentMetadata putParametersItem(String key, PolicyParameterValue parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public ManagedPolicyAssignmentMetadata withParameters(
        Consumer<Map<String, PolicyParameterValue>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 输入参数。
     * @return parameters
     */
    public Map<String, PolicyParameterValue> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, PolicyParameterValue> parameters) {
        this.parameters = parameters;
    }

    public ManagedPolicyAssignmentMetadata withPolicyFilter(PolicyFilterDefinition policyFilter) {
        this.policyFilter = policyFilter;
        return this;
    }

    public ManagedPolicyAssignmentMetadata withPolicyFilter(Consumer<PolicyFilterDefinition> policyFilterSetter) {
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

    public ManagedPolicyAssignmentMetadata withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * 预定义策略标识符。
     * @return policyDefinitionId
     */
    public String getPolicyDefinitionId() {
        return policyDefinitionId;
    }

    public void setPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManagedPolicyAssignmentMetadata managedPolicyAssignmentMetadata = (ManagedPolicyAssignmentMetadata) o;
        return Objects.equals(this.description, managedPolicyAssignmentMetadata.description)
            && Objects.equals(this.period, managedPolicyAssignmentMetadata.period)
            && Objects.equals(this.parameters, managedPolicyAssignmentMetadata.parameters)
            && Objects.equals(this.policyFilter, managedPolicyAssignmentMetadata.policyFilter)
            && Objects.equals(this.policyDefinitionId, managedPolicyAssignmentMetadata.policyDefinitionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, period, parameters, policyFilter, policyDefinitionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManagedPolicyAssignmentMetadata {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    policyFilter: ").append(toIndentedString(policyFilter)).append("\n");
        sb.append("    policyDefinitionId: ").append(toIndentedString(policyDefinitionId)).append("\n");
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
