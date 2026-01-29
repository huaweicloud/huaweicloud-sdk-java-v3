package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 更新流程实例的请求对象
 */
public class AopInstanceUpdateDataPojo {

    /**
     * **参数解释**: 更新流程实例的指令 - ActionInstanceTerminateCommand 终止流程实例 - ActionInstanceRetryCommand 重试流程实例 - ActionInstanceDebugCommand 更新流程实例的调试结果  **约束限制**: 当command_type=ActionInstanceDebugCommand时task_id和inputdataobject是必填参数         **取值范围**: - ActionInstanceTerminateCommand - ActionInstanceRetryCommand - ActionInstanceDebugCommand  **默认值**:  不涉及
     */
    public static final class CommandTypeEnum {

        /**
         * Enum ACTIONINSTANCETERMINATECOMMAND for value: "ActionInstanceTerminateCommand"
         */
        public static final CommandTypeEnum ACTIONINSTANCETERMINATECOMMAND =
            new CommandTypeEnum("ActionInstanceTerminateCommand");

        /**
         * Enum ACTIONINSTANCERETRYCOMMAND for value: "ActionInstanceRetryCommand"
         */
        public static final CommandTypeEnum ACTIONINSTANCERETRYCOMMAND =
            new CommandTypeEnum("ActionInstanceRetryCommand");

        /**
         * Enum ACTIONINSTANCEDEBUGCOMMAND for value: "ActionInstanceDebugCommand"
         */
        public static final CommandTypeEnum ACTIONINSTANCEDEBUGCOMMAND =
            new CommandTypeEnum("ActionInstanceDebugCommand");

        private static final Map<String, CommandTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommandTypeEnum> createStaticFields() {
            Map<String, CommandTypeEnum> map = new HashMap<>();
            map.put("ActionInstanceTerminateCommand", ACTIONINSTANCETERMINATECOMMAND);
            map.put("ActionInstanceRetryCommand", ACTIONINSTANCERETRYCOMMAND);
            map.put("ActionInstanceDebugCommand", ACTIONINSTANCEDEBUGCOMMAND);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_dataobject")

    private String inputDataobject;

    public AopInstanceUpdateDataPojo withCommandType(CommandTypeEnum commandType) {
        this.commandType = commandType;
        return this;
    }

    /**
     * **参数解释**: 更新流程实例的指令 - ActionInstanceTerminateCommand 终止流程实例 - ActionInstanceRetryCommand 重试流程实例 - ActionInstanceDebugCommand 更新流程实例的调试结果  **约束限制**: 当command_type=ActionInstanceDebugCommand时task_id和inputdataobject是必填参数         **取值范围**: - ActionInstanceTerminateCommand - ActionInstanceRetryCommand - ActionInstanceDebugCommand  **默认值**:  不涉及
     * @return commandType
     */
    public CommandTypeEnum getCommandType() {
        return commandType;
    }

    public void setCommandType(CommandTypeEnum commandType) {
        this.commandType = commandType;
    }

    public AopInstanceUpdateDataPojo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**:         更新流程调试实例节点ID **约束限制**: 当command_type=ActionInstanceDebugCommand时参数为必填参数        **取值范围**: 不涉及 **默认值**:  不涉及
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public AopInstanceUpdateDataPojo withInputDataobject(String inputDataobject) {
        this.inputDataobject = inputDataobject;
        return this;
    }

    /**
     * **参数解释**: 更新流程调试实例节点参数 **约束限制**: 当command_type=ActionInstanceDebugCommand时参数为必填参 **取值范围**: 不涉及 **默认值**:  不涉及
     * @return inputDataobject
     */
    public String getInputDataobject() {
        return inputDataobject;
    }

    public void setInputDataobject(String inputDataobject) {
        this.inputDataobject = inputDataobject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AopInstanceUpdateDataPojo that = (AopInstanceUpdateDataPojo) obj;
        return Objects.equals(this.commandType, that.commandType) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.inputDataobject, that.inputDataobject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commandType, taskId, inputDataobject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AopInstanceUpdateDataPojo {\n");
        sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    inputDataobject: ").append(toIndentedString(inputDataobject)).append("\n");
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
