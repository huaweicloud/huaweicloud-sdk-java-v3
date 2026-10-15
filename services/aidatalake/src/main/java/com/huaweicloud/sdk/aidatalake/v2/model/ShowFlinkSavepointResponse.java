package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFlinkSavepointResponse extends SdkResponse {

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
    @JsonProperty(value = "format")

    private FlinkSavepointFormat format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private FlinkSavepointStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drain_mode_enabled")

    private Boolean drainModeEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private Long createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed_time")

    private Long completedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private FlinkCreateUser createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ShowFlinkSavepointResponse withSavepointId(String savepointId) {
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

    public ShowFlinkSavepointResponse withJobId(String jobId) {
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

    public ShowFlinkSavepointResponse withTriggerType(FlinkSavepointTriggerType triggerType) {
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

    public ShowFlinkSavepointResponse withFormat(FlinkSavepointFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get format
     * @return format
     */
    public FlinkSavepointFormat getFormat() {
        return format;
    }

    public void setFormat(FlinkSavepointFormat format) {
        this.format = format;
    }

    public ShowFlinkSavepointResponse withStatus(FlinkSavepointStatus status) {
        this.status = status;
        return this;
    }

    public ShowFlinkSavepointResponse withStatus(Consumer<FlinkSavepointStatus> statusSetter) {
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

    public ShowFlinkSavepointResponse withDrainModeEnabled(Boolean drainModeEnabled) {
        this.drainModeEnabled = drainModeEnabled;
        return this;
    }

    /**
     * **参数解释**：是否启用了Drain模式。启用后，触发Savepoint前将先发送Watermark到所有算子以触发窗口计算完成，然后再保存状态快照。 **取值范围**：   - true：已启用Drain模式。   - false：未启用Drain模式。 
     * @return drainModeEnabled
     */
    public Boolean getDrainModeEnabled() {
        return drainModeEnabled;
    }

    public void setDrainModeEnabled(Boolean drainModeEnabled) {
        this.drainModeEnabled = drainModeEnabled;
    }

    public ShowFlinkSavepointResponse withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * **参数解释**：Savepoint存储路径。 **取值范围**：1~512个字符，需以obs://开头。 
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ShowFlinkSavepointResponse withCreatedTime(Long createdTime) {
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

    public ShowFlinkSavepointResponse withCompletedTime(Long completedTime) {
        this.completedTime = completedTime;
        return this;
    }

    /**
     * **参数解释**：完成时间戳。 **取值范围**：0~4102416000000，13位毫秒时间戳。 
     * minimum: 0
     * maximum: 4102416000000
     * @return completedTime
     */
    public Long getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(Long completedTime) {
        this.completedTime = completedTime;
    }

    public ShowFlinkSavepointResponse withCreateUser(FlinkCreateUser createUser) {
        this.createUser = createUser;
        return this;
    }

    public ShowFlinkSavepointResponse withCreateUser(Consumer<FlinkCreateUser> createUserSetter) {
        if (this.createUser == null) {
            this.createUser = new FlinkCreateUser();
            createUserSetter.accept(this.createUser);
        }

        return this;
    }

    /**
     * Get createUser
     * @return createUser
     */
    public FlinkCreateUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(FlinkCreateUser createUser) {
        this.createUser = createUser;
    }

    public ShowFlinkSavepointResponse withDescription(String description) {
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
        ShowFlinkSavepointResponse that = (ShowFlinkSavepointResponse) obj;
        return Objects.equals(this.savepointId, that.savepointId) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.triggerType, that.triggerType) && Objects.equals(this.format, that.format)
            && Objects.equals(this.status, that.status) && Objects.equals(this.drainModeEnabled, that.drainModeEnabled)
            && Objects.equals(this.location, that.location) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.completedTime, that.completedTime)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(savepointId,
            jobId,
            triggerType,
            format,
            status,
            drainModeEnabled,
            location,
            createdTime,
            completedTime,
            createUser,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkSavepointResponse {\n");
        sb.append("    savepointId: ").append(toIndentedString(savepointId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    drainModeEnabled: ").append(toIndentedString(drainModeEnabled)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
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
