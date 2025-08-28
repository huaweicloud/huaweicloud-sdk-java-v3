package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRemoteBackupHostInfoResponse extends SdkResponse {

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

    public ShowRemoteBackupHostInfoResponse withBackupAddr(String backupAddr) {
        this.backupAddr = backupAddr;
        return this;
    }

    /**
     * 远端备份服务器的地址，包含IP和端口
     * @return backupAddr
     */
    public String getBackupAddr() {
        return backupAddr;
    }

    public void setBackupAddr(String backupAddr) {
        this.backupAddr = backupAddr;
    }

    public ShowRemoteBackupHostInfoResponse withBackupHostId(String backupHostId) {
        this.backupHostId = backupHostId;
        return this;
    }

    /**
     * 远端备份服务器的服务器ID
     * @return backupHostId
     */
    public String getBackupHostId() {
        return backupHostId;
    }

    public void setBackupHostId(String backupHostId) {
        this.backupHostId = backupHostId;
    }

    public ShowRemoteBackupHostInfoResponse withBackupHostName(String backupHostName) {
        this.backupHostName = backupHostName;
        return this;
    }

    /**
     * 远端备份服务器的服务器名称
     * @return backupHostName
     */
    public String getBackupHostName() {
        return backupHostName;
    }

    public void setBackupHostName(String backupHostName) {
        this.backupHostName = backupHostName;
    }

    public ShowRemoteBackupHostInfoResponse withRemoteBackup(Boolean remoteBackup) {
        this.remoteBackup = remoteBackup;
        return this;
    }

    /**
     * **参数解释** 服务器是否开启远端备份 **取值范围**  - true : 已开启远端备份。 - false: 未开启远端备份。
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
        ShowRemoteBackupHostInfoResponse that = (ShowRemoteBackupHostInfoResponse) obj;
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
        sb.append("class ShowRemoteBackupHostInfoResponse {\n");
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
