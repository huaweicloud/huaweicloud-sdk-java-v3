package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** RestoreInstanceFromCollectionRequestBodyRestoreCollections */
public class RestoreInstanceFromCollectionRequestBodyRestoreCollections {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_database_time")

    private String restoreDatabaseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collections")

    private List<RestoreInstanceFromCollectionRequestBodyCollections> collections = null;

    public RestoreInstanceFromCollectionRequestBodyRestoreCollections withDatabase(String database) {
        this.database = database;
        return this;
    }

    /** 数据库名称。
     * 
     * @return database */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public RestoreInstanceFromCollectionRequestBodyRestoreCollections withRestoreDatabaseTime(
        String restoreDatabaseTime) {
        this.restoreDatabaseTime = restoreDatabaseTime;
        return this;
    }

    /** 数据库恢复时间点。如果是数据库级恢复，该参数必传，UNIX时间戳格式，单位是毫秒，时区是UTC。
     * 
     * @return restoreDatabaseTime */
    public String getRestoreDatabaseTime() {
        return restoreDatabaseTime;
    }

    public void setRestoreDatabaseTime(String restoreDatabaseTime) {
        this.restoreDatabaseTime = restoreDatabaseTime;
    }

    public RestoreInstanceFromCollectionRequestBodyRestoreCollections withCollections(
        List<RestoreInstanceFromCollectionRequestBodyCollections> collections) {
        this.collections = collections;
        return this;
    }

    public RestoreInstanceFromCollectionRequestBodyRestoreCollections addCollectionsItem(
        RestoreInstanceFromCollectionRequestBodyCollections collectionsItem) {
        if (this.collections == null) {
            this.collections = new ArrayList<>();
        }
        this.collections.add(collectionsItem);
        return this;
    }

    public RestoreInstanceFromCollectionRequestBodyRestoreCollections withCollections(
        Consumer<List<RestoreInstanceFromCollectionRequestBodyCollections>> collectionsSetter) {
        if (this.collections == null) {
            this.collections = new ArrayList<>();
        }
        collectionsSetter.accept(this.collections);
        return this;
    }

    /** 集合信息。
     * 
     * @return collections */
    public List<RestoreInstanceFromCollectionRequestBodyCollections> getCollections() {
        return collections;
    }

    public void setCollections(List<RestoreInstanceFromCollectionRequestBodyCollections> collections) {
        this.collections = collections;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreInstanceFromCollectionRequestBodyRestoreCollections restoreInstanceFromCollectionRequestBodyRestoreCollections =
            (RestoreInstanceFromCollectionRequestBodyRestoreCollections) o;
        return Objects.equals(this.database, restoreInstanceFromCollectionRequestBodyRestoreCollections.database)
            && Objects.equals(this.restoreDatabaseTime,
                restoreInstanceFromCollectionRequestBodyRestoreCollections.restoreDatabaseTime)
            && Objects.equals(this.collections, restoreInstanceFromCollectionRequestBodyRestoreCollections.collections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, restoreDatabaseTime, collections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreInstanceFromCollectionRequestBodyRestoreCollections {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    restoreDatabaseTime: ").append(toIndentedString(restoreDatabaseTime)).append("\n");
        sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
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
