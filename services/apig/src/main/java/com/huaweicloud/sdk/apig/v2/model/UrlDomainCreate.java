package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UrlDomainCreate
 */
public class UrlDomainCreate {

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
    @JsonProperty(value = "is_http_redirect_to_https")

    private Boolean isHttpRedirectToHttps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_http_port")

    private Integer ingressHttpPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_https_port")

    private Integer ingressHttpsPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_domain")

    private String urlDomain;

    public UrlDomainCreate withMinSslVersion(MinSslVersionEnum minSslVersion) {
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

    public UrlDomainCreate withIsHttpRedirectToHttps(Boolean isHttpRedirectToHttps) {
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

    public UrlDomainCreate withIngressHttpPort(Integer ingressHttpPort) {
        this.ingressHttpPort = ingressHttpPort;
        return this;
    }

    /**
     * 访问该域名绑定的http协议入方向端口，-1表示无端口且协议不支持，可使用80默认端口，其他有效端口允许的取值范围为1024~49151，需为实例已开放的HTTP协议的自定义入方向端口。  当创建域名时，该参数未填表示用默认80端口；如果填写该参数，则必须同时填写https_port；如果要http_port和https_port同时使用默认端口，则两个参数都不填。  当修改域名时，该参数未填表示不修改该端口。 
     * minimum: -1
     * maximum: 49151
     * @return ingressHttpPort
     */
    public Integer getIngressHttpPort() {
        return ingressHttpPort;
    }

    public void setIngressHttpPort(Integer ingressHttpPort) {
        this.ingressHttpPort = ingressHttpPort;
    }

    public UrlDomainCreate withIngressHttpsPort(Integer ingressHttpsPort) {
        this.ingressHttpsPort = ingressHttpsPort;
        return this;
    }

    /**
     * 访问该域名绑定的https协议入方向端口，-1表示无端口且协议不支持，可使用443默认端口，其他有效端口允许的取值范围为1024~49151，需为实例已开放的HTTPS协议的自定义入方向端口。  当创建域名时，该参数未填表示用默认443端口；如果填写该参数，则必须同时填写http_port；如果要http_port和https_port同时使用默认端口，则两个参数都不填。  当修改域名时，该参数未填表示不修改该端口。 
     * minimum: -1
     * maximum: 49151
     * @return ingressHttpsPort
     */
    public Integer getIngressHttpsPort() {
        return ingressHttpsPort;
    }

    public void setIngressHttpsPort(Integer ingressHttpsPort) {
        this.ingressHttpsPort = ingressHttpsPort;
    }

    public UrlDomainCreate withUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
        return this;
    }

    /**
     * 自定义域名。长度为0-255位的字符串，需要符合域名规范（即符合正则'^(\\[a-zA-Z0-9]([a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?\\\\.){1,7}[a-zA-Z]{2,64}\\\\.?$'或者符合正则'^\\[*](\\\\.\\[a-zA-Z0-9]([a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?){1,6}\\\\.[a-zA-Z]{2,64}\\\\.?$'）。
     * @return urlDomain
     */
    public String getUrlDomain() {
        return urlDomain;
    }

    public void setUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlDomainCreate that = (UrlDomainCreate) obj;
        return Objects.equals(this.minSslVersion, that.minSslVersion)
            && Objects.equals(this.isHttpRedirectToHttps, that.isHttpRedirectToHttps)
            && Objects.equals(this.ingressHttpPort, that.ingressHttpPort)
            && Objects.equals(this.ingressHttpsPort, that.ingressHttpsPort)
            && Objects.equals(this.urlDomain, that.urlDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minSslVersion, isHttpRedirectToHttps, ingressHttpPort, ingressHttpsPort, urlDomain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlDomainCreate {\n");
        sb.append("    minSslVersion: ").append(toIndentedString(minSslVersion)).append("\n");
        sb.append("    isHttpRedirectToHttps: ").append(toIndentedString(isHttpRedirectToHttps)).append("\n");
        sb.append("    ingressHttpPort: ").append(toIndentedString(ingressHttpPort)).append("\n");
        sb.append("    ingressHttpsPort: ").append(toIndentedString(ingressHttpsPort)).append("\n");
        sb.append("    urlDomain: ").append(toIndentedString(urlDomain)).append("\n");
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
