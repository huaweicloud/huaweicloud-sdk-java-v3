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
public class ListStsCredentialProvidersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_providers")

    private List<StsCredentialProviderSummary> credentialProviders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListStsCredentialProvidersResponse withCredentialProviders(
        List<StsCredentialProviderSummary> credentialProviders) {
        this.credentialProviders = credentialProviders;
        return this;
    }

    public ListStsCredentialProvidersResponse addCredentialProvidersItem(
        StsCredentialProviderSummary credentialProvidersItem) {
        if (this.credentialProviders == null) {
            this.credentialProviders = new ArrayList<>();
        }
        this.credentialProviders.add(credentialProvidersItem);
        return this;
    }

    public ListStsCredentialProvidersResponse withCredentialProviders(
        Consumer<List<StsCredentialProviderSummary>> credentialProvidersSetter) {
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
    public List<StsCredentialProviderSummary> getCredentialProviders() {
        return credentialProviders;
    }

    public void setCredentialProviders(List<StsCredentialProviderSummary> credentialProviders) {
        this.credentialProviders = credentialProviders;
    }

    public ListStsCredentialProvidersResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListStsCredentialProvidersResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListStsCredentialProvidersResponse that = (ListStsCredentialProvidersResponse) obj;
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
        sb.append("class ListStsCredentialProvidersResponse {\n");
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
