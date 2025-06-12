package com.huaweicloud.sdk.kafka.v2.model;

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
public class ListConnectorTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<SmartConnectTaskEntity> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_number")

    private Integer totalNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_tasks")

    private Integer maxTasks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_tasks")

    private Integer quotaTasks;

    public ListConnectorTasksResponse withTasks(List<SmartConnectTaskEntity> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListConnectorTasksResponse addTasksItem(SmartConnectTaskEntity tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListConnectorTasksResponse withTasks(Consumer<List<SmartConnectTaskEntity>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * Smart Connect任务详情。
     * @return tasks
     */
    public List<SmartConnectTaskEntity> getTasks() {
        return tasks;
    }

    public void setTasks(List<SmartConnectTaskEntity> tasks) {
        this.tasks = tasks;
    }

    public ListConnectorTasksResponse withTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    /**
     * Smart Connect任务数。
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public ListConnectorTasksResponse withMaxTasks(Integer maxTasks) {
        this.maxTasks = maxTasks;
        return this;
    }

    /**
     * Smart Connect最大任务数。
     * @return maxTasks
     */
    public Integer getMaxTasks() {
        return maxTasks;
    }

    public void setMaxTasks(Integer maxTasks) {
        this.maxTasks = maxTasks;
    }

    public ListConnectorTasksResponse withQuotaTasks(Integer quotaTasks) {
        this.quotaTasks = quotaTasks;
        return this;
    }

    /**
     * Smart Connect任务配额。
     * @return quotaTasks
     */
    public Integer getQuotaTasks() {
        return quotaTasks;
    }

    public void setQuotaTasks(Integer quotaTasks) {
        this.quotaTasks = quotaTasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConnectorTasksResponse that = (ListConnectorTasksResponse) obj;
        return Objects.equals(this.tasks, that.tasks) && Objects.equals(this.totalNumber, that.totalNumber)
            && Objects.equals(this.maxTasks, that.maxTasks) && Objects.equals(this.quotaTasks, that.quotaTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks, totalNumber, maxTasks, quotaTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectorTasksResponse {\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
        sb.append("    maxTasks: ").append(toIndentedString(maxTasks)).append("\n");
        sb.append("    quotaTasks: ").append(toIndentedString(quotaTasks)).append("\n");
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
