package com.huaweicloud.sdk.lakeformation.v1.model;

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
 * ResourceInput
 */
public class ResourceInput {

    /**
     * 元数据资源类型,CATALOG,DATABASE,TABLE,FUNC,MODEL,COLUMN,URI
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum CATALOG for value: "CATALOG"
         */
        public static final ResourceTypeEnum CATALOG = new ResourceTypeEnum("CATALOG");

        /**
         * Enum DATABASE for value: "DATABASE"
         */
        public static final ResourceTypeEnum DATABASE = new ResourceTypeEnum("DATABASE");

        /**
         * Enum TABLE for value: "TABLE"
         */
        public static final ResourceTypeEnum TABLE = new ResourceTypeEnum("TABLE");

        /**
         * Enum FUNC for value: "FUNC"
         */
        public static final ResourceTypeEnum FUNC = new ResourceTypeEnum("FUNC");

        /**
         * Enum MODEL for value: "MODEL"
         */
        public static final ResourceTypeEnum MODEL = new ResourceTypeEnum("MODEL");

        /**
         * Enum COLUMN for value: "COLUMN"
         */
        public static final ResourceTypeEnum COLUMN = new ResourceTypeEnum("COLUMN");

        /**
         * Enum URI for value: "URI"
         */
        public static final ResourceTypeEnum URI = new ResourceTypeEnum("URI");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("CATALOG", CATALOG);
            map.put("DATABASE", DATABASE);
            map.put("TABLE", TABLE);
            map.put("FUNC", FUNC);
            map.put("MODEL", MODEL);
            map.put("COLUMN", COLUMN);
            map.put("URI", URI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceTypeEnum(value));
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog")

    private String catalog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function")

    private String function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column")

    private String column;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<String> columns = null;

    public ResourceInput withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 元数据资源类型,CATALOG,DATABASE,TABLE,FUNC,MODEL,COLUMN,URI
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public ResourceInput withCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * catalog名称。只能包含字母、数字和下划线，且长度为1~256个字符。
     * @return catalog
     */
    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public ResourceInput withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名称。只能包含中文、字母、数字和下划线，且长度为1到128个字符。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public ResourceInput withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * 函数名称。只能包含字母、数字和下划线，且长度为1~256个字符。
     * @return function
     */
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public ResourceInput withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * 表名称。只能包含中文、字母、数字和下划线，且长度为1~256个字符。
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public ResourceInput withColumn(String column) {
        this.column = column;
        return this;
    }

    /**
     * 列名称。只能包含中文、字母、数字和_-+*\\(), 特殊字符，且长度为1~767个字符。
     * @return column
     */
    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public ResourceInput withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * URI
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ResourceInput withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    public ResourceInput addColumnsItem(String columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public ResourceInput withColumns(Consumer<List<String>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 列名称列表
     * @return columns
     */
    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceInput that = (ResourceInput) obj;
        return Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.catalog, that.catalog)
            && Objects.equals(this.database, that.database) && Objects.equals(this.function, that.function)
            && Objects.equals(this.table, that.table) && Objects.equals(this.column, that.column)
            && Objects.equals(this.uri, that.uri) && Objects.equals(this.columns, that.columns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, catalog, database, function, table, column, uri, columns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceInput {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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
