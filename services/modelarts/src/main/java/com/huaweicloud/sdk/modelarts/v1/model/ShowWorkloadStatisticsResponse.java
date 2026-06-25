package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWorkloadStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private WorkloadListStatisticsStatistics statistics;

    public ShowWorkloadStatisticsResponse withStatistics(WorkloadListStatisticsStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    public ShowWorkloadStatisticsResponse withStatistics(Consumer<WorkloadListStatisticsStatistics> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new WorkloadListStatisticsStatistics();
            statisticsSetter.accept(this.statistics);
        }

        return this;
    }

    /**
     * Get statistics
     * @return statistics
     */
    public WorkloadListStatisticsStatistics getStatistics() {
        return statistics;
    }

    public void setStatistics(WorkloadListStatisticsStatistics statistics) {
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
        ShowWorkloadStatisticsResponse that = (ShowWorkloadStatisticsResponse) obj;
        return Objects.equals(this.statistics, that.statistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkloadStatisticsResponse {\n");
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
