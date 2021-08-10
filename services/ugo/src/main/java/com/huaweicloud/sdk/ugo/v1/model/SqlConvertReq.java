package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** SQL翻译请求 */
public class SqlConvertReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db")

    private String sourceDb;

    /** 源数据库版本 */
    public static final class SourceDbVersionEnum {

        /** Enum _11G for value: "11g" */
        public static final SourceDbVersionEnum _11G = new SourceDbVersionEnum("11g");

        /** Enum _12C for value: "12c" */
        public static final SourceDbVersionEnum _12C = new SourceDbVersionEnum("12c");

        /** Enum _18C for value: "18c" */
        public static final SourceDbVersionEnum _18C = new SourceDbVersionEnum("18c");

        /** Enum _19C for value: "19c" */
        public static final SourceDbVersionEnum _19C = new SourceDbVersionEnum("19c");

        private static final Map<String, SourceDbVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceDbVersionEnum> createStaticFields() {
            Map<String, SourceDbVersionEnum> map = new HashMap<>();
            map.put("11g", _11G);
            map.put("12c", _12C);
            map.put("18c", _18C);
            map.put("19c", _19C);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceDbVersionEnum(String value) {
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
        public static SourceDbVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SourceDbVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SourceDbVersionEnum(value);
            }
            return result;
        }

        public static SourceDbVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SourceDbVersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceDbVersionEnum) {
                return this.value.equals(((SourceDbVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_version")

    private SourceDbVersionEnum sourceDbVersion;

    /** 目标数据库类型 */
    public static final class TargetDbEnum {

        /** Enum RDS_FOR_MYSQL for value: "RDS for MySQL" */
        public static final TargetDbEnum RDS_FOR_MYSQL = new TargetDbEnum("RDS for MySQL");

        /** Enum GAUSSDB_FOR_OPENGAUSS_ for value: "GaussDB(for openGauss)" */
        public static final TargetDbEnum GAUSSDB_FOR_OPENGAUSS_ = new TargetDbEnum("GaussDB(for openGauss)");

        /** Enum GAUSSDB_FOR_MYSQL_ for value: "GaussDB(for MySQL)" */
        public static final TargetDbEnum GAUSSDB_FOR_MYSQL_ = new TargetDbEnum("GaussDB(for MySQL)");

        /** Enum RDS_FOR_POSTGRESQL for value: "RDS for PostgreSQL" */
        public static final TargetDbEnum RDS_FOR_POSTGRESQL = new TargetDbEnum("RDS for PostgreSQL");

        private static final Map<String, TargetDbEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetDbEnum> createStaticFields() {
            Map<String, TargetDbEnum> map = new HashMap<>();
            map.put("RDS for MySQL", RDS_FOR_MYSQL);
            map.put("GaussDB(for openGauss)", GAUSSDB_FOR_OPENGAUSS_);
            map.put("GaussDB(for MySQL)", GAUSSDB_FOR_MYSQL_);
            map.put("RDS for PostgreSQL", RDS_FOR_POSTGRESQL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetDbEnum(String value) {
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
        public static TargetDbEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TargetDbEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TargetDbEnum(value);
            }
            return result;
        }

        public static TargetDbEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TargetDbEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetDbEnum) {
                return this.value.equals(((TargetDbEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db")

    private TargetDbEnum targetDb;

    /** 目标数据库版本 */
    public static final class TargetDbVersionEnum {

        /** Enum _5_7 for value: "5.7" */
        public static final TargetDbVersionEnum _5_7 = new TargetDbVersionEnum("5.7");

        /** Enum _8_0 for value: "8.0" */
        public static final TargetDbVersionEnum _8_0 = new TargetDbVersionEnum("8.0");

        /** Enum _11 for value: "11" */
        public static final TargetDbVersionEnum _11 = new TargetDbVersionEnum("11");

        /** Enum _2020 for value: "2020" */
        public static final TargetDbVersionEnum _2020 = new TargetDbVersionEnum("2020");

        /** Enum ENHANCED_EDITION for value: "Enhanced Edition" */
        public static final TargetDbVersionEnum ENHANCED_EDITION = new TargetDbVersionEnum("Enhanced Edition");

        private static final Map<String, TargetDbVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetDbVersionEnum> createStaticFields() {
            Map<String, TargetDbVersionEnum> map = new HashMap<>();
            map.put("5.7", _5_7);
            map.put("8.0", _8_0);
            map.put("11", _11);
            map.put("2020", _2020);
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
    @JsonProperty(value = "statement")

    private String statement;

    public SqlConvertReq withSourceDb(String sourceDb) {
        this.sourceDb = sourceDb;
        return this;
    }

    /** 源数据库类型
     * 
     * @return sourceDb */
    public String getSourceDb() {
        return sourceDb;
    }

    public void setSourceDb(String sourceDb) {
        this.sourceDb = sourceDb;
    }

    public SqlConvertReq withSourceDbVersion(SourceDbVersionEnum sourceDbVersion) {
        this.sourceDbVersion = sourceDbVersion;
        return this;
    }

    /** 源数据库版本
     * 
     * @return sourceDbVersion */
    public SourceDbVersionEnum getSourceDbVersion() {
        return sourceDbVersion;
    }

    public void setSourceDbVersion(SourceDbVersionEnum sourceDbVersion) {
        this.sourceDbVersion = sourceDbVersion;
    }

    public SqlConvertReq withTargetDb(TargetDbEnum targetDb) {
        this.targetDb = targetDb;
        return this;
    }

    /** 目标数据库类型
     * 
     * @return targetDb */
    public TargetDbEnum getTargetDb() {
        return targetDb;
    }

    public void setTargetDb(TargetDbEnum targetDb) {
        this.targetDb = targetDb;
    }

    public SqlConvertReq withTargetDbVersion(TargetDbVersionEnum targetDbVersion) {
        this.targetDbVersion = targetDbVersion;
        return this;
    }

    /** 目标数据库版本
     * 
     * @return targetDbVersion */
    public TargetDbVersionEnum getTargetDbVersion() {
        return targetDbVersion;
    }

    public void setTargetDbVersion(TargetDbVersionEnum targetDbVersion) {
        this.targetDbVersion = targetDbVersion;
    }

    public SqlConvertReq withStatement(String statement) {
        this.statement = statement;
        return this;
    }

    /** 需要转换的SQL语句
     * 
     * @return statement */
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
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
        return Objects.equals(this.sourceDb, sqlConvertReq.sourceDb)
            && Objects.equals(this.sourceDbVersion, sqlConvertReq.sourceDbVersion)
            && Objects.equals(this.targetDb, sqlConvertReq.targetDb)
            && Objects.equals(this.targetDbVersion, sqlConvertReq.targetDbVersion)
            && Objects.equals(this.statement, sqlConvertReq.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDb, sourceDbVersion, targetDb, targetDbVersion, statement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlConvertReq {\n");
        sb.append("    sourceDb: ").append(toIndentedString(sourceDb)).append("\n");
        sb.append("    sourceDbVersion: ").append(toIndentedString(sourceDbVersion)).append("\n");
        sb.append("    targetDb: ").append(toIndentedString(targetDb)).append("\n");
        sb.append("    targetDbVersion: ").append(toIndentedString(targetDbVersion)).append("\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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
