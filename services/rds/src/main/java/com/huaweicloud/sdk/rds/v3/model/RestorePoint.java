package com.huaweicloud.sdk.rds.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RestorePoint
 */
public class RestorePoint  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_id")
    
    private String backupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restore_time")
    
    private Integer restoreTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database_name")
    
    private Map<String, String> databaseName = null;
    
    public RestorePoint withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 源实例ID。
     * @return instanceId
     */
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

    


    /**
     * 表示恢复方式，枚举值：  - “backup”，表示使用备份文件恢复，按照此方式恢复时，“type”字段为非必选，“backup_id”必选。 - “timestamp”，表示按时间点恢复，按照此方式恢复时，“type”字段必选，“restore_time”必选。
     * @return type
     */
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

    


    /**
     * 用于恢复的备份ID。当使用备份文件恢复时需要指定该参数。
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public RestorePoint withRestoreTime(Integer restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    


    /**
     * 恢复数据的时间点，格式为UNIX时间戳，单位是毫秒，时区为UTC。
     * @return restoreTime
     */
    public Integer getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(Integer restoreTime) {
        this.restoreTime = restoreTime;
    }

    public RestorePoint withDatabaseName(Map<String, String> databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    

    public RestorePoint putDatabaseNameItem(String key, String databaseNameItem) {
         if (this.databaseName == null) {
            this.databaseName = new HashMap<>();
         }
        this.databaseName.put(key, databaseNameItem);
        return this;
    }

    public RestorePoint withDatabaseName(Consumer<Map<String, String>> databaseNameSetter) {
        if(this.databaseName == null ){
            this.databaseName = new HashMap<>();
        }
        databaseNameSetter.accept(this.databaseName);
        return this;
    }
    /**
     * 仅适用于SQL Server引擎，当有此参数时表示支持局部恢复和重命名恢复，恢复数据以局部恢复为主。  - 新数据库名称不可与源实例数据库名称重名，新数据库名称为空，默认按照原数据库名进行恢复。   注意：   不填写该字段时，默认恢复全部数据库。    示例：”database_name”:{“原库名”:”新库名”}  - 新数据库名不能包含rdsadmin、master、msdb、tempdb、model或resource字段（不区分大小写）。 - 数据库名称长度在1~64个字符之间，包含字母、数字、下划线或中划线，不能包含其他特殊字符。
     * @return databaseName
     */
    public Map<String, String> getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(Map<String, String> databaseName) {
        this.databaseName = databaseName;
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
        return Objects.equals(this.instanceId, restorePoint.instanceId) &&
            Objects.equals(this.type, restorePoint.type) &&
            Objects.equals(this.backupId, restorePoint.backupId) &&
            Objects.equals(this.restoreTime, restorePoint.restoreTime) &&
            Objects.equals(this.databaseName, restorePoint.databaseName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, type, backupId, restoreTime, databaseName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestorePoint {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
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

