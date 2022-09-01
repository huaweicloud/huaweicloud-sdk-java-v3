package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListStorageTypesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    @JacksonXmlProperty(localName = "X-Language")

    private String xLanguage;

    /**
     * 数据库引擎。支持的引擎如下，不区分大小写： MySQL PostgreSQL SQLServer
     */
    public static final class DatabaseNameEnum {

        /**
         * Enum MYSQL for value: "MySQL"
         */
        public static final DatabaseNameEnum MYSQL = new DatabaseNameEnum("MySQL");

        /**
         * Enum POSTGRESQL for value: "PostgreSQL"
         */
        public static final DatabaseNameEnum POSTGRESQL = new DatabaseNameEnum("PostgreSQL");

        /**
         * Enum SQLSERVER for value: "SQLServer"
         */
        public static final DatabaseNameEnum SQLSERVER = new DatabaseNameEnum("SQLServer");

        private static final Map<String, DatabaseNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatabaseNameEnum> createStaticFields() {
            Map<String, DatabaseNameEnum> map = new HashMap<>();
            map.put("MySQL", MYSQL);
            map.put("PostgreSQL", POSTGRESQL);
            map.put("SQLServer", SQLSERVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatabaseNameEnum(String value) {
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
        public static DatabaseNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DatabaseNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DatabaseNameEnum(value);
            }
            return result;
        }

        public static DatabaseNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DatabaseNameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatabaseNameEnum) {
                return this.value.equals(((DatabaseNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    @JacksonXmlProperty(localName = "database_name")

    private DatabaseNameEnum databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    @JacksonXmlProperty(localName = "version_name")

    private String versionName;

    /**
     * 主备模式： single：单机模式。 ha：主备模式。 replica：只读模式。
     */
    public static final class HaModeEnum {

        /**
         * Enum HA for value: "ha"
         */
        public static final HaModeEnum HA = new HaModeEnum("ha");

        /**
         * Enum SINGLE for value: "single"
         */
        public static final HaModeEnum SINGLE = new HaModeEnum("single");

        /**
         * Enum REPLICA for value: "replica"
         */
        public static final HaModeEnum REPLICA = new HaModeEnum("replica");

        private static final Map<String, HaModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HaModeEnum> createStaticFields() {
            Map<String, HaModeEnum> map = new HashMap<>();
            map.put("ha", HA);
            map.put("single", SINGLE);
            map.put("replica", REPLICA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HaModeEnum(String value) {
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
        public static HaModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            HaModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new HaModeEnum(value);
            }
            return result;
        }

        public static HaModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            HaModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HaModeEnum) {
                return this.value.equals(((HaModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_mode")

    @JacksonXmlProperty(localName = "ha_mode")

    private HaModeEnum haMode;

    public ListStorageTypesRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListStorageTypesRequest withDatabaseName(DatabaseNameEnum databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库引擎。支持的引擎如下，不区分大小写： MySQL PostgreSQL SQLServer
     * @return databaseName
     */
    public DatabaseNameEnum getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(DatabaseNameEnum databaseName) {
        this.databaseName = databaseName;
    }

    public ListStorageTypesRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * 数据库版本号。
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public ListStorageTypesRequest withHaMode(HaModeEnum haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * 主备模式： single：单机模式。 ha：主备模式。 replica：只读模式。
     * @return haMode
     */
    public HaModeEnum getHaMode() {
        return haMode;
    }

    public void setHaMode(HaModeEnum haMode) {
        this.haMode = haMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStorageTypesRequest listStorageTypesRequest = (ListStorageTypesRequest) o;
        return Objects.equals(this.xLanguage, listStorageTypesRequest.xLanguage)
            && Objects.equals(this.databaseName, listStorageTypesRequest.databaseName)
            && Objects.equals(this.versionName, listStorageTypesRequest.versionName)
            && Objects.equals(this.haMode, listStorageTypesRequest.haMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, databaseName, versionName, haMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStorageTypesRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
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
