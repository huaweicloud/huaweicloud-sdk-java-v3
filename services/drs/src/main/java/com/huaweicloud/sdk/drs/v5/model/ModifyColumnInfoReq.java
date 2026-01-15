package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改列信息请求体
 */
public class ModifyColumnInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_map_infos")

    private List<ColumnMappingInfo> columnMapInfos = null;

    public ModifyColumnInfoReq withColumnMapInfos(List<ColumnMappingInfo> columnMapInfos) {
        this.columnMapInfos = columnMapInfos;
        return this;
    }

    public ModifyColumnInfoReq addColumnMapInfosItem(ColumnMappingInfo columnMapInfosItem) {
        if (this.columnMapInfos == null) {
            this.columnMapInfos = new ArrayList<>();
        }
        this.columnMapInfos.add(columnMapInfosItem);
        return this;
    }

    public ModifyColumnInfoReq withColumnMapInfos(Consumer<List<ColumnMappingInfo>> columnMapInfosSetter) {
        if (this.columnMapInfos == null) {
            this.columnMapInfos = new ArrayList<>();
        }
        columnMapInfosSetter.accept(this.columnMapInfos);
        return this;
    }

    /**
     * 列信息
     * @return columnMapInfos
     */
    public List<ColumnMappingInfo> getColumnMapInfos() {
        return columnMapInfos;
    }

    public void setColumnMapInfos(List<ColumnMappingInfo> columnMapInfos) {
        this.columnMapInfos = columnMapInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyColumnInfoReq that = (ModifyColumnInfoReq) obj;
        return Objects.equals(this.columnMapInfos, that.columnMapInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnMapInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyColumnInfoReq {\n");
        sb.append("    columnMapInfos: ").append(toIndentedString(columnMapInfos)).append("\n");
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
