package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EvaluationOpsTaskBaseInfo
 */
public class EvaluationOpsTaskBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private String startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed_at")

    private String completedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration_seconds")

    private Long durationSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private UserInfoObj createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "started_by")

    private UserInfoObj startedBy;

    public EvaluationOpsTaskBaseInfo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 任务在系统中创建的时间戳。 **取值范围：** 日期时间字符串。 
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public EvaluationOpsTaskBaseInfo withStartAt(String startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * **参数解释：** 任务正式开始执行的精确时刻。 **取值范围：** 日期时间字符串。 
     * @return startAt
     */
    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public EvaluationOpsTaskBaseInfo withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 任务状态或元数据最后一次变更的时间。 **取值范围：** 日期时间字符串。 
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EvaluationOpsTaskBaseInfo withCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * **参数解释：** 任务执行完毕（无论成败）的时间。 **取值范围：** 日期时间字符串。 
     * @return completedAt
     */
    public String getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public EvaluationOpsTaskBaseInfo withDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * **参数解释：** 任务的有效运行总时长（秒）。 **取值范围：** 非负整数。 
     * minimum: 0
     * maximum: 31536000
     * @return durationSeconds
     */
    public Long getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public EvaluationOpsTaskBaseInfo withCreatedBy(UserInfoObj createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public EvaluationOpsTaskBaseInfo withCreatedBy(Consumer<UserInfoObj> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new UserInfoObj();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public UserInfoObj getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserInfoObj createdBy) {
        this.createdBy = createdBy;
    }

    public EvaluationOpsTaskBaseInfo withStartedBy(UserInfoObj startedBy) {
        this.startedBy = startedBy;
        return this;
    }

    public EvaluationOpsTaskBaseInfo withStartedBy(Consumer<UserInfoObj> startedBySetter) {
        if (this.startedBy == null) {
            this.startedBy = new UserInfoObj();
            startedBySetter.accept(this.startedBy);
        }

        return this;
    }

    /**
     * Get startedBy
     * @return startedBy
     */
    public UserInfoObj getStartedBy() {
        return startedBy;
    }

    public void setStartedBy(UserInfoObj startedBy) {
        this.startedBy = startedBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluationOpsTaskBaseInfo that = (EvaluationOpsTaskBaseInfo) obj;
        return Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.startAt, that.startAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.completedAt, that.completedAt)
            && Objects.equals(this.durationSeconds, that.durationSeconds)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.startedBy, that.startedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, startAt, updatedAt, completedAt, durationSeconds, createdBy, startedBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsTaskBaseInfo {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    startedBy: ").append(toIndentedString(startedBy)).append("\n");
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
