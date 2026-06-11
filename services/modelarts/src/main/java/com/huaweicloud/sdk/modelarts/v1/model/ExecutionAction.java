package com.huaweicloud.sdk.modelarts.v1.model;

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
 * 操作Workflow Execution的动作。
 */
public class ExecutionAction {

    /**
     * 操作名称，枚举如下: - stop 停止 - rerun 重跑
     */
    public static final class ActionNameEnum {

        /**
         * Enum STOP for value: "stop"
         */
        public static final ActionNameEnum STOP = new ActionNameEnum("stop");

        private static final Map<String, ActionNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionNameEnum> createStaticFields() {
            Map<String, ActionNameEnum> map = new HashMap<>();
            map.put("stop", STOP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionNameEnum(String value) {
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
        public static ActionNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionNameEnum(value));
        }

        public static ActionNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionNameEnum) {
                return this.value.equals(((ActionNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name")

    private ActionNameEnum actionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private ExecutionActionPolicy policies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<WorkflowParameter> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_requirements")

    private List<DataRequirement> dataRequirements = null;

    public ExecutionAction withActionName(ActionNameEnum actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * 操作名称，枚举如下: - stop 停止 - rerun 重跑
     * @return actionName
     */
    public ActionNameEnum getActionName() {
        return actionName;
    }

    public void setActionName(ActionNameEnum actionName) {
        this.actionName = actionName;
    }

    public ExecutionAction withPolicies(ExecutionActionPolicy policies) {
        this.policies = policies;
        return this;
    }

    public ExecutionAction withPolicies(Consumer<ExecutionActionPolicy> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ExecutionActionPolicy();
            policiesSetter.accept(this.policies);
        }

        return this;
    }

    /**
     * Get policies
     * @return policies
     */
    public ExecutionActionPolicy getPolicies() {
        return policies;
    }

    public void setPolicies(ExecutionActionPolicy policies) {
        this.policies = policies;
    }

    public ExecutionAction withParameters(List<WorkflowParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ExecutionAction addParametersItem(WorkflowParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public ExecutionAction withParameters(Consumer<List<WorkflowParameter>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 参数。
     * @return parameters
     */
    public List<WorkflowParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<WorkflowParameter> parameters) {
        this.parameters = parameters;
    }

    public ExecutionAction withDataRequirements(List<DataRequirement> dataRequirements) {
        this.dataRequirements = dataRequirements;
        return this;
    }

    public ExecutionAction addDataRequirementsItem(DataRequirement dataRequirementsItem) {
        if (this.dataRequirements == null) {
            this.dataRequirements = new ArrayList<>();
        }
        this.dataRequirements.add(dataRequirementsItem);
        return this;
    }

    public ExecutionAction withDataRequirements(Consumer<List<DataRequirement>> dataRequirementsSetter) {
        if (this.dataRequirements == null) {
            this.dataRequirements = new ArrayList<>();
        }
        dataRequirementsSetter.accept(this.dataRequirements);
        return this;
    }

    /**
     * 需要的数据。
     * @return dataRequirements
     */
    public List<DataRequirement> getDataRequirements() {
        return dataRequirements;
    }

    public void setDataRequirements(List<DataRequirement> dataRequirements) {
        this.dataRequirements = dataRequirements;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecutionAction that = (ExecutionAction) obj;
        return Objects.equals(this.actionName, that.actionName) && Objects.equals(this.policies, that.policies)
            && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.dataRequirements, that.dataRequirements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionName, policies, parameters, dataRequirements);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionAction {\n");
        sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    dataRequirements: ").append(toIndentedString(dataRequirements)).append("\n");
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
