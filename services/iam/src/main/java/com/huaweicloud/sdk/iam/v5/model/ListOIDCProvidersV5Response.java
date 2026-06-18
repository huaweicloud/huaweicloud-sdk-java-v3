package com.huaweicloud.sdk.iam.v5.model;

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
public class ListOIDCProvidersV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oidc_providers")

    private List<InlineResponse2002OidcProviders> oidcProviders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private InlineResponse200PageInfo pageInfo;

    public ListOIDCProvidersV5Response withOidcProviders(List<InlineResponse2002OidcProviders> oidcProviders) {
        this.oidcProviders = oidcProviders;
        return this;
    }

    public ListOIDCProvidersV5Response addOidcProvidersItem(InlineResponse2002OidcProviders oidcProvidersItem) {
        if (this.oidcProviders == null) {
            this.oidcProviders = new ArrayList<>();
        }
        this.oidcProviders.add(oidcProvidersItem);
        return this;
    }

    public ListOIDCProvidersV5Response withOidcProviders(
        Consumer<List<InlineResponse2002OidcProviders>> oidcProvidersSetter) {
        if (this.oidcProviders == null) {
            this.oidcProviders = new ArrayList<>();
        }
        oidcProvidersSetter.accept(this.oidcProviders);
        return this;
    }

    /**
     * **参数解释**： OIDC 提供商列表。  **取值范围**： 不涉及。
     * @return oidcProviders
     */
    public List<InlineResponse2002OidcProviders> getOidcProviders() {
        return oidcProviders;
    }

    public void setOidcProviders(List<InlineResponse2002OidcProviders> oidcProviders) {
        this.oidcProviders = oidcProviders;
    }

    public ListOIDCProvidersV5Response withPageInfo(InlineResponse200PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListOIDCProvidersV5Response withPageInfo(Consumer<InlineResponse200PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new InlineResponse200PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public InlineResponse200PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(InlineResponse200PageInfo pageInfo) {
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
        ListOIDCProvidersV5Response that = (ListOIDCProvidersV5Response) obj;
        return Objects.equals(this.oidcProviders, that.oidcProviders) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oidcProviders, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOIDCProvidersV5Response {\n");
        sb.append("    oidcProviders: ").append(toIndentedString(oidcProviders)).append("\n");
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
