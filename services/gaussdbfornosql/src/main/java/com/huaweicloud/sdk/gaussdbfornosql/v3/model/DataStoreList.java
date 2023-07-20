package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DataStoreList
 */
public class DataStoreList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_name")

    private String datastoreName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    public DataStoreList withDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    /**
     * 数据库引擎。
     * @return datastoreName
     */
    public String getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    public DataStoreList withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 数据库引擎版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DataStoreList withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 实例类型。 取值为“Cluster”，表示GaussDB(for Cassandra)、GaussDB(for Influx)、GaussDB(for Redis)集群实例类型。 取值为“InfluxdbSingle”，表示GaussDB(for Influx)单节点实例类型。 取值为“ReplicaSet”，表示GaussDB(for Mongo)副本集实例类型。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataStoreList that = (DataStoreList) obj;
        return Objects.equals(this.datastoreName, that.datastoreName) && Objects.equals(this.version, that.version)
            && Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreName, version, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataStoreList {\n");
        sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
