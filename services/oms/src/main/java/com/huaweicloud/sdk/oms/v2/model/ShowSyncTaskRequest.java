package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowSyncTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_task_id")

    private String syncTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_time")

    private String queryTime;

    public ShowSyncTaskRequest withSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }

    /**
     * 同步任务ID。
     * @return syncTaskId
     */
    public String getSyncTaskId() {
        return syncTaskId;
    }

    public void setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
    }

    public ShowSyncTaskRequest withQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }

    /**
     * 查询同步任务详情的时间（毫秒），依据该值返回所在月份的统计数据。
     * @return queryTime
     */
    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSyncTaskRequest that = (ShowSyncTaskRequest) obj;
        return Objects.equals(this.syncTaskId, that.syncTaskId) && Objects.equals(this.queryTime, that.queryTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncTaskId, queryTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSyncTaskRequest {\n");
        sb.append("    syncTaskId: ").append(toIndentedString(syncTaskId)).append("\n");
        sb.append("    queryTime: ").append(toIndentedString(queryTime)).append("\n");
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
