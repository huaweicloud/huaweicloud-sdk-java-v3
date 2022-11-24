package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TaskBasicRequestBody
 */
public class TaskBasicRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    /**
     * 任务类型 - REALTIME (实时) - TIMING (定时)
     */
    public static final class TaskTypeEnum {

        /**
         * Enum REALTIME for value: "REALTIME"
         */
        public static final TaskTypeEnum REALTIME = new TaskTypeEnum("REALTIME");

        /**
         * Enum TIMING for value: "TIMING"
         */
        public static final TaskTypeEnum TIMING = new TaskTypeEnum("TIMING");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("REALTIME", REALTIME);
            map.put("TIMING", TIMING);
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
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TaskTypeEnum(value);
            }
            return result;
        }

        public static TaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "source_datasource_id")

    private String sourceDatasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_datasource_id")

    private String targetDatasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_tag")

    private String taskTag;

    public TaskBasicRequestBody withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称，只能以字母、数字为开头，包含字母、数字和 . _ -  3~100个字符
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskBasicRequestBody withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型 - REALTIME (实时) - TIMING (定时)
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public TaskBasicRequestBody withSourceDatasourceId(String sourceDatasourceId) {
        this.sourceDatasourceId = sourceDatasourceId;
        return this;
    }

    /**
     * 源端数据源ID
     * @return sourceDatasourceId
     */
    public String getSourceDatasourceId() {
        return sourceDatasourceId;
    }

    public void setSourceDatasourceId(String sourceDatasourceId) {
        this.sourceDatasourceId = sourceDatasourceId;
    }

    public TaskBasicRequestBody withTargetDatasourceId(String targetDatasourceId) {
        this.targetDatasourceId = targetDatasourceId;
        return this;
    }

    /**
     * 目标端数据源ID
     * @return targetDatasourceId
     */
    public String getTargetDatasourceId() {
        return targetDatasourceId;
    }

    public void setTargetDatasourceId(String targetDatasourceId) {
        this.targetDatasourceId = targetDatasourceId;
    }

    public TaskBasicRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskBasicRequestBody withTaskTag(String taskTag) {
        this.taskTag = taskTag;
        return this;
    }

    /**
     * 任务标签,只能包含字母、数字、中划线、下划线
     * @return taskTag
     */
    public String getTaskTag() {
        return taskTag;
    }

    public void setTaskTag(String taskTag) {
        this.taskTag = taskTag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskBasicRequestBody taskBasicRequestBody = (TaskBasicRequestBody) o;
        return Objects.equals(this.taskName, taskBasicRequestBody.taskName)
            && Objects.equals(this.taskType, taskBasicRequestBody.taskType)
            && Objects.equals(this.sourceDatasourceId, taskBasicRequestBody.sourceDatasourceId)
            && Objects.equals(this.targetDatasourceId, taskBasicRequestBody.targetDatasourceId)
            && Objects.equals(this.description, taskBasicRequestBody.description)
            && Objects.equals(this.taskTag, taskBasicRequestBody.taskTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, taskType, sourceDatasourceId, targetDatasourceId, description, taskTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskBasicRequestBody {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    sourceDatasourceId: ").append(toIndentedString(sourceDatasourceId)).append("\n");
        sb.append("    targetDatasourceId: ").append(toIndentedString(targetDatasourceId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    taskTag: ").append(toIndentedString(taskTag)).append("\n");
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
