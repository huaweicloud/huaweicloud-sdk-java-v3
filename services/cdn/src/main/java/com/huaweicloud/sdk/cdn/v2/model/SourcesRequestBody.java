package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 源站信息
 */
public class SourcesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_or_domain")

    private String ipOrDomain;

    /**
     * 源站类型取值：ipaddr：源站IP、 domain：源站域名、obs_bucket：OBS桶域名。
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OriginTypeEnum(value));
        }

        public static OriginTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private OriginTypeEnum originType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_type")

    private String obsBucketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_standby")

    private Integer activeStandby;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_obs_web_hosting")

    private Integer enableObsWebHosting;

    public SourcesRequestBody withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 加速域名id。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public SourcesRequestBody withIpOrDomain(String ipOrDomain) {
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

    public SourcesRequestBody withOriginType(OriginTypeEnum originType) {
        this.originType = originType;
        return this;
    }

    /**
     * 源站类型取值：ipaddr：源站IP、 domain：源站域名、obs_bucket：OBS桶域名。
     * @return originType
     */
    public OriginTypeEnum getOriginType() {
        return originType;
    }

    public void setOriginType(OriginTypeEnum originType) {
        this.originType = originType;
    }

    public SourcesRequestBody withObsBucketType(String obsBucketType) {
        this.obsBucketType = obsBucketType;
        return this;
    }

    /**
     * OBS桶类型，源站类型是“OBS桶域名”时需要传该参数，不传默认为“public”。   - private: 私有桶（除桶ACL授权外的其他用户无桶的访问权限）。   - public: 公有桶（任何用户都可以对桶内对象进行读操作）。
     * @return obsBucketType
     */
    public String getObsBucketType() {
        return obsBucketType;
    }

    public void setObsBucketType(String obsBucketType) {
        this.obsBucketType = obsBucketType;
    }

    public SourcesRequestBody withActiveStandby(Integer activeStandby) {
        this.activeStandby = activeStandby;
        return this;
    }

    /**
     * 主备状态，1代表主源站，0代表备源站。
     * @return activeStandby
     */
    public Integer getActiveStandby() {
        return activeStandby;
    }

    public void setActiveStandby(Integer activeStandby) {
        this.activeStandby = activeStandby;
    }

    public SourcesRequestBody withEnableObsWebHosting(Integer enableObsWebHosting) {
        this.enableObsWebHosting = enableObsWebHosting;
        return this;
    }

    /**
     * 是否开启OBS静态网站托管(0表示关闭,1表示则为开启)，源站类型为obs_bucket时传递。
     * @return enableObsWebHosting
     */
    public Integer getEnableObsWebHosting() {
        return enableObsWebHosting;
    }

    public void setEnableObsWebHosting(Integer enableObsWebHosting) {
        this.enableObsWebHosting = enableObsWebHosting;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourcesRequestBody that = (SourcesRequestBody) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.ipOrDomain, that.ipOrDomain)
            && Objects.equals(this.originType, that.originType)
            && Objects.equals(this.obsBucketType, that.obsBucketType)
            && Objects.equals(this.activeStandby, that.activeStandby)
            && Objects.equals(this.enableObsWebHosting, that.enableObsWebHosting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, ipOrDomain, originType, obsBucketType, activeStandby, enableObsWebHosting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourcesRequestBody {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    ipOrDomain: ").append(toIndentedString(ipOrDomain)).append("\n");
        sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
        sb.append("    obsBucketType: ").append(toIndentedString(obsBucketType)).append("\n");
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
