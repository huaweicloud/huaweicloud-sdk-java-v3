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
 * BackendApiBase
 */
public class BackendApiBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_id")

    private String authorizerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_domain")

    private String urlDomain;

    /**
     * 请求协议，后端类型为GRPC时请求协议可选GRPC、GRPCS
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

        /**
         * Enum GRPC for value: "GRPC"
         */
        public static final ReqProtocolEnum GRPC = new ReqProtocolEnum("GRPC");

        /**
         * Enum GRPCS for value: "GRPCS"
         */
        public static final ReqProtocolEnum GRPCS = new ReqProtocolEnum("GRPCS");

        private static final Map<String, ReqProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReqProtocolEnum> createStaticFields() {
            Map<String, ReqProtocolEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            map.put("GRPC", GRPC);
            map.put("GRPCS", GRPCS);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    /**
     * 请求方式，后端类型为GRPC时请求方式固定为POST
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
    @JsonProperty(value = "version")

    private String version;

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
    @JsonProperty(value = "enable_sm_channel")

    private Boolean enableSmChannel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_time")

    private OffsetDateTime registerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public BackendApiBase withAuthorizerId(String authorizerId) {
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

    public BackendApiBase withUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
        return this;
    }

    /**
     * 后端服务的地址。   由主机（IP或域名）和端口号组成，总长度不超过255。格式为主机:端口（如：apig.example.com:7443）。如果不写端口，则HTTPS默认端口号为443，HTTP默认端口号为80。   支持环境变量，使用环境变量时，每个变量名的长度为3 ~ 32位的字符串，字符串由英文字母、数字、下划线、中划线组成，且只能以英文开头
     * @return urlDomain
     */
    public String getUrlDomain() {
        return urlDomain;
    }

    public void setUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
    }

    public BackendApiBase withReqProtocol(ReqProtocolEnum reqProtocol) {
        this.reqProtocol = reqProtocol;
        return this;
    }

    /**
     * 请求协议，后端类型为GRPC时请求协议可选GRPC、GRPCS
     * @return reqProtocol
     */
    public ReqProtocolEnum getReqProtocol() {
        return reqProtocol;
    }

    public void setReqProtocol(ReqProtocolEnum reqProtocol) {
        this.reqProtocol = reqProtocol;
    }

    public BackendApiBase withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 描述。字符长度不超过255 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BackendApiBase withReqMethod(ReqMethodEnum reqMethod) {
        this.reqMethod = reqMethod;
        return this;
    }

    /**
     * 请求方式，后端类型为GRPC时请求方式固定为POST
     * @return reqMethod
     */
    public ReqMethodEnum getReqMethod() {
        return reqMethod;
    }

    public void setReqMethod(ReqMethodEnum reqMethod) {
        this.reqMethod = reqMethod;
    }

    public BackendApiBase withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * web后端版本，字符长度不超过16
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public BackendApiBase withReqUri(String reqUri) {
        this.reqUri = reqUri;
        return this;
    }

    /**
     * 请求地址。可以包含请求参数，用{}标识，比如/getUserInfo/{userId}，支持 * % - _ . 等特殊字符，总长度不超过512，且满足URI规范。   支持环境变量，使用环境变量时，每个变量名的长度为3 ~ 32位的字符串，字符串由英文字母、数字、中划线、下划线组成，且只能以英文开头。  > 需要服从URI规范。  后端类型为GRPC时请求地址固定为/
     * @return reqUri
     */
    public String getReqUri() {
        return reqUri;
    }

    public void setReqUri(String reqUri) {
        this.reqUri = reqUri;
    }

    public BackendApiBase withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * API网关请求后端服务的超时时间。最大超时时间可通过实例特性backend_timeout配置修改，可修改的上限为600000。  单位：毫秒。
     * minimum: 1
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public BackendApiBase withEnableClientSsl(Boolean enableClientSsl) {
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

    public BackendApiBase withRetryCount(String retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     * 请求后端服务的重试次数，默认为-1，范围[-1,10]。  当该值为-1时，幂等的接口会重试1次，非幂等的不会重试。POST，PATCH方法为非幂等；GET，HEAD，PUT，OPTIONS和DELETE等方法为幂等的。
     * @return retryCount
     */
    public String getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(String retryCount) {
        this.retryCount = retryCount;
    }

    public BackendApiBase withEnableSmChannel(Boolean enableSmChannel) {
        this.enableSmChannel = enableSmChannel;
        return this;
    }

    /**
     * 是否启用SM商密通道。  仅实例支持SM系列商密算法的实例时支持开启。
     * @return enableSmChannel
     */
    public Boolean getEnableSmChannel() {
        return enableSmChannel;
    }

    public void setEnableSmChannel(Boolean enableSmChannel) {
        this.enableSmChannel = enableSmChannel;
    }

    public BackendApiBase withId(String id) {
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

    public BackendApiBase withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 后端状态   - 1： 有效
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BackendApiBase withRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
        return this;
    }

    /**
     * 注册时间
     * @return registerTime
     */
    public OffsetDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(OffsetDateTime registerTime) {
        this.registerTime = registerTime;
    }

    public BackendApiBase withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
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
        BackendApiBase that = (BackendApiBase) obj;
        return Objects.equals(this.authorizerId, that.authorizerId) && Objects.equals(this.urlDomain, that.urlDomain)
            && Objects.equals(this.reqProtocol, that.reqProtocol) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.reqMethod, that.reqMethod) && Objects.equals(this.version, that.version)
            && Objects.equals(this.reqUri, that.reqUri) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.enableClientSsl, that.enableClientSsl)
            && Objects.equals(this.retryCount, that.retryCount)
            && Objects.equals(this.enableSmChannel, that.enableSmChannel) && Objects.equals(this.id, that.id)
            && Objects.equals(this.status, that.status) && Objects.equals(this.registerTime, that.registerTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizerId,
            urlDomain,
            reqProtocol,
            remark,
            reqMethod,
            version,
            reqUri,
            timeout,
            enableClientSsl,
            retryCount,
            enableSmChannel,
            id,
            status,
            registerTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackendApiBase {\n");
        sb.append("    authorizerId: ").append(toIndentedString(authorizerId)).append("\n");
        sb.append("    urlDomain: ").append(toIndentedString(urlDomain)).append("\n");
        sb.append("    reqProtocol: ").append(toIndentedString(reqProtocol)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    reqMethod: ").append(toIndentedString(reqMethod)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    reqUri: ").append(toIndentedString(reqUri)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    enableClientSsl: ").append(toIndentedString(enableClientSsl)).append("\n");
        sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
        sb.append("    enableSmChannel: ").append(toIndentedString(enableSmChannel)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
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
