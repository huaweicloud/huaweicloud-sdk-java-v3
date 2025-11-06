package com.huaweicloud.sdk.aom.v2.model;

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
public class ListDashBoardsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboards")

    private List<Dashboard> dashboards = null;

    public ListDashBoardsResponse withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 当前页大小。
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListDashBoardsResponse withDashboards(List<Dashboard> dashboards) {
        this.dashboards = dashboards;
        return this;
    }

    public ListDashBoardsResponse addDashboardsItem(Dashboard dashboardsItem) {
        if (this.dashboards == null) {
            this.dashboards = new ArrayList<>();
        }
        this.dashboards.add(dashboardsItem);
        return this;
    }

    public ListDashBoardsResponse withDashboards(Consumer<List<Dashboard>> dashboardsSetter) {
        if (this.dashboards == null) {
            this.dashboards = new ArrayList<>();
        }
        dashboardsSetter.accept(this.dashboards);
        return this;
    }

    /**
     * 仪表盘详情列表。
     * @return dashboards
     */
    public List<Dashboard> getDashboards() {
        return dashboards;
    }

    public void setDashboards(List<Dashboard> dashboards) {
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
        ListDashBoardsResponse that = (ListDashBoardsResponse) obj;
        return Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.dashboards, that.dashboards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageSize, dashboards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDashBoardsResponse {\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
