package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class DownloadBlockchainCertRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockchain_id")

    @JacksonXmlProperty(localName = "blockchain_id")

    private String blockchainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_name")

    @JacksonXmlProperty(localName = "org_name")

    private String orgName;

    /**
     * 下载证书类别
     */
    public static final class CertTypeEnum {

        /**
         * Enum ADMIN for value: "admin"
         */
        public static final CertTypeEnum ADMIN = new CertTypeEnum("admin");

        /**
         * Enum USER for value: "user"
         */
        public static final CertTypeEnum USER = new CertTypeEnum("user");

        /**
         * Enum CA for value: "ca"
         */
        public static final CertTypeEnum CA = new CertTypeEnum("ca");

        private static final Map<String, CertTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CertTypeEnum> createStaticFields() {
            Map<String, CertTypeEnum> map = new HashMap<>();
            map.put("admin", ADMIN);
            map.put("user", USER);
            map.put("ca", CA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CertTypeEnum(String value) {
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
        public static CertTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CertTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CertTypeEnum(value);
            }
            return result;
        }

        public static CertTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CertTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CertTypeEnum) {
                return this.value.equals(((CertTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_type")

    @JacksonXmlProperty(localName = "cert_type")

    private CertTypeEnum certType;

    public DownloadBlockchainCertRequest withBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    /**
     * blockchainID
     * @return blockchainId
     */
    public String getBlockchainId() {
        return blockchainId;
    }

    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    public DownloadBlockchainCertRequest withOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

    /**
     * order或者peer组织名称
     * @return orgName
     */
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public DownloadBlockchainCertRequest withCertType(CertTypeEnum certType) {
        this.certType = certType;
        return this;
    }

    /**
     * 下载证书类别
     * @return certType
     */
    public CertTypeEnum getCertType() {
        return certType;
    }

    public void setCertType(CertTypeEnum certType) {
        this.certType = certType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadBlockchainCertRequest downloadBlockchainCertRequest = (DownloadBlockchainCertRequest) o;
        return Objects.equals(this.blockchainId, downloadBlockchainCertRequest.blockchainId)
            && Objects.equals(this.orgName, downloadBlockchainCertRequest.orgName)
            && Objects.equals(this.certType, downloadBlockchainCertRequest.certType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockchainId, orgName, certType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadBlockchainCertRequest {\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
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
