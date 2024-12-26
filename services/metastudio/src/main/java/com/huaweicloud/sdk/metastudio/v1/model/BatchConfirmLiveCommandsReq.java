package com.huaweicloud.sdk.metastudio.v1.model;

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
 * 批量确认命令。
 */
public class BatchConfirmLiveCommandsReq {

    /**
     * 命令名称。 - REWRITE_PLAY_SCRIPT: 动态编辑未播放剧本。 - REWRITE_INTERACTION_RULES: 动态修改互动规则。
     */
    public static final class CommandEnum {

        /**
         * Enum REWRITE_PLAY_SCRIPT for value: "REWRITE_PLAY_SCRIPT"
         */
        public static final CommandEnum REWRITE_PLAY_SCRIPT = new CommandEnum("REWRITE_PLAY_SCRIPT");

        /**
         * Enum REWRITE_INTERACTION_RULES for value: "REWRITE_INTERACTION_RULES"
         */
        public static final CommandEnum REWRITE_INTERACTION_RULES = new CommandEnum("REWRITE_INTERACTION_RULES");

        private static final Map<String, CommandEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommandEnum> createStaticFields() {
            Map<String, CommandEnum> map = new HashMap<>();
            map.put("REWRITE_PLAY_SCRIPT", REWRITE_PLAY_SCRIPT);
            map.put("REWRITE_INTERACTION_RULES", REWRITE_INTERACTION_RULES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CommandEnum(String value) {
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
        public static CommandEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CommandEnum(value));
        }

        public static CommandEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CommandEnum) {
                return this.value.equals(((CommandEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private CommandEnum command;

    /**
     * 确认操作。 * confirm: 确认。 * reject: 拒绝。
     */
    public static final class ActionEnum {

        /**
         * Enum CONFIRM for value: "confirm"
         */
        public static final ActionEnum CONFIRM = new ActionEnum("confirm");

        /**
         * Enum REJECT for value: "reject"
         */
        public static final ActionEnum REJECT = new ActionEnum("reject");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("confirm", CONFIRM);
            map.put("reject", REJECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_ids")

    private List<String> commandIds = null;

    public BatchConfirmLiveCommandsReq withCommand(CommandEnum command) {
        this.command = command;
        return this;
    }

    /**
     * 命令名称。 - REWRITE_PLAY_SCRIPT: 动态编辑未播放剧本。 - REWRITE_INTERACTION_RULES: 动态修改互动规则。
     * @return command
     */
    public CommandEnum getCommand() {
        return command;
    }

    public void setCommand(CommandEnum command) {
        this.command = command;
    }

    public BatchConfirmLiveCommandsReq withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 确认操作。 * confirm: 确认。 * reject: 拒绝。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public BatchConfirmLiveCommandsReq withCommandIds(List<String> commandIds) {
        this.commandIds = commandIds;
        return this;
    }

    public BatchConfirmLiveCommandsReq addCommandIdsItem(String commandIdsItem) {
        if (this.commandIds == null) {
            this.commandIds = new ArrayList<>();
        }
        this.commandIds.add(commandIdsItem);
        return this;
    }

    public BatchConfirmLiveCommandsReq withCommandIds(Consumer<List<String>> commandIdsSetter) {
        if (this.commandIds == null) {
            this.commandIds = new ArrayList<>();
        }
        commandIdsSetter.accept(this.commandIds);
        return this;
    }

    /**
     * 命令ID列表。不填则为全部未播放的插入命令均清理。
     * @return commandIds
     */
    public List<String> getCommandIds() {
        return commandIds;
    }

    public void setCommandIds(List<String> commandIds) {
        this.commandIds = commandIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchConfirmLiveCommandsReq that = (BatchConfirmLiveCommandsReq) obj;
        return Objects.equals(this.command, that.command) && Objects.equals(this.action, that.action)
            && Objects.equals(this.commandIds, that.commandIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command, action, commandIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchConfirmLiveCommandsReq {\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    commandIds: ").append(toIndentedString(commandIds)).append("\n");
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
