package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 查询指定配额维度的免费配额和总配额信息的响应体。 **取值范围：** 不涉及。
 */
public class OpsEvaluationQuotaResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_quota_limit")

    private Long freeQuotaLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_used")

    private Long freeUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_quota_limit")

    private Long totalQuotaLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_used_count")

    private Long totalUsedCount;

    public OpsEvaluationQuotaResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 配额维度标识。取值范围：evaluation_task_count, parallel_online_evaluation_task_count, synthesis_task_count, parallel_synthesis_task_count, dataset_count, evaluator_count, label_count。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OpsEvaluationQuotaResponse withFreeQuotaLimit(Long freeQuotaLimit) {
        this.freeQuotaLimit = freeQuotaLimit;
        return this;
    }

    /**
     * **参数解释：** 免费配额上限。仅evaluation_task_count和synthesis_task_count有值，其他维度返回null。
     * @return freeQuotaLimit
     */
    public Long getFreeQuotaLimit() {
        return freeQuotaLimit;
    }

    public void setFreeQuotaLimit(Long freeQuotaLimit) {
        this.freeQuotaLimit = freeQuotaLimit;
    }

    public OpsEvaluationQuotaResponse withFreeUsed(Long freeUsed) {
        this.freeUsed = freeUsed;
        return this;
    }

    /**
     * **参数解释：** 免费配额已用数量。仅evaluation_task_count和synthesis_task_count有值，其他维度返回null。
     * @return freeUsed
     */
    public Long getFreeUsed() {
        return freeUsed;
    }

    public void setFreeUsed(Long freeUsed) {
        this.freeUsed = freeUsed;
    }

    public OpsEvaluationQuotaResponse withTotalQuotaLimit(Long totalQuotaLimit) {
        this.totalQuotaLimit = totalQuotaLimit;
        return this;
    }

    /**
     * **参数解释：** 总配额上限，从ServiceCM平台获取。
     * @return totalQuotaLimit
     */
    public Long getTotalQuotaLimit() {
        return totalQuotaLimit;
    }

    public void setTotalQuotaLimit(Long totalQuotaLimit) {
        this.totalQuotaLimit = totalQuotaLimit;
    }

    public OpsEvaluationQuotaResponse withTotalUsedCount(Long totalUsedCount) {
        this.totalUsedCount = totalUsedCount;
        return this;
    }

    /**
     * **参数解释：** 总配额已用数量，统计未删除状态的数据。
     * @return totalUsedCount
     */
    public Long getTotalUsedCount() {
        return totalUsedCount;
    }

    public void setTotalUsedCount(Long totalUsedCount) {
        this.totalUsedCount = totalUsedCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsEvaluationQuotaResponse that = (OpsEvaluationQuotaResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.freeQuotaLimit, that.freeQuotaLimit)
            && Objects.equals(this.freeUsed, that.freeUsed)
            && Objects.equals(this.totalQuotaLimit, that.totalQuotaLimit)
            && Objects.equals(this.totalUsedCount, that.totalUsedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, freeQuotaLimit, freeUsed, totalQuotaLimit, totalUsedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsEvaluationQuotaResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    freeQuotaLimit: ").append(toIndentedString(freeQuotaLimit)).append("\n");
        sb.append("    freeUsed: ").append(toIndentedString(freeUsed)).append("\n");
        sb.append("    totalQuotaLimit: ").append(toIndentedString(totalQuotaLimit)).append("\n");
        sb.append("    totalUsedCount: ").append(toIndentedString(totalUsedCount)).append("\n");
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
