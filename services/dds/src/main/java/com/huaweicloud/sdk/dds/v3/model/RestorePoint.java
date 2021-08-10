package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** RestorePoint */
public class RestorePoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private String restoreTime;

    public RestorePoint withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID，可以调用“查询实例列表”接口获取。如果未申请实例，可以调用“创建实例”接口创建。当type为“backup”，为非必选。当type为“timestamp”，为必选。
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public RestorePoint withType(String type) {
        this.type = type;
        return this;
    }

    /** 恢复方式，枚举值： - “backup”，表示使用备份文件恢复，按照此方式恢复时，当“type”字段为非必选时，“backup_id”必选。 -
     * “timestamp”，表示按时间点恢复，按照此方式恢复时，当“type”字段必选时，“restore_time”必选。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RestorePoint withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /** 用于恢复的备份ID。当使用备份文件恢复时需要指定该参数。当“type”字段为非必选时，“backup_id”必选。
     * 
     * @return backupId */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public RestorePoint withRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    /** 恢复数据的时间点，格式为UNIX时间戳，单位是毫秒，时区为UTC。须知：当“type”字段必选时，“restore_time”必选。
     * 
     * @return restoreTime */
    public String getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestorePoint restorePoint = (RestorePoint) o;
        return Objects.equals(this.instanceId, restorePoint.instanceId) && Objects.equals(this.type, restorePoint.type)
            && Objects.equals(this.backupId, restorePoint.backupId)
            && Objects.equals(this.restoreTime, restorePoint.restoreTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, type, backupId, restoreTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestorePoint {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
