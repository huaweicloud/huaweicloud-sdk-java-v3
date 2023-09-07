package com.huaweicloud.sdk.ces.v2.model;

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
public class ListDashboardInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboards")

    private List<DashBoardInfo> dashboards = null;

    public ListDashboardInfosResponse withDashboards(List<DashBoardInfo> dashboards) {
        this.dashboards = dashboards;
        return this;
    }

    public ListDashboardInfosResponse addDashboardsItem(DashBoardInfo dashboardsItem) {
        if (this.dashboards == null) {
            this.dashboards = new ArrayList<>();
        }
        this.dashboards.add(dashboardsItem);
        return this;
    }

    public ListDashboardInfosResponse withDashboards(Consumer<List<DashBoardInfo>> dashboardsSetter) {
        if (this.dashboards == null) {
            this.dashboards = new ArrayList<>();
        }
        dashboardsSetter.accept(this.dashboards);
        return this;
    }

    /**
     * 监控看板列表
     * @return dashboards
     */
    public List<DashBoardInfo> getDashboards() {
        return dashboards;
    }

    public void setDashboards(List<DashBoardInfo> dashboards) {
        this.dashboards = dashboards;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDashboardInfosResponse that = (ListDashboardInfosResponse) obj;
        return Objects.equals(this.dashboards, that.dashboards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDashboardInfosResponse {\n");
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
