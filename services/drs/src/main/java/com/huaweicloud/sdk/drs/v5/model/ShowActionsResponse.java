package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowActionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_action")

    private JobActions jobAction;

    public ShowActionsResponse withJobAction(JobActions jobAction) {
        this.jobAction = jobAction;
        return this;
    }

    public ShowActionsResponse withJobAction(Consumer<JobActions> jobActionSetter) {
        if (this.jobAction == null) {
            this.jobAction = new JobActions();
            jobActionSetter.accept(this.jobAction);
        }

        return this;
    }

    /**
     * Get jobAction
     * @return jobAction
     */
    public JobActions getJobAction() {
        return jobAction;
    }

    public void setJobAction(JobActions jobAction) {
        this.jobAction = jobAction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowActionsResponse that = (ShowActionsResponse) obj;
        return Objects.equals(this.jobAction, that.jobAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowActionsResponse {\n");
        sb.append("    jobAction: ").append(toIndentedString(jobAction)).append("\n");
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
