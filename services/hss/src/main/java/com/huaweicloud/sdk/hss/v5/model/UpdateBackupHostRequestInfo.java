package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateBackupHostRequestInfo
 */
public class UpdateBackupHostRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_host_ip")

    private String backupHostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_host_port")

    private Integer backupHostPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_dir")

    private String backupDir;

    public UpdateBackupHostRequestInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 远端备份服务器的服务器ID，如果备份服务器之前不存在，则本次操作为新增，如果之前已存在，则本次操作为修改 **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值** : 不涉及 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public UpdateBackupHostRequestInfo withBackupHostIp(String backupHostIp) {
        this.backupHostIp = backupHostIp;
        return this;
    }

    /**
     * **参数解释**: 备份服务器IP **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值** : 不涉及 
     * @return backupHostIp
     */
    public String getBackupHostIp() {
        return backupHostIp;
    }

    public void setBackupHostIp(String backupHostIp) {
        this.backupHostIp = backupHostIp;
    }

    public UpdateBackupHostRequestInfo withBackupHostPort(Integer backupHostPort) {
        this.backupHostPort = backupHostPort;
        return this;
    }

    /**
     * **参数解释**: 备份服务器端口 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值65535 **默认取值** : 不涉及 
     * minimum: 0
     * maximum: 65535
     * @return backupHostPort
     */
    public Integer getBackupHostPort() {
        return backupHostPort;
    }

    public void setBackupHostPort(Integer backupHostPort) {
        this.backupHostPort = backupHostPort;
    }

    public UpdateBackupHostRequestInfo withBackupDir(String backupDir) {
        this.backupDir = backupDir;
        return this;
    }

    /**
     * **参数解释**: 备份路径 **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值** : 不涉及 
     * @return backupDir
     */
    public String getBackupDir() {
        return backupDir;
    }

    public void setBackupDir(String backupDir) {
        this.backupDir = backupDir;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBackupHostRequestInfo that = (UpdateBackupHostRequestInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.backupHostIp, that.backupHostIp)
            && Objects.equals(this.backupHostPort, that.backupHostPort)
            && Objects.equals(this.backupDir, that.backupDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, backupHostIp, backupHostPort, backupDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBackupHostRequestInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    backupHostIp: ").append(toIndentedString(backupHostIp)).append("\n");
        sb.append("    backupHostPort: ").append(toIndentedString(backupHostPort)).append("\n");
        sb.append("    backupDir: ").append(toIndentedString(backupDir)).append("\n");
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
