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
public class DeleteDashboardsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboards")

    private List<BatchDeleteDashboardRespInfo> dashboards = null;

    public DeleteDashboardsResponse withDashboards(List<BatchDeleteDashboardRespInfo> dashboards) {
        this.dashboards = dashboards;
        return this;
    }

    public DeleteDashboardsResponse addDashboardsItem(BatchDeleteDashboardRespInfo dashboardsItem) {
        if (this.dashboards == null) {
            this.dashboards = new ArrayList<>();
        }
        this.dashboards.add(dashboardsItem);
        return this;
    }

    public DeleteDashboardsResponse withDashboards(Consumer<List<BatchDeleteDashboardRespInfo>> dashboardsSetter) {
        if (this.dashboards == null) {
            this.dashboards = new ArrayList<>();
        }
        dashboardsSetter.accept(this.dashboards);
        return this;
    }

    /**
     * **参数解释** 批量删除监控看板返回结果 
     * @return dashboards
     */
    public List<BatchDeleteDashboardRespInfo> getDashboards() {
        return dashboards;
    }

    public void setDashboards(List<BatchDeleteDashboardRespInfo> dashboards) {
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
        DeleteDashboardsResponse that = (DeleteDashboardsResponse) obj;
        return Objects.equals(this.dashboards, that.dashboards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDashboardsResponse {\n");
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
