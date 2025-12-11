package com.huaweicloud.sdk.dbss.v1.model;

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
public class ListRdsDatabasesRequest {

    /**
     * **参数解释**： 数据库类型 **约束限制**： 区分大小写，只能传递取值范围内的值 **取值范围**：   - MYSQL: Mysql   - ORACLE: Oracle   - POSTGRESQL: PostgreSQL   - SQLSERVER: SQL Server   - DAMENG: DAMENG   - TAURUS: TaurusDB   - DWS: GaussDB DWS   - KINGBASE: KINGBASE   - MARIADB: MariaDB   - GAUSSDBOPENGAUSS: GaussDB/openGauss **默认取值**： 不涉及 
     */
    public static final class DbTypeEnum {

        /**
         * Enum MYSQL for value: "MYSQL"
         */
        public static final DbTypeEnum MYSQL = new DbTypeEnum("MYSQL");

        /**
         * Enum ORACLE for value: "ORACLE"
         */
        public static final DbTypeEnum ORACLE = new DbTypeEnum("ORACLE");

        /**
         * Enum POSTGRESQL for value: "POSTGRESQL"
         */
        public static final DbTypeEnum POSTGRESQL = new DbTypeEnum("POSTGRESQL");

        /**
         * Enum SQLSERVER for value: "SQLSERVER"
         */
        public static final DbTypeEnum SQLSERVER = new DbTypeEnum("SQLSERVER");

        /**
         * Enum DAMENG for value: "DAMENG"
         */
        public static final DbTypeEnum DAMENG = new DbTypeEnum("DAMENG");

        /**
         * Enum TAURUS for value: "TAURUS"
         */
        public static final DbTypeEnum TAURUS = new DbTypeEnum("TAURUS");

        /**
         * Enum DWS for value: "DWS"
         */
        public static final DbTypeEnum DWS = new DbTypeEnum("DWS");

        /**
         * Enum KINGBASE for value: "KINGBASE"
         */
        public static final DbTypeEnum KINGBASE = new DbTypeEnum("KINGBASE");

        /**
         * Enum MARIADB for value: "MARIADB"
         */
        public static final DbTypeEnum MARIADB = new DbTypeEnum("MARIADB");

        /**
         * Enum GAUSSDBOPENGAUSS for value: "GAUSSDBOPENGAUSS"
         */
        public static final DbTypeEnum GAUSSDBOPENGAUSS = new DbTypeEnum("GAUSSDBOPENGAUSS");

        private static final Map<String, DbTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DbTypeEnum> createStaticFields() {
            Map<String, DbTypeEnum> map = new HashMap<>();
            map.put("MYSQL", MYSQL);
            map.put("ORACLE", ORACLE);
            map.put("POSTGRESQL", POSTGRESQL);
            map.put("SQLSERVER", SQLSERVER);
            map.put("DAMENG", DAMENG);
            map.put("TAURUS", TAURUS);
            map.put("DWS", DWS);
            map.put("KINGBASE", KINGBASE);
            map.put("MARIADB", MARIADB);
            map.put("GAUSSDBOPENGAUSS", GAUSSDBOPENGAUSS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DbTypeEnum(String value) {
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
        public static DbTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DbTypeEnum(value));
        }

        public static DbTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DbTypeEnum) {
                return this.value.equals(((DbTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_type")

    private DbTypeEnum dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    public ListRdsDatabasesRequest withDbType(DbTypeEnum dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * **参数解释**： 数据库类型 **约束限制**： 区分大小写，只能传递取值范围内的值 **取值范围**：   - MYSQL: Mysql   - ORACLE: Oracle   - POSTGRESQL: PostgreSQL   - SQLSERVER: SQL Server   - DAMENG: DAMENG   - TAURUS: TaurusDB   - DWS: GaussDB DWS   - KINGBASE: KINGBASE   - MARIADB: MariaDB   - GAUSSDBOPENGAUSS: GaussDB/openGauss **默认取值**： 不涉及 
     * @return dbType
     */
    public DbTypeEnum getDbType() {
        return dbType;
    }

    public void setDbType(DbTypeEnum dbType) {
        this.dbType = dbType;
    }

    public ListRdsDatabasesRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 分页偏移量，从第一条数据偏移offset条数据后开始查询 **约束限制**： 仅支持大于等于0的整数 **取值范围**： 大于等于0 **默认取值**： 默认值为0 
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListRdsDatabasesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 每页查询记录数。 **约束限制**： 仅支持大于0的整数 **取值范围**： 大于0小于等于10000 **默认取值**： 默认值为100 
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRdsDatabasesRequest that = (ListRdsDatabasesRequest) obj;
        return Objects.equals(this.dbType, that.dbType) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbType, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRdsDatabasesRequest {\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
