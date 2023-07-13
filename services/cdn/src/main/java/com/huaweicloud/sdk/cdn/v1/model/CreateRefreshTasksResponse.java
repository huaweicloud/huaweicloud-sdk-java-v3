package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateRefreshTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh_task")

    private String refreshTask;

    public CreateRefreshTasksResponse withRefreshTask(String refreshTask) {
        this.refreshTask = refreshTask;
        return this;
    }

    /**
     * 任务ID
     * @return refreshTask
     */
    public String getRefreshTask() {
        return refreshTask;
    }

    public void setRefreshTask(String refreshTask) {
        this.refreshTask = refreshTask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRefreshTasksResponse that = (CreateRefreshTasksResponse) obj;
        return Objects.equals(this.refreshTask, that.refreshTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refreshTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRefreshTasksResponse {\n");
        sb.append("    refreshTask: ").append(toIndentedString(refreshTask)).append("\n");
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
