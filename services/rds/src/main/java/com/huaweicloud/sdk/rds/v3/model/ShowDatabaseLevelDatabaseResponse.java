package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDatabaseLevelDatabaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<DatabaseBackupInfo> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_limit")

    private Integer databaseLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    public ShowDatabaseLevelDatabaseResponse withDatabases(List<DatabaseBackupInfo> databases) {
        this.databases = databases;
        return this;
    }

    public ShowDatabaseLevelDatabaseResponse addDatabasesItem(DatabaseBackupInfo databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ShowDatabaseLevelDatabaseResponse withDatabases(Consumer<List<DatabaseBackupInfo>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 库信息列表
     * @return databases
     */
    public List<DatabaseBackupInfo> getDatabases() {
        return databases;
    }

    public void setDatabases(List<DatabaseBackupInfo> databases) {
        this.databases = databases;
    }

    public ShowDatabaseLevelDatabaseResponse withDatabaseLimit(Integer databaseLimit) {
        this.databaseLimit = databaseLimit;
        return this;
    }

    /**
     * 可恢复库的个数
     * @return databaseLimit
     */
    public Integer getDatabaseLimit() {
        return databaseLimit;
    }

    public void setDatabaseLimit(Integer databaseLimit) {
        this.databaseLimit = databaseLimit;
    }

    public ShowDatabaseLevelDatabaseResponse withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * obs桶名
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDatabaseLevelDatabaseResponse that = (ShowDatabaseLevelDatabaseResponse) obj;
        return Objects.equals(this.databases, that.databases) && Objects.equals(this.databaseLimit, that.databaseLimit)
            && Objects.equals(this.bucketName, that.bucketName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databases, databaseLimit, bucketName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatabaseLevelDatabaseResponse {\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    databaseLimit: ").append(toIndentedString(databaseLimit)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
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
