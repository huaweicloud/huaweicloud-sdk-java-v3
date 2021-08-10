package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class JobStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public JobStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /** 作业的状态，有如下四种状态： - JobPhaseInitializing JobPhase = \"Initializing\" - JobPhaseRunning JobPhase = \"Running\" -
     * JobPhaseFailed JobPhase = \"Failed\" - JobPhaseSuccess JobPhase = \"Success\"
     * 
     * @return phase */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public JobStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /** 作业变为当前状态的原因
     * 
     * @return reason */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobStatus jobStatus = (JobStatus) o;
        return Objects.equals(this.phase, jobStatus.phase) && Objects.equals(this.reason, jobStatus.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
