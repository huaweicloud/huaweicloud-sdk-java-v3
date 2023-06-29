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
public class CreateFeatureV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 特性名称
     */
    public static final class NameEnum {

        /**
         * Enum LTS for value: "lts"
         */
        public static final NameEnum LTS = new NameEnum("lts");

        /**
         * Enum GATEWAY_RESPONSES for value: "gateway_responses"
         */
        public static final NameEnum GATEWAY_RESPONSES = new NameEnum("gateway_responses");

        /**
         * Enum RATELIMIT for value: "ratelimit"
         */
        public static final NameEnum RATELIMIT = new NameEnum("ratelimit");

        /**
         * Enum REQUEST_BODY_SIZE for value: "request_body_size"
         */
        public static final NameEnum REQUEST_BODY_SIZE = new NameEnum("request_body_size");

        /**
         * Enum BACKEND_TIMEOUT for value: "backend_timeout"
         */
        public static final NameEnum BACKEND_TIMEOUT = new NameEnum("backend_timeout");

        /**
         * Enum APP_TOKEN for value: "app_token"
         */
        public static final NameEnum APP_TOKEN = new NameEnum("app_token");

        /**
         * Enum APP_API_KEY for value: "app_api_key"
         */
        public static final NameEnum APP_API_KEY = new NameEnum("app_api_key");

        /**
         * Enum APP_BASIC for value: "app_basic"
         */
        public static final NameEnum APP_BASIC = new NameEnum("app_basic");

        /**
         * Enum APP_SECRET for value: "app_secret"
         */
        public static final NameEnum APP_SECRET = new NameEnum("app_secret");

        /**
         * Enum APP_JWT for value: "app_jwt"
         */
        public static final NameEnum APP_JWT = new NameEnum("app_jwt");

        /**
         * Enum PUBLIC_KEY for value: "public_key"
         */
        public static final NameEnum PUBLIC_KEY = new NameEnum("public_key");

        /**
         * Enum BACKEND_TOKEN_ALLOW for value: "backend_token_allow"
         */
        public static final NameEnum BACKEND_TOKEN_ALLOW = new NameEnum("backend_token_allow");

        /**
         * Enum SIGN_BASIC for value: "sign_basic"
         */
        public static final NameEnum SIGN_BASIC = new NameEnum("sign_basic");

        /**
         * Enum MULTI_AUTH for value: "multi_auth"
         */
        public static final NameEnum MULTI_AUTH = new NameEnum("multi_auth");

        /**
         * Enum BACKEND_CLIENT_CERTIFICATE for value: "backend_client_certificate"
         */
        public static final NameEnum BACKEND_CLIENT_CERTIFICATE = new NameEnum("backend_client_certificate");

        /**
         * Enum SSL_CIPHERS for value: "ssl_ciphers"
         */
        public static final NameEnum SSL_CIPHERS = new NameEnum("ssl_ciphers");

        /**
         * Enum APP_CONFIG for value: "app_config"
         */
        public static final NameEnum APP_CONFIG = new NameEnum("app_config");

        /**
         * Enum GREEN_TUNNEL for value: "green_tunnel"
         */
        public static final NameEnum GREEN_TUNNEL = new NameEnum("green_tunnel");

        /**
         * Enum APP_ROUTE for value: "app_route"
         */
        public static final NameEnum APP_ROUTE = new NameEnum("app_route");

        /**
         * Enum DEFAULT_GROUP_HIDE for value: "default_group_hide"
         */
        public static final NameEnum DEFAULT_GROUP_HIDE = new NameEnum("default_group_hide");

        /**
         * Enum CASCADE for value: "cascade"
         */
        public static final NameEnum CASCADE = new NameEnum("cascade");

        /**
         * Enum SANDBOX for value: "sandbox"
         */
        public static final NameEnum SANDBOX = new NameEnum("sandbox");

        /**
         * Enum LIVEDATA_CONFIG for value: "livedata_config"
         */
        public static final NameEnum LIVEDATA_CONFIG = new NameEnum("livedata_config");

        /**
         * Enum APICLIENT_FIRST_USE_X_HW_ID for value: "apiclient_first_use_x_hw_id"
         */
        public static final NameEnum APICLIENT_FIRST_USE_X_HW_ID = new NameEnum("apiclient_first_use_x_hw_id");

        /**
         * Enum CORS for value: "cors"
         */
        public static final NameEnum CORS = new NameEnum("cors");

        /**
         * Enum API_TASK for value: "api_task"
         */
        public static final NameEnum API_TASK = new NameEnum("api_task");

        /**
         * Enum APP_QUOTA for value: "app_quota"
         */
        public static final NameEnum APP_QUOTA = new NameEnum("app_quota");

        /**
         * Enum APP_ACL for value: "app_acl"
         */
        public static final NameEnum APP_ACL = new NameEnum("app_acl");

        /**
         * Enum VPC_BACKUP for value: "vpc_backup"
         */
        public static final NameEnum VPC_BACKUP = new NameEnum("vpc_backup");

        /**
         * Enum THROTTLE_STRATEGY for value: "throttle_strategy"
         */
        public static final NameEnum THROTTLE_STRATEGY = new NameEnum("throttle_strategy");

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("lts", LTS);
            map.put("gateway_responses", GATEWAY_RESPONSES);
            map.put("ratelimit", RATELIMIT);
            map.put("request_body_size", REQUEST_BODY_SIZE);
            map.put("backend_timeout", BACKEND_TIMEOUT);
            map.put("app_token", APP_TOKEN);
            map.put("app_api_key", APP_API_KEY);
            map.put("app_basic", APP_BASIC);
            map.put("app_secret", APP_SECRET);
            map.put("app_jwt", APP_JWT);
            map.put("public_key", PUBLIC_KEY);
            map.put("backend_token_allow", BACKEND_TOKEN_ALLOW);
            map.put("sign_basic", SIGN_BASIC);
            map.put("multi_auth", MULTI_AUTH);
            map.put("backend_client_certificate", BACKEND_CLIENT_CERTIFICATE);
            map.put("ssl_ciphers", SSL_CIPHERS);
            map.put("app_config", APP_CONFIG);
            map.put("green_tunnel", GREEN_TUNNEL);
            map.put("app_route", APP_ROUTE);
            map.put("default_group_hide", DEFAULT_GROUP_HIDE);
            map.put("cascade", CASCADE);
            map.put("sandbox", SANDBOX);
            map.put("livedata_config", LIVEDATA_CONFIG);
            map.put("apiclient_first_use_x_hw_id", APICLIENT_FIRST_USE_X_HW_ID);
            map.put("cors", CORS);
            map.put("api_task", API_TASK);
            map.put("app_quota", APP_QUOTA);
            map.put("app_acl", APP_ACL);
            map.put("vpc_backup", VPC_BACKUP);
            map.put("throttle_strategy", THROTTLE_STRATEGY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NameEnum(String value) {
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
        public static NameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NameEnum(value));
        }

        public static NameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NameEnum) {
                return this.value.equals(((NameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private NameEnum name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private String config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public CreateFeatureV2Response withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 特性编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateFeatureV2Response withName(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * 特性名称
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    public CreateFeatureV2Response withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启特性
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public CreateFeatureV2Response withConfig(String config) {
        this.config = config;
        return this;
    }

    /**
     * 特性参数配置
     * @return config
     */
    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public CreateFeatureV2Response withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例编号
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateFeatureV2Response withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 实例特性更新时间
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
        CreateFeatureV2Response that = (CreateFeatureV2Response) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.enable, that.enable) && Objects.equals(this.config, that.config)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, enable, config, instanceId, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFeatureV2Response {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
