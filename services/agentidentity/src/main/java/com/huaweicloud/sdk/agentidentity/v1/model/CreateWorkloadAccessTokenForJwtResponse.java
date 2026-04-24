package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateWorkloadAccessTokenForJwtResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_access_token")

    private String workloadAccessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration")

    private OffsetDateTime expiration;

    public CreateWorkloadAccessTokenForJwtResponse withWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }

    /**
     * An opaque token representing the identity of both the workload and the user (or just the workload if not acting on behalf of a user)
     * @return workloadAccessToken
     */
    public String getWorkloadAccessToken() {
        return workloadAccessToken;
    }

    public void setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
    }

    public CreateWorkloadAccessTokenForJwtResponse withExpiration(OffsetDateTime expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * The date and time on which the workload access token expire.
     * @return expiration
     */
    public OffsetDateTime getExpiration() {
        return expiration;
    }

    public void setExpiration(OffsetDateTime expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWorkloadAccessTokenForJwtResponse that = (CreateWorkloadAccessTokenForJwtResponse) obj;
        return Objects.equals(this.workloadAccessToken, that.workloadAccessToken)
            && Objects.equals(this.expiration, that.expiration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadAccessToken, expiration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkloadAccessTokenForJwtResponse {\n");
        sb.append("    workloadAccessToken: ").append(toIndentedString(workloadAccessToken)).append("\n");
        sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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
