package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateOrganizationPolicyAssignmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private OrganizationPolicyAssignmentRequest body;

    public CreateOrganizationPolicyAssignmentRequest withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * 组织ID。
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public CreateOrganizationPolicyAssignmentRequest withBody(OrganizationPolicyAssignmentRequest body) {
        this.body = body;
        return this;
    }

    public CreateOrganizationPolicyAssignmentRequest withBody(
        Consumer<OrganizationPolicyAssignmentRequest> bodySetter) {
        if (this.body == null) {
            this.body = new OrganizationPolicyAssignmentRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public OrganizationPolicyAssignmentRequest getBody() {
        return body;
    }

    public void setBody(OrganizationPolicyAssignmentRequest body) {
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
        CreateOrganizationPolicyAssignmentRequest createOrganizationPolicyAssignmentRequest =
            (CreateOrganizationPolicyAssignmentRequest) o;
        return Objects.equals(this.organizationId, createOrganizationPolicyAssignmentRequest.organizationId)
            && Objects.equals(this.body, createOrganizationPolicyAssignmentRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOrganizationPolicyAssignmentRequest {\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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
