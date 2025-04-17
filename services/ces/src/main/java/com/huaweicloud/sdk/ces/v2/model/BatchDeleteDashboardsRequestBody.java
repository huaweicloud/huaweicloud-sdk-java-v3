package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteDashboardsRequestBody
 */
public class BatchDeleteDashboardsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_ids")

    private List<String> dashboardIds = null;

    public BatchDeleteDashboardsRequestBody withDashboardIds(List<String> dashboardIds) {
        this.dashboardIds = dashboardIds;
        return this;
    }

    public BatchDeleteDashboardsRequestBody addDashboardIdsItem(String dashboardIdsItem) {
        if (this.dashboardIds == null) {
            this.dashboardIds = new ArrayList<>();
        }
        this.dashboardIds.add(dashboardIdsItem);
        return this;
    }

    public BatchDeleteDashboardsRequestBody withDashboardIds(Consumer<List<String>> dashboardIdsSetter) {
        if (this.dashboardIds == null) {
            this.dashboardIds = new ArrayList<>();
        }
        dashboardIdsSetter.accept(this.dashboardIds);
        return this;
    }

    /**
     * 监控看板id列表
     * @return dashboardIds
     */
    public List<String> getDashboardIds() {
        return dashboardIds;
    }

    public void setDashboardIds(List<String> dashboardIds) {
        this.dashboardIds = dashboardIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteDashboardsRequestBody that = (BatchDeleteDashboardsRequestBody) obj;
        return Objects.equals(this.dashboardIds, that.dashboardIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboardIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteDashboardsRequestBody {\n");
        sb.append("    dashboardIds: ").append(toIndentedString(dashboardIds)).append("\n");
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
