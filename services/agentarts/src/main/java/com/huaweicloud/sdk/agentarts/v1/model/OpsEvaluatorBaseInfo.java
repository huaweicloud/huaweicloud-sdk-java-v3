package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 评估器的基础审计信息，记录创建与更新详情。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class OpsEvaluatorBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private EvaluationOpsCreatedBy createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_by")

    private EvaluationOpsUpdatedBy updatedBy;

    public OpsEvaluatorBaseInfo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 评估器的创建时间。 
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public OpsEvaluatorBaseInfo withCreatedBy(EvaluationOpsCreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public OpsEvaluatorBaseInfo withCreatedBy(Consumer<EvaluationOpsCreatedBy> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new EvaluationOpsCreatedBy();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public EvaluationOpsCreatedBy getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(EvaluationOpsCreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public OpsEvaluatorBaseInfo withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 评估器的最近一次更新时间。 
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public OpsEvaluatorBaseInfo withUpdatedBy(EvaluationOpsUpdatedBy updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public OpsEvaluatorBaseInfo withUpdatedBy(Consumer<EvaluationOpsUpdatedBy> updatedBySetter) {
        if (this.updatedBy == null) {
            this.updatedBy = new EvaluationOpsUpdatedBy();
            updatedBySetter.accept(this.updatedBy);
        }

        return this;
    }

    /**
     * Get updatedBy
     * @return updatedBy
     */
    public EvaluationOpsUpdatedBy getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(EvaluationOpsUpdatedBy updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsEvaluatorBaseInfo that = (OpsEvaluatorBaseInfo) obj;
        return Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.updatedBy, that.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, createdBy, updatedAt, updatedBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsEvaluatorBaseInfo {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
