package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListAudioJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private BigDecimal count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<CheckAudioJobResponseBody> tasks = null;

    public ListAudioJobsResponse withCount(BigDecimal count) {
        this.count = count;
        return this;
    }

    /** 作业数量
     * 
     * @return count */
    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public ListAudioJobsResponse withTasks(List<CheckAudioJobResponseBody> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListAudioJobsResponse addTasksItem(CheckAudioJobResponseBody tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListAudioJobsResponse withTasks(Consumer<List<CheckAudioJobResponseBody>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /** 作业列表
     * 
     * @return tasks */
    public List<CheckAudioJobResponseBody> getTasks() {
        return tasks;
    }

    public void setTasks(List<CheckAudioJobResponseBody> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAudioJobsResponse listAudioJobsResponse = (ListAudioJobsResponse) o;
        return Objects.equals(this.count, listAudioJobsResponse.count)
            && Objects.equals(this.tasks, listAudioJobsResponse.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAudioJobsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
