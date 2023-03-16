package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOrganizationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private OrganizationDto organization;

    public ShowOrganizationResponse withOrganization(OrganizationDto organization) {
        this.organization = organization;
        return this;
    }

    public ShowOrganizationResponse withOrganization(Consumer<OrganizationDto> organizationSetter) {
        if (this.organization == null) {
            this.organization = new OrganizationDto();
            organizationSetter.accept(this.organization);
        }

        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    public OrganizationDto getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationDto organization) {
        this.organization = organization;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowOrganizationResponse showOrganizationResponse = (ShowOrganizationResponse) o;
        return Objects.equals(this.organization, showOrganizationResponse.organization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOrganizationResponse {\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
