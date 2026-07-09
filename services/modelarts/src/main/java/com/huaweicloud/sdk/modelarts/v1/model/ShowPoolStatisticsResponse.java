package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPoolStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private PoolStatisticsStatistics statistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operationTime")

    private String operationTime;

    public ShowPoolStatisticsResponse withStatistics(PoolStatisticsStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    public ShowPoolStatisticsResponse withStatistics(Consumer<PoolStatisticsStatistics> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new PoolStatisticsStatistics();
            statisticsSetter.accept(this.statistics);
        }

        return this;
    }

    /**
     * Get statistics
     * @return statistics
     */
    public PoolStatisticsStatistics getStatistics() {
        return statistics;
    }

    public void setStatistics(PoolStatisticsStatistics statistics) {
        this.statistics = statistics;
    }

    public ShowPoolStatisticsResponse withOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }

    /**
     * **参数描述**： 统计的时间。 **取值范围**： 不涉及。
     * @return operationTime
     */
    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPoolStatisticsResponse that = (ShowPoolStatisticsResponse) obj;
        return Objects.equals(this.statistics, that.statistics)
            && Objects.equals(this.operationTime, that.operationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statistics, operationTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPoolStatisticsResponse {\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
        sb.append("    operationTime: ").append(toIndentedString(operationTime)).append("\n");
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
