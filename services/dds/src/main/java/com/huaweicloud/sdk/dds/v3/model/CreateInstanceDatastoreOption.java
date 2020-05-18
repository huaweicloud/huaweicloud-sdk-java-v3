package com.huaweicloud.sdk.dds.v3.model;

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
 * 数据库信息。
 */
public class CreateInstanceDatastoreOption  {

    /**
     * 数据库版本类型。支持DDS社区版和增强版。 取值： - 取“DDS-Community”，表示创建社区版实例。 - 取“DDS-Enhanced”，表示创建增强版实例。
     */
    public static class TypeEnum {

        
        /**
         * Enum DDS_COMMUNITY for value: "DDS-Community"
         */
        public static final TypeEnum DDS_COMMUNITY = new TypeEnum("DDS-Community");

        
        /**
         * Enum DDS_ENHANCED for value: "DDS-Enhanced"
         */
        public static final TypeEnum DDS_ENHANCED = new TypeEnum("DDS-Enhanced");

        

        public static Map<String, TypeEnum> staticFields =
                new HashMap<String, TypeEnum>() {
                    { 
                        put("DDS-Community", DDS_COMMUNITY);
                        put("DDS-Enhanced", DDS_ENHANCED);
                    }
                };

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
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
    @JsonProperty(value="version")
    
    private String version;
    /**
     * 存储引擎。DDS社区版支持WiredTiger存储引擎，DDS增强版支持RocksDB存储引擎。 取值： - 社区版引擎取“wiredTiger”。 - 增强版引擎取“rocksDB”。
     */
    public static class StorageEngineEnum {

        
        /**
         * Enum WIREDTIGER for value: "wiredTiger"
         */
        public static final StorageEngineEnum WIREDTIGER = new StorageEngineEnum("wiredTiger");

        
        /**
         * Enum ROCKSDB for value: "rocksDB"
         */
        public static final StorageEngineEnum ROCKSDB = new StorageEngineEnum("rocksDB");

        

        public static Map<String, StorageEngineEnum> staticFields =
                new HashMap<String, StorageEngineEnum>() {
                    { 
                        put("wiredTiger", WIREDTIGER);
                        put("rocksDB", ROCKSDB);
                    }
                };

        private String value;

        StorageEngineEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StorageEngineEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            StorageEngineEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new StorageEngineEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static StorageEngineEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StorageEngineEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StorageEngineEnum) {
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
    @JsonProperty(value="storage_engine")
    
    private StorageEngineEnum storageEngine;

    public CreateInstanceDatastoreOption withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 数据库版本类型。支持DDS社区版和增强版。 取值： - 取“DDS-Community”，表示创建社区版实例。 - 取“DDS-Enhanced”，表示创建增强版实例。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateInstanceDatastoreOption withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 数据库版本。DDS社区版支持3.4、3.2和4.0版本，DDS增强版仅支持3.4版本。 取值： - 社区版引擎取“3.4”、“3.2”或“4.0”。 - 增强版引擎取“3.4”。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateInstanceDatastoreOption withStorageEngine(StorageEngineEnum storageEngine) {
        this.storageEngine = storageEngine;
        return this;
    }

    


    /**
     * 存储引擎。DDS社区版支持WiredTiger存储引擎，DDS增强版支持RocksDB存储引擎。 取值： - 社区版引擎取“wiredTiger”。 - 增强版引擎取“rocksDB”。
     * @return storageEngine
     */
    public StorageEngineEnum getStorageEngine() {
        return storageEngine;
    }

    public void setStorageEngine(StorageEngineEnum storageEngine) {
        this.storageEngine = storageEngine;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceDatastoreOption createInstanceDatastoreOption = (CreateInstanceDatastoreOption) o;
        return Objects.equals(this.type, createInstanceDatastoreOption.type) &&
            Objects.equals(this.version, createInstanceDatastoreOption.version) &&
            Objects.equals(this.storageEngine, createInstanceDatastoreOption.storageEngine);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, version, storageEngine);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceDatastoreOption {\n");
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

