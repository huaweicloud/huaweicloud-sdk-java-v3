package com.huaweicloud.sdk.cdn.v1.model;

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
 * 源站信息
 */
public class Sources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_or_domain")

    @JacksonXmlProperty(localName = "ip_or_domain")

    private String ipOrDomain;

    /**
     * 源站类型取值：ipaddr、 domain、obs_bucket，分别表示：源站IP、源站域名、OBS桶访问域名。
     */
    public static final class OriginTypeEnum {

        /**
         * Enum IPADDR for value: "ipaddr"
         */
        public static final OriginTypeEnum IPADDR = new OriginTypeEnum("ipaddr");

        /**
         * Enum DOMAIN for value: "domain"
         */
        public static final OriginTypeEnum DOMAIN = new OriginTypeEnum("domain");

        /**
         * Enum OBS_BUCKET for value: "obs_bucket"
         */
        public static final OriginTypeEnum OBS_BUCKET = new OriginTypeEnum("obs_bucket");

        private static final Map<String, OriginTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OriginTypeEnum> createStaticFields() {
            Map<String, OriginTypeEnum> map = new HashMap<>();
            map.put("ipaddr", IPADDR);
            map.put("domain", DOMAIN);
            map.put("obs_bucket", OBS_BUCKET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OriginTypeEnum(String value) {
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
        public static OriginTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OriginTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OriginTypeEnum(value);
            }
            return result;
        }

        public static OriginTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OriginTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OriginTypeEnum) {
                return this.value.equals(((OriginTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_type")

    @JacksonXmlProperty(localName = "origin_type")

    private OriginTypeEnum originType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_standby")

    @JacksonXmlProperty(localName = "active_standby")

    private Integer activeStandby;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_obs_web_hosting")

    @JacksonXmlProperty(localName = "enable_obs_web_hosting")

    private Integer enableObsWebHosting;

    public Sources withIpOrDomain(String ipOrDomain) {
        this.ipOrDomain = ipOrDomain;
        return this;
    }

    /**
     * 源站IP（非内网IP）或者域名。
     * @return ipOrDomain
     */
    public String getIpOrDomain() {
        return ipOrDomain;
    }

    public void setIpOrDomain(String ipOrDomain) {
        this.ipOrDomain = ipOrDomain;
    }

    public Sources withOriginType(OriginTypeEnum originType) {
        this.originType = originType;
        return this;
    }

    /**
     * 源站类型取值：ipaddr、 domain、obs_bucket，分别表示：源站IP、源站域名、OBS桶访问域名。
     * @return originType
     */
    public OriginTypeEnum getOriginType() {
        return originType;
    }

    public void setOriginType(OriginTypeEnum originType) {
        this.originType = originType;
    }

    public Sources withActiveStandby(Integer activeStandby) {
        this.activeStandby = activeStandby;
        return this;
    }

    /**
     * 主备状态（1代表主站；0代表备站）,主源站必须存在，备源站可选，OBS桶不能有备源站。
     * @return activeStandby
     */
    public Integer getActiveStandby() {
        return activeStandby;
    }

    public void setActiveStandby(Integer activeStandby) {
        this.activeStandby = activeStandby;
    }

    public Sources withEnableObsWebHosting(Integer enableObsWebHosting) {
        this.enableObsWebHosting = enableObsWebHosting;
        return this;
    }

    /**
     * 是否开启Obs静态网站托管(0表示关闭,1表示则为开启)，源站类型为obs_bucket时传递。
     * @return enableObsWebHosting
     */
    public Integer getEnableObsWebHosting() {
        return enableObsWebHosting;
    }

    public void setEnableObsWebHosting(Integer enableObsWebHosting) {
        this.enableObsWebHosting = enableObsWebHosting;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Sources sources = (Sources) o;
        return Objects.equals(this.ipOrDomain, sources.ipOrDomain)
            && Objects.equals(this.originType, sources.originType)
            && Objects.equals(this.activeStandby, sources.activeStandby)
            && Objects.equals(this.enableObsWebHosting, sources.enableObsWebHosting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipOrDomain, originType, activeStandby, enableObsWebHosting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Sources {\n");
        sb.append("    ipOrDomain: ").append(toIndentedString(ipOrDomain)).append("\n");
        sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
        sb.append("    activeStandby: ").append(toIndentedString(activeStandby)).append("\n");
        sb.append("    enableObsWebHosting: ").append(toIndentedString(enableObsWebHosting)).append("\n");
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
