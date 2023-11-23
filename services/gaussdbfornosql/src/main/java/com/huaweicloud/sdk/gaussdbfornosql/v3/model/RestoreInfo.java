package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 支持按指定备份文件恢复和按指定时间点恢复。 其中按指定时间点恢复仅支持GeminiDB Cassandra和GeminiDB Influx。
 */
public class RestoreInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_id")

    private String sourceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private Long restoreTime;

    public RestoreInfo withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 备份文件ID。  用于根据指定备份恢复数据到一个新创建的实例的场景，此场景下该字段取值不能为空。
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public RestoreInfo withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /**
     * 数据恢复参考的指定实例的ID。  用于恢复指定实例的指定时间点的数据到一个新创建的实例的场景，此场景下该字段取值不能为空。
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    public RestoreInfo withRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /**
     * 数据恢复的指定的时间点。  用于恢复指定实例的指定时间点的数据到一个新创建的实例的场景，此场景下该字段取值不能为空。取值为UTC 13位毫秒数，可通过[查询实例可恢复的时间段]接口进行查询。
     * @return restoreTime
     */
    public Long getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreInfo that = (RestoreInfo) obj;
        return Objects.equals(this.backupId, that.backupId)
            && Objects.equals(this.sourceInstanceId, that.sourceInstanceId)
            && Objects.equals(this.restoreTime, that.restoreTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupId, sourceInstanceId, restoreTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreInfo {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
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
