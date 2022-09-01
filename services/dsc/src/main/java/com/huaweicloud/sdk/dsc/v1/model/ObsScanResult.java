package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ObsScanResult
 */
public class ObsScanResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_scan_results")

    @JacksonXmlProperty(localName = "db_scan_results")

    private List<ObsScanResultInfo> dbScanResults = null;

    public ObsScanResult withTotal(Integer total) {
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

    public ObsScanResult withDbScanResults(List<ObsScanResultInfo> dbScanResults) {
        this.dbScanResults = dbScanResults;
        return this;
    }

    public ObsScanResult addDbScanResultsItem(ObsScanResultInfo dbScanResultsItem) {
        if (this.dbScanResults == null) {
            this.dbScanResults = new ArrayList<>();
        }
        this.dbScanResults.add(dbScanResultsItem);
        return this;
    }

    public ObsScanResult withDbScanResults(Consumer<List<ObsScanResultInfo>> dbScanResultsSetter) {
        if (this.dbScanResults == null) {
            this.dbScanResults = new ArrayList<>();
        }
        dbScanResultsSetter.accept(this.dbScanResults);
        return this;
    }

    /**
     * OBS扫描结果列表
     * @return dbScanResults
     */
    public List<ObsScanResultInfo> getDbScanResults() {
        return dbScanResults;
    }

    public void setDbScanResults(List<ObsScanResultInfo> dbScanResults) {
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
        ObsScanResult obsScanResult = (ObsScanResult) o;
        return Objects.equals(this.total, obsScanResult.total)
            && Objects.equals(this.dbScanResults, obsScanResult.dbScanResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, dbScanResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsScanResult {\n");
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
