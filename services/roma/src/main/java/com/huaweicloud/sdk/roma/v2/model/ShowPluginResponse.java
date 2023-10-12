package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowPluginResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_id")

    private String pluginId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    /**
     * 插件类型 - cors：跨域资源共享 - set_resp_headers：HTTP响应头管理 - kafka_log：Kafka日志推送 - breaker：断路器 - rate_limit: 流量控制 - third_auth: 第三方认证
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

        private static final Map<String, PluginTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PluginTypeEnum> createStaticFields() {
            Map<String, PluginTypeEnum> map = new HashMap<>();
            map.put("cors", CORS);
            map.put("set_resp_headers", SET_RESP_HEADERS);
            map.put("kafka_log", KAFKA_LOG);
            map.put("breaker", BREAKER);
            map.put("rate_limit", RATE_LIMIT);
            map.put("third_auth", THIRD_AUTH);
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
     * 插件可见范围 - global：全局可见 - app：集成应用可见
     */
    public static final class PluginScopeEnum {

        /**
         * Enum GLOBAL for value: "global"
         */
        public static final PluginScopeEnum GLOBAL = new PluginScopeEnum("global");

        /**
         * Enum APP for value: "app"
         */
        public static final PluginScopeEnum APP = new PluginScopeEnum("app");

        private static final Map<String, PluginScopeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PluginScopeEnum> createStaticFields() {
            Map<String, PluginScopeEnum> map = new HashMap<>();
            map.put("global", GLOBAL);
            map.put("app", APP);
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
    @JsonProperty(value = "plugin_content")

    private String pluginContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_app_id")

    private String romaAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_app_name")

    private String romaAppName;

    public ShowPluginResponse withPluginId(String pluginId) {
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

    public ShowPluginResponse withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * 插件名称。支持汉字，英文，数字，下划线，且只能以英文和汉字开头，3-255字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public ShowPluginResponse withPluginType(PluginTypeEnum pluginType) {
        this.pluginType = pluginType;
        return this;
    }

    /**
     * 插件类型 - cors：跨域资源共享 - set_resp_headers：HTTP响应头管理 - kafka_log：Kafka日志推送 - breaker：断路器 - rate_limit: 流量控制 - third_auth: 第三方认证
     * @return pluginType
     */
    public PluginTypeEnum getPluginType() {
        return pluginType;
    }

    public void setPluginType(PluginTypeEnum pluginType) {
        this.pluginType = pluginType;
    }

    public ShowPluginResponse withPluginScope(PluginScopeEnum pluginScope) {
        this.pluginScope = pluginScope;
        return this;
    }

    /**
     * 插件可见范围 - global：全局可见 - app：集成应用可见
     * @return pluginScope
     */
    public PluginScopeEnum getPluginScope() {
        return pluginScope;
    }

    public void setPluginScope(PluginScopeEnum pluginScope) {
        this.pluginScope = pluginScope;
    }

    public ShowPluginResponse withPluginContent(String pluginContent) {
        this.pluginContent = pluginContent;
        return this;
    }

    /**
     * 插件定义内容，支持json。参考提供的具体模型定义  CorsPluginContent：跨域资源共享 定义内容 SetRespHeadersContent：HTTP响应头管理 定义内容 KafkaLogContent：Kafka日志推送 定义内容 BreakerContent：断路器 定义内容 RateLimitContent 流量控制 定义内容 ThirdAuthContent: 第三方认证 定义内容
     * @return pluginContent
     */
    public String getPluginContent() {
        return pluginContent;
    }

    public void setPluginContent(String pluginContent) {
        this.pluginContent = pluginContent;
    }

    public ShowPluginResponse withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 插件描述，255字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ShowPluginResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ShowPluginResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ShowPluginResponse withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    /**
     * 归属集成应用编码，plugin_scope为app时生效
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    public ShowPluginResponse withRomaAppName(String romaAppName) {
        this.romaAppName = romaAppName;
        return this;
    }

    /**
     * API归属的集成应用名称
     * @return romaAppName
     */
    public String getRomaAppName() {
        return romaAppName;
    }

    public void setRomaAppName(String romaAppName) {
        this.romaAppName = romaAppName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPluginResponse that = (ShowPluginResponse) obj;
        return Objects.equals(this.pluginId, that.pluginId) && Objects.equals(this.pluginName, that.pluginName)
            && Objects.equals(this.pluginType, that.pluginType) && Objects.equals(this.pluginScope, that.pluginScope)
            && Objects.equals(this.pluginContent, that.pluginContent) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.romaAppId, that.romaAppId) && Objects.equals(this.romaAppName, that.romaAppName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginId,
            pluginName,
            pluginType,
            pluginScope,
            pluginContent,
            remark,
            createTime,
            updateTime,
            romaAppId,
            romaAppName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPluginResponse {\n");
        sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    pluginType: ").append(toIndentedString(pluginType)).append("\n");
        sb.append("    pluginScope: ").append(toIndentedString(pluginScope)).append("\n");
        sb.append("    pluginContent: ").append(toIndentedString(pluginContent)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
        sb.append("    romaAppName: ").append(toIndentedString(romaAppName)).append("\n");
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
