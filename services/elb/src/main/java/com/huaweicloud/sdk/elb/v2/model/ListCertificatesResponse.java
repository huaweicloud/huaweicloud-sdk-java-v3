package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.CertificateV2Resp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCertificatesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificates")
    
    private CertificateV2Resp certificates = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_num")
    
    private Integer instanceNum;

    public ListCertificatesResponse withCertificates(CertificateV2Resp certificates) {
        this.certificates = certificates;
        return this;
    }

    public ListCertificatesResponse withCertificates(Consumer<CertificateV2Resp> certificatesSetter) {
        if(this.certificates == null ){
            this.certificates = new CertificateV2Resp();
            certificatesSetter.accept(this.certificates);
        }
        
        return this;
    }


    /**
     * Get certificates
     * @return certificates
     */
    public CertificateV2Resp getCertificates() {
        return certificates;
    }

    public void setCertificates(CertificateV2Resp certificates) {
        this.certificates = certificates;
    }

    public ListCertificatesResponse withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    


    /**
     * 证书的个数
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
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
            Objects.equals(this.instanceNum, listCertificatesResponse.instanceNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(certificates, instanceNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificatesResponse {\n");
        sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
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

