package com.huaweicloud.sdk.dcs.v2.model;


import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.BackupFilesBody;
import com.huaweicloud.sdk.dcs.v2.model.SourceInstanceBody;
import com.huaweicloud.sdk.dcs.v2.model.TargetInstanceBody;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowMigrationTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_name")
    
    private String taskName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 迁移任务状态，这个字段的值包括：SUCCESS, FAILED, MIGRATING。
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
        

        public static final Map<String, StatusEnum> staticFields = new HashMap<String, StatusEnum>() {
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
        

        public static final Map<String, MigrationTypeEnum> staticFields = new HashMap<String, MigrationTypeEnum>() {
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
        

        public static final Map<String, MigrationMethodEnum> staticFields = new HashMap<String, MigrationMethodEnum>() {
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
    @JsonProperty(value="backup_files")
    
    private BackupFilesBody backupFiles = null;
    /**
     * 网络类型，包括vpc和vpn两种类型。
     */
    public static class NetworkTypeEnum {

        
        /**
         * Enum VPC for value: "vpc"
         */
        public static final NetworkTypeEnum VPC = new NetworkTypeEnum("vpc");
        
        /**
         * Enum VPN for value: "vpn"
         */
        public static final NetworkTypeEnum VPN = new NetworkTypeEnum("vpn");
        

        public static final Map<String, NetworkTypeEnum> staticFields = new HashMap<String, NetworkTypeEnum>() {
            { 
                put("vpc", VPC);
                put("vpn", VPN);
            }
        };

        private String value;

        NetworkTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NetworkTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NetworkTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new NetworkTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static NetworkTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NetworkTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof NetworkTypeEnum) {
                return this.value.equals(((NetworkTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="network_type")
    
    private NetworkTypeEnum networkType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_instance")
    
    private SourceInstanceBody sourceInstance = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_instance")
    
    private TargetInstanceBody targetInstance = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;

    public ShowMigrationTaskResponse withTaskId(String taskId) {
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

    public ShowMigrationTaskResponse withTaskName(String taskName) {
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

    public ShowMigrationTaskResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 迁移任务描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowMigrationTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 迁移任务状态，这个字段的值包括：SUCCESS, FAILED, MIGRATING。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowMigrationTaskResponse withMigrationType(MigrationTypeEnum migrationType) {
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

    public ShowMigrationTaskResponse withMigrationMethod(MigrationMethodEnum migrationMethod) {
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

    public ShowMigrationTaskResponse withBackupFiles(BackupFilesBody backupFiles) {
        this.backupFiles = backupFiles;
        return this;
    }

    public ShowMigrationTaskResponse withBackupFiles(Consumer<BackupFilesBody> backupFilesSetter) {
        if(this.backupFiles == null ){
            this.backupFiles = new BackupFilesBody();
        }
        backupFilesSetter.accept(this.backupFiles);
        return this;
    }


    /**
     * Get backupFiles
     * @return backupFiles
     */
    public BackupFilesBody getBackupFiles() {
        return backupFiles;
    }

    public void setBackupFiles(BackupFilesBody backupFiles) {
        this.backupFiles = backupFiles;
    }

    public ShowMigrationTaskResponse withNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
        return this;
    }

    


    /**
     * 网络类型，包括vpc和vpn两种类型。
     * @return networkType
     */
    public NetworkTypeEnum getNetworkType() {
        return networkType;
    }

    public void setNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
    }

    public ShowMigrationTaskResponse withSourceInstance(SourceInstanceBody sourceInstance) {
        this.sourceInstance = sourceInstance;
        return this;
    }

    public ShowMigrationTaskResponse withSourceInstance(Consumer<SourceInstanceBody> sourceInstanceSetter) {
        if(this.sourceInstance == null ){
            this.sourceInstance = new SourceInstanceBody();
        }
        sourceInstanceSetter.accept(this.sourceInstance);
        return this;
    }


    /**
     * Get sourceInstance
     * @return sourceInstance
     */
    public SourceInstanceBody getSourceInstance() {
        return sourceInstance;
    }

    public void setSourceInstance(SourceInstanceBody sourceInstance) {
        this.sourceInstance = sourceInstance;
    }

    public ShowMigrationTaskResponse withTargetInstance(TargetInstanceBody targetInstance) {
        this.targetInstance = targetInstance;
        return this;
    }

    public ShowMigrationTaskResponse withTargetInstance(Consumer<TargetInstanceBody> targetInstanceSetter) {
        if(this.targetInstance == null ){
            this.targetInstance = new TargetInstanceBody();
        }
        targetInstanceSetter.accept(this.targetInstance);
        return this;
    }


    /**
     * Get targetInstance
     * @return targetInstance
     */
    public TargetInstanceBody getTargetInstance() {
        return targetInstance;
    }

    public void setTargetInstance(TargetInstanceBody targetInstance) {
        this.targetInstance = targetInstance;
    }

    public ShowMigrationTaskResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 迁移任务创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowMigrationTaskResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 迁移任务完成时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMigrationTaskResponse showMigrationTaskResponse = (ShowMigrationTaskResponse) o;
        return Objects.equals(this.taskId, showMigrationTaskResponse.taskId) &&
            Objects.equals(this.taskName, showMigrationTaskResponse.taskName) &&
            Objects.equals(this.description, showMigrationTaskResponse.description) &&
            Objects.equals(this.status, showMigrationTaskResponse.status) &&
            Objects.equals(this.migrationType, showMigrationTaskResponse.migrationType) &&
            Objects.equals(this.migrationMethod, showMigrationTaskResponse.migrationMethod) &&
            Objects.equals(this.backupFiles, showMigrationTaskResponse.backupFiles) &&
            Objects.equals(this.networkType, showMigrationTaskResponse.networkType) &&
            Objects.equals(this.sourceInstance, showMigrationTaskResponse.sourceInstance) &&
            Objects.equals(this.targetInstance, showMigrationTaskResponse.targetInstance) &&
            Objects.equals(this.createdAt, showMigrationTaskResponse.createdAt) &&
            Objects.equals(this.updatedAt, showMigrationTaskResponse.updatedAt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, description, status, migrationType, migrationMethod, backupFiles, networkType, sourceInstance, targetInstance, createdAt, updatedAt);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMigrationTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    migrationType: ").append(toIndentedString(migrationType)).append("\n");
        sb.append("    migrationMethod: ").append(toIndentedString(migrationMethod)).append("\n");
        sb.append("    backupFiles: ").append(toIndentedString(backupFiles)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    sourceInstance: ").append(toIndentedString(sourceInstance)).append("\n");
        sb.append("    targetInstance: ").append(toIndentedString(targetInstance)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

