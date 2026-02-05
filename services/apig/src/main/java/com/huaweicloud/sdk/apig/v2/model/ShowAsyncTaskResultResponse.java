package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowAsyncTaskResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /**
     * 异步任务状态。 - waiting：异步任务等待处理。 - processing：异步任务处理中。 - succeed：异步任务执行完成。 - failed：异步任务执行失败。 
     */
    public static final class TaskStatusEnum {

        /**
         * Enum WAITING for value: "waiting"
         */
        public static final TaskStatusEnum WAITING = new TaskStatusEnum("waiting");

        /**
         * Enum PROCESSING for value: "processing"
         */
        public static final TaskStatusEnum PROCESSING = new TaskStatusEnum("processing");

        /**
         * Enum SUCCEED for value: "succeed"
         */
        public static final TaskStatusEnum SUCCEED = new TaskStatusEnum("succeed");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final TaskStatusEnum FAILED = new TaskStatusEnum("failed");

        private static final Map<String, TaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskStatusEnum> createStaticFields() {
            Map<String, TaskStatusEnum> map = new HashMap<>();
            map.put("waiting", WAITING);
            map.put("processing", PROCESSING);
            map.put("succeed", SUCCEED);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskStatusEnum(String value) {
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
        public static TaskStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskStatusEnum(value));
        }

        public static TaskStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskStatusEnum) {
                return this.value.equals(((TaskStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private TaskStatusEnum taskStatus;

    /**
     * 任务类型。 import_api为异步导入api，export_api为异步导出api。
     */
    public static final class TaskTypeEnum {

        /**
         * Enum IMPORT_API for value: "import_api"
         */
        public static final TaskTypeEnum IMPORT_API = new TaskTypeEnum("import_api");

        /**
         * Enum EXPORT_API for value: "export_api"
         */
        public static final TaskTypeEnum EXPORT_API = new TaskTypeEnum("export_api");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("import_api", IMPORT_API);
            map.put("export_api", EXPORT_API);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskTypeEnum(String value) {
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
        public static TaskTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskTypeEnum(value));
        }

        public static TaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskTypeEnum) {
                return this.value.equals(((TaskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private TaskTypeEnum taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_result")

    private String taskResult;

    public ShowAsyncTaskResultResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowAsyncTaskResultResponse withTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 异步任务状态。 - waiting：异步任务等待处理。 - processing：异步任务处理中。 - succeed：异步任务执行完成。 - failed：异步任务执行失败。 
     * @return taskStatus
     */
    public TaskStatusEnum getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ShowAsyncTaskResultResponse withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型。 import_api为异步导入api，export_api为异步导出api。
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public ShowAsyncTaskResultResponse withTaskResult(String taskResult) {
        this.taskResult = taskResult;
        return this;
    }

    /**
     * 任务结果。string可转成json object。 当task_type为import_api时，字段包括API分组编号group_id、success数组、failure数组、swagger结构体、ignore数组。   - success数组：导入成功的API，数组元素中包括4个字段，导入成功的API编号id、API请求方法method、API请求路径path、导入行为action（枚举值，update表示更新API，create表示新建API）。   - failure数组：导入失败的API，数组元素中包括4个字段，API请求方法method、API请求路径path、导入失败的错误码error_code、导入失败的错误信息error_msg。   - swagger结构体：包括2个字段，swagger文档编号id、导入结果说明result。   - ignore数组：元素包括API请求方法method、API请求路径path。    当task_type为export_api时，字段包括导出文件类型file_type、导出文件内容content。 
     * @return taskResult
     */
    public String getTaskResult() {
        return taskResult;
    }

    public void setTaskResult(String taskResult) {
        this.taskResult = taskResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAsyncTaskResultResponse that = (ShowAsyncTaskResultResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskStatus, that.taskStatus)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.taskResult, that.taskResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskStatus, taskType, taskResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAsyncTaskResultResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    taskResult: ").append(toIndentedString(taskResult)).append("\n");
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
