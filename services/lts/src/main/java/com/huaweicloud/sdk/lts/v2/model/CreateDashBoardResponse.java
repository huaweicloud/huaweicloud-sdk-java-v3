package com.huaweicloud.sdk.lts.v2.model;

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
public class CreateDashBoardResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charts")

    private List<String> charts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    private List<String> filters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "useSystemTemplate")

    private String useSystemTemplate;

    public CreateDashBoardResponse withCharts(List<String> charts) {
        this.charts = charts;
        return this;
    }

    public CreateDashBoardResponse addChartsItem(String chartsItem) {
        if (this.charts == null) {
            this.charts = new ArrayList<>();
        }
        this.charts.add(chartsItem);
        return this;
    }

    public CreateDashBoardResponse withCharts(Consumer<List<String>> chartsSetter) {
        if (this.charts == null) {
            this.charts = new ArrayList<>();
        }
        chartsSetter.accept(this.charts);
        return this;
    }

    /**
     * 仪表盘图表
     * @return charts
     */
    public List<String> getCharts() {
        return charts;
    }

    public void setCharts(List<String> charts) {
        this.charts = charts;
    }

    public CreateDashBoardResponse withFilters(List<String> filters) {
        this.filters = filters;
        return this;
    }

    public CreateDashBoardResponse addFiltersItem(String filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public CreateDashBoardResponse withFilters(Consumer<List<String>> filtersSetter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * 过滤条件
     * @return filters
     */
    public List<String> getFilters() {
        return filters;
    }

    public void setFilters(List<String> filters) {
        this.filters = filters;
    }

    public CreateDashBoardResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 日志组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public CreateDashBoardResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 仪表盘id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateDashBoardResponse withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最近修改时间
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public CreateDashBoardResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateDashBoardResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 仪表盘名称
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CreateDashBoardResponse withUseSystemTemplate(String useSystemTemplate) {
        this.useSystemTemplate = useSystemTemplate;
        return this;
    }

    /**
     * 是否使用模板
     * @return useSystemTemplate
     */
    public String getUseSystemTemplate() {
        return useSystemTemplate;
    }

    public void setUseSystemTemplate(String useSystemTemplate) {
        this.useSystemTemplate = useSystemTemplate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDashBoardResponse that = (CreateDashBoardResponse) obj;
        return Objects.equals(this.charts, that.charts) && Objects.equals(this.filters, that.filters)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.useSystemTemplate, that.useSystemTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(charts, filters, groupName, id, lastUpdateTime, projectId, title, useSystemTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDashBoardResponse {\n");
        sb.append("    charts: ").append(toIndentedString(charts)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    useSystemTemplate: ").append(toIndentedString(useSystemTemplate)).append("\n");
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
