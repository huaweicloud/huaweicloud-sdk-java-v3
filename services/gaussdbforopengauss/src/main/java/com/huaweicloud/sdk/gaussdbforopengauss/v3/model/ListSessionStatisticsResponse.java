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
public class ListSessionStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_list")

    private List<DimensionListResult> statisticsList = null;

    public ListSessionStatisticsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: 总数。 **取值范围**: 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSessionStatisticsResponse withStatisticsList(List<DimensionListResult> statisticsList) {
        this.statisticsList = statisticsList;
        return this;
    }

    public ListSessionStatisticsResponse addStatisticsListItem(DimensionListResult statisticsListItem) {
        if (this.statisticsList == null) {
            this.statisticsList = new ArrayList<>();
        }
        this.statisticsList.add(statisticsListItem);
        return this;
    }

    public ListSessionStatisticsResponse withStatisticsList(Consumer<List<DimensionListResult>> statisticsListSetter) {
        if (this.statisticsList == null) {
            this.statisticsList = new ArrayList<>();
        }
        statisticsListSetter.accept(this.statisticsList);
        return this;
    }

    /**
     * **参数解释**: 会话统计列表。
     * @return statisticsList
     */
    public List<DimensionListResult> getStatisticsList() {
        return statisticsList;
    }

    public void setStatisticsList(List<DimensionListResult> statisticsList) {
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
        ListSessionStatisticsResponse that = (ListSessionStatisticsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.statisticsList, that.statisticsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, statisticsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSessionStatisticsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
