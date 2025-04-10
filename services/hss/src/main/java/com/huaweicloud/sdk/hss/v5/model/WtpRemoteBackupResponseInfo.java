package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WtpRemoteBackupResponseInfo
 */
public class WtpRemoteBackupResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_addr")

    private String backupAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_host_id")

    private String backupHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_host_name")

    private String backupHostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_backup")

    private Boolean remoteBackup;

    public WtpRemoteBackupResponseInfo withBackupAddr(String backupAddr) {
        this.backupAddr = backupAddr;
        return this;
    }

    /**
     * 远端备份地址(ip+port)
     * @return backupAddr
     */
    public String getBackupAddr() {
        return backupAddr;
    }

    public void setBackupAddr(String backupAddr) {
        this.backupAddr = backupAddr;
    }

    public WtpRemoteBackupResponseInfo withBackupHostId(String backupHostId) {
        this.backupHostId = backupHostId;
        return this;
    }

    /**
     * 远端备份主机HostId
     * @return backupHostId
     */
    public String getBackupHostId() {
        return backupHostId;
    }

    public void setBackupHostId(String backupHostId) {
        this.backupHostId = backupHostId;
    }

    public WtpRemoteBackupResponseInfo withBackupHostName(String backupHostName) {
        this.backupHostName = backupHostName;
        return this;
    }

    /**
     * 远端备份服务器名称
     * @return backupHostName
     */
    public String getBackupHostName() {
        return backupHostName;
    }

    public void setBackupHostName(String backupHostName) {
        this.backupHostName = backupHostName;
    }

    public WtpRemoteBackupResponseInfo withRemoteBackup(Boolean remoteBackup) {
        this.remoteBackup = remoteBackup;
        return this;
    }

    /**
     * 是否开启远端备份
     * @return remoteBackup
     */
    public Boolean getRemoteBackup() {
        return remoteBackup;
    }

    public void setRemoteBackup(Boolean remoteBackup) {
        this.remoteBackup = remoteBackup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WtpRemoteBackupResponseInfo that = (WtpRemoteBackupResponseInfo) obj;
        return Objects.equals(this.backupAddr, that.backupAddr) && Objects.equals(this.backupHostId, that.backupHostId)
            && Objects.equals(this.backupHostName, that.backupHostName)
            && Objects.equals(this.remoteBackup, that.remoteBackup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupAddr, backupHostId, backupHostName, remoteBackup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WtpRemoteBackupResponseInfo {\n");
        sb.append("    backupAddr: ").append(toIndentedString(backupAddr)).append("\n");
        sb.append("    backupHostId: ").append(toIndentedString(backupHostId)).append("\n");
        sb.append("    backupHostName: ").append(toIndentedString(backupHostName)).append("\n");
        sb.append("    remoteBackup: ").append(toIndentedString(remoteBackup)).append("\n");
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
