package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 进程链取证信息
 */
public class ProcessForensicInfo {

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
    @JsonProperty(value = "process_gid")

    private Integer processGid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_egid")

    private Integer processEgid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_euid")

    private Integer processEuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_username")

    private String processUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_cmdline")

    private String processCmdline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_start_time")

    private Long processStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_file_hash")

    private String processFileHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ancestor_process_pid")

    private Integer ancestorProcessPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ancestor_process_cmdline")

    private String ancestorProcessCmdline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ancestor_process_path")

    private String ancestorProcessPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private Integer sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_num")

    private Integer eventNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ProcessForensicInfo withProcessName(String processName) {
        this.processName = processName;
        return this;
    }

    /**
     * **参数解释**： 进程名称 **取值范围**： 不涉及
     * @return processName
     */
    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public ProcessForensicInfo withProcessPath(String processPath) {
        this.processPath = processPath;
        return this;
    }

    /**
     * **参数解释**： 进程文件路径 **取值范围**： 不涉及
     * @return processPath
     */
    public String getProcessPath() {
        return processPath;
    }

    public void setProcessPath(String processPath) {
        this.processPath = processPath;
    }

    public ProcessForensicInfo withProcessPid(Integer processPid) {
        this.processPid = processPid;
        return this;
    }

    /**
     * **参数解释**： 进程id **取值范围**： 不涉及
     * @return processPid
     */
    public Integer getProcessPid() {
        return processPid;
    }

    public void setProcessPid(Integer processPid) {
        this.processPid = processPid;
    }

    public ProcessForensicInfo withProcessUid(Integer processUid) {
        this.processUid = processUid;
        return this;
    }

    /**
     * **参数解释**： 进程用户id **取值范围**： 不涉及
     * @return processUid
     */
    public Integer getProcessUid() {
        return processUid;
    }

    public void setProcessUid(Integer processUid) {
        this.processUid = processUid;
    }

    public ProcessForensicInfo withProcessGid(Integer processGid) {
        this.processGid = processGid;
        return this;
    }

    /**
     * **参数解释**： 进程组id **取值范围**： 不涉及
     * @return processGid
     */
    public Integer getProcessGid() {
        return processGid;
    }

    public void setProcessGid(Integer processGid) {
        this.processGid = processGid;
    }

    public ProcessForensicInfo withProcessEgid(Integer processEgid) {
        this.processEgid = processEgid;
        return this;
    }

    /**
     * **参数解释**： 进程有效组id **取值范围**： 不涉及
     * @return processEgid
     */
    public Integer getProcessEgid() {
        return processEgid;
    }

    public void setProcessEgid(Integer processEgid) {
        this.processEgid = processEgid;
    }

    public ProcessForensicInfo withProcessEuid(Integer processEuid) {
        this.processEuid = processEuid;
        return this;
    }

    /**
     * **参数解释**： 进程有效用户id **取值范围**： 不涉及
     * @return processEuid
     */
    public Integer getProcessEuid() {
        return processEuid;
    }

    public void setProcessEuid(Integer processEuid) {
        this.processEuid = processEuid;
    }

    public ProcessForensicInfo withProcessUsername(String processUsername) {
        this.processUsername = processUsername;
        return this;
    }

    /**
     * **参数解释**： 运行进程的用户名 **取值范围**： 不涉及
     * @return processUsername
     */
    public String getProcessUsername() {
        return processUsername;
    }

    public void setProcessUsername(String processUsername) {
        this.processUsername = processUsername;
    }

    public ProcessForensicInfo withProcessCmdline(String processCmdline) {
        this.processCmdline = processCmdline;
        return this;
    }

    /**
     * **参数解释**： 进程文件命令行 **取值范围**： 不涉及
     * @return processCmdline
     */
    public String getProcessCmdline() {
        return processCmdline;
    }

    public void setProcessCmdline(String processCmdline) {
        this.processCmdline = processCmdline;
    }

    public ProcessForensicInfo withProcessStartTime(Long processStartTime) {
        this.processStartTime = processStartTime;
        return this;
    }

    /**
     * **参数解释**： 进程启动时间 **取值范围**： 不涉及
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

    public ProcessForensicInfo withProcessFileHash(String processFileHash) {
        this.processFileHash = processFileHash;
        return this;
    }

    /**
     * **参数解释**： 进程文件hash **取值范围**： 不涉及
     * @return processFileHash
     */
    public String getProcessFileHash() {
        return processFileHash;
    }

    public void setProcessFileHash(String processFileHash) {
        this.processFileHash = processFileHash;
    }

    public ProcessForensicInfo withAncestorProcessPid(Integer ancestorProcessPid) {
        this.ancestorProcessPid = ancestorProcessPid;
        return this;
    }

