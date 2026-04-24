package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OAuth2.0 token or user ID used to generate the workload access token, only one field is required (either user_token or user_id)
 */
public class UserIdentifier {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_token")

    private String userToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    public UserIdentifier withUserToken(String userToken) {
        this.userToken = userToken;
        return this;
    }

    /**
     * OAuth2.0 token for user identification
     * @return userToken
     */
    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public UserIdentifier withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * User ID for identification
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserIdentifier that = (UserIdentifier) obj;
        return Objects.equals(this.userToken, that.userToken) && Objects.equals(this.userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userToken, userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserIdentifier {\n");
        sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
