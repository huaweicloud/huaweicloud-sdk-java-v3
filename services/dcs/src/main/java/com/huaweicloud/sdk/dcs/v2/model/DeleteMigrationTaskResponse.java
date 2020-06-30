package com.huaweicloud.sdk.dcs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DeleteMigrationTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id_list")
    
    private List<String> taskIdList = null;
    
    public DeleteMigrationTaskResponse withTaskIdList(List<String> taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }

    
    public DeleteMigrationTaskResponse addTaskIdListItem(String taskIdListItem) {
        if (this.taskIdList == null) {
            this.taskIdList = new ArrayList<>();
        }
        this.taskIdList.add(taskIdListItem);
        return this;
    }

    public DeleteMigrationTaskResponse withTaskIdList(Consumer<List<String>> taskIdListSetter) {
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
        DeleteMigrationTaskResponse deleteMigrationTaskResponse = (DeleteMigrationTaskResponse) o;
        return Objects.equals(this.taskIdList, deleteMigrationTaskResponse.taskIdList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskIdList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteMigrationTaskResponse {\n");
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

