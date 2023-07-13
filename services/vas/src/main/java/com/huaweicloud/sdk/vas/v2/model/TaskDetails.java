package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskDetails
 */
public class TaskDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_version")

    private String serviceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_title")

    private TaskDetailsServiceTitle serviceTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_pool_id")

    private String edgePoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_order_id")

    private String resourceOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    /**
     * 作业当前的状态，分别为PENDING（等待中），RECOVERING（恢复中），STARTING（启动中），UPGRADING（升级中），CREATE_FAILED（创建失败），START_FAILED（启动失败），RUNNING（运行中），STOPPING（停止中），STOPPED（已停止），ABNORMAL（异常），SUCCEEDED（运行成功），FAILED（运行失败），DELETING（删除中），FREEZING（冻结中），FROZEN（已冻结）
     */
    public static final class StateEnum {

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final StateEnum PENDING = new StateEnum("PENDING");

        /**
         * Enum RECOVERING for value: "RECOVERING"
         */
        public static final StateEnum RECOVERING = new StateEnum("RECOVERING");

        /**
         * Enum STARTING for value: "STARTING"
         */
        public static final StateEnum STARTING = new StateEnum("STARTING");

        /**
         * Enum UPGRADING for value: "UPGRADING"
         */
        public static final StateEnum UPGRADING = new StateEnum("UPGRADING");

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StateEnum CREATE_FAILED = new StateEnum("CREATE_FAILED");

        /**
         * Enum START_FAILED for value: "START_FAILED"
         */
        public static final StateEnum START_FAILED = new StateEnum("START_FAILED");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StateEnum RUNNING = new StateEnum("RUNNING");

        /**
         * Enum STOPPING for value: "STOPPING"
         */
        public static final StateEnum STOPPING = new StateEnum("STOPPING");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final StateEnum STOPPED = new StateEnum("STOPPED");

        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final StateEnum ABNORMAL = new StateEnum("ABNORMAL");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final StateEnum SUCCEEDED = new StateEnum("SUCCEEDED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StateEnum FAILED = new StateEnum("FAILED");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StateEnum DELETING = new StateEnum("DELETING");

        /**
         * Enum FREEZING for value: "FREEZING"
         */
        public static final StateEnum FREEZING = new StateEnum("FREEZING");

        /**
         * Enum FROZEN for value: "FROZEN"
         */
        public static final StateEnum FROZEN = new StateEnum("FROZEN");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("PENDING", PENDING);
            map.put("RECOVERING", RECOVERING);
            map.put("STARTING", STARTING);
            map.put("UPGRADING", UPGRADING);
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("START_FAILED", START_FAILED);
            map.put("RUNNING", RUNNING);
            map.put("STOPPING", STOPPING);
            map.put("STOPPED", STOPPED);
            map.put("ABNORMAL", ABNORMAL);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("FAILED", FAILED);
            map.put("DELETING", DELETING);
            map.put("FREEZING", FREEZING);
            map.put("FROZEN", FROZEN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private TaskDetailsError error;

    /**
     * 计划任务的状态，分别为ACTIVATED（激活），INACTIVATED（未激活）
     */
    public static final class TimingStatusEnum {

        /**
         * Enum ACTIVATED for value: "ACTIVATED"
         */
        public static final TimingStatusEnum ACTIVATED = new TimingStatusEnum("ACTIVATED");

        /**
         * Enum INACTIVATED for value: "INACTIVATED"
         */
        public static final TimingStatusEnum INACTIVATED = new TimingStatusEnum("INACTIVATED");

        private static final Map<String, TimingStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TimingStatusEnum> createStaticFields() {
            Map<String, TimingStatusEnum> map = new HashMap<>();
            map.put("ACTIVATED", ACTIVATED);
            map.put("INACTIVATED", INACTIVATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TimingStatusEnum(String value) {
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
        public static TimingStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TimingStatusEnum(value));
        }

        public static TimingStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TimingStatusEnum) {
                return this.value.equals(((TimingStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timing_status")

    private TimingStatusEnum timingStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timing")

    private TaskTiming timing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private TaskInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private TaskOutputForDisplay output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_config")

    private TaskServiceConfig serviceConfig;

    public TaskDetails withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 作业ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TaskDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskDetails withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 作业创建者的用户名
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public TaskDetails withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 作业创建者的项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TaskDetails withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 作业的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskDetails withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 作业对应服务的名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public TaskDetails withServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /**
     * 作业对应服务的版本号
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public TaskDetails withServiceTitle(TaskDetailsServiceTitle serviceTitle) {
        this.serviceTitle = serviceTitle;
        return this;
    }

    public TaskDetails withServiceTitle(Consumer<TaskDetailsServiceTitle> serviceTitleSetter) {
        if (this.serviceTitle == null) {
            this.serviceTitle = new TaskDetailsServiceTitle();
            serviceTitleSetter.accept(this.serviceTitle);
        }

        return this;
    }

    /**
     * Get serviceTitle
     * @return serviceTitle
     */
    public TaskDetailsServiceTitle getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(TaskDetailsServiceTitle serviceTitle) {
        this.serviceTitle = serviceTitle;
    }

    public TaskDetails withEdgePoolId(String edgePoolId) {
        this.edgePoolId = edgePoolId;
        return this;
    }

    /**
     * 仅边缘作业会出现，作业运行所在的边缘运行池ID
     * @return edgePoolId
     */
    public String getEdgePoolId() {
        return edgePoolId;
    }

    public void setEdgePoolId(String edgePoolId) {
        this.edgePoolId = edgePoolId;
    }

    public TaskDetails withResourceOrderId(String resourceOrderId) {
        this.resourceOrderId = resourceOrderId;
        return this;
    }

    /**
     * 作业指定的算法能力包包周期订单ID
     * @return resourceOrderId
     */
    public String getResourceOrderId() {
        return resourceOrderId;
    }

    public void setResourceOrderId(String resourceOrderId) {
        this.resourceOrderId = resourceOrderId;
    }

    public TaskDetails withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 作业创建的时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public TaskDetails withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 作业最近一次状态更新的时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TaskDetails withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 作业当前的状态，分别为PENDING（等待中），RECOVERING（恢复中），STARTING（启动中），UPGRADING（升级中），CREATE_FAILED（创建失败），START_FAILED（启动失败），RUNNING（运行中），STOPPING（停止中），STOPPED（已停止），ABNORMAL（异常），SUCCEEDED（运行成功），FAILED（运行失败），DELETING（删除中），FREEZING（冻结中），FROZEN（已冻结）
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public TaskDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态的详情信息，仅部分状态会有详情信息
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TaskDetails withError(TaskDetailsError error) {
        this.error = error;
        return this;
    }

    public TaskDetails withError(Consumer<TaskDetailsError> errorSetter) {
        if (this.error == null) {
            this.error = new TaskDetailsError();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public TaskDetailsError getError() {
        return error;
    }

    public void setError(TaskDetailsError error) {
        this.error = error;
    }

    public TaskDetails withTimingStatus(TimingStatusEnum timingStatus) {
        this.timingStatus = timingStatus;
        return this;
    }

    /**
     * 计划任务的状态，分别为ACTIVATED（激活），INACTIVATED（未激活）
     * @return timingStatus
     */
    public TimingStatusEnum getTimingStatus() {
        return timingStatus;
    }

    public void setTimingStatus(TimingStatusEnum timingStatus) {
        this.timingStatus = timingStatus;
    }

    public TaskDetails withTiming(TaskTiming timing) {
        this.timing = timing;
        return this;
    }

    public TaskDetails withTiming(Consumer<TaskTiming> timingSetter) {
        if (this.timing == null) {
            this.timing = new TaskTiming();
            timingSetter.accept(this.timing);
        }

        return this;
    }

    /**
     * Get timing
     * @return timing
     */
    public TaskTiming getTiming() {
        return timing;
    }

    public void setTiming(TaskTiming timing) {
        this.timing = timing;
    }

    public TaskDetails withInput(TaskInput input) {
        this.input = input;
        return this;
    }

    public TaskDetails withInput(Consumer<TaskInput> inputSetter) {
        if (this.input == null) {
            this.input = new TaskInput();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public TaskInput getInput() {
        return input;
    }

    public void setInput(TaskInput input) {
        this.input = input;
    }

    public TaskDetails withOutput(TaskOutputForDisplay output) {
        this.output = output;
        return this;
    }

    public TaskDetails withOutput(Consumer<TaskOutputForDisplay> outputSetter) {
        if (this.output == null) {
            this.output = new TaskOutputForDisplay();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public TaskOutputForDisplay getOutput() {
        return output;
    }

    public void setOutput(TaskOutputForDisplay output) {
        this.output = output;
    }

    public TaskDetails withServiceConfig(TaskServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    public TaskDetails withServiceConfig(Consumer<TaskServiceConfig> serviceConfigSetter) {
        if (this.serviceConfig == null) {
            this.serviceConfig = new TaskServiceConfig();
            serviceConfigSetter.accept(this.serviceConfig);
        }

        return this;
    }

    /**
     * Get serviceConfig
     * @return serviceConfig
     */
    public TaskServiceConfig getServiceConfig() {
        return serviceConfig;
    }

    public void setServiceConfig(TaskServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskDetails that = (TaskDetails) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.serviceVersion, that.serviceVersion)
            && Objects.equals(this.serviceTitle, that.serviceTitle) && Objects.equals(this.edgePoolId, that.edgePoolId)
            && Objects.equals(this.resourceOrderId, that.resourceOrderId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.state, that.state) && Objects.equals(this.status, that.status)
            && Objects.equals(this.error, that.error) && Objects.equals(this.timingStatus, that.timingStatus)
            && Objects.equals(this.timing, that.timing) && Objects.equals(this.input, that.input)
            && Objects.equals(this.output, that.output) && Objects.equals(this.serviceConfig, that.serviceConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            creator,
            projectId,
            description,
            serviceName,
            serviceVersion,
            serviceTitle,
            edgePoolId,
            resourceOrderId,
            createdAt,
            updatedAt,
            state,
            status,
            error,
            timingStatus,
            timing,
            input,
            output,
            serviceConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskDetails {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
        sb.append("    serviceTitle: ").append(toIndentedString(serviceTitle)).append("\n");
        sb.append("    edgePoolId: ").append(toIndentedString(edgePoolId)).append("\n");
        sb.append("    resourceOrderId: ").append(toIndentedString(resourceOrderId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    timingStatus: ").append(toIndentedString(timingStatus)).append("\n");
        sb.append("    timing: ").append(toIndentedString(timing)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    serviceConfig: ").append(toIndentedString(serviceConfig)).append("\n");
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
