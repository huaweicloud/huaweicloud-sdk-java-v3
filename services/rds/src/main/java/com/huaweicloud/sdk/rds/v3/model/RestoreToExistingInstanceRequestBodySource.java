package com.huaweicloud.sdk.rds.v3.model;




import java.util.Collections;


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
 * 恢复数据源对象。
 */
public class RestoreToExistingInstanceRequestBodySource  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;
    /**
     * 表示恢复方式，枚举值：  - “backup”，表示使用备份文件恢复，按照此方式恢复时，“type”字段为非必选，“backup_id”必选。 - “timestamp”，表示按时间点恢复，按照此方式恢复时，“type”字段必选，“restore_time”必选。
     */
    public static final class TypeEnum {

        
        /**
         * Enum BACKUP for value: "backup"
         */
        public static final TypeEnum BACKUP = new TypeEnum("backup");
        
        /**
         * Enum TIMESTAMP for value: "timestamp"
         */
        public static final TypeEnum TIMESTAMP = new TypeEnum("timestamp");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("backup", BACKUP);
            map.put("timestamp", TIMESTAMP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_id")
    
    private String backupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restore_time")
    
    private Integer restoreTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database_name")
    
    private Map<String, String> databaseName = null;
    
    public RestoreToExistingInstanceRequestBodySource withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public RestoreToExistingInstanceRequestBodySource withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 表示恢复方式，枚举值：  - “backup”，表示使用备份文件恢复，按照此方式恢复时，“type”字段为非必选，“backup_id”必选。 - “timestamp”，表示按时间点恢复，按照此方式恢复时，“type”字段必选，“restore_time”必选。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public RestoreToExistingInstanceRequestBodySource withBackupId(String backupId) {
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

    public RestoreToExistingInstanceRequestBodySource withRestoreTime(Integer restoreTime) {
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

    public RestoreToExistingInstanceRequestBodySource withDatabaseName(Map<String, String> databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    

    public RestoreToExistingInstanceRequestBodySource putDatabaseNameItem(String key, String databaseNameItem) {
         if (this.databaseName == null) {
            this.databaseName = new HashMap<>();
         }
        this.databaseName.put(key, databaseNameItem);
        return this;
    }

    public RestoreToExistingInstanceRequestBodySource withDatabaseName(Consumer<Map<String, String>> databaseNameSetter) {
        if(this.databaseName == null ){
            this.databaseName = new HashMap<>();
        }
        databaseNameSetter.accept(this.databaseName);
        return this;
    }
    /**
     * 仅适用于SQL Server引擎，当有此参数时表示支持局部恢复和重命名恢复，恢复数据以局部恢复为主。不填写该字段时，默认恢复全部数据库。 - 新数据库名称不可与源实例或目标实例数据库名称重名，新数据库名称为空，默认按照原数据库名进行恢复。 - 新数据库名不能包含rdsadmin、master、msdb、tempdb、model或resource字段（不区分大小写）。 - 数据库名称长度在1~64个字符之间，包含字母、数字、下划线或中划线，不能包含其他特殊字符。
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
        RestoreToExistingInstanceRequestBodySource restoreToExistingInstanceRequestBodySource = (RestoreToExistingInstanceRequestBodySource) o;
        return Objects.equals(this.instanceId, restoreToExistingInstanceRequestBodySource.instanceId) &&
            Objects.equals(this.type, restoreToExistingInstanceRequestBodySource.type) &&
            Objects.equals(this.backupId, restoreToExistingInstanceRequestBodySource.backupId) &&
            Objects.equals(this.restoreTime, restoreToExistingInstanceRequestBodySource.restoreTime) &&
            Objects.equals(this.databaseName, restoreToExistingInstanceRequestBodySource.databaseName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, type, backupId, restoreTime, databaseName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreToExistingInstanceRequestBodySource {\n");
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

