package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateWorkflowInstanceResponse extends SdkResponse {

    /**
     * **参数解释**: 操作流程实例的指令 - ActionInstanceRunCommand 运行流程实例  **约束限制**: 不涉及         **取值范围**: - ActionInstanceRunCommand  **默认值**:  不涉及
     */
    public static final class CommandTypeEnum {

        /**
         * Enum ACTIONINSTANCERUNCOMMAND for value: "ActionInstanceRunCommand"
         */
        public static final CommandTypeEnum ACTIONINSTANCERUNCOMMAND = new CommandTypeEnum("ActionInstanceRunCommand");

        private static final Map<String, CommandTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommandTypeEnum> createStaticFields() {
            Map<String, CommandTypeEnum> map = new HashMap<>();
            map.put("ActionInstanceRunCommand", ACTIONINSTANCERUNCOMMAND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CommandTypeEnum(String value) {
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
        public static CommandTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CommandTypeEnum(value));
        }

        public static CommandTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CommandTypeEnum) {
                return this.value.equals(((CommandTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_type")

    private CommandTypeEnum commandType;

    /**
     * **参数解释**: action的类型 - workflow 流程  **约束限制**: 不涉及         **取值范围**: - workflow  **默认值**:  不涉及
     */
    public static final class ActionTypeEnum {

        /**
         * Enum WORKFLOW for value: "workflow"
         */
        public static final ActionTypeEnum WORKFLOW = new ActionTypeEnum("workflow");

        private static final Map<String, ActionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionTypeEnum> createStaticFields() {
            Map<String, ActionTypeEnum> map = new HashMap<>();
            map.put("workflow", WORKFLOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionTypeEnum(String value) {
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
        public static ActionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionTypeEnum(value));
        }

        public static ActionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionTypeEnum) {
                return this.value.equals(((ActionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private ActionTypeEnum actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_id")

    private String actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_instance_id")

    private String actionInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_context")

    private PlaybookcontextRef playbookContext;

    public CreateWorkflowInstanceResponse withCommandType(CommandTypeEnum commandType) {
        this.commandType = commandType;
        return this;
    }

    /**
     * **参数解释**: 操作流程实例的指令 - ActionInstanceRunCommand 运行流程实例  **约束限制**: 不涉及         **取值范围**: - ActionInstanceRunCommand  **默认值**:  不涉及
     * @return commandType
     */
    public CommandTypeEnum getCommandType() {
        return commandType;
    }

    public void setCommandType(CommandTypeEnum commandType) {
        this.commandType = commandType;
    }

    public CreateWorkflowInstanceResponse withActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * **参数解释**: action的类型 - workflow 流程  **约束限制**: 不涉及         **取值范围**: - workflow  **默认值**:  不涉及
     * @return actionType
     */
    public ActionTypeEnum getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
    }

    public CreateWorkflowInstanceResponse withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * **参数解释**: 流程的ID **约束限制**: 不涉及
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public CreateWorkflowInstanceResponse withActionInstanceId(String actionInstanceId) {
        this.actionInstanceId = actionInstanceId;
        return this;
    }

    /**
     * **参数解释**: 流程实例的ID **约束限制**: 不涉及
     * @return actionInstanceId
     */
    public String getActionInstanceId() {
        return actionInstanceId;
    }

    public void setActionInstanceId(String actionInstanceId) {
        this.actionInstanceId = actionInstanceId;
    }

    public CreateWorkflowInstanceResponse withPlaybookContext(PlaybookcontextRef playbookContext) {
        this.playbookContext = playbookContext;
        return this;
    }

    public CreateWorkflowInstanceResponse withPlaybookContext(Consumer<PlaybookcontextRef> playbookContextSetter) {
        if (this.playbookContext == null) {
            this.playbookContext = new PlaybookcontextRef();
            playbookContextSetter.accept(this.playbookContext);
        }

        return this;
    }

    /**
     * Get playbookContext
     * @return playbookContext
     */
    public PlaybookcontextRef getPlaybookContext() {
        return playbookContext;
    }

    public void setPlaybookContext(PlaybookcontextRef playbookContext) {
        this.playbookContext = playbookContext;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWorkflowInstanceResponse that = (CreateWorkflowInstanceResponse) obj;
        return Objects.equals(this.commandType, that.commandType) && Objects.equals(this.actionType, that.actionType)
            && Objects.equals(this.actionId, that.actionId)
            && Objects.equals(this.actionInstanceId, that.actionInstanceId)
            && Objects.equals(this.playbookContext, that.playbookContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commandType, actionType, actionId, actionInstanceId, playbookContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkflowInstanceResponse {\n");
        sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    actionInstanceId: ").append(toIndentedString(actionInstanceId)).append("\n");
        sb.append("    playbookContext: ").append(toIndentedString(playbookContext)).append("\n");
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
