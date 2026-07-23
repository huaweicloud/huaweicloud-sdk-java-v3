package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 单个任务类型的配额详情对象。 **约束限制：** task_type, total_task_count, free_task_quota_limit为必填项。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class QuotaItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_task_count")

    private Long totalTaskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_task_quota_limit")

    private Long freeTaskQuotaLimit;

    public QuotaItem withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * **参数解释：** 任务的类型分类。 **约束限制：** 长度为0到10000个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public QuotaItem withTotalTaskCount(Long totalTaskCount) {
        this.totalTaskCount = totalTaskCount;
        return this;
    }

    /**
     * **参数解释：** 当前已消耗的任务总数。 **约束限制：** 0到int64 最大值。 **取值范围：** 0到9223372036854775807。 **默认取值：** 0。 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalTaskCount
     */
    public Long getTotalTaskCount() {
        return totalTaskCount;
    }

    public void setTotalTaskCount(Long totalTaskCount) {
        this.totalTaskCount = totalTaskCount;
    }

    public QuotaItem withFreeTaskQuotaLimit(Long freeTaskQuotaLimit) {
        this.freeTaskQuotaLimit = freeTaskQuotaLimit;
        return this;
    }

    /**
     * **参数解释：** 免费任务的配额上限。 **约束限制：** 0到int64 最大值。 **取值范围：** 0到9223372036854775807。 **默认取值：** 0。 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return freeTaskQuotaLimit
     */
    public Long getFreeTaskQuotaLimit() {
        return freeTaskQuotaLimit;
    }

    public void setFreeTaskQuotaLimit(Long freeTaskQuotaLimit) {
        this.freeTaskQuotaLimit = freeTaskQuotaLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuotaItem that = (QuotaItem) obj;
        return Objects.equals(this.taskType, that.taskType) && Objects.equals(this.totalTaskCount, that.totalTaskCount)
            && Objects.equals(this.freeTaskQuotaLimit, that.freeTaskQuotaLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskType, totalTaskCount, freeTaskQuotaLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaItem {\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    totalTaskCount: ").append(toIndentedString(totalTaskCount)).append("\n");
        sb.append("    freeTaskQuotaLimit: ").append(toIndentedString(freeTaskQuotaLimit)).append("\n");
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
