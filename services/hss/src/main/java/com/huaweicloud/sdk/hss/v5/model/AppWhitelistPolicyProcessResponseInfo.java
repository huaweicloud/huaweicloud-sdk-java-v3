package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 策略识别进程信息
 */
public class AppWhitelistPolicyProcessResponseInfo {

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
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specified_path")

    private String specifiedPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmdline")

    private String cmdline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Long fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_signer")

    private String fileSigner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_type")

    private Integer processType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private String appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whitelist_count")

    private Integer whitelistCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blacklist_count")

    private Integer blacklistCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_status_source")

    private Integer trustStatusSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private String processStatus;

    public AppWhitelistPolicyProcessResponseInfo withProcessName(String processName) {
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

    public AppWhitelistPolicyProcessResponseInfo withProcessPath(String processPath) {
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

    public AppWhitelistPolicyProcessResponseInfo withProcessHash(String processHash) {
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

    public AppWhitelistPolicyProcessResponseInfo withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * **参数解释**： 处理方式 **取值范围**: - confirmed：已确认 - unconfirmed：未确认 
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public AppWhitelistPolicyProcessResponseInfo withSpecifiedPath(String specifiedPath) {
        this.specifiedPath = specifiedPath;
        return this;
    }

    /**
     * **参数解释**： 指定目录 **取值范围**： 字符长度1-512位 
     * @return specifiedPath
     */
    public String getSpecifiedPath() {
        return specifiedPath;
    }

    public void setSpecifiedPath(String specifiedPath) {
        this.specifiedPath = specifiedPath;
    }

    public AppWhitelistPolicyProcessResponseInfo withCmdline(String cmdline) {
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

    public AppWhitelistPolicyProcessResponseInfo withFileSize(Long fileSize) {
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

    public AppWhitelistPolicyProcessResponseInfo withFileSigner(String fileSigner) {
        this.fileSigner = fileSigner;
        return this;
    }

    /**
     * **参数解释**： 文件签名 **取值范围**： 字符长度1-128位 
     * @return fileSigner
     */
    public String getFileSigner() {
        return fileSigner;
    }

    public void setFileSigner(String fileSigner) {
        this.fileSigner = fileSigner;
    }

    public AppWhitelistPolicyProcessResponseInfo withProcessType(Integer processType) {
        this.processType = processType;
        return this;
    }

    /**
     * **参数解释**： 进程类型 **约束限制**: 不涉及 **取值范围**: - 1：系统程序 - 2：解释类程序 - 3：普通可执行程序 
     * @return processType
     */
    public Integer getProcessType() {
        return processType;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public AppWhitelistPolicyProcessResponseInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，包含如下2种。   - Linux ：Linux。   - Windows ：Windows。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public AppWhitelistPolicyProcessResponseInfo withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    /**
     * **参数解释**： 应用类型 **约束限制**： 不涉及 
     * @return appType
     */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public AppWhitelistPolicyProcessResponseInfo withWhitelistCount(Integer whitelistCount) {
        this.whitelistCount = whitelistCount;
        return this;
    }

    /**
     * **参数解释**: 白名单确认次数 **约束限制**: 不涉及 
     * minimum: 0
     * maximum: 2147483647
     * @return whitelistCount
     */
    public Integer getWhitelistCount() {
        return whitelistCount;
    }

    public void setWhitelistCount(Integer whitelistCount) {
        this.whitelistCount = whitelistCount;
    }

    public AppWhitelistPolicyProcessResponseInfo withBlacklistCount(Integer blacklistCount) {
        this.blacklistCount = blacklistCount;
        return this;
    }

    /**
     * **参数解释**: 黑名单确认次数 **约束限制**: 不涉及 
     * minimum: 0
     * maximum: 2147483647
     * @return blacklistCount
     */
    public Integer getBlacklistCount() {
        return blacklistCount;
    }

    public void setBlacklistCount(Integer blacklistCount) {
        this.blacklistCount = blacklistCount;
    }

    public AppWhitelistPolicyProcessResponseInfo withTrustStatusSource(Integer trustStatusSource) {
        this.trustStatusSource = trustStatusSource;
        return this;
    }

    /**
     * **参数解释**： 进程可信状态 **约束限制**: 不涉及 **取值范围**: - 0：情报 - 1：恶意软件 - 2：人工确认 - 3：自学习  **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 3
     * @return trustStatusSource
     */
    public Integer getTrustStatusSource() {
        return trustStatusSource;
    }

    public void setTrustStatusSource(Integer trustStatusSource) {
        this.trustStatusSource = trustStatusSource;
    }

    public AppWhitelistPolicyProcessResponseInfo withProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * **参数解释**： 进程可信状态 **约束限制**: 不涉及 **取值范围**: - trust：可信 - suspicious：可疑 - malicious：恶意 - unknown：未知  **默认取值**: 不涉及 
     * @return processStatus
     */
    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppWhitelistPolicyProcessResponseInfo that = (AppWhitelistPolicyProcessResponseInfo) obj;
        return Objects.equals(this.processName, that.processName) && Objects.equals(this.processPath, that.processPath)
            && Objects.equals(this.processHash, that.processHash)
            && Objects.equals(this.handleStatus, that.handleStatus)
            && Objects.equals(this.specifiedPath, that.specifiedPath) && Objects.equals(this.cmdline, that.cmdline)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.fileSigner, that.fileSigner)
            && Objects.equals(this.processType, that.processType) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.appType, that.appType) && Objects.equals(this.whitelistCount, that.whitelistCount)
            && Objects.equals(this.blacklistCount, that.blacklistCount)
            && Objects.equals(this.trustStatusSource, that.trustStatusSource)
            && Objects.equals(this.processStatus, that.processStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processName,
            processPath,
            processHash,
            handleStatus,
            specifiedPath,
            cmdline,
            fileSize,
            fileSigner,
            processType,
            osType,
            appType,
            whitelistCount,
            blacklistCount,
            trustStatusSource,
            processStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppWhitelistPolicyProcessResponseInfo {\n");
        sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
        sb.append("    processPath: ").append(toIndentedString(processPath)).append("\n");
        sb.append("    processHash: ").append(toIndentedString(processHash)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    specifiedPath: ").append(toIndentedString(specifiedPath)).append("\n");
        sb.append("    cmdline: ").append(toIndentedString(cmdline)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileSigner: ").append(toIndentedString(fileSigner)).append("\n");
        sb.append("    processType: ").append(toIndentedString(processType)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    whitelistCount: ").append(toIndentedString(whitelistCount)).append("\n");
        sb.append("    blacklistCount: ").append(toIndentedString(blacklistCount)).append("\n");
        sb.append("    trustStatusSource: ").append(toIndentedString(trustStatusSource)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
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
