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
 * CreateSqlLimitRuleOption
 */
public class CreateSqlLimitRuleOption {

    /**
     * SQL类型
     */
    public static final class SqlTypeEnum {

        /**
         * Enum SELECT for value: "SELECT"
         */
        public static final SqlTypeEnum SELECT = new SqlTypeEnum("SELECT");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final SqlTypeEnum UPDATE = new SqlTypeEnum("UPDATE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final SqlTypeEnum DELETE = new SqlTypeEnum("DELETE");

        /**
         * Enum INSERT for value: "INSERT"
         */
        public static final SqlTypeEnum INSERT = new SqlTypeEnum("INSERT");

        /**
         * Enum QUERY_ID for value: "QUERY_ID"
         */
        public static final SqlTypeEnum QUERY_ID = new SqlTypeEnum("QUERY_ID");

        /**
         * Enum QUERY_STR for value: "QUERY_STR"
         */
        public static final SqlTypeEnum QUERY_STR = new SqlTypeEnum("QUERY_STR");

        private static final Map<String, SqlTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SqlTypeEnum> createStaticFields() {
            Map<String, SqlTypeEnum> map = new HashMap<>();
            map.put("SELECT", SELECT);
            map.put("UPDATE", UPDATE);
            map.put("DELETE", DELETE);
            map.put("INSERT", INSERT);
            map.put("QUERY_ID", QUERY_ID);
            map.put("QUERY_STR", QUERY_STR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SqlTypeEnum(String value) {
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
        public static SqlTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SqlTypeEnum(value));
        }

        public static SqlTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SqlTypeEnum) {
                return this.value.equals(((SqlTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type")

    private SqlTypeEnum sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_concurrency")

    private Integer maxConcurrency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_waiting")

    private Integer maxWaiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private String pattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "his_sql_limit_switch")

    private Boolean hisSqlLimitSwitch;

    public CreateSqlLimitRuleOption withSqlType(SqlTypeEnum sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    /**
     * SQL类型
     * @return sqlType
     */
    public SqlTypeEnum getSqlType() {
        return sqlType;
    }

    public void setSqlType(SqlTypeEnum sqlType) {
        this.sqlType = sqlType;
    }

    public CreateSqlLimitRuleOption withMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * 最大并发数
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return maxConcurrency;
    }

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    public CreateSqlLimitRuleOption withMaxWaiting(Integer maxWaiting) {
        this.maxWaiting = maxWaiting;
        return this;
    }

    /**
     * 最大等待时间
     * @return maxWaiting
     */
    public Integer getMaxWaiting() {
        return maxWaiting;
    }

    public void setMaxWaiting(Integer maxWaiting) {
        this.maxWaiting = maxWaiting;
    }

    public CreateSqlLimitRuleOption withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * SQL限流规则。限流规则以~分隔关键字，例如select~a。规则举例详细说明：例如关键字是\"select~a\", 含义为：select以及a为该并发控制所包含的两个关键字，~为关键字间隔符，即若执行SQL命令包含select与a两个关键字视为命中此条并发控制规则。
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public CreateSqlLimitRuleOption withHisSqlLimitSwitch(Boolean hisSqlLimitSwitch) {
        this.hisSqlLimitSwitch = hisSqlLimitSwitch;
        return this;
    }

    /**
     * 历史SQL限流开关。 本开关仅对本条SQL限流规则生效。 开启时，将kill掉命中此条SQL限流规则的已有会话。
     * @return hisSqlLimitSwitch
     */
    public Boolean getHisSqlLimitSwitch() {
        return hisSqlLimitSwitch;
    }

    public void setHisSqlLimitSwitch(Boolean hisSqlLimitSwitch) {
        this.hisSqlLimitSwitch = hisSqlLimitSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSqlLimitRuleOption that = (CreateSqlLimitRuleOption) obj;
        return Objects.equals(this.sqlType, that.sqlType) && Objects.equals(this.maxConcurrency, that.maxConcurrency)
            && Objects.equals(this.maxWaiting, that.maxWaiting) && Objects.equals(this.pattern, that.pattern)
            && Objects.equals(this.hisSqlLimitSwitch, that.hisSqlLimitSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlType, maxConcurrency, maxWaiting, pattern, hisSqlLimitSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSqlLimitRuleOption {\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
        sb.append("    maxWaiting: ").append(toIndentedString(maxWaiting)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    hisSqlLimitSwitch: ").append(toIndentedString(hisSqlLimitSwitch)).append("\n");
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
