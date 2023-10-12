package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UrlDomain
 */
public class UrlDomain {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cname_status")

    private Integer cnameStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_id")

    private String sslId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_name")

    private String sslName;

    /**
     * 最小ssl协议版本号。支持TLSv1.1或TLSv1.2
     */
    public static final class MinSslVersionEnum {

        /**
         * Enum TLSV1_1 for value: "TLSv1.1"
         */
        public static final MinSslVersionEnum TLSV1_1 = new MinSslVersionEnum("TLSv1.1");

        /**
         * Enum TLSV1_2 for value: "TLSv1.2"
         */
        public static final MinSslVersionEnum TLSV1_2 = new MinSslVersionEnum("TLSv1.2");

        private static final Map<String, MinSslVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MinSslVersionEnum> createStaticFields() {
            Map<String, MinSslVersionEnum> map = new HashMap<>();
            map.put("TLSv1.1", TLSV1_1);
            map.put("TLSv1.2", TLSV1_2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MinSslVersionEnum(String value) {
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
        public static MinSslVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MinSslVersionEnum(value));
        }

        public static MinSslVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MinSslVersionEnum) {
                return this.value.equals(((MinSslVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ssl_version")

    private MinSslVersionEnum minSslVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_client_certificate_enabled")

    private Boolean verifiedClientCertificateEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_has_trusted_root_ca")

    private Boolean isHasTrustedRootCa;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_infos")

    private List<SslInfo> sslInfos = null;

    public UrlDomain withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 域名编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UrlDomain withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 访问域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public UrlDomain withCnameStatus(Integer cnameStatus) {
        this.cnameStatus = cnameStatus;
        return this;
    }

    /**
     * 域名cname状态： - 1：未解析 - 2：解析中 - 3：解析成功 - 4：解析失败
     * @return cnameStatus
     */
    public Integer getCnameStatus() {
        return cnameStatus;
    }

    public void setCnameStatus(Integer cnameStatus) {
        this.cnameStatus = cnameStatus;
    }

    public UrlDomain withSslId(String sslId) {
        this.sslId = sslId;
        return this;
    }

    /**
     * SSL证书编号
     * @return sslId
     */
    public String getSslId() {
        return sslId;
    }

    public void setSslId(String sslId) {
        this.sslId = sslId;
    }

    public UrlDomain withSslName(String sslName) {
        this.sslName = sslName;
        return this;
    }

    /**
     * SSL证书名称
     * @return sslName
     */
    public String getSslName() {
        return sslName;
    }

    public void setSslName(String sslName) {
        this.sslName = sslName;
    }

    public UrlDomain withMinSslVersion(MinSslVersionEnum minSslVersion) {
        this.minSslVersion = minSslVersion;
        return this;
    }

    /**
     * 最小ssl协议版本号。支持TLSv1.1或TLSv1.2
     * @return minSslVersion
     */
    public MinSslVersionEnum getMinSslVersion() {
        return minSslVersion;
    }

    public void setMinSslVersion(MinSslVersionEnum minSslVersion) {
        this.minSslVersion = minSslVersion;
    }

    public UrlDomain withVerifiedClientCertificateEnabled(Boolean verifiedClientCertificateEnabled) {
        this.verifiedClientCertificateEnabled = verifiedClientCertificateEnabled;
        return this;
    }

    /**
     * 是否开启客户端证书校验。只有绑定证书时，该参数才生效。当绑定证书存在trusted_root_ca时，默认开启；当绑定证书不存在trusted_root_ca时，默认关闭。
     * @return verifiedClientCertificateEnabled
     */
    public Boolean getVerifiedClientCertificateEnabled() {
        return verifiedClientCertificateEnabled;
    }

    public void setVerifiedClientCertificateEnabled(Boolean verifiedClientCertificateEnabled) {
        this.verifiedClientCertificateEnabled = verifiedClientCertificateEnabled;
    }

    public UrlDomain withIsHasTrustedRootCa(Boolean isHasTrustedRootCa) {
        this.isHasTrustedRootCa = isHasTrustedRootCa;
        return this;
    }

    /**
     * 是否存在信任的根证书CA。当绑定证书存在trusted_root_ca时为true。  [暂不支持](tag:hcs;fcs;g42;Site)
     * @return isHasTrustedRootCa
     */
    public Boolean getIsHasTrustedRootCa() {
        return isHasTrustedRootCa;
    }

    public void setIsHasTrustedRootCa(Boolean isHasTrustedRootCa) {
        this.isHasTrustedRootCa = isHasTrustedRootCa;
    }

    public UrlDomain withSslInfos(List<SslInfo> sslInfos) {
        this.sslInfos = sslInfos;
        return this;
    }

    public UrlDomain addSslInfosItem(SslInfo sslInfosItem) {
        if (this.sslInfos == null) {
            this.sslInfos = new ArrayList<>();
        }
        this.sslInfos.add(sslInfosItem);
        return this;
    }

    public UrlDomain withSslInfos(Consumer<List<SslInfo>> sslInfosSetter) {
        if (this.sslInfos == null) {
            this.sslInfos = new ArrayList<>();
        }
        sslInfosSetter.accept(this.sslInfos);
        return this;
    }

    /**
     * SSL证书列表  [暂不支持](tag:hws;hws_hk;fcs;g42;Site)
     * @return sslInfos
     */
    public List<SslInfo> getSslInfos() {
        return sslInfos;
    }

    public void setSslInfos(List<SslInfo> sslInfos) {
        this.sslInfos = sslInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlDomain that = (UrlDomain) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.cnameStatus, that.cnameStatus) && Objects.equals(this.sslId, that.sslId)
            && Objects.equals(this.sslName, that.sslName) && Objects.equals(this.minSslVersion, that.minSslVersion)
            && Objects.equals(this.verifiedClientCertificateEnabled, that.verifiedClientCertificateEnabled)
            && Objects.equals(this.isHasTrustedRootCa, that.isHasTrustedRootCa)
            && Objects.equals(this.sslInfos, that.sslInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domain,
            cnameStatus,
            sslId,
            sslName,
            minSslVersion,
            verifiedClientCertificateEnabled,
            isHasTrustedRootCa,
            sslInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlDomain {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    cnameStatus: ").append(toIndentedString(cnameStatus)).append("\n");
        sb.append("    sslId: ").append(toIndentedString(sslId)).append("\n");
        sb.append("    sslName: ").append(toIndentedString(sslName)).append("\n");
        sb.append("    minSslVersion: ").append(toIndentedString(minSslVersion)).append("\n");
        sb.append("    verifiedClientCertificateEnabled: ")
            .append(toIndentedString(verifiedClientCertificateEnabled))
            .append("\n");
        sb.append("    isHasTrustedRootCa: ").append(toIndentedString(isHasTrustedRootCa)).append("\n");
        sb.append("    sslInfos: ").append(toIndentedString(sslInfos)).append("\n");
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
