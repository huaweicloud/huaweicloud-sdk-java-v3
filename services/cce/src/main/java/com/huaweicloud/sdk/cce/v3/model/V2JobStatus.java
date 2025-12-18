package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * V2JobStatus
 */
public class V2JobStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completionTime")

    private String completionTime;

    public V2JobStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： Job的状态 **约束限制**： 不涉及 **取值范围**： - Initializing：未执行 - Running：执行中 - Failed：执行失败 - Success：执行成功  **默认取值**： 不涉及
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public V2JobStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释**： Job执行失败的原因 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public V2JobStatus withCompletionTime(String completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    /**
     * **参数解释**： Job完成时间 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return completionTime
     */
    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2JobStatus that = (V2JobStatus) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.completionTime, that.completionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, reason, completionTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2JobStatus {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
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
