package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 表描述信息
 */
public class TableMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    /**
     * 表类型
     */
    public static final class TableTypeEnum {

        /**
         * Enum MANAGED_TABLE for value: "MANAGED_TABLE"
         */
        public static final TableTypeEnum MANAGED_TABLE = new TableTypeEnum("MANAGED_TABLE");

        /**
         * Enum EXTERNAL_TABLE for value: "EXTERNAL_TABLE"
         */
        public static final TableTypeEnum EXTERNAL_TABLE = new TableTypeEnum("EXTERNAL_TABLE");

        /**
         * Enum VIRTUAL_VIEW for value: "VIRTUAL_VIEW"
         */
        public static final TableTypeEnum VIRTUAL_VIEW = new TableTypeEnum("VIRTUAL_VIEW");

        /**
         * Enum MATERIALIZED_VIEW for value: "MATERIALIZED_VIEW"
         */
        public static final TableTypeEnum MATERIALIZED_VIEW = new TableTypeEnum("MATERIALIZED_VIEW");

        private static final Map<String, TableTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TableTypeEnum> createStaticFields() {
            Map<String, TableTypeEnum> map = new HashMap<>();
            map.put("MANAGED_TABLE", MANAGED_TABLE);
            map.put("EXTERNAL_TABLE", EXTERNAL_TABLE);
            map.put("VIRTUAL_VIEW", VIRTUAL_VIEW);
            map.put("MATERIALIZED_VIEW", MATERIALIZED_VIEW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TableTypeEnum(String value) {
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
        public static TableTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TableTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TableTypeEnum(value);
            }
            return result;
        }

        public static TableTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TableTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TableTypeEnum) {
                return this.value.equals(((TableTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_type")

    private TableTypeEnum tableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comments")

    private String comments;

    public TableMeta withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * 表名
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public TableMeta withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名字
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public TableMeta withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名字
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public TableMeta withTableType(TableTypeEnum tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * 表类型
     * @return tableType
     */
    public TableTypeEnum getTableType() {
        return tableType;
    }

    public void setTableType(TableTypeEnum tableType) {
        this.tableType = tableType;
    }

    public TableMeta withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * 表描述信息
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TableMeta tableMeta = (TableMeta) o;
        return Objects.equals(this.catalogName, tableMeta.catalogName)
            && Objects.equals(this.databaseName, tableMeta.databaseName)
            && Objects.equals(this.tableName, tableMeta.tableName)
            && Objects.equals(this.tableType, tableMeta.tableType) && Objects.equals(this.comments, tableMeta.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogName, databaseName, tableName, tableType, comments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableMeta {\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
