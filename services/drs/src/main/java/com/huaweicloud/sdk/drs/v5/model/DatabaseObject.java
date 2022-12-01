package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库库级对象。
 */
public class DatabaseObject {

    /**
     * 该数据库在实时同步场景下的类型。取值： - config：仅当该库作为数据过滤高级设置的关联库时，需要填写，此时该库以及该库下的schemas、tables“不会”被同步到目标库，name、all属性不生效，schemas、tables需要填写被关联的相关对象。（注意：如果需要同步该库级对象，则在下级对象中填写sync_type值为config。）
     */
    public static final class SyncTypeEnum {

        /**
         * Enum CONFIG for value: "config"
         */
        public static final SyncTypeEnum CONFIG = new SyncTypeEnum("config");

        private static final Map<String, SyncTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SyncTypeEnum> createStaticFields() {
            Map<String, SyncTypeEnum> map = new HashMap<>();
            map.put("config", CONFIG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SyncTypeEnum(String value) {
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
        public static SyncTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SyncTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SyncTypeEnum(value);
            }
            return result;
        }

        public static SyncTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SyncTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SyncTypeEnum) {
                return this.value.equals(((SyncTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_type")

    private SyncTypeEnum syncType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all")

    private Boolean all;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private Map<String, SchemaObject> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private Map<String, TableObject> tables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_table_num")

    private Integer totalTableNum;

    public DatabaseObject withSyncType(SyncTypeEnum syncType) {
        this.syncType = syncType;
        return this;
    }

    /**
     * 该数据库在实时同步场景下的类型。取值： - config：仅当该库作为数据过滤高级设置的关联库时，需要填写，此时该库以及该库下的schemas、tables“不会”被同步到目标库，name、all属性不生效，schemas、tables需要填写被关联的相关对象。（注意：如果需要同步该库级对象，则在下级对象中填写sync_type值为config。）
     * @return syncType
     */
    public SyncTypeEnum getSyncType() {
        return syncType;
    }

    public void setSyncType(SyncTypeEnum syncType) {
        this.syncType = syncType;
    }

    public DatabaseObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 该数据库在目标库的名称（库名映射）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DatabaseObject withAll(Boolean all) {
        this.all = all;
        return this;
    }

    /**
     * 是否整库迁移或同步。注意： 1.当该库下的模式、表、列需要做数据过滤、列过滤、列映射时，填false，否则填true； 2.当该库下的表需要做附加列时，需要填true，并且在表级对象的columns里填写附加列信息； 3.当该库下的表所包含的列作为数据过滤高级设置的关联列时，需要填true，并且在columns里填写关联列信息，在config_conditions填写数据过滤高级设置的配置条件；
     * @return all
     */
    public Boolean getAll() {
        return all;
    }

    public void setAll(Boolean all) {
        this.all = all;
    }

    public DatabaseObject withSchemas(Map<String, SchemaObject> schemas) {
        this.schemas = schemas;
        return this;
    }

    public DatabaseObject putSchemasItem(String key, SchemaObject schemasItem) {
        if (this.schemas == null) {
            this.schemas = new HashMap<>();
        }
        this.schemas.put(key, schemasItem);
        return this;
    }

    public DatabaseObject withSchemas(Consumer<Map<String, SchemaObject>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new HashMap<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * 需要迁移或同步的模式，当整库迁移或同步为false时需要填写。
     * @return schemas
     */
    public Map<String, SchemaObject> getSchemas() {
        return schemas;
    }

    public void setSchemas(Map<String, SchemaObject> schemas) {
        this.schemas = schemas;
    }

    public DatabaseObject withTables(Map<String, TableObject> tables) {
        this.tables = tables;
        return this;
    }

    public DatabaseObject putTablesItem(String key, TableObject tablesItem) {
        if (this.tables == null) {
            this.tables = new HashMap<>();
        }
        this.tables.put(key, tablesItem);
        return this;
    }

    public DatabaseObject withTables(Consumer<Map<String, TableObject>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new HashMap<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 需要迁移或同步的表，当整库迁移或同步为false时需要填写。
     * @return tables
     */
    public Map<String, TableObject> getTables() {
        return tables;
    }

    public void setTables(Map<String, TableObject> tables) {
        this.tables = tables;
    }

    public DatabaseObject withTotalTableNum(Integer totalTableNum) {
        this.totalTableNum = totalTableNum;
        return this;
    }

    /**
     * 库下的表的数量，表的数量超过阈值就不显示。
     * @return totalTableNum
     */
    public Integer getTotalTableNum() {
        return totalTableNum;
    }

    public void setTotalTableNum(Integer totalTableNum) {
        this.totalTableNum = totalTableNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseObject databaseObject = (DatabaseObject) o;
        return Objects.equals(this.syncType, databaseObject.syncType) && Objects.equals(this.name, databaseObject.name)
            && Objects.equals(this.all, databaseObject.all) && Objects.equals(this.schemas, databaseObject.schemas)
            && Objects.equals(this.tables, databaseObject.tables)
            && Objects.equals(this.totalTableNum, databaseObject.totalTableNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncType, name, all, schemas, tables, totalTableNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseObject {\n");
        sb.append("    syncType: ").append(toIndentedString(syncType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    all: ").append(toIndentedString(all)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
        sb.append("    totalTableNum: ").append(toIndentedString(totalTableNum)).append("\n");
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
