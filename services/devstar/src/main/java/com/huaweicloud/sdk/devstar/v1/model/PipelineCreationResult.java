package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 流水线资源信息 */
public class PipelineCreationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline")

    private PipelineBasic pipeline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /** 任务状态, success:成功,failed:失败,creating:创建中,cancel:取消,pending:等待创建 */
    public static final class StatusEnum {

        /** Enum SUCCESS for value: "success" */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /** Enum FAILED for value: "failed" */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        /** Enum CREATING for value: "creating" */
        public static final StatusEnum CREATING = new StatusEnum("creating");

        /** Enum CANCEL for value: "cancel" */
        public static final StatusEnum CANCEL = new StatusEnum("cancel");

        /** Enum PENDING for value: "pending" */
        public static final StatusEnum PENDING = new StatusEnum("pending");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
            map.put("creating", CREATING);
            map.put("cancel", CANCEL);
            map.put("pending", PENDING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_reason")

    private String failureReason;

    public PipelineCreationResult withPipeline(PipelineBasic pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    public PipelineCreationResult withPipeline(Consumer<PipelineBasic> pipelineSetter) {
        if (this.pipeline == null) {
            this.pipeline = new PipelineBasic();
            pipelineSetter.accept(this.pipeline);
        }

        return this;
    }

    /** Get pipeline
     * 
     * @return pipeline */
    public PipelineBasic getPipeline() {
        return pipeline;
    }

    public void setPipeline(PipelineBasic pipeline) {
        this.pipeline = pipeline;
    }

    public PipelineCreationResult withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /** 任务id
     * 
     * @return taskId */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public PipelineCreationResult withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 任务状态, success:成功,failed:失败,creating:创建中,cancel:取消,pending:等待创建
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public PipelineCreationResult withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /** 失败原因
     * 
     * @return failureReason */
    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PipelineCreationResult pipelineCreationResult = (PipelineCreationResult) o;
        return Objects.equals(this.pipeline, pipelineCreationResult.pipeline)
            && Objects.equals(this.taskId, pipelineCreationResult.taskId)
            && Objects.equals(this.status, pipelineCreationResult.status)
            && Objects.equals(this.failureReason, pipelineCreationResult.failureReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipeline, taskId, status, failureReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineCreationResult {\n");
        sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
