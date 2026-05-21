package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * RestoreMetaDataSource
 */
public class RestoreMetaDataSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private BigDecimal restoreTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    public RestoreMetaDataSource withRestoreTime(BigDecimal restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * 恢复时间。
     * minimum: 1
     * maximum: 9223372036854775807
     * @return restoreTime
     */
    public BigDecimal getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(BigDecimal restoreTime) {
        this.restoreTime = restoreTime;
    }

    public RestoreMetaDataSource withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 备份id。
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreMetaDataSource that = (RestoreMetaDataSource) obj;
        return Objects.equals(this.restoreTime, that.restoreTime) && Objects.equals(this.backupId, that.backupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreTime, backupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreMetaDataSource {\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
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
