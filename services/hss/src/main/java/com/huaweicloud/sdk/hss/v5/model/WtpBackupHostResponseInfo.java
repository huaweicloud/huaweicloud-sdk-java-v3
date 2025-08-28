package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WtpBackupHostResponseInfo
 */
public class WtpBackupHostResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_host_ip")

    private String backupHostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_host_port")

    private Integer backupHostPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_dir")

    private String backupDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_host_status")

    private Integer backupHostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_host_name")

    private String backupHostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_host_id")

    private String backupHostId;

    public WtpBackupHostResponseInfo withBackupHostIp(String backupHostIp) {
        this.backupHostIp = backupHostIp;
        return this;
    }

    /**
     * **参数解释**: 备份服务器IP **取值范围**: 字符长度0-256位 
     * @return backupHostIp
     */
    public String getBackupHostIp() {
        return backupHostIp;
    }

    public void setBackupHostIp(String backupHostIp) {
        this.backupHostIp = backupHostIp;
    }

    public WtpBackupHostResponseInfo withBackupHostPort(Integer backupHostPort) {
        this.backupHostPort = backupHostPort;
        return this;
    }

    /**
     * **参数解释**: 备份服务器端口 **取值范围**: 最小值0，最大值65535 
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

    public WtpBackupHostResponseInfo withBackupDir(String backupDir) {
        this.backupDir = backupDir;
        return this;
    }

    /**
     * **参数解释**: 备份路径 **取值范围**: 字符长度0-256位 
     * @return backupDir
     */
    public String getBackupDir() {
        return backupDir;
    }

    public void setBackupDir(String backupDir) {
        this.backupDir = backupDir;
    }

    public WtpBackupHostResponseInfo withBackupHostStatus(Integer backupHostStatus) {
        this.backupHostStatus = backupHostStatus;
        return this;
    }

    /**
     * **参数解释**: 备份状态 **取值范围**: - -1 ：启动失败 - 0 ：未启动 - 1 ：运行中 - 2 ：启动中 
     * minimum: -1
     * maximum: 10
     * @return backupHostStatus
     */
    public Integer getBackupHostStatus() {
        return backupHostStatus;
    }

    public void setBackupHostStatus(Integer backupHostStatus) {
        this.backupHostStatus = backupHostStatus;
    }

    public WtpBackupHostResponseInfo withBackupHostName(String backupHostName) {
        this.backupHostName = backupHostName;
        return this;
    }

    /**
     * **参数解释**: 远端备份服务器的服务器名称 **取值范围**: 字符长度0-256位 
     * @return backupHostName
     */
    public String getBackupHostName() {
        return backupHostName;
    }

    public void setBackupHostName(String backupHostName) {
        this.backupHostName = backupHostName;
    }

    public WtpBackupHostResponseInfo withBackupHostId(String backupHostId) {
        this.backupHostId = backupHostId;
        return this;
    }

    /**
     * **参数解释**: 远端备份服务器的服务器ID **取值范围**: 字符长度0-256位 
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
        WtpBackupHostResponseInfo that = (WtpBackupHostResponseInfo) obj;
        return Objects.equals(this.backupHostIp, that.backupHostIp)
            && Objects.equals(this.backupHostPort, that.backupHostPort)
            && Objects.equals(this.backupDir, that.backupDir)
            && Objects.equals(this.backupHostStatus, that.backupHostStatus)
            && Objects.equals(this.backupHostName, that.backupHostName)
            && Objects.equals(this.backupHostId, that.backupHostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupHostIp, backupHostPort, backupDir, backupHostStatus, backupHostName, backupHostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WtpBackupHostResponseInfo {\n");
        sb.append("    backupHostIp: ").append(toIndentedString(backupHostIp)).append("\n");
        sb.append("    backupHostPort: ").append(toIndentedString(backupHostPort)).append("\n");
        sb.append("    backupDir: ").append(toIndentedString(backupDir)).append("\n");
        sb.append("    backupHostStatus: ").append(toIndentedString(backupHostStatus)).append("\n");
        sb.append("    backupHostName: ").append(toIndentedString(backupHostName)).append("\n");
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
