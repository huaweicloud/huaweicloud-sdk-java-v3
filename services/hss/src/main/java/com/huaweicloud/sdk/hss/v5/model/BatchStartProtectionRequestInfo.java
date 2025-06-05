package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchStartProtectionRequestInfo
 */
public class BatchStartProtectionRequestInfo {

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
    @JsonProperty(value = "backup_protection_status")

    private String backupProtectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    public BatchStartProtectionRequestInfo withOperatingSystem(String operatingSystem) {
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

    public BatchStartProtectionRequestInfo withRansomProtectionStatus(String ransomProtectionStatus) {
        this.ransomProtectionStatus = ransomProtectionStatus;
        return this;
    }

    /**
     * 勒索防护是否开启，包含如下：   - closed ：关闭。   - opened ：开启。   若选择开启，protection_policy_id必填一项
     * @return ransomProtectionStatus
     */
    public String getRansomProtectionStatus() {
        return ransomProtectionStatus;
    }

    public void setRansomProtectionStatus(String ransomProtectionStatus) {
        this.ransomProtectionStatus = ransomProtectionStatus;
    }

    public BatchStartProtectionRequestInfo withProtectionPolicyId(String protectionPolicyId) {
        this.protectionPolicyId = protectionPolicyId;
        return this;
    }

    /**
     * 防护策略ID,若ransom_protection_status为opened,则该字段必选
     * @return protectionPolicyId
     */
    public String getProtectionPolicyId() {
        return protectionPolicyId;
    }

    public void setProtectionPolicyId(String protectionPolicyId) {
        this.protectionPolicyId = protectionPolicyId;
    }

    public BatchStartProtectionRequestInfo withBackupProtectionStatus(String backupProtectionStatus) {
        this.backupProtectionStatus = backupProtectionStatus;
        return this;
    }

    /**
     * 是否服务器备份，包含如下：   - closed ：关闭。   - opened ：开启。   若选择开启服务器备份，则vault_id必填
     * @return backupProtectionStatus
     */
    public String getBackupProtectionStatus() {
        return backupProtectionStatus;
    }

    public void setBackupProtectionStatus(String backupProtectionStatus) {
        this.backupProtectionStatus = backupProtectionStatus;
    }

    public BatchStartProtectionRequestInfo withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * 需要绑定的存储库ID，若backup_protection_status为opened，则该字段必填
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public BatchStartProtectionRequestInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public BatchStartProtectionRequestInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public BatchStartProtectionRequestInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
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
        BatchStartProtectionRequestInfo that = (BatchStartProtectionRequestInfo) obj;
        return Objects.equals(this.operatingSystem, that.operatingSystem)
            && Objects.equals(this.ransomProtectionStatus, that.ransomProtectionStatus)
            && Objects.equals(this.protectionPolicyId, that.protectionPolicyId)
            && Objects.equals(this.backupProtectionStatus, that.backupProtectionStatus)
            && Objects.equals(this.vaultId, that.vaultId) && Objects.equals(this.hostIdList, that.hostIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operatingSystem,
            ransomProtectionStatus,
            protectionPolicyId,
            backupProtectionStatus,
            vaultId,
            hostIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStartProtectionRequestInfo {\n");
        sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
        sb.append("    ransomProtectionStatus: ").append(toIndentedString(ransomProtectionStatus)).append("\n");
        sb.append("    protectionPolicyId: ").append(toIndentedString(protectionPolicyId)).append("\n");
        sb.append("    backupProtectionStatus: ").append(toIndentedString(backupProtectionStatus)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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
