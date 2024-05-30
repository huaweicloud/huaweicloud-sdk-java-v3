package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * value，统一的返回结果的外层数据结构。
 */
public class ListDimensionGroupsResultDataValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_table")

    private FactLogicTableVO mainTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_tables")

    private List<DimensionLogicTableVO> dimensionTables = null;

    public ListDimensionGroupsResultDataValue withMainTable(FactLogicTableVO mainTable) {
        this.mainTable = mainTable;
        return this;
    }

    public ListDimensionGroupsResultDataValue withMainTable(Consumer<FactLogicTableVO> mainTableSetter) {
        if (this.mainTable == null) {
            this.mainTable = new FactLogicTableVO();
            mainTableSetter.accept(this.mainTable);
        }

        return this;
    }

    /**
     * Get mainTable
     * @return mainTable
     */
    public FactLogicTableVO getMainTable() {
        return mainTable;
    }

    public void setMainTable(FactLogicTableVO mainTable) {
        this.mainTable = mainTable;
    }

    public ListDimensionGroupsResultDataValue withDimensionTables(List<DimensionLogicTableVO> dimensionTables) {
        this.dimensionTables = dimensionTables;
        return this;
    }

    public ListDimensionGroupsResultDataValue addDimensionTablesItem(DimensionLogicTableVO dimensionTablesItem) {
        if (this.dimensionTables == null) {
            this.dimensionTables = new ArrayList<>();
        }
        this.dimensionTables.add(dimensionTablesItem);
        return this;
    }

    public ListDimensionGroupsResultDataValue withDimensionTables(
        Consumer<List<DimensionLogicTableVO>> dimensionTablesSetter) {
        if (this.dimensionTables == null) {
            this.dimensionTables = new ArrayList<>();
        }
        dimensionTablesSetter.accept(this.dimensionTables);
        return this;
    }

    /**
     * 维度。
     * @return dimensionTables
     */
    public List<DimensionLogicTableVO> getDimensionTables() {
        return dimensionTables;
    }

    public void setDimensionTables(List<DimensionLogicTableVO> dimensionTables) {
        this.dimensionTables = dimensionTables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDimensionGroupsResultDataValue that = (ListDimensionGroupsResultDataValue) obj;
        return Objects.equals(this.mainTable, that.mainTable)
            && Objects.equals(this.dimensionTables, that.dimensionTables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainTable, dimensionTables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDimensionGroupsResultDataValue {\n");
        sb.append("    mainTable: ").append(toIndentedString(mainTable)).append("\n");
        sb.append("    dimensionTables: ").append(toIndentedString(dimensionTables)).append("\n");
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
