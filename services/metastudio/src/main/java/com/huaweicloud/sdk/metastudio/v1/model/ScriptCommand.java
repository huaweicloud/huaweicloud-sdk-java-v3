package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数字人话术命令信息。
 */
public class ScriptCommand {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_id")

    private String roomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_id")

    private String commandId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_time")

    private String commandTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_scripts")

    private List<LivePlayingScriptInfo> sceneScripts = null;

    public ScriptCommand withRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * 直播间ID
     * @return roomId
     */
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public ScriptCommand withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 直播任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ScriptCommand withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * 命令ID。
     * @return commandId
     */
    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public ScriptCommand withCommandTime(String commandTime) {
        this.commandTime = commandTime;
        return this;
    }

    /**
     * 命令时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return commandTime
     */
    public String getCommandTime() {
        return commandTime;
    }

    public void setCommandTime(String commandTime) {
        this.commandTime = commandTime;
    }

    public ScriptCommand withSceneScripts(List<LivePlayingScriptInfo> sceneScripts) {
        this.sceneScripts = sceneScripts;
        return this;
    }

    public ScriptCommand addSceneScriptsItem(LivePlayingScriptInfo sceneScriptsItem) {
        if (this.sceneScripts == null) {
            this.sceneScripts = new ArrayList<>();
        }
        this.sceneScripts.add(sceneScriptsItem);
        return this;
    }

    public ScriptCommand withSceneScripts(Consumer<List<LivePlayingScriptInfo>> sceneScriptsSetter) {
        if (this.sceneScripts == null) {
            this.sceneScripts = new ArrayList<>();
        }
        sceneScriptsSetter.accept(this.sceneScripts);
        return this;
    }

    /**
     * 直播剧本列表。
     * @return sceneScripts
     */
    public List<LivePlayingScriptInfo> getSceneScripts() {
        return sceneScripts;
    }

    public void setSceneScripts(List<LivePlayingScriptInfo> sceneScripts) {
        this.sceneScripts = sceneScripts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptCommand that = (ScriptCommand) obj;
        return Objects.equals(this.roomId, that.roomId) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.commandId, that.commandId) && Objects.equals(this.commandTime, that.commandTime)
            && Objects.equals(this.sceneScripts, that.sceneScripts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId, jobId, commandId, commandTime, sceneScripts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptCommand {\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
        sb.append("    commandTime: ").append(toIndentedString(commandTime)).append("\n");
        sb.append("    sceneScripts: ").append(toIndentedString(sceneScripts)).append("\n");
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
