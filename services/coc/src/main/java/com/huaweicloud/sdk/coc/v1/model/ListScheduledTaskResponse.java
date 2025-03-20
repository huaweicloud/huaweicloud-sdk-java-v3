package com.huaweicloud.sdk.coc.v1.model;

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
public class ListScheduledTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_maker")

    private String nextMaker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_tasks")

    private List<ScheduledTaskBasicInfo> scheduledTasks = null;

    public ListScheduledTaskResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 定时运维总数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListScheduledTaskResponse withNextMaker(String nextMaker) {
        this.nextMaker = nextMaker;
        return this;
    }

    /**
     * 下次起始点
     * @return nextMaker
     */
    public String getNextMaker() {
        return nextMaker;
    }

    public void setNextMaker(String nextMaker) {
        this.nextMaker = nextMaker;
    }

    public ListScheduledTaskResponse withScheduledTasks(List<ScheduledTaskBasicInfo> scheduledTasks) {
        this.scheduledTasks = scheduledTasks;
        return this;
    }

    public ListScheduledTaskResponse addScheduledTasksItem(ScheduledTaskBasicInfo scheduledTasksItem) {
        if (this.scheduledTasks == null) {
            this.scheduledTasks = new ArrayList<>();
        }
        this.scheduledTasks.add(scheduledTasksItem);
        return this;
    }

    public ListScheduledTaskResponse withScheduledTasks(Consumer<List<ScheduledTaskBasicInfo>> scheduledTasksSetter) {
        if (this.scheduledTasks == null) {
            this.scheduledTasks = new ArrayList<>();
        }
        scheduledTasksSetter.accept(this.scheduledTasks);
        return this;
    }

    /**
     * 定时运维列表
     * @return scheduledTasks
     */
    public List<ScheduledTaskBasicInfo> getScheduledTasks() {
        return scheduledTasks;
    }

    public void setScheduledTasks(List<ScheduledTaskBasicInfo> scheduledTasks) {
        this.scheduledTasks = scheduledTasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScheduledTaskResponse that = (ListScheduledTaskResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.nextMaker, that.nextMaker)
            && Objects.equals(this.scheduledTasks, that.scheduledTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, nextMaker, scheduledTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledTaskResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    nextMaker: ").append(toIndentedString(nextMaker)).append("\n");
        sb.append("    scheduledTasks: ").append(toIndentedString(scheduledTasks)).append("\n");
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
