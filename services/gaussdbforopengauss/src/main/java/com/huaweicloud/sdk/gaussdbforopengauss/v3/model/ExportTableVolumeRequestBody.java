package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExportTableVolumeRequestBody
 */
public class ExportTableVolumeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_names")

    private List<String> schemaNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_order")

    private String sortOrder;

    public ExportTableVolumeRequestBody withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释**: 数据库名称。 **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 不涉及。 
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ExportTableVolumeRequestBody withSchemaNames(List<String> schemaNames) {
        this.schemaNames = schemaNames;
        return this;
    }

    public ExportTableVolumeRequestBody addSchemaNamesItem(String schemaNamesItem) {
        if (this.schemaNames == null) {
            this.schemaNames = new ArrayList<>();
        }
        this.schemaNames.add(schemaNamesItem);
        return this;
    }

    public ExportTableVolumeRequestBody withSchemaNames(Consumer<List<String>> schemaNamesSetter) {
        if (this.schemaNames == null) {
            this.schemaNames = new ArrayList<>();
        }
        schemaNamesSetter.accept(this.schemaNames);
        return this;
    }

    /**
     * **参数解释**: schema名称。 **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 不涉及。 
     * @return schemaNames
     */
    public List<String> getSchemaNames() {
        return schemaNames;
    }

    public void setSchemaNames(List<String> schemaNames) {
        this.schemaNames = schemaNames;
    }

    public ExportTableVolumeRequestBody withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * **参数解释**:   表名称。 **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 不涉及。 
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ExportTableVolumeRequestBody withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 表所属用户名称。 **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 不涉及。 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ExportTableVolumeRequestBody withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数解释**: 排序字段。 **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 不涉及。 
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ExportTableVolumeRequestBody withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * **参数解释**: 排序方法。 **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 不涉及。 
     * @return sortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportTableVolumeRequestBody that = (ExportTableVolumeRequestBody) obj;
        return Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.schemaNames, that.schemaNames) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortOrder, that.sortOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, schemaNames, tableName, userName, sortKey, sortOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportTableVolumeRequestBody {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaNames: ").append(toIndentedString(schemaNames)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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
