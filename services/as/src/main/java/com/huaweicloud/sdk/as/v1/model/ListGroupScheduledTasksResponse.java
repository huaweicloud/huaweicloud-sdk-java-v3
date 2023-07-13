package com.huaweicloud.sdk.as.v1.model;

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
public class ListGroupScheduledTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_tasks")

    private List<ScheduledTaskDetail> scheduledTasks = null;

    public ListGroupScheduledTasksResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListGroupScheduledTasksResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListGroupScheduledTasksResponse withScheduledTasks(List<ScheduledTaskDetail> scheduledTasks) {
        this.scheduledTasks = scheduledTasks;
        return this;
    }

    public ListGroupScheduledTasksResponse addScheduledTasksItem(ScheduledTaskDetail scheduledTasksItem) {
        if (this.scheduledTasks == null) {
            this.scheduledTasks = new ArrayList<>();
        }
        this.scheduledTasks.add(scheduledTasksItem);
        return this;
    }

    public ListGroupScheduledTasksResponse withScheduledTasks(
        Consumer<List<ScheduledTaskDetail>> scheduledTasksSetter) {
        if (this.scheduledTasks == null) {
            this.scheduledTasks = new ArrayList<>();
        }
        scheduledTasksSetter.accept(this.scheduledTasks);
        return this;
    }

    /**
     * 计划任务列表
     * @return scheduledTasks
     */
    public List<ScheduledTaskDetail> getScheduledTasks() {
        return scheduledTasks;
    }

    public void setScheduledTasks(List<ScheduledTaskDetail> scheduledTasks) {
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
        ListGroupScheduledTasksResponse that = (ListGroupScheduledTasksResponse) obj;
        return Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.scheduledTasks, that.scheduledTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, scheduledTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupScheduledTasksResponse {\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
