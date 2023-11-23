package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DatastoreOption
 */
public class DatastoreOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_engine")

    private String storageEngine;

    public DatastoreOption withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库类型。 - 支持GeminiDB Cassandra，GeminiDB Mongo，GeminiDB Influx数据库实例。 - 取值为“cassandra”，表示创建GeminiDB Cassandra数据库实例。 - 取值为“mongodb”，表示创建GeminiDB Mongo数据库实例。 - 取值为“influxdb”，表示创建GeminiDB Influx数据库实例。 - 取值为“redis”，表示创建GeminiDB Redis数据库实例。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DatastoreOption withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 数据库版本。 - GeminiDB Cassandra实例支持3.11版本，取值为“3.11”。 - GeminiDB Mongo实例支持3.4，4.0版本，取值为\"3.4\"或\"4.0\"。 - GeminiDB Influx实例支持1.7版本，取值为“1.7”。 - GeminiDB Redis实例支持5.0版本，取值为“5.0”。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DatastoreOption withStorageEngine(String storageEngine) {
        this.storageEngine = storageEngine;
        return this;
    }

    /**
     * 存储引擎。 - GeminiDB Cassandra实例支持RocksDB存储引擎，取值为“rocksDB”。 - GeminiDB Mongo实例支持RocksDB存储引擎，取值为“rocksDB”。 - GeminiDB Influx实例支持RocksDB存储引擎，取值为“rocksDB”。 - GeminiDB Redis实例支持RocksDB存储引擎，取值为“rocksDB”。
     * @return storageEngine
     */
    public String getStorageEngine() {
        return storageEngine;
    }

    public void setStorageEngine(String storageEngine) {
        this.storageEngine = storageEngine;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatastoreOption that = (DatastoreOption) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.storageEngine, that.storageEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version, storageEngine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatastoreOption {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    storageEngine: ").append(toIndentedString(storageEngine)).append("\n");
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
