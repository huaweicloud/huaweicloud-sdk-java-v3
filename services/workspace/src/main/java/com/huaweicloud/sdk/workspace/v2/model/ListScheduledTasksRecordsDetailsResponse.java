package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListScheduledTasksRecordsDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks_records_details")

    private List<ScheduledTasksRecordsDetails> tasksRecordsDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListScheduledTasksRecordsDetailsResponse withTasksRecordsDetails(
        List<ScheduledTasksRecordsDetails> tasksRecordsDetails) {
        this.tasksRecordsDetails = tasksRecordsDetails;
        return this;
    }

    public ListScheduledTasksRecordsDetailsResponse addTasksRecordsDetailsItem(
        ScheduledTasksRecordsDetails tasksRecordsDetailsItem) {
        if (this.tasksRecordsDetails == null) {
            this.tasksRecordsDetails = new ArrayList<>();
        }
        this.tasksRecordsDetails.add(tasksRecordsDetailsItem);
        return this;
    }

    public ListScheduledTasksRecordsDetailsResponse withTasksRecordsDetails(
        Consumer<List<ScheduledTasksRecordsDetails>> tasksRecordsDetailsSetter) {
        if (this.tasksRecordsDetails == null) {
            this.tasksRecordsDetails = new ArrayList<>();
        }
        tasksRecordsDetailsSetter.accept(this.tasksRecordsDetails);
        return this;
    }

    /**
     * 定时任务执行记录详情列表。
     * @return tasksRecordsDetails
     */
    public List<ScheduledTasksRecordsDetails> getTasksRecordsDetails() {
        return tasksRecordsDetails;
    }

    public void setTasksRecordsDetails(List<ScheduledTasksRecordsDetails> tasksRecordsDetails) {
        this.tasksRecordsDetails = tasksRecordsDetails;
    }

    public ListScheduledTasksRecordsDetailsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总个数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScheduledTasksRecordsDetailsResponse that = (ListScheduledTasksRecordsDetailsResponse) obj;
        return Objects.equals(this.tasksRecordsDetails, that.tasksRecordsDetails)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasksRecordsDetails, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledTasksRecordsDetailsResponse {\n");
        sb.append("    tasksRecordsDetails: ").append(toIndentedString(tasksRecordsDetails)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
