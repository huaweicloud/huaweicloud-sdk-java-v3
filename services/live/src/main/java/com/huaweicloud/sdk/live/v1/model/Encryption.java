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
 * 加密信息
 */
public class Encryption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_rotation_interval_seconds")

    private Integer keyRotationIntervalSeconds;

    /**
     * 加密方式。  请注意：目前为保留字段，不支持配置。 
     */
    public static final class EncryptionMethodEnum {

        /**
         * Enum SAMPLE_AES for value: "SAMPLE-AES"
         */
        public static final EncryptionMethodEnum SAMPLE_AES = new EncryptionMethodEnum("SAMPLE-AES");

        /**
         * Enum AES_128 for value: "AES-128"
         */
        public static final EncryptionMethodEnum AES_128 = new EncryptionMethodEnum("AES-128");

        private static final Map<String, EncryptionMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncryptionMethodEnum> createStaticFields() {
            Map<String, EncryptionMethodEnum> map = new HashMap<>();
            map.put("SAMPLE-AES", SAMPLE_AES);
            map.put("AES-128", AES_128);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncryptionMethodEnum(String value) {
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
        public static EncryptionMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EncryptionMethodEnum(value));
        }

        public static EncryptionMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncryptionMethodEnum) {
                return this.value.equals(((EncryptionMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_method")

    private EncryptionMethodEnum encryptionMethod;

    /**
     * 取值如下： - content：一个频道对应一个密钥 - profile：一个码率对应一个密钥  默认值：content
     */
    public static final class LevelEnum {

        /**
         * Enum CONTENT for value: "content"
         */
        public static final LevelEnum CONTENT = new LevelEnum("content");

        /**
         * Enum PROFILE for value: "profile"
         */
        public static final LevelEnum PROFILE = new LevelEnum("profile");

        private static final Map<String, LevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LevelEnum> createStaticFields() {
            Map<String, LevelEnum> map = new HashMap<>();
            map.put("content", CONTENT);
            map.put("profile", PROFILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LevelEnum(String value) {
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
        public static LevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LevelEnum(value));
        }

        public static LevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LevelEnum) {
                return this.value.equals(((LevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private LevelEnum level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    /**
     * Gets or Sets systemIds
     */
    public static final class SystemIdsEnum {

        /**
         * Enum WIDEVINE for value: "Widevine"
         */
        public static final SystemIdsEnum WIDEVINE = new SystemIdsEnum("Widevine");

        /**
         * Enum PLAYREADY for value: "PlayReady"
         */
        public static final SystemIdsEnum PLAYREADY = new SystemIdsEnum("PlayReady");

        /**
         * Enum FAIRPLAY for value: "FairPlay"
         */
        public static final SystemIdsEnum FAIRPLAY = new SystemIdsEnum("FairPlay");

        private static final Map<String, SystemIdsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SystemIdsEnum> createStaticFields() {
            Map<String, SystemIdsEnum> map = new HashMap<>();
            map.put("Widevine", WIDEVINE);
            map.put("PlayReady", PLAYREADY);
            map.put("FairPlay", FAIRPLAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SystemIdsEnum(String value) {
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
        public static SystemIdsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SystemIdsEnum(value));
        }

        public static SystemIdsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SystemIdsEnum) {
                return this.value.equals(((SystemIdsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_ids")

    private List<SystemIdsEnum> systemIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /**
     * drm speke 版本号 当前只支持1.0
     */
    public static final class SpekeVersionEnum {

        /**
         * Enum _1_0 for value: "1.0"
         */
        public static final SpekeVersionEnum _1_0 = new SpekeVersionEnum("1.0");

        private static final Map<String, SpekeVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpekeVersionEnum> createStaticFields() {
            Map<String, SpekeVersionEnum> map = new HashMap<>();
            map.put("1.0", _1_0);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpekeVersionEnum(String value) {
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
        public static SpekeVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpekeVersionEnum(value));
        }

        public static SpekeVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpekeVersionEnum) {
                return this.value.equals(((SpekeVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speke_version")

    private SpekeVersionEnum spekeVersion;

    /**
     * 请求模式。  取值如下： * direct_http：HTTP(S)直接访问DRM。 * functiongraph_proxy：FunctionGraph代理访问DRM。 
     */
    public static final class RequestModeEnum {

        /**
         * Enum DIRECT_HTTP for value: "direct_http"
         */
        public static final RequestModeEnum DIRECT_HTTP = new RequestModeEnum("direct_http");

        /**
         * Enum FUNCTIONGRAPH_PROXY for value: "functiongraph_proxy"
         */
        public static final RequestModeEnum FUNCTIONGRAPH_PROXY = new RequestModeEnum("functiongraph_proxy");

        private static final Map<String, RequestModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RequestModeEnum> createStaticFields() {
            Map<String, RequestModeEnum> map = new HashMap<>();
            map.put("direct_http", DIRECT_HTTP);
            map.put("functiongraph_proxy", FUNCTIONGRAPH_PROXY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RequestModeEnum(String value) {
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
        public static RequestModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RequestModeEnum(value));
        }

        public static RequestModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RequestModeEnum) {
                return this.value.equals(((RequestModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_mode")

    private RequestModeEnum requestMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_headers")

    private List<HttpHeader> httpHeaders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    public Encryption withKeyRotationIntervalSeconds(Integer keyRotationIntervalSeconds) {
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
        return this;
    }

    /**
     * 密钥缓存时间。如果密钥不变，默认缓存七天。  请注意：目前为保留字段，不支持配置。 
     * minimum: 0
     * maximum: 604800
     * @return keyRotationIntervalSeconds
     */
    public Integer getKeyRotationIntervalSeconds() {
        return keyRotationIntervalSeconds;
    }

    public void setKeyRotationIntervalSeconds(Integer keyRotationIntervalSeconds) {
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
    }

    public Encryption withEncryptionMethod(EncryptionMethodEnum encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
        return this;
    }

    /**
     * 加密方式。  请注意：目前为保留字段，不支持配置。 
     * @return encryptionMethod
     */
    public EncryptionMethodEnum getEncryptionMethod() {
        return encryptionMethod;
    }

    public void setEncryptionMethod(EncryptionMethodEnum encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
    }

    public Encryption withLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     * 取值如下： - content：一个频道对应一个密钥 - profile：一个码率对应一个密钥  默认值：content
     * @return level
     */
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public Encryption withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 客户生成的DRM内容ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Encryption withSystemIds(List<SystemIdsEnum> systemIds) {
        this.systemIds = systemIds;
        return this;
    }

    public Encryption addSystemIdsItem(SystemIdsEnum systemIdsItem) {
        if (this.systemIds == null) {
            this.systemIds = new ArrayList<>();
        }
        this.systemIds.add(systemIdsItem);
        return this;
    }

    public Encryption withSystemIds(Consumer<List<SystemIdsEnum>> systemIdsSetter) {
        if (this.systemIds == null) {
            this.systemIds = new ArrayList<>();
        }
        systemIdsSetter.accept(this.systemIds);
        return this;
    }

    /**
     * system_id枚举值。  取值如下： * HLS：FairPlay * DASH：Widevine、PlayReady * MSS：PlayReady 
     * @return systemIds
     */
    public List<SystemIdsEnum> getSystemIds() {
        return systemIds;
    }

    public void setSystemIds(List<SystemIdsEnum> systemIds) {
        this.systemIds = systemIds;
    }

    public Encryption withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 获取密钥的DRM地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Encryption withSpekeVersion(SpekeVersionEnum spekeVersion) {
        this.spekeVersion = spekeVersion;
        return this;
    }

    /**
     * drm speke 版本号 当前只支持1.0
     * @return spekeVersion
     */
    public SpekeVersionEnum getSpekeVersion() {
        return spekeVersion;
    }

    public void setSpekeVersion(SpekeVersionEnum spekeVersion) {
        this.spekeVersion = spekeVersion;
    }

    public Encryption withRequestMode(RequestModeEnum requestMode) {
        this.requestMode = requestMode;
        return this;
    }

    /**
     * 请求模式。  取值如下： * direct_http：HTTP(S)直接访问DRM。 * functiongraph_proxy：FunctionGraph代理访问DRM。 
     * @return requestMode
     */
    public RequestModeEnum getRequestMode() {
        return requestMode;
    }

    public void setRequestMode(RequestModeEnum requestMode) {
        this.requestMode = requestMode;
    }

    public Encryption withHttpHeaders(List<HttpHeader> httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }

    public Encryption addHttpHeadersItem(HttpHeader httpHeadersItem) {
        if (this.httpHeaders == null) {
            this.httpHeaders = new ArrayList<>();
        }
        this.httpHeaders.add(httpHeadersItem);
        return this;
    }

    public Encryption withHttpHeaders(Consumer<List<HttpHeader>> httpHeadersSetter) {
        if (this.httpHeaders == null) {
            this.httpHeaders = new ArrayList<>();
        }
        httpHeadersSetter.accept(this.httpHeaders);
        return this;
    }

    /**
     * 需要添加在drm请求头中的鉴权信息。最多支持配置5个。  仅direct_http请求模式支持配置http_headers。 
     * @return httpHeaders
     */
    public List<HttpHeader> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(List<HttpHeader> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public Encryption withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * functiongraph_proxy请求模式需要提供functiongraph的urn。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Encryption that = (Encryption) obj;
        return Objects.equals(this.keyRotationIntervalSeconds, that.keyRotationIntervalSeconds)
            && Objects.equals(this.encryptionMethod, that.encryptionMethod) && Objects.equals(this.level, that.level)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.systemIds, that.systemIds)
            && Objects.equals(this.url, that.url) && Objects.equals(this.spekeVersion, that.spekeVersion)
            && Objects.equals(this.requestMode, that.requestMode) && Objects.equals(this.httpHeaders, that.httpHeaders)
            && Objects.equals(this.urn, that.urn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyRotationIntervalSeconds,
            encryptionMethod,
            level,
            resourceId,
            systemIds,
            url,
            spekeVersion,
            requestMode,
            httpHeaders,
            urn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Encryption {\n");
        sb.append("    keyRotationIntervalSeconds: ").append(toIndentedString(keyRotationIntervalSeconds)).append("\n");
        sb.append("    encryptionMethod: ").append(toIndentedString(encryptionMethod)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    systemIds: ").append(toIndentedString(systemIds)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    spekeVersion: ").append(toIndentedString(spekeVersion)).append("\n");
        sb.append("    requestMode: ").append(toIndentedString(requestMode)).append("\n");
        sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
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
