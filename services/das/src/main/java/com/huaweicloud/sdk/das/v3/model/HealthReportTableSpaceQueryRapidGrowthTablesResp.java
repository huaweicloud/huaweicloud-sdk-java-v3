package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthReportTableSpaceQueryRapidGrowthTablesResp
 */
public class HealthReportTableSpaceQueryRapidGrowthTablesResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<HealthReportTableSpaceTopDataDto> tables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Long threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_diagnose_timestamp")

    private Long lastDiagnoseTimestamp;

    public HealthReportTableSpaceQueryRapidGrowthTablesResp withTables(List<HealthReportTableSpaceTopDataDto> tables) {
        this.tables = tables;
        return this;
    }

    public HealthReportTableSpaceQueryRapidGrowthTablesResp addTablesItem(HealthReportTableSpaceTopDataDto tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public HealthReportTableSpaceQueryRapidGrowthTablesResp withTables(
        Consumer<List<HealthReportTableSpaceTopDataDto>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 表列表。
     * @return tables
     */
    public List<HealthReportTableSpaceTopDataDto> getTables() {
        return tables;
    }

    public void setTables(List<HealthReportTableSpaceTopDataDto> tables) {
        this.tables = tables;
    }

    public HealthReportTableSpaceQueryRapidGrowthTablesResp withThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 阈值。
     * @return threshold
     */
    public Long getThreshold() {
        return threshold;
    }

    public void setThreshold(Long threshold) {
        this.threshold = threshold;
    }

    public HealthReportTableSpaceQueryRapidGrowthTablesResp withLastDiagnoseTimestamp(Long lastDiagnoseTimestamp) {
        this.lastDiagnoseTimestamp = lastDiagnoseTimestamp;
        return this;
    }

    /**
     * 上次诊断时间。
     * @return lastDiagnoseTimestamp
     */
    public Long getLastDiagnoseTimestamp() {
        return lastDiagnoseTimestamp;
    }

    public void setLastDiagnoseTimestamp(Long lastDiagnoseTimestamp) {
        this.lastDiagnoseTimestamp = lastDiagnoseTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportTableSpaceQueryRapidGrowthTablesResp that = (HealthReportTableSpaceQueryRapidGrowthTablesResp) obj;
        return Objects.equals(this.tables, that.tables) && Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.lastDiagnoseTimestamp, that.lastDiagnoseTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tables, threshold, lastDiagnoseTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportTableSpaceQueryRapidGrowthTablesResp {\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    lastDiagnoseTimestamp: ").append(toIndentedString(lastDiagnoseTimestamp)).append("\n");
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
