package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 特殊表列表。
 */
public class HealthReportTableSpaceQuerySpecialTablesResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_diagnose_timestamp")

    private Long lastDiagnoseTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<HealthReportTableSpaceTablesDto> tables = null;

    public HealthReportTableSpaceQuerySpecialTablesResp withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public HealthReportTableSpaceQuerySpecialTablesResp withLastDiagnoseTimestamp(Long lastDiagnoseTimestamp) {
        this.lastDiagnoseTimestamp = lastDiagnoseTimestamp;
        return this;
    }

    /**
     * 最近诊断时间。
     * @return lastDiagnoseTimestamp
     */
    public Long getLastDiagnoseTimestamp() {
        return lastDiagnoseTimestamp;
    }

    public void setLastDiagnoseTimestamp(Long lastDiagnoseTimestamp) {
        this.lastDiagnoseTimestamp = lastDiagnoseTimestamp;
    }

    public HealthReportTableSpaceQuerySpecialTablesResp withTables(List<HealthReportTableSpaceTablesDto> tables) {
        this.tables = tables;
        return this;
    }

    public HealthReportTableSpaceQuerySpecialTablesResp addTablesItem(HealthReportTableSpaceTablesDto tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public HealthReportTableSpaceQuerySpecialTablesResp withTables(
        Consumer<List<HealthReportTableSpaceTablesDto>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 库表信息列表。
     * @return tables
     */
    public List<HealthReportTableSpaceTablesDto> getTables() {
        return tables;
    }

    public void setTables(List<HealthReportTableSpaceTablesDto> tables) {
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
        HealthReportTableSpaceQuerySpecialTablesResp that = (HealthReportTableSpaceQuerySpecialTablesResp) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.lastDiagnoseTimestamp, that.lastDiagnoseTimestamp)
            && Objects.equals(this.tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, lastDiagnoseTimestamp, tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportTableSpaceQuerySpecialTablesResp {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    lastDiagnoseTimestamp: ").append(toIndentedString(lastDiagnoseTimestamp)).append("\n");
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
