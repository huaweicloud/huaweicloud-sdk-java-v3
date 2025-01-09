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
 * 脚本执行任务信息。
 */
public class ScriptExecutionTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_id")

    private String desktopPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_name")

    private String desktopPoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scripts")

    private List<Script> scripts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_content")

    private String commandContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_type")

    private String commandType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    /**
     * 任务状态，值含： - FINISH：已完成。 - FAILED：失败。 - RUNNING：运行中。 - INIT： 初始化。
     */
    public static final class StatusEnum {

        /**
         * Enum FINISH for value: "FINISH"
         */
        public static final StatusEnum FINISH = new StatusEnum("FINISH");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum INIT for value: "INIT"
         */
        public static final StatusEnum INIT = new StatusEnum("INIT");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("FINISH", FINISH);
            map.put("FAILED", FAILED);
            map.put("RUNNING", RUNNING);
            map.put("INIT", INIT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Integer successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_num")

    private Integer skipNum;

    public ScriptExecutionTask withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScriptExecutionTask withDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
        return this;
    }

    /**
     * 桌面池id。
     * @return desktopPoolId
     */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }

    public void setDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
    }

    public ScriptExecutionTask withDesktopPoolName(String desktopPoolName) {
        this.desktopPoolName = desktopPoolName;
        return this;
    }

    /**
     * 桌面池名称。
     * @return desktopPoolName
     */
    public String getDesktopPoolName() {
        return desktopPoolName;
    }

    public void setDesktopPoolName(String desktopPoolName) {
        this.desktopPoolName = desktopPoolName;
    }

    public ScriptExecutionTask withScripts(List<Script> scripts) {
        this.scripts = scripts;
        return this;
    }

    public ScriptExecutionTask addScriptsItem(Script scriptsItem) {
        if (this.scripts == null) {
            this.scripts = new ArrayList<>();
        }
        this.scripts.add(scriptsItem);
        return this;
    }

    public ScriptExecutionTask withScripts(Consumer<List<Script>> scriptsSetter) {
        if (this.scripts == null) {
            this.scripts = new ArrayList<>();
        }
        scriptsSetter.accept(this.scripts);
        return this;
    }

    /**
     * 脚本信息列表。
     * @return scripts
     */
    public List<Script> getScripts() {
        return scripts;
    }

    public void setScripts(List<Script> scripts) {
        this.scripts = scripts;
    }

    public ScriptExecutionTask withCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }

    /**
     * 执行的命令行。
     * @return commandContent
     */
    public String getCommandContent() {
        return commandContent;
    }

    public void setCommandContent(String commandContent) {
        this.commandContent = commandContent;
    }

    public ScriptExecutionTask withCommandType(String commandType) {
        this.commandType = commandType;
        return this;
    }

    /**
     * 命令行类型。 - POWERSHELL：WINDOWS系统使用。 - BAT：WINDOWS系统使用。 - SHELL：LINUX系统使用。
     * @return commandType
     */
    public String getCommandType() {
        return commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    public ScriptExecutionTask withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务开始时间，格式为：yyyy-MM-ddTHH:mm:ssZ。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ScriptExecutionTask withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间，格式为：yyyy-MM-ddTHH:mm:ssZ。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ScriptExecutionTask withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态，值含： - FINISH：已完成。 - FAILED：失败。 - RUNNING：运行中。 - INIT： 初始化。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ScriptExecutionTask withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * 成功数量。
     * @return successNum
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public ScriptExecutionTask withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * 失败数量。
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public ScriptExecutionTask withSkipNum(Integer skipNum) {
        this.skipNum = skipNum;
        return this;
    }

    /**
     * 跳过数量。
     * @return skipNum
     */
    public Integer getSkipNum() {
        return skipNum;
    }

    public void setSkipNum(Integer skipNum) {
        this.skipNum = skipNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptExecutionTask that = (ScriptExecutionTask) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.desktopPoolId, that.desktopPoolId)
            && Objects.equals(this.desktopPoolName, that.desktopPoolName) && Objects.equals(this.scripts, that.scripts)
            && Objects.equals(this.commandContent, that.commandContent)
            && Objects.equals(this.commandType, that.commandType) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.successNum, that.successNum) && Objects.equals(this.failedNum, that.failedNum)
            && Objects.equals(this.skipNum, that.skipNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            desktopPoolId,
            desktopPoolName,
            scripts,
            commandContent,
            commandType,
            startTime,
            endTime,
            status,
            successNum,
            failedNum,
            skipNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptExecutionTask {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    desktopPoolId: ").append(toIndentedString(desktopPoolId)).append("\n");
        sb.append("    desktopPoolName: ").append(toIndentedString(desktopPoolName)).append("\n");
        sb.append("    scripts: ").append(toIndentedString(scripts)).append("\n");
        sb.append("    commandContent: ").append(toIndentedString(commandContent)).append("\n");
        sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    skipNum: ").append(toIndentedString(skipNum)).append("\n");
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
