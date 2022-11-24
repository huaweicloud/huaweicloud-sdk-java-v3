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
 * 创建SQL限流规则请求提
 */
public class CreateSqlLimitRulesBody {

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
            DatastoreTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DatastoreTypeEnum(value);
            }
            return result;
        }

        public static DatastoreTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DatastoreTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "sql_limit_rules")

    private List<CreateSqlLimitRuleOption> sqlLimitRules = null;

    public CreateSqlLimitRulesBody withDatastoreType(DatastoreTypeEnum datastoreType) {
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

    public CreateSqlLimitRulesBody withSqlLimitRules(List<CreateSqlLimitRuleOption> sqlLimitRules) {
        this.sqlLimitRules = sqlLimitRules;
        return this;
    }

    public CreateSqlLimitRulesBody addSqlLimitRulesItem(CreateSqlLimitRuleOption sqlLimitRulesItem) {
        if (this.sqlLimitRules == null) {
            this.sqlLimitRules = new ArrayList<>();
        }
        this.sqlLimitRules.add(sqlLimitRulesItem);
        return this;
    }

    public CreateSqlLimitRulesBody withSqlLimitRules(Consumer<List<CreateSqlLimitRuleOption>> sqlLimitRulesSetter) {
        if (this.sqlLimitRules == null) {
            this.sqlLimitRules = new ArrayList<>();
        }
        sqlLimitRulesSetter.accept(this.sqlLimitRules);
        return this;
    }

    /**
     * 需要创建的SQL限流规则列表，一次最多创建5个
     * @return sqlLimitRules
     */
    public List<CreateSqlLimitRuleOption> getSqlLimitRules() {
        return sqlLimitRules;
    }

    public void setSqlLimitRules(List<CreateSqlLimitRuleOption> sqlLimitRules) {
        this.sqlLimitRules = sqlLimitRules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSqlLimitRulesBody createSqlLimitRulesBody = (CreateSqlLimitRulesBody) o;
        return Objects.equals(this.datastoreType, createSqlLimitRulesBody.datastoreType)
            && Objects.equals(this.sqlLimitRules, createSqlLimitRulesBody.sqlLimitRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreType, sqlLimitRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSqlLimitRulesBody {\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    sqlLimitRules: ").append(toIndentedString(sqlLimitRules)).append("\n");
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
