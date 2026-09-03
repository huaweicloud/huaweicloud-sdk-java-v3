package com.huaweicloud.sdk.agentidentity.v1.model;

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
public class ListIdentityProvidersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_providers")

    private List<IdentityProviderListSummary> identityProviders = null;

    public ListIdentityProvidersResponse withIdentityProviders(List<IdentityProviderListSummary> identityProviders) {
        this.identityProviders = identityProviders;
        return this;
    }

    public ListIdentityProvidersResponse addIdentityProvidersItem(IdentityProviderListSummary identityProvidersItem) {
        if (this.identityProviders == null) {
            this.identityProviders = new ArrayList<>();
        }
        this.identityProviders.add(identityProvidersItem);
        return this;
    }

    public ListIdentityProvidersResponse withIdentityProviders(
        Consumer<List<IdentityProviderListSummary>> identityProvidersSetter) {
        if (this.identityProviders == null) {
            this.identityProviders = new ArrayList<>();
        }
        identityProvidersSetter.accept(this.identityProviders);
        return this;
    }

    /**
     * List of identity providers.
     * @return identityProviders
     */
    public List<IdentityProviderListSummary> getIdentityProviders() {
        return identityProviders;
    }

    public void setIdentityProviders(List<IdentityProviderListSummary> identityProviders) {
        this.identityProviders = identityProviders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIdentityProvidersResponse that = (ListIdentityProvidersResponse) obj;
        return Objects.equals(this.identityProviders, that.identityProviders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityProviders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIdentityProvidersResponse {\n");
        sb.append("    identityProviders: ").append(toIndentedString(identityProviders)).append("\n");
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
