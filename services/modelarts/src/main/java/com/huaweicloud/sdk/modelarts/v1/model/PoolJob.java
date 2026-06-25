package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源管理作业。
 */
public class PoolJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTimestamp")

    private Long startTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTimestamp")

    private Long endTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobId")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobName")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "involvedObjects")

    private String involvedObjects;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private String inputs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suspend")

    private Boolean suspend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private String conditions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public PoolJob withStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * **参数解释**： job开始处理时间，单位毫秒。 **取值范围**： 不涉及。
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public PoolJob withEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }

    /**
     * **参数解释**： Job结束时间，单位毫秒。 **取值范围**： 不涉及。
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public PoolJob withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**： 任务ID。 **取值范围**： 不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public PoolJob withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * **参数解释**： 任务名称。 **取值范围**： 不涉及。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public PoolJob withInvolvedObjects(String involvedObjects) {
        this.involvedObjects = involvedObjects;
        return this;
    }

    /**
     * **参数解释**： Job关联的资源，比如资源池描述。 **取值范围**： 不涉及。
     * @return involvedObjects
     */
    public String getInvolvedObjects() {
        return involvedObjects;
    }

    public void setInvolvedObjects(String involvedObjects) {
        this.involvedObjects = involvedObjects;
    }

    public PoolJob withInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * **参数解释**： Job输入参数。 **取值范围**： 不涉及。
     * @return inputs
     */
    public String getInputs() {
        return inputs;
    }

    public void setInputs(String inputs) {
        this.inputs = inputs;
    }

    public PoolJob withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * **参数解释**： Job状态。 **取值范围**： 可选值如下： - Running：任务正在运行中。 - Success：任务执行成功。 - Failed：任务执行失败。
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public PoolJob withSuspend(Boolean suspend) {
        this.suspend = suspend;
        return this;
    }

    /**
     * **参数解释**： Job是否被挂起。 **取值范围**： 不涉及。
     * @return suspend
     */
    public Boolean getSuspend() {
        return suspend;
    }

    public void setSuspend(Boolean suspend) {
        this.suspend = suspend;
    }

    public PoolJob withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： Job类型。 **取值范围**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PoolJob withConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * **参数解释**： Job的执行过程信息。 **取值范围**： 不涉及。
     * @return conditions
     */
    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public PoolJob withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**： Job执行失败时返回执行信息。 **取值范围**： 不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolJob that = (PoolJob) obj;
        return Objects.equals(this.startTimestamp, that.startTimestamp)
            && Objects.equals(this.endTimestamp, that.endTimestamp) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.involvedObjects, that.involvedObjects)
            && Objects.equals(this.inputs, that.inputs) && Objects.equals(this.phase, that.phase)
            && Objects.equals(this.suspend, that.suspend) && Objects.equals(this.type, that.type)
            && Objects.equals(this.conditions, that.conditions) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTimestamp,
            endTimestamp,
            jobId,
            jobName,
            involvedObjects,
            inputs,
            phase,
            suspend,
            type,
            conditions,
            message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolJob {\n");
        sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
        sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    involvedObjects: ").append(toIndentedString(involvedObjects)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
