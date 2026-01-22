package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCertificateInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private BigDecimal total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificates_info")

    private List<CertInfoResp> certificatesInfo = null;

    public ShowCertificateInfoResponse withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * 查询结果的总数量
     * minimum: 0
     * maximum: 128
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ShowCertificateInfoResponse withCertificatesInfo(List<CertInfoResp> certificatesInfo) {
        this.certificatesInfo = certificatesInfo;
        return this;
    }

    public ShowCertificateInfoResponse addCertificatesInfoItem(CertInfoResp certificatesInfoItem) {
        if (this.certificatesInfo == null) {
            this.certificatesInfo = new ArrayList<>();
        }
        this.certificatesInfo.add(certificatesInfoItem);
        return this;
    }

    public ShowCertificateInfoResponse withCertificatesInfo(Consumer<List<CertInfoResp>> certificatesInfoSetter) {
        if (this.certificatesInfo == null) {
            this.certificatesInfo = new ArrayList<>();
        }
        certificatesInfoSetter.accept(this.certificatesInfo);
        return this;
    }

    /**
     * 证书信息列表
     * @return certificatesInfo
     */
    public List<CertInfoResp> getCertificatesInfo() {
        return certificatesInfo;
    }

    public void setCertificatesInfo(List<CertInfoResp> certificatesInfo) {
        this.certificatesInfo = certificatesInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCertificateInfoResponse that = (ShowCertificateInfoResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.certificatesInfo, that.certificatesInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, certificatesInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertificateInfoResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    certificatesInfo: ").append(toIndentedString(certificatesInfo)).append("\n");
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
