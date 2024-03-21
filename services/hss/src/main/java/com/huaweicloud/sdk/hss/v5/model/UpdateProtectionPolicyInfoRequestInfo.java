package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateProtectionPolicyInfoRequestInfo
 */
public class UpdateProtectionPolicyInfoRequestInfo {

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
    @JsonProperty(value = "protection_directory")

    private String protectionDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_type")

    private String protectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_directory")

    private String excludeDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id_list")

    private List<String> agentIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_system")

    private String operatingSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_detection_status")

    private String runtimeDetectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_whitelist")

    private List<TrustProcessInfo> processWhitelist = null;

    public UpdateProtectionPolicyInfoRequestInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdateProtectionPolicyInfoRequestInfo withPolicyName(String policyName) {
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

    public UpdateProtectionPolicyInfoRequestInfo withProtectionMode(String protectionMode) {
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

    public UpdateProtectionPolicyInfoRequestInfo withBaitProtectionStatus(String baitProtectionStatus) {
        this.baitProtectionStatus = baitProtectionStatus;
        return this;
    }

    /**
     * 是否开启诱饵防护，包含如下1种, 默认为开启防护诱饵防护。   - opened ：开启。   - closed ：关闭。
     * @return baitProtectionStatus
     */
    public String getBaitProtectionStatus() {
        return baitProtectionStatus;
    }

    public void setBaitProtectionStatus(String baitProtectionStatus) {
        this.baitProtectionStatus = baitProtectionStatus;
    }

    public UpdateProtectionPolicyInfoRequestInfo withProtectionDirectory(String protectionDirectory) {
        this.protectionDirectory = protectionDirectory;
        return this;
    }

    /**
     * 防护目录,多个目录请用英文分号隔开，最多支持填写20个防护目录
     * @return protectionDirectory
     */
    public String getProtectionDirectory() {
        return protectionDirectory;
    }

    public void setProtectionDirectory(String protectionDirectory) {
        this.protectionDirectory = protectionDirectory;
    }

    public UpdateProtectionPolicyInfoRequestInfo withProtectionType(String protectionType) {
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

    public UpdateProtectionPolicyInfoRequestInfo withExcludeDirectory(String excludeDirectory) {
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

    public UpdateProtectionPolicyInfoRequestInfo withAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
        return this;
    }

    public UpdateProtectionPolicyInfoRequestInfo addAgentIdListItem(String agentIdListItem) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        this.agentIdList.add(agentIdListItem);
        return this;
    }

    public UpdateProtectionPolicyInfoRequestInfo withAgentIdList(Consumer<List<String>> agentIdListSetter) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        agentIdListSetter.accept(this.agentIdList);
        return this;
    }

    /**
     * 开启了此勒索防护策略的agent的id列表
     * @return agentIdList
     */
    public List<String> getAgentIdList() {
        return agentIdList;
    }

    public void setAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
    }

    public UpdateProtectionPolicyInfoRequestInfo withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * 支持该策略的操作系统，包含如下：   - Windows : Windows系统   - Linux : Linux系统
     * @return operatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public UpdateProtectionPolicyInfoRequestInfo withRuntimeDetectionStatus(String runtimeDetectionStatus) {
        this.runtimeDetectionStatus = runtimeDetectionStatus;
        return this;
    }

    /**
     * 是否运行时检测，包含如下2种，暂时只有关闭一种状态，为保留字段。   - opened ：开启。   - closed ：关闭。
     * @return runtimeDetectionStatus
     */
    public String getRuntimeDetectionStatus() {
        return runtimeDetectionStatus;
    }

    public void setRuntimeDetectionStatus(String runtimeDetectionStatus) {
        this.runtimeDetectionStatus = runtimeDetectionStatus;
    }

    public UpdateProtectionPolicyInfoRequestInfo withProcessWhitelist(List<TrustProcessInfo> processWhitelist) {
        this.processWhitelist = processWhitelist;
        return this;
    }

    public UpdateProtectionPolicyInfoRequestInfo addProcessWhitelistItem(TrustProcessInfo processWhitelistItem) {
        if (this.processWhitelist == null) {
            this.processWhitelist = new ArrayList<>();
        }
        this.processWhitelist.add(processWhitelistItem);
        return this;
    }

    public UpdateProtectionPolicyInfoRequestInfo withProcessWhitelist(
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateProtectionPolicyInfoRequestInfo that = (UpdateProtectionPolicyInfoRequestInfo) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.protectionMode, that.protectionMode)
            && Objects.equals(this.baitProtectionStatus, that.baitProtectionStatus)
            && Objects.equals(this.protectionDirectory, that.protectionDirectory)
            && Objects.equals(this.protectionType, that.protectionType)
            && Objects.equals(this.excludeDirectory, that.excludeDirectory)
            && Objects.equals(this.agentIdList, that.agentIdList)
            && Objects.equals(this.operatingSystem, that.operatingSystem)
            && Objects.equals(this.runtimeDetectionStatus, that.runtimeDetectionStatus)
            && Objects.equals(this.processWhitelist, that.processWhitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId,
            policyName,
            protectionMode,
            baitProtectionStatus,
            protectionDirectory,
            protectionType,
            excludeDirectory,
            agentIdList,
            operatingSystem,
            runtimeDetectionStatus,
            processWhitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProtectionPolicyInfoRequestInfo {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    protectionMode: ").append(toIndentedString(protectionMode)).append("\n");
        sb.append("    baitProtectionStatus: ").append(toIndentedString(baitProtectionStatus)).append("\n");
        sb.append("    protectionDirectory: ").append(toIndentedString(protectionDirectory)).append("\n");
        sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
        sb.append("    excludeDirectory: ").append(toIndentedString(excludeDirectory)).append("\n");
        sb.append("    agentIdList: ").append(toIndentedString(agentIdList)).append("\n");
        sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
        sb.append("    runtimeDetectionStatus: ").append(toIndentedString(runtimeDetectionStatus)).append("\n");
        sb.append("    processWhitelist: ").append(toIndentedString(processWhitelist)).append("\n");
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
