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
public class ListOauth2CredentialProvidersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_providers")

    private List<Oauth2CredentialProviderSummary> credentialProviders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListOauth2CredentialProvidersResponse withCredentialProviders(
        List<Oauth2CredentialProviderSummary> credentialProviders) {
        this.credentialProviders = credentialProviders;
        return this;
    }

    public ListOauth2CredentialProvidersResponse addCredentialProvidersItem(
        Oauth2CredentialProviderSummary credentialProvidersItem) {
        if (this.credentialProviders == null) {
            this.credentialProviders = new ArrayList<>();
        }
        this.credentialProviders.add(credentialProvidersItem);
        return this;
    }

    public ListOauth2CredentialProvidersResponse withCredentialProviders(
        Consumer<List<Oauth2CredentialProviderSummary>> credentialProvidersSetter) {
        if (this.credentialProviders == null) {
            this.credentialProviders = new ArrayList<>();
        }
        credentialProvidersSetter.accept(this.credentialProviders);
        return this;
    }

    /**
     * Get credentialProviders
     * @return credentialProviders
     */
    public List<Oauth2CredentialProviderSummary> getCredentialProviders() {
        return credentialProviders;
    }

    public void setCredentialProviders(List<Oauth2CredentialProviderSummary> credentialProviders) {
        this.credentialProviders = credentialProviders;
    }

    public ListOauth2CredentialProvidersResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListOauth2CredentialProvidersResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOauth2CredentialProvidersResponse that = (ListOauth2CredentialProvidersResponse) obj;
        return Objects.equals(this.credentialProviders, that.credentialProviders)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credentialProviders, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOauth2CredentialProvidersResponse {\n");
        sb.append("    credentialProviders: ").append(toIndentedString(credentialProviders)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
