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
public class ListSAMLProvidersV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saml_providers")

    private List<InlineResponse200SamlProviders> samlProviders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private InlineResponse200PageInfo pageInfo;

    public ListSAMLProvidersV5Response withSamlProviders(List<InlineResponse200SamlProviders> samlProviders) {
        this.samlProviders = samlProviders;
        return this;
    }

    public ListSAMLProvidersV5Response addSamlProvidersItem(InlineResponse200SamlProviders samlProvidersItem) {
        if (this.samlProviders == null) {
            this.samlProviders = new ArrayList<>();
        }
        this.samlProviders.add(samlProvidersItem);
        return this;
    }

    public ListSAMLProvidersV5Response withSamlProviders(
        Consumer<List<InlineResponse200SamlProviders>> samlProvidersSetter) {
        if (this.samlProviders == null) {
            this.samlProviders = new ArrayList<>();
        }
        samlProvidersSetter.accept(this.samlProviders);
        return this;
    }

    /**
     * **参数解释**： SAML 提供商。  **取值范围**： 不涉及。
     * @return samlProviders
     */
    public List<InlineResponse200SamlProviders> getSamlProviders() {
        return samlProviders;
    }

    public void setSamlProviders(List<InlineResponse200SamlProviders> samlProviders) {
        this.samlProviders = samlProviders;
    }

    public ListSAMLProvidersV5Response withPageInfo(InlineResponse200PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListSAMLProvidersV5Response withPageInfo(Consumer<InlineResponse200PageInfo> pageInfoSetter) {
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
        ListSAMLProvidersV5Response that = (ListSAMLProvidersV5Response) obj;
        return Objects.equals(this.samlProviders, that.samlProviders) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(samlProviders, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSAMLProvidersV5Response {\n");
        sb.append("    samlProviders: ").append(toIndentedString(samlProviders)).append("\n");
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
