package com.huaweicloud.sdk.drs.v5.model;

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
 * 数据库表级对象。
 */
public class TableObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_type")

    private String syncType;

    /**
     * 对象类型。取值： - table：表。 - view：视图。 - procedure：存储过程。
     */
    public static final class TypeEnum {

        /**
         * Enum TABLE for value: "table"
         */
        public static final TypeEnum TABLE = new TypeEnum("table");

        /**
         * Enum VIEW for value: "view"
         */
        public static final TypeEnum VIEW = new TypeEnum("view");

        /**
         * Enum PROCEDURE for value: "procedure"
         */
        public static final TypeEnum PROCEDURE = new TypeEnum("procedure");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("table", TABLE);
            map.put("view", VIEW);
            map.put("procedure", PROCEDURE);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all")

    private Boolean all;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_alias_name")

    private String dbAliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_alias_name")

    private String schemaAliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filtered")

    private Boolean filtered;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_conditions")

    private List<String> filterConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_conditions")

    private List<String> configConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_been_sent")

    private Boolean hasBeenSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private Map<String, ColumnObject> columns = null;

    public TableObject withSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    /**
     * 该表在实时同步场景下的类型。取值： - config：仅当该表作为数据过滤高级设置的关联表时，需要填写，此时该表以及该表下的columns“不会”被同步到目标库，name、all、filtered、filter_conditions属性不生效，columns需要填写被关联的相关对象，config_conditions需要填写数据过滤高级设置的配置条件。（注意：如果需要同步该表级对象，则在下级对象中填写sync_type值为config。）
     * @return syncType
     */
    public String getSyncType() {
        return syncType;
    }

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    public TableObject withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 对象类型。取值： - table：表。 - view：视图。 - procedure：存储过程。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public TableObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 该表在目标库的名称（表名映射）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TableObject withAll(Boolean all) {
        this.all = all;
        return this;
    }

    /**
     * 是否整表迁移或同步。注意： 1.当该表不需要做列过滤、列映射时，填true，如果需要做列过滤、列映射则填false； 2.当该表需要做附加列时，需要填true，并且在columns里填写附加列信息； 3.当该表所包含的列作为数据过滤高级设置的关联列时，需要填true，并且在columns里填写关联列信息、config_conditions填写数据过滤高级设置的配置条件；
     * @return all
     */
    public Boolean getAll() {
        return all;
    }

    public void setAll(Boolean all) {
        this.all = all;
    }

    public TableObject withDbAliasName(String dbAliasName) {
        this.dbAliasName = dbAliasName;
        return this;
    }

    /**
     * 一对多情况下，表级上对库名的映射。
     * @return dbAliasName
     */
    public String getDbAliasName() {
        return dbAliasName;
    }

    public void setDbAliasName(String dbAliasName) {
        this.dbAliasName = dbAliasName;
    }

    public TableObject withSchemaAliasName(String schemaAliasName) {
        this.schemaAliasName = schemaAliasName;
        return this;
    }

    /**
     * 一对多情况下，表级上对schema名的映射。
     * @return schemaAliasName
     */
    public String getSchemaAliasName() {
        return schemaAliasName;
    }

    public void setSchemaAliasName(String schemaAliasName) {
        this.schemaAliasName = schemaAliasName;
    }

    public TableObject withFiltered(Boolean filtered) {
        this.filtered = filtered;
        return this;
    }

    /**
     * 该表是否进行数据过滤。
     * @return filtered
     */
    public Boolean getFiltered() {
        return filtered;
    }

    public void setFiltered(Boolean filtered) {
        this.filtered = filtered;
    }

    public TableObject withFilterConditions(List<String> filterConditions) {
        this.filterConditions = filterConditions;
        return this;
    }

    public TableObject addFilterConditionsItem(String filterConditionsItem) {
        if (this.filterConditions == null) {
            this.filterConditions = new ArrayList<>();
        }
        this.filterConditions.add(filterConditionsItem);
        return this;
    }

    public TableObject withFilterConditions(Consumer<List<String>> filterConditionsSetter) {
        if (this.filterConditions == null) {
            this.filterConditions = new ArrayList<>();
        }
        filterConditionsSetter.accept(this.filterConditions);
        return this;
    }

    /**
     * 该表数据的过滤条件，生成加工规则值为SQL条件语句，长度限制512。
     * @return filterConditions
     */
    public List<String> getFilterConditions() {
        return filterConditions;
    }

    public void setFilterConditions(List<String> filterConditions) {
        this.filterConditions = filterConditions;
    }

    public TableObject withConfigConditions(List<String> configConditions) {
        this.configConditions = configConditions;
        return this;
    }

    public TableObject addConfigConditionsItem(String configConditionsItem) {
        if (this.configConditions == null) {
            this.configConditions = new ArrayList<>();
        }
        this.configConditions.add(configConditionsItem);
        return this;
    }

    public TableObject withConfigConditions(Consumer<List<String>> configConditionsSetter) {
        if (this.configConditions == null) {
            this.configConditions = new ArrayList<>();
        }
        configConditionsSetter.accept(this.configConditions);
        return this;
    }

    /**
     * 该表数据过滤高级设置的配置条件，当该表作为联表查询时填写，生成加工规则值为SQL条件语句，长度限制512。
     * @return configConditions
     */
    public List<String> getConfigConditions() {
        return configConditions;
    }

    public void setConfigConditions(List<String> configConditions) {
        this.configConditions = configConditions;
    }

    public TableObject withHasBeenSent(Boolean hasBeenSent) {
        this.hasBeenSent = hasBeenSent;
        return this;
    }

    /**
     * 是否已经进行同步。
     * @return hasBeenSent
     */
    public Boolean getHasBeenSent() {
        return hasBeenSent;
    }

    public void setHasBeenSent(Boolean hasBeenSent) {
        this.hasBeenSent = hasBeenSent;
    }

    public TableObject withColumns(Map<String, ColumnObject> columns) {
        this.columns = columns;
        return this;
    }

    public TableObject putColumnsItem(String key, ColumnObject columnsItem) {
        if (this.columns == null) {
            this.columns = new HashMap<>();
        }
        this.columns.put(key, columnsItem);
        return this;
    }

    public TableObject withColumns(Consumer<Map<String, ColumnObject>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new HashMap<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 需要同步/映射/过滤/新增的列，当需要列过滤、列映射、附加列功能时填写，仅在实时同步任务中生效，当整表同步为false时需要填写。
     * @return columns
     */
    public Map<String, ColumnObject> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, ColumnObject> columns) {
        this.columns = columns;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TableObject tableObject = (TableObject) o;
        return Objects.equals(this.syncType, tableObject.syncType) && Objects.equals(this.type, tableObject.type)
            && Objects.equals(this.name, tableObject.name) && Objects.equals(this.all, tableObject.all)
            && Objects.equals(this.dbAliasName, tableObject.dbAliasName)
            && Objects.equals(this.schemaAliasName, tableObject.schemaAliasName)
            && Objects.equals(this.filtered, tableObject.filtered)
            && Objects.equals(this.filterConditions, tableObject.filterConditions)
            && Objects.equals(this.configConditions, tableObject.configConditions)
            && Objects.equals(this.hasBeenSent, tableObject.hasBeenSent)
            && Objects.equals(this.columns, tableObject.columns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncType,
            type,
            name,
            all,
            dbAliasName,
            schemaAliasName,
            filtered,
            filterConditions,
            configConditions,
            hasBeenSent,
            columns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableObject {\n");
        sb.append("    syncType: ").append(toIndentedString(syncType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    all: ").append(toIndentedString(all)).append("\n");
        sb.append("    dbAliasName: ").append(toIndentedString(dbAliasName)).append("\n");
        sb.append("    schemaAliasName: ").append(toIndentedString(schemaAliasName)).append("\n");
        sb.append("    filtered: ").append(toIndentedString(filtered)).append("\n");
        sb.append("    filterConditions: ").append(toIndentedString(filterConditions)).append("\n");
        sb.append("    configConditions: ").append(toIndentedString(configConditions)).append("\n");
        sb.append("    hasBeenSent: ").append(toIndentedString(hasBeenSent)).append("\n");
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
