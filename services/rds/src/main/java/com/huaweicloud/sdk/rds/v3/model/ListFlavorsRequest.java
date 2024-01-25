package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListFlavorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

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

        /**
         * Enum MARIADB for value: "MariaDB"
         */
        public static final DatabaseNameEnum MARIADB = new DatabaseNameEnum("MariaDB");

        private static final Map<String, DatabaseNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatabaseNameEnum> createStaticFields() {
            Map<String, DatabaseNameEnum> map = new HashMap<>();
            map.put("MySQL", MYSQL);
            map.put("PostgreSQL", POSTGRESQL);
            map.put("SQLServer", SQLSERVER);
            map.put("MariaDB", MARIADB);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DatabaseNameEnum(value));
        }

        public static DatabaseNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private DatabaseNameEnum databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    private String versionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_serverless")

    private String isServerless;

    public ListFlavorsRequest withXLanguage(String xLanguage) {
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

    public ListFlavorsRequest withDatabaseName(DatabaseNameEnum databaseName) {
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

    public ListFlavorsRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * 数据库版本号，获取方法请参见5.1查询数据库引擎的版本。（可输入小版本号）
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public ListFlavorsRequest withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格编码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ListFlavorsRequest withIsServerless(String isServerless) {
        this.isServerless = isServerless;
        return this;
    }

    /**
     * 是否查询serverless规格。取值范围如下，区分大小写： true：查询serverless规格 false：查询非serverless规格 默认值 false。
     * @return isServerless
     */
    public String getIsServerless() {
        return isServerless;
    }

    public void setIsServerless(String isServerless) {
        this.isServerless = isServerless;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFlavorsRequest that = (ListFlavorsRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.versionName, that.versionName) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.isServerless, that.isServerless);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, databaseName, versionName, specCode, isServerless);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    isServerless: ").append(toIndentedString(isServerless)).append("\n");
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
