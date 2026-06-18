package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateOIDCProviderV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oidc_provider")

    private InlineResponse2011OidcProvider oidcProvider;

    public CreateOIDCProviderV5Response withOidcProvider(InlineResponse2011OidcProvider oidcProvider) {
        this.oidcProvider = oidcProvider;
        return this;
    }

    public CreateOIDCProviderV5Response withOidcProvider(Consumer<InlineResponse2011OidcProvider> oidcProviderSetter) {
        if (this.oidcProvider == null) {
            this.oidcProvider = new InlineResponse2011OidcProvider();
            oidcProviderSetter.accept(this.oidcProvider);
        }

        return this;
    }

    /**
     * Get oidcProvider
     * @return oidcProvider
     */
    public InlineResponse2011OidcProvider getOidcProvider() {
        return oidcProvider;
    }

    public void setOidcProvider(InlineResponse2011OidcProvider oidcProvider) {
        this.oidcProvider = oidcProvider;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOIDCProviderV5Response that = (CreateOIDCProviderV5Response) obj;
        return Objects.equals(this.oidcProvider, that.oidcProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oidcProvider);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOIDCProviderV5Response {\n");
        sb.append("    oidcProvider: ").append(toIndentedString(oidcProvider)).append("\n");
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
