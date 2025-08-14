package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddProtectionPolicyInfoRequestInfo
 */
public class AddProtectionPolicyInfoRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_mode")

    private String protectionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_mode")

    private String deployMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_directory")

    private String protectionDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_type")

    private String protectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_directory")

    private String excludeDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_system")

    private String operatingSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_whitelist")

    private List<TrustProcessInfo> processWhitelist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_protection_status")

    private String aiProtectionStatus;

    public AddProtectionPolicyInfoRequestInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public AddProtectionPolicyInfoRequestInfo withProtectionMode(String protectionMode) {
        this.protectionMode = protectionMode;
        return this;
    }

    /**
     * 防护动作，包含如下2种。   - alarm_and_isolation ：告警并自动隔离。   - alarm_only ：仅告警。
     * @return protectionMode
     */
    public String getProtectionMode() {
        return protectionMode;
    }

    public void setProtectionMode(String protectionMode) {
        this.protectionMode = protectionMode;
    }

    public AddProtectionPolicyInfoRequestInfo withDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }

    /**
     * 是否开启动态诱饵，包含如下2种，默认为关闭防护动态诱饵防护。   - opened ：开启。   - closed ：关闭。
     * @return deployMode
     */
    public String getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(String deployMode) {
        this.deployMode = deployMode;
    }

    public AddProtectionPolicyInfoRequestInfo withProtectionDirectory(String protectionDirectory) {
        this.protectionDirectory = protectionDirectory;
        return this;
    }

    /**
     * 防护目录，多个目录请用英文分号隔开，最多支持填写20个防护目录
     * @return protectionDirectory
     */
    public String getProtectionDirectory() {
        return protectionDirectory;
    }

    public void setProtectionDirectory(String protectionDirectory) {
        this.protectionDirectory = protectionDirectory;
    }

    public AddProtectionPolicyInfoRequestInfo withProtectionType(String protectionType) {
        this.protectionType = protectionType;
        return this;
    }

    /**
     * 防护文件类型，例如：docx，txt，avi
     * @return protectionType
     */
    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }

    public AddProtectionPolicyInfoRequestInfo withExcludeDirectory(String excludeDirectory) {
        this.excludeDirectory = excludeDirectory;
        return this;
    }

    /**
     * 排除目录(选填)，多个目录请用英文分号隔开，最多支持填写20个排除目录
     * @return excludeDirectory
     */
    public String getExcludeDirectory() {
        return excludeDirectory;
    }

    public void setExcludeDirectory(String excludeDirectory) {
        this.excludeDirectory = excludeDirectory;
    }

    public AddProtectionPolicyInfoRequestInfo withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * 操作系统，包含如下：   - Windows : Windows系统   - Linux : Linux系统
     * @return operatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public AddProtectionPolicyInfoRequestInfo withProcessWhitelist(List<TrustProcessInfo> processWhitelist) {
        this.processWhitelist = processWhitelist;
        return this;
    }

    public AddProtectionPolicyInfoRequestInfo addProcessWhitelistItem(TrustProcessInfo processWhitelistItem) {
        if (this.processWhitelist == null) {
            this.processWhitelist = new ArrayList<>();
        }
        this.processWhitelist.add(processWhitelistItem);
        return this;
    }

    public AddProtectionPolicyInfoRequestInfo withProcessWhitelist(
        Consumer<List<TrustProcessInfo>> processWhitelistSetter) {
        if (this.processWhitelist == null) {
            this.processWhitelist = new ArrayList<>();
        }
        processWhitelistSetter.accept(this.processWhitelist);
        return this;
    }

    /**
     * 进程白名单
     * @return processWhitelist
     */
    public List<TrustProcessInfo> getProcessWhitelist() {
        return processWhitelist;
    }

    public void setProcessWhitelist(List<TrustProcessInfo> processWhitelist) {
        this.processWhitelist = processWhitelist;
    }

    public AddProtectionPolicyInfoRequestInfo withAiProtectionStatus(String aiProtectionStatus) {
        this.aiProtectionStatus = aiProtectionStatus;
        return this;
    }

    /**
     * 是否开启AI勒索防护，包含如下2种，默认为关闭AI勒索防护，当前只支持Windows防护策略   - opened ：开启。   - closed ：关闭。
     * @return aiProtectionStatus
     */
    public String getAiProtectionStatus() {
        return aiProtectionStatus;
    }

    public void setAiProtectionStatus(String aiProtectionStatus) {
        this.aiProtectionStatus = aiProtectionStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddProtectionPolicyInfoRequestInfo that = (AddProtectionPolicyInfoRequestInfo) obj;
        return Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.protectionMode, that.protectionMode)
            && Objects.equals(this.deployMode, that.deployMode)
            && Objects.equals(this.protectionDirectory, that.protectionDirectory)
            && Objects.equals(this.protectionType, that.protectionType)
            && Objects.equals(this.excludeDirectory, that.excludeDirectory)
            && Objects.equals(this.operatingSystem, that.operatingSystem)
            && Objects.equals(this.processWhitelist, that.processWhitelist)
            && Objects.equals(this.aiProtectionStatus, that.aiProtectionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName,
            protectionMode,
            deployMode,
            protectionDirectory,
            protectionType,
            excludeDirectory,
            operatingSystem,
            processWhitelist,
            aiProtectionStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddProtectionPolicyInfoRequestInfo {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    protectionMode: ").append(toIndentedString(protectionMode)).append("\n");
        sb.append("    deployMode: ").append(toIndentedString(deployMode)).append("\n");
        sb.append("    protectionDirectory: ").append(toIndentedString(protectionDirectory)).append("\n");
        sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
        sb.append("    excludeDirectory: ").append(toIndentedString(excludeDirectory)).append("\n");
        sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
        sb.append("    processWhitelist: ").append(toIndentedString(processWhitelist)).append("\n");
        sb.append("    aiProtectionStatus: ").append(toIndentedString(aiProtectionStatus)).append("\n");
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
