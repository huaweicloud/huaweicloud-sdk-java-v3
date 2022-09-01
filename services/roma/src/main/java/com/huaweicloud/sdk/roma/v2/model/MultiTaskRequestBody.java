package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MultiTaskRequestBody
 */
public class MultiTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    @JacksonXmlProperty(localName = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private String taskId;

    /**
     * 任务类型，目前组合任务仅支持实时任务 - REALTIME (实时) - TIMING (定时)
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

    @JacksonXmlProperty(localName = "task_type")

    private TaskTypeEnum taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_tag")

    @JacksonXmlProperty(localName = "task_tag")

    private String taskTag;

    /**
     * Gets or Sets operationTypes
     */
    public static final class OperationTypesEnum {

        /**
         * Enum INSERT for value: "INSERT"
         */
        public static final OperationTypesEnum INSERT = new OperationTypesEnum("INSERT");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final OperationTypesEnum UPDATE = new OperationTypesEnum("UPDATE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final OperationTypesEnum DELETE = new OperationTypesEnum("DELETE");

        private static final Map<String, OperationTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypesEnum> createStaticFields() {
            Map<String, OperationTypesEnum> map = new HashMap<>();
            map.put("INSERT", INSERT);
            map.put("UPDATE", UPDATE);
            map.put("DELETE", DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationTypesEnum(String value) {
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
        public static OperationTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OperationTypesEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperationTypesEnum(value);
            }
            return result;
        }

        public static OperationTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OperationTypesEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationTypesEnum) {
                return this.value.equals(((OperationTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_types")

    @JacksonXmlProperty(localName = "operation_types")

    private List<OperationTypesEnum> operationTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_app_id")

    @JacksonXmlProperty(localName = "source_app_id")

    private String sourceAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_app_id")

    @JacksonXmlProperty(localName = "target_app_id")

    private String targetAppId;

    public MultiTaskRequestBody withTaskName(String taskName) {
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

    public MultiTaskRequestBody withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID，可以为空
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public MultiTaskRequestBody withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型，目前组合任务仅支持实时任务 - REALTIME (实时) - TIMING (定时)
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public MultiTaskRequestBody withDescription(String description) {
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

    public MultiTaskRequestBody withTaskTag(String taskTag) {
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

    public MultiTaskRequestBody withOperationTypes(List<OperationTypesEnum> operationTypes) {
        this.operationTypes = operationTypes;
        return this;
    }

    public MultiTaskRequestBody addOperationTypesItem(OperationTypesEnum operationTypesItem) {
        if (this.operationTypes == null) {
            this.operationTypes = new ArrayList<>();
        }
        this.operationTypes.add(operationTypesItem);
        return this;
    }

    public MultiTaskRequestBody withOperationTypes(Consumer<List<OperationTypesEnum>> operationTypesSetter) {
        if (this.operationTypes == null) {
            this.operationTypes = new ArrayList<>();
        }
        operationTypesSetter.accept(this.operationTypes);
        return this;
    }

    /**
     * 需要支持的操作类型，支持多选，至少需要选择以下一种： - INSERT - UPDATE - DELETE
     * @return operationTypes
     */
    public List<OperationTypesEnum> getOperationTypes() {
        return operationTypes;
    }

    public void setOperationTypes(List<OperationTypesEnum> operationTypes) {
        this.operationTypes = operationTypes;
    }

    public MultiTaskRequestBody withSourceAppId(String sourceAppId) {
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

    public MultiTaskRequestBody withTargetAppId(String targetAppId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiTaskRequestBody multiTaskRequestBody = (MultiTaskRequestBody) o;
        return Objects.equals(this.taskName, multiTaskRequestBody.taskName)
            && Objects.equals(this.taskId, multiTaskRequestBody.taskId)
            && Objects.equals(this.taskType, multiTaskRequestBody.taskType)
            && Objects.equals(this.description, multiTaskRequestBody.description)
            && Objects.equals(this.taskTag, multiTaskRequestBody.taskTag)
            && Objects.equals(this.operationTypes, multiTaskRequestBody.operationTypes)
            && Objects.equals(this.sourceAppId, multiTaskRequestBody.sourceAppId)
            && Objects.equals(this.targetAppId, multiTaskRequestBody.targetAppId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, taskId, taskType, description, taskTag, operationTypes, sourceAppId, targetAppId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiTaskRequestBody {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    taskTag: ").append(toIndentedString(taskTag)).append("\n");
        sb.append("    operationTypes: ").append(toIndentedString(operationTypes)).append("\n");
        sb.append("    sourceAppId: ").append(toIndentedString(sourceAppId)).append("\n");
        sb.append("    targetAppId: ").append(toIndentedString(targetAppId)).append("\n");
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
