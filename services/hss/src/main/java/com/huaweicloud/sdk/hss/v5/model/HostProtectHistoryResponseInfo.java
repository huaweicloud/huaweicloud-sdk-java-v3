package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HostProtectHistoryResponseInfo
 */
public class HostProtectHistoryResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occr_time")

    private Long occrTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occur_time")

    private Long occurTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_operation")

    private String fileOperation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_id")

    private Integer processId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_name")

    private String processName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_cmd")

    private String processCmd;

    public HostProtectHistoryResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public HostProtectHistoryResponseInfo withOccrTime(Long occrTime) {
        this.occrTime = occrTime;
        return this;
    }

    /**
     * **参数解释**: 检测时间，单位毫秒。（已废弃，请使用occur_time） **取值范围**: 最小值0，最大值4070880000000 
     * minimum: 0
     * maximum: 4070880000000
     * @return occrTime
     */
    public Long getOccrTime() {
        return occrTime;
    }

    public void setOccrTime(Long occrTime) {
        this.occrTime = occrTime;
    }

    public HostProtectHistoryResponseInfo withOccurTime(Long occurTime) {
        this.occurTime = occurTime;
        return this;
    }

    /**
     * **参数解释**: 检测时间，单位毫秒。 **取值范围**: 最小值0，最大值4070880000000 
     * minimum: 0
     * maximum: 4070880000000
     * @return occurTime
     */
    public Long getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Long occurTime) {
        this.occurTime = occurTime;
    }

    public HostProtectHistoryResponseInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释**： 防护文件路径 **取值范围**： 字符长度0-2000位 
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public HostProtectHistoryResponseInfo withFileOperation(String fileOperation) {
        this.fileOperation = fileOperation;
        return this;
    }

    /**
     * **参数解释**: 事件描述，即文件操作类型 **取值范围**: - add: 新增文件。 - delete: 删除文件。 - modify: 修改文件内容。 - attribute: 修改文件属性。 - unknown: 未知。 
     * @return fileOperation
     */
    public String getFileOperation() {
        return fileOperation;
    }

    public void setFileOperation(String fileOperation) {
        this.fileOperation = fileOperation;
    }

    public HostProtectHistoryResponseInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * **参数解释**: 服务器IP **取值范围**: 字符长度0-64位 
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public HostProtectHistoryResponseInfo withProcessId(Integer processId) {
        this.processId = processId;
        return this;
    }

    /**
     * **参数解释**: 进程ID **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return processId
     */
    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public HostProtectHistoryResponseInfo withProcessName(String processName) {
        this.processName = processName;
        return this;
    }

    /**
     * **参数解释**: 进程名称 **取值范围**: 字符长度0-200位 
     * @return processName
     */
    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public HostProtectHistoryResponseInfo withProcessCmd(String processCmd) {
        this.processCmd = processCmd;
        return this;
    }

    /**
     * **参数解释**: 进程命令行 **取值范围**: 字符长度0-8192位 
     * @return processCmd
     */
    public String getProcessCmd() {
        return processCmd;
    }

    public void setProcessCmd(String processCmd) {
        this.processCmd = processCmd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostProtectHistoryResponseInfo that = (HostProtectHistoryResponseInfo) obj;
        return Objects.equals(this.hostName, that.hostName) && Objects.equals(this.occrTime, that.occrTime)
            && Objects.equals(this.occurTime, that.occurTime) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.fileOperation, that.fileOperation) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.processId, that.processId) && Objects.equals(this.processName, that.processName)
            && Objects.equals(this.processCmd, that.processCmd);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(hostName, occrTime, occurTime, filePath, fileOperation, hostIp, processId, processName, processCmd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostProtectHistoryResponseInfo {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    occrTime: ").append(toIndentedString(occrTime)).append("\n");
        sb.append("    occurTime: ").append(toIndentedString(occurTime)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileOperation: ").append(toIndentedString(fileOperation)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
        sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
        sb.append("    processCmd: ").append(toIndentedString(processCmd)).append("\n");
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
