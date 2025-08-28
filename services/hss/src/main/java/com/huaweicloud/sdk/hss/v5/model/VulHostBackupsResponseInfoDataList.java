package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VulHostBackupsResponseInfoDataList
 */
public class VulHostBackupsResponseInfoDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_time")

    private Long backupTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_name")

    private String backupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public VulHostBackupsResponseInfoDataList withBackupTime(Long backupTime) {
        this.backupTime = backupTime;
        return this;
    }

    /**
     * **参数解释**: 备份时间（时间戳，单位为毫秒） **取值范围**: 取值0-9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return backupTime
     */
    public Long getBackupTime() {
        return backupTime;
    }

    public void setBackupTime(Long backupTime) {
        this.backupTime = backupTime;
    }

    public VulHostBackupsResponseInfoDataList withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * **参数解释**: 备份id **取值范围**: 字符长度1-128位 
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public VulHostBackupsResponseInfoDataList withBackupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    /**
     * **参数解释**: 备份名称 **取值范围**: 字符长度1-64位 
     * @return backupName
     */
    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    public VulHostBackupsResponseInfoDataList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 备份状态 **取值范围**: - available：可用 - protecting：备份中 - deleting：删除中 - restoring：恢复中 - error：错误 - waiting_protect：待备份 - waiting_delete：待删除 - waiting_restore：待恢复 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulHostBackupsResponseInfoDataList that = (VulHostBackupsResponseInfoDataList) obj;
        return Objects.equals(this.backupTime, that.backupTime) && Objects.equals(this.backupId, that.backupId)
            && Objects.equals(this.backupName, that.backupName) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupTime, backupId, backupName, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulHostBackupsResponseInfoDataList {\n");
        sb.append("    backupTime: ").append(toIndentedString(backupTime)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
