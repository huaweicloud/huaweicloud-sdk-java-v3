package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SQL语句转换的请求体。
 */
public class SqlConvertReq {

    /**
     * 源数据库类型。
     */
    public static final class SourceDbTypeEnum {

        /**
         * Enum ORACLE for value: "ORACLE"
         */
        public static final SourceDbTypeEnum ORACLE = new SourceDbTypeEnum("ORACLE");

        private static final Map<String, SourceDbTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceDbTypeEnum> createStaticFields() {
            Map<String, SourceDbTypeEnum> map = new HashMap<>();
            map.put("ORACLE", ORACLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceDbTypeEnum(String value) {
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
        public static SourceDbTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SourceDbTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SourceDbTypeEnum(value);
            }
            return result;
        }

        public static SourceDbTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SourceDbTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceDbTypeEnum) {
                return this.value.equals(((SourceDbTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_type")

    private SourceDbTypeEnum sourceDbType;

    /**
     * 目标数据库类型。其中GaussDB Centralized已弃用。
     */
    public static final class TargetDbTypeEnum {

        /**
         * Enum RDS_FOR_MYSQL for value: "RDS for MySQL"
         */
        public static final TargetDbTypeEnum RDS_FOR_MYSQL = new TargetDbTypeEnum("RDS for MySQL");

        /**
         * Enum GAUSSDB_FOR_MYSQL_ for value: "GaussDB(for MySQL)"
         */
        public static final TargetDbTypeEnum GAUSSDB_FOR_MYSQL_ = new TargetDbTypeEnum("GaussDB(for MySQL)");

        /**
         * Enum RDS_FOR_POSTGRESQL for value: "RDS for PostgreSQL"
         */
        public static final TargetDbTypeEnum RDS_FOR_POSTGRESQL = new TargetDbTypeEnum("RDS for PostgreSQL");

        /**
         * Enum GAUSSDB_PRIMARY_STANDBY for value: "GaussDB Primary/Standby"
         */
        public static final TargetDbTypeEnum GAUSSDB_PRIMARY_STANDBY = new TargetDbTypeEnum("GaussDB Primary/Standby");

        /**
         * Enum GAUSSDB_CENTRALIZED for value: "GaussDB Centralized"
         */
        public static final TargetDbTypeEnum GAUSSDB_CENTRALIZED = new TargetDbTypeEnum("GaussDB Centralized");

        private static final Map<String, TargetDbTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetDbTypeEnum> createStaticFields() {
            Map<String, TargetDbTypeEnum> map = new HashMap<>();
            map.put("RDS for MySQL", RDS_FOR_MYSQL);
            map.put("GaussDB(for MySQL)", GAUSSDB_FOR_MYSQL_);
            map.put("RDS for PostgreSQL", RDS_FOR_POSTGRESQL);
            map.put("GaussDB Primary/Standby", GAUSSDB_PRIMARY_STANDBY);
            map.put("GaussDB Centralized", GAUSSDB_CENTRALIZED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetDbTypeEnum(String value) {
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
        public static TargetDbTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TargetDbTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TargetDbTypeEnum(value);
            }
            return result;
        }

        public static TargetDbTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TargetDbTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetDbTypeEnum) {
                return this.value.equals(((TargetDbTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_type")

    private TargetDbTypeEnum targetDbType;

    /**
     * 目标数据库版本。 （注意：该字段需要与 target_db_type 字段组合成有效的目标数据库类型与版本，当前支持以下组合： GaussDB Centralized-2.0（已弃用）； GaussDB Primary/Standby-2.0； RDS for PostgreSQL-11； RDS for PostgreSQL-Enhanced Edition； RDS for MySQL-5.7; GaussDB(for MySQL) 8.0。)
     */
    public static final class TargetDbVersionEnum {

        /**
         * Enum _5_7 for value: "5.7"
         */
        public static final TargetDbVersionEnum _5_7 = new TargetDbVersionEnum("5.7");

        /**
         * Enum _8_0 for value: "8.0"
         */
        public static final TargetDbVersionEnum _8_0 = new TargetDbVersionEnum("8.0");

        /**
         * Enum _11 for value: "11"
         */
        public static final TargetDbVersionEnum _11 = new TargetDbVersionEnum("11");

        /**
         * Enum _2_0 for value: "2.0"
         */
        public static final TargetDbVersionEnum _2_0 = new TargetDbVersionEnum("2.0");

        /**
         * Enum ENHANCED_EDITION for value: "Enhanced Edition"
         */
        public static final TargetDbVersionEnum ENHANCED_EDITION = new TargetDbVersionEnum("Enhanced Edition");

        private static final Map<String, TargetDbVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetDbVersionEnum> createStaticFields() {
            Map<String, TargetDbVersionEnum> map = new HashMap<>();
            map.put("5.7", _5_7);
            map.put("8.0", _8_0);
            map.put("11", _11);
            map.put("2.0", _2_0);
            map.put("Enhanced Edition", ENHANCED_EDITION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetDbVersionEnum(String value) {
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
        public static TargetDbVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TargetDbVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TargetDbVersionEnum(value);
            }
            return result;
        }

        public static TargetDbVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TargetDbVersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetDbVersionEnum) {
                return this.value.equals(((TargetDbVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_version")

    private TargetDbVersionEnum targetDbVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statement")

    private String sqlStatement;

    public SqlConvertReq withSourceDbType(SourceDbTypeEnum sourceDbType) {
        this.sourceDbType = sourceDbType;
        return this;
    }

    /**
     * 源数据库类型。
     * @return sourceDbType
     */
    public SourceDbTypeEnum getSourceDbType() {
        return sourceDbType;
    }

    public void setSourceDbType(SourceDbTypeEnum sourceDbType) {
        this.sourceDbType = sourceDbType;
    }

    public SqlConvertReq withTargetDbType(TargetDbTypeEnum targetDbType) {
        this.targetDbType = targetDbType;
        return this;
    }

    /**
     * 目标数据库类型。其中GaussDB Centralized已弃用。
     * @return targetDbType
     */
    public TargetDbTypeEnum getTargetDbType() {
        return targetDbType;
    }

    public void setTargetDbType(TargetDbTypeEnum targetDbType) {
        this.targetDbType = targetDbType;
    }

    public SqlConvertReq withTargetDbVersion(TargetDbVersionEnum targetDbVersion) {
        this.targetDbVersion = targetDbVersion;
        return this;
    }

    /**
     * 目标数据库版本。 （注意：该字段需要与 target_db_type 字段组合成有效的目标数据库类型与版本，当前支持以下组合： GaussDB Centralized-2.0（已弃用）； GaussDB Primary/Standby-2.0； RDS for PostgreSQL-11； RDS for PostgreSQL-Enhanced Edition； RDS for MySQL-5.7; GaussDB(for MySQL) 8.0。)
     * @return targetDbVersion
     */
    public TargetDbVersionEnum getTargetDbVersion() {
        return targetDbVersion;
    }

    public void setTargetDbVersion(TargetDbVersionEnum targetDbVersion) {
        this.targetDbVersion = targetDbVersion;
    }

    public SqlConvertReq withSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
        return this;
    }

    /**
     * 需要转换的SQL语句。
     * @return sqlStatement
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqlConvertReq sqlConvertReq = (SqlConvertReq) o;
        return Objects.equals(this.sourceDbType, sqlConvertReq.sourceDbType)
            && Objects.equals(this.targetDbType, sqlConvertReq.targetDbType)
            && Objects.equals(this.targetDbVersion, sqlConvertReq.targetDbVersion)
            && Objects.equals(this.sqlStatement, sqlConvertReq.sqlStatement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDbType, targetDbType, targetDbVersion, sqlStatement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlConvertReq {\n");
        sb.append("    sourceDbType: ").append(toIndentedString(sourceDbType)).append("\n");
        sb.append("    targetDbType: ").append(toIndentedString(targetDbType)).append("\n");
        sb.append("    targetDbVersion: ").append(toIndentedString(targetDbVersion)).append("\n");
        sb.append("    sqlStatement: ").append(toIndentedString(sqlStatement)).append("\n");
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
