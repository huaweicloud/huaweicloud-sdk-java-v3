package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 多云集群的配置信息
 */
public class MultiCloudClusterConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_expiration_date")

    private Long certificateExpirationDate;

    public MultiCloudClusterConfigInfo withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * apiserver的地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MultiCloudClusterConfigInfo withCertificateExpirationDate(Long certificateExpirationDate) {
        this.certificateExpirationDate = certificateExpirationDate;
        return this;
    }

    /**
     * 证书有效期结束时间
     * minimum: 0
     * maximum: 4071095999000
     * @return certificateExpirationDate
     */
    public Long getCertificateExpirationDate() {
        return certificateExpirationDate;
    }

    public void setCertificateExpirationDate(Long certificateExpirationDate) {
        this.certificateExpirationDate = certificateExpirationDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiCloudClusterConfigInfo that = (MultiCloudClusterConfigInfo) obj;
        return Objects.equals(this.address, that.address)
            && Objects.equals(this.certificateExpirationDate, that.certificateExpirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, certificateExpirationDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiCloudClusterConfigInfo {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    certificateExpirationDate: ").append(toIndentedString(certificateExpirationDate)).append("\n");
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
