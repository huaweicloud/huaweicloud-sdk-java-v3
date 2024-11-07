package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteSmartLiveCommandResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_id")

    private String commandId;

    /**
     * 命令名称。 - INSERT_PLAY_SCRIPT：插入表演脚本。用于互动回复。数字人不变，背景不变。params结构定义：ShootScript。 - REWRITE_PLAY_SCRIPT：动态编辑未播放剧本。params结构定义：scene_scripts。 - INSERT_PLAY_AUDIO：插入驱动音频。用于音频直接驱动。数字人不变，背景不变。params结构定义：PlayAudioInfo。 - GET_CURRENT_PLAYING_SCRIPTS：查询本轮剧本列表。响应为LivePlayingScriptList结构。 - REFRESH_OUTPUT_URL：更新当前任务的rtmp推流信息。params结构定义： RefreshOutputUrlConfig。 - REWRITE_INTERACTION_RULES：动态修改互动规则。params结构定义：interaction_rules。 - GET_LIVE_JOB_CONFIG_INFO：获取任务中的房间信息。params结构定义：SmartLiveRoomInfo。 - CLEAN_UP_INSERT_COMMAND：清理未播放的插入命令。params结构定义：[CleanUpInsertCommand](metastudio_02_0014.xml)
     */
    public static final class CommandEnum {

        /**
         * Enum INSERT_PLAY_SCRIPT for value: "INSERT_PLAY_SCRIPT"
         */
        public static final CommandEnum INSERT_PLAY_SCRIPT = new CommandEnum("INSERT_PLAY_SCRIPT");

        /**
         * Enum REWRITE_PLAY_SCRIPT for value: "REWRITE_PLAY_SCRIPT"
         */
        public static final CommandEnum REWRITE_PLAY_SCRIPT = new CommandEnum("REWRITE_PLAY_SCRIPT");

        /**
         * Enum INSERT_PLAY_AUDIO for value: "INSERT_PLAY_AUDIO"
         */
        public static final CommandEnum INSERT_PLAY_AUDIO = new CommandEnum("INSERT_PLAY_AUDIO");

        /**
         * Enum GET_CURRENT_PLAYING_SCRIPTS for value: "GET_CURRENT_PLAYING_SCRIPTS"
         */
        public static final CommandEnum GET_CURRENT_PLAYING_SCRIPTS = new CommandEnum("GET_CURRENT_PLAYING_SCRIPTS");

        /**
         * Enum REFRESH_OUTPUT_URL for value: "REFRESH_OUTPUT_URL"
         */
        public static final CommandEnum REFRESH_OUTPUT_URL = new CommandEnum("REFRESH_OUTPUT_URL");

        /**
         * Enum REWRITE_INTERACTION_RULES for value: "REWRITE_INTERACTION_RULES"
         */
        public static final CommandEnum REWRITE_INTERACTION_RULES = new CommandEnum("REWRITE_INTERACTION_RULES");

        /**
         * Enum GET_LIVE_JOB_CONFIG_INFO for value: "GET_LIVE_JOB_CONFIG_INFO"
         */
        public static final CommandEnum GET_LIVE_JOB_CONFIG_INFO = new CommandEnum("GET_LIVE_JOB_CONFIG_INFO");

        /**
         * Enum CLEAN_UP_INSERT_COMMAND for value: "CLEAN_UP_INSERT_COMMAND"
         */
        public static final CommandEnum CLEAN_UP_INSERT_COMMAND = new CommandEnum("CLEAN_UP_INSERT_COMMAND");

        private static final Map<String, CommandEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommandEnum> createStaticFields() {
            Map<String, CommandEnum> map = new HashMap<>();
            map.put("INSERT_PLAY_SCRIPT", INSERT_PLAY_SCRIPT);
            map.put("REWRITE_PLAY_SCRIPT", REWRITE_PLAY_SCRIPT);
            map.put("INSERT_PLAY_AUDIO", INSERT_PLAY_AUDIO);
            map.put("GET_CURRENT_PLAYING_SCRIPTS", GET_CURRENT_PLAYING_SCRIPTS);
            map.put("REFRESH_OUTPUT_URL", REFRESH_OUTPUT_URL);
            map.put("REWRITE_INTERACTION_RULES", REWRITE_INTERACTION_RULES);
            map.put("GET_LIVE_JOB_CONFIG_INFO", GET_LIVE_JOB_CONFIG_INFO);
            map.put("CLEAN_UP_INSERT_COMMAND", CLEAN_UP_INSERT_COMMAND);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ExecuteSmartLiveCommandResponse withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * 控制命令ID
     * @return commandId
     */
    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public ExecuteSmartLiveCommandResponse withCommand(CommandEnum command) {
        this.command = command;
        return this;
    }

    /**
     * 命令名称。 - INSERT_PLAY_SCRIPT：插入表演脚本。用于互动回复。数字人不变，背景不变。params结构定义：ShootScript。 - REWRITE_PLAY_SCRIPT：动态编辑未播放剧本。params结构定义：scene_scripts。 - INSERT_PLAY_AUDIO：插入驱动音频。用于音频直接驱动。数字人不变，背景不变。params结构定义：PlayAudioInfo。 - GET_CURRENT_PLAYING_SCRIPTS：查询本轮剧本列表。响应为LivePlayingScriptList结构。 - REFRESH_OUTPUT_URL：更新当前任务的rtmp推流信息。params结构定义： RefreshOutputUrlConfig。 - REWRITE_INTERACTION_RULES：动态修改互动规则。params结构定义：interaction_rules。 - GET_LIVE_JOB_CONFIG_INFO：获取任务中的房间信息。params结构定义：SmartLiveRoomInfo。 - CLEAN_UP_INSERT_COMMAND：清理未播放的插入命令。params结构定义：[CleanUpInsertCommand](metastudio_02_0014.xml)
     * @return command
     */
    public CommandEnum getCommand() {
        return command;
    }

    public void setCommand(CommandEnum command) {
        this.command = command;
    }

    public ExecuteSmartLiveCommandResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 命令执行结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ExecuteSmartLiveCommandResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteSmartLiveCommandResponse that = (ExecuteSmartLiveCommandResponse) obj;
        return Objects.equals(this.commandId, that.commandId) && Objects.equals(this.command, that.command)
            && Objects.equals(this.result, that.result) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commandId, command, result, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteSmartLiveCommandResponse {\n");
        sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
