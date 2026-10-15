package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Flink作业资源配置，包含作业的并行度和各组件资源规格。
 */
public class ShowFlinkResourceConfigResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallelism")

    private Integer parallelism;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobmanager_resource_spec")

    private ShowFlinkResourceSpecResponseBody jobmanagerResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskmanager_resource_spec")

    private ShowFlinkResourceSpecResponseBody taskmanagerResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_gateway_resource_spec")

    private ShowFlinkSqlGatewayResourceSpecResponseBody sqlGatewayResourceSpec;

    public ShowFlinkResourceConfigResponseBody withParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    /**
     * **参数解释**：作业并行度。 **取值范围**：1~1000。
     * @return parallelism
     */
    public Integer getParallelism() {
        return parallelism;
    }

    public void setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
    }

    public ShowFlinkResourceConfigResponseBody withJobmanagerResourceSpec(
        ShowFlinkResourceSpecResponseBody jobmanagerResourceSpec) {
        this.jobmanagerResourceSpec = jobmanagerResourceSpec;
        return this;
    }

    public ShowFlinkResourceConfigResponseBody withJobmanagerResourceSpec(
        Consumer<ShowFlinkResourceSpecResponseBody> jobmanagerResourceSpecSetter) {
        if (this.jobmanagerResourceSpec == null) {
            this.jobmanagerResourceSpec = new ShowFlinkResourceSpecResponseBody();
            jobmanagerResourceSpecSetter.accept(this.jobmanagerResourceSpec);
        }

        return this;
    }

    /**
     * Get jobmanagerResourceSpec
     * @return jobmanagerResourceSpec
     */
    public ShowFlinkResourceSpecResponseBody getJobmanagerResourceSpec() {
        return jobmanagerResourceSpec;
    }

    public void setJobmanagerResourceSpec(ShowFlinkResourceSpecResponseBody jobmanagerResourceSpec) {
        this.jobmanagerResourceSpec = jobmanagerResourceSpec;
    }

    public ShowFlinkResourceConfigResponseBody withTaskmanagerResourceSpec(
        ShowFlinkResourceSpecResponseBody taskmanagerResourceSpec) {
        this.taskmanagerResourceSpec = taskmanagerResourceSpec;
        return this;
    }

    public ShowFlinkResourceConfigResponseBody withTaskmanagerResourceSpec(
        Consumer<ShowFlinkResourceSpecResponseBody> taskmanagerResourceSpecSetter) {
        if (this.taskmanagerResourceSpec == null) {
            this.taskmanagerResourceSpec = new ShowFlinkResourceSpecResponseBody();
            taskmanagerResourceSpecSetter.accept(this.taskmanagerResourceSpec);
        }

        return this;
    }

    /**
     * Get taskmanagerResourceSpec
     * @return taskmanagerResourceSpec
     */
    public ShowFlinkResourceSpecResponseBody getTaskmanagerResourceSpec() {
        return taskmanagerResourceSpec;
    }

    public void setTaskmanagerResourceSpec(ShowFlinkResourceSpecResponseBody taskmanagerResourceSpec) {
        this.taskmanagerResourceSpec = taskmanagerResourceSpec;
    }

    public ShowFlinkResourceConfigResponseBody withSqlGatewayResourceSpec(
        ShowFlinkSqlGatewayResourceSpecResponseBody sqlGatewayResourceSpec) {
        this.sqlGatewayResourceSpec = sqlGatewayResourceSpec;
        return this;
    }

    public ShowFlinkResourceConfigResponseBody withSqlGatewayResourceSpec(
        Consumer<ShowFlinkSqlGatewayResourceSpecResponseBody> sqlGatewayResourceSpecSetter) {
        if (this.sqlGatewayResourceSpec == null) {
            this.sqlGatewayResourceSpec = new ShowFlinkSqlGatewayResourceSpecResponseBody();
            sqlGatewayResourceSpecSetter.accept(this.sqlGatewayResourceSpec);
        }

        return this;
    }

    /**
     * Get sqlGatewayResourceSpec
     * @return sqlGatewayResourceSpec
     */
    public ShowFlinkSqlGatewayResourceSpecResponseBody getSqlGatewayResourceSpec() {
        return sqlGatewayResourceSpec;
    }

    public void setSqlGatewayResourceSpec(ShowFlinkSqlGatewayResourceSpecResponseBody sqlGatewayResourceSpec) {
        this.sqlGatewayResourceSpec = sqlGatewayResourceSpec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlinkResourceConfigResponseBody that = (ShowFlinkResourceConfigResponseBody) obj;
        return Objects.equals(this.parallelism, that.parallelism)
            && Objects.equals(this.jobmanagerResourceSpec, that.jobmanagerResourceSpec)
            && Objects.equals(this.taskmanagerResourceSpec, that.taskmanagerResourceSpec)
            && Objects.equals(this.sqlGatewayResourceSpec, that.sqlGatewayResourceSpec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parallelism, jobmanagerResourceSpec, taskmanagerResourceSpec, sqlGatewayResourceSpec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkResourceConfigResponseBody {\n");
        sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
        sb.append("    jobmanagerResourceSpec: ").append(toIndentedString(jobmanagerResourceSpec)).append("\n");
        sb.append("    taskmanagerResourceSpec: ").append(toIndentedString(taskmanagerResourceSpec)).append("\n");
        sb.append("    sqlGatewayResourceSpec: ").append(toIndentedString(sqlGatewayResourceSpec)).append("\n");
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
