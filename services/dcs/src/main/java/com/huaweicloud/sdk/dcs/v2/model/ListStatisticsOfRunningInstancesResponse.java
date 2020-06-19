package com.huaweicloud.sdk.dcs.v2.model;


import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.InstanceStatistic;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListStatisticsOfRunningInstancesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="statistics")
    
    private List<InstanceStatistic> statistics = null;
    
    public ListStatisticsOfRunningInstancesResponse withStatistics(List<InstanceStatistic> statistics) {
        this.statistics = statistics;
        return this;
    }

    
    public ListStatisticsOfRunningInstancesResponse addStatisticsItem(InstanceStatistic statisticsItem) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public ListStatisticsOfRunningInstancesResponse withStatistics(Consumer<List<InstanceStatistic>> statisticsSetter) {
        if(this.statistics == null ){
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * 该租户下处于“运行中”状态的实例的统计信息。
     * @return statistics
     */
    public List<InstanceStatistic> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<InstanceStatistic> statistics) {
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
        ListStatisticsOfRunningInstancesResponse listStatisticsOfRunningInstancesResponse = (ListStatisticsOfRunningInstancesResponse) o;
        return Objects.equals(this.statistics, listStatisticsOfRunningInstancesResponse.statistics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(statistics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatisticsOfRunningInstancesResponse {\n");
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

