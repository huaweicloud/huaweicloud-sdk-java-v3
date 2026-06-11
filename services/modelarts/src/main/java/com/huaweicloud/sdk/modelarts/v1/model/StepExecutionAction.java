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
 * StepExecutionAction
 */
public class StepExecutionAction {

    /**
     * 操作名称，枚举如下:  - retry 重试  - stop 停止  - continue 继续
     */
    public static final class ActionNameEnum {

        /**
         * Enum RETRY_ for value: "retry：重试"
         */
        public static final ActionNameEnum RETRY_ = new ActionNameEnum("retry：重试");

        /**
         * Enum STOP_ for value: "stop：停止"
         */
        public static final ActionNameEnum STOP_ = new ActionNameEnum("stop：停止");

        /**
         * Enum CONTINUE_ for value: "continue：停止"
         */
        public static final ActionNameEnum CONTINUE_ = new ActionNameEnum("continue：停止");

        private static final Map<String, ActionNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionNameEnum> createStaticFields() {
            Map<String, ActionNameEnum> map = new HashMap<>();
            map.put("retry：重试", RETRY_);
            map.put("stop：停止", STOP_);
            map.put("continue：停止", CONTINUE_);
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
    @JsonProperty(value = "data_requirements")

    private List<DataRequirement> dataRequirements = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<WorkflowParameter> parameters = null;

    public StepExecutionAction withActionName(ActionNameEnum actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * 操作名称，枚举如下:  - retry 重试  - stop 停止  - continue 继续
     * @return actionName
     */
    public ActionNameEnum getActionName() {
        return actionName;
    }

    public void setActionName(ActionNameEnum actionName) {
        this.actionName = actionName;
    }

    public StepExecutionAction withDataRequirements(List<DataRequirement> dataRequirements) {
        this.dataRequirements = dataRequirements;
        return this;
    }

    public StepExecutionAction addDataRequirementsItem(DataRequirement dataRequirementsItem) {
        if (this.dataRequirements == null) {
            this.dataRequirements = new ArrayList<>();
        }
        this.dataRequirements.add(dataRequirementsItem);
        return this;
    }

    public StepExecutionAction withDataRequirements(Consumer<List<DataRequirement>> dataRequirementsSetter) {
        if (this.dataRequirements == null) {
            this.dataRequirements = new ArrayList<>();
        }
        dataRequirementsSetter.accept(this.dataRequirements);
        return this;
    }

    /**
     * Get dataRequirements
     * @return dataRequirements
     */
    public List<DataRequirement> getDataRequirements() {
        return dataRequirements;
    }

    public void setDataRequirements(List<DataRequirement> dataRequirements) {
        this.dataRequirements = dataRequirements;
    }

    public StepExecutionAction withParameters(List<WorkflowParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public StepExecutionAction addParametersItem(WorkflowParameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public StepExecutionAction withParameters(Consumer<List<WorkflowParameter>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public List<WorkflowParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<WorkflowParameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StepExecutionAction that = (StepExecutionAction) obj;
        return Objects.equals(this.actionName, that.actionName)
            && Objects.equals(this.dataRequirements, that.dataRequirements)
            && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionName, dataRequirements, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StepExecutionAction {\n");
        sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
        sb.append("    dataRequirements: ").append(toIndentedString(dataRequirements)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
