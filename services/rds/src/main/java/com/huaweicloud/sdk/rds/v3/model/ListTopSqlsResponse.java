package com.huaweicloud.sdk.rds.v3.model;

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
public class ListTopSqlsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<QueryTopSqlsResult> list = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_cpu_time_top_values")

    private List<TopSqlsTimeResult> avgCpuTimeTopValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_duration_time_top_values")

    private List<TopSqlsTimeResult> avgDurationTimeTopValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_top_values")

    private List<TopSqlsRowResult> avgRowsTopValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_logical_top_values")

    private List<TopSqlsLogicalReadResult> avgLogicalTopValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cpu_time_top_values")

    private List<TopSqlsTimeResult> totalCpuTimeTopValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_duration_time_top_values")

    private List<TopSqlsTimeResult> totalDurationTimeTopValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_rows_top_values")

    private List<TopSqlsRowResult> totalRowsTopValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_logical_reads_top_values")

    private List<TopSqlsLogicalReadResult> totalLogicalReadsTopValues = null;

    public ListTopSqlsResponse withTotalCount(Integer totalCount) {
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

    public ListTopSqlsResponse withList(List<QueryTopSqlsResult> list) {
        this.list = list;
        return this;
    }

    public ListTopSqlsResponse addListItem(QueryTopSqlsResult listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ListTopSqlsResponse withList(Consumer<List<QueryTopSqlsResult>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * TOP SQL 信息列表。
     * @return list
     */
    public List<QueryTopSqlsResult> getList() {
        return list;
    }

    public void setList(List<QueryTopSqlsResult> list) {
        this.list = list;
    }

    public ListTopSqlsResponse withAvgCpuTimeTopValues(List<TopSqlsTimeResult> avgCpuTimeTopValues) {
        this.avgCpuTimeTopValues = avgCpuTimeTopValues;
        return this;
    }

    public ListTopSqlsResponse addAvgCpuTimeTopValuesItem(TopSqlsTimeResult avgCpuTimeTopValuesItem) {
        if (this.avgCpuTimeTopValues == null) {
            this.avgCpuTimeTopValues = new ArrayList<>();
        }
        this.avgCpuTimeTopValues.add(avgCpuTimeTopValuesItem);
        return this;
    }

    public ListTopSqlsResponse withAvgCpuTimeTopValues(Consumer<List<TopSqlsTimeResult>> avgCpuTimeTopValuesSetter) {
        if (this.avgCpuTimeTopValues == null) {
            this.avgCpuTimeTopValues = new ArrayList<>();
        }
        avgCpuTimeTopValuesSetter.accept(this.avgCpuTimeTopValues);
        return this;
    }

    /**
     * 平均CPU开销表TOP SQL列表。
     * @return avgCpuTimeTopValues
     */
    public List<TopSqlsTimeResult> getAvgCpuTimeTopValues() {
        return avgCpuTimeTopValues;
    }

    public void setAvgCpuTimeTopValues(List<TopSqlsTimeResult> avgCpuTimeTopValues) {
        this.avgCpuTimeTopValues = avgCpuTimeTopValues;
    }

    public ListTopSqlsResponse withAvgDurationTimeTopValues(List<TopSqlsTimeResult> avgDurationTimeTopValues) {
        this.avgDurationTimeTopValues = avgDurationTimeTopValues;
        return this;
    }

    public ListTopSqlsResponse addAvgDurationTimeTopValuesItem(TopSqlsTimeResult avgDurationTimeTopValuesItem) {
        if (this.avgDurationTimeTopValues == null) {
            this.avgDurationTimeTopValues = new ArrayList<>();
        }
        this.avgDurationTimeTopValues.add(avgDurationTimeTopValuesItem);
        return this;
    }

    public ListTopSqlsResponse withAvgDurationTimeTopValues(
        Consumer<List<TopSqlsTimeResult>> avgDurationTimeTopValuesSetter) {
        if (this.avgDurationTimeTopValues == null) {
            this.avgDurationTimeTopValues = new ArrayList<>();
        }
        avgDurationTimeTopValuesSetter.accept(this.avgDurationTimeTopValues);
        return this;
    }

    /**
     * 平均执行耗时TOP SQL列表。
     * @return avgDurationTimeTopValues
     */
    public List<TopSqlsTimeResult> getAvgDurationTimeTopValues() {
        return avgDurationTimeTopValues;
    }

    public void setAvgDurationTimeTopValues(List<TopSqlsTimeResult> avgDurationTimeTopValues) {
        this.avgDurationTimeTopValues = avgDurationTimeTopValues;
    }

    public ListTopSqlsResponse withAvgRowsTopValues(List<TopSqlsRowResult> avgRowsTopValues) {
        this.avgRowsTopValues = avgRowsTopValues;
        return this;
    }

    public ListTopSqlsResponse addAvgRowsTopValuesItem(TopSqlsRowResult avgRowsTopValuesItem) {
        if (this.avgRowsTopValues == null) {
            this.avgRowsTopValues = new ArrayList<>();
        }
        this.avgRowsTopValues.add(avgRowsTopValuesItem);
        return this;
    }

    public ListTopSqlsResponse withAvgRowsTopValues(Consumer<List<TopSqlsRowResult>> avgRowsTopValuesSetter) {
        if (this.avgRowsTopValues == null) {
            this.avgRowsTopValues = new ArrayList<>();
        }
        avgRowsTopValuesSetter.accept(this.avgRowsTopValues);
        return this;
    }

    /**
     * 平均返回行TOP SQL列表。
     * @return avgRowsTopValues
     */
    public List<TopSqlsRowResult> getAvgRowsTopValues() {
        return avgRowsTopValues;
    }

    public void setAvgRowsTopValues(List<TopSqlsRowResult> avgRowsTopValues) {
        this.avgRowsTopValues = avgRowsTopValues;
    }

    public ListTopSqlsResponse withAvgLogicalTopValues(List<TopSqlsLogicalReadResult> avgLogicalTopValues) {
        this.avgLogicalTopValues = avgLogicalTopValues;
        return this;
    }

    public ListTopSqlsResponse addAvgLogicalTopValuesItem(TopSqlsLogicalReadResult avgLogicalTopValuesItem) {
        if (this.avgLogicalTopValues == null) {
            this.avgLogicalTopValues = new ArrayList<>();
        }
        this.avgLogicalTopValues.add(avgLogicalTopValuesItem);
        return this;
    }

    public ListTopSqlsResponse withAvgLogicalTopValues(
        Consumer<List<TopSqlsLogicalReadResult>> avgLogicalTopValuesSetter) {
        if (this.avgLogicalTopValues == null) {
            this.avgLogicalTopValues = new ArrayList<>();
        }
        avgLogicalTopValuesSetter.accept(this.avgLogicalTopValues);
        return this;
    }

    /**
     * 平均逻辑读TOP SQL列表。
     * @return avgLogicalTopValues
     */
    public List<TopSqlsLogicalReadResult> getAvgLogicalTopValues() {
        return avgLogicalTopValues;
    }

    public void setAvgLogicalTopValues(List<TopSqlsLogicalReadResult> avgLogicalTopValues) {
        this.avgLogicalTopValues = avgLogicalTopValues;
    }

    public ListTopSqlsResponse withTotalCpuTimeTopValues(List<TopSqlsTimeResult> totalCpuTimeTopValues) {
        this.totalCpuTimeTopValues = totalCpuTimeTopValues;
        return this;
    }

    public ListTopSqlsResponse addTotalCpuTimeTopValuesItem(TopSqlsTimeResult totalCpuTimeTopValuesItem) {
        if (this.totalCpuTimeTopValues == null) {
            this.totalCpuTimeTopValues = new ArrayList<>();
        }
        this.totalCpuTimeTopValues.add(totalCpuTimeTopValuesItem);
        return this;
    }

    public ListTopSqlsResponse withTotalCpuTimeTopValues(
        Consumer<List<TopSqlsTimeResult>> totalCpuTimeTopValuesSetter) {
        if (this.totalCpuTimeTopValues == null) {
            this.totalCpuTimeTopValues = new ArrayList<>();
        }
        totalCpuTimeTopValuesSetter.accept(this.totalCpuTimeTopValues);
        return this;
    }

    /**
     * 总CPU开销表TOP SQL列表。
     * @return totalCpuTimeTopValues
     */
    public List<TopSqlsTimeResult> getTotalCpuTimeTopValues() {
        return totalCpuTimeTopValues;
    }

    public void setTotalCpuTimeTopValues(List<TopSqlsTimeResult> totalCpuTimeTopValues) {
        this.totalCpuTimeTopValues = totalCpuTimeTopValues;
    }

    public ListTopSqlsResponse withTotalDurationTimeTopValues(List<TopSqlsTimeResult> totalDurationTimeTopValues) {
        this.totalDurationTimeTopValues = totalDurationTimeTopValues;
        return this;
    }

    public ListTopSqlsResponse addTotalDurationTimeTopValuesItem(TopSqlsTimeResult totalDurationTimeTopValuesItem) {
        if (this.totalDurationTimeTopValues == null) {
            this.totalDurationTimeTopValues = new ArrayList<>();
        }
        this.totalDurationTimeTopValues.add(totalDurationTimeTopValuesItem);
        return this;
    }

    public ListTopSqlsResponse withTotalDurationTimeTopValues(
        Consumer<List<TopSqlsTimeResult>> totalDurationTimeTopValuesSetter) {
        if (this.totalDurationTimeTopValues == null) {
            this.totalDurationTimeTopValues = new ArrayList<>();
        }
        totalDurationTimeTopValuesSetter.accept(this.totalDurationTimeTopValues);
        return this;
    }

    /**
     * 总执行耗时TOP SQL列表。
     * @return totalDurationTimeTopValues
     */
    public List<TopSqlsTimeResult> getTotalDurationTimeTopValues() {
        return totalDurationTimeTopValues;
    }

    public void setTotalDurationTimeTopValues(List<TopSqlsTimeResult> totalDurationTimeTopValues) {
        this.totalDurationTimeTopValues = totalDurationTimeTopValues;
    }

    public ListTopSqlsResponse withTotalRowsTopValues(List<TopSqlsRowResult> totalRowsTopValues) {
        this.totalRowsTopValues = totalRowsTopValues;
        return this;
    }

    public ListTopSqlsResponse addTotalRowsTopValuesItem(TopSqlsRowResult totalRowsTopValuesItem) {
        if (this.totalRowsTopValues == null) {
            this.totalRowsTopValues = new ArrayList<>();
        }
        this.totalRowsTopValues.add(totalRowsTopValuesItem);
        return this;
    }

    public ListTopSqlsResponse withTotalRowsTopValues(Consumer<List<TopSqlsRowResult>> totalRowsTopValuesSetter) {
        if (this.totalRowsTopValues == null) {
            this.totalRowsTopValues = new ArrayList<>();
        }
        totalRowsTopValuesSetter.accept(this.totalRowsTopValues);
        return this;
    }

    /**
     * 总返回行TOP SQL列表。
     * @return totalRowsTopValues
     */
    public List<TopSqlsRowResult> getTotalRowsTopValues() {
        return totalRowsTopValues;
    }

    public void setTotalRowsTopValues(List<TopSqlsRowResult> totalRowsTopValues) {
        this.totalRowsTopValues = totalRowsTopValues;
    }

    public ListTopSqlsResponse withTotalLogicalReadsTopValues(
        List<TopSqlsLogicalReadResult> totalLogicalReadsTopValues) {
        this.totalLogicalReadsTopValues = totalLogicalReadsTopValues;
        return this;
    }

    public ListTopSqlsResponse addTotalLogicalReadsTopValuesItem(
        TopSqlsLogicalReadResult totalLogicalReadsTopValuesItem) {
        if (this.totalLogicalReadsTopValues == null) {
            this.totalLogicalReadsTopValues = new ArrayList<>();
        }
        this.totalLogicalReadsTopValues.add(totalLogicalReadsTopValuesItem);
        return this;
    }

    public ListTopSqlsResponse withTotalLogicalReadsTopValues(
        Consumer<List<TopSqlsLogicalReadResult>> totalLogicalReadsTopValuesSetter) {
        if (this.totalLogicalReadsTopValues == null) {
            this.totalLogicalReadsTopValues = new ArrayList<>();
        }
        totalLogicalReadsTopValuesSetter.accept(this.totalLogicalReadsTopValues);
        return this;
    }

    /**
     * 总逻辑读TOP SQL列表。
     * @return totalLogicalReadsTopValues
     */
    public List<TopSqlsLogicalReadResult> getTotalLogicalReadsTopValues() {
        return totalLogicalReadsTopValues;
    }

    public void setTotalLogicalReadsTopValues(List<TopSqlsLogicalReadResult> totalLogicalReadsTopValues) {
        this.totalLogicalReadsTopValues = totalLogicalReadsTopValues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTopSqlsResponse that = (ListTopSqlsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.list, that.list)
            && Objects.equals(this.avgCpuTimeTopValues, that.avgCpuTimeTopValues)
            && Objects.equals(this.avgDurationTimeTopValues, that.avgDurationTimeTopValues)
            && Objects.equals(this.avgRowsTopValues, that.avgRowsTopValues)
            && Objects.equals(this.avgLogicalTopValues, that.avgLogicalTopValues)
            && Objects.equals(this.totalCpuTimeTopValues, that.totalCpuTimeTopValues)
            && Objects.equals(this.totalDurationTimeTopValues, that.totalDurationTimeTopValues)
            && Objects.equals(this.totalRowsTopValues, that.totalRowsTopValues)
            && Objects.equals(this.totalLogicalReadsTopValues, that.totalLogicalReadsTopValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount,
            list,
            avgCpuTimeTopValues,
            avgDurationTimeTopValues,
            avgRowsTopValues,
            avgLogicalTopValues,
            totalCpuTimeTopValues,
            totalDurationTimeTopValues,
            totalRowsTopValues,
            totalLogicalReadsTopValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopSqlsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    avgCpuTimeTopValues: ").append(toIndentedString(avgCpuTimeTopValues)).append("\n");
        sb.append("    avgDurationTimeTopValues: ").append(toIndentedString(avgDurationTimeTopValues)).append("\n");
        sb.append("    avgRowsTopValues: ").append(toIndentedString(avgRowsTopValues)).append("\n");
        sb.append("    avgLogicalTopValues: ").append(toIndentedString(avgLogicalTopValues)).append("\n");
        sb.append("    totalCpuTimeTopValues: ").append(toIndentedString(totalCpuTimeTopValues)).append("\n");
        sb.append("    totalDurationTimeTopValues: ").append(toIndentedString(totalDurationTimeTopValues)).append("\n");
        sb.append("    totalRowsTopValues: ").append(toIndentedString(totalRowsTopValues)).append("\n");
        sb.append("    totalLogicalReadsTopValues: ").append(toIndentedString(totalLogicalReadsTopValues)).append("\n");
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
