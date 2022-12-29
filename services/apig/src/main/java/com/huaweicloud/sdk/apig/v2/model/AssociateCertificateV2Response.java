package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class AssociateCertificateV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_domain")

    private String urlDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * CNAME解析状态 - 1: 未解析 - 2: 解析中 - 3: 解析成功 - 4: 解析失败
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final StatusEnum NUMBER_2 = new StatusEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final StatusEnum NUMBER_3 = new StatusEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final StatusEnum NUMBER_4 = new StatusEnum(4);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ssl_version")

    private String minSslVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_http_redirect_to_https")

    private Boolean isHttpRedirectToHttps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_client_certificate_enabled")

    private Boolean verifiedClientCertificateEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_name")

    private String sslName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_id")

    private String sslId;

    public AssociateCertificateV2Response withUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
        return this;
    }

    /**
     * 自定义域名
     * @return urlDomain
     */
    public String getUrlDomain() {
        return urlDomain;
    }

    public void setUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
    }

    public AssociateCertificateV2Response withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自定义域名的编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AssociateCertificateV2Response withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * CNAME解析状态 - 1: 未解析 - 2: 解析中 - 3: 解析成功 - 4: 解析失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AssociateCertificateV2Response withMinSslVersion(String minSslVersion) {
        this.minSslVersion = minSslVersion;
        return this;
    }

    /**
     * 支持的最小SSL版本
     * @return minSslVersion
     */
    public String getMinSslVersion() {
        return minSslVersion;
    }

    public void setMinSslVersion(String minSslVersion) {
        this.minSslVersion = minSslVersion;
    }

    public AssociateCertificateV2Response withIsHttpRedirectToHttps(Boolean isHttpRedirectToHttps) {
        this.isHttpRedirectToHttps = isHttpRedirectToHttps;
        return this;
    }

    /**
     * 是否开启http到https的重定向，false为关闭，true为开启，默认为false
     * @return isHttpRedirectToHttps
     */
    public Boolean getIsHttpRedirectToHttps() {
        return isHttpRedirectToHttps;
    }

    public void setIsHttpRedirectToHttps(Boolean isHttpRedirectToHttps) {
        this.isHttpRedirectToHttps = isHttpRedirectToHttps;
    }

    public AssociateCertificateV2Response withVerifiedClientCertificateEnabled(
        Boolean verifiedClientCertificateEnabled) {
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

    public AssociateCertificateV2Response withSslName(String sslName) {
        this.sslName = sslName;
        return this;
    }

    /**
     * 证书的名称
     * @return sslName
     */
    public String getSslName() {
        return sslName;
    }

    public void setSslName(String sslName) {
        this.sslName = sslName;
    }

    public AssociateCertificateV2Response withSslId(String sslId) {
        this.sslId = sslId;
        return this;
    }

    /**
     * 证书的编号
     * @return sslId
     */
    public String getSslId() {
        return sslId;
    }

    public void setSslId(String sslId) {
        this.sslId = sslId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateCertificateV2Response associateCertificateV2Response = (AssociateCertificateV2Response) o;
        return Objects.equals(this.urlDomain, associateCertificateV2Response.urlDomain)
            && Objects.equals(this.id, associateCertificateV2Response.id)
            && Objects.equals(this.status, associateCertificateV2Response.status)
            && Objects.equals(this.minSslVersion, associateCertificateV2Response.minSslVersion)
            && Objects.equals(this.isHttpRedirectToHttps, associateCertificateV2Response.isHttpRedirectToHttps)
            && Objects.equals(this.verifiedClientCertificateEnabled,
                associateCertificateV2Response.verifiedClientCertificateEnabled)
            && Objects.equals(this.sslName, associateCertificateV2Response.sslName)
            && Objects.equals(this.sslId, associateCertificateV2Response.sslId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urlDomain,
            id,
            status,
            minSslVersion,
            isHttpRedirectToHttps,
            verifiedClientCertificateEnabled,
            sslName,
            sslId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateCertificateV2Response {\n");
        sb.append("    urlDomain: ").append(toIndentedString(urlDomain)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    minSslVersion: ").append(toIndentedString(minSslVersion)).append("\n");
        sb.append("    isHttpRedirectToHttps: ").append(toIndentedString(isHttpRedirectToHttps)).append("\n");
        sb.append("    verifiedClientCertificateEnabled: ")
            .append(toIndentedString(verifiedClientCertificateEnabled))
            .append("\n");
        sb.append("    sslName: ").append(toIndentedString(sslName)).append("\n");
        sb.append("    sslId: ").append(toIndentedString(sslId)).append("\n");
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
