package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 删除迁移任务请求体
 */
public class DeleteMigrateTaskRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id_list")
    
    private List<String> taskIdList = new ArrayList<>();
    
    public DeleteMigrateTaskRequest withTaskIdList(List<String> taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }

    
    public DeleteMigrateTaskRequest addTaskIdListItem(String taskIdListItem) {
        this.taskIdList.add(taskIdListItem);
        return this;
    }

    public DeleteMigrateTaskRequest withTaskIdList(Consumer<List<String>> taskIdListSetter) {
        if(this.taskIdList == null ){
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteMigrateTaskRequest deleteMigrateTaskRequest = (DeleteMigrateTaskRequest) o;
        return Objects.equals(this.taskIdList, deleteMigrateTaskRequest.taskIdList);
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

