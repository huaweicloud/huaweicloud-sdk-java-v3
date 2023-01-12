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
     * 防护文件类型
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
     * 关联server
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
     * 操作系统，包含如下：   - Windows : Windows系统   - Linux : Linux系统
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateProtectionPolicyInfoRequestInfo updateProtectionPolicyInfoRequestInfo =
            (UpdateProtectionPolicyInfoRequestInfo) o;
        return Objects.equals(this.policyId, updateProtectionPolicyInfoRequestInfo.policyId)
            && Objects.equals(this.policyName, updateProtectionPolicyInfoRequestInfo.policyName)
            && Objects.equals(this.protectionMode, updateProtectionPolicyInfoRequestInfo.protectionMode)
            && Objects.equals(this.baitProtectionStatus, updateProtectionPolicyInfoRequestInfo.baitProtectionStatus)
            && Objects.equals(this.protectionDirectory, updateProtectionPolicyInfoRequestInfo.protectionDirectory)
            && Objects.equals(this.protectionType, updateProtectionPolicyInfoRequestInfo.protectionType)
            && Objects.equals(this.excludeDirectory, updateProtectionPolicyInfoRequestInfo.excludeDirectory)
            && Objects.equals(this.agentIdList, updateProtectionPolicyInfoRequestInfo.agentIdList)
            && Objects.equals(this.operatingSystem, updateProtectionPolicyInfoRequestInfo.operatingSystem) && Objects
                .equals(this.runtimeDetectionStatus, updateProtectionPolicyInfoRequestInfo.runtimeDetectionStatus);
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
            runtimeDetectionStatus);
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
