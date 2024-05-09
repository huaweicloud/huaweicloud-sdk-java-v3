package com.huaweicloud.sdk.gaussdb.v3.model;

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
 * 表同步配置。
 */
public class TableReplConfig {

    /**
     * 表同步类型。include_tables:白名单,exclude_tables:黑名单。
     */
    public static final class ReplTypeEnum {

        /**
         * Enum INCLUDE_TABLES for value: "include_tables"
         */
        public static final ReplTypeEnum INCLUDE_TABLES = new ReplTypeEnum("include_tables");

        /**
         * Enum EXCLUDE_TABLES for value: "exclude_tables"
         */
        public static final ReplTypeEnum EXCLUDE_TABLES = new ReplTypeEnum("exclude_tables");

        private static final Map<String, ReplTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplTypeEnum> createStaticFields() {
            Map<String, ReplTypeEnum> map = new HashMap<>();
            map.put("include_tables", INCLUDE_TABLES);
            map.put("exclude_tables", EXCLUDE_TABLES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplTypeEnum(String value) {
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
        public static ReplTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReplTypeEnum(value));
        }

        public static ReplTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplTypeEnum) {
                return this.value.equals(((ReplTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repl_type")

    private ReplTypeEnum replType;

    /**
     * 表同步范围。all:全量同步，part:部分同步。
     */
    public static final class ReplScopeEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final ReplScopeEnum ALL = new ReplScopeEnum("all");

        /**
         * Enum PART for value: "part"
         */
        public static final ReplScopeEnum PART = new ReplScopeEnum("part");

        private static final Map<String, ReplScopeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplScopeEnum> createStaticFields() {
            Map<String, ReplScopeEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("part", PART);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplScopeEnum(String value) {
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
        public static ReplScopeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReplScopeEnum(value));
        }

        public static ReplScopeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplScopeEnum) {
                return this.value.equals(((ReplScopeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repl_scope")

    private ReplScopeEnum replScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<String> tables = null;

    public TableReplConfig withReplType(ReplTypeEnum replType) {
        this.replType = replType;
        return this;
    }

    /**
     * 表同步类型。include_tables:白名单,exclude_tables:黑名单。
     * @return replType
     */
    public ReplTypeEnum getReplType() {
        return replType;
    }

    public void setReplType(ReplTypeEnum replType) {
        this.replType = replType;
    }

    public TableReplConfig withReplScope(ReplScopeEnum replScope) {
        this.replScope = replScope;
        return this;
    }

    /**
     * 表同步范围。all:全量同步，part:部分同步。
     * @return replScope
     */
    public ReplScopeEnum getReplScope() {
        return replScope;
    }

    public void setReplScope(ReplScopeEnum replScope) {
        this.replScope = replScope;
    }

    public TableReplConfig withTables(List<String> tables) {
        this.tables = tables;
        return this;
    }

    public TableReplConfig addTablesItem(String tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public TableReplConfig withTables(Consumer<List<String>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 白名单或黑名单的表范围。
     * @return tables
     */
    public List<String> getTables() {
        return tables;
    }

    public void setTables(List<String> tables) {
        this.tables = tables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableReplConfig that = (TableReplConfig) obj;
        return Objects.equals(this.replType, that.replType) && Objects.equals(this.replScope, that.replScope)
            && Objects.equals(this.tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replType, replScope, tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableReplConfig {\n");
        sb.append("    replType: ").append(toIndentedString(replType)).append("\n");
        sb.append("    replScope: ").append(toIndentedString(replScope)).append("\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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
