package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GetResourceOauth2TokenRequestBody
 */
public class GetResourceOauth2TokenRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_parameters")

    private Map<String, String> customParameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_state")

    private String customState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_authentication")

    private Boolean forceAuthentication;

    /**
     * Type of OAuth2 flow to perform
     */
    public static final class Oauth2FlowEnum {

        /**
         * Enum USER_FEDERATION for value: "USER_FEDERATION"
         */
        public static final Oauth2FlowEnum USER_FEDERATION = new Oauth2FlowEnum("USER_FEDERATION");

        /**
         * Enum M2M for value: "M2M"
         */
        public static final Oauth2FlowEnum M2M = new Oauth2FlowEnum("M2M");

        private static final Map<String, Oauth2FlowEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, Oauth2FlowEnum> createStaticFields() {
            Map<String, Oauth2FlowEnum> map = new HashMap<>();
            map.put("USER_FEDERATION", USER_FEDERATION);
            map.put("M2M", M2M);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        Oauth2FlowEnum(String value) {
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
        public static Oauth2FlowEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Oauth2FlowEnum(value));
        }

        public static Oauth2FlowEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Oauth2FlowEnum) {
                return this.value.equals(((Oauth2FlowEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oauth2_flow")

    private Oauth2FlowEnum oauth2Flow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_credential_provider_name")

    private String resourceCredentialProviderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_oauth2_return_url")

    private String resourceOauth2ReturnUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scopes")

    private List<String> scopes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_uri")

    private String sessionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_access_token")

    private String workloadAccessToken;

    public GetResourceOauth2TokenRequestBody withCustomParameters(Map<String, String> customParameters) {
        this.customParameters = customParameters;
        return this;
    }

    public GetResourceOauth2TokenRequestBody putCustomParametersItem(String key, String customParametersItem) {
        if (this.customParameters == null) {
            this.customParameters = new HashMap<>();
        }
        this.customParameters.put(key, customParametersItem);
        return this;
    }

    public GetResourceOauth2TokenRequestBody withCustomParameters(
        Consumer<Map<String, String>> customParametersSetter) {
        if (this.customParameters == null) {
            this.customParameters = new HashMap<>();
        }
        customParametersSetter.accept(this.customParameters);
        return this;
    }

    /**
     * Additional custom parameters for the authorization request (does not override standard OAuth2 parameters)
     * @return customParameters
     */
    public Map<String, String> getCustomParameters() {
        return customParameters;
    }

    public void setCustomParameters(Map<String, String> customParameters) {
        this.customParameters = customParameters;
    }

    public GetResourceOauth2TokenRequestBody withCustomState(String customState) {
        this.customState = customState;
        return this;
    }

    /**
     * Opaque string for CSRF protection (returned in callback URL response as standard state parameter)
     * @return customState
     */
    public String getCustomState() {
        return customState;
    }

    public void setCustomState(String customState) {
        this.customState = customState;
    }

    public GetResourceOauth2TokenRequestBody withForceAuthentication(Boolean forceAuthentication) {
        this.forceAuthentication = forceAuthentication;
        return this;
    }

    /**
     * Whether to initiate a new 3LO flow regardless of existing sessions
     * @return forceAuthentication
     */
    public Boolean getForceAuthentication() {
        return forceAuthentication;
    }

    public void setForceAuthentication(Boolean forceAuthentication) {
        this.forceAuthentication = forceAuthentication;
    }

    public GetResourceOauth2TokenRequestBody withOauth2Flow(Oauth2FlowEnum oauth2Flow) {
        this.oauth2Flow = oauth2Flow;
        return this;
    }

    /**
     * Type of OAuth2 flow to perform
     * @return oauth2Flow
     */
    public Oauth2FlowEnum getOauth2Flow() {
        return oauth2Flow;
    }

    public void setOauth2Flow(Oauth2FlowEnum oauth2Flow) {
        this.oauth2Flow = oauth2Flow;
    }

    public GetResourceOauth2TokenRequestBody withResourceCredentialProviderName(String resourceCredentialProviderName) {
        this.resourceCredentialProviderName = resourceCredentialProviderName;
        return this;
    }

    /**
     * Name of the resource's credential provider
     * @return resourceCredentialProviderName
     */
    public String getResourceCredentialProviderName() {
        return resourceCredentialProviderName;
    }

    public void setResourceCredentialProviderName(String resourceCredentialProviderName) {
        this.resourceCredentialProviderName = resourceCredentialProviderName;
    }

    public GetResourceOauth2TokenRequestBody withResourceOauth2ReturnUrl(String resourceOauth2ReturnUrl) {
        this.resourceOauth2ReturnUrl = resourceOauth2ReturnUrl;
        return this;
    }

    /**
     * Callback URL to redirect after token retrieval (must be configured for workload identity)
     * @return resourceOauth2ReturnUrl
     */
    public String getResourceOauth2ReturnUrl() {
        return resourceOauth2ReturnUrl;
    }

    public void setResourceOauth2ReturnUrl(String resourceOauth2ReturnUrl) {
        this.resourceOauth2ReturnUrl = resourceOauth2ReturnUrl;
    }

    public GetResourceOauth2TokenRequestBody withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public GetResourceOauth2TokenRequestBody addScopesItem(String scopesItem) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        this.scopes.add(scopesItem);
        return this;
    }

    public GetResourceOauth2TokenRequestBody withScopes(Consumer<List<String>> scopesSetter) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        scopesSetter.accept(this.scopes);
        return this;
    }

    /**
     * OAuth scopes being requested (coarse-grained permissions, supplemented by rich_authorization_details for fine-grained control)
     * @return scopes
     */
    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public GetResourceOauth2TokenRequestBody withSessionUri(String sessionUri) {
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

    public GetResourceOauth2TokenRequestBody withWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }

    /**
     * Identity token of the workload requesting the OAuth2 token
     * @return workloadAccessToken
     */
    public String getWorkloadAccessToken() {
        return workloadAccessToken;
    }

    public void setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetResourceOauth2TokenRequestBody that = (GetResourceOauth2TokenRequestBody) obj;
        return Objects.equals(this.customParameters, that.customParameters)
            && Objects.equals(this.customState, that.customState)
            && Objects.equals(this.forceAuthentication, that.forceAuthentication)
            && Objects.equals(this.oauth2Flow, that.oauth2Flow)
            && Objects.equals(this.resourceCredentialProviderName, that.resourceCredentialProviderName)
            && Objects.equals(this.resourceOauth2ReturnUrl, that.resourceOauth2ReturnUrl)
            && Objects.equals(this.scopes, that.scopes) && Objects.equals(this.sessionUri, that.sessionUri)
            && Objects.equals(this.workloadAccessToken, that.workloadAccessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customParameters,
            customState,
            forceAuthentication,
            oauth2Flow,
            resourceCredentialProviderName,
            resourceOauth2ReturnUrl,
            scopes,
            sessionUri,
            workloadAccessToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetResourceOauth2TokenRequestBody {\n");
        sb.append("    customParameters: ").append(toIndentedString(customParameters)).append("\n");
        sb.append("    customState: ").append(toIndentedString(customState)).append("\n");
        sb.append("    forceAuthentication: ").append(toIndentedString(forceAuthentication)).append("\n");
        sb.append("    oauth2Flow: ").append(toIndentedString(oauth2Flow)).append("\n");
        sb.append("    resourceCredentialProviderName: ")
            .append(toIndentedString(resourceCredentialProviderName))
            .append("\n");
        sb.append("    resourceOauth2ReturnUrl: ").append(toIndentedString(resourceOauth2ReturnUrl)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
        sb.append("    sessionUri: ").append(toIndentedString(sessionUri)).append("\n");
        sb.append("    workloadAccessToken: ").append(toIndentedString(workloadAccessToken)).append("\n");
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
