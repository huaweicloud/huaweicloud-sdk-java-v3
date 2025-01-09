package com.huaweicloud.sdk.workspace.v2.model;

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
 * 桌面池执行脚本请求体。
 */
public class ExecuteDesktopPoolScriptsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_ids")

    private List<String> scriptIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_count")

    private Integer grayCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_desktop_ids")

    private List<String> grayDesktopIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_fail_threshold")

    private Integer grayFailThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_start")

    private String preStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "post_finish")

    private String postFinish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_content")

    private String commandContent;

    /**
     * 命令行类型，执行命令行时必传。 - POWERSHELL：WINDOWS系统使用。 - BAT：WINDOWS系统使用。 - SHELL：LINUX系统使用。
     */
    public static final class CommandTypeEnum {

        /**
         * Enum POWERSHELL for value: "POWERSHELL"
         */
        public static final CommandTypeEnum POWERSHELL = new CommandTypeEnum("POWERSHELL");

        /**
         * Enum BAT for value: "BAT"
         */
        public static final CommandTypeEnum BAT = new CommandTypeEnum("BAT");

        /**
         * Enum SHELL for value: "SHELL"
         */
        public static final CommandTypeEnum SHELL = new CommandTypeEnum("SHELL");

        private static final Map<String, CommandTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommandTypeEnum> createStaticFields() {
            Map<String, CommandTypeEnum> map = new HashMap<>();
            map.put("POWERSHELL", POWERSHELL);
            map.put("BAT", BAT);
            map.put("SHELL", SHELL);
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
    @JsonProperty(value = "execution_timeout")

    private Integer executionTimeout;

    public ExecuteDesktopPoolScriptsReq withScriptIds(List<String> scriptIds) {
        this.scriptIds = scriptIds;
        return this;
    }

    public ExecuteDesktopPoolScriptsReq addScriptIdsItem(String scriptIdsItem) {
        if (this.scriptIds == null) {
            this.scriptIds = new ArrayList<>();
        }
        this.scriptIds.add(scriptIdsItem);
        return this;
    }

    public ExecuteDesktopPoolScriptsReq withScriptIds(Consumer<List<String>> scriptIdsSetter) {
        if (this.scriptIds == null) {
            this.scriptIds = new ArrayList<>();
        }
        scriptIdsSetter.accept(this.scriptIds);
        return this;
    }

    /**
     * 执行的脚本id列表，与command二选一。
     * @return scriptIds
     */
    public List<String> getScriptIds() {
        return scriptIds;
    }

    public void setScriptIds(List<String> scriptIds) {
        this.scriptIds = scriptIds;
    }

    public ExecuteDesktopPoolScriptsReq withGrayCount(Integer grayCount) {
        this.grayCount = grayCount;
        return this;
    }

    /**
     * 首批执行的桌面数量，优先级高于gray_desktop_ids。
     * minimum: 0
     * maximum: 1000
     * @return grayCount
     */
    public Integer getGrayCount() {
        return grayCount;
    }

    public void setGrayCount(Integer grayCount) {
        this.grayCount = grayCount;
    }

    public ExecuteDesktopPoolScriptsReq withGrayDesktopIds(List<String> grayDesktopIds) {
        this.grayDesktopIds = grayDesktopIds;
        return this;
    }

    public ExecuteDesktopPoolScriptsReq addGrayDesktopIdsItem(String grayDesktopIdsItem) {
        if (this.grayDesktopIds == null) {
            this.grayDesktopIds = new ArrayList<>();
        }
        this.grayDesktopIds.add(grayDesktopIdsItem);
        return this;
    }

    public ExecuteDesktopPoolScriptsReq withGrayDesktopIds(Consumer<List<String>> grayDesktopIdsSetter) {
        if (this.grayDesktopIds == null) {
            this.grayDesktopIds = new ArrayList<>();
        }
        grayDesktopIdsSetter.accept(this.grayDesktopIds);
        return this;
    }

    /**
     * 首批执行的桌面id列表，优先级低于gray_count。
     * @return grayDesktopIds
     */
    public List<String> getGrayDesktopIds() {
        return grayDesktopIds;
    }

    public void setGrayDesktopIds(List<String> grayDesktopIds) {
        this.grayDesktopIds = grayDesktopIds;
    }

    public ExecuteDesktopPoolScriptsReq withGrayFailThreshold(Integer grayFailThreshold) {
        this.grayFailThreshold = grayFailThreshold;
        return this;
    }

    /**
     * 灰度失败阈值，灰度执行失败次数达到该值时，不执行下一批任务。
     * minimum: 1
     * maximum: 1000
     * @return grayFailThreshold
     */
    public Integer getGrayFailThreshold() {
        return grayFailThreshold;
    }

    public void setGrayFailThreshold(Integer grayFailThreshold) {
        this.grayFailThreshold = grayFailThreshold;
    }

    public ExecuteDesktopPoolScriptsReq withPreStart(String preStart) {
        this.preStart = preStart;
        return this;
    }

    /**
     * 执行脚本前置步骤。
     * @return preStart
     */
    public String getPreStart() {
        return preStart;
    }

    public void setPreStart(String preStart) {
        this.preStart = preStart;
    }

    public ExecuteDesktopPoolScriptsReq withPostFinish(String postFinish) {
        this.postFinish = postFinish;
        return this;
    }

    /**
     * 执行脚本完成后置步骤，当前支持关机（stop）、重启（reboot）。
     * @return postFinish
     */
    public String getPostFinish() {
        return postFinish;
    }

    public void setPostFinish(String postFinish) {
        this.postFinish = postFinish;
    }

    public ExecuteDesktopPoolScriptsReq withCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }

    /**
     * 执行的命令行，与script_ids二选一。
     * @return commandContent
     */
    public String getCommandContent() {
        return commandContent;
    }

    public void setCommandContent(String commandContent) {
        this.commandContent = commandContent;
    }

    public ExecuteDesktopPoolScriptsReq withCommandType(CommandTypeEnum commandType) {
        this.commandType = commandType;
        return this;
    }

    /**
     * 命令行类型，执行命令行时必传。 - POWERSHELL：WINDOWS系统使用。 - BAT：WINDOWS系统使用。 - SHELL：LINUX系统使用。
     * @return commandType
     */
    public CommandTypeEnum getCommandType() {
        return commandType;
    }

    public void setCommandType(CommandTypeEnum commandType) {
        this.commandType = commandType;
    }

    public ExecuteDesktopPoolScriptsReq withExecutionTimeout(Integer executionTimeout) {
        this.executionTimeout = executionTimeout;
        return this;
    }

    /**
     * 执行脚本的超时时间，单位分钟，默认1分钟。
     * minimum: 1
     * maximum: 600
     * @return executionTimeout
     */
    public Integer getExecutionTimeout() {
        return executionTimeout;
    }

    public void setExecutionTimeout(Integer executionTimeout) {
        this.executionTimeout = executionTimeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteDesktopPoolScriptsReq that = (ExecuteDesktopPoolScriptsReq) obj;
        return Objects.equals(this.scriptIds, that.scriptIds) && Objects.equals(this.grayCount, that.grayCount)
            && Objects.equals(this.grayDesktopIds, that.grayDesktopIds)
            && Objects.equals(this.grayFailThreshold, that.grayFailThreshold)
            && Objects.equals(this.preStart, that.preStart) && Objects.equals(this.postFinish, that.postFinish)
            && Objects.equals(this.commandContent, that.commandContent)
            && Objects.equals(this.commandType, that.commandType)
            && Objects.equals(this.executionTimeout, that.executionTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptIds,
            grayCount,
            grayDesktopIds,
            grayFailThreshold,
            preStart,
            postFinish,
            commandContent,
            commandType,
            executionTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteDesktopPoolScriptsReq {\n");
        sb.append("    scriptIds: ").append(toIndentedString(scriptIds)).append("\n");
        sb.append("    grayCount: ").append(toIndentedString(grayCount)).append("\n");
        sb.append("    grayDesktopIds: ").append(toIndentedString(grayDesktopIds)).append("\n");
        sb.append("    grayFailThreshold: ").append(toIndentedString(grayFailThreshold)).append("\n");
        sb.append("    preStart: ").append(toIndentedString(preStart)).append("\n");
        sb.append("    postFinish: ").append(toIndentedString(postFinish)).append("\n");
        sb.append("    commandContent: ").append(toIndentedString(commandContent)).append("\n");
        sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
        sb.append("    executionTimeout: ").append(toIndentedString(executionTimeout)).append("\n");
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
