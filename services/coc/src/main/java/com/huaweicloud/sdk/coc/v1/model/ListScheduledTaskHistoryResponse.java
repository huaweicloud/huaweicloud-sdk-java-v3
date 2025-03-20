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
public class ListScheduledTaskHistoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_maker")

    private String nextMaker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_task_history_list")

    private List<ScheduledTaskHistory> scheduledTaskHistoryList = null;

    public ListScheduledTaskHistoryResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 定时运维历史记录总数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListScheduledTaskHistoryResponse withNextMaker(String nextMaker) {
        this.nextMaker = nextMaker;
        return this;
    }

    /**
     * 分页标记
     * @return nextMaker
     */
    public String getNextMaker() {
        return nextMaker;
    }

    public void setNextMaker(String nextMaker) {
        this.nextMaker = nextMaker;
    }

    public ListScheduledTaskHistoryResponse withScheduledTaskHistoryList(
        List<ScheduledTaskHistory> scheduledTaskHistoryList) {
        this.scheduledTaskHistoryList = scheduledTaskHistoryList;
        return this;
    }

    public ListScheduledTaskHistoryResponse addScheduledTaskHistoryListItem(
        ScheduledTaskHistory scheduledTaskHistoryListItem) {
        if (this.scheduledTaskHistoryList == null) {
            this.scheduledTaskHistoryList = new ArrayList<>();
        }
        this.scheduledTaskHistoryList.add(scheduledTaskHistoryListItem);
        return this;
    }

    public ListScheduledTaskHistoryResponse withScheduledTaskHistoryList(
        Consumer<List<ScheduledTaskHistory>> scheduledTaskHistoryListSetter) {
        if (this.scheduledTaskHistoryList == null) {
            this.scheduledTaskHistoryList = new ArrayList<>();
        }
        scheduledTaskHistoryListSetter.accept(this.scheduledTaskHistoryList);
        return this;
    }

    /**
     * 定时运维历史记录列表
     * @return scheduledTaskHistoryList
     */
    public List<ScheduledTaskHistory> getScheduledTaskHistoryList() {
        return scheduledTaskHistoryList;
    }

    public void setScheduledTaskHistoryList(List<ScheduledTaskHistory> scheduledTaskHistoryList) {
        this.scheduledTaskHistoryList = scheduledTaskHistoryList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScheduledTaskHistoryResponse that = (ListScheduledTaskHistoryResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.nextMaker, that.nextMaker)
            && Objects.equals(this.scheduledTaskHistoryList, that.scheduledTaskHistoryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, nextMaker, scheduledTaskHistoryList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledTaskHistoryResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    nextMaker: ").append(toIndentedString(nextMaker)).append("\n");
        sb.append("    scheduledTaskHistoryList: ").append(toIndentedString(scheduledTaskHistoryList)).append("\n");
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
