package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * {\&quot;originalSql\&quot;:\&quot;select * from das_conn_info\&quot;,\&quot;useTemplate\&quot;:true,\&quot;keepOperators\&quot;:true}
 */
public class ParseSqlLimitRulesReq {

    /**
     * 数据库类型，目前支持MySQL、MariaDB、GaussDB(for MySQL)三种引擎。
     */
    public static final class DatastoreTypeEnum {

        /**
         * Enum MYSQL for value: "MySQL"
         */
        public static final DatastoreTypeEnum MYSQL = new DatastoreTypeEnum("MySQL");

        /**
         * Enum MARIADB for value: "MariaDB"
         */
        public static final DatastoreTypeEnum MARIADB = new DatastoreTypeEnum("MariaDB");

        /**
         * Enum GAUSSDB_FOR_MYSQL_ for value: "GaussDB(for MySQL)"
         */
        public static final DatastoreTypeEnum GAUSSDB_FOR_MYSQL_ = new DatastoreTypeEnum("GaussDB(for MySQL)");

        private static final Map<String, DatastoreTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatastoreTypeEnum> createStaticFields() {
            Map<String, DatastoreTypeEnum> map = new HashMap<>();
            map.put("MySQL", MYSQL);
            map.put("MariaDB", MARIADB);
            map.put("GaussDB(for MySQL)", GAUSSDB_FOR_MYSQL_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatastoreTypeEnum(String value) {
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
        public static DatastoreTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DatastoreTypeEnum(value));
        }

        public static DatastoreTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatastoreTypeEnum) {
                return this.value.equals(((DatastoreTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private DatastoreTypeEnum datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_sql")

    private String originalSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_template")

    private Boolean useTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_operators")

    private Boolean keepOperators;

    public ParseSqlLimitRulesReq withDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库类型，目前支持MySQL、MariaDB、GaussDB(for MySQL)三种引擎。
     * @return datastoreType
     */
    public DatastoreTypeEnum getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ParseSqlLimitRulesReq withOriginalSql(String originalSql) {
        this.originalSql = originalSql;
        return this;
    }

    /**
     * 原始SQL语句
     * @return originalSql
     */
    public String getOriginalSql() {
        return originalSql;
    }

    public void setOriginalSql(String originalSql) {
        this.originalSql = originalSql;
    }

    public ParseSqlLimitRulesReq withUseTemplate(Boolean useTemplate) {
        this.useTemplate = useTemplate;
        return this;
    }

    /**
     * 是否校验SQL语句
     * @return useTemplate
     */
    public Boolean getUseTemplate() {
        return useTemplate;
    }

    public void setUseTemplate(Boolean useTemplate) {
        this.useTemplate = useTemplate;
    }

    public ParseSqlLimitRulesReq withKeepOperators(Boolean keepOperators) {
        this.keepOperators = keepOperators;
        return this;
    }

    /**
     * 是否保留操作符
     * @return keepOperators
     */
    public Boolean getKeepOperators() {
        return keepOperators;
    }

    public void setKeepOperators(Boolean keepOperators) {
        this.keepOperators = keepOperators;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParseSqlLimitRulesReq that = (ParseSqlLimitRulesReq) obj;
        return Objects.equals(this.datastoreType, that.datastoreType)
            && Objects.equals(this.originalSql, that.originalSql) && Objects.equals(this.useTemplate, that.useTemplate)
            && Objects.equals(this.keepOperators, that.keepOperators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreType, originalSql, useTemplate, keepOperators);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParseSqlLimitRulesReq {\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    originalSql: ").append(toIndentedString(originalSql)).append("\n");
        sb.append("    useTemplate: ").append(toIndentedString(useTemplate)).append("\n");
        sb.append("    keepOperators: ").append(toIndentedString(keepOperators)).append("\n");
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
