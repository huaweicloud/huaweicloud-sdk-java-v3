package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 步骤运行信息
 */
public class StepRun {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private String task;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private String businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<StepRunInputs> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private Integer sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_task_version")

    private String officialTaskVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_step_editable")

    private Integer multiStepEditable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_ids")

    private List<String> endpointIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_dispatch_id")

    private String lastDispatchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public StepRun withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 步骤名称。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StepRun withTask(String task) {
        this.task = task;
        return this;
    }

    /**
     * **参数解释**： 步骤插件名。 **取值范围**： 不涉及。 
     * @return task
     */
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public StepRun withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * **参数解释**： 插件业务类型。 **取值范围**： - Normal：通用。 - Build：构建。 - Test：测试。 - Check：代码检查。 - Deploy：部署。 
     * @return businessType
     */
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public StepRun withInputs(List<StepRunInputs> inputs) {
        this.inputs = inputs;
        return this;
    }

    public StepRun addInputsItem(StepRunInputs inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public StepRun withInputs(Consumer<List<StepRunInputs>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * **参数解释**： 输入参数。 **取值范围**： 不涉及。 
     * @return inputs
     */
    public List<StepRunInputs> getInputs() {
        return inputs;
    }

    public void setInputs(List<StepRunInputs> inputs) {
        this.inputs = inputs;
    }

    public StepRun withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * **参数解释**： 序列号。 **取值范围**： 不涉及。 
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public StepRun withOfficialTaskVersion(String officialTaskVersion) {
        this.officialTaskVersion = officialTaskVersion;
        return this;
    }

    /**
     * **参数解释**： 官方插件版本号。 **取值范围**： 不涉及。 
     * @return officialTaskVersion
     */
    public String getOfficialTaskVersion() {
        return officialTaskVersion;
    }

    public void setOfficialTaskVersion(String officialTaskVersion) {
        this.officialTaskVersion = officialTaskVersion;
    }

    public StepRun withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * **参数解释**： 唯一标识符。 **取值范围**： 不涉及。 
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public StepRun withMultiStepEditable(Integer multiStepEditable) {
        this.multiStepEditable = multiStepEditable;
        return this;
    }

    /**
     * **参数解释**： 是否可编辑。 **取值范围**： - true：可编辑。 - false：不可编辑。 
     * @return multiStepEditable
     */
    public Integer getMultiStepEditable() {
        return multiStepEditable;
    }

    public void setMultiStepEditable(Integer multiStepEditable) {
        this.multiStepEditable = multiStepEditable;
    }

    public StepRun withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 步骤ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StepRun withEndpointIds(List<String> endpointIds) {
        this.endpointIds = endpointIds;
        return this;
    }

    public StepRun addEndpointIdsItem(String endpointIdsItem) {
        if (this.endpointIds == null) {
            this.endpointIds = new ArrayList<>();
        }
        this.endpointIds.add(endpointIdsItem);
        return this;
    }

    public StepRun withEndpointIds(Consumer<List<String>> endpointIdsSetter) {
        if (this.endpointIds == null) {
            this.endpointIds = new ArrayList<>();
        }
        endpointIdsSetter.accept(this.endpointIds);
        return this;
    }

    /**
     * **参数解释**： 扩展点ID列表。 **取值范围**： 不涉及。 
     * @return endpointIds
     */
    public List<String> getEndpointIds() {
        return endpointIds;
    }

    public void setEndpointIds(List<String> endpointIds) {
        this.endpointIds = endpointIds;
    }

    public StepRun withLastDispatchId(String lastDispatchId) {
        this.lastDispatchId = lastDispatchId;
        return this;
    }

    /**
     * **参数解释**： 上次下发任务ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return lastDispatchId
     */
    public String getLastDispatchId() {
        return lastDispatchId;
    }

    public void setLastDispatchId(String lastDispatchId) {
        this.lastDispatchId = lastDispatchId;
    }

    public StepRun withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态。 **取值范围**： - RUNNING：运行中。 - CANCELED：取消。 - COMPLETED：已完成。 - FAILED：失败。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StepRun withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**： 错误消息。 **取值范围**： 不涉及。 
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public StepRun withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 步骤开始时间。 **取值范围**： 不涉及。 
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public StepRun withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 步骤结束时间。 **取值范围**： 不涉及。 
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StepRun that = (StepRun) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.task, that.task)
            && Objects.equals(this.businessType, that.businessType) && Objects.equals(this.inputs, that.inputs)
            && Objects.equals(this.sequence, that.sequence)
            && Objects.equals(this.officialTaskVersion, that.officialTaskVersion)
            && Objects.equals(this.identifier, that.identifier)
            && Objects.equals(this.multiStepEditable, that.multiStepEditable) && Objects.equals(this.id, that.id)
            && Objects.equals(this.endpointIds, that.endpointIds)
            && Objects.equals(this.lastDispatchId, that.lastDispatchId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.message, that.message) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            task,
            businessType,
            inputs,
            sequence,
            officialTaskVersion,
            identifier,
            multiStepEditable,
            id,
            endpointIds,
            lastDispatchId,
            status,
            message,
            startTime,
            endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StepRun {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    officialTaskVersion: ").append(toIndentedString(officialTaskVersion)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    multiStepEditable: ").append(toIndentedString(multiStepEditable)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    endpointIds: ").append(toIndentedString(endpointIds)).append("\n");
        sb.append("    lastDispatchId: ").append(toIndentedString(lastDispatchId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
