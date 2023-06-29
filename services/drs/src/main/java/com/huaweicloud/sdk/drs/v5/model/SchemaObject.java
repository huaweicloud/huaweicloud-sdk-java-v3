package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库模式对象。
 */
public class SchemaObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_type")

    private String syncType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all")

    private Boolean all;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private Map<String, TableObject> tables = null;

    public SchemaObject withSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    /**
     * 该模式在实时同步场景下的类型。取值： - config：仅当该模式作为数据过滤高级设置的关联模式时，需要填写，此时该模式以及该模式下的tables“不会”被同步到目标库，name、all属性不生效，tables需要填写被关联的相关对象。（注意：如果需要同步该模式对象，则在下级对象中填写sync_type值为config。）
     * @return syncType
     */
    public String getSyncType() {
        return syncType;
    }

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    public SchemaObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 该模式在目标库的名称（模式名映射）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SchemaObject withAll(Boolean all) {
        this.all = all;
        return this;
    }

    /**
     * 是否整模式迁移或同步。注意： 1.当该模式下的表、列需要做数据过滤、列过滤、列映射时，填false，否则填true； 2.当该模式下的表需要做附加列时，需要填true，并且在表级对象的columns里填写附加列信息； 3.当该模式下的表所包含的列作为数据过滤高级设置的关联列时，需要填true，并且在columns里填写关联列信息、config_conditions填写数据过滤高级设置的配置条件；
     * @return all
     */
    public Boolean getAll() {
        return all;
    }

    public void setAll(Boolean all) {
        this.all = all;
    }

    public SchemaObject withTables(Map<String, TableObject> tables) {
        this.tables = tables;
        return this;
    }

    public SchemaObject putTablesItem(String key, TableObject tablesItem) {
        if (this.tables == null) {
            this.tables = new HashMap<>();
        }
        this.tables.put(key, tablesItem);
        return this;
    }

    public SchemaObject withTables(Consumer<Map<String, TableObject>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new HashMap<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 需要迁移或同步的表，当整模式迁移或同步为false时需要填写。
     * @return tables
     */
    public Map<String, TableObject> getTables() {
        return tables;
    }

    public void setTables(Map<String, TableObject> tables) {
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
        SchemaObject that = (SchemaObject) obj;
        return Objects.equals(this.syncType, that.syncType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.all, that.all) && Objects.equals(this.tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncType, name, all, tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchemaObject {\n");
        sb.append("    syncType: ").append(toIndentedString(syncType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    all: ").append(toIndentedString(all)).append("\n");
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
