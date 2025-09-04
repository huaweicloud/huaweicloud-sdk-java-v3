package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询HTAP主实例数据库表列表请求体。
 */
public class QueryTableRequestV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_tables")

    private List<DatabaseTablesInfo> databaseTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_id")

    private String sourceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selected_tables")

    private List<DatabaseTablesInfo> selectedTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_type")

    private String filterType;

    public QueryTableRequestV3 withDatabaseTables(List<DatabaseTablesInfo> databaseTables) {
        this.databaseTables = databaseTables;
        return this;
    }

    public QueryTableRequestV3 addDatabaseTablesItem(DatabaseTablesInfo databaseTablesItem) {
        if (this.databaseTables == null) {
            this.databaseTables = new ArrayList<>();
        }
        this.databaseTables.add(databaseTablesItem);
        return this;
    }

    public QueryTableRequestV3 withDatabaseTables(Consumer<List<DatabaseTablesInfo>> databaseTablesSetter) {
        if (this.databaseTables == null) {
            this.databaseTables = new ArrayList<>();
        }
        databaseTablesSetter.accept(this.databaseTables);
        return this;
    }

    /**
     * **参数解释**：  查询的数据库及表名称的列表。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return databaseTables
     */
    public List<DatabaseTablesInfo> getDatabaseTables() {
        return databaseTables;
    }

    public void setDatabaseTables(List<DatabaseTablesInfo> databaseTables) {
        this.databaseTables = databaseTables;
    }

    public QueryTableRequestV3 withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /**
     * **参数解释**：  需要查询数据库的源实例ID，严格匹配UUID规则。  **约束限制**：  只能由英文字母、数字组成，且长度为36个字符。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    public QueryTableRequestV3 withSelectedTables(List<DatabaseTablesInfo> selectedTables) {
        this.selectedTables = selectedTables;
        return this;
    }

    public QueryTableRequestV3 addSelectedTablesItem(DatabaseTablesInfo selectedTablesItem) {
        if (this.selectedTables == null) {
            this.selectedTables = new ArrayList<>();
        }
        this.selectedTables.add(selectedTablesItem);
        return this;
    }

    public QueryTableRequestV3 withSelectedTables(Consumer<List<DatabaseTablesInfo>> selectedTablesSetter) {
        if (this.selectedTables == null) {
            this.selectedTables = new ArrayList<>();
        }
        selectedTablesSetter.accept(this.selectedTables);
        return this;
    }

    /**
     * **参数解释**：  已选择的数据库及表名称的列表。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return selectedTables
     */
    public List<DatabaseTablesInfo> getSelectedTables() {
        return selectedTables;
    }

    public void setSelectedTables(List<DatabaseTablesInfo> selectedTables) {
        this.selectedTables = selectedTables;
    }

    public QueryTableRequestV3 withFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    /**
     * **参数解释**：  表黑白名单设置。include_tables：白名单，exclude_tables：黑名单。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return filterType
     */
    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryTableRequestV3 that = (QueryTableRequestV3) obj;
        return Objects.equals(this.databaseTables, that.databaseTables)
            && Objects.equals(this.sourceInstanceId, that.sourceInstanceId)
            && Objects.equals(this.selectedTables, that.selectedTables)
            && Objects.equals(this.filterType, that.filterType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseTables, sourceInstanceId, selectedTables, filterType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryTableRequestV3 {\n");
        sb.append("    databaseTables: ").append(toIndentedString(databaseTables)).append("\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    selectedTables: ").append(toIndentedString(selectedTables)).append("\n");
        sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
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
