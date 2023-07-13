package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 进程信息
 */
public class EventProcessResponseInfo {

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
    @JsonProperty(value = "process_username")

    private String processUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_cmdline")

    private String processCmdline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_filename")

    private String processFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_start_time")

    private Long processStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_gid")

    private Integer processGid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_egid")

    private Integer processEgid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_euid")

    private Integer processEuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_process_name")

    private String parentProcessName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_process_path")

    private String parentProcessPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_process_pid")

    private Integer parentProcessPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_process_uid")

    private Integer parentProcessUid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_process_cmdline")

    private String parentProcessCmdline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_process_filename")

    private String parentProcessFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_process_start_time")

    private Long parentProcessStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_process_gid")

    private Integer parentProcessGid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_process_egid")

    private Integer parentProcessEgid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_process_euid")

    private Integer parentProcessEuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_process_name")

    private String childProcessName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_process_path")

    private String childProcessPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_process_pid")

    private Integer childProcessPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_process_uid")

    private Integer childProcessUid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_process_cmdline")

    private String childProcessCmdline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_process_filename")

    private String childProcessFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_process_start_time")

    private Long childProcessStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_process_gid")

    private Integer childProcessGid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_process_egid")

    private Integer childProcessEgid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "child_process_euid")

    private Integer childProcessEuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virt_cmd")

    private String virtCmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virt_process_name")

    private String virtProcessName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "escape_mode")

    private String escapeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "escape_cmd")

    private String escapeCmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_hash")

    private String processHash;

    public EventProcessResponseInfo withProcessName(String processName) {
        this.processName = processName;
        return this;
    }

    /**
     * 进程名称
     * @return processName
     */
    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public EventProcessResponseInfo withProcessPath(String processPath) {
        this.processPath = processPath;
        return this;
    }

    /**
     * 进程文件路径
     * @return processPath
     */
    public String getProcessPath() {
        return processPath;
    }

    public void setProcessPath(String processPath) {
        this.processPath = processPath;
    }

    public EventProcessResponseInfo withProcessPid(Integer processPid) {
        this.processPid = processPid;
        return this;
    }

    /**
     * 进程id
     * minimum: 0
     * maximum: 2147483647
     * @return processPid
     */
    public Integer getProcessPid() {
        return processPid;
    }

    public void setProcessPid(Integer processPid) {
        this.processPid = processPid;
    }

    public EventProcessResponseInfo withProcessUid(Integer processUid) {
        this.processUid = processUid;
        return this;
    }

    /**
     * 进程用户id
     * minimum: 0
     * maximum: 2147483647
     * @return processUid
     */
    public Integer getProcessUid() {
        return processUid;
    }

    public void setProcessUid(Integer processUid) {
        this.processUid = processUid;
    }

    public EventProcessResponseInfo withProcessUsername(String processUsername) {
        this.processUsername = processUsername;
        return this;
    }

    /**
     * 运行进程的用户名
     * @return processUsername
     */
    public String getProcessUsername() {
        return processUsername;
    }

    public void setProcessUsername(String processUsername) {
        this.processUsername = processUsername;
    }

    public EventProcessResponseInfo withProcessCmdline(String processCmdline) {
        this.processCmdline = processCmdline;
        return this;
    }

    /**
     * 进程文件命令行
     * @return processCmdline
     */
    public String getProcessCmdline() {
        return processCmdline;
    }

    public void setProcessCmdline(String processCmdline) {
        this.processCmdline = processCmdline;
    }

    public EventProcessResponseInfo withProcessFilename(String processFilename) {
        this.processFilename = processFilename;
        return this;
    }

    /**
     * 进程文件名
     * @return processFilename
     */
    public String getProcessFilename() {
        return processFilename;
    }

    public void setProcessFilename(String processFilename) {
        this.processFilename = processFilename;
    }

    public EventProcessResponseInfo withProcessStartTime(Long processStartTime) {
        this.processStartTime = processStartTime;
        return this;
    }

    /**
     * 进程启动时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return processStartTime
     */
    public Long getProcessStartTime() {
        return processStartTime;
    }

    public void setProcessStartTime(Long processStartTime) {
        this.processStartTime = processStartTime;
    }

    public EventProcessResponseInfo withProcessGid(Integer processGid) {
        this.processGid = processGid;
        return this;
    }

    /**
     * 进程组ID
     * minimum: 0
     * maximum: 2147483647
     * @return processGid
     */
    public Integer getProcessGid() {
        return processGid;
    }

    public void setProcessGid(Integer processGid) {
        this.processGid = processGid;
    }

    public EventProcessResponseInfo withProcessEgid(Integer processEgid) {
        this.processEgid = processEgid;
        return this;
    }

    /**
     * 进程有效组ID
     * minimum: 0
     * maximum: 2147483647
     * @return processEgid
     */
    public Integer getProcessEgid() {
        return processEgid;
    }

    public void setProcessEgid(Integer processEgid) {
        this.processEgid = processEgid;
    }

    public EventProcessResponseInfo withProcessEuid(Integer processEuid) {
        this.processEuid = processEuid;
        return this;
    }

    /**
     * 进程有效用户ID
     * minimum: 0
     * maximum: 2147483647
     * @return processEuid
     */
    public Integer getProcessEuid() {
        return processEuid;
    }

    public void setProcessEuid(Integer processEuid) {
        this.processEuid = processEuid;
    }

    public EventProcessResponseInfo withParentProcessName(String parentProcessName) {
        this.parentProcessName = parentProcessName;
        return this;
    }

    /**
     * 父进程名称
     * @return parentProcessName
     */
    public String getParentProcessName() {
        return parentProcessName;
    }

    public void setParentProcessName(String parentProcessName) {
        this.parentProcessName = parentProcessName;
    }

    public EventProcessResponseInfo withParentProcessPath(String parentProcessPath) {
        this.parentProcessPath = parentProcessPath;
        return this;
    }

    /**
     * 父进程文件路径
     * @return parentProcessPath
     */
    public String getParentProcessPath() {
        return parentProcessPath;
    }

    public void setParentProcessPath(String parentProcessPath) {
        this.parentProcessPath = parentProcessPath;
    }

    public EventProcessResponseInfo withParentProcessPid(Integer parentProcessPid) {
        this.parentProcessPid = parentProcessPid;
        return this;
    }

    /**
     * 父进程id
     * minimum: 0
     * maximum: 2147483647
     * @return parentProcessPid
     */
    public Integer getParentProcessPid() {
        return parentProcessPid;
    }

    public void setParentProcessPid(Integer parentProcessPid) {
        this.parentProcessPid = parentProcessPid;
    }

    public EventProcessResponseInfo withParentProcessUid(Integer parentProcessUid) {
        this.parentProcessUid = parentProcessUid;
        return this;
    }

    /**
     * 父进程用户id
     * minimum: 0
     * maximum: 2147483647
     * @return parentProcessUid
     */
    public Integer getParentProcessUid() {
        return parentProcessUid;
    }

    public void setParentProcessUid(Integer parentProcessUid) {
        this.parentProcessUid = parentProcessUid;
    }

    public EventProcessResponseInfo withParentProcessCmdline(String parentProcessCmdline) {
        this.parentProcessCmdline = parentProcessCmdline;
        return this;
    }

    /**
     * 父进程文件命令行
     * @return parentProcessCmdline
     */
    public String getParentProcessCmdline() {
        return parentProcessCmdline;
    }

    public void setParentProcessCmdline(String parentProcessCmdline) {
        this.parentProcessCmdline = parentProcessCmdline;
    }

    public EventProcessResponseInfo withParentProcessFilename(String parentProcessFilename) {
        this.parentProcessFilename = parentProcessFilename;
        return this;
    }

    /**
     * 父进程文件名
     * @return parentProcessFilename
     */
    public String getParentProcessFilename() {
        return parentProcessFilename;
    }

    public void setParentProcessFilename(String parentProcessFilename) {
        this.parentProcessFilename = parentProcessFilename;
    }

    public EventProcessResponseInfo withParentProcessStartTime(Long parentProcessStartTime) {
        this.parentProcessStartTime = parentProcessStartTime;
        return this;
    }

    /**
     * 父进程启动时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return parentProcessStartTime
     */
    public Long getParentProcessStartTime() {
        return parentProcessStartTime;
    }

    public void setParentProcessStartTime(Long parentProcessStartTime) {
        this.parentProcessStartTime = parentProcessStartTime;
    }

    public EventProcessResponseInfo withParentProcessGid(Integer parentProcessGid) {
        this.parentProcessGid = parentProcessGid;
        return this;
    }

    /**
     * 父进程组ID
     * minimum: 0
     * maximum: 2147483647
     * @return parentProcessGid
     */
    public Integer getParentProcessGid() {
        return parentProcessGid;
    }

    public void setParentProcessGid(Integer parentProcessGid) {
        this.parentProcessGid = parentProcessGid;
    }

    public EventProcessResponseInfo withParentProcessEgid(Integer parentProcessEgid) {
        this.parentProcessEgid = parentProcessEgid;
        return this;
    }

    /**
     * 父进程有效组ID
     * minimum: 0
     * maximum: 2147483647
     * @return parentProcessEgid
     */
    public Integer getParentProcessEgid() {
        return parentProcessEgid;
    }

    public void setParentProcessEgid(Integer parentProcessEgid) {
        this.parentProcessEgid = parentProcessEgid;
    }

    public EventProcessResponseInfo withParentProcessEuid(Integer parentProcessEuid) {
        this.parentProcessEuid = parentProcessEuid;
        return this;
    }

    /**
     * 父进程有效用户ID
     * minimum: 0
     * maximum: 2147483647
     * @return parentProcessEuid
     */
    public Integer getParentProcessEuid() {
        return parentProcessEuid;
    }

    public void setParentProcessEuid(Integer parentProcessEuid) {
        this.parentProcessEuid = parentProcessEuid;
    }

    public EventProcessResponseInfo withChildProcessName(String childProcessName) {
        this.childProcessName = childProcessName;
        return this;
    }

    /**
     * 子进程名称
     * @return childProcessName
     */
    public String getChildProcessName() {
        return childProcessName;
    }

    public void setChildProcessName(String childProcessName) {
        this.childProcessName = childProcessName;
    }

    public EventProcessResponseInfo withChildProcessPath(String childProcessPath) {
        this.childProcessPath = childProcessPath;
        return this;
    }

    /**
     * 子进程文件路径
     * @return childProcessPath
     */
    public String getChildProcessPath() {
        return childProcessPath;
    }

    public void setChildProcessPath(String childProcessPath) {
        this.childProcessPath = childProcessPath;
    }

    public EventProcessResponseInfo withChildProcessPid(Integer childProcessPid) {
        this.childProcessPid = childProcessPid;
        return this;
    }

    /**
     * 子进程id
     * minimum: 0
     * maximum: 2147483647
     * @return childProcessPid
     */
    public Integer getChildProcessPid() {
        return childProcessPid;
    }

    public void setChildProcessPid(Integer childProcessPid) {
        this.childProcessPid = childProcessPid;
    }

    public EventProcessResponseInfo withChildProcessUid(Integer childProcessUid) {
        this.childProcessUid = childProcessUid;
        return this;
    }

    /**
     * 子进程用户id
     * minimum: 0
     * maximum: 2147483647
     * @return childProcessUid
     */
    public Integer getChildProcessUid() {
        return childProcessUid;
    }

    public void setChildProcessUid(Integer childProcessUid) {
        this.childProcessUid = childProcessUid;
    }

    public EventProcessResponseInfo withChildProcessCmdline(String childProcessCmdline) {
        this.childProcessCmdline = childProcessCmdline;
        return this;
    }

    /**
     * 子进程文件命令行
     * @return childProcessCmdline
     */
    public String getChildProcessCmdline() {
        return childProcessCmdline;
    }

    public void setChildProcessCmdline(String childProcessCmdline) {
        this.childProcessCmdline = childProcessCmdline;
    }

    public EventProcessResponseInfo withChildProcessFilename(String childProcessFilename) {
        this.childProcessFilename = childProcessFilename;
        return this;
    }

    /**
     * 子进程文件名
     * @return childProcessFilename
     */
    public String getChildProcessFilename() {
        return childProcessFilename;
    }

    public void setChildProcessFilename(String childProcessFilename) {
        this.childProcessFilename = childProcessFilename;
    }

    public EventProcessResponseInfo withChildProcessStartTime(Long childProcessStartTime) {
        this.childProcessStartTime = childProcessStartTime;
        return this;
    }

    /**
     * 子进程启动时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return childProcessStartTime
     */
    public Long getChildProcessStartTime() {
        return childProcessStartTime;
    }

    public void setChildProcessStartTime(Long childProcessStartTime) {
        this.childProcessStartTime = childProcessStartTime;
    }

    public EventProcessResponseInfo withChildProcessGid(Integer childProcessGid) {
        this.childProcessGid = childProcessGid;
        return this;
    }

    /**
     * 子进程组ID
     * minimum: 0
     * maximum: 2147483647
     * @return childProcessGid
     */
    public Integer getChildProcessGid() {
        return childProcessGid;
    }

    public void setChildProcessGid(Integer childProcessGid) {
        this.childProcessGid = childProcessGid;
    }

    public EventProcessResponseInfo withChildProcessEgid(Integer childProcessEgid) {
        this.childProcessEgid = childProcessEgid;
        return this;
    }

    /**
     * 子进程有效组ID
     * minimum: 0
     * maximum: 2147483647
     * @return childProcessEgid
     */
    public Integer getChildProcessEgid() {
        return childProcessEgid;
    }

    public void setChildProcessEgid(Integer childProcessEgid) {
        this.childProcessEgid = childProcessEgid;
    }

    public EventProcessResponseInfo withChildProcessEuid(Integer childProcessEuid) {
        this.childProcessEuid = childProcessEuid;
        return this;
    }

    /**
     * 子进程有效用户ID
     * minimum: 0
     * maximum: 2147483647
     * @return childProcessEuid
     */
    public Integer getChildProcessEuid() {
        return childProcessEuid;
    }

    public void setChildProcessEuid(Integer childProcessEuid) {
        this.childProcessEuid = childProcessEuid;
    }

    public EventProcessResponseInfo withVirtCmd(String virtCmd) {
        this.virtCmd = virtCmd;
        return this;
    }

    /**
     * 虚拟化命令
     * @return virtCmd
     */
    public String getVirtCmd() {
        return virtCmd;
    }

    public void setVirtCmd(String virtCmd) {
        this.virtCmd = virtCmd;
    }

    public EventProcessResponseInfo withVirtProcessName(String virtProcessName) {
        this.virtProcessName = virtProcessName;
        return this;
    }

    /**
     * 虚拟化进程名称
     * @return virtProcessName
     */
    public String getVirtProcessName() {
        return virtProcessName;
    }

    public void setVirtProcessName(String virtProcessName) {
        this.virtProcessName = virtProcessName;
    }

    public EventProcessResponseInfo withEscapeMode(String escapeMode) {
        this.escapeMode = escapeMode;
        return this;
    }

    /**
     * 逃逸方式
     * @return escapeMode
     */
    public String getEscapeMode() {
        return escapeMode;
    }

    public void setEscapeMode(String escapeMode) {
        this.escapeMode = escapeMode;
    }

    public EventProcessResponseInfo withEscapeCmd(String escapeCmd) {
        this.escapeCmd = escapeCmd;
        return this;
    }

    /**
     * 逃逸后后执行的命令
     * @return escapeCmd
     */
    public String getEscapeCmd() {
        return escapeCmd;
    }

    public void setEscapeCmd(String escapeCmd) {
        this.escapeCmd = escapeCmd;
    }

    public EventProcessResponseInfo withProcessHash(String processHash) {
        this.processHash = processHash;
        return this;
    }

    /**
     * 进程启动文件hash
     * @return processHash
     */
    public String getProcessHash() {
        return processHash;
    }

    public void setProcessHash(String processHash) {
        this.processHash = processHash;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventProcessResponseInfo that = (EventProcessResponseInfo) obj;
        return Objects.equals(this.processName, that.processName) && Objects.equals(this.processPath, that.processPath)
            && Objects.equals(this.processPid, that.processPid) && Objects.equals(this.processUid, that.processUid)
            && Objects.equals(this.processUsername, that.processUsername)
            && Objects.equals(this.processCmdline, that.processCmdline)
            && Objects.equals(this.processFilename, that.processFilename)
            && Objects.equals(this.processStartTime, that.processStartTime)
            && Objects.equals(this.processGid, that.processGid) && Objects.equals(this.processEgid, that.processEgid)
            && Objects.equals(this.processEuid, that.processEuid)
            && Objects.equals(this.parentProcessName, that.parentProcessName)
            && Objects.equals(this.parentProcessPath, that.parentProcessPath)
            && Objects.equals(this.parentProcessPid, that.parentProcessPid)
            && Objects.equals(this.parentProcessUid, that.parentProcessUid)
            && Objects.equals(this.parentProcessCmdline, that.parentProcessCmdline)
            && Objects.equals(this.parentProcessFilename, that.parentProcessFilename)
            && Objects.equals(this.parentProcessStartTime, that.parentProcessStartTime)
            && Objects.equals(this.parentProcessGid, that.parentProcessGid)
            && Objects.equals(this.parentProcessEgid, that.parentProcessEgid)
            && Objects.equals(this.parentProcessEuid, that.parentProcessEuid)
            && Objects.equals(this.childProcessName, that.childProcessName)
            && Objects.equals(this.childProcessPath, that.childProcessPath)
            && Objects.equals(this.childProcessPid, that.childProcessPid)
            && Objects.equals(this.childProcessUid, that.childProcessUid)
            && Objects.equals(this.childProcessCmdline, that.childProcessCmdline)
            && Objects.equals(this.childProcessFilename, that.childProcessFilename)
            && Objects.equals(this.childProcessStartTime, that.childProcessStartTime)
            && Objects.equals(this.childProcessGid, that.childProcessGid)
            && Objects.equals(this.childProcessEgid, that.childProcessEgid)
            && Objects.equals(this.childProcessEuid, that.childProcessEuid)
            && Objects.equals(this.virtCmd, that.virtCmd) && Objects.equals(this.virtProcessName, that.virtProcessName)
            && Objects.equals(this.escapeMode, that.escapeMode) && Objects.equals(this.escapeCmd, that.escapeCmd)
            && Objects.equals(this.processHash, that.processHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processName,
            processPath,
            processPid,
            processUid,
            processUsername,
            processCmdline,
            processFilename,
            processStartTime,
            processGid,
            processEgid,
            processEuid,
            parentProcessName,
            parentProcessPath,
            parentProcessPid,
            parentProcessUid,
            parentProcessCmdline,
            parentProcessFilename,
            parentProcessStartTime,
            parentProcessGid,
            parentProcessEgid,
            parentProcessEuid,
            childProcessName,
            childProcessPath,
            childProcessPid,
            childProcessUid,
            childProcessCmdline,
            childProcessFilename,
            childProcessStartTime,
            childProcessGid,
            childProcessEgid,
            childProcessEuid,
            virtCmd,
            virtProcessName,
            escapeMode,
            escapeCmd,
            processHash);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventProcessResponseInfo {\n");
        sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
        sb.append("    processPath: ").append(toIndentedString(processPath)).append("\n");
        sb.append("    processPid: ").append(toIndentedString(processPid)).append("\n");
        sb.append("    processUid: ").append(toIndentedString(processUid)).append("\n");
        sb.append("    processUsername: ").append(toIndentedString(processUsername)).append("\n");
        sb.append("    processCmdline: ").append(toIndentedString(processCmdline)).append("\n");
        sb.append("    processFilename: ").append(toIndentedString(processFilename)).append("\n");
        sb.append("    processStartTime: ").append(toIndentedString(processStartTime)).append("\n");
        sb.append("    processGid: ").append(toIndentedString(processGid)).append("\n");
        sb.append("    processEgid: ").append(toIndentedString(processEgid)).append("\n");
        sb.append("    processEuid: ").append(toIndentedString(processEuid)).append("\n");
        sb.append("    parentProcessName: ").append(toIndentedString(parentProcessName)).append("\n");
        sb.append("    parentProcessPath: ").append(toIndentedString(parentProcessPath)).append("\n");
        sb.append("    parentProcessPid: ").append(toIndentedString(parentProcessPid)).append("\n");
        sb.append("    parentProcessUid: ").append(toIndentedString(parentProcessUid)).append("\n");
        sb.append("    parentProcessCmdline: ").append(toIndentedString(parentProcessCmdline)).append("\n");
        sb.append("    parentProcessFilename: ").append(toIndentedString(parentProcessFilename)).append("\n");
        sb.append("    parentProcessStartTime: ").append(toIndentedString(parentProcessStartTime)).append("\n");
        sb.append("    parentProcessGid: ").append(toIndentedString(parentProcessGid)).append("\n");
        sb.append("    parentProcessEgid: ").append(toIndentedString(parentProcessEgid)).append("\n");
        sb.append("    parentProcessEuid: ").append(toIndentedString(parentProcessEuid)).append("\n");
        sb.append("    childProcessName: ").append(toIndentedString(childProcessName)).append("\n");
        sb.append("    childProcessPath: ").append(toIndentedString(childProcessPath)).append("\n");
        sb.append("    childProcessPid: ").append(toIndentedString(childProcessPid)).append("\n");
        sb.append("    childProcessUid: ").append(toIndentedString(childProcessUid)).append("\n");
        sb.append("    childProcessCmdline: ").append(toIndentedString(childProcessCmdline)).append("\n");
        sb.append("    childProcessFilename: ").append(toIndentedString(childProcessFilename)).append("\n");
        sb.append("    childProcessStartTime: ").append(toIndentedString(childProcessStartTime)).append("\n");
        sb.append("    childProcessGid: ").append(toIndentedString(childProcessGid)).append("\n");
        sb.append("    childProcessEgid: ").append(toIndentedString(childProcessEgid)).append("\n");
        sb.append("    childProcessEuid: ").append(toIndentedString(childProcessEuid)).append("\n");
        sb.append("    virtCmd: ").append(toIndentedString(virtCmd)).append("\n");
        sb.append("    virtProcessName: ").append(toIndentedString(virtProcessName)).append("\n");
        sb.append("    escapeMode: ").append(toIndentedString(escapeMode)).append("\n");
        sb.append("    escapeCmd: ").append(toIndentedString(escapeCmd)).append("\n");
        sb.append("    processHash: ").append(toIndentedString(processHash)).append("\n");
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
