package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 凭证提供者配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreGatewayCredentialProvider {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key_credential_provider")

    private CoreGatewayApiKeyCredentialProvider apiKeyCredentialProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oauth_credential_provider")

    private CoreGatewayOAuthCredentialProvider oauthCredentialProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_credential_provider")

    private CoreGatewayIamCredentialProvider iamCredentialProvider;

    public CoreGatewayCredentialProvider withApiKeyCredentialProvider(
        CoreGatewayApiKeyCredentialProvider apiKeyCredentialProvider) {
        this.apiKeyCredentialProvider = apiKeyCredentialProvider;
        return this;
    }

    public CoreGatewayCredentialProvider withApiKeyCredentialProvider(
        Consumer<CoreGatewayApiKeyCredentialProvider> apiKeyCredentialProviderSetter) {
        if (this.apiKeyCredentialProvider == null) {
            this.apiKeyCredentialProvider = new CoreGatewayApiKeyCredentialProvider();
            apiKeyCredentialProviderSetter.accept(this.apiKeyCredentialProvider);
        }

        return this;
    }

    /**
     * Get apiKeyCredentialProvider
     * @return apiKeyCredentialProvider
     */
    public CoreGatewayApiKeyCredentialProvider getApiKeyCredentialProvider() {
        return apiKeyCredentialProvider;
    }

    public void setApiKeyCredentialProvider(CoreGatewayApiKeyCredentialProvider apiKeyCredentialProvider) {
        this.apiKeyCredentialProvider = apiKeyCredentialProvider;
    }

    public CoreGatewayCredentialProvider withOauthCredentialProvider(
        CoreGatewayOAuthCredentialProvider oauthCredentialProvider) {
        this.oauthCredentialProvider = oauthCredentialProvider;
        return this;
    }

    public CoreGatewayCredentialProvider withOauthCredentialProvider(
        Consumer<CoreGatewayOAuthCredentialProvider> oauthCredentialProviderSetter) {
        if (this.oauthCredentialProvider == null) {
            this.oauthCredentialProvider = new CoreGatewayOAuthCredentialProvider();
            oauthCredentialProviderSetter.accept(this.oauthCredentialProvider);
        }

        return this;
    }

    /**
     * Get oauthCredentialProvider
     * @return oauthCredentialProvider
     */
    public CoreGatewayOAuthCredentialProvider getOauthCredentialProvider() {
        return oauthCredentialProvider;
    }

    public void setOauthCredentialProvider(CoreGatewayOAuthCredentialProvider oauthCredentialProvider) {
        this.oauthCredentialProvider = oauthCredentialProvider;
    }

    public CoreGatewayCredentialProvider withIamCredentialProvider(
        CoreGatewayIamCredentialProvider iamCredentialProvider) {
        this.iamCredentialProvider = iamCredentialProvider;
        return this;
    }

    public CoreGatewayCredentialProvider withIamCredentialProvider(
        Consumer<CoreGatewayIamCredentialProvider> iamCredentialProviderSetter) {
        if (this.iamCredentialProvider == null) {
            this.iamCredentialProvider = new CoreGatewayIamCredentialProvider();
            iamCredentialProviderSetter.accept(this.iamCredentialProvider);
        }

        return this;
    }

    /**
     * Get iamCredentialProvider
     * @return iamCredentialProvider
     */
    public CoreGatewayIamCredentialProvider getIamCredentialProvider() {
        return iamCredentialProvider;
    }

    public void setIamCredentialProvider(CoreGatewayIamCredentialProvider iamCredentialProvider) {
        this.iamCredentialProvider = iamCredentialProvider;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayCredentialProvider that = (CoreGatewayCredentialProvider) obj;
        return Objects.equals(this.apiKeyCredentialProvider, that.apiKeyCredentialProvider)
            && Objects.equals(this.oauthCredentialProvider, that.oauthCredentialProvider)
            && Objects.equals(this.iamCredentialProvider, that.iamCredentialProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiKeyCredentialProvider, oauthCredentialProvider, iamCredentialProvider);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayCredentialProvider {\n");
        sb.append("    apiKeyCredentialProvider: ").append(toIndentedString(apiKeyCredentialProvider)).append("\n");
        sb.append("    oauthCredentialProvider: ").append(toIndentedString(oauthCredentialProvider)).append("\n");
        sb.append("    iamCredentialProvider: ").append(toIndentedString(iamCredentialProvider)).append("\n");
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
