package com.huaweicloud.sdk.live.v1.model;

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
public class ListPullTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_infos")

    private List<LivePullTaskInfo> taskInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListPullTasksResponse withTaskInfos(List<LivePullTaskInfo> taskInfos) {
        this.taskInfos = taskInfos;
        return this;
    }

    public ListPullTasksResponse addTaskInfosItem(LivePullTaskInfo taskInfosItem) {
        if (this.taskInfos == null) {
            this.taskInfos = new ArrayList<>();
        }
        this.taskInfos.add(taskInfosItem);
        return this;
    }

    public ListPullTasksResponse withTaskInfos(Consumer<List<LivePullTaskInfo>> taskInfosSetter) {
        if (this.taskInfos == null) {
            this.taskInfos = new ArrayList<>();
        }
        taskInfosSetter.accept(this.taskInfos);
        return this;
    }

    /**
     * 直播拉流任务列表
     * @return taskInfos
     */
    public List<LivePullTaskInfo> getTaskInfos() {
        return taskInfos;
    }

    public void setTaskInfos(List<LivePullTaskInfo> taskInfos) {
        this.taskInfos = taskInfos;
    }

    public ListPullTasksResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListPullTasksResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 任务条目数
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPullTasksResponse that = (ListPullTasksResponse) obj;
        return Objects.equals(this.taskInfos, that.taskInfos) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskInfos, requestId, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPullTasksResponse {\n");
        sb.append("    taskInfos: ").append(toIndentedString(taskInfos)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
