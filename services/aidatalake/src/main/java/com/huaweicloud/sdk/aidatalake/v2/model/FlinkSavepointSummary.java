package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Flink Savepoint摘要信息（列表展示）。 
 */
public class FlinkSavepointSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "savepoint_id")

    private String savepointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private FlinkSavepointTriggerType triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private FlinkSavepointStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private Long createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public FlinkSavepointSummary withSavepointId(String savepointId) {
        this.savepointId = savepointId;
        return this;
    }

    /**
     * **参数解释**：Savepoint唯一标识。 **取值范围**：UUIDv7格式，固定36位，由英文小写字母、数字及中划线组成。 
     * @return savepointId
     */
    public String getSavepointId() {
        return savepointId;
    }

    public void setSavepointId(String savepointId) {
        this.savepointId = savepointId;
    }

    public FlinkSavepointSummary withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：关联的Flink作业ID。 **取值范围**：UUIDv7格式，固定36位，由英文小写字母、数字及中划线组成。 
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public FlinkSavepointSummary withTriggerType(FlinkSavepointTriggerType triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * Get triggerType
     * @return triggerType
     */
    public FlinkSavepointTriggerType getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(FlinkSavepointTriggerType triggerType) {
        this.triggerType = triggerType;
    }

    public FlinkSavepointSummary withStatus(FlinkSavepointStatus status) {
        this.status = status;
        return this;
    }

    public FlinkSavepointSummary withStatus(Consumer<FlinkSavepointStatus> statusSetter) {
        if (this.status == null) {
            this.status = new FlinkSavepointStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public FlinkSavepointStatus getStatus() {
        return status;
    }

    public void setStatus(FlinkSavepointStatus status) {
        this.status = status;
    }

    public FlinkSavepointSummary withCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数解释**：创建时间戳。 **取值范围**：0~4102416000000，13位毫秒时间戳。 
     * minimum: 0
     * maximum: 4102416000000
     * @return createdTime
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public FlinkSavepointSummary withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * **参数解释**：快照存储路径。 **取值范围**：1~512个字符，需以obs://开头。 
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public FlinkSavepointSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：作业快照描述。 **取值范围**：0~512个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkSavepointSummary that = (FlinkSavepointSummary) obj;
        return Objects.equals(this.savepointId, that.savepointId) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.triggerType, that.triggerType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.location, that.location)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(savepointId, jobId, triggerType, status, createdTime, location, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkSavepointSummary {\n");
        sb.append("    savepointId: ").append(toIndentedString(savepointId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
