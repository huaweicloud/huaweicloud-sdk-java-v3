package com.huaweicloud.sdk.rocketmq.v2.model;

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
public class ListRocketMqMigrationTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private List<MetadataTask> task = null;

    public ListRocketMqMigrationTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 元数据迁移任务总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListRocketMqMigrationTaskResponse withTask(List<MetadataTask> task) {
        this.task = task;
        return this;
    }

    public ListRocketMqMigrationTaskResponse addTaskItem(MetadataTask taskItem) {
        if (this.task == null) {
            this.task = new ArrayList<>();
        }
        this.task.add(taskItem);
        return this;
    }

    public ListRocketMqMigrationTaskResponse withTask(Consumer<List<MetadataTask>> taskSetter) {
        if (this.task == null) {
            this.task = new ArrayList<>();
        }
        taskSetter.accept(this.task);
        return this;
    }

    /**
     * 元数据迁移任务列表。
     * @return task
     */
    public List<MetadataTask> getTask() {
        return task;
    }

    public void setTask(List<MetadataTask> task) {
        this.task = task;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRocketMqMigrationTaskResponse listRocketMqMigrationTaskResponse = (ListRocketMqMigrationTaskResponse) o;
        return Objects.equals(this.total, listRocketMqMigrationTaskResponse.total)
            && Objects.equals(this.task, listRocketMqMigrationTaskResponse.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, task);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRocketMqMigrationTaskResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
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
