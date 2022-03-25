package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ExportCertificateAuthorityCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_chain")

    private String certificateChain;

    public ExportCertificateAuthorityCertificateResponse withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /** 证书内容。 > - 通过API请求本接口，证书内容中换行符已使用\"\\r\\n\"代替； > - 通过console端导出证书，将得到标准的PEM格式的证书文件。
     * 
     * @return certificate */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public ExportCertificateAuthorityCertificateResponse withCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    /** 证书链内容，证书链中排列顺序（从上至下）：中间证书>...>根证书。 > - 通过API请求本接口，证书链内容中换行符已使用\"\\r\\n\"代替； > -
     * 通过console端导出证书链，将得到标准的PEM格式的证书链文件。
     * 
     * @return certificateChain */
    public String getCertificateChain() {
        return certificateChain;
    }

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportCertificateAuthorityCertificateResponse exportCertificateAuthorityCertificateResponse =
            (ExportCertificateAuthorityCertificateResponse) o;
        return Objects.equals(this.certificate, exportCertificateAuthorityCertificateResponse.certificate)
            && Objects.equals(this.certificateChain, exportCertificateAuthorityCertificateResponse.certificateChain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificate, certificateChain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportCertificateAuthorityCertificateResponse {\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
