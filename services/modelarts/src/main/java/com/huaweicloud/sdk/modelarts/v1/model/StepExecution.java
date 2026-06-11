package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单节点执行状态。
 */
public class StepExecution {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_name")

    private String stepName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    /**
     * 节点的类型。
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
     * 节点的状态。枚举值如下： - init：初始化 - wait_inputs：等待输入 - pending：等待 - creating：创建中 - created：创建成功 - create_failed：创建失败 - running：运行中 - stopping：停止中 - stopped：停止 - timeout：超时 - completed：完成 - failed：失败 - hold：持有 - skipped：跳过
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

    private List<JobInput> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<JobOutput> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_uuid")

    private String stepUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, Object> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<String> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private WorkflowErrorInfo errorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private WorkflowStepExecutionPolicy policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions_execution")

    private WorkflowConditionExecution conditionsExecution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_title")

    private String stepTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<StepCondition> conditions = null;

    public StepExecution withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    /**
     * 节点的名称，在一个DAG中唯一，1到64位只包含中英文，数字，空格，下划线（_）和中划线（-），并且以中英文开头。
     * @return stepName
     */
    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public StepExecution withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Execution执行的运行时长。
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public StepExecution withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 节点的类型。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public StepExecution withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public StepExecution withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 节点的状态。枚举值如下： - init：初始化 - wait_inputs：等待输入 - pending：等待 - creating：创建中 - created：创建成功 - create_failed：创建失败 - running：运行中 - stopping：停止中 - stopped：停止 - timeout：超时 - completed：完成 - failed：失败 - hold：持有 - skipped：跳过
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public StepExecution withInputs(List<JobInput> inputs) {
        this.inputs = inputs;
        return this;
    }

    public StepExecution addInputsItem(JobInput inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public StepExecution withInputs(Consumer<List<JobInput>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 节点的输入项。
     * @return inputs
     */
    public List<JobInput> getInputs() {
        return inputs;
    }

    public void setInputs(List<JobInput> inputs) {
        this.inputs = inputs;
    }

    public StepExecution withOutputs(List<JobOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    public StepExecution addOutputsItem(JobOutput outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public StepExecution withOutputs(Consumer<List<JobOutput>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * 节点的输出项。
     * @return outputs
     */
    public List<JobOutput> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<JobOutput> outputs) {
        this.outputs = outputs;
    }

    public StepExecution withStepUuid(String stepUuid) {
        this.stepUuid = stepUuid;
        return this;
    }

    /**
     * 节点的UUID，唯一性标识。
     * @return stepUuid
     */
    public String getStepUuid() {
        return stepUuid;
    }

    public void setStepUuid(String stepUuid) {
        this.stepUuid = stepUuid;
    }

    public StepExecution withProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public StepExecution putPropertiesItem(String key, Object propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public StepExecution withProperties(Consumer<Map<String, Object>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 节点的属性。
     * @return properties
     */
    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public StepExecution withEvents(List<String> events) {
        this.events = events;
        return this;
    }

    public StepExecution addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public StepExecution withEvents(Consumer<List<String>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 节点发生的事件。
     * @return events
     */
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public StepExecution withErrorInfo(WorkflowErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public StepExecution withErrorInfo(Consumer<WorkflowErrorInfo> errorInfoSetter) {
        if (this.errorInfo == null) {
            this.errorInfo = new WorkflowErrorInfo();
            errorInfoSetter.accept(this.errorInfo);
        }

        return this;
    }

    /**
     * Get errorInfo
     * @return errorInfo
     */
    public WorkflowErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(WorkflowErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    public StepExecution withPolicy(WorkflowStepExecutionPolicy policy) {
        this.policy = policy;
        return this;
    }

    public StepExecution withPolicy(Consumer<WorkflowStepExecutionPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new WorkflowStepExecutionPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public WorkflowStepExecutionPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(WorkflowStepExecutionPolicy policy) {
        this.policy = policy;
    }

    public StepExecution withConditionsExecution(WorkflowConditionExecution conditionsExecution) {
        this.conditionsExecution = conditionsExecution;
        return this;
    }

    public StepExecution withConditionsExecution(Consumer<WorkflowConditionExecution> conditionsExecutionSetter) {
        if (this.conditionsExecution == null) {
            this.conditionsExecution = new WorkflowConditionExecution();
            conditionsExecutionSetter.accept(this.conditionsExecution);
        }

        return this;
    }

    /**
     * Get conditionsExecution
     * @return conditionsExecution
     */
    public WorkflowConditionExecution getConditionsExecution() {
        return conditionsExecution;
    }

    public void setConditionsExecution(WorkflowConditionExecution conditionsExecution) {
        this.conditionsExecution = conditionsExecution;
    }

    public StepExecution withStepTitle(String stepTitle) {
        this.stepTitle = stepTitle;
        return this;
    }

    /**
     * 节点标题。
     * @return stepTitle
     */
    public String getStepTitle() {
        return stepTitle;
    }

    public void setStepTitle(String stepTitle) {
        this.stepTitle = stepTitle;
    }

    public StepExecution withConditions(List<StepCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public StepExecution addConditionsItem(StepCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public StepExecution withConditions(Consumer<List<StepCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * Get conditions
     * @return conditions
     */
    public List<StepCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<StepCondition> conditions) {
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
        StepExecution that = (StepExecution) obj;
        return Objects.equals(this.stepName, that.stepName) && Objects.equals(this.duration, that.duration)
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
        sb.append("class StepExecution {\n");
        sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
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
