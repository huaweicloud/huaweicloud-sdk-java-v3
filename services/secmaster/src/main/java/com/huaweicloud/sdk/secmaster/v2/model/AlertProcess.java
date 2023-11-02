package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlertProcess
 */
public class AlertProcess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_name")

    private String processName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_path")

    private String processPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_pid")

    private Integer processPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_uid")

    private Integer processUid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_cmdline")

    private String processCmdline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_parent_name")

    private String processParentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_parent_path")

    private String processParentPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_parent_pid")

    private Integer processParentPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_parent_uid")

    private Integer processParentUid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_parent_cmdline")

    private String processParentCmdline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_child_name")

    private String processChildName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_child_path")

    private String processChildPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_child_pid")

    private Integer processChildPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_child_uid")

    private Integer processChildUid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_child_cmdline")

    private String processChildCmdline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_launche_time")

    private String processLauncheTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_terminate_time")

    private String processTerminateTime;

    public AlertProcess withProcessName(String processName) {
        this.processName = processName;
        return this;
    }

    /**
     * 进程名
     * @return processName
     */
    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public AlertProcess withProcessPath(String processPath) {
        this.processPath = processPath;
        return this;
    }

    /**
     * 进程执行文件路径
     * @return processPath
     */
    public String getProcessPath() {
        return processPath;
    }

    public void setProcessPath(String processPath) {
        this.processPath = processPath;
    }

    public AlertProcess withProcessPid(Integer processPid) {
        this.processPid = processPid;
        return this;
    }

    /**
     * 进程id
     * minimum: 0
     * maximum: 65535
     * @return processPid
     */
    public Integer getProcessPid() {
        return processPid;
    }

    public void setProcessPid(Integer processPid) {
        this.processPid = processPid;
    }

    public AlertProcess withProcessUid(Integer processUid) {
        this.processUid = processUid;
        return this;
    }

    /**
     * 进程用户id
     * minimum: 0
     * maximum: 655350
     * @return processUid
     */
    public Integer getProcessUid() {
        return processUid;
    }

    public void setProcessUid(Integer processUid) {
        this.processUid = processUid;
    }

    public AlertProcess withProcessCmdline(String processCmdline) {
        this.processCmdline = processCmdline;
        return this;
    }

    /**
     * 进程命令行
     * @return processCmdline
     */
    public String getProcessCmdline() {
        return processCmdline;
    }

    public void setProcessCmdline(String processCmdline) {
        this.processCmdline = processCmdline;
    }

    public AlertProcess withProcessParentName(String processParentName) {
        this.processParentName = processParentName;
        return this;
    }

    /**
     * 父进程名称
     * @return processParentName
     */
    public String getProcessParentName() {
        return processParentName;
    }

    public void setProcessParentName(String processParentName) {
        this.processParentName = processParentName;
    }

    public AlertProcess withProcessParentPath(String processParentPath) {
        this.processParentPath = processParentPath;
        return this;
    }

    /**
     * 父进程执行文件路径
     * @return processParentPath
     */
    public String getProcessParentPath() {
        return processParentPath;
    }

    public void setProcessParentPath(String processParentPath) {
        this.processParentPath = processParentPath;
    }

    public AlertProcess withProcessParentPid(Integer processParentPid) {
        this.processParentPid = processParentPid;
        return this;
    }

    /**
     * 父进程id
     * minimum: 0
     * maximum: 65535
     * @return processParentPid
     */
    public Integer getProcessParentPid() {
        return processParentPid;
    }

    public void setProcessParentPid(Integer processParentPid) {
        this.processParentPid = processParentPid;
    }

    public AlertProcess withProcessParentUid(Integer processParentUid) {
        this.processParentUid = processParentUid;
        return this;
    }

    /**
     * 父进程用户id
     * minimum: 0
     * maximum: 655350
     * @return processParentUid
     */
    public Integer getProcessParentUid() {
        return processParentUid;
    }

    public void setProcessParentUid(Integer processParentUid) {
        this.processParentUid = processParentUid;
    }

    public AlertProcess withProcessParentCmdline(String processParentCmdline) {
        this.processParentCmdline = processParentCmdline;
        return this;
    }

    /**
     * 父进程命令行
     * @return processParentCmdline
     */
    public String getProcessParentCmdline() {
        return processParentCmdline;
    }

    public void setProcessParentCmdline(String processParentCmdline) {
        this.processParentCmdline = processParentCmdline;
    }

    public AlertProcess withProcessChildName(String processChildName) {
        this.processChildName = processChildName;
        return this;
    }

    /**
     * 子进程名称
     * @return processChildName
     */
    public String getProcessChildName() {
        return processChildName;
    }

    public void setProcessChildName(String processChildName) {
        this.processChildName = processChildName;
    }

    public AlertProcess withProcessChildPath(String processChildPath) {
        this.processChildPath = processChildPath;
        return this;
    }

    /**
     * 子进程执行文件路径
     * @return processChildPath
     */
    public String getProcessChildPath() {
        return processChildPath;
    }

    public void setProcessChildPath(String processChildPath) {
        this.processChildPath = processChildPath;
    }

    public AlertProcess withProcessChildPid(Integer processChildPid) {
        this.processChildPid = processChildPid;
        return this;
    }

    /**
     * 子进程id
     * minimum: 0
     * maximum: 65535
     * @return processChildPid
     */
    public Integer getProcessChildPid() {
        return processChildPid;
    }

    public void setProcessChildPid(Integer processChildPid) {
        this.processChildPid = processChildPid;
    }

    public AlertProcess withProcessChildUid(Integer processChildUid) {
        this.processChildUid = processChildUid;
        return this;
    }

    /**
     * 子进程用户id
     * minimum: 0
     * maximum: 655350
     * @return processChildUid
     */
    public Integer getProcessChildUid() {
        return processChildUid;
    }

    public void setProcessChildUid(Integer processChildUid) {
        this.processChildUid = processChildUid;
    }

    public AlertProcess withProcessChildCmdline(String processChildCmdline) {
        this.processChildCmdline = processChildCmdline;
        return this;
    }

    /**
     * 子进程命令行
     * @return processChildCmdline
     */
    public String getProcessChildCmdline() {
        return processChildCmdline;
    }

    public void setProcessChildCmdline(String processChildCmdline) {
        this.processChildCmdline = processChildCmdline;
    }

    public AlertProcess withProcessLauncheTime(String processLauncheTime) {
        this.processLauncheTime = processLauncheTime;
        return this;
    }

    /**
     * 进程启动时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区
     * @return processLauncheTime
     */
    public String getProcessLauncheTime() {
        return processLauncheTime;
    }

    public void setProcessLauncheTime(String processLauncheTime) {
        this.processLauncheTime = processLauncheTime;
    }

    public AlertProcess withProcessTerminateTime(String processTerminateTime) {
        this.processTerminateTime = processTerminateTime;
        return this;
    }

    /**
     * 进程结束时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区
     * @return processTerminateTime
     */
    public String getProcessTerminateTime() {
        return processTerminateTime;
    }

    public void setProcessTerminateTime(String processTerminateTime) {
        this.processTerminateTime = processTerminateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertProcess that = (AlertProcess) obj;
        return Objects.equals(this.processName, that.processName) && Objects.equals(this.processPath, that.processPath)
            && Objects.equals(this.processPid, that.processPid) && Objects.equals(this.processUid, that.processUid)
            && Objects.equals(this.processCmdline, that.processCmdline)
            && Objects.equals(this.processParentName, that.processParentName)
            && Objects.equals(this.processParentPath, that.processParentPath)
            && Objects.equals(this.processParentPid, that.processParentPid)
            && Objects.equals(this.processParentUid, that.processParentUid)
            && Objects.equals(this.processParentCmdline, that.processParentCmdline)
            && Objects.equals(this.processChildName, that.processChildName)
            && Objects.equals(this.processChildPath, that.processChildPath)
            && Objects.equals(this.processChildPid, that.processChildPid)
            && Objects.equals(this.processChildUid, that.processChildUid)
            && Objects.equals(this.processChildCmdline, that.processChildCmdline)
            && Objects.equals(this.processLauncheTime, that.processLauncheTime)
            && Objects.equals(this.processTerminateTime, that.processTerminateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processName,
            processPath,
            processPid,
            processUid,
            processCmdline,
            processParentName,
            processParentPath,
            processParentPid,
            processParentUid,
            processParentCmdline,
            processChildName,
            processChildPath,
            processChildPid,
            processChildUid,
            processChildCmdline,
            processLauncheTime,
            processTerminateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertProcess {\n");
        sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
        sb.append("    processPath: ").append(toIndentedString(processPath)).append("\n");
        sb.append("    processPid: ").append(toIndentedString(processPid)).append("\n");
        sb.append("    processUid: ").append(toIndentedString(processUid)).append("\n");
        sb.append("    processCmdline: ").append(toIndentedString(processCmdline)).append("\n");
        sb.append("    processParentName: ").append(toIndentedString(processParentName)).append("\n");
        sb.append("    processParentPath: ").append(toIndentedString(processParentPath)).append("\n");
        sb.append("    processParentPid: ").append(toIndentedString(processParentPid)).append("\n");
        sb.append("    processParentUid: ").append(toIndentedString(processParentUid)).append("\n");
        sb.append("    processParentCmdline: ").append(toIndentedString(processParentCmdline)).append("\n");
        sb.append("    processChildName: ").append(toIndentedString(processChildName)).append("\n");
        sb.append("    processChildPath: ").append(toIndentedString(processChildPath)).append("\n");
        sb.append("    processChildPid: ").append(toIndentedString(processChildPid)).append("\n");
        sb.append("    processChildUid: ").append(toIndentedString(processChildUid)).append("\n");
        sb.append("    processChildCmdline: ").append(toIndentedString(processChildCmdline)).append("\n");
        sb.append("    processLauncheTime: ").append(toIndentedString(processLauncheTime)).append("\n");
        sb.append("    processTerminateTime: ").append(toIndentedString(processTerminateTime)).append("\n");
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
