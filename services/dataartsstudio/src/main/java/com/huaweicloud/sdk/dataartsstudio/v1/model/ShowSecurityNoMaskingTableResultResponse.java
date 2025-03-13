package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSecurityNoMaskingTableResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<DiagnoseNoMaskingDetail> tables = null;

    public ShowSecurityNoMaskingTableResultResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 表总数
     * minimum: 1
     * maximum: 100
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowSecurityNoMaskingTableResultResponse withTables(List<DiagnoseNoMaskingDetail> tables) {
        this.tables = tables;
        return this;
    }

    public ShowSecurityNoMaskingTableResultResponse addTablesItem(DiagnoseNoMaskingDetail tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public ShowSecurityNoMaskingTableResultResponse withTables(Consumer<List<DiagnoseNoMaskingDetail>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 查询的表集合
     * @return tables
     */
    public List<DiagnoseNoMaskingDetail> getTables() {
        return tables;
    }

    public void setTables(List<DiagnoseNoMaskingDetail> tables) {
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
        ShowSecurityNoMaskingTableResultResponse that = (ShowSecurityNoMaskingTableResultResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityNoMaskingTableResultResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