    /**
     * **参数解释**： 祖父进程id **取值范围**： 不涉及
     * @return ancestorProcessPid
     */
    public Integer getAncestorProcessPid() {
        return ancestorProcessPid;
    }

    public void setAncestorProcessPid(Integer ancestorProcessPid) {
        this.ancestorProcessPid = ancestorProcessPid;
    }

    public ProcessForensicInfo withAncestorProcessCmdline(String ancestorProcessCmdline) {
        this.ancestorProcessCmdline = ancestorProcessCmdline;
        return this;
    }

    /**
     * **参数解释**： 祖父进程命令行 **取值范围**： 不涉及
     * @return ancestorProcessCmdline
     */
    public String getAncestorProcessCmdline() {
        return ancestorProcessCmdline;
    }

    public void setAncestorProcessCmdline(String ancestorProcessCmdline) {
        this.ancestorProcessCmdline = ancestorProcessCmdline;
    }

    public ProcessForensicInfo withAncestorProcessPath(String ancestorProcessPath) {
        this.ancestorProcessPath = ancestorProcessPath;
        return this;
    }

    /**
     * **参数解释**： 祖父进程路径 **取值范围**： 不涉及
     * @return ancestorProcessPath
     */
    public String getAncestorProcessPath() {
        return ancestorProcessPath;
    }

    public void setAncestorProcessPath(String ancestorProcessPath) {
        this.ancestorProcessPath = ancestorProcessPath;
    }

    public ProcessForensicInfo withSessionId(Integer sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**： 会话id **取值范围**： 不涉及
     * @return sessionId
     */
    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public ProcessForensicInfo withEventNum(Integer eventNum) {
        this.eventNum = eventNum;
        return this;
    }

    /**
     * **参数解释**： 威胁事件数 **取值范围**： 不涉及
     * @return eventNum
     */
    public Integer getEventNum() {
        return eventNum;
    }

    public void setEventNum(Integer eventNum) {
        this.eventNum = eventNum;
    }

    public ProcessForensicInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 节点类型 **取值范围**： - 0：进程 - 1：注册表 - 2：文件
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessForensicInfo that = (ProcessForensicInfo) obj;
        return Objects.equals(this.processName, that.processName) && Objects.equals(this.processPath, that.processPath)
            && Objects.equals(this.processPid, that.processPid) && Objects.equals(this.processUid, that.processUid)
            && Objects.equals(this.processGid, that.processGid) && Objects.equals(this.processEgid, that.processEgid)
            && Objects.equals(this.processEuid, that.processEuid)
            && Objects.equals(this.processUsername, that.processUsername)
            && Objects.equals(this.processCmdline, that.processCmdline)
            && Objects.equals(this.processStartTime, that.processStartTime)
            && Objects.equals(this.processFileHash, that.processFileHash)
            && Objects.equals(this.ancestorProcessPid, that.ancestorProcessPid)
            && Objects.equals(this.ancestorProcessCmdline, that.ancestorProcessCmdline)
            && Objects.equals(this.ancestorProcessPath, that.ancestorProcessPath)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.eventNum, that.eventNum)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processName,
            processPath,
            processPid,
            processUid,
            processGid,
            processEgid,
            processEuid,
            processUsername,
            processCmdline,
            processStartTime,
            processFileHash,
            ancestorProcessPid,
            ancestorProcessCmdline,
            ancestorProcessPath,
            sessionId,
            eventNum,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessForensicInfo {\n");
        sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
        sb.append("    processPath: ").append(toIndentedString(processPath)).append("\n");
        sb.append("    processPid: ").append(toIndentedString(processPid)).append("\n");
        sb.append("    processUid: ").append(toIndentedString(processUid)).append("\n");
        sb.append("    processGid: ").append(toIndentedString(processGid)).append("\n");
        sb.append("    processEgid: ").append(toIndentedString(processEgid)).append("\n");
        sb.append("    processEuid: ").append(toIndentedString(processEuid)).append("\n");
        sb.append("    processUsername: ").append(toIndentedString(processUsername)).append("\n");
        sb.append("    processCmdline: ").append(toIndentedString(processCmdline)).append("\n");
        sb.append("    processStartTime: ").append(toIndentedString(processStartTime)).append("\n");
        sb.append("    processFileHash: ").append(toIndentedString(processFileHash)).append("\n");
        sb.append("    ancestorProcessPid: ").append(toIndentedString(ancestorProcessPid)).append("\n");
        sb.append("    ancestorProcessCmdline: ").append(toIndentedString(ancestorProcessCmdline)).append("\n");
        sb.append("    ancestorProcessPath: ").append(toIndentedString(ancestorProcessPath)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    eventNum: ").append(toIndentedString(eventNum)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
