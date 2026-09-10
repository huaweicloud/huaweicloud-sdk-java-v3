package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 纠正信息。
 */
public class OpsCorrection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Float score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_user_id")

    private String updatedUserId;

    public OpsCorrection withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 纠正原因。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public OpsCorrection withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * 纠正后的得分，通常在0到1之间。
     * minimum: 0
     * maximum: 1
     * @return score
     */
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public OpsCorrection withUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId;
        return this;
    }

    /**
     * 纠正者的用户ID。
     * @return updatedUserId
     */
    public String getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsCorrection that = (OpsCorrection) obj;
        return Objects.equals(this.reason, that.reason) && Objects.equals(this.score, that.score)
            && Objects.equals(this.updatedUserId, that.updatedUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, score, updatedUserId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsCorrection {\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    updatedUserId: ").append(toIndentedString(updatedUserId)).append("\n");
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
