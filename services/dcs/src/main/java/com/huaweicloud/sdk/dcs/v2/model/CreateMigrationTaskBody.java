package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.BackupFilesBody;
import com.huaweicloud.sdk.dcs.v2.model.SourceInstanceBody;
import com.huaweicloud.sdk.dcs.v2.model.TargetInstanceBody;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 创建数据迁移任务结构体
 */
public class CreateMigrationTaskBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_name")
    
    private String taskName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 迁移任务类型,包括备份文件导入和在线迁移两种类型。 取值范围： - backupfile_import：表示备份文件导入 - online_migration：表示在线迁移。 
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
     * 迁移方式，包括全量迁移和增量迁移两种类型。 取值范围： - full_amount_migration：表示全量迁移。 - incremental_migration：表示增量迁移。 
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
    @JsonProperty(value="backup_files")
    
    private BackupFilesBody backupFiles = null;
    /**
     * 迁移任务类型为在线迁移时，表示源Redis和目标Redis联通的网络类型，包括vpc和vpn两种类型。 取值范围： - vpc - vpn 
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

        

        public static Map<String, NetworkTypeEnum> staticFields =
                new HashMap<String, NetworkTypeEnum>() {
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

    public CreateMigrationTaskBody withTaskName(String taskName) {
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

    public CreateMigrationTaskBody withDescription(String description) {
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

    public CreateMigrationTaskBody withMigrationType(MigrationTypeEnum migrationType) {
        this.migrationType = migrationType;
        return this;
    }

    


    /**
     * 迁移任务类型,包括备份文件导入和在线迁移两种类型。 取值范围： - backupfile_import：表示备份文件导入 - online_migration：表示在线迁移。 
     * @return migrationType
     */
    public MigrationTypeEnum getMigrationType() {
        return migrationType;
    }

    public void setMigrationType(MigrationTypeEnum migrationType) {
        this.migrationType = migrationType;
    }

    public CreateMigrationTaskBody withMigrationMethod(MigrationMethodEnum migrationMethod) {
        this.migrationMethod = migrationMethod;
        return this;
    }

    


    /**
     * 迁移方式，包括全量迁移和增量迁移两种类型。 取值范围： - full_amount_migration：表示全量迁移。 - incremental_migration：表示增量迁移。 
     * @return migrationMethod
     */
    public MigrationMethodEnum getMigrationMethod() {
        return migrationMethod;
    }

    public void setMigrationMethod(MigrationMethodEnum migrationMethod) {
        this.migrationMethod = migrationMethod;
    }

    public CreateMigrationTaskBody withBackupFiles(BackupFilesBody backupFiles) {
        this.backupFiles = backupFiles;
        return this;
    }

    public CreateMigrationTaskBody withBackupFiles(Consumer<BackupFilesBody> backupFilesSetter) {
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

    public CreateMigrationTaskBody withNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
        return this;
    }

    


    /**
     * 迁移任务类型为在线迁移时，表示源Redis和目标Redis联通的网络类型，包括vpc和vpn两种类型。 取值范围： - vpc - vpn 
     * @return networkType
     */
    public NetworkTypeEnum getNetworkType() {
        return networkType;
    }

    public void setNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
    }

    public CreateMigrationTaskBody withSourceInstance(SourceInstanceBody sourceInstance) {
        this.sourceInstance = sourceInstance;
        return this;
    }

    public CreateMigrationTaskBody withSourceInstance(Consumer<SourceInstanceBody> sourceInstanceSetter) {
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

    public CreateMigrationTaskBody withTargetInstance(TargetInstanceBody targetInstance) {
        this.targetInstance = targetInstance;
        return this;
    }

    public CreateMigrationTaskBody withTargetInstance(Consumer<TargetInstanceBody> targetInstanceSetter) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMigrationTaskBody createMigrationTaskBody = (CreateMigrationTaskBody) o;
        return Objects.equals(this.taskName, createMigrationTaskBody.taskName) &&
            Objects.equals(this.description, createMigrationTaskBody.description) &&
            Objects.equals(this.migrationType, createMigrationTaskBody.migrationType) &&
            Objects.equals(this.migrationMethod, createMigrationTaskBody.migrationMethod) &&
            Objects.equals(this.backupFiles, createMigrationTaskBody.backupFiles) &&
            Objects.equals(this.networkType, createMigrationTaskBody.networkType) &&
            Objects.equals(this.sourceInstance, createMigrationTaskBody.sourceInstance) &&
            Objects.equals(this.targetInstance, createMigrationTaskBody.targetInstance);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskName, description, migrationType, migrationMethod, backupFiles, networkType, sourceInstance, targetInstance);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMigrationTaskBody {\n");
            sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    migrationType: ").append(toIndentedString(migrationType)).append("\n");
            sb.append("    migrationMethod: ").append(toIndentedString(migrationMethod)).append("\n");
            sb.append("    backupFiles: ").append(toIndentedString(backupFiles)).append("\n");
            sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
            sb.append("    sourceInstance: ").append(toIndentedString(sourceInstance)).append("\n");
            sb.append("    targetInstance: ").append(toIndentedString(targetInstance)).append("\n");
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

