package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateWorkloadAccessTokenForJwtRequestBody
 */
public class CreateWorkloadAccessTokenForJwtRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_name")

    private String workloadName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_token")

    private String userToken;

    public CreateWorkloadAccessTokenForJwtRequestBody withWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }

    /**
     * The unique identifier for the registered workload
     * @return workloadName
     */
    public String getWorkloadName() {
        return workloadName;
    }

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    public CreateWorkloadAccessTokenForJwtRequestBody withUserToken(String userToken) {
        this.userToken = userToken;
        return this;
    }

    /**
     * The OAuth 2.0 token issued by the user's identity provider
     * @return userToken
     */
    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWorkloadAccessTokenForJwtRequestBody that = (CreateWorkloadAccessTokenForJwtRequestBody) obj;
        return Objects.equals(this.workloadName, that.workloadName) && Objects.equals(this.userToken, that.userToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadName, userToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkloadAccessTokenForJwtRequestBody {\n");
        sb.append("    workloadName: ").append(toIndentedString(workloadName)).append("\n");
        sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
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
