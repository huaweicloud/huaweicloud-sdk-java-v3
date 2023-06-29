package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除迁移任务请求体
 */
public class DeleteMigrateTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id_list")

    private List<String> taskIdList = null;

    public DeleteMigrateTaskRequest withTaskIdList(List<String> taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }

    public DeleteMigrateTaskRequest addTaskIdListItem(String taskIdListItem) {
        if (this.taskIdList == null) {
            this.taskIdList = new ArrayList<>();
        }
        this.taskIdList.add(taskIdListItem);
        return this;
    }

    public DeleteMigrateTaskRequest withTaskIdList(Consumer<List<String>> taskIdListSetter) {
        if (this.taskIdList == null) {
            this.taskIdList = new ArrayList<>();
        }
        taskIdListSetter.accept(this.taskIdList);
        return this;
    }

    /**
     * 删除的迁移任务ID列表。
     * @return taskIdList
     */
    public List<String> getTaskIdList() {
        return taskIdList;
    }

    public void setTaskIdList(List<String> taskIdList) {
        this.taskIdList = taskIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteMigrateTaskRequest that = (DeleteMigrateTaskRequest) obj;
        return Objects.equals(this.taskIdList, that.taskIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteMigrateTaskRequest {\n");
        sb.append("    taskIdList: ").append(toIndentedString(taskIdList)).append("\n");
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
