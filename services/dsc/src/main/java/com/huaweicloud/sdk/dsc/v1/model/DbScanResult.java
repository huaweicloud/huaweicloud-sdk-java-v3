package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库扫描结果
 */
public class DbScanResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_scan_results")

    private List<DbScanResultInfo> dbScanResults = null;

    public DbScanResult withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 扫描结果总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public DbScanResult withDbScanResults(List<DbScanResultInfo> dbScanResults) {
        this.dbScanResults = dbScanResults;
        return this;
    }

    public DbScanResult addDbScanResultsItem(DbScanResultInfo dbScanResultsItem) {
        if (this.dbScanResults == null) {
            this.dbScanResults = new ArrayList<>();
        }
        this.dbScanResults.add(dbScanResultsItem);
        return this;
    }

    public DbScanResult withDbScanResults(Consumer<List<DbScanResultInfo>> dbScanResultsSetter) {
        if (this.dbScanResults == null) {
            this.dbScanResults = new ArrayList<>();
        }
        dbScanResultsSetter.accept(this.dbScanResults);
        return this;
    }

    /**
     * 数据库扫描结果列表
     * @return dbScanResults
     */
    public List<DbScanResultInfo> getDbScanResults() {
        return dbScanResults;
    }

    public void setDbScanResults(List<DbScanResultInfo> dbScanResults) {
        this.dbScanResults = dbScanResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DbScanResult that = (DbScanResult) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.dbScanResults, that.dbScanResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, dbScanResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbScanResult {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    dbScanResults: ").append(toIndentedString(dbScanResults)).append("\n");
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
