package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class GetResourceOauth2TokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_token")

    private String accessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_url")

    private String authorizationUrl;

    /**
     * Status of the user's authorization session (determines next steps in OAuth2 flow)
     */
    public static final class SessionStatusEnum {

        /**
         * Enum IN_PROGRESS for value: "IN_PROGRESS"
         */
        public static final SessionStatusEnum IN_PROGRESS = new SessionStatusEnum("IN_PROGRESS");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final SessionStatusEnum FAILED = new SessionStatusEnum("FAILED");

        private static final Map<String, SessionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SessionStatusEnum> createStaticFields() {
            Map<String, SessionStatusEnum> map = new HashMap<>();
            map.put("IN_PROGRESS", IN_PROGRESS);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SessionStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SessionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SessionStatusEnum(value));
        }

        public static SessionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SessionStatusEnum) {
                return this.value.equals(((SessionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_status")

    private SessionStatusEnum sessionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_uri")

    private String sessionUri;

    public GetResourceOauth2TokenResponse withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * OAuth2.0 access token to use (embedded with RAR authorization details claims if rich_authorization_details were requested)
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public GetResourceOauth2TokenResponse withAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
        return this;
    }

    /**
     * URL to initiate authorization (provided when user authorization is required, includes encoded RAR details for user consent)
     * @return authorizationUrl
     */
    public String getAuthorizationUrl() {
        return authorizationUrl;
    }

    public void setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    public GetResourceOauth2TokenResponse withSessionStatus(SessionStatusEnum sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }

    /**
     * Status of the user's authorization session (determines next steps in OAuth2 flow)
     * @return sessionStatus
     */
    public SessionStatusEnum getSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(SessionStatusEnum sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    public GetResourceOauth2TokenResponse withSessionUri(String sessionUri) {
        this.sessionUri = sessionUri;
        return this;
    }

    /**
     * Unique identifier for the user's authentication session (matches request session_uri)
     * @return sessionUri
     */
    public String getSessionUri() {
        return sessionUri;
    }

    public void setSessionUri(String sessionUri) {
        this.sessionUri = sessionUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetResourceOauth2TokenResponse that = (GetResourceOauth2TokenResponse) obj;
        return Objects.equals(this.accessToken, that.accessToken)
            && Objects.equals(this.authorizationUrl, that.authorizationUrl)
            && Objects.equals(this.sessionStatus, that.sessionStatus)
            && Objects.equals(this.sessionUri, that.sessionUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, authorizationUrl, sessionStatus, sessionUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetResourceOauth2TokenResponse {\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    authorizationUrl: ").append(toIndentedString(authorizationUrl)).append("\n");
        sb.append("    sessionStatus: ").append(toIndentedString(sessionStatus)).append("\n");
        sb.append("    sessionUri: ").append(toIndentedString(sessionUri)).append("\n");
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
