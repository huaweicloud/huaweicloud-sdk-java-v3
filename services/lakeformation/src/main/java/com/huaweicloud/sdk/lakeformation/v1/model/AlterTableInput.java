package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlterTableInput
 */
public class AlterTableInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alter_params")

    private Map<String, String> alterParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private TableInput table;

    public AlterTableInput withAlterParams(Map<String, String> alterParams) {
        this.alterParams = alterParams;
        return this;
    }

    public AlterTableInput putAlterParamsItem(String key, String alterParamsItem) {
        if (this.alterParams == null) {
            this.alterParams = new HashMap<>();
        }
        this.alterParams.put(key, alterParamsItem);
        return this;
    }

    public AlterTableInput withAlterParams(Consumer<Map<String, String>> alterParamsSetter) {
        if (this.alterParams == null) {
            this.alterParams = new HashMap<>();
        }
        alterParamsSetter.accept(this.alterParams);
        return this;
    }

    /**
     * 修改表参数映射信息，支持的参数如下： CASADE: 级联删除列，如果为true则会把partition中的列也删除；如果为false则不会 DO_NOT_UPDATE_STATS: 不更新文件级别统计信息。true则不更新；false则更新。 STATS_GENERATED：记录本次更新的发起者。可填：TASK/USET。具体作用未明确。
     * @return alterParams
     */
    public Map<String, String> getAlterParams() {
        return alterParams;
    }

    public void setAlterParams(Map<String, String> alterParams) {
        this.alterParams = alterParams;
    }

    public AlterTableInput withTable(TableInput table) {
        this.table = table;
        return this;
    }

    public AlterTableInput withTable(Consumer<TableInput> tableSetter) {
        if (this.table == null) {
            this.table = new TableInput();
            tableSetter.accept(this.table);
        }

        return this;
    }

    /**
     * Get table
     * @return table
     */
    public TableInput getTable() {
        return table;
    }

    public void setTable(TableInput table) {
        this.table = table;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlterTableInput that = (AlterTableInput) obj;
        return Objects.equals(this.alterParams, that.alterParams) && Objects.equals(this.table, that.table);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alterParams, table);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlterTableInput {\n");
        sb.append("    alterParams: ").append(toIndentedString(alterParams)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
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
