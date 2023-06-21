package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ShowAppsDashboardResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboards")

    private List<StatisticForDashboard> dashboards = null;

    public ShowAppsDashboardResponse withDashboards(List<StatisticForDashboard> dashboards) {
        this.dashboards = dashboards;
        return this;
    }

    public ShowAppsDashboardResponse addDashboardsItem(StatisticForDashboard dashboardsItem) {
        if (this.dashboards == null) {
            this.dashboards = new ArrayList<>();
        }
        this.dashboards.add(dashboardsItem);
        return this;
    }

    public ShowAppsDashboardResponse withDashboards(Consumer<List<StatisticForDashboard>> dashboardsSetter) {
        if (this.dashboards == null) {
            this.dashboards = new ArrayList<>();
        }
        dashboardsSetter.accept(this.dashboards);
        return this;
    }

    /**
     * 统计信息仪表板
     * @return dashboards
     */
    public List<StatisticForDashboard> getDashboards() {
        return dashboards;
    }

    public void setDashboards(List<StatisticForDashboard> dashboards) {
        this.dashboards = dashboards;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAppsDashboardResponse showAppsDashboardResponse = (ShowAppsDashboardResponse) o;
        return Objects.equals(this.dashboards, showAppsDashboardResponse.dashboards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppsDashboardResponse {\n");
        sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
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
