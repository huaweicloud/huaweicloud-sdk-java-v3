package com.huaweicloud.sdk.identitycenterportalapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetAgencyCredentialsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_credentials")

    private AgencyCredentials agencyCredentials;

    public GetAgencyCredentialsResponse withAgencyCredentials(AgencyCredentials agencyCredentials) {
        this.agencyCredentials = agencyCredentials;
        return this;
    }

    public GetAgencyCredentialsResponse withAgencyCredentials(Consumer<AgencyCredentials> agencyCredentialsSetter) {
        if (this.agencyCredentials == null) {
            this.agencyCredentials = new AgencyCredentials();
            agencyCredentialsSetter.accept(this.agencyCredentials);
        }

        return this;
    }

    /**
     * Get agencyCredentials
     * @return agencyCredentials
     */
    public AgencyCredentials getAgencyCredentials() {
        return agencyCredentials;
    }

    public void setAgencyCredentials(AgencyCredentials agencyCredentials) {
        this.agencyCredentials = agencyCredentials;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetAgencyCredentialsResponse that = (GetAgencyCredentialsResponse) obj;
        return Objects.equals(this.agencyCredentials, that.agencyCredentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyCredentials);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAgencyCredentialsResponse {\n");
        sb.append("    agencyCredentials: ").append(toIndentedString(agencyCredentials)).append("\n");
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
