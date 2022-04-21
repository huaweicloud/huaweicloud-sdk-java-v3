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
 * TaskBasicRsp
 */
public class TaskBasicRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    /**
     * 任务类型 - realtime (实时) - timing (定时)
     */
    public static final class TaskTypeEnum {

        /**
         * Enum REALTIME for value: "realtime"
         */
        public static final TaskTypeEnum REALTIME = new TaskTypeEnum("realtime");

        /**
         * Enum TIMING for value: "timing"
         */
        public static final TaskTypeEnum TIMING = new TaskTypeEnum("timing");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("realtime", REALTIME);
            map.put("timing", TIMING);
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

    /**
     * 任务状态, - stop (0停止\\未启动) - running (1运行中)
     */
    public static final class StatusEnum {

        /**
         * Enum STOP for value: "stop"
         */
        public static final StatusEnum STOP = new StatusEnum("stop");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("stop", STOP);
            map.put("running", RUNNING);
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
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_datasource_id")

    private String sourceDatasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_datasource_id")

    private String targetDatasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_datasource_name")

    private String sourceDatasourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_datasource_name")

    private String targetDatasourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_app_id")

    private String sourceAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_app_id")

    private String targetAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_app_name")

    private String sourceAppName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_app_name")

    private String targetAppName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private Long createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_date")

    private Long lastModifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_tag")

    private String taskTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    public TaskBasicRsp withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID, 可为空
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskBasicRsp withTaskName(String taskName) {
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

    public TaskBasicRsp withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型 - realtime (实时) - timing (定时)
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public TaskBasicRsp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态, - stop (0停止\\未启动) - running (1运行中)
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public TaskBasicRsp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TaskBasicRsp withSourceDatasourceId(String sourceDatasourceId) {
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

    public TaskBasicRsp withTargetDatasourceId(String targetDatasourceId) {
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

    public TaskBasicRsp withSourceDatasourceName(String sourceDatasourceName) {
        this.sourceDatasourceName = sourceDatasourceName;
        return this;
    }

    /**
     * 源端数据源的名称
     * @return sourceDatasourceName
     */
    public String getSourceDatasourceName() {
        return sourceDatasourceName;
    }

    public void setSourceDatasourceName(String sourceDatasourceName) {
        this.sourceDatasourceName = sourceDatasourceName;
    }

    public TaskBasicRsp withTargetDatasourceName(String targetDatasourceName) {
        this.targetDatasourceName = targetDatasourceName;
        return this;
    }

    /**
     * 目标端数据源的名称
     * @return targetDatasourceName
     */
    public String getTargetDatasourceName() {
        return targetDatasourceName;
    }

    public void setTargetDatasourceName(String targetDatasourceName) {
        this.targetDatasourceName = targetDatasourceName;
    }

    public TaskBasicRsp withSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
        return this;
    }

    /**
     * 源端数据源所属集成应用ID
     * @return sourceAppId
     */
    public String getSourceAppId() {
        return sourceAppId;
    }

    public void setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
    }

    public TaskBasicRsp withTargetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
        return this;
    }

    /**
     * 目标端数据源所属集成应用ID
     * @return targetAppId
     */
    public String getTargetAppId() {
        return targetAppId;
    }

    public void setTargetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
    }

    public TaskBasicRsp withSourceAppName(String sourceAppName) {
        this.sourceAppName = sourceAppName;
        return this;
    }

    /**
     * 源端数据源所属集成应用名称
     * @return sourceAppName
     */
    public String getSourceAppName() {
        return sourceAppName;
    }

    public void setSourceAppName(String sourceAppName) {
        this.sourceAppName = sourceAppName;
    }

    public TaskBasicRsp withTargetAppName(String targetAppName) {
        this.targetAppName = targetAppName;
        return this;
    }

    /**
     * 目标端数据源所属集成应用名称
     * @return targetAppName
     */
    public String getTargetAppName() {
        return targetAppName;
    }

    public void setTargetAppName(String targetAppName) {
        this.targetAppName = targetAppName;
    }

    public TaskBasicRsp withCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 7766279631452241919
     * @return createdDate
     */
    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public TaskBasicRsp withLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * 最近一次的修改时间
     * minimum: 0
     * maximum: 7766279631452241919
     * @return lastModifiedDate
     */
    public Long getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public TaskBasicRsp withDescription(String description) {
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

    public TaskBasicRsp withTaskTag(String taskTag) {
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

    public TaskBasicRsp withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 任务的创建者
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskBasicRsp taskBasicRsp = (TaskBasicRsp) o;
        return Objects.equals(this.taskId, taskBasicRsp.taskId) && Objects.equals(this.taskName, taskBasicRsp.taskName)
            && Objects.equals(this.taskType, taskBasicRsp.taskType) && Objects.equals(this.status, taskBasicRsp.status)
            && Objects.equals(this.projectId, taskBasicRsp.projectId)
            && Objects.equals(this.sourceDatasourceId, taskBasicRsp.sourceDatasourceId)
            && Objects.equals(this.targetDatasourceId, taskBasicRsp.targetDatasourceId)
            && Objects.equals(this.sourceDatasourceName, taskBasicRsp.sourceDatasourceName)
            && Objects.equals(this.targetDatasourceName, taskBasicRsp.targetDatasourceName)
            && Objects.equals(this.sourceAppId, taskBasicRsp.sourceAppId)
            && Objects.equals(this.targetAppId, taskBasicRsp.targetAppId)
            && Objects.equals(this.sourceAppName, taskBasicRsp.sourceAppName)
            && Objects.equals(this.targetAppName, taskBasicRsp.targetAppName)
            && Objects.equals(this.createdDate, taskBasicRsp.createdDate)
            && Objects.equals(this.lastModifiedDate, taskBasicRsp.lastModifiedDate)
            && Objects.equals(this.description, taskBasicRsp.description)
            && Objects.equals(this.taskTag, taskBasicRsp.taskTag)
            && Objects.equals(this.createdBy, taskBasicRsp.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskName,
            taskType,
            status,
            projectId,
            sourceDatasourceId,
            targetDatasourceId,
            sourceDatasourceName,
            targetDatasourceName,
            sourceAppId,
            targetAppId,
            sourceAppName,
            targetAppName,
            createdDate,
            lastModifiedDate,
            description,
            taskTag,
            createdBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskBasicRsp {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    sourceDatasourceId: ").append(toIndentedString(sourceDatasourceId)).append("\n");
        sb.append("    targetDatasourceId: ").append(toIndentedString(targetDatasourceId)).append("\n");
        sb.append("    sourceDatasourceName: ").append(toIndentedString(sourceDatasourceName)).append("\n");
        sb.append("    targetDatasourceName: ").append(toIndentedString(targetDatasourceName)).append("\n");
        sb.append("    sourceAppId: ").append(toIndentedString(sourceAppId)).append("\n");
        sb.append("    targetAppId: ").append(toIndentedString(targetAppId)).append("\n");
        sb.append("    sourceAppName: ").append(toIndentedString(sourceAppName)).append("\n");
        sb.append("    targetAppName: ").append(toIndentedString(targetAppName)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    taskTag: ").append(toIndentedString(taskTag)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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
