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
public class ShowSlowLogStatisticsNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_list")

    private List<SlowLogStatistics> statisticsList = null;

    public ShowSlowLogStatisticsNewResponse withStatisticsList(List<SlowLogStatistics> statisticsList) {
        this.statisticsList = statisticsList;
        return this;
    }

    public ShowSlowLogStatisticsNewResponse addStatisticsListItem(SlowLogStatistics statisticsListItem) {
        if (this.statisticsList == null) {
            this.statisticsList = new ArrayList<>();
        }
        this.statisticsList.add(statisticsListItem);
        return this;
    }

    public ShowSlowLogStatisticsNewResponse withStatisticsList(Consumer<List<SlowLogStatistics>> statisticsListSetter) {
        if (this.statisticsList == null) {
            this.statisticsList = new ArrayList<>();
        }
        statisticsListSetter.accept(this.statisticsList);
        return this;
    }

    /**
     * 慢日志统计列表
     * @return statisticsList
     */
    public List<SlowLogStatistics> getStatisticsList() {
        return statisticsList;
    }

    public void setStatisticsList(List<SlowLogStatistics> statisticsList) {
        this.statisticsList = statisticsList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSlowLogStatisticsNewResponse that = (ShowSlowLogStatisticsNewResponse) obj;
        return Objects.equals(this.statisticsList, that.statisticsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statisticsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSlowLogStatisticsNewResponse {\n");
        sb.append("    statisticsList: ").append(toIndentedString(statisticsList)).append("\n");
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
