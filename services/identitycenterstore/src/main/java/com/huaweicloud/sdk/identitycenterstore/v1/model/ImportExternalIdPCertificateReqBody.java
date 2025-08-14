package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ImportExternalIdPCertificateReqBody
 */
public class ImportExternalIdPCertificateReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x509_certificate_in_pem")

    private String x509CertificateInPem;

    /**
     * 身份提供商证书用途，目前仅支持签名
     */
    public static final class CertificateUseEnum {

        /**
         * Enum SIGNING for value: "SIGNING"
         */
        public static final CertificateUseEnum SIGNING = new CertificateUseEnum("SIGNING");

        private static final Map<String, CertificateUseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CertificateUseEnum> createStaticFields() {
            Map<String, CertificateUseEnum> map = new HashMap<>();
            map.put("SIGNING", SIGNING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CertificateUseEnum(String value) {
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
        public static CertificateUseEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CertificateUseEnum(value));
        }

        public static CertificateUseEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CertificateUseEnum) {
                return this.value.equals(((CertificateUseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_use")

    private CertificateUseEnum certificateUse;

    public ImportExternalIdPCertificateReqBody withX509CertificateInPem(String x509CertificateInPem) {
        this.x509CertificateInPem = x509CertificateInPem;
        return this;
    }

    /**
     * PEM格式的身份提供商证书内容
     * @return x509CertificateInPem
     */
    public String getX509CertificateInPem() {
        return x509CertificateInPem;
    }

    public void setX509CertificateInPem(String x509CertificateInPem) {
        this.x509CertificateInPem = x509CertificateInPem;
    }

    public ImportExternalIdPCertificateReqBody withCertificateUse(CertificateUseEnum certificateUse) {
        this.certificateUse = certificateUse;
        return this;
    }

    /**
     * 身份提供商证书用途，目前仅支持签名
     * @return certificateUse
     */
    public CertificateUseEnum getCertificateUse() {
        return certificateUse;
    }

    public void setCertificateUse(CertificateUseEnum certificateUse) {
        this.certificateUse = certificateUse;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportExternalIdPCertificateReqBody that = (ImportExternalIdPCertificateReqBody) obj;
        return Objects.equals(this.x509CertificateInPem, that.x509CertificateInPem)
            && Objects.equals(this.certificateUse, that.certificateUse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x509CertificateInPem, certificateUse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportExternalIdPCertificateReqBody {\n");
        sb.append("    x509CertificateInPem: ").append(toIndentedString(x509CertificateInPem)).append("\n");
        sb.append("    certificateUse: ").append(toIndentedString(certificateUse)).append("\n");
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
