package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EsScanResult
 */
public class EsScanResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_scan_results")

    @JacksonXmlProperty(localName = "db_scan_results")

    private List<EsScanResultInfo> dbScanResults = null;

    public EsScanResult withTotal(Integer total) {
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

    public EsScanResult withDbScanResults(List<EsScanResultInfo> dbScanResults) {
        this.dbScanResults = dbScanResults;
        return this;
    }

    public EsScanResult addDbScanResultsItem(EsScanResultInfo dbScanResultsItem) {
        if (this.dbScanResults == null) {
            this.dbScanResults = new ArrayList<>();
        }
        this.dbScanResults.add(dbScanResultsItem);
        return this;
    }

    public EsScanResult withDbScanResults(Consumer<List<EsScanResultInfo>> dbScanResultsSetter) {
        if (this.dbScanResults == null) {
            this.dbScanResults = new ArrayList<>();
        }
        dbScanResultsSetter.accept(this.dbScanResults);
        return this;
    }

    /**
     * ES扫描结果列表
     * @return dbScanResults
     */
    public List<EsScanResultInfo> getDbScanResults() {
        return dbScanResults;
    }

    public void setDbScanResults(List<EsScanResultInfo> dbScanResults) {
        this.dbScanResults = dbScanResults;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EsScanResult esScanResult = (EsScanResult) o;
        return Objects.equals(this.total, esScanResult.total)
            && Objects.equals(this.dbScanResults, esScanResult.dbScanResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, dbScanResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EsScanResult {\n");
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
