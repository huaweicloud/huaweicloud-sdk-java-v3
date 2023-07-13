package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 域名绑定和解绑证书的请求体
 */
public class AttachOrDetachCertsReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_ids")

    private List<String> certificateIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_client_certificate_enabled")

    private Boolean verifiedClientCertificateEnabled;

    public AttachOrDetachCertsReqBody withCertificateIds(List<String> certificateIds) {
        this.certificateIds = certificateIds;
        return this;
    }

    public AttachOrDetachCertsReqBody addCertificateIdsItem(String certificateIdsItem) {
        if (this.certificateIds == null) {
            this.certificateIds = new ArrayList<>();
        }
        this.certificateIds.add(certificateIdsItem);
        return this;
    }

    public AttachOrDetachCertsReqBody withCertificateIds(Consumer<List<String>> certificateIdsSetter) {
        if (this.certificateIds == null) {
            this.certificateIds = new ArrayList<>();
        }
        certificateIdsSetter.accept(this.certificateIds);
        return this;
    }

    /**
     * 证书的id集合
     * @return certificateIds
     */
    public List<String> getCertificateIds() {
        return certificateIds;
    }

    public void setCertificateIds(List<String> certificateIds) {
        this.certificateIds = certificateIds;
    }

    public AttachOrDetachCertsReqBody withVerifiedClientCertificateEnabled(Boolean verifiedClientCertificateEnabled) {
        this.verifiedClientCertificateEnabled = verifiedClientCertificateEnabled;
        return this;
    }

    /**
     * 是否开启客户端证书校验。当绑定证书存在trusted_root_ca时，默认开启；当绑定证书不存在trusted_root_ca时，默认关闭。
     * @return verifiedClientCertificateEnabled
     */
    public Boolean getVerifiedClientCertificateEnabled() {
        return verifiedClientCertificateEnabled;
    }

    public void setVerifiedClientCertificateEnabled(Boolean verifiedClientCertificateEnabled) {
        this.verifiedClientCertificateEnabled = verifiedClientCertificateEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachOrDetachCertsReqBody that = (AttachOrDetachCertsReqBody) obj;
        return Objects.equals(this.certificateIds, that.certificateIds)
            && Objects.equals(this.verifiedClientCertificateEnabled, that.verifiedClientCertificateEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateIds, verifiedClientCertificateEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachOrDetachCertsReqBody {\n");
        sb.append("    certificateIds: ").append(toIndentedString(certificateIds)).append("\n");
        sb.append("    verifiedClientCertificateEnabled: ")
            .append(toIndentedString(verifiedClientCertificateEnabled))
            .append("\n");
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
