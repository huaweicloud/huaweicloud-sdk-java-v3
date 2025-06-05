package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProtectionPolicyInfo
 */
public class ProtectionPolicyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_mode")

    private String protectionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bait_protection_status")

    private String baitProtectionStatus;

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
    @JsonProperty(value = "runtime_detection_status")

    private String runtimeDetectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_detection_directory")

    private String runtimeDetectionDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_associated_server")

    private Integer countAssociatedServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_system")

    private String operatingSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_whitelist")

    private List<TrustProcessInfo> processWhitelist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_policy")

    private Integer defaultPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_protection_status")

    private String aiProtectionStatus;

    public ProtectionPolicyInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释**: 策略ID **取值范围**: 字符长度0-128 
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ProtectionPolicyInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * **参数解释**: 防护策略名称 **取值范围**: 字符长度1-128 
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ProtectionPolicyInfo withProtectionMode(String protectionMode) {
        this.protectionMode = protectionMode;
        return this;
    }

    /**
     * **参数解释**: 防护动作，包含如下2种。   - alarm_and_isolation ：告警并自动隔离。   - alarm_only ：仅告警。 **取值范围**: 字符长度0-128
     * @return protectionMode
     */
    public String getProtectionMode() {
        return protectionMode;
    }

    public void setProtectionMode(String protectionMode) {
        this.protectionMode = protectionMode;
    }

    public ProtectionPolicyInfo withBaitProtectionStatus(String baitProtectionStatus) {
        this.baitProtectionStatus = baitProtectionStatus;
        return this;
    }

    /**
     * **参数解释**: 是否开启诱饵防护，包含如下1种, 默认为开启防护诱饵防护。   - opened ：开启。   - closed ：关闭。  **取值范围**: 字符长度0-128
     * @return baitProtectionStatus
     */
    public String getBaitProtectionStatus() {
        return baitProtectionStatus;
    }

    public void setBaitProtectionStatus(String baitProtectionStatus) {
        this.baitProtectionStatus = baitProtectionStatus;
    }

    public ProtectionPolicyInfo withDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }

    /**
     * **参数解释**: 是否开启动态诱饵防护，包含如下2种, 默认为关闭动态诱饵防护。   - opened ：开启。   - closed ：关闭。   **取值范围**: 字符长度0-128
     * @return deployMode
     */
    public String getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(String deployMode) {
        this.deployMode = deployMode;
    }

    public ProtectionPolicyInfo withProtectionDirectory(String protectionDirectory) {
        this.protectionDirectory = protectionDirectory;
        return this;
    }

    /**
     * **参数解释**: 防护目录 **取值范围**: 字符长度1-128 
     * @return protectionDirectory
     */
    public String getProtectionDirectory() {
        return protectionDirectory;
    }

    public void setProtectionDirectory(String protectionDirectory) {
        this.protectionDirectory = protectionDirectory;
    }

    public ProtectionPolicyInfo withProtectionType(String protectionType) {
        this.protectionType = protectionType;
        return this;
    }

    /**
     * **参数解释**: 防护文件类型，例如：docx，txt，avi **取值范围**: 字符长度1-128 
     * @return protectionType
     */
    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }

    public ProtectionPolicyInfo withExcludeDirectory(String excludeDirectory) {
        this.excludeDirectory = excludeDirectory;
        return this;
    }

    /**
     * **参数解释**: 排除目录，选填 **取值范围**: 字符长度1-128 
     * @return excludeDirectory
     */
    public String getExcludeDirectory() {
        return excludeDirectory;
    }

    public void setExcludeDirectory(String excludeDirectory) {
        this.excludeDirectory = excludeDirectory;
    }

    public ProtectionPolicyInfo withRuntimeDetectionStatus(String runtimeDetectionStatus) {
        this.runtimeDetectionStatus = runtimeDetectionStatus;
        return this;
    }

    /**
     * **参数解释**: 是否运行时检测，包含如下2种，暂时只有关闭一种状态，为保留字段。   - opened ：开启。   - closed ：关闭。 **取值范围**: 字符长度0-128
     * @return runtimeDetectionStatus
     */
    public String getRuntimeDetectionStatus() {
        return runtimeDetectionStatus;
    }

    public void setRuntimeDetectionStatus(String runtimeDetectionStatus) {
        this.runtimeDetectionStatus = runtimeDetectionStatus;
    }

    public ProtectionPolicyInfo withRuntimeDetectionDirectory(String runtimeDetectionDirectory) {
        this.runtimeDetectionDirectory = runtimeDetectionDirectory;
        return this;
    }

    /**
     * **参数解释**: 运行时检测目录，现在为保留字段 **取值范围**: 字符长度1-128
     * @return runtimeDetectionDirectory
     */
    public String getRuntimeDetectionDirectory() {
        return runtimeDetectionDirectory;
    }

    public void setRuntimeDetectionDirectory(String runtimeDetectionDirectory) {
        this.runtimeDetectionDirectory = runtimeDetectionDirectory;
    }

    public ProtectionPolicyInfo withCountAssociatedServer(Integer countAssociatedServer) {
        this.countAssociatedServer = countAssociatedServer;
        return this;
    }

    /**
     * **参数解释**: 关联server个数 **取值范围**: 取值范围0-2097152
     * minimum: 0
     * maximum: 2097152
     * @return countAssociatedServer
     */
    public Integer getCountAssociatedServer() {
        return countAssociatedServer;
    }

    public void setCountAssociatedServer(Integer countAssociatedServer) {
        this.countAssociatedServer = countAssociatedServer;
    }

    public ProtectionPolicyInfo withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * **参数解释**: 操作系统类型。 - Linux - Windows **取值范围**: 字符长度1-128
     * @return operatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public ProtectionPolicyInfo withProcessWhitelist(List<TrustProcessInfo> processWhitelist) {
        this.processWhitelist = processWhitelist;
        return this;
    }

    public ProtectionPolicyInfo addProcessWhitelistItem(TrustProcessInfo processWhitelistItem) {
        if (this.processWhitelist == null) {
            this.processWhitelist = new ArrayList<>();
        }
        this.processWhitelist.add(processWhitelistItem);
        return this;
    }

    public ProtectionPolicyInfo withProcessWhitelist(Consumer<List<TrustProcessInfo>> processWhitelistSetter) {
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

    public ProtectionPolicyInfo withDefaultPolicy(Integer defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
        return this;
    }

    /**
     * **参数解释**: 是否为默认策略，包含如下2种。   - 0 ：非默认策略。   - 1 ：默认策略 **取值范围**: 取值大小0-10
     * minimum: 0
     * maximum: 10
     * @return defaultPolicy
     */
    public Integer getDefaultPolicy() {
        return defaultPolicy;
    }

    public void setDefaultPolicy(Integer defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
    }

    public ProtectionPolicyInfo withAiProtectionStatus(String aiProtectionStatus) {
        this.aiProtectionStatus = aiProtectionStatus;
        return this;
    }

    /**
     * **参数解释**: 是否开启AI勒索防护，包含如下1种, 默认为开启AI勒索防护。   - opened ：开启。   - closed ：关闭。  **取值范围**: 字符长度1-128
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
        ProtectionPolicyInfo that = (ProtectionPolicyInfo) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.protectionMode, that.protectionMode)
            && Objects.equals(this.baitProtectionStatus, that.baitProtectionStatus)
            && Objects.equals(this.deployMode, that.deployMode)
            && Objects.equals(this.protectionDirectory, that.protectionDirectory)
            && Objects.equals(this.protectionType, that.protectionType)
            && Objects.equals(this.excludeDirectory, that.excludeDirectory)
            && Objects.equals(this.runtimeDetectionStatus, that.runtimeDetectionStatus)
            && Objects.equals(this.runtimeDetectionDirectory, that.runtimeDetectionDirectory)
            && Objects.equals(this.countAssociatedServer, that.countAssociatedServer)
            && Objects.equals(this.operatingSystem, that.operatingSystem)
            && Objects.equals(this.processWhitelist, that.processWhitelist)
            && Objects.equals(this.defaultPolicy, that.defaultPolicy)
            && Objects.equals(this.aiProtectionStatus, that.aiProtectionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId,
            policyName,
            protectionMode,
            baitProtectionStatus,
            deployMode,
            protectionDirectory,
            protectionType,
            excludeDirectory,
            runtimeDetectionStatus,
            runtimeDetectionDirectory,
            countAssociatedServer,
            operatingSystem,
            processWhitelist,
            defaultPolicy,
            aiProtectionStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectionPolicyInfo {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    protectionMode: ").append(toIndentedString(protectionMode)).append("\n");
        sb.append("    baitProtectionStatus: ").append(toIndentedString(baitProtectionStatus)).append("\n");
        sb.append("    deployMode: ").append(toIndentedString(deployMode)).append("\n");
        sb.append("    protectionDirectory: ").append(toIndentedString(protectionDirectory)).append("\n");
        sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
        sb.append("    excludeDirectory: ").append(toIndentedString(excludeDirectory)).append("\n");
        sb.append("    runtimeDetectionStatus: ").append(toIndentedString(runtimeDetectionStatus)).append("\n");
        sb.append("    runtimeDetectionDirectory: ").append(toIndentedString(runtimeDetectionDirectory)).append("\n");
        sb.append("    countAssociatedServer: ").append(toIndentedString(countAssociatedServer)).append("\n");
        sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
        sb.append("    processWhitelist: ").append(toIndentedString(processWhitelist)).append("\n");
        sb.append("    defaultPolicy: ").append(toIndentedString(defaultPolicy)).append("\n");
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
