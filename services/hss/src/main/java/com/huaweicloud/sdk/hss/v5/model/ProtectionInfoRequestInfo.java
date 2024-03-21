package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProtectionInfoRequestInfo
 */
public class ProtectionInfoRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_system")

    private String operatingSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ransom_protection_status")

    private String ransomProtectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_policy_id")

    private String protectionPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_protection_policy")

    private ProtectionProxyInfoRequestInfo createProtectionPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_protection_status")

    private String backupProtectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_resources")

    private BackupResources backupResources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_policy_id")

    private String backupPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_cycle")

    private UpdateBackupPolicyRequestInfo1 backupCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id_list")

    private List<String> agentIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    public ProtectionInfoRequestInfo withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * 需要开启防护的主机的操作系统，包含如下：   - Windows : Windows系统   - Linux : Linux系统
     * @return operatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public ProtectionInfoRequestInfo withRansomProtectionStatus(String ransomProtectionStatus) {
        this.ransomProtectionStatus = ransomProtectionStatus;
        return this;
    }

    /**
     * 勒索防护是否开启，包含如下：   - closed ：关闭。   - opened ：开启。   若选择开启，protection_policy_id或者create_protection_policy必填一项
     * @return ransomProtectionStatus
     */
    public String getRansomProtectionStatus() {
        return ransomProtectionStatus;
    }

    public void setRansomProtectionStatus(String ransomProtectionStatus) {
        this.ransomProtectionStatus = ransomProtectionStatus;
    }

    public ProtectionInfoRequestInfo withProtectionPolicyId(String protectionPolicyId) {
        this.protectionPolicyId = protectionPolicyId;
        return this;
    }

    /**
     * 勒索防护策略ID,若选择已有策略防护,则该字段必选
     * @return protectionPolicyId
     */
    public String getProtectionPolicyId() {
        return protectionPolicyId;
    }

    public void setProtectionPolicyId(String protectionPolicyId) {
        this.protectionPolicyId = protectionPolicyId;
    }

    public ProtectionInfoRequestInfo withCreateProtectionPolicy(ProtectionProxyInfoRequestInfo createProtectionPolicy) {
        this.createProtectionPolicy = createProtectionPolicy;
        return this;
    }

    public ProtectionInfoRequestInfo withCreateProtectionPolicy(
        Consumer<ProtectionProxyInfoRequestInfo> createProtectionPolicySetter) {
        if (this.createProtectionPolicy == null) {
            this.createProtectionPolicy = new ProtectionProxyInfoRequestInfo();
            createProtectionPolicySetter.accept(this.createProtectionPolicy);
        }

        return this;
    }

    /**
     * Get createProtectionPolicy
     * @return createProtectionPolicy
     */
    public ProtectionProxyInfoRequestInfo getCreateProtectionPolicy() {
        return createProtectionPolicy;
    }

    public void setCreateProtectionPolicy(ProtectionProxyInfoRequestInfo createProtectionPolicy) {
        this.createProtectionPolicy = createProtectionPolicy;
    }

    public ProtectionInfoRequestInfo withBackupProtectionStatus(String backupProtectionStatus) {
        this.backupProtectionStatus = backupProtectionStatus;
        return this;
    }

    /**
     * 是否服务器备份，包含如下：   - closed ：关闭。   - opened ：开启。   若选择开启服务器备份，则backup_cycle必填
     * @return backupProtectionStatus
     */
    public String getBackupProtectionStatus() {
        return backupProtectionStatus;
    }

    public void setBackupProtectionStatus(String backupProtectionStatus) {
        this.backupProtectionStatus = backupProtectionStatus;
    }

    public ProtectionInfoRequestInfo withBackupResources(BackupResources backupResources) {
        this.backupResources = backupResources;
        return this;
    }

    public ProtectionInfoRequestInfo withBackupResources(Consumer<BackupResources> backupResourcesSetter) {
        if (this.backupResources == null) {
            this.backupResources = new BackupResources();
            backupResourcesSetter.accept(this.backupResources);
        }

        return this;
    }

    /**
     * Get backupResources
     * @return backupResources
     */
    public BackupResources getBackupResources() {
        return backupResources;
    }

    public void setBackupResources(BackupResources backupResources) {
        this.backupResources = backupResources;
    }

    public ProtectionInfoRequestInfo withBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
        return this;
    }

    /**
     * 备份策略ID
     * @return backupPolicyId
     */
    public String getBackupPolicyId() {
        return backupPolicyId;
    }

    public void setBackupPolicyId(String backupPolicyId) {
        this.backupPolicyId = backupPolicyId;
    }

    public ProtectionInfoRequestInfo withBackupCycle(UpdateBackupPolicyRequestInfo1 backupCycle) {
        this.backupCycle = backupCycle;
        return this;
    }

    public ProtectionInfoRequestInfo withBackupCycle(Consumer<UpdateBackupPolicyRequestInfo1> backupCycleSetter) {
        if (this.backupCycle == null) {
            this.backupCycle = new UpdateBackupPolicyRequestInfo1();
            backupCycleSetter.accept(this.backupCycle);
        }

        return this;
    }

    /**
     * Get backupCycle
     * @return backupCycle
     */
    public UpdateBackupPolicyRequestInfo1 getBackupCycle() {
        return backupCycle;
    }

    public void setBackupCycle(UpdateBackupPolicyRequestInfo1 backupCycle) {
        this.backupCycle = backupCycle;
    }

    public ProtectionInfoRequestInfo withAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
        return this;
    }

    public ProtectionInfoRequestInfo addAgentIdListItem(String agentIdListItem) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        this.agentIdList.add(agentIdListItem);
        return this;
    }

    public ProtectionInfoRequestInfo withAgentIdList(Consumer<List<String>> agentIdListSetter) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        agentIdListSetter.accept(this.agentIdList);
        return this;
    }

    /**
     * 开启防护的Agent id列表
     * @return agentIdList
     */
    public List<String> getAgentIdList() {
        return agentIdList;
    }

    public void setAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
    }

    public ProtectionInfoRequestInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public ProtectionInfoRequestInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public ProtectionInfoRequestInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * 开启防护的host id列表
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectionInfoRequestInfo that = (ProtectionInfoRequestInfo) obj;
        return Objects.equals(this.operatingSystem, that.operatingSystem)
            && Objects.equals(this.ransomProtectionStatus, that.ransomProtectionStatus)
            && Objects.equals(this.protectionPolicyId, that.protectionPolicyId)
            && Objects.equals(this.createProtectionPolicy, that.createProtectionPolicy)
            && Objects.equals(this.backupProtectionStatus, that.backupProtectionStatus)
            && Objects.equals(this.backupResources, that.backupResources)
            && Objects.equals(this.backupPolicyId, that.backupPolicyId)
            && Objects.equals(this.backupCycle, that.backupCycle) && Objects.equals(this.agentIdList, that.agentIdList)
            && Objects.equals(this.hostIdList, that.hostIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operatingSystem,
            ransomProtectionStatus,
            protectionPolicyId,
            createProtectionPolicy,
            backupProtectionStatus,
            backupResources,
            backupPolicyId,
            backupCycle,
            agentIdList,
            hostIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectionInfoRequestInfo {\n");
        sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
        sb.append("    ransomProtectionStatus: ").append(toIndentedString(ransomProtectionStatus)).append("\n");
        sb.append("    protectionPolicyId: ").append(toIndentedString(protectionPolicyId)).append("\n");
        sb.append("    createProtectionPolicy: ").append(toIndentedString(createProtectionPolicy)).append("\n");
        sb.append("    backupProtectionStatus: ").append(toIndentedString(backupProtectionStatus)).append("\n");
        sb.append("    backupResources: ").append(toIndentedString(backupResources)).append("\n");
        sb.append("    backupPolicyId: ").append(toIndentedString(backupPolicyId)).append("\n");
        sb.append("    backupCycle: ").append(toIndentedString(backupCycle)).append("\n");
        sb.append("    agentIdList: ").append(toIndentedString(agentIdList)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
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
