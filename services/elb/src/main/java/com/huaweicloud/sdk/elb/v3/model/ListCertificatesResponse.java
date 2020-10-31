package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.CertificateInfo;
import com.huaweicloud.sdk.elb.v3.model.PageInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCertificatesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    
    private PageInfo pageInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificates")
    
    private List<CertificateInfo> certificates = null;
    
    public ListCertificatesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID。  注：自动生成 。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListCertificatesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCertificatesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if(this.pageInfo == null ){
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

    public ListCertificatesResponse withCertificates(List<CertificateInfo> certificates) {
        this.certificates = certificates;
        return this;
    }

    
    public ListCertificatesResponse addCertificatesItem(CertificateInfo certificatesItem) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        this.certificates.add(certificatesItem);
        return this;
    }

    public ListCertificatesResponse withCertificates(Consumer<List<CertificateInfo>> certificatesSetter) {
        if(this.certificates == null ){
            this.certificates = new ArrayList<>();
        }
        certificatesSetter.accept(this.certificates);
        return this;
    }

    /**
     * 证书对象列表。
     * @return certificates
     */
    public List<CertificateInfo> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<CertificateInfo> certificates) {
        this.certificates = certificates;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCertificatesResponse listCertificatesResponse = (ListCertificatesResponse) o;
        return Objects.equals(this.requestId, listCertificatesResponse.requestId) &&
            Objects.equals(this.pageInfo, listCertificatesResponse.pageInfo) &&
            Objects.equals(this.certificates, listCertificatesResponse.certificates);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, certificates);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificatesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
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

