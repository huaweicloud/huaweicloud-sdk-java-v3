package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 查询迁移任务列表
 */
public class MigrationTaskList  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_name")
    
    private String taskName;
    /**
     * 迁移任务状态，这个字段的值包括：SUCCESS, FAILED, MIGRATING
     */
    public static class StatusEnum {

        
        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        
        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        
        /**
         * Enum MIGRATING for value: "MIGRATING"
         */
        public static final StatusEnum MIGRATING = new StatusEnum("MIGRATING");

        

        public static Map<String, StatusEnum> staticFields =
                new HashMap<String, StatusEnum>() {
                    { 
                        put("SUCCESS", SUCCESS);
                        put("FAILED", FAILED);
                        put("MIGRATING", MIGRATING);
                    }
                };

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new StatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;
    /**
     * 迁移任务类型,包括备份文件导入和在线迁移两种类型。
     */
    public static class MigrationTypeEnum {

        
        /**
         * Enum BACKUPFILE_IMPORT for value: "backupfile_import"
         */
        public static final MigrationTypeEnum BACKUPFILE_IMPORT = new MigrationTypeEnum("backupfile_import");

        
        /**
         * Enum ONLINE_MIGRATION for value: "online_migration"
         */
        public static final MigrationTypeEnum ONLINE_MIGRATION = new MigrationTypeEnum("online_migration");

        

        public static Map<String, MigrationTypeEnum> staticFields =
                new HashMap<String, MigrationTypeEnum>() {
                    { 
                        put("backupfile_import", BACKUPFILE_IMPORT);
                        put("online_migration", ONLINE_MIGRATION);
                    }
                };

        private String value;

        MigrationTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MigrationTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            MigrationTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new MigrationTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static MigrationTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            MigrationTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof MigrationTypeEnum) {
                return this.value.equals(((MigrationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migration_type")
    
    private MigrationTypeEnum migrationType;
    /**
     * 迁移方式，包括全量迁移和增量迁移两种类型。
     */
    public static class MigrationMethodEnum {

        
        /**
         * Enum FULL_AMOUNT_MIGRATION for value: "full_amount_migration"
         */
        public static final MigrationMethodEnum FULL_AMOUNT_MIGRATION = new MigrationMethodEnum("full_amount_migration");

        
        /**
         * Enum INCREMENTAL_MIGRATION for value: "incremental_migration"
         */
        public static final MigrationMethodEnum INCREMENTAL_MIGRATION = new MigrationMethodEnum("incremental_migration");

        

        public static Map<String, MigrationMethodEnum> staticFields =
                new HashMap<String, MigrationMethodEnum>() {
                    { 
                        put("full_amount_migration", FULL_AMOUNT_MIGRATION);
                        put("incremental_migration", INCREMENTAL_MIGRATION);
                    }
                };

        private String value;

        MigrationMethodEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MigrationMethodEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            MigrationMethodEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new MigrationMethodEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static MigrationMethodEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            MigrationMethodEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof MigrationMethodEnum) {
                return this.value.equals(((MigrationMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migration_method")
    
    private MigrationMethodEnum migrationMethod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_instance_name")
    
    private String targetInstanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_source")
    
    private String dataSource;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;

    public MigrationTaskList withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 迁移任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public MigrationTaskList withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    


    /**
     * 迁移任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public MigrationTaskList withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 迁移任务状态，这个字段的值包括：SUCCESS, FAILED, MIGRATING
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public MigrationTaskList withMigrationType(MigrationTypeEnum migrationType) {
        this.migrationType = migrationType;
        return this;
    }

    


    /**
     * 迁移任务类型,包括备份文件导入和在线迁移两种类型。
     * @return migrationType
     */
    public MigrationTypeEnum getMigrationType() {
        return migrationType;
    }

    public void setMigrationType(MigrationTypeEnum migrationType) {
        this.migrationType = migrationType;
    }

    public MigrationTaskList withMigrationMethod(MigrationMethodEnum migrationMethod) {
        this.migrationMethod = migrationMethod;
        return this;
    }

    


    /**
     * 迁移方式，包括全量迁移和增量迁移两种类型。
     * @return migrationMethod
     */
    public MigrationMethodEnum getMigrationMethod() {
        return migrationMethod;
    }

    public void setMigrationMethod(MigrationMethodEnum migrationMethod) {
        this.migrationMethod = migrationMethod;
    }

    public MigrationTaskList withTargetInstanceName(String targetInstanceName) {
        this.targetInstanceName = targetInstanceName;
        return this;
    }

    


    /**
     * 目标实例名称。
     * @return targetInstanceName
     */
    public String getTargetInstanceName() {
        return targetInstanceName;
    }

    public void setTargetInstanceName(String targetInstanceName) {
        this.targetInstanceName = targetInstanceName;
    }

    public MigrationTaskList withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    


    /**
     * 数据源，格式为ip:port或者桶名。
     * @return dataSource
     */
    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public MigrationTaskList withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 迁移任务创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrationTaskList migrationTaskList = (MigrationTaskList) o;
        return Objects.equals(this.taskId, migrationTaskList.taskId) &&
            Objects.equals(this.taskName, migrationTaskList.taskName) &&
            Objects.equals(this.status, migrationTaskList.status) &&
            Objects.equals(this.migrationType, migrationTaskList.migrationType) &&
            Objects.equals(this.migrationMethod, migrationTaskList.migrationMethod) &&
            Objects.equals(this.targetInstanceName, migrationTaskList.targetInstanceName) &&
            Objects.equals(this.dataSource, migrationTaskList.dataSource) &&
            Objects.equals(this.createdAt, migrationTaskList.createdAt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, status, migrationType, migrationMethod, targetInstanceName, dataSource, createdAt);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationTaskList {\n");
            sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
            sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    migrationType: ").append(toIndentedString(migrationType)).append("\n");
            sb.append("    migrationMethod: ").append(toIndentedString(migrationMethod)).append("\n");
            sb.append("    targetInstanceName: ").append(toIndentedString(targetInstanceName)).append("\n");
            sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
            sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

