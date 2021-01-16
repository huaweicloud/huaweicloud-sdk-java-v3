package com.huaweicloud.sdk.scm.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.scm.v3.model.CertificateDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCertificatesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificates")
    
    private List<CertificateDetail> certificates = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListCertificatesResponse withCertificates(List<CertificateDetail> certificates) {
        this.certificates = certificates;
        return this;
    }

    
    public ListCertificatesResponse addCertificatesItem(CertificateDetail certificatesItem) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        this.certificates.add(certificatesItem);
        return this;
    }

    public ListCertificatesResponse withCertificates(Consumer<List<CertificateDetail>> certificatesSetter) {
        if(this.certificates == null ){
            this.certificates = new ArrayList<>();
        }
        certificatesSetter.accept(this.certificates);
        return this;
    }

    /**
     * 证书列表，详情请参见CertificateDetail字段数据结构说明。
     * @return certificates
     */
    public List<CertificateDetail> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<CertificateDetail> certificates) {
        this.certificates = certificates;
    }

    public ListCertificatesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 证书数量。
     * minimum: 0
     * maximum: 10000
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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
        return Objects.equals(this.certificates, listCertificatesResponse.certificates) &&
            Objects.equals(this.totalCount, listCertificatesResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(certificates, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificatesResponse {\n");
        sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

