package com.huaweicloud.sdk.bcc.v1.model;

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
public class ShowAlarmSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private List<ShowAlarmSummaryResponseBodyStatistics> statistics = null;

    public ShowAlarmSummaryResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 告警总数
     * minimum: 0
     * maximum: 65535
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ShowAlarmSummaryResponse withStatistics(List<ShowAlarmSummaryResponseBodyStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }

    public ShowAlarmSummaryResponse addStatisticsItem(ShowAlarmSummaryResponseBodyStatistics statisticsItem) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public ShowAlarmSummaryResponse withStatistics(
        Consumer<List<ShowAlarmSummaryResponseBodyStatistics>> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * 告警统计信息
     * @return statistics
     */
    public List<ShowAlarmSummaryResponseBodyStatistics> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<ShowAlarmSummaryResponseBodyStatistics> statistics) {
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
        ShowAlarmSummaryResponse that = (ShowAlarmSummaryResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.statistics, that.statistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, statistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlarmSummaryResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
