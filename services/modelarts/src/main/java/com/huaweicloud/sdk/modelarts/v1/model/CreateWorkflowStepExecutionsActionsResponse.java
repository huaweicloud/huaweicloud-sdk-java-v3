package com.huaweicloud.sdk.modelarts.v1.model;

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
public class CreateWorkflowStepExecutionsActionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_name")

    private String stepName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_name")

    private String executionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_uuid")

    private String executionUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    /**
     * **参数解释**：节点的类型。 **取值范围**：枚举值如下: - job：训练 - labeling：标注 - release_dataset：数据集发布 - model：模型发布 - service：服务部署 - mrs_job：MRS作业 - dataset_import：数据集导入 - create_dataset：创建数据集
     */
    public static final class TypeEnum {

        /**
         * Enum TRANING_JOB for value: "traning_job"
         */
        public static final TypeEnum TRANING_JOB = new TypeEnum("traning_job");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("traning_job", TRANING_JOB);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * **参数解释**：节点的状态。 **取值范围**：枚举值如下： - init：初始化 - wait_inputs：等待输入 - pending：等待 - creating：创建中 - created：创建成功 - create_failed：创建失败 - running：运行中 - stopping：停止中 - stopped：停止 - timeout：超时 - completed：完成 - failed：失败 - hold：暂停 - skipped：跳过
     */
    public static final class StatusEnum {

        /**
         * Enum INIT for value: "init"
         */
        public static final StatusEnum INIT = new StatusEnum("init");

        /**
         * Enum WAIT_INPUTS for value: "wait_inputs"
         */
        public static final StatusEnum WAIT_INPUTS = new StatusEnum("wait_inputs");

        /**
         * Enum PENDING for value: "pending"
         */
        public static final StatusEnum PENDING = new StatusEnum("pending");

        /**
         * Enum CREATING for value: "creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("creating");

        /**
         * Enum CREATED for value: "created"
         */
        public static final StatusEnum CREATED = new StatusEnum("created");

        /**
         * Enum CREATE_FAILED for value: "create_failed"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("create_failed");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum STOPPING for value: "stopping"
         */
        public static final StatusEnum STOPPING = new StatusEnum("stopping");

        /**
         * Enum STOPPED for value: "stopped"
         */
        public static final StatusEnum STOPPED = new StatusEnum("stopped");

        /**
         * Enum TIMEOUT for value: "timeout"
         */
        public static final StatusEnum TIMEOUT = new StatusEnum("timeout");

        /**
         * Enum COMPLETED for value: "completed"
         */
        public static final StatusEnum COMPLETED = new StatusEnum("completed");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        /**
         * Enum HOLD for value: "hold"
         */
        public static final StatusEnum HOLD = new StatusEnum("hold");

        /**
         * Enum SKIPPED for value: "skipped"
         */
        public static final StatusEnum SKIPPED = new StatusEnum("skipped");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("init", INIT);
            map.put("wait_inputs", WAIT_INPUTS);
            map.put("pending", PENDING);
            map.put("creating", CREATING);
            map.put("created", CREATED);
            map.put("create_failed", CREATE_FAILED);
            map.put("running", RUNNING);
            map.put("stopping", STOPPING);
            map.put("stopped", STOPPED);
            map.put("timeout", TIMEOUT);
            map.put("completed", COMPLETED);
            map.put("failed", FAILED);
            map.put("hold", HOLD);
            map.put("skipped", SKIPPED);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "inputs")

    private List<JobInputResp> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<JobOutputResp> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_uuid")

    private String stepUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, String> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<String> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private WorkflowErrorInfoResp errorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private WorkflowStepExecutionPolicyResp policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions_execution")

    private WorkflowConditionExecutionResp conditionsExecution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_title")

    private String stepTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<StepConditionResp> conditions = null;

    public CreateWorkflowStepExecutionsActionsResponse withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    /**
     * **参数解释**：节点的名称，在一个DAG中唯一。 **取值范围**：不涉及。
     * @return stepName
     */
    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public CreateWorkflowStepExecutionsActionsResponse withExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }

    /**
     * **参数解释**：执行记录的名称。 **取值范围**：不涉及。
     * @return executionName
     */
    public String getExecutionName() {
        return executionName;
    }

    public void setExecutionName(String executionName) {
        this.executionName = executionName;
    }

    public CreateWorkflowStepExecutionsActionsResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：执行记录与节点的组合名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateWorkflowStepExecutionsActionsResponse withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * **参数解释**：唯一标识uuid。创建节点执行时，后台自动生成。 **取值范围**：不涉及。
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public CreateWorkflowStepExecutionsActionsResponse withExecutionUuid(String executionUuid) {
        this.executionUuid = executionUuid;
        return this;
    }

    /**
     * **参数解释**：执行记录的UUID。 **取值范围**：不涉及。
     * @return executionUuid
     */
    public String getExecutionUuid() {
        return executionUuid;
    }

    public void setExecutionUuid(String executionUuid) {
        this.executionUuid = executionUuid;
    }

    public CreateWorkflowStepExecutionsActionsResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**：Execution执行的创建时间。 **取值范围**：不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CreateWorkflowStepExecutionsActionsResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**：Execution执行的更新时间。 **取值范围**：不涉及。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CreateWorkflowStepExecutionsActionsResponse withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释**：Execution执行的运行时长。 **取值范围**：不涉及。
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public CreateWorkflowStepExecutionsActionsResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：节点的类型。 **取值范围**：枚举值如下: - job：训练 - labeling：标注 - release_dataset：数据集发布 - model：模型发布 - service：服务部署 - mrs_job：MRS作业 - dataset_import：数据集导入 - create_dataset：创建数据集
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateWorkflowStepExecutionsActionsResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：实例ID。 **取值范围**：不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateWorkflowStepExecutionsActionsResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：节点的状态。 **取值范围**：枚举值如下： - init：初始化 - wait_inputs：等待输入 - pending：等待 - creating：创建中 - created：创建成功 - create_failed：创建失败 - running：运行中 - stopping：停止中 - stopped：停止 - timeout：超时 - completed：完成 - failed：失败 - hold：暂停 - skipped：跳过
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CreateWorkflowStepExecutionsActionsResponse withInputs(List<JobInputResp> inputs) {
        this.inputs = inputs;
        return this;
    }

    public CreateWorkflowStepExecutionsActionsResponse addInputsItem(JobInputResp inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public CreateWorkflowStepExecutionsActionsResponse withInputs(Consumer<List<JobInputResp>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * **参数解释**：节点的输入项。
     * @return inputs
     */
    public List<JobInputResp> getInputs() {
        return inputs;
    }

    public void setInputs(List<JobInputResp> inputs) {
        this.inputs = inputs;
    }

    public CreateWorkflowStepExecutionsActionsResponse withOutputs(List<JobOutputResp> outputs) {
        this.outputs = outputs;
        return this;
    }

    public CreateWorkflowStepExecutionsActionsResponse addOutputsItem(JobOutputResp outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public CreateWorkflowStepExecutionsActionsResponse withOutputs(Consumer<List<JobOutputResp>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * **参数解释**：节点的输出项。
     * @return outputs
     */
    public List<JobOutputResp> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<JobOutputResp> outputs) {
        this.outputs = outputs;
    }

    public CreateWorkflowStepExecutionsActionsResponse withStepUuid(String stepUuid) {
        this.stepUuid = stepUuid;
        return this;
    }

    /**
     * **参数解释**：节点的UUID，唯一性标识。 **取值范围**：不涉及。
     * @return stepUuid
     */
    public String getStepUuid() {
        return stepUuid;
    }

    public void setStepUuid(String stepUuid) {
        this.stepUuid = stepUuid;
    }

    public CreateWorkflowStepExecutionsActionsResponse withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public CreateWorkflowStepExecutionsActionsResponse putPropertiesItem(String key, String propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public CreateWorkflowStepExecutionsActionsResponse withProperties(Consumer<Map<String, String>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * **参数解释**：节点的属性。
     * @return properties
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public CreateWorkflowStepExecutionsActionsResponse withEvents(List<String> events) {
        this.events = events;
        return this;
    }

    public CreateWorkflowStepExecutionsActionsResponse addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public CreateWorkflowStepExecutionsActionsResponse withEvents(Consumer<List<String>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * **参数解释**：节点发生的事件。
     * @return events
     */
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public CreateWorkflowStepExecutionsActionsResponse withErrorInfo(WorkflowErrorInfoResp errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public CreateWorkflowStepExecutionsActionsResponse withErrorInfo(Consumer<WorkflowErrorInfoResp> errorInfoSetter) {
        if (this.errorInfo == null) {
            this.errorInfo = new WorkflowErrorInfoResp();
            errorInfoSetter.accept(this.errorInfo);
        }

        return this;
    }

    /**
     * Get errorInfo
     * @return errorInfo
     */
    public WorkflowErrorInfoResp getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(WorkflowErrorInfoResp errorInfo) {
        this.errorInfo = errorInfo;
    }

    public CreateWorkflowStepExecutionsActionsResponse withPolicy(WorkflowStepExecutionPolicyResp policy) {
        this.policy = policy;
        return this;
    }

    public CreateWorkflowStepExecutionsActionsResponse withPolicy(
        Consumer<WorkflowStepExecutionPolicyResp> policySetter) {
        if (this.policy == null) {
            this.policy = new WorkflowStepExecutionPolicyResp();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public WorkflowStepExecutionPolicyResp getPolicy() {
        return policy;
    }

    public void setPolicy(WorkflowStepExecutionPolicyResp policy) {
        this.policy = policy;
    }

    public CreateWorkflowStepExecutionsActionsResponse withConditionsExecution(
        WorkflowConditionExecutionResp conditionsExecution) {
        this.conditionsExecution = conditionsExecution;
        return this;
    }

    public CreateWorkflowStepExecutionsActionsResponse withConditionsExecution(
        Consumer<WorkflowConditionExecutionResp> conditionsExecutionSetter) {
        if (this.conditionsExecution == null) {
            this.conditionsExecution = new WorkflowConditionExecutionResp();
            conditionsExecutionSetter.accept(this.conditionsExecution);
        }

        return this;
    }

    /**
     * Get conditionsExecution
     * @return conditionsExecution
     */
    public WorkflowConditionExecutionResp getConditionsExecution() {
        return conditionsExecution;
    }

    public void setConditionsExecution(WorkflowConditionExecutionResp conditionsExecution) {
        this.conditionsExecution = conditionsExecution;
    }

    public CreateWorkflowStepExecutionsActionsResponse withStepTitle(String stepTitle) {
        this.stepTitle = stepTitle;
        return this;
    }

    /**
     * **参数解释**：节点标题。 **取值范围**：不涉及。
     * @return stepTitle
     */
    public String getStepTitle() {
        return stepTitle;
    }

    public void setStepTitle(String stepTitle) {
        this.stepTitle = stepTitle;
    }

    public CreateWorkflowStepExecutionsActionsResponse withConditions(List<StepConditionResp> conditions) {
        this.conditions = conditions;
        return this;
    }

    public CreateWorkflowStepExecutionsActionsResponse addConditionsItem(StepConditionResp conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public CreateWorkflowStepExecutionsActionsResponse withConditions(
        Consumer<List<StepConditionResp>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * **参数解释**：条件节点执行条件。
     * @return conditions
     */
    public List<StepConditionResp> getConditions() {
        return conditions;
    }

    public void setConditions(List<StepConditionResp> conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWorkflowStepExecutionsActionsResponse that = (CreateWorkflowStepExecutionsActionsResponse) obj;
        return Objects.equals(this.stepName, that.stepName) && Objects.equals(this.executionName, that.executionName)
            && Objects.equals(this.name, that.name) && Objects.equals(this.uuid, that.uuid)
            && Objects.equals(this.executionUuid, that.executionUuid) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.type, that.type) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.inputs, that.inputs)
            && Objects.equals(this.outputs, that.outputs) && Objects.equals(this.stepUuid, that.stepUuid)
            && Objects.equals(this.properties, that.properties) && Objects.equals(this.events, that.events)
            && Objects.equals(this.errorInfo, that.errorInfo) && Objects.equals(this.policy, that.policy)
            && Objects.equals(this.conditionsExecution, that.conditionsExecution)
            && Objects.equals(this.stepTitle, that.stepTitle) && Objects.equals(this.conditions, that.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepName,
            executionName,
            name,
            uuid,
            executionUuid,
            createdAt,
            updatedAt,
            duration,
            type,
            instanceId,
            status,
            inputs,
            outputs,
            stepUuid,
            properties,
            events,
            errorInfo,
            policy,
            conditionsExecution,
            stepTitle,
            conditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkflowStepExecutionsActionsResponse {\n");
        sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
        sb.append("    executionName: ").append(toIndentedString(executionName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    executionUuid: ").append(toIndentedString(executionUuid)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    stepUuid: ").append(toIndentedString(stepUuid)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    conditionsExecution: ").append(toIndentedString(conditionsExecution)).append("\n");
        sb.append("    stepTitle: ").append(toIndentedString(stepTitle)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
