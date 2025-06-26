package com.huaweicloud.sdk.smn.v2.model;

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
public class ListTopicMessageStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private SumCountDetail total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private List<StatisticsDetail> statistics = null;

    public ListTopicMessageStatisticsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListTopicMessageStatisticsResponse withTotal(SumCountDetail total) {
        this.total = total;
        return this;
    }

    public ListTopicMessageStatisticsResponse withTotal(Consumer<SumCountDetail> totalSetter) {
        if (this.total == null) {
            this.total = new SumCountDetail();
            totalSetter.accept(this.total);
        }

        return this;
    }

    /**
     * Get total
     * @return total
     */
    public SumCountDetail getTotal() {
        return total;
    }

    public void setTotal(SumCountDetail total) {
        this.total = total;
    }

    public ListTopicMessageStatisticsResponse withStatistics(List<StatisticsDetail> statistics) {
        this.statistics = statistics;
        return this;
    }

    public ListTopicMessageStatisticsResponse addStatisticsItem(StatisticsDetail statisticsItem) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public ListTopicMessageStatisticsResponse withStatistics(Consumer<List<StatisticsDetail>> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * 周期内的发送详情列表
     * @return statistics
     */
    public List<StatisticsDetail> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<StatisticsDetail> statistics) {
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
        ListTopicMessageStatisticsResponse that = (ListTopicMessageStatisticsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.total, that.total)
            && Objects.equals(this.statistics, that.statistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, total, statistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopicMessageStatisticsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
