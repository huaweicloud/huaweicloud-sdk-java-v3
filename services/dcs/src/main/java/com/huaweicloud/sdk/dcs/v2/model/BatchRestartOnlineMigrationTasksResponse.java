package com.huaweicloud.sdk.dcs.v2.model;

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
public class BatchRestartOnlineMigrationTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_tasks")

    private List<BatchRestartMigrationTaskResult> migrationTasks = null;

    public BatchRestartOnlineMigrationTasksResponse withMigrationTasks(
        List<BatchRestartMigrationTaskResult> migrationTasks) {
        this.migrationTasks = migrationTasks;
        return this;
    }

    public BatchRestartOnlineMigrationTasksResponse addMigrationTasksItem(
        BatchRestartMigrationTaskResult migrationTasksItem) {
        if (this.migrationTasks == null) {
            this.migrationTasks = new ArrayList<>();
        }
        this.migrationTasks.add(migrationTasksItem);
        return this;
    }

    public BatchRestartOnlineMigrationTasksResponse withMigrationTasks(
        Consumer<List<BatchRestartMigrationTaskResult>> migrationTasksSetter) {
        if (this.migrationTasks == null) {
            this.migrationTasks = new ArrayList<>();
        }
        migrationTasksSetter.accept(this.migrationTasks);
        return this;
    }

    /**
     * 数据迁移任务列表。
     * @return migrationTasks
     */
    public List<BatchRestartMigrationTaskResult> getMigrationTasks() {
        return migrationTasks;
    }

    public void setMigrationTasks(List<BatchRestartMigrationTaskResult> migrationTasks) {
        this.migrationTasks = migrationTasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchRestartOnlineMigrationTasksResponse that = (BatchRestartOnlineMigrationTasksResponse) obj;
        return Objects.equals(this.migrationTasks, that.migrationTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRestartOnlineMigrationTasksResponse {\n");
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
