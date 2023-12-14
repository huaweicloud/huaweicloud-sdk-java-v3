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
 * Datastore
 */
public class Datastore {

    /**
     * 数据库引擎，不区分大小写： - MySQL - PostgreSQL - SQLServer - MariaDB
     */
    public static final class TypeEnum {

        /**
         * Enum MYSQL for value: "MySQL"
         */
        public static final TypeEnum MYSQL = new TypeEnum("MySQL");

        /**
         * Enum POSTGRESQL for value: "PostgreSQL"
         */
        public static final TypeEnum POSTGRESQL = new TypeEnum("PostgreSQL");

        /**
         * Enum SQLSERVER for value: "SQLServer"
         */
        public static final TypeEnum SQLSERVER = new TypeEnum("SQLServer");

        /**
         * Enum MARIADB for value: "MariaDB"
         */
        public static final TypeEnum MARIADB = new TypeEnum("MariaDB");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("MySQL", MYSQL);
            map.put("PostgreSQL", POSTGRESQL);
            map.put("SQLServer", SQLSERVER);
            map.put("MariaDB", MARIADB);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_version")

    private String completeVersion;

    public Datastore withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库引擎，不区分大小写： - MySQL - PostgreSQL - SQLServer - MariaDB
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
     * 数据库版本。 - MySQL引擎支持5.6、5.7、8.0版本。取值示例：5.7。具有相应权限的用户才可使用8.0，您可联系华为云客服人员申请。 - PostgreSQL引擎支持9.5、9.6、10、11版本。取值示例：9.6。 - Microsoft SQL Server：仅支持2017 企业版、2017 标准版、2017 web版、2014 标准版、2014 企业版、2016 标准版、2016 企业版、2012 企业版、2012 标准版、2012 web版、2008 R2 企业版、2008 R2 web版、2014 web版、2016 web版。取值示例2014_SE。 例如：2017标准版可填写2017_SE，2017企业版可填写2017_EE，2017web版可以填写2017_WEB
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Datastore withCompleteVersion(String completeVersion) {
        this.completeVersion = completeVersion;
        return this;
    }

    /**
     * 数据库完整版本号。仅在数据库引擎是”MySQL”和”PostgreSQL”时返回。
     * @return completeVersion
     */
    public String getCompleteVersion() {
        return completeVersion;
    }

    public void setCompleteVersion(String completeVersion) {
        this.completeVersion = completeVersion;
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
            && Objects.equals(this.completeVersion, that.completeVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version, completeVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Datastore {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    completeVersion: ").append(toIndentedString(completeVersion)).append("\n");
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
