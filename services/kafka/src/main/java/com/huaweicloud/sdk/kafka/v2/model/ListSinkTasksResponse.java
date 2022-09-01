package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSinkTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    @JacksonXmlProperty(localName = "tasks")

    private List<ListSinkTasksRespTasks> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_number")

    @JacksonXmlProperty(localName = "total_number")

    private Integer totalNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_tasks")

    @JacksonXmlProperty(localName = "max_tasks")

    private Integer maxTasks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_tasks")

    @JacksonXmlProperty(localName = "quota_tasks")

    private Integer quotaTasks;

    public ListSinkTasksResponse withTasks(List<ListSinkTasksRespTasks> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListSinkTasksResponse addTasksItem(ListSinkTasksRespTasks tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListSinkTasksResponse withTasks(Consumer<List<ListSinkTasksRespTasks>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 转储任务列表。
     * @return tasks
     */
    public List<ListSinkTasksRespTasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<ListSinkTasksRespTasks> tasks) {
        this.tasks = tasks;
    }

    public ListSinkTasksResponse withTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    /**
     * 转储任务总数。
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public ListSinkTasksResponse withMaxTasks(Integer maxTasks) {
        this.maxTasks = maxTasks;
        return this;
    }

    /**
     * 总的支持任务个数。
     * @return maxTasks
     */
    public Integer getMaxTasks() {
        return maxTasks;
    }

    public void setMaxTasks(Integer maxTasks) {
        this.maxTasks = maxTasks;
    }

    public ListSinkTasksResponse withQuotaTasks(Integer quotaTasks) {
        this.quotaTasks = quotaTasks;
        return this;
    }

    /**
     * 任务总数的配额。
     * @return quotaTasks
     */
    public Integer getQuotaTasks() {
        return quotaTasks;
    }

    public void setQuotaTasks(Integer quotaTasks) {
        this.quotaTasks = quotaTasks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSinkTasksResponse listSinkTasksResponse = (ListSinkTasksResponse) o;
        return Objects.equals(this.tasks, listSinkTasksResponse.tasks)
            && Objects.equals(this.totalNumber, listSinkTasksResponse.totalNumber)
            && Objects.equals(this.maxTasks, listSinkTasksResponse.maxTasks)
            && Objects.equals(this.quotaTasks, listSinkTasksResponse.quotaTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks, totalNumber, maxTasks, quotaTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSinkTasksResponse {\n");
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
