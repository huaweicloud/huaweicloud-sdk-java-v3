package com.huaweicloud.sdk.roma.v2.model;

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
 * ApiPolicyHttpResp
 */
public class ApiPolicyHttpResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<ConditionResp> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_params")

    private List<BackendParam> backendParams = null;

    /**
     * 关联的策略组合模式： - ALL：满足全部条件 - ANY：满足任一条件
     */
    public static final class EffectModeEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final EffectModeEnum ALL = new EffectModeEnum("ALL");

        /**
         * Enum ANY for value: "ANY"
         */
        public static final EffectModeEnum ANY = new EffectModeEnum("ANY");

        private static final Map<String, EffectModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EffectModeEnum> createStaticFields() {
            Map<String, EffectModeEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("ANY", ANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EffectModeEnum(String value) {
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
        public static EffectModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EffectModeEnum(value));
        }

        public static EffectModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EffectModeEnum) {
                return this.value.equals(((EffectModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect_mode")

    private EffectModeEnum effectMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_id")

    private String authorizerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_domain")

    private String urlDomain;

    /**
     * 请求协议：HTTP、HTTPS
     */
    public static final class ReqProtocolEnum {

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final ReqProtocolEnum HTTP = new ReqProtocolEnum("HTTP");

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final ReqProtocolEnum HTTPS = new ReqProtocolEnum("HTTPS");

        private static final Map<String, ReqProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReqProtocolEnum> createStaticFields() {
            Map<String, ReqProtocolEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReqProtocolEnum(String value) {
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
        public static ReqProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReqProtocolEnum(value));
        }

        public static ReqProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReqProtocolEnum) {
                return this.value.equals(((ReqProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_protocol")

    private ReqProtocolEnum reqProtocol;

    /**
     * 请求方式：GET、POST、PUT、DELETE、HEAD、PATCH、OPTIONS、ANY
     */
    public static final class ReqMethodEnum {

        /**
         * Enum GET for value: "GET"
         */
        public static final ReqMethodEnum GET = new ReqMethodEnum("GET");

        /**
         * Enum POST for value: "POST"
         */
        public static final ReqMethodEnum POST = new ReqMethodEnum("POST");

        /**
         * Enum PUT for value: "PUT"
         */
        public static final ReqMethodEnum PUT = new ReqMethodEnum("PUT");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final ReqMethodEnum DELETE = new ReqMethodEnum("DELETE");

        /**
         * Enum HEAD for value: "HEAD"
         */
        public static final ReqMethodEnum HEAD = new ReqMethodEnum("HEAD");

        /**
         * Enum PATCH for value: "PATCH"
         */
        public static final ReqMethodEnum PATCH = new ReqMethodEnum("PATCH");

        /**
         * Enum OPTIONS for value: "OPTIONS"
         */
        public static final ReqMethodEnum OPTIONS = new ReqMethodEnum("OPTIONS");

        /**
         * Enum ANY for value: "ANY"
         */
        public static final ReqMethodEnum ANY = new ReqMethodEnum("ANY");

        private static final Map<String, ReqMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReqMethodEnum> createStaticFields() {
            Map<String, ReqMethodEnum> map = new HashMap<>();
            map.put("GET", GET);
            map.put("POST", POST);
            map.put("PUT", PUT);
            map.put("DELETE", DELETE);
            map.put("HEAD", HEAD);
            map.put("PATCH", PATCH);
            map.put("OPTIONS", OPTIONS);
            map.put("ANY", ANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReqMethodEnum(String value) {
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
        public static ReqMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReqMethodEnum(value));
        }

        public static ReqMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReqMethodEnum) {
                return this.value.equals(((ReqMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_method")

    private ReqMethodEnum reqMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_uri")

    private String reqUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_client_ssl")

    private Boolean enableClientSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_count")

    private String retryCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_info")

    private VpcInfo vpcChannelInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_status")

    private Integer vpcChannelStatus;

    public ApiPolicyHttpResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApiPolicyHttpResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略后端名称。字符串由中文、英文字母、数字、下划线组成，且只能以中文或英文开头。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiPolicyHttpResp withConditions(List<ConditionResp> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ApiPolicyHttpResp addConditionsItem(ConditionResp conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public ApiPolicyHttpResp withConditions(Consumer<List<ConditionResp>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 策略条件列表
     * @return conditions
     */
    public List<ConditionResp> getConditions() {
        return conditions;
    }

    public void setConditions(List<ConditionResp> conditions) {
        this.conditions = conditions;
    }

    public ApiPolicyHttpResp withBackendParams(List<BackendParam> backendParams) {
        this.backendParams = backendParams;
        return this;
    }

    public ApiPolicyHttpResp addBackendParamsItem(BackendParam backendParamsItem) {
        if (this.backendParams == null) {
            this.backendParams = new ArrayList<>();
        }
        this.backendParams.add(backendParamsItem);
        return this;
    }

    public ApiPolicyHttpResp withBackendParams(Consumer<List<BackendParam>> backendParamsSetter) {
        if (this.backendParams == null) {
            this.backendParams = new ArrayList<>();
        }
        backendParamsSetter.accept(this.backendParams);
        return this;
    }

    /**
     * 后端参数列表
     * @return backendParams
     */
    public List<BackendParam> getBackendParams() {
        return backendParams;
    }

    public void setBackendParams(List<BackendParam> backendParams) {
        this.backendParams = backendParams;
    }

    public ApiPolicyHttpResp withEffectMode(EffectModeEnum effectMode) {
        this.effectMode = effectMode;
        return this;
    }

    /**
     * 关联的策略组合模式： - ALL：满足全部条件 - ANY：满足任一条件
     * @return effectMode
     */
    public EffectModeEnum getEffectMode() {
        return effectMode;
    }

    public void setEffectMode(EffectModeEnum effectMode) {
        this.effectMode = effectMode;
    }

    public ApiPolicyHttpResp withAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }

    /**
     * 后端自定义认证对象的ID
     * @return authorizerId
     */
    public String getAuthorizerId() {
        return authorizerId;
    }

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    public ApiPolicyHttpResp withUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
        return this;
    }

    /**
     * 策略后端的Endpoint。 由域名（或IP地址）和端口号组成，总长度不超过255。格式为域名:端口（如：apig.example.com:7443）。如果不写端口，则HTTPS默认端口号为443， HTTP默认端口号为80。 支持环境变量，使用环境变量时，每个变量名的长度为3 ~ 32位的字符串，字符串由英文字母、数字、“_”、“-”组成，且只能以英文开头。 
     * @return urlDomain
     */
    public String getUrlDomain() {
        return urlDomain;
    }

    public void setUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
    }

    public ApiPolicyHttpResp withReqProtocol(ReqProtocolEnum reqProtocol) {
        this.reqProtocol = reqProtocol;
        return this;
    }

    /**
     * 请求协议：HTTP、HTTPS
     * @return reqProtocol
     */
    public ReqProtocolEnum getReqProtocol() {
        return reqProtocol;
    }

    public void setReqProtocol(ReqProtocolEnum reqProtocol) {
        this.reqProtocol = reqProtocol;
    }

    public ApiPolicyHttpResp withReqMethod(ReqMethodEnum reqMethod) {
        this.reqMethod = reqMethod;
        return this;
    }

    /**
     * 请求方式：GET、POST、PUT、DELETE、HEAD、PATCH、OPTIONS、ANY
     * @return reqMethod
     */
    public ReqMethodEnum getReqMethod() {
        return reqMethod;
    }

    public void setReqMethod(ReqMethodEnum reqMethod) {
        this.reqMethod = reqMethod;
    }

    public ApiPolicyHttpResp withReqUri(String reqUri) {
        this.reqUri = reqUri;
        return this;
    }

    /**
     * 请求地址。可以包含请求参数，用{}标识，比如/getUserInfo/{userId}，支持 * % - _ .等特殊字符，总长度不超过512，且满足URI规范。  支持环境变量，使用环境变量时，每个变量名的长度为3 ~ 32位的字符串，字符串由英文字母、数字、中划线、下划线组成，且只能以英文开头。  > 需要服从URI规范。
     * @return reqUri
     */
    public String getReqUri() {
        return reqUri;
    }

    public void setReqUri(String reqUri) {
        this.reqUri = reqUri;
    }

    public ApiPolicyHttpResp withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 服务集成请求后端服务的超时时间。最大超时时间可通过实例特性backend_timeout配置修改，可修改的上限为600000  单位：毫秒。
     * minimum: 1
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ApiPolicyHttpResp withEnableClientSsl(Boolean enableClientSsl) {
        this.enableClientSsl = enableClientSsl;
        return this;
    }

    /**
     * 是否开启双向认证
     * @return enableClientSsl
     */
    public Boolean getEnableClientSsl() {
        return enableClientSsl;
    }

    public void setEnableClientSsl(Boolean enableClientSsl) {
        this.enableClientSsl = enableClientSsl;
    }

    public ApiPolicyHttpResp withRetryCount(String retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     * 服务集成请求后端服务的重试次数，默认为-1，范围[-1,10]
     * @return retryCount
     */
    public String getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(String retryCount) {
        this.retryCount = retryCount;
    }

    public ApiPolicyHttpResp withVpcChannelInfo(VpcInfo vpcChannelInfo) {
        this.vpcChannelInfo = vpcChannelInfo;
        return this;
    }

    public ApiPolicyHttpResp withVpcChannelInfo(Consumer<VpcInfo> vpcChannelInfoSetter) {
        if (this.vpcChannelInfo == null) {
            this.vpcChannelInfo = new VpcInfo();
            vpcChannelInfoSetter.accept(this.vpcChannelInfo);
        }

        return this;
    }

    /**
     * Get vpcChannelInfo
     * @return vpcChannelInfo
     */
    public VpcInfo getVpcChannelInfo() {
        return vpcChannelInfo;
    }

    public void setVpcChannelInfo(VpcInfo vpcChannelInfo) {
        this.vpcChannelInfo = vpcChannelInfo;
    }

    public ApiPolicyHttpResp withVpcChannelStatus(Integer vpcChannelStatus) {
        this.vpcChannelStatus = vpcChannelStatus;
        return this;
    }

    /**
     * 是否使用VPC通道： - 1： 使用VPC通道 - 2：不使用VPC通道
     * @return vpcChannelStatus
     */
    public Integer getVpcChannelStatus() {
        return vpcChannelStatus;
    }

    public void setVpcChannelStatus(Integer vpcChannelStatus) {
        this.vpcChannelStatus = vpcChannelStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiPolicyHttpResp that = (ApiPolicyHttpResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.backendParams, that.backendParams)
            && Objects.equals(this.effectMode, that.effectMode) && Objects.equals(this.authorizerId, that.authorizerId)
            && Objects.equals(this.urlDomain, that.urlDomain) && Objects.equals(this.reqProtocol, that.reqProtocol)
            && Objects.equals(this.reqMethod, that.reqMethod) && Objects.equals(this.reqUri, that.reqUri)
            && Objects.equals(this.timeout, that.timeout) && Objects.equals(this.enableClientSsl, that.enableClientSsl)
            && Objects.equals(this.retryCount, that.retryCount)
            && Objects.equals(this.vpcChannelInfo, that.vpcChannelInfo)
            && Objects.equals(this.vpcChannelStatus, that.vpcChannelStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            conditions,
            backendParams,
            effectMode,
            authorizerId,
            urlDomain,
            reqProtocol,
            reqMethod,
            reqUri,
            timeout,
            enableClientSsl,
            retryCount,
            vpcChannelInfo,
            vpcChannelStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiPolicyHttpResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    backendParams: ").append(toIndentedString(backendParams)).append("\n");
        sb.append("    effectMode: ").append(toIndentedString(effectMode)).append("\n");
        sb.append("    authorizerId: ").append(toIndentedString(authorizerId)).append("\n");
        sb.append("    urlDomain: ").append(toIndentedString(urlDomain)).append("\n");
        sb.append("    reqProtocol: ").append(toIndentedString(reqProtocol)).append("\n");
        sb.append("    reqMethod: ").append(toIndentedString(reqMethod)).append("\n");
        sb.append("    reqUri: ").append(toIndentedString(reqUri)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    enableClientSsl: ").append(toIndentedString(enableClientSsl)).append("\n");
        sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
        sb.append("    vpcChannelInfo: ").append(toIndentedString(vpcChannelInfo)).append("\n");
        sb.append("    vpcChannelStatus: ").append(toIndentedString(vpcChannelStatus)).append("\n");
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
