package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** UrlDomainCreate */
public class UrlDomainCreate {

    /** 最小ssl协议版本号。支持TLSv1.1或TLSv1.2 */
    public static final class MinSslVersionEnum {

        /** Enum TLSV1_1 for value: "TLSv1.1" */
        public static final MinSslVersionEnum TLSV1_1 = new MinSslVersionEnum("TLSv1.1");

        /** Enum TLSV1_2 for value: "TLSv1.2" */
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
            MinSslVersionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MinSslVersionEnum(value);
            }
            return result;
        }

        public static MinSslVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MinSslVersionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "url_domain")

    private String urlDomain;

    public UrlDomainCreate withMinSslVersion(MinSslVersionEnum minSslVersion) {
        this.minSslVersion = minSslVersion;
        return this;
    }

    /** 最小ssl协议版本号。支持TLSv1.1或TLSv1.2
     * 
     * @return minSslVersion */
    public MinSslVersionEnum getMinSslVersion() {
        return minSslVersion;
    }

    public void setMinSslVersion(MinSslVersionEnum minSslVersion) {
        this.minSslVersion = minSslVersion;
    }

    public UrlDomainCreate withUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
        return this;
    }

    /** 自定义域名。长度为0-255位的字符串，需要符合域名规范。
     * 
     * @return urlDomain */
    public String getUrlDomain() {
        return urlDomain;
    }

    public void setUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UrlDomainCreate urlDomainCreate = (UrlDomainCreate) o;
        return Objects.equals(this.minSslVersion, urlDomainCreate.minSslVersion)
            && Objects.equals(this.urlDomain, urlDomainCreate.urlDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minSslVersion, urlDomain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlDomainCreate {\n");
        sb.append("    minSslVersion: ").append(toIndentedString(minSslVersion)).append("\n");
        sb.append("    urlDomain: ").append(toIndentedString(urlDomain)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
