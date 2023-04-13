package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DomainHttpsCertInfo
 */
public class DomainHttpsCertInfo {

    /**
     * 证书格式，默认为PEM，当前只支持PEM格式
     */
    public static final class CertificateFormatEnum {

        /**
         * Enum PEM for value: "PEM"
         */
        public static final CertificateFormatEnum PEM = new CertificateFormatEnum("PEM");

        private static final Map<String, CertificateFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CertificateFormatEnum> createStaticFields() {
            Map<String, CertificateFormatEnum> map = new HashMap<>();
            map.put("PEM", PEM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CertificateFormatEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CertificateFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CertificateFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CertificateFormatEnum(value);
            }
            return result;
        }

        public static CertificateFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CertificateFormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CertificateFormatEnum) {
                return this.value.equals(((CertificateFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_format")

    private CertificateFormatEnum certificateFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_key")

    private String certificateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_redirect")

    private Boolean forceRedirect;

    public DomainHttpsCertInfo withCertificateFormat(CertificateFormatEnum certificateFormat) {
        this.certificateFormat = certificateFormat;
        return this;
    }

    /**
     * 证书格式，默认为PEM，当前只支持PEM格式
     * @return certificateFormat
     */
    public CertificateFormatEnum getCertificateFormat() {
        return certificateFormat;
    }

    public void setCertificateFormat(CertificateFormatEnum certificateFormat) {
        this.certificateFormat = certificateFormat;
    }

    public DomainHttpsCertInfo withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 证书内容
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public DomainHttpsCertInfo withCertificateKey(String certificateKey) {
        this.certificateKey = certificateKey;
        return this;
    }

    /**
     * 私钥内容
     * @return certificateKey
     */
    public String getCertificateKey() {
        return certificateKey;
    }

    public void setCertificateKey(String certificateKey) {
        this.certificateKey = certificateKey;
    }

    public DomainHttpsCertInfo withForceRedirect(Boolean forceRedirect) {
        this.forceRedirect = forceRedirect;
        return this;
    }

    /**
     * 是否开启重定向，默认false
     * @return forceRedirect
     */
    public Boolean getForceRedirect() {
        return forceRedirect;
    }

    public void setForceRedirect(Boolean forceRedirect) {
        this.forceRedirect = forceRedirect;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainHttpsCertInfo domainHttpsCertInfo = (DomainHttpsCertInfo) o;
        return Objects.equals(this.certificateFormat, domainHttpsCertInfo.certificateFormat)
            && Objects.equals(this.certificate, domainHttpsCertInfo.certificate)
            && Objects.equals(this.certificateKey, domainHttpsCertInfo.certificateKey)
            && Objects.equals(this.forceRedirect, domainHttpsCertInfo.forceRedirect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateFormat, certificate, certificateKey, forceRedirect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainHttpsCertInfo {\n");
        sb.append("    certificateFormat: ").append(toIndentedString(certificateFormat)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    certificateKey: ").append(toIndentedString(certificateKey)).append("\n");
        sb.append("    forceRedirect: ").append(toIndentedString(forceRedirect)).append("\n");
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
