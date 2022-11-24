package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class KeystoneListIdentityProvidersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_providers")

    private List<IdentityprovidersResult> identityProviders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private Links links;

    public KeystoneListIdentityProvidersResponse withIdentityProviders(
        List<IdentityprovidersResult> identityProviders) {
        this.identityProviders = identityProviders;
        return this;
    }

    public KeystoneListIdentityProvidersResponse addIdentityProvidersItem(
        IdentityprovidersResult identityProvidersItem) {
        if (this.identityProviders == null) {
            this.identityProviders = new ArrayList<>();
        }
        this.identityProviders.add(identityProvidersItem);
        return this;
    }

    public KeystoneListIdentityProvidersResponse withIdentityProviders(
        Consumer<List<IdentityprovidersResult>> identityProvidersSetter) {
        if (this.identityProviders == null) {
            this.identityProviders = new ArrayList<>();
        }
        identityProvidersSetter.accept(this.identityProviders);
        return this;
    }

    /**
     * 身份提供商信息列表。
     * @return identityProviders
     */
    public List<IdentityprovidersResult> getIdentityProviders() {
        return identityProviders;
    }

    public void setIdentityProviders(List<IdentityprovidersResult> identityProviders) {
        this.identityProviders = identityProviders;
    }

    public KeystoneListIdentityProvidersResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneListIdentityProvidersResponse withLinks(Consumer<Links> linksSetter) {
        if (this.links == null) {
            this.links = new Links();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListIdentityProvidersResponse keystoneListIdentityProvidersResponse =
            (KeystoneListIdentityProvidersResponse) o;
        return Objects.equals(this.identityProviders, keystoneListIdentityProvidersResponse.identityProviders)
            && Objects.equals(this.links, keystoneListIdentityProvidersResponse.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityProviders, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListIdentityProvidersResponse {\n");
        sb.append("    identityProviders: ").append(toIndentedString(identityProviders)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
