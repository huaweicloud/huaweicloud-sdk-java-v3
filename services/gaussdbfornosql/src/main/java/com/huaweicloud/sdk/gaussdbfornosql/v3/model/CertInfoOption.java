package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** CCM证书信息。 **取值范围：** 开启ssl，不传此参数，表示使用默认证书。
 */
public class CertInfoOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_id")

    private String certId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_type")

    private String certType;

    public CertInfoOption withCertId(String certId) {
        this.certId = certId;
        return this;
    }

    /**
     * **参数解释：** 证书ID。 **取值范围：** 根据CCM证书列表接口获取证书ID。
     * @return certId
     */
    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public CertInfoOption withCertType(String certType) {
        this.certType = certType;
        return this;
    }

    /**
     * **参数解释：** 证书类型。 **取值范围：**   - PCA：CCM PCA 证书。   - SSL：CCM SSL 证书。
     * @return certType
     */
    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CertInfoOption that = (CertInfoOption) obj;
        return Objects.equals(this.certId, that.certId) && Objects.equals(this.certType, that.certType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certId, certType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertInfoOption {\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
        sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
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
