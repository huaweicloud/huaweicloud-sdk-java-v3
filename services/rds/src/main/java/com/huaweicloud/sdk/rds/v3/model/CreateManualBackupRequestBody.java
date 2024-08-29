package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateManualBackupRequestBody
 */
public class CreateManualBackupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<BackupDatabase> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_database_individually")

    private Boolean backupDatabaseIndividually;

    public CreateManualBackupRequestBody withInstanceId(String instanceId) {
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

    public CreateManualBackupRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 备份名称，4~64个字符，必须以英文字母开头，区分大小写，可以包含英文字母、数字、中划线或者下划线，不能包含其他特殊字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateManualBackupRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 备份描述，不能包含>!<\"&'=特殊字符，不大于256个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateManualBackupRequestBody withDatabases(List<BackupDatabase> databases) {
        this.databases = databases;
        return this;
    }

    public CreateManualBackupRequestBody addDatabasesItem(BackupDatabase databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public CreateManualBackupRequestBody withDatabases(Consumer<List<BackupDatabase>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 只支持Microsoft SQL Server，局部备份的用户自建数据库名列表，当有此参数时以局部备份为准。
     * @return databases
     */
    public List<BackupDatabase> getDatabases() {
        return databases;
    }

    public void setDatabases(List<BackupDatabase> databases) {
        this.databases = databases;
    }

    public CreateManualBackupRequestBody withBackupDatabaseIndividually(Boolean backupDatabaseIndividually) {
        this.backupDatabaseIndividually = backupDatabaseIndividually;
        return this;
    }

    /**
     * 是否分库备份，只适用于SQLServer，默认为false
     * @return backupDatabaseIndividually
     */
    public Boolean getBackupDatabaseIndividually() {
        return backupDatabaseIndividually;
    }

    public void setBackupDatabaseIndividually(Boolean backupDatabaseIndividually) {
        this.backupDatabaseIndividually = backupDatabaseIndividually;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateManualBackupRequestBody that = (CreateManualBackupRequestBody) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.databases, that.databases)
            && Objects.equals(this.backupDatabaseIndividually, that.backupDatabaseIndividually);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, name, description, databases, backupDatabaseIndividually);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateManualBackupRequestBody {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    backupDatabaseIndividually: ").append(toIndentedString(backupDatabaseIndividually)).append("\n");
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
