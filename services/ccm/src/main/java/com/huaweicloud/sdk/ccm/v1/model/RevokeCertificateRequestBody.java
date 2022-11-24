package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RevokeCertificateRequestBody
 */
public class RevokeCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public RevokeCertificateRequestBody withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 吊销理由，支持以下选项：   - **UNSPECIFIED** : 吊销时未指定吊销原因，为默认值；   - **KEY_COMPROMISE** : 证书密钥材料泄露；   - **CERTIFICATE_AUTHORITY_COMPROMISE** : 颁发路径上，可能存在CA密钥材料泄露；   - **AFFILIATION_CHANGED** : 证书中的主体或其他信息已经被改变；   - **SUPERSEDED** : 此证书已被取代；   - **CESSATION_OF_OPERATION** : 此证书或颁发路径中的实体已停止运营；   - **CERTIFICATE_HOLD** : 该证书当前不应被视为有效，预计将来可能会生效；   - **PRIVILEGE_WITHDRAWN** : 此证书不再具备其声明的属性的权限；   - **ATTRIBUTE_AUTHORITY_COMPROMISE** : 担保此证书属性的机构可能已受到损害。 > 当不想填写吊销理由时，请求body体请置为\"{}\"，否则将会报异常，默认值为UNSPECIFIED。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RevokeCertificateRequestBody revokeCertificateRequestBody = (RevokeCertificateRequestBody) o;
        return Objects.equals(this.reason, revokeCertificateRequestBody.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RevokeCertificateRequestBody {\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
