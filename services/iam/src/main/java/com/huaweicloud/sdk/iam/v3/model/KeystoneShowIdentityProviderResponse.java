package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class KeystoneShowIdentityProviderResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_provider")

    @JacksonXmlProperty(localName = "identity_provider")

    private IdentityprovidersResult identityProvider;

    public KeystoneShowIdentityProviderResponse withIdentityProvider(IdentityprovidersResult identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }

    public KeystoneShowIdentityProviderResponse withIdentityProvider(
        Consumer<IdentityprovidersResult> identityProviderSetter) {
        if (this.identityProvider == null) {
            this.identityProvider = new IdentityprovidersResult();
            identityProviderSetter.accept(this.identityProvider);
        }

        return this;
    }

    /**
     * Get identityProvider
     * @return identityProvider
     */
    public IdentityprovidersResult getIdentityProvider() {
        return identityProvider;
    }

    public void setIdentityProvider(IdentityprovidersResult identityProvider) {
        this.identityProvider = identityProvider;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowIdentityProviderResponse keystoneShowIdentityProviderResponse =
            (KeystoneShowIdentityProviderResponse) o;
        return Objects.equals(this.identityProvider, keystoneShowIdentityProviderResponse.identityProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityProvider);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowIdentityProviderResponse {\n");
        sb.append("    identityProvider: ").append(toIndentedString(identityProvider)).append("\n");
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
