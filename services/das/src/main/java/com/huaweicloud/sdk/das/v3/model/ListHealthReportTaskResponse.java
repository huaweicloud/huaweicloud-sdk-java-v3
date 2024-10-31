package com.huaweicloud.sdk.das.v3.model;

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
public class ListHealthReportTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_report_task_list")

    private List<HealthReportTask> healthReportTaskList = null;

    public ListHealthReportTaskResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 诊断报告总数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListHealthReportTaskResponse withHealthReportTaskList(List<HealthReportTask> healthReportTaskList) {
        this.healthReportTaskList = healthReportTaskList;
        return this;
    }

    public ListHealthReportTaskResponse addHealthReportTaskListItem(HealthReportTask healthReportTaskListItem) {
        if (this.healthReportTaskList == null) {
            this.healthReportTaskList = new ArrayList<>();
        }
        this.healthReportTaskList.add(healthReportTaskListItem);
        return this;
    }

    public ListHealthReportTaskResponse withHealthReportTaskList(
        Consumer<List<HealthReportTask>> healthReportTaskListSetter) {
        if (this.healthReportTaskList == null) {
            this.healthReportTaskList = new ArrayList<>();
        }
        healthReportTaskListSetter.accept(this.healthReportTaskList);
        return this;
    }

    /**
     * 诊断报告列表
     * @return healthReportTaskList
     */
    public List<HealthReportTask> getHealthReportTaskList() {
        return healthReportTaskList;
    }

    public void setHealthReportTaskList(List<HealthReportTask> healthReportTaskList) {
        this.healthReportTaskList = healthReportTaskList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHealthReportTaskResponse that = (ListHealthReportTaskResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.healthReportTaskList, that.healthReportTaskList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, healthReportTaskList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHealthReportTaskResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    healthReportTaskList: ").append(toIndentedString(healthReportTaskList)).append("\n");
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
