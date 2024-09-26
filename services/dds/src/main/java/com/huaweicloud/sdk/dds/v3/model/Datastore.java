package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 数据库信息。
 */
public class Datastore {

    /**
     * 数据库版本类型。取值“DDS-Community”。
     */
    public static final class TypeEnum {

        /**
         * Enum DDS_COMMUNITY for value: "DDS-Community"
         */
        public static final TypeEnum DDS_COMMUNITY = new TypeEnum("DDS-Community");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("DDS-Community", DDS_COMMUNITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
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
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    /**
     * 存储引擎。支持WiredTiger存储引擎。取值为“wiredTiger”。
     */
    public static final class StorageEngineEnum {

        /**
         * Enum WIREDTIGER for value: "wiredTiger"
         */
        public static final StorageEngineEnum WIREDTIGER = new StorageEngineEnum("wiredTiger");

        /**
         * Enum ROCKSDB for value: "rocksDB"
         */
        public static final StorageEngineEnum ROCKSDB = new StorageEngineEnum("rocksDB");

        private static final Map<String, StorageEngineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageEngineEnum> createStaticFields() {
            Map<String, StorageEngineEnum> map = new HashMap<>();
            map.put("wiredTiger", WIREDTIGER);
            map.put("rocksDB", ROCKSDB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageEngineEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StorageEngineEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StorageEngineEnum(value));
        }

        public static StorageEngineEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StorageEngineEnum) {
                return this.value.equals(((StorageEngineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_engine")

    private StorageEngineEnum storageEngine;

    public Datastore withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库版本类型。取值“DDS-Community”。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Datastore withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 数据库版本。支持3.4及以上版本。取值为“3.4”、“4.0”、“4.2”、“4.4”、“5.0”。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Datastore withStorageEngine(StorageEngineEnum storageEngine) {
        this.storageEngine = storageEngine;
        return this;
    }

    /**
     * 存储引擎。支持WiredTiger存储引擎。取值为“wiredTiger”。
     * @return storageEngine
     */
    public StorageEngineEnum getStorageEngine() {
        return storageEngine;
    }

    public void setStorageEngine(StorageEngineEnum storageEngine) {
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
        Datastore that = (Datastore) obj;
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
        sb.append("class Datastore {\n");
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
