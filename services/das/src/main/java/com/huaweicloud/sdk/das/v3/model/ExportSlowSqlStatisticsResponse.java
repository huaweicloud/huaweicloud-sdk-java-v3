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
public class ExportSlowSqlStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_list")

    private List<SlowSqlStatistics> statisticsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ExportSlowSqlStatisticsResponse withStatisticsList(List<SlowSqlStatistics> statisticsList) {
        this.statisticsList = statisticsList;
        return this;
    }

    public ExportSlowSqlStatisticsResponse addStatisticsListItem(SlowSqlStatistics statisticsListItem) {
        if (this.statisticsList == null) {
            this.statisticsList = new ArrayList<>();
        }
        this.statisticsList.add(statisticsListItem);
        return this;
    }

    public ExportSlowSqlStatisticsResponse withStatisticsList(Consumer<List<SlowSqlStatistics>> statisticsListSetter) {
        if (this.statisticsList == null) {
            this.statisticsList = new ArrayList<>();
        }
        statisticsListSetter.accept(this.statisticsList);
        return this;
    }

    /**
     * 慢SQL统计列表。
     * @return statisticsList
     */
    public List<SlowSqlStatistics> getStatisticsList() {
        return statisticsList;
    }

    public void setStatisticsList(List<SlowSqlStatistics> statisticsList) {
        this.statisticsList = statisticsList;
    }

    public ExportSlowSqlStatisticsResponse withTotalCount(Integer totalCount) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportSlowSqlStatisticsResponse that = (ExportSlowSqlStatisticsResponse) obj;
        return Objects.equals(this.statisticsList, that.statisticsList)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statisticsList, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportSlowSqlStatisticsResponse {\n");
        sb.append("    statisticsList: ").append(toIndentedString(statisticsList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
