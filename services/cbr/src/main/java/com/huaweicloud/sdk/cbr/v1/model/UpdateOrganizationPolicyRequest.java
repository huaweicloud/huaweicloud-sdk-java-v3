package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateOrganizationPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_policy_id")

    private String organizationPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private OrganizationPolicyUpdateReq body;

    public UpdateOrganizationPolicyRequest withOrganizationPolicyId(String organizationPolicyId) {
        this.organizationPolicyId = organizationPolicyId;
        return this;
    }

    /**
     * 组织策略ID
     * @return organizationPolicyId
     */
    public String getOrganizationPolicyId() {
        return organizationPolicyId;
    }

    public void setOrganizationPolicyId(String organizationPolicyId) {
        this.organizationPolicyId = organizationPolicyId;
    }

    public UpdateOrganizationPolicyRequest withBody(OrganizationPolicyUpdateReq body) {
        this.body = body;
        return this;
    }

    public UpdateOrganizationPolicyRequest withBody(Consumer<OrganizationPolicyUpdateReq> bodySetter) {
        if (this.body == null) {
            this.body = new OrganizationPolicyUpdateReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public OrganizationPolicyUpdateReq getBody() {
        return body;
    }

    public void setBody(OrganizationPolicyUpdateReq body) {
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
        UpdateOrganizationPolicyRequest that = (UpdateOrganizationPolicyRequest) obj;
        return Objects.equals(this.organizationPolicyId, that.organizationPolicyId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationPolicyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOrganizationPolicyRequest {\n");
        sb.append("    organizationPolicyId: ").append(toIndentedString(organizationPolicyId)).append("\n");
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
