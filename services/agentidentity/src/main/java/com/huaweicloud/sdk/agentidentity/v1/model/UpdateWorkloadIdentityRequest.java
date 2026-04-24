package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateWorkloadIdentityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_identity_name")

    private String workloadIdentityName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateWorkloadIdentityReqBody body;

    public UpdateWorkloadIdentityRequest withWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
        return this;
    }

    /**
     * The name of the workload identity.
     * @return workloadIdentityName
     */
    public String getWorkloadIdentityName() {
        return workloadIdentityName;
    }

    public void setWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
    }

    public UpdateWorkloadIdentityRequest withBody(UpdateWorkloadIdentityReqBody body) {
        this.body = body;
        return this;
    }

    public UpdateWorkloadIdentityRequest withBody(Consumer<UpdateWorkloadIdentityReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateWorkloadIdentityReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateWorkloadIdentityReqBody getBody() {
        return body;
    }

    public void setBody(UpdateWorkloadIdentityReqBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWorkloadIdentityRequest that = (UpdateWorkloadIdentityRequest) obj;
        return Objects.equals(this.workloadIdentityName, that.workloadIdentityName)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadIdentityName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWorkloadIdentityRequest {\n");
        sb.append("    workloadIdentityName: ").append(toIndentedString(workloadIdentityName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
