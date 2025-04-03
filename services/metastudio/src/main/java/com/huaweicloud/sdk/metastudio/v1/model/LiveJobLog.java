package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 直播任务记录。
 */
public class LiveJobLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interaction_records_url")

    private String interactionRecordsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config_records_url")

    private String jobConfigRecordsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scripts_records_url")

    private String scriptsRecordsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_reviced_records_url")

    private String commandRevicedRecordsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_exec_records_url")

    private String commandExecRecordsUrl;

    public LiveJobLog withInteractionRecordsUrl(String interactionRecordsUrl) {
        this.interactionRecordsUrl = interactionRecordsUrl;
        return this;
    }

    /**
     * 直播互动记录文件地址
     * @return interactionRecordsUrl
     */
    public String getInteractionRecordsUrl() {
        return interactionRecordsUrl;
    }

    public void setInteractionRecordsUrl(String interactionRecordsUrl) {
        this.interactionRecordsUrl = interactionRecordsUrl;
    }

    public LiveJobLog withJobConfigRecordsUrl(String jobConfigRecordsUrl) {
        this.jobConfigRecordsUrl = jobConfigRecordsUrl;
        return this;
    }

    /**
     * 任务配置记录文件地址
     * @return jobConfigRecordsUrl
     */
    public String getJobConfigRecordsUrl() {
        return jobConfigRecordsUrl;
    }

    public void setJobConfigRecordsUrl(String jobConfigRecordsUrl) {
        this.jobConfigRecordsUrl = jobConfigRecordsUrl;
    }

    public LiveJobLog withScriptsRecordsUrl(String scriptsRecordsUrl) {
        this.scriptsRecordsUrl = scriptsRecordsUrl;
        return this;
    }

    /**
     * 剧本播放记录文件地址
     * @return scriptsRecordsUrl
     */
    public String getScriptsRecordsUrl() {
        return scriptsRecordsUrl;
    }

    public void setScriptsRecordsUrl(String scriptsRecordsUrl) {
        this.scriptsRecordsUrl = scriptsRecordsUrl;
    }

    public LiveJobLog withCommandRevicedRecordsUrl(String commandRevicedRecordsUrl) {
        this.commandRevicedRecordsUrl = commandRevicedRecordsUrl;
        return this;
    }

    /**
     * 命令接受记录文件地址
     * @return commandRevicedRecordsUrl
     */
    public String getCommandRevicedRecordsUrl() {
        return commandRevicedRecordsUrl;
    }

    public void setCommandRevicedRecordsUrl(String commandRevicedRecordsUrl) {
        this.commandRevicedRecordsUrl = commandRevicedRecordsUrl;
    }

    public LiveJobLog withCommandExecRecordsUrl(String commandExecRecordsUrl) {
        this.commandExecRecordsUrl = commandExecRecordsUrl;
        return this;
    }

    /**
     * 命令执行记录文件地址
     * @return commandExecRecordsUrl
     */
    public String getCommandExecRecordsUrl() {
        return commandExecRecordsUrl;
    }

    public void setCommandExecRecordsUrl(String commandExecRecordsUrl) {
        this.commandExecRecordsUrl = commandExecRecordsUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveJobLog that = (LiveJobLog) obj;
        return Objects.equals(this.interactionRecordsUrl, that.interactionRecordsUrl)
            && Objects.equals(this.jobConfigRecordsUrl, that.jobConfigRecordsUrl)
            && Objects.equals(this.scriptsRecordsUrl, that.scriptsRecordsUrl)
            && Objects.equals(this.commandRevicedRecordsUrl, that.commandRevicedRecordsUrl)
            && Objects.equals(this.commandExecRecordsUrl, that.commandExecRecordsUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interactionRecordsUrl,
            jobConfigRecordsUrl,
            scriptsRecordsUrl,
            commandRevicedRecordsUrl,
            commandExecRecordsUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveJobLog {\n");
        sb.append("    interactionRecordsUrl: ").append(toIndentedString(interactionRecordsUrl)).append("\n");
        sb.append("    jobConfigRecordsUrl: ").append(toIndentedString(jobConfigRecordsUrl)).append("\n");
        sb.append("    scriptsRecordsUrl: ").append(toIndentedString(scriptsRecordsUrl)).append("\n");
        sb.append("    commandRevicedRecordsUrl: ").append(toIndentedString(commandRevicedRecordsUrl)).append("\n");
        sb.append("    commandExecRecordsUrl: ").append(toIndentedString(commandExecRecordsUrl)).append("\n");
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
