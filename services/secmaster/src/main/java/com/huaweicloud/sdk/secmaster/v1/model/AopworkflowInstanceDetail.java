package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流程实例详情对象
 */
public class AopworkflowInstanceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow")

    private AopworkflowInstanceDetailWorkflow workflow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass")

    private AopworkflowInstanceDetailDataclass dataclass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook")

    private AopworkflowInstanceDetailPlaybook playbook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    /**
     * **参数解释**:          流程实例的状态 **取值范围**: - RUNNING   运行中 - FAILED    运行失败 - FINISHED  运行结束 - RETRYING  重试中 - TERMINATING 终止中 - TERMINATED  已终止
     */
    public static final class StatusEnum {

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum FINISHED for value: "FINISHED"
         */
        public static final StatusEnum FINISHED = new StatusEnum("FINISHED");

        /**
         * Enum RETRYING for value: "RETRYING"
         */
        public static final StatusEnum RETRYING = new StatusEnum("RETRYING");

        /**
         * Enum TERMINATING for value: "TERMINATING"
         */
        public static final StatusEnum TERMINATING = new StatusEnum("TERMINATING");

        /**
         * Enum TERMINATED for value: "TERMINATED"
         */
        public static final StatusEnum TERMINATED = new StatusEnum("TERMINATED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("FAILED", FAILED);
            map.put("FINISHED", FINISHED);
            map.put("RETRYING", RETRYING);
            map.put("TERMINATING", TERMINATING);
            map.put("TERMINATED", TERMINATED);
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
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_count")

    private Integer retryCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defense_id")

    private String defenseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataobject_id")

    private String dataobjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topology")

    private WorkflowInstanceTopology topology;

    public AopworkflowInstanceDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 流程实例的ID **约束限制**: 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AopworkflowInstanceDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 流程实例的名字 **约束限制**: 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AopworkflowInstanceDetail withWorkflow(AopworkflowInstanceDetailWorkflow workflow) {
        this.workflow = workflow;
        return this;
    }

    public AopworkflowInstanceDetail withWorkflow(Consumer<AopworkflowInstanceDetailWorkflow> workflowSetter) {
        if (this.workflow == null) {
            this.workflow = new AopworkflowInstanceDetailWorkflow();
            workflowSetter.accept(this.workflow);
        }

        return this;
    }

    /**
     * Get workflow
     * @return workflow
     */
    public AopworkflowInstanceDetailWorkflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(AopworkflowInstanceDetailWorkflow workflow) {
        this.workflow = workflow;
    }

    public AopworkflowInstanceDetail withDataclass(AopworkflowInstanceDetailDataclass dataclass) {
        this.dataclass = dataclass;
        return this;
    }

    public AopworkflowInstanceDetail withDataclass(Consumer<AopworkflowInstanceDetailDataclass> dataclassSetter) {
        if (this.dataclass == null) {
            this.dataclass = new AopworkflowInstanceDetailDataclass();
            dataclassSetter.accept(this.dataclass);
        }

        return this;
    }

    /**
     * Get dataclass
     * @return dataclass
     */
    public AopworkflowInstanceDetailDataclass getDataclass() {
        return dataclass;
    }

    public void setDataclass(AopworkflowInstanceDetailDataclass dataclass) {
        this.dataclass = dataclass;
    }

    public AopworkflowInstanceDetail withPlaybook(AopworkflowInstanceDetailPlaybook playbook) {
        this.playbook = playbook;
        return this;
    }

    public AopworkflowInstanceDetail withPlaybook(Consumer<AopworkflowInstanceDetailPlaybook> playbookSetter) {
        if (this.playbook == null) {
            this.playbook = new AopworkflowInstanceDetailPlaybook();
            playbookSetter.accept(this.playbook);
        }

        return this;
    }

    /**
     * Get playbook
     * @return playbook
     */
    public AopworkflowInstanceDetailPlaybook getPlaybook() {
        return playbook;
    }

    public void setPlaybook(AopworkflowInstanceDetailPlaybook playbook) {
        this.playbook = playbook;
    }

    public AopworkflowInstanceDetail withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * **参数解释**:          触发方式 **取值范围**: - DEBUG   调试触发 - TIMER   定时触发 - EVENT   事件触发 - MANUAL  手动触发
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public AopworkflowInstanceDetail withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**:          流程实例的状态 **取值范围**: - RUNNING   运行中 - FAILED    运行失败 - FINISHED  运行结束 - RETRYING  重试中 - TERMINATING 终止中 - TERMINATED  已终止
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AopworkflowInstanceDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**: 开始时间 **约束限制**: 不涉及
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public AopworkflowInstanceDetail withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**: 结束时间 **约束限制**: 不涉及
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public AopworkflowInstanceDetail withRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     * **参数解释**: 流程实例重试次数 **约束限制**: 不涉及
     * minimum: 1
     * maximum: 100
     * @return retryCount
     */
    public Integer getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    public AopworkflowInstanceDetail withDefenseId(String defenseId) {
        this.defenseId = defenseId;
        return this;
    }

    /**
     * **参数解释**: 防线ID **约束限制**: 不涉及
     * @return defenseId
     */
    public String getDefenseId() {
        return defenseId;
    }

    public void setDefenseId(String defenseId) {
        this.defenseId = defenseId;
    }

    public AopworkflowInstanceDetail withDataobjectId(String dataobjectId) {
        this.dataobjectId = dataobjectId;
        return this;
    }

    /**
     * **参数解释**: dataobject的ID **约束限制**: 不涉及
     * @return dataobjectId
     */
    public String getDataobjectId() {
        return dataobjectId;
    }

    public void setDataobjectId(String dataobjectId) {
        this.dataobjectId = dataobjectId;
    }

    public AopworkflowInstanceDetail withTopology(WorkflowInstanceTopology topology) {
        this.topology = topology;
        return this;
    }

    public AopworkflowInstanceDetail withTopology(Consumer<WorkflowInstanceTopology> topologySetter) {
        if (this.topology == null) {
            this.topology = new WorkflowInstanceTopology();
            topologySetter.accept(this.topology);
        }

        return this;
    }

    /**
     * Get topology
     * @return topology
     */
    public WorkflowInstanceTopology getTopology() {
        return topology;
    }

    public void setTopology(WorkflowInstanceTopology topology) {
        this.topology = topology;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AopworkflowInstanceDetail that = (AopworkflowInstanceDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.workflow, that.workflow) && Objects.equals(this.dataclass, that.dataclass)
            && Objects.equals(this.playbook, that.playbook) && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.retryCount, that.retryCount)
            && Objects.equals(this.defenseId, that.defenseId) && Objects.equals(this.dataobjectId, that.dataobjectId)
            && Objects.equals(this.topology, that.topology);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            workflow,
            dataclass,
            playbook,
            triggerType,
            status,
            startTime,
            endTime,
            retryCount,
            defenseId,
            dataobjectId,
            topology);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AopworkflowInstanceDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
        sb.append("    dataclass: ").append(toIndentedString(dataclass)).append("\n");
        sb.append("    playbook: ").append(toIndentedString(playbook)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
        sb.append("    defenseId: ").append(toIndentedString(defenseId)).append("\n");
        sb.append("    dataobjectId: ").append(toIndentedString(dataobjectId)).append("\n");
        sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
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
