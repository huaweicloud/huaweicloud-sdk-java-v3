package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateAlertRuleSimulationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateAlertRuleSimulationRequestBody body;

    public CreateAlertRuleSimulationRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * workspace_id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CreateAlertRuleSimulationRequest withBody(CreateAlertRuleSimulationRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateAlertRuleSimulationRequest withBody(Consumer<CreateAlertRuleSimulationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateAlertRuleSimulationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateAlertRuleSimulationRequestBody getBody() {
        return body;
    }

    public void setBody(CreateAlertRuleSimulationRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAlertRuleSimulationRequest createAlertRuleSimulationRequest = (CreateAlertRuleSimulationRequest) o;
        return Objects.equals(this.workspaceId, createAlertRuleSimulationRequest.workspaceId)
            && Objects.equals(this.body, createAlertRuleSimulationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAlertRuleSimulationRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
