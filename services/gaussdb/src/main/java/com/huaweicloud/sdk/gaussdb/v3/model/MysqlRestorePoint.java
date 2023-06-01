package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlRestorePoint
 */
public class MysqlRestorePoint  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restore_time")
    

    private Long restoreTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_instance_id")
    

    private String sourceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_id")
    

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    

    private String type;

    public MysqlRestorePoint withRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    


    /**
     * PITR。要恢复的时间点。
     * @return restoreTime
     */
    public Long getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(Long restoreTime) {
        this.restoreTime = restoreTime;
    }

    

    public MysqlRestorePoint withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    


    /**
     * 源实例id。
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    

    public MysqlRestorePoint withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    


    /**
     * 备份文件id。
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    

    public MysqlRestorePoint withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 备份类型。当参数为空时，backup_id不能为空，即默认按备份文件恢复。 当参数不为空时，取值范围： - backup：表示按备份文件恢复； - timestamp：表示按时间点恢复；
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlRestorePoint mysqlRestorePoint = (MysqlRestorePoint) o;
        return Objects.equals(this.restoreTime, mysqlRestorePoint.restoreTime) &&
            Objects.equals(this.sourceInstanceId, mysqlRestorePoint.sourceInstanceId) &&
            Objects.equals(this.backupId, mysqlRestorePoint.backupId) &&
            Objects.equals(this.type, mysqlRestorePoint.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(restoreTime, sourceInstanceId, backupId, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlRestorePoint {\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

