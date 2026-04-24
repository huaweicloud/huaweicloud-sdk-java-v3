package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CompleteResourceTokenAuthRequestBody
 */
public class CompleteResourceTokenAuthRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_uri")

    private String sessionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_identifier")

    private UserIdentifier userIdentifier;

    public CompleteResourceTokenAuthRequestBody withSessionUri(String sessionUri) {
        this.sessionUri = sessionUri;
        return this;
    }

    /**
     * Unique identifier for the user's authentication session (tracks OAuth2 flow state)
     * @return sessionUri
     */
    public String getSessionUri() {
        return sessionUri;
    }

    public void setSessionUri(String sessionUri) {
        this.sessionUri = sessionUri;
    }

    public CompleteResourceTokenAuthRequestBody withUserIdentifier(UserIdentifier userIdentifier) {
        this.userIdentifier = userIdentifier;
        return this;
    }

    public CompleteResourceTokenAuthRequestBody withUserIdentifier(Consumer<UserIdentifier> userIdentifierSetter) {
        if (this.userIdentifier == null) {
            this.userIdentifier = new UserIdentifier();
            userIdentifierSetter.accept(this.userIdentifier);
        }

        return this;
    }

    /**
     * Get userIdentifier
     * @return userIdentifier
     */
    public UserIdentifier getUserIdentifier() {
        return userIdentifier;
    }

    public void setUserIdentifier(UserIdentifier userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompleteResourceTokenAuthRequestBody that = (CompleteResourceTokenAuthRequestBody) obj;
        return Objects.equals(this.sessionUri, that.sessionUri)
            && Objects.equals(this.userIdentifier, that.userIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionUri, userIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompleteResourceTokenAuthRequestBody {\n");
        sb.append("    sessionUri: ").append(toIndentedString(sessionUri)).append("\n");
        sb.append("    userIdentifier: ").append(toIndentedString(userIdentifier)).append("\n");
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
