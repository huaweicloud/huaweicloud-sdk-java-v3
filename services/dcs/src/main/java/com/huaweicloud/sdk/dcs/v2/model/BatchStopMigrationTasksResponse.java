package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchStopMigrationTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_tasks")

    @JacksonXmlProperty(localName = "migration_tasks")

    private List<StopMigrationTaskResult> migrationTasks = null;

    public BatchStopMigrationTasksResponse withMigrationTasks(List<StopMigrationTaskResult> migrationTasks) {
        this.migrationTasks = migrationTasks;
        return this;
    }

    public BatchStopMigrationTasksResponse addMigrationTasksItem(StopMigrationTaskResult migrationTasksItem) {
        if (this.migrationTasks == null) {
            this.migrationTasks = new ArrayList<>();
        }
        this.migrationTasks.add(migrationTasksItem);
        return this;
    }

    public BatchStopMigrationTasksResponse withMigrationTasks(
        Consumer<List<StopMigrationTaskResult>> migrationTasksSetter) {
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
    public List<StopMigrationTaskResult> getMigrationTasks() {
        return migrationTasks;
    }

    public void setMigrationTasks(List<StopMigrationTaskResult> migrationTasks) {
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
        BatchStopMigrationTasksResponse batchStopMigrationTasksResponse = (BatchStopMigrationTasksResponse) o;
        return Objects.equals(this.migrationTasks, batchStopMigrationTasksResponse.migrationTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStopMigrationTasksResponse {\n");
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
