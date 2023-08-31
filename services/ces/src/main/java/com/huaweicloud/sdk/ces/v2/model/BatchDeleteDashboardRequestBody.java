package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteDashboardRequestBody
 */
public class BatchDeleteDashboardRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_ids")

    private List<String> dashboardIds = null;

    public BatchDeleteDashboardRequestBody withDashboardIds(List<String> dashboardIds) {
        this.dashboardIds = dashboardIds;
        return this;
    }

    public BatchDeleteDashboardRequestBody addDashboardIdsItem(String dashboardIdsItem) {
        if (this.dashboardIds == null) {
            this.dashboardIds = new ArrayList<>();
        }
        this.dashboardIds.add(dashboardIdsItem);
        return this;
    }

    public BatchDeleteDashboardRequestBody withDashboardIds(Consumer<List<String>> dashboardIdsSetter) {
        if (this.dashboardIds == null) {
            this.dashboardIds = new ArrayList<>();
        }
        dashboardIdsSetter.accept(this.dashboardIds);
        return this;
    }

    /**
     * 监控面板id列表
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
        BatchDeleteDashboardRequestBody that = (BatchDeleteDashboardRequestBody) obj;
        return Objects.equals(this.dashboardIds, that.dashboardIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboardIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteDashboardRequestBody {\n");
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
