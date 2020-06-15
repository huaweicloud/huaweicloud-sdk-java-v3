package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.MigrationTaskList;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListMigrationTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migration_tasks")
    
    private List<MigrationTaskList> migrationTasks = null;
    
    public ListMigrationTaskResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 迁移任务数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListMigrationTaskResponse withMigrationTasks(List<MigrationTaskList> migrationTasks) {
        this.migrationTasks = migrationTasks;
        return this;
    }

    
    public ListMigrationTaskResponse addMigrationTasksItem(MigrationTaskList migrationTasksItem) {
        if (this.migrationTasks == null) {
            this.migrationTasks = new ArrayList<>();
        }
        this.migrationTasks.add(migrationTasksItem);
        return this;
    }

    public ListMigrationTaskResponse withMigrationTasks(Consumer<List<MigrationTaskList>> migrationTasksSetter) {
        if(this.migrationTasks == null ){
            this.migrationTasks = new ArrayList<>();
        }
        migrationTasksSetter.accept(this.migrationTasks);
        return this;
    }

    /**
     * 迁移任务列表。
     * @return migrationTasks
     */
    public List<MigrationTaskList> getMigrationTasks() {
        return migrationTasks;
    }

    public void setMigrationTasks(List<MigrationTaskList> migrationTasks) {
        this.migrationTasks = migrationTasks;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMigrationTaskResponse listMigrationTaskResponse = (ListMigrationTaskResponse) o;
        return Objects.equals(this.count, listMigrationTaskResponse.count) &&
            Objects.equals(this.migrationTasks, listMigrationTaskResponse.migrationTasks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, migrationTasks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMigrationTaskResponse {\n");
            sb.append("    count: ").append(toIndentedString(count)).append("\n");
            sb.append("    migrationTasks: ").append(toIndentedString(migrationTasks)).append("\n");
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

