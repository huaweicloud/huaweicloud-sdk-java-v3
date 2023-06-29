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
 * 删除SQL限流规则请求体
 */
public class DeleteSqlLimitRulesBody {

    /**
     * 数据库类型
     */
    public static final class DatastoreTypeEnum {

        /**
         * Enum MYSQL for value: "MySQL"
         */
        public static final DatastoreTypeEnum MYSQL = new DatastoreTypeEnum("MySQL");

        private static final Map<String, DatastoreTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatastoreTypeEnum> createStaticFields() {
            Map<String, DatastoreTypeEnum> map = new HashMap<>();
            map.put("MySQL", MYSQL);
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

    public DeleteSqlLimitRulesBody withDatastoreType(DatastoreTypeEnum datastoreType) {
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

    public DeleteSqlLimitRulesBody withSqlLimitRuleIds(List<String> sqlLimitRuleIds) {
        this.sqlLimitRuleIds = sqlLimitRuleIds;
        return this;
    }

    public DeleteSqlLimitRulesBody addSqlLimitRuleIdsItem(String sqlLimitRuleIdsItem) {
        if (this.sqlLimitRuleIds == null) {
            this.sqlLimitRuleIds = new ArrayList<>();
        }
        this.sqlLimitRuleIds.add(sqlLimitRuleIdsItem);
        return this;
    }

    public DeleteSqlLimitRulesBody withSqlLimitRuleIds(Consumer<List<String>> sqlLimitRuleIdsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteSqlLimitRulesBody that = (DeleteSqlLimitRulesBody) obj;
        return Objects.equals(this.datastoreType, that.datastoreType)
            && Objects.equals(this.sqlLimitRuleIds, that.sqlLimitRuleIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreType, sqlLimitRuleIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSqlLimitRulesBody {\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    sqlLimitRuleIds: ").append(toIndentedString(sqlLimitRuleIds)).append("\n");
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
