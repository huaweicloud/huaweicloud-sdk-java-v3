package com.huaweicloud.sdk.dris.v1.model;

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
public class ListEdgeFlowsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private List<OpenV2XStatisticsBody> statistics = null;

    public ListEdgeFlowsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数说明**：条件查询返回的总条数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListEdgeFlowsResponse withStatistics(List<OpenV2XStatisticsBody> statistics) {
        this.statistics = statistics;
        return this;
    }

    public ListEdgeFlowsResponse addStatisticsItem(OpenV2XStatisticsBody statisticsItem) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public ListEdgeFlowsResponse withStatistics(Consumer<List<OpenV2XStatisticsBody>> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * **参数说明**：车辆流量，平均速度等统计信息列表
     * @return statistics
     */
    public List<OpenV2XStatisticsBody> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<OpenV2XStatisticsBody> statistics) {
        this.statistics = statistics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEdgeFlowsResponse listEdgeFlowsResponse = (ListEdgeFlowsResponse) o;
        return Objects.equals(this.count, listEdgeFlowsResponse.count)
            && Objects.equals(this.statistics, listEdgeFlowsResponse.statistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, statistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeFlowsResponse {\n");
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
