package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PluginApiAttachInfo
 */
public class PluginApiAttachInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_attach_id")

    private String pluginAttachId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_id")

    private String pluginId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    /**
     * 插件类型 - cors：跨域资源共享 - set_resp_headers：HTTP响应头管理 - kafka_log：Kafka日志推送 - breaker：断路器 - rate_limit: 流量控制 - third_auth: 第三方认证 - proxy_cache: 响应缓存
     */
    public static final class PluginTypeEnum {

        /**
         * Enum CORS for value: "cors"
         */
        public static final PluginTypeEnum CORS = new PluginTypeEnum("cors");

        /**
         * Enum SET_RESP_HEADERS for value: "set_resp_headers"
         */
        public static final PluginTypeEnum SET_RESP_HEADERS = new PluginTypeEnum("set_resp_headers");

        /**
         * Enum KAFKA_LOG for value: "kafka_log"
         */
        public static final PluginTypeEnum KAFKA_LOG = new PluginTypeEnum("kafka_log");

        /**
         * Enum BREAKER for value: "breaker"
         */
        public static final PluginTypeEnum BREAKER = new PluginTypeEnum("breaker");

        /**
         * Enum RATE_LIMIT for value: "rate_limit"
         */
        public static final PluginTypeEnum RATE_LIMIT = new PluginTypeEnum("rate_limit");

        /**
         * Enum THIRD_AUTH for value: "third_auth"
         */
        public static final PluginTypeEnum THIRD_AUTH = new PluginTypeEnum("third_auth");

        /**
         * Enum PROXY_CACHE for value: "proxy_cache"
         */
        public static final PluginTypeEnum PROXY_CACHE = new PluginTypeEnum("proxy_cache");

        private static final Map<String, PluginTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PluginTypeEnum> createStaticFields() {
            Map<String, PluginTypeEnum> map = new HashMap<>();
            map.put("cors", CORS);
            map.put("set_resp_headers", SET_RESP_HEADERS);
            map.put("kafka_log", KAFKA_LOG);
            map.put("breaker", BREAKER);
            map.put("rate_limit", RATE_LIMIT);
            map.put("third_auth", THIRD_AUTH);
            map.put("proxy_cache", PROXY_CACHE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PluginTypeEnum(String value) {
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
        public static PluginTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PluginTypeEnum(value));
        }

        public static PluginTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PluginTypeEnum) {
                return this.value.equals(((PluginTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_type")

    private PluginTypeEnum pluginType;

    /**
     * 插件可见范围。global：全局可见。
     */
    public static final class PluginScopeEnum {

        /**
         * Enum GLOBAL for value: "global"
         */
        public static final PluginScopeEnum GLOBAL = new PluginScopeEnum("global");

        private static final Map<String, PluginScopeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PluginScopeEnum> createStaticFields() {
            Map<String, PluginScopeEnum> map = new HashMap<>();
            map.put("global", GLOBAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PluginScopeEnum(String value) {
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
        public static PluginScopeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PluginScopeEnum(value));
        }

        public static PluginScopeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PluginScopeEnum) {
                return this.value.equals(((PluginScopeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_scope")

    private PluginScopeEnum pluginScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    private String apiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_time")

    private OffsetDateTime attachedTime;

    public PluginApiAttachInfo withPluginAttachId(String pluginAttachId) {
        this.pluginAttachId = pluginAttachId;
        return this;
    }

    /**
     * 插件绑定编码。
     * @return pluginAttachId
     */
    public String getPluginAttachId() {
        return pluginAttachId;
    }

    public void setPluginAttachId(String pluginAttachId) {
        this.pluginAttachId = pluginAttachId;
    }

    public PluginApiAttachInfo withPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }

    /**
     * 插件编码。
     * @return pluginId
     */
    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public PluginApiAttachInfo withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * 插件名称。支持汉字，英文，数字，中划线，下划线，且只能以英文和汉字开头，3-255字符 > 中文字符必须为UTF-8或者unicode编码。
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public PluginApiAttachInfo withPluginType(PluginTypeEnum pluginType) {
        this.pluginType = pluginType;
        return this;
    }

    /**
     * 插件类型 - cors：跨域资源共享 - set_resp_headers：HTTP响应头管理 - kafka_log：Kafka日志推送 - breaker：断路器 - rate_limit: 流量控制 - third_auth: 第三方认证 - proxy_cache: 响应缓存
     * @return pluginType
     */
    public PluginTypeEnum getPluginType() {
        return pluginType;
    }

    public void setPluginType(PluginTypeEnum pluginType) {
        this.pluginType = pluginType;
    }

    public PluginApiAttachInfo withPluginScope(PluginScopeEnum pluginScope) {
        this.pluginScope = pluginScope;
        return this;
    }

    /**
     * 插件可见范围。global：全局可见。
     * @return pluginScope
     */
    public PluginScopeEnum getPluginScope() {
        return pluginScope;
    }

    public void setPluginScope(PluginScopeEnum pluginScope) {
        this.pluginScope = pluginScope;
    }

    public PluginApiAttachInfo withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 绑定API的环境编码。
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public PluginApiAttachInfo withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * api授权绑定的环境名称
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public PluginApiAttachInfo withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * 绑定的API编码。
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public PluginApiAttachInfo withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    /**
     * API的名称
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public PluginApiAttachInfo withAttachedTime(OffsetDateTime attachedTime) {
        this.attachedTime = attachedTime;
        return this;
    }

    /**
     * 绑定时间。
     * @return attachedTime
     */
    public OffsetDateTime getAttachedTime() {
        return attachedTime;
    }

    public void setAttachedTime(OffsetDateTime attachedTime) {
        this.attachedTime = attachedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginApiAttachInfo that = (PluginApiAttachInfo) obj;
        return Objects.equals(this.pluginAttachId, that.pluginAttachId) && Objects.equals(this.pluginId, that.pluginId)
            && Objects.equals(this.pluginName, that.pluginName) && Objects.equals(this.pluginType, that.pluginType)
            && Objects.equals(this.pluginScope, that.pluginScope) && Objects.equals(this.envId, that.envId)
            && Objects.equals(this.envName, that.envName) && Objects.equals(this.apiId, that.apiId)
            && Objects.equals(this.apiName, that.apiName) && Objects.equals(this.attachedTime, that.attachedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginAttachId,
            pluginId,
            pluginName,
            pluginType,
            pluginScope,
            envId,
            envName,
            apiId,
            apiName,
            attachedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginApiAttachInfo {\n");
        sb.append("    pluginAttachId: ").append(toIndentedString(pluginAttachId)).append("\n");
        sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    pluginType: ").append(toIndentedString(pluginType)).append("\n");
        sb.append("    pluginScope: ").append(toIndentedString(pluginScope)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    attachedTime: ").append(toIndentedString(attachedTime)).append("\n");
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
