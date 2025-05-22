package com.huaweicloud.sdk.dws.v2.model;

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
public class ListLogicalClusterTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_tasks")

    private List<LogicalClusterTaskInfo> logicalClusterTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListLogicalClusterTasksResponse withLogicalClusterTasks(List<LogicalClusterTaskInfo> logicalClusterTasks) {
        this.logicalClusterTasks = logicalClusterTasks;
        return this;
    }

    public ListLogicalClusterTasksResponse addLogicalClusterTasksItem(LogicalClusterTaskInfo logicalClusterTasksItem) {
        if (this.logicalClusterTasks == null) {
            this.logicalClusterTasks = new ArrayList<>();
        }
        this.logicalClusterTasks.add(logicalClusterTasksItem);
        return this;
    }

    public ListLogicalClusterTasksResponse withLogicalClusterTasks(
        Consumer<List<LogicalClusterTaskInfo>> logicalClusterTasksSetter) {
        if (this.logicalClusterTasks == null) {
            this.logicalClusterTasks = new ArrayList<>();
        }
        logicalClusterTasksSetter.accept(this.logicalClusterTasks);
        return this;
    }

    /**
     * **参数解释**： 逻辑集群任务信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return logicalClusterTasks
     */
    public List<LogicalClusterTaskInfo> getLogicalClusterTasks() {
        return logicalClusterTasks;
    }

    public void setLogicalClusterTasks(List<LogicalClusterTaskInfo> logicalClusterTasks) {
        this.logicalClusterTasks = logicalClusterTasks;
    }

    public ListLogicalClusterTasksResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群任务总数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLogicalClusterTasksResponse that = (ListLogicalClusterTasksResponse) obj;
        return Objects.equals(this.logicalClusterTasks, that.logicalClusterTasks)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicalClusterTasks, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogicalClusterTasksResponse {\n");
        sb.append("    logicalClusterTasks: ").append(toIndentedString(logicalClusterTasks)).append("\n");
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
