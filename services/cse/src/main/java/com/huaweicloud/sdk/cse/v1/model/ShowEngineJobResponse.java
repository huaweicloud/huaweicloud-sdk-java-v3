package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowEngineJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_id")

    private String engineId;

    /**
     * 任务类型
     */
    public static final class TypeEnum {

        /**
         * Enum CREATE for value: "Create"
         */
        public static final TypeEnum CREATE = new TypeEnum("Create");

        /**
         * Enum DELETE for value: "Delete"
         */
        public static final TypeEnum DELETE = new TypeEnum("Delete");

        /**
         * Enum UPGRADE for value: "Upgrade"
         */
        public static final TypeEnum UPGRADE = new TypeEnum("Upgrade");

        /**
         * Enum MODIFY for value: "Modify"
         */
        public static final TypeEnum MODIFY = new TypeEnum("Modify");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("Create", CREATE);
            map.put("Delete", DELETE);
            map.put("Upgrade", UPGRADE);
            map.put("Modify", MODIFY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 任务状态
     */
    public static final class StatusEnum {

        /**
         * Enum INIT for value: "Init"
         */
        public static final StatusEnum INIT = new StatusEnum("Init");

        /**
         * Enum EXECUTING for value: "Executing"
         */
        public static final StatusEnum EXECUTING = new StatusEnum("Executing");

        /**
         * Enum ERROR for value: "Error"
         */
        public static final StatusEnum ERROR = new StatusEnum("Error");

        /**
         * Enum TIMEOUT for value: "Timeout"
         */
        public static final StatusEnum TIMEOUT = new StatusEnum("Timeout");

        /**
         * Enum FINISHED for value: "Finished"
         */
        public static final StatusEnum FINISHED = new StatusEnum("Finished");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Init", INIT);
            map.put("Executing", EXECUTING);
            map.put("Error", ERROR);
            map.put("Timeout", TIMEOUT);
            map.put("Finished", FINISHED);
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
    @JsonProperty(value = "scheduling")

    private Integer scheduling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "context")

    private String context;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<TaskSteps> tasks = null;

    public ShowEngineJobResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowEngineJobResponse withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }

    /**
     * 任务所属引擎ID
     * @return engineId
     */
    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public ShowEngineJobResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 任务类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowEngineJobResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowEngineJobResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowEngineJobResponse withScheduling(Integer scheduling) {
        this.scheduling = scheduling;
        return this;
    }

    /**
     * 任务是否正在执行，0表示不在执行，1表示执行中
     * @return scheduling
     */
    public Integer getScheduling() {
        return scheduling;
    }

    public void setScheduling(Integer scheduling) {
        this.scheduling = scheduling;
    }

    public ShowEngineJobResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 任务创建者
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ShowEngineJobResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowEngineJobResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowEngineJobResponse withContext(String context) {
        this.context = context;
        return this;
    }

    /**
     * 任务执行上下文
     * @return context
     */
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public ShowEngineJobResponse withTasks(List<TaskSteps> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ShowEngineJobResponse addTasksItem(TaskSteps tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ShowEngineJobResponse withTasks(Consumer<List<TaskSteps>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 任务包含的处理阶段
     * @return tasks
     */
    public List<TaskSteps> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskSteps> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEngineJobResponse showEngineJobResponse = (ShowEngineJobResponse) o;
        return Objects.equals(this.id, showEngineJobResponse.id)
            && Objects.equals(this.engineId, showEngineJobResponse.engineId)
            && Objects.equals(this.type, showEngineJobResponse.type)
            && Objects.equals(this.description, showEngineJobResponse.description)
            && Objects.equals(this.status, showEngineJobResponse.status)
            && Objects.equals(this.scheduling, showEngineJobResponse.scheduling)
            && Objects.equals(this.createUser, showEngineJobResponse.createUser)
            && Objects.equals(this.startTime, showEngineJobResponse.startTime)
            && Objects.equals(this.endTime, showEngineJobResponse.endTime)
            && Objects.equals(this.context, showEngineJobResponse.context)
            && Objects.equals(this.tasks, showEngineJobResponse.tasks);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, engineId, type, description, status, scheduling, createUser, startTime, endTime, context, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEngineJobResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
