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
 * AttachedPluginInfo
 */
public class AttachedPluginInfo {

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
    @JsonProperty(value = "attached_time")

    private OffsetDateTime attachedTime;

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

    public AttachedPluginInfo withPluginAttachId(String pluginAttachId) {
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

    public AttachedPluginInfo withPluginId(String pluginId) {
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

    public AttachedPluginInfo withPluginName(String pluginName) {
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

    public AttachedPluginInfo withPluginType(PluginTypeEnum pluginType) {
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

    public AttachedPluginInfo withPluginScope(PluginScopeEnum pluginScope) {
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

    public AttachedPluginInfo withEnvId(String envId) {
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

    public AttachedPluginInfo withEnvName(String envName) {
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

    public AttachedPluginInfo withAttachedTime(OffsetDateTime attachedTime) {
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

    public AttachedPluginInfo withPluginContent(String pluginContent) {
        this.pluginContent = pluginContent;
        return this;
    }

    /**
     * 插件定义内容，支持json。
     * @return pluginContent
     */
    public String getPluginContent() {
        return pluginContent;
    }

    public void setPluginContent(String pluginContent) {
        this.pluginContent = pluginContent;
    }

    public AttachedPluginInfo withRemark(String remark) {
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

    public AttachedPluginInfo withCreateTime(OffsetDateTime createTime) {
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

    public AttachedPluginInfo withUpdateTime(OffsetDateTime updateTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachedPluginInfo that = (AttachedPluginInfo) obj;
        return Objects.equals(this.pluginAttachId, that.pluginAttachId) && Objects.equals(this.pluginId, that.pluginId)
            && Objects.equals(this.pluginName, that.pluginName) && Objects.equals(this.pluginType, that.pluginType)
            && Objects.equals(this.pluginScope, that.pluginScope) && Objects.equals(this.envId, that.envId)
            && Objects.equals(this.envName, that.envName) && Objects.equals(this.attachedTime, that.attachedTime)
            && Objects.equals(this.pluginContent, that.pluginContent) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
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
            attachedTime,
            pluginContent,
            remark,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachedPluginInfo {\n");
        sb.append("    pluginAttachId: ").append(toIndentedString(pluginAttachId)).append("\n");
        sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    pluginType: ").append(toIndentedString(pluginType)).append("\n");
        sb.append("    pluginScope: ").append(toIndentedString(pluginScope)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    attachedTime: ").append(toIndentedString(attachedTime)).append("\n");
        sb.append("    pluginContent: ").append(toIndentedString(pluginContent)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
