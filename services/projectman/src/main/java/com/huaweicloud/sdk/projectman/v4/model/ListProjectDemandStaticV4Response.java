package com.huaweicloud.sdk.projectman.v4.model;

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
public class ListProjectDemandStaticV4Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demand_statistics")

    private List<DemandStatisticResponseV4> demandStatistics = null;

    public ListProjectDemandStaticV4Response withDemandStatistics(List<DemandStatisticResponseV4> demandStatistics) {
        this.demandStatistics = demandStatistics;
        return this;
    }

    public ListProjectDemandStaticV4Response addDemandStatisticsItem(DemandStatisticResponseV4 demandStatisticsItem) {
        if (this.demandStatistics == null) {
            this.demandStatistics = new ArrayList<>();
        }
        this.demandStatistics.add(demandStatisticsItem);
        return this;
    }

    public ListProjectDemandStaticV4Response withDemandStatistics(
        Consumer<List<DemandStatisticResponseV4>> demandStatisticsSetter) {
        if (this.demandStatistics == null) {
            this.demandStatistics = new ArrayList<>();
        }
        demandStatisticsSetter.accept(this.demandStatistics);
        return this;
    }

    /**
     * 需求统计
     * @return demandStatistics
     */
    public List<DemandStatisticResponseV4> getDemandStatistics() {
        return demandStatistics;
    }

    public void setDemandStatistics(List<DemandStatisticResponseV4> demandStatistics) {
        this.demandStatistics = demandStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectDemandStaticV4Response that = (ListProjectDemandStaticV4Response) obj;
        return Objects.equals(this.demandStatistics, that.demandStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(demandStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectDemandStaticV4Response {\n");
        sb.append("    demandStatistics: ").append(toIndentedString(demandStatistics)).append("\n");
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
