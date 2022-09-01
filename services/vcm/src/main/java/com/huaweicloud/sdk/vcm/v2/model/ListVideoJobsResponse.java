package com.huaweicloud.sdk.vcm.v2.model;

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
public class ListVideoJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    @JacksonXmlProperty(localName = "tasks")

    private List<VideoJobResponse> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    public ListVideoJobsResponse withTasks(List<VideoJobResponse> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListVideoJobsResponse addTasksItem(VideoJobResponse tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListVideoJobsResponse withTasks(Consumer<List<VideoJobResponse>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 任务列表
     * @return tasks
     */
    public List<VideoJobResponse> getTasks() {
        return tasks;
    }

    public void setTasks(List<VideoJobResponse> tasks) {
        this.tasks = tasks;
    }

    public ListVideoJobsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 符合查询条件的总条目数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVideoJobsResponse listVideoJobsResponse = (ListVideoJobsResponse) o;
        return Objects.equals(this.tasks, listVideoJobsResponse.tasks)
            && Objects.equals(this.count, listVideoJobsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVideoJobsResponse {\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
