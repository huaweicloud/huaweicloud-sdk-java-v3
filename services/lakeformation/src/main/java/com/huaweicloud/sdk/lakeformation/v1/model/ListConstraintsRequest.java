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
 * Request Object
 */
public class ListConstraintsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

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
     * 列限制条件类型
     */
    public static final class TypeEnum {

        /**
         * Enum CHECK_CSTR for value: "CHECK_CSTR"
         */
        public static final TypeEnum CHECK_CSTR = new TypeEnum("CHECK_CSTR");

        /**
         * Enum DEFAULT_CSTR for value: "DEFAULT_CSTR"
         */
        public static final TypeEnum DEFAULT_CSTR = new TypeEnum("DEFAULT_CSTR");

        /**
         * Enum NOT_NULL_CSTR for value: "NOT_NULL_CSTR"
         */
        public static final TypeEnum NOT_NULL_CSTR = new TypeEnum("NOT_NULL_CSTR");

        /**
         * Enum UNIQUE_CSTR for value: "UNIQUE_CSTR"
         */
        public static final TypeEnum UNIQUE_CSTR = new TypeEnum("UNIQUE_CSTR");

        /**
         * Enum PRIMARY_KEY for value: "PRIMARY_KEY"
         */
        public static final TypeEnum PRIMARY_KEY = new TypeEnum("PRIMARY_KEY");

        /**
         * Enum FOREIGN_KEY for value: "FOREIGN_KEY"
         */
        public static final TypeEnum FOREIGN_KEY = new TypeEnum("FOREIGN_KEY");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("CHECK_CSTR", CHECK_CSTR);
            map.put("DEFAULT_CSTR", DEFAULT_CSTR);
            map.put("NOT_NULL_CSTR", NOT_NULL_CSTR);
            map.put("UNIQUE_CSTR", UNIQUE_CSTR);
            map.put("PRIMARY_KEY", PRIMARY_KEY);
            map.put("FOREIGN_KEY", FOREIGN_KEY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_db")

    private String parentDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_tbl")

    private String parentTbl;

    public ListConstraintsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListConstraintsRequest withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * catalog名字
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public ListConstraintsRequest withDatabaseName(String databaseName) {
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

    public ListConstraintsRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ListConstraintsRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 列限制条件类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListConstraintsRequest withParentDb(String parentDb) {
        this.parentDb = parentDb;
        return this;
    }

    /**
     * 获取表外键时使用，指定外键被引用表所在的数据库名
     * @return parentDb
     */
    public String getParentDb() {
        return parentDb;
    }

    public void setParentDb(String parentDb) {
        this.parentDb = parentDb;
    }

    public ListConstraintsRequest withParentTbl(String parentTbl) {
        this.parentTbl = parentTbl;
        return this;
    }

    /**
     * 获取表外键时使用，指定外键被引用表的表名
     * @return parentTbl
     */
    public String getParentTbl() {
        return parentTbl;
    }

    public void setParentTbl(String parentTbl) {
        this.parentTbl = parentTbl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConstraintsRequest that = (ListConstraintsRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.catalogName, that.catalogName)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.type, that.type) && Objects.equals(this.parentDb, that.parentDb)
            && Objects.equals(this.parentTbl, that.parentTbl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, catalogName, databaseName, tableName, type, parentDb, parentTbl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConstraintsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    parentDb: ").append(toIndentedString(parentDb)).append("\n");
        sb.append("    parentTbl: ").append(toIndentedString(parentTbl)).append("\n");
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
