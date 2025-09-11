package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddDomainNameRequestBody
 */
public class AddDomainNameRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    private String certificateId;

    public AddDomainNameRequestBody withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名，只能由字母、数字、中划线、星号组成， 星号只能在开头，中划线不能在开头或末 尾，至少包含两个字符串，单个字符串不 超过63个字符，字符串间以点分割，且总 长度不超过100个字符。例如： example.com 或 *.example.com。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public AddDomainNameRequestBody withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * SCM服务的证书ID
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDomainNameRequestBody that = (AddDomainNameRequestBody) obj;
        return Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.certificateId, that.certificateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, certificateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDomainNameRequestBody {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
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
