package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 绑定域名列表
 */
public class CertificateBundingHostBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    /**
     * waf模式（分为云模式：cloud,独享模式：premium）
     */
    public static final class WafTypeEnum {

        /**
         * Enum CLOUD for value: "cloud"
         */
        public static final WafTypeEnum CLOUD = new WafTypeEnum("cloud");

        /**
         * Enum PREMIUM for value: "premium"
         */
        public static final WafTypeEnum PREMIUM = new WafTypeEnum("premium");

        private static final Map<String, WafTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, WafTypeEnum> createStaticFields() {
            Map<String, WafTypeEnum> map = new HashMap<>();
            map.put("cloud", CLOUD);
            map.put("premium", PREMIUM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        WafTypeEnum(String value) {
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
        public static WafTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            WafTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new WafTypeEnum(value);
            }
            return result;
        }

        public static WafTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            WafTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WafTypeEnum) {
                return this.value.equals(((WafTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waf_type")

    private WafTypeEnum wafType;

    public CertificateBundingHostBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 域名id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CertificateBundingHostBody withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 域名
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public CertificateBundingHostBody withWafType(WafTypeEnum wafType) {
        this.wafType = wafType;
        return this;
    }

    /**
     * waf模式（分为云模式：cloud,独享模式：premium）
     * @return wafType
     */
    public WafTypeEnum getWafType() {
        return wafType;
    }

    public void setWafType(WafTypeEnum wafType) {
        this.wafType = wafType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CertificateBundingHostBody certificateBundingHostBody = (CertificateBundingHostBody) o;
        return Objects.equals(this.id, certificateBundingHostBody.id)
            && Objects.equals(this.hostname, certificateBundingHostBody.hostname)
            && Objects.equals(this.wafType, certificateBundingHostBody.wafType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hostname, wafType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateBundingHostBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    wafType: ").append(toIndentedString(wafType)).append("\n");
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
