package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListEnhanceFullSqlStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private List<FullSqlStatisticInfoResult> statistics = null;

    public ListEnhanceFullSqlStatisticsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 全量SQL聚合统计列表总数。 **取值范围**: 不涉及。
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ListEnhanceFullSqlStatisticsResponse withStatistics(List<FullSqlStatisticInfoResult> statistics) {
        this.statistics = statistics;
        return this;
    }

    public ListEnhanceFullSqlStatisticsResponse addStatisticsItem(FullSqlStatisticInfoResult statisticsItem) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public ListEnhanceFullSqlStatisticsResponse withStatistics(
        Consumer<List<FullSqlStatisticInfoResult>> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * **参数解释**: 全量SQL聚合统计列表。
     * @return statistics
     */
    public List<FullSqlStatisticInfoResult> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<FullSqlStatisticInfoResult> statistics) {
        this.statistics = statistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnhanceFullSqlStatisticsResponse that = (ListEnhanceFullSqlStatisticsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.statistics, that.statistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, statistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnhanceFullSqlStatisticsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
