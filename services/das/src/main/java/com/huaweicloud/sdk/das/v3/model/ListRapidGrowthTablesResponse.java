package com.huaweicloud.sdk.das.v3.model;

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
public class ListRapidGrowthTablesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<RapidGrowthTableInfo> tables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Long threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_diagnose_timestamp")

    private Long lastDiagnoseTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first2_last_timestamp")

    private Long first2LastTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "second2_last_timestamp")

    private Long second2LastTimestamp;

    public ListRapidGrowthTablesResponse withTables(List<RapidGrowthTableInfo> tables) {
        this.tables = tables;
        return this;
    }

    public ListRapidGrowthTablesResponse addTablesItem(RapidGrowthTableInfo tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public ListRapidGrowthTablesResponse withTables(Consumer<List<RapidGrowthTableInfo>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 异常增长表信息列表
     * @return tables
     */
    public List<RapidGrowthTableInfo> getTables() {
        return tables;
    }

    public void setTables(List<RapidGrowthTableInfo> tables) {
        this.tables = tables;
    }

    public ListRapidGrowthTablesResponse withThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 诊断阈值
     * @return threshold
     */
    public Long getThreshold() {
        return threshold;
    }

    public void setThreshold(Long threshold) {
        this.threshold = threshold;
    }

    public ListRapidGrowthTablesResponse withLastDiagnoseTimestamp(Long lastDiagnoseTimestamp) {
        this.lastDiagnoseTimestamp = lastDiagnoseTimestamp;
        return this;
    }

    /**
     * 上次诊断时间
     * @return lastDiagnoseTimestamp
     */
    public Long getLastDiagnoseTimestamp() {
        return lastDiagnoseTimestamp;
    }

    public void setLastDiagnoseTimestamp(Long lastDiagnoseTimestamp) {
        this.lastDiagnoseTimestamp = lastDiagnoseTimestamp;
    }

    public ListRapidGrowthTablesResponse withFirst2LastTimestamp(Long first2LastTimestamp) {
        this.first2LastTimestamp = first2LastTimestamp;
        return this;
    }

    /**
     * 最近一次诊断时间
     * @return first2LastTimestamp
     */
    public Long getFirst2LastTimestamp() {
        return first2LastTimestamp;
    }

    public void setFirst2LastTimestamp(Long first2LastTimestamp) {
        this.first2LastTimestamp = first2LastTimestamp;
    }

    public ListRapidGrowthTablesResponse withSecond2LastTimestamp(Long second2LastTimestamp) {
        this.second2LastTimestamp = second2LastTimestamp;
        return this;
    }

    /**
     * 最近第二次诊断时间
     * @return second2LastTimestamp
     */
    public Long getSecond2LastTimestamp() {
        return second2LastTimestamp;
    }

    public void setSecond2LastTimestamp(Long second2LastTimestamp) {
        this.second2LastTimestamp = second2LastTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRapidGrowthTablesResponse that = (ListRapidGrowthTablesResponse) obj;
        return Objects.equals(this.tables, that.tables) && Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.lastDiagnoseTimestamp, that.lastDiagnoseTimestamp)
            && Objects.equals(this.first2LastTimestamp, that.first2LastTimestamp)
            && Objects.equals(this.second2LastTimestamp, that.second2LastTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tables, threshold, lastDiagnoseTimestamp, first2LastTimestamp, second2LastTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRapidGrowthTablesResponse {\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    lastDiagnoseTimestamp: ").append(toIndentedString(lastDiagnoseTimestamp)).append("\n");
        sb.append("    first2LastTimestamp: ").append(toIndentedString(first2LastTimestamp)).append("\n");
        sb.append("    second2LastTimestamp: ").append(toIndentedString(second2LastTimestamp)).append("\n");
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
