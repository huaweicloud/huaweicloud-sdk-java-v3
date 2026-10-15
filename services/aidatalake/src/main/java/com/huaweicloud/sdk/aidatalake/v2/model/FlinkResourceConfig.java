package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Flink作业的资源配置，配置并行度和各组件资源规格。 **约束限制**：不涉及。
 */
public class FlinkResourceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallelism")

    private Integer parallelism;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobmanager_resource_spec")

    private FlinkResourceSpec jobmanagerResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskmanager_resource_spec")

    private FlinkResourceSpec taskmanagerResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_gateway_resource_spec")

    private FlinkSqlGatewayResourceSpec sqlGatewayResourceSpec;

    public FlinkResourceConfig withParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    /**
     * **参数解释**：作业并行度，决定作业的并发处理能力。 **约束限制**：不涉及。 **取值范围**：1~1000。 **默认取值**：1。 
     * minimum: 1
     * maximum: 1000
     * @return parallelism
     */
    public Integer getParallelism() {
        return parallelism;
    }

    public void setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
    }

    public FlinkResourceConfig withJobmanagerResourceSpec(FlinkResourceSpec jobmanagerResourceSpec) {
        this.jobmanagerResourceSpec = jobmanagerResourceSpec;
        return this;
    }

    public FlinkResourceConfig withJobmanagerResourceSpec(Consumer<FlinkResourceSpec> jobmanagerResourceSpecSetter) {
        if (this.jobmanagerResourceSpec == null) {
            this.jobmanagerResourceSpec = new FlinkResourceSpec();
            jobmanagerResourceSpecSetter.accept(this.jobmanagerResourceSpec);
        }

        return this;
    }

    /**
     * Get jobmanagerResourceSpec
     * @return jobmanagerResourceSpec
     */
    public FlinkResourceSpec getJobmanagerResourceSpec() {
        return jobmanagerResourceSpec;
    }

    public void setJobmanagerResourceSpec(FlinkResourceSpec jobmanagerResourceSpec) {
        this.jobmanagerResourceSpec = jobmanagerResourceSpec;
    }

    public FlinkResourceConfig withTaskmanagerResourceSpec(FlinkResourceSpec taskmanagerResourceSpec) {
        this.taskmanagerResourceSpec = taskmanagerResourceSpec;
        return this;
    }

    public FlinkResourceConfig withTaskmanagerResourceSpec(Consumer<FlinkResourceSpec> taskmanagerResourceSpecSetter) {
        if (this.taskmanagerResourceSpec == null) {
            this.taskmanagerResourceSpec = new FlinkResourceSpec();
            taskmanagerResourceSpecSetter.accept(this.taskmanagerResourceSpec);
        }

        return this;
    }

    /**
     * Get taskmanagerResourceSpec
     * @return taskmanagerResourceSpec
     */
    public FlinkResourceSpec getTaskmanagerResourceSpec() {
        return taskmanagerResourceSpec;
    }

    public void setTaskmanagerResourceSpec(FlinkResourceSpec taskmanagerResourceSpec) {
        this.taskmanagerResourceSpec = taskmanagerResourceSpec;
    }

    public FlinkResourceConfig withSqlGatewayResourceSpec(FlinkSqlGatewayResourceSpec sqlGatewayResourceSpec) {
        this.sqlGatewayResourceSpec = sqlGatewayResourceSpec;
        return this;
    }

    public FlinkResourceConfig withSqlGatewayResourceSpec(
        Consumer<FlinkSqlGatewayResourceSpec> sqlGatewayResourceSpecSetter) {
        if (this.sqlGatewayResourceSpec == null) {
            this.sqlGatewayResourceSpec = new FlinkSqlGatewayResourceSpec();
            sqlGatewayResourceSpecSetter.accept(this.sqlGatewayResourceSpec);
        }

        return this;
    }

    /**
     * Get sqlGatewayResourceSpec
     * @return sqlGatewayResourceSpec
     */
    public FlinkSqlGatewayResourceSpec getSqlGatewayResourceSpec() {
        return sqlGatewayResourceSpec;
    }

    public void setSqlGatewayResourceSpec(FlinkSqlGatewayResourceSpec sqlGatewayResourceSpec) {
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
        FlinkResourceConfig that = (FlinkResourceConfig) obj;
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
        sb.append("class FlinkResourceConfig {\n");
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
