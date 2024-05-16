package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改SQL限流规则请求体
 */
public class UpdateSqlLimitRulesBody {

    /**
     * 数据库类型
     */
    public static final class DatastoreTypeEnum {

        /**
         * Enum POSTGRESQL for value: "PostgreSQL"
         */
        public static final DatastoreTypeEnum POSTGRESQL = new DatastoreTypeEnum("PostgreSQL");

        private static final Map<String, DatastoreTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatastoreTypeEnum> createStaticFields() {
            Map<String, DatastoreTypeEnum> map = new HashMap<>();
            map.put("PostgreSQL", POSTGRESQL);
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
    @JsonProperty(value = "sql_limit_rule_ids")

    private List<String> sqlLimitRuleIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_limit_rule")

    private UpdateSqlLimitRuleOption sqlLimitRule;

    public UpdateSqlLimitRulesBody withDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 数据库类型
     * @return datastoreType
     */
    public DatastoreTypeEnum getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
    }

    public UpdateSqlLimitRulesBody withSqlLimitRuleIds(List<String> sqlLimitRuleIds) {
        this.sqlLimitRuleIds = sqlLimitRuleIds;
        return this;
    }

    public UpdateSqlLimitRulesBody addSqlLimitRuleIdsItem(String sqlLimitRuleIdsItem) {
        if (this.sqlLimitRuleIds == null) {
            this.sqlLimitRuleIds = new ArrayList<>();
        }
        this.sqlLimitRuleIds.add(sqlLimitRuleIdsItem);
        return this;
    }

    public UpdateSqlLimitRulesBody withSqlLimitRuleIds(Consumer<List<String>> sqlLimitRuleIdsSetter) {
        if (this.sqlLimitRuleIds == null) {
            this.sqlLimitRuleIds = new ArrayList<>();
        }
        sqlLimitRuleIdsSetter.accept(this.sqlLimitRuleIds);
        return this;
    }

    /**
     * SQL限流规则ID
     * @return sqlLimitRuleIds
     */
    public List<String> getSqlLimitRuleIds() {
        return sqlLimitRuleIds;
    }

    public void setSqlLimitRuleIds(List<String> sqlLimitRuleIds) {
        this.sqlLimitRuleIds = sqlLimitRuleIds;
    }

    public UpdateSqlLimitRulesBody withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名（PostgreSQL必填）
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public UpdateSqlLimitRulesBody withSqlLimitRule(UpdateSqlLimitRuleOption sqlLimitRule) {
        this.sqlLimitRule = sqlLimitRule;
        return this;
    }

    public UpdateSqlLimitRulesBody withSqlLimitRule(Consumer<UpdateSqlLimitRuleOption> sqlLimitRuleSetter) {
        if (this.sqlLimitRule == null) {
            this.sqlLimitRule = new UpdateSqlLimitRuleOption();
            sqlLimitRuleSetter.accept(this.sqlLimitRule);
        }

        return this;
    }

    /**
     * Get sqlLimitRule
     * @return sqlLimitRule
     */
    public UpdateSqlLimitRuleOption getSqlLimitRule() {
        return sqlLimitRule;
    }

    public void setSqlLimitRule(UpdateSqlLimitRuleOption sqlLimitRule) {
        this.sqlLimitRule = sqlLimitRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSqlLimitRulesBody that = (UpdateSqlLimitRulesBody) obj;
        return Objects.equals(this.datastoreType, that.datastoreType)
            && Objects.equals(this.sqlLimitRuleIds, that.sqlLimitRuleIds)
            && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.sqlLimitRule, that.sqlLimitRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreType, sqlLimitRuleIds, databaseName, sqlLimitRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSqlLimitRulesBody {\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    sqlLimitRuleIds: ").append(toIndentedString(sqlLimitRuleIds)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    sqlLimitRule: ").append(toIndentedString(sqlLimitRule)).append("\n");
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
