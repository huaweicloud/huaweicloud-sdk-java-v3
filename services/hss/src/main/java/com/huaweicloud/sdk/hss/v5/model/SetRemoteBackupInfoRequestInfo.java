package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SetRemoteBackupInfoRequestInfo
 */
public class SetRemoteBackupInfoRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_backup")

    private Boolean remoteBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_addr")

    private String backupAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_host_id")

    private String backupHostId;

    public SetRemoteBackupInfoRequestInfo withRemoteBackup(Boolean remoteBackup) {
        this.remoteBackup = remoteBackup;
        return this;
    }

    /**
     * **参数解释**: 是否开启远端备份 **约束限制**: 不涉及 **取值范围**: - true ：开启远端备份，需要填写 backup_addr 和 backup_host_id。 - false ：关闭远端备份，无需填写 backup_addr 和 backup_host_id。  **默认取值**: false 
     * @return remoteBackup
     */
    public Boolean getRemoteBackup() {
        return remoteBackup;
    }

    public void setRemoteBackup(Boolean remoteBackup) {
        this.remoteBackup = remoteBackup;
    }

    public SetRemoteBackupInfoRequestInfo withBackupAddr(String backupAddr) {
        this.backupAddr = backupAddr;
        return this;
    }

    /**
     * **参数解释**: 远端备份地址，需包含IP和端口，格式为IP:端口 **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值**: 不涉及 
     * @return backupAddr
     */
    public String getBackupAddr() {
        return backupAddr;
    }

    public void setBackupAddr(String backupAddr) {
        this.backupAddr = backupAddr;
    }

    public SetRemoteBackupInfoRequestInfo withBackupHostId(String backupHostId) {
        this.backupHostId = backupHostId;
        return this;
    }

    /**
     * **参数解释**: 远端备份服务器的服务器ID，填写的远端备份服务器ID必须是已运行中的备份服务器ID **约束限制**: 需要使用 ListBackupHostsInfo 接口查询已运行中的远端备份服务器，在 ListBackupHostsInfo 接口的响应体中，backup_host_status 等于 1 的 backup_host_id 是已运行的远端备份服务器ID **取值范围**: 字符长度0-256位 **默认取值**: 不涉及 
     * @return backupHostId
     */
    public String getBackupHostId() {
        return backupHostId;
    }

    public void setBackupHostId(String backupHostId) {
        this.backupHostId = backupHostId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetRemoteBackupInfoRequestInfo that = (SetRemoteBackupInfoRequestInfo) obj;
        return Objects.equals(this.remoteBackup, that.remoteBackup) && Objects.equals(this.backupAddr, that.backupAddr)
            && Objects.equals(this.backupHostId, that.backupHostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remoteBackup, backupAddr, backupHostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetRemoteBackupInfoRequestInfo {\n");
        sb.append("    remoteBackup: ").append(toIndentedString(remoteBackup)).append("\n");
        sb.append("    backupAddr: ").append(toIndentedString(backupAddr)).append("\n");
        sb.append("    backupHostId: ").append(toIndentedString(backupHostId)).append("\n");
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
