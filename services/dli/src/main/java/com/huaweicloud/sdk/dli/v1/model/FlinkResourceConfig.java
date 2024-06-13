package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Flink 作业的资源配置。
 */
public class FlinkResourceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_slot")

    private Integer maxSlot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_number")

    private Integer parallelNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobmanager_resource_spec")

    private ResourceSpec jobmanagerResourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskmanager_resource_spec")

    private ResourceSpec taskmanagerResourceSpec;

    public FlinkResourceConfig withMaxSlot(Integer maxSlot) {
        this.maxSlot = maxSlot;
        return this;
    }

    /**
     * 最大的 slot 数。
     * @return maxSlot
     */
    public Integer getMaxSlot() {
        return maxSlot;
    }

    public void setMaxSlot(Integer maxSlot) {
        this.maxSlot = maxSlot;
    }

    public FlinkResourceConfig withParallelNumber(Integer parallelNumber) {
        this.parallelNumber = parallelNumber;
        return this;
    }

    /**
     * 用户设置的作业并行数目。默认值为1。
     * @return parallelNumber
     */
    public Integer getParallelNumber() {
        return parallelNumber;
    }

    public void setParallelNumber(Integer parallelNumber) {
        this.parallelNumber = parallelNumber;
    }

    public FlinkResourceConfig withJobmanagerResourceSpec(ResourceSpec jobmanagerResourceSpec) {
        this.jobmanagerResourceSpec = jobmanagerResourceSpec;
        return this;
    }

    public FlinkResourceConfig withJobmanagerResourceSpec(Consumer<ResourceSpec> jobmanagerResourceSpecSetter) {
        if (this.jobmanagerResourceSpec == null) {
            this.jobmanagerResourceSpec = new ResourceSpec();
            jobmanagerResourceSpecSetter.accept(this.jobmanagerResourceSpec);
        }

        return this;
    }

    /**
     * Get jobmanagerResourceSpec
     * @return jobmanagerResourceSpec
     */
    public ResourceSpec getJobmanagerResourceSpec() {
        return jobmanagerResourceSpec;
    }

    public void setJobmanagerResourceSpec(ResourceSpec jobmanagerResourceSpec) {
        this.jobmanagerResourceSpec = jobmanagerResourceSpec;
    }

    public FlinkResourceConfig withTaskmanagerResourceSpec(ResourceSpec taskmanagerResourceSpec) {
        this.taskmanagerResourceSpec = taskmanagerResourceSpec;
        return this;
    }

    public FlinkResourceConfig withTaskmanagerResourceSpec(Consumer<ResourceSpec> taskmanagerResourceSpecSetter) {
        if (this.taskmanagerResourceSpec == null) {
            this.taskmanagerResourceSpec = new ResourceSpec();
            taskmanagerResourceSpecSetter.accept(this.taskmanagerResourceSpec);
        }

        return this;
    }

    /**
     * Get taskmanagerResourceSpec
     * @return taskmanagerResourceSpec
     */
    public ResourceSpec getTaskmanagerResourceSpec() {
        return taskmanagerResourceSpec;
    }

    public void setTaskmanagerResourceSpec(ResourceSpec taskmanagerResourceSpec) {
        this.taskmanagerResourceSpec = taskmanagerResourceSpec;
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
        return Objects.equals(this.maxSlot, that.maxSlot) && Objects.equals(this.parallelNumber, that.parallelNumber)
            && Objects.equals(this.jobmanagerResourceSpec, that.jobmanagerResourceSpec)
            && Objects.equals(this.taskmanagerResourceSpec, that.taskmanagerResourceSpec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSlot, parallelNumber, jobmanagerResourceSpec, taskmanagerResourceSpec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkResourceConfig {\n");
        sb.append("    maxSlot: ").append(toIndentedString(maxSlot)).append("\n");
        sb.append("    parallelNumber: ").append(toIndentedString(parallelNumber)).append("\n");
        sb.append("    jobmanagerResourceSpec: ").append(toIndentedString(jobmanagerResourceSpec)).append("\n");
        sb.append("    taskmanagerResourceSpec: ").append(toIndentedString(taskmanagerResourceSpec)).append("\n");
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
