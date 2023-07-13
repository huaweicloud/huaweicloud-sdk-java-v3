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
public class ShowIterationV4Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charts")

    private List<Chart> charts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_total")

    private Integer closedTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "have_task")

    private Boolean haveTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration_id")

    private Integer iterationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opened_total")

    private Integer openedTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ShowIterationV4Response withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 迭代结束时间，年-月-日
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ShowIterationV4Response withCharts(List<Chart> charts) {
        this.charts = charts;
        return this;
    }

    public ShowIterationV4Response addChartsItem(Chart chartsItem) {
        if (this.charts == null) {
            this.charts = new ArrayList<>();
        }
        this.charts.add(chartsItem);
        return this;
    }

    public ShowIterationV4Response withCharts(Consumer<List<Chart>> chartsSetter) {
        if (this.charts == null) {
            this.charts = new ArrayList<>();
        }
        chartsSetter.accept(this.charts);
        return this;
    }

    /**
     * 燃尽图
     * @return charts
     */
    public List<Chart> getCharts() {
        return charts;
    }

    public void setCharts(List<Chart> charts) {
        this.charts = charts;
    }

    public ShowIterationV4Response withClosedTotal(Integer closedTotal) {
        this.closedTotal = closedTotal;
        return this;
    }

    /**
     * 已关闭的工单数
     * @return closedTotal
     */
    public Integer getClosedTotal() {
        return closedTotal;
    }

    public void setClosedTotal(Integer closedTotal) {
        this.closedTotal = closedTotal;
    }

    public ShowIterationV4Response withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 迭代创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ShowIterationV4Response withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 迭代开始时间，年-月-日
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowIterationV4Response withHaveTask(Boolean haveTask) {
        this.haveTask = haveTask;
        return this;
    }

    /**
     * 是否有task
     * @return haveTask
     */
    public Boolean getHaveTask() {
        return haveTask;
    }

    public void setHaveTask(Boolean haveTask) {
        this.haveTask = haveTask;
    }

    public ShowIterationV4Response withIterationId(Integer iterationId) {
        this.iterationId = iterationId;
        return this;
    }

    /**
     * 迭代id
     * @return iterationId
     */
    public Integer getIterationId() {
        return iterationId;
    }

    public void setIterationId(Integer iterationId) {
        this.iterationId = iterationId;
    }

    public ShowIterationV4Response withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 迭代标题
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowIterationV4Response withOpenedTotal(Integer openedTotal) {
        this.openedTotal = openedTotal;
        return this;
    }

    /**
     * 开启的工单数
     * @return openedTotal
     */
    public Integer getOpenedTotal() {
        return openedTotal;
    }

    public void setOpenedTotal(Integer openedTotal) {
        this.openedTotal = openedTotal;
    }

    public ShowIterationV4Response withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 工作进展
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public ShowIterationV4Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 工单总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowIterationV4Response withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 迭代更新时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public ShowIterationV4Response withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 迭代的状态,0 未开始，1 进行中，2 结束
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIterationV4Response that = (ShowIterationV4Response) obj;
        return Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.charts, that.charts)
            && Objects.equals(this.closedTotal, that.closedTotal) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.haveTask, that.haveTask)
            && Objects.equals(this.iterationId, that.iterationId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.openedTotal, that.openedTotal) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.total, that.total) && Objects.equals(this.updatedTime, that.updatedTime)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginTime,
            charts,
            closedTotal,
            createdTime,
            endTime,
            haveTask,
            iterationId,
            name,
            openedTotal,
            progress,
            total,
            updatedTime,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIterationV4Response {\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    charts: ").append(toIndentedString(charts)).append("\n");
        sb.append("    closedTotal: ").append(toIndentedString(closedTotal)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    haveTask: ").append(toIndentedString(haveTask)).append("\n");
        sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    openedTotal: ").append(toIndentedString(openedTotal)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
