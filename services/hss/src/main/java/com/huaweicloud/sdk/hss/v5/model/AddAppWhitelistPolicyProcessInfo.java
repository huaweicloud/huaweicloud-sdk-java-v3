package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 策略识别进程信息
 */
public class AddAppWhitelistPolicyProcessInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_name")

    private String processName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_path")

    private String processPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_hash")

    private String processHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmdline")

    private String cmdline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Long fileSize;

    public AddAppWhitelistPolicyProcessInfo withProcessName(String processName) {
        this.processName = processName;
        return this;
    }

    /**
     * **参数解释**： 进程名称 **取值范围**： 字符长度1-128位 
     * @return processName
     */
    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public AddAppWhitelistPolicyProcessInfo withProcessPath(String processPath) {
        this.processPath = processPath;
        return this;
    }

    /**
     * **参数解释**： 进程路径 **取值范围**： 字符长度1-256位 
     * @return processPath
     */
    public String getProcessPath() {
        return processPath;
    }

    public void setProcessPath(String processPath) {
        this.processPath = processPath;
    }

    public AddAppWhitelistPolicyProcessInfo withProcessHash(String processHash) {
        this.processHash = processHash;
        return this;
    }

    /**
     * 进程hash
     * @return processHash
     */
    public String getProcessHash() {
        return processHash;
    }

    public void setProcessHash(String processHash) {
        this.processHash = processHash;
    }

    public AddAppWhitelistPolicyProcessInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**: 容器ID **取值范围**: 字符长度1-128位 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public AddAppWhitelistPolicyProcessInfo withCmdline(String cmdline) {
        this.cmdline = cmdline;
        return this;
    }

    /**
     * **参数解释**： 进程命令行 **约束限制**： 不涉及 
     * @return cmdline
     */
    public String getCmdline() {
        return cmdline;
    }

    public void setCmdline(String cmdline) {
        this.cmdline = cmdline;
    }

    public AddAppWhitelistPolicyProcessInfo withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * **参数解释**: 文件大小 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值9223372036854775807 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return fileSize
     */
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddAppWhitelistPolicyProcessInfo that = (AddAppWhitelistPolicyProcessInfo) obj;
        return Objects.equals(this.processName, that.processName) && Objects.equals(this.processPath, that.processPath)
            && Objects.equals(this.processHash, that.processHash) && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.cmdline, that.cmdline) && Objects.equals(this.fileSize, that.fileSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processName, processPath, processHash, containerId, cmdline, fileSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddAppWhitelistPolicyProcessInfo {\n");
        sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
        sb.append("    processPath: ").append(toIndentedString(processPath)).append("\n");
        sb.append("    processHash: ").append(toIndentedString(processHash)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    cmdline: ").append(toIndentedString(cmdline)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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
