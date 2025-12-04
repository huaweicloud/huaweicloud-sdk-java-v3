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
public class ShowIntelligentKillSessionStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private List<IntelligentKillSessionStatistic> statistics = null;

    public ShowIntelligentKillSessionStatisticResponse withStatistics(
        List<IntelligentKillSessionStatistic> statistics) {
        this.statistics = statistics;
        return this;
    }

    public ShowIntelligentKillSessionStatisticResponse addStatisticsItem(
        IntelligentKillSessionStatistic statisticsItem) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public ShowIntelligentKillSessionStatisticResponse withStatistics(
        Consumer<List<IntelligentKillSessionStatistic>> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * **参数解释**：  不同维度下的统计信息。  **约束限制**：  不涉及。
     * @return statistics
     */
    public List<IntelligentKillSessionStatistic> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<IntelligentKillSessionStatistic> statistics) {
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
        ShowIntelligentKillSessionStatisticResponse that = (ShowIntelligentKillSessionStatisticResponse) obj;
        return Objects.equals(this.statistics, that.statistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIntelligentKillSessionStatisticResponse {\n");
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
