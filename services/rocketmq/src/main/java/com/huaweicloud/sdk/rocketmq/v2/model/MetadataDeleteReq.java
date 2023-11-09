package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MetadataDeleteReq
 */
public class MetadataDeleteReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_ids")

    private List<String> taskIds = null;

    public MetadataDeleteReq withTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    public MetadataDeleteReq addTaskIdsItem(String taskIdsItem) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskIdsItem);
        return this;
    }

    public MetadataDeleteReq withTaskIds(Consumer<List<String>> taskIdsSetter) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        taskIdsSetter.accept(this.taskIds);
        return this;
    }

    /**
     * 需要删除的任务列表。
     * @return taskIds
     */
    public List<String> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetadataDeleteReq that = (MetadataDeleteReq) obj;
        return Objects.equals(this.taskIds, that.taskIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetadataDeleteReq {\n");
        sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
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
