package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateWorkloadIdentityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_identity")

    private WorkloadIdentity workloadIdentity;

    public UpdateWorkloadIdentityResponse withWorkloadIdentity(WorkloadIdentity workloadIdentity) {
        this.workloadIdentity = workloadIdentity;
        return this;
    }

    public UpdateWorkloadIdentityResponse withWorkloadIdentity(Consumer<WorkloadIdentity> workloadIdentitySetter) {
        if (this.workloadIdentity == null) {
            this.workloadIdentity = new WorkloadIdentity();
            workloadIdentitySetter.accept(this.workloadIdentity);
        }

        return this;
    }

    /**
     * Get workloadIdentity
     * @return workloadIdentity
     */
    public WorkloadIdentity getWorkloadIdentity() {
        return workloadIdentity;
    }

    public void setWorkloadIdentity(WorkloadIdentity workloadIdentity) {
        this.workloadIdentity = workloadIdentity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWorkloadIdentityResponse that = (UpdateWorkloadIdentityResponse) obj;
        return Objects.equals(this.workloadIdentity, that.workloadIdentity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadIdentity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWorkloadIdentityResponse {\n");
        sb.append("    workloadIdentity: ").append(toIndentedString(workloadIdentity)).append("\n");
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
