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
public class ListApplicationInstanceCertificatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_instance_certificates")

    private List<CertificateDto> applicationInstanceCertificates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListApplicationInstanceCertificatesResponse withApplicationInstanceCertificates(
        List<CertificateDto> applicationInstanceCertificates) {
        this.applicationInstanceCertificates = applicationInstanceCertificates;
        return this;
    }

    public ListApplicationInstanceCertificatesResponse addApplicationInstanceCertificatesItem(
        CertificateDto applicationInstanceCertificatesItem) {
        if (this.applicationInstanceCertificates == null) {
            this.applicationInstanceCertificates = new ArrayList<>();
        }
        this.applicationInstanceCertificates.add(applicationInstanceCertificatesItem);
        return this;
    }

    public ListApplicationInstanceCertificatesResponse withApplicationInstanceCertificates(
        Consumer<List<CertificateDto>> applicationInstanceCertificatesSetter) {
        if (this.applicationInstanceCertificates == null) {
            this.applicationInstanceCertificates = new ArrayList<>();
        }
        applicationInstanceCertificatesSetter.accept(this.applicationInstanceCertificates);
        return this;
    }

    /**
     * 应用程序证书列表
     * @return applicationInstanceCertificates
     */
    public List<CertificateDto> getApplicationInstanceCertificates() {
        return applicationInstanceCertificates;
    }

    public void setApplicationInstanceCertificates(List<CertificateDto> applicationInstanceCertificates) {
        this.applicationInstanceCertificates = applicationInstanceCertificates;
    }

    public ListApplicationInstanceCertificatesResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListApplicationInstanceCertificatesResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
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
        ListApplicationInstanceCertificatesResponse that = (ListApplicationInstanceCertificatesResponse) obj;
        return Objects.equals(this.applicationInstanceCertificates, that.applicationInstanceCertificates)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationInstanceCertificates, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationInstanceCertificatesResponse {\n");
        sb.append("    applicationInstanceCertificates: ")
            .append(toIndentedString(applicationInstanceCertificates))
            .append("\n");
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
