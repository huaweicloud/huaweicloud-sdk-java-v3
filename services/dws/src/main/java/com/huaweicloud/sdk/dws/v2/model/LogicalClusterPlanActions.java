package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * **参数解释**： 逻辑集群增删计划任务信息。 **取值范围**： 不涉及。
 */
public class LogicalClusterPlanActions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_fire_time")

    private String nextFireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private String strategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_fire_time")

    private LocalDate preFireTime;

    public LogicalClusterPlanActions withNextFireTime(String nextFireTime) {
        this.nextFireTime = nextFireTime;
        return this;
    }

    /**
     * **参数解释**： 下一次触发时间。 **取值范围**： 不涉及。
     * @return nextFireTime
     */
    public String getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(String nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    public LogicalClusterPlanActions withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * **参数解释**： 失败原因。 **取值范围**： 不涉及。
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public LogicalClusterPlanActions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 任务ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LogicalClusterPlanActions withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 类型。 **取值范围**： create：创建 delete：删除
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LogicalClusterPlanActions withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * **参数解释**： 周期信息。Cron表达式：如\"0 0 0 ? * 3\"。 **取值范围**： 不涉及。
     * @return strategy
     */
    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public LogicalClusterPlanActions withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 任务状态。 **取值范围**： running|waiting|deleted|finished|disabled|failed。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LogicalClusterPlanActions withPreFireTime(LocalDate preFireTime) {
        this.preFireTime = preFireTime;
        return this;
    }

    /**
     * **参数解释**： 上一次触发时间。 **取值范围**： 不涉及。
     * @return preFireTime
     */
    public LocalDate getPreFireTime() {
        return preFireTime;
    }

    public void setPreFireTime(LocalDate preFireTime) {
        this.preFireTime = preFireTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogicalClusterPlanActions that = (LogicalClusterPlanActions) obj;
        return Objects.equals(this.nextFireTime, that.nextFireTime)
            && Objects.equals(this.failedReason, that.failedReason) && Objects.equals(this.id, that.id)
            && Objects.equals(this.type, that.type) && Objects.equals(this.strategy, that.strategy)
            && Objects.equals(this.status, that.status) && Objects.equals(this.preFireTime, that.preFireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextFireTime, failedReason, id, type, strategy, status, preFireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogicalClusterPlanActions {\n");
        sb.append("    nextFireTime: ").append(toIndentedString(nextFireTime)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    preFireTime: ").append(toIndentedString(preFireTime)).append("\n");
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
