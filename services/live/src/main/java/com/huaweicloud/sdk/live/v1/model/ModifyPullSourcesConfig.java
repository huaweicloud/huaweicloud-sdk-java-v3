package com.huaweicloud.sdk.live.v1.model;

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
 * ModifyPullSourcesConfig
 */
public class ModifyPullSourcesConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_domain")

    private String playDomain;

    /**
     * 回源方式。  包含如下取值： - domain: 回源客户源站，源站地址是域名格式。回源域名，可配置多个，如果回源失败，将按照配置顺序进行轮循。 - ipaddr: 回源客户源站，源站地址是IP格式。回源IP，可配置多个，如果回源失败，将按照配置顺序进行轮循。同时，最多可以配置一个回源域名，如果配置，回源时httpflv HOST头填该域名，RTMP tcurl字段填该域名，否则按当前IP作为HOST。 - huawei: 回源华为源站，域名创建后的默认值。
     */
    public static final class SourceTypeEnum {

        /**
         * Enum DOMAIN for value: "domain"
         */
        public static final SourceTypeEnum DOMAIN = new SourceTypeEnum("domain");

        /**
         * Enum IPADDR for value: "ipaddr"
         */
        public static final SourceTypeEnum IPADDR = new SourceTypeEnum("ipaddr");

        /**
         * Enum HUAWEI for value: "huawei"
         */
        public static final SourceTypeEnum HUAWEI = new SourceTypeEnum("huawei");

        private static final Map<String, SourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceTypeEnum> createStaticFields() {
            Map<String, SourceTypeEnum> map = new HashMap<>();
            map.put("domain", DOMAIN);
            map.put("ipaddr", IPADDR);
            map.put("huawei", HUAWEI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceTypeEnum(value));
        }

        public static SourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private SourceTypeEnum sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<String> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources_ip")

    private List<String> sourcesIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_port")

    private Integer sourcePort;

    /**
     * 回源协议，回源方式非“huawei”时必选。  包含如下取值： - http - rtmp
     */
    public static final class SchemeEnum {

        /**
         * Enum HTTP for value: "http"
         */
        public static final SchemeEnum HTTP = new SchemeEnum("http");

        /**
         * Enum RTMP for value: "rtmp"
         */
        public static final SchemeEnum RTMP = new SchemeEnum("rtmp");

        private static final Map<String, SchemeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SchemeEnum> createStaticFields() {
            Map<String, SchemeEnum> map = new HashMap<>();
            map.put("http", HTTP);
            map.put("rtmp", RTMP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SchemeEnum(String value) {
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
        public static SchemeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SchemeEnum(value));
        }

        public static SchemeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SchemeEnum) {
                return this.value.equals(((SchemeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheme")

    private SchemeEnum scheme;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_args")

    private Map<String, String> additionalArgs = null;

    public ModifyPullSourcesConfig withPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }

    /**
     * 直播播放域名
     * @return playDomain
     */
    public String getPlayDomain() {
        return playDomain;
    }

    public void setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
    }

    public ModifyPullSourcesConfig withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 回源方式。  包含如下取值： - domain: 回源客户源站，源站地址是域名格式。回源域名，可配置多个，如果回源失败，将按照配置顺序进行轮循。 - ipaddr: 回源客户源站，源站地址是IP格式。回源IP，可配置多个，如果回源失败，将按照配置顺序进行轮循。同时，最多可以配置一个回源域名，如果配置，回源时httpflv HOST头填该域名，RTMP tcurl字段填该域名，否则按当前IP作为HOST。 - huawei: 回源华为源站，域名创建后的默认值。
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public ModifyPullSourcesConfig withSources(List<String> sources) {
        this.sources = sources;
        return this;
    }

    public ModifyPullSourcesConfig addSourcesItem(String sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public ModifyPullSourcesConfig withSources(Consumer<List<String>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 回源域名列表，最多可配置10个。 - 当回源方式是“domain”时，此参数必选，域名配置多个时，如果回源失败，将按照配置顺序进行轮循。 - 当回源方式是“ipaddr”时，最多可以配置一个回源域名，如果配置，回源时httpflv HOST头填该域名，RTMP tcurl 字段填该域名，否则按当前IP作为HOST。
     * @return sources
     */
    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public ModifyPullSourcesConfig withSourcesIp(List<String> sourcesIp) {
        this.sourcesIp = sourcesIp;
        return this;
    }

    public ModifyPullSourcesConfig addSourcesIpItem(String sourcesIpItem) {
        if (this.sourcesIp == null) {
            this.sourcesIp = new ArrayList<>();
        }
        this.sourcesIp.add(sourcesIpItem);
        return this;
    }

    public ModifyPullSourcesConfig withSourcesIp(Consumer<List<String>> sourcesIpSetter) {
        if (this.sourcesIp == null) {
            this.sourcesIp = new ArrayList<>();
        }
        sourcesIpSetter.accept(this.sourcesIp);
        return this;
    }

    /**
     * 回源IP地址列表，最多可配置10个。当回源方式是“ipaddr”时，此参数必选，IP配置多个时，如果回源失败，将按照配置顺序进行轮循。
     * @return sourcesIp
     */
    public List<String> getSourcesIp() {
        return sourcesIp;
    }

    public void setSourcesIp(List<String> sourcesIp) {
        this.sourcesIp = sourcesIp;
    }

    public ModifyPullSourcesConfig withSourcePort(Integer sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    /**
     * 回源端口。 
     * minimum: 1
     * maximum: 65535
     * @return sourcePort
     */
    public Integer getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(Integer sourcePort) {
        this.sourcePort = sourcePort;
    }

    public ModifyPullSourcesConfig withScheme(SchemeEnum scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * 回源协议，回源方式非“huawei”时必选。  包含如下取值： - http - rtmp
     * @return scheme
     */
    public SchemeEnum getScheme() {
        return scheme;
    }

    public void setScheme(SchemeEnum scheme) {
        this.scheme = scheme;
    }

    public ModifyPullSourcesConfig withAdditionalArgs(Map<String, String> additionalArgs) {
        this.additionalArgs = additionalArgs;
        return this;
    }

    public ModifyPullSourcesConfig putAdditionalArgsItem(String key, String additionalArgsItem) {
        if (this.additionalArgs == null) {
            this.additionalArgs = new HashMap<>();
        }
        this.additionalArgs.put(key, additionalArgsItem);
        return this;
    }

    public ModifyPullSourcesConfig withAdditionalArgs(Consumer<Map<String, String>> additionalArgsSetter) {
        if (this.additionalArgs == null) {
            this.additionalArgs = new HashMap<>();
        }
        additionalArgsSetter.accept(this.additionalArgs);
        return this;
    }

    /**
     * 回源客户源站时在URL携带的参数。
     * @return additionalArgs
     */
    public Map<String, String> getAdditionalArgs() {
        return additionalArgs;
    }

    public void setAdditionalArgs(Map<String, String> additionalArgs) {
        this.additionalArgs = additionalArgs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyPullSourcesConfig that = (ModifyPullSourcesConfig) obj;
        return Objects.equals(this.playDomain, that.playDomain) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.sources, that.sources) && Objects.equals(this.sourcesIp, that.sourcesIp)
            && Objects.equals(this.sourcePort, that.sourcePort) && Objects.equals(this.scheme, that.scheme)
            && Objects.equals(this.additionalArgs, that.additionalArgs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playDomain, sourceType, sources, sourcesIp, sourcePort, scheme, additionalArgs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyPullSourcesConfig {\n");
        sb.append("    playDomain: ").append(toIndentedString(playDomain)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    sourcesIp: ").append(toIndentedString(sourcesIp)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
        sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
        sb.append("    additionalArgs: ").append(toIndentedString(additionalArgs)).append("\n");
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
