package com.huaweicloud.sdk.identitycenter.v1.model;

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
public class ListApplicationProvidersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_providers")

    private List<ApplicationProviderDto> applicationProviders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListApplicationProvidersResponse withApplicationProviders(
        List<ApplicationProviderDto> applicationProviders) {
        this.applicationProviders = applicationProviders;
        return this;
    }

    public ListApplicationProvidersResponse addApplicationProvidersItem(
        ApplicationProviderDto applicationProvidersItem) {
        if (this.applicationProviders == null) {
            this.applicationProviders = new ArrayList<>();
        }
        this.applicationProviders.add(applicationProvidersItem);
        return this;
    }

    public ListApplicationProvidersResponse withApplicationProviders(
        Consumer<List<ApplicationProviderDto>> applicationProvidersSetter) {
        if (this.applicationProviders == null) {
            this.applicationProviders = new ArrayList<>();
        }
        applicationProvidersSetter.accept(this.applicationProviders);
        return this;
    }

    /**
     * 应用程序提供商列表
     * @return applicationProviders
     */
    public List<ApplicationProviderDto> getApplicationProviders() {
        return applicationProviders;
    }

    public void setApplicationProviders(List<ApplicationProviderDto> applicationProviders) {
        this.applicationProviders = applicationProviders;
    }

    public ListApplicationProvidersResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListApplicationProvidersResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
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
        ListApplicationProvidersResponse that = (ListApplicationProvidersResponse) obj;
        return Objects.equals(this.applicationProviders, that.applicationProviders)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationProviders, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationProvidersResponse {\n");
        sb.append("    applicationProviders: ").append(toIndentedString(applicationProviders)).append("\n");
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
