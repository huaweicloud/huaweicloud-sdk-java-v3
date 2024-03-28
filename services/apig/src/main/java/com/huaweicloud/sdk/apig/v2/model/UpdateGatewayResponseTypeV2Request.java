package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateGatewayResponseTypeV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_id")

    private String responseId;

    /**
     * 错误类型 - AUTH_FAILURE: 认证失败，IAM或APP认证校验失败 - AUTH_HEADER_MISSING: 认证身份来源信息缺失 - AUTHORIZER_FAILURE: 自定义认证方返回认证失败 - AUTHORIZER_CONF_FAILURE:自定义认证方异常，通信失败、返回异常响应等错误 - AUTHORIZER_IDENTITIES_FAILURE: 前端自定义认证的身份来源信息缺失或不合法错误 - BACKEND_UNAVAILABLE: 后端不可用，网络不可达错误 - BACKEND_TIMEOUT: 后端超时，与后端的网络交互超过预配置的时间错误 - THROTTLED: API调用次数超出所配置的流量策略阈值 - UNAUTHORIZED: 使用的凭据未被授权访问该API - ACCESS_DENIED: 拒绝访问，如触发配置的访问控制策略、或异常攻击检测拦截 - NOT_FOUND: 未匹配到API错误 - REQUEST_PARAMETERS_FAILURE: 请求参数校验失败、不支持的HTTP方法 - DEFAULT_4XX: 其它4XX类错误 - DEFAULT_5XX: 其它5XX类错误 - THIRD_AUTH_FAILURE: 第三方认证方返回认证失败 - THIRD_AUTH_IDENTITIES_FAILURE: 第三方认证的身份来源信息缺失或不合法错误 - THIRD_AUTH_CONF_FAILURE: 第三方认证方异常，通信失败、返回异常响应等错误 - ORCHESTRATION_PARAMETER_NOT_FOUND: 参数编排失败，请求中没有待编排的入参 - ORCHESTRATION_FAILURE: 参数编排失败，没有编排规则匹配成功
     */
    public static final class ResponseTypeEnum {

        /**
         * Enum AUTH_FAILURE for value: "AUTH_FAILURE"
         */
        public static final ResponseTypeEnum AUTH_FAILURE = new ResponseTypeEnum("AUTH_FAILURE");

        /**
         * Enum AUTH_HEADER_MISSING for value: "AUTH_HEADER_MISSING"
         */
        public static final ResponseTypeEnum AUTH_HEADER_MISSING = new ResponseTypeEnum("AUTH_HEADER_MISSING");

        /**
         * Enum AUTHORIZER_FAILURE for value: "AUTHORIZER_FAILURE"
         */
        public static final ResponseTypeEnum AUTHORIZER_FAILURE = new ResponseTypeEnum("AUTHORIZER_FAILURE");

        /**
         * Enum AUTHORIZER_CONF_FAILURE for value: "AUTHORIZER_CONF_FAILURE"
         */
        public static final ResponseTypeEnum AUTHORIZER_CONF_FAILURE = new ResponseTypeEnum("AUTHORIZER_CONF_FAILURE");

        /**
         * Enum AUTHORIZER_IDENTITIES_FAILURE for value: "AUTHORIZER_IDENTITIES_FAILURE"
         */
        public static final ResponseTypeEnum AUTHORIZER_IDENTITIES_FAILURE =
            new ResponseTypeEnum("AUTHORIZER_IDENTITIES_FAILURE");

        /**
         * Enum BACKEND_UNAVAILABLE for value: "BACKEND_UNAVAILABLE"
         */
        public static final ResponseTypeEnum BACKEND_UNAVAILABLE = new ResponseTypeEnum("BACKEND_UNAVAILABLE");

        /**
         * Enum BACKEND_TIMEOUT for value: "BACKEND_TIMEOUT"
         */
        public static final ResponseTypeEnum BACKEND_TIMEOUT = new ResponseTypeEnum("BACKEND_TIMEOUT");

        /**
         * Enum THROTTLED for value: "THROTTLED"
         */
        public static final ResponseTypeEnum THROTTLED = new ResponseTypeEnum("THROTTLED");

        /**
         * Enum UNAUTHORIZED for value: "UNAUTHORIZED"
         */
        public static final ResponseTypeEnum UNAUTHORIZED = new ResponseTypeEnum("UNAUTHORIZED");

        /**
         * Enum ACCESS_DENIED for value: "ACCESS_DENIED"
         */
        public static final ResponseTypeEnum ACCESS_DENIED = new ResponseTypeEnum("ACCESS_DENIED");

        /**
         * Enum NOT_FOUND for value: "NOT_FOUND"
         */
        public static final ResponseTypeEnum NOT_FOUND = new ResponseTypeEnum("NOT_FOUND");

        /**
         * Enum REQUEST_PARAMETERS_FAILURE for value: "REQUEST_PARAMETERS_FAILURE"
         */
        public static final ResponseTypeEnum REQUEST_PARAMETERS_FAILURE =
            new ResponseTypeEnum("REQUEST_PARAMETERS_FAILURE");

        /**
         * Enum DEFAULT_4XX for value: "DEFAULT_4XX"
         */
        public static final ResponseTypeEnum DEFAULT_4XX = new ResponseTypeEnum("DEFAULT_4XX");

        /**
         * Enum DEFAULT_5XX for value: "DEFAULT_5XX"
         */
        public static final ResponseTypeEnum DEFAULT_5XX = new ResponseTypeEnum("DEFAULT_5XX");

        /**
         * Enum THIRD_AUTH_FAILURE for value: "THIRD_AUTH_FAILURE"
         */
        public static final ResponseTypeEnum THIRD_AUTH_FAILURE = new ResponseTypeEnum("THIRD_AUTH_FAILURE");

        /**
         * Enum THIRD_AUTH_IDENTITIES_FAILURE for value: "THIRD_AUTH_IDENTITIES_FAILURE"
         */
        public static final ResponseTypeEnum THIRD_AUTH_IDENTITIES_FAILURE =
            new ResponseTypeEnum("THIRD_AUTH_IDENTITIES_FAILURE");

        /**
         * Enum THIRD_AUTH_CONF_FAILURE for value: "THIRD_AUTH_CONF_FAILURE"
         */
        public static final ResponseTypeEnum THIRD_AUTH_CONF_FAILURE = new ResponseTypeEnum("THIRD_AUTH_CONF_FAILURE");

        /**
         * Enum ORCHESTRATION_PARAMETER_NOT_FOUND for value: "ORCHESTRATION_PARAMETER_NOT_FOUND"
         */
        public static final ResponseTypeEnum ORCHESTRATION_PARAMETER_NOT_FOUND =
            new ResponseTypeEnum("ORCHESTRATION_PARAMETER_NOT_FOUND");

        /**
         * Enum ORCHESTRATION_FAILURE for value: "ORCHESTRATION_FAILURE"
         */
        public static final ResponseTypeEnum ORCHESTRATION_FAILURE = new ResponseTypeEnum("ORCHESTRATION_FAILURE");

        private static final Map<String, ResponseTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResponseTypeEnum> createStaticFields() {
            Map<String, ResponseTypeEnum> map = new HashMap<>();
            map.put("AUTH_FAILURE", AUTH_FAILURE);
            map.put("AUTH_HEADER_MISSING", AUTH_HEADER_MISSING);
            map.put("AUTHORIZER_FAILURE", AUTHORIZER_FAILURE);
            map.put("AUTHORIZER_CONF_FAILURE", AUTHORIZER_CONF_FAILURE);
            map.put("AUTHORIZER_IDENTITIES_FAILURE", AUTHORIZER_IDENTITIES_FAILURE);
            map.put("BACKEND_UNAVAILABLE", BACKEND_UNAVAILABLE);
            map.put("BACKEND_TIMEOUT", BACKEND_TIMEOUT);
            map.put("THROTTLED", THROTTLED);
            map.put("UNAUTHORIZED", UNAUTHORIZED);
            map.put("ACCESS_DENIED", ACCESS_DENIED);
            map.put("NOT_FOUND", NOT_FOUND);
            map.put("REQUEST_PARAMETERS_FAILURE", REQUEST_PARAMETERS_FAILURE);
            map.put("DEFAULT_4XX", DEFAULT_4XX);
            map.put("DEFAULT_5XX", DEFAULT_5XX);
            map.put("THIRD_AUTH_FAILURE", THIRD_AUTH_FAILURE);
            map.put("THIRD_AUTH_IDENTITIES_FAILURE", THIRD_AUTH_IDENTITIES_FAILURE);
            map.put("THIRD_AUTH_CONF_FAILURE", THIRD_AUTH_CONF_FAILURE);
            map.put("ORCHESTRATION_PARAMETER_NOT_FOUND", ORCHESTRATION_PARAMETER_NOT_FOUND);
            map.put("ORCHESTRATION_FAILURE", ORCHESTRATION_FAILURE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResponseTypeEnum(String value) {
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
        public static ResponseTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResponseTypeEnum(value));
        }

        public static ResponseTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResponseTypeEnum) {
                return this.value.equals(((ResponseTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_type")

    private ResponseTypeEnum responseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ResponseInfo body;

    public UpdateGatewayResponseTypeV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，在API网关控制台的“实例信息”中获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateGatewayResponseTypeV2Request withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组的编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public UpdateGatewayResponseTypeV2Request withResponseId(String responseId) {
        this.responseId = responseId;
        return this;
    }

    /**
     * 响应编号
     * @return responseId
     */
    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public UpdateGatewayResponseTypeV2Request withResponseType(ResponseTypeEnum responseType) {
        this.responseType = responseType;
        return this;
    }

    /**
     * 错误类型 - AUTH_FAILURE: 认证失败，IAM或APP认证校验失败 - AUTH_HEADER_MISSING: 认证身份来源信息缺失 - AUTHORIZER_FAILURE: 自定义认证方返回认证失败 - AUTHORIZER_CONF_FAILURE:自定义认证方异常，通信失败、返回异常响应等错误 - AUTHORIZER_IDENTITIES_FAILURE: 前端自定义认证的身份来源信息缺失或不合法错误 - BACKEND_UNAVAILABLE: 后端不可用，网络不可达错误 - BACKEND_TIMEOUT: 后端超时，与后端的网络交互超过预配置的时间错误 - THROTTLED: API调用次数超出所配置的流量策略阈值 - UNAUTHORIZED: 使用的凭据未被授权访问该API - ACCESS_DENIED: 拒绝访问，如触发配置的访问控制策略、或异常攻击检测拦截 - NOT_FOUND: 未匹配到API错误 - REQUEST_PARAMETERS_FAILURE: 请求参数校验失败、不支持的HTTP方法 - DEFAULT_4XX: 其它4XX类错误 - DEFAULT_5XX: 其它5XX类错误 - THIRD_AUTH_FAILURE: 第三方认证方返回认证失败 - THIRD_AUTH_IDENTITIES_FAILURE: 第三方认证的身份来源信息缺失或不合法错误 - THIRD_AUTH_CONF_FAILURE: 第三方认证方异常，通信失败、返回异常响应等错误 - ORCHESTRATION_PARAMETER_NOT_FOUND: 参数编排失败，请求中没有待编排的入参 - ORCHESTRATION_FAILURE: 参数编排失败，没有编排规则匹配成功
     * @return responseType
     */
    public ResponseTypeEnum getResponseType() {
        return responseType;
    }

    public void setResponseType(ResponseTypeEnum responseType) {
        this.responseType = responseType;
    }

    public UpdateGatewayResponseTypeV2Request withBody(ResponseInfo body) {
        this.body = body;
        return this;
    }

    public UpdateGatewayResponseTypeV2Request withBody(Consumer<ResponseInfo> bodySetter) {
        if (this.body == null) {
            this.body = new ResponseInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ResponseInfo getBody() {
        return body;
    }

    public void setBody(ResponseInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGatewayResponseTypeV2Request that = (UpdateGatewayResponseTypeV2Request) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.responseId, that.responseId) && Objects.equals(this.responseType, that.responseType)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupId, responseId, responseType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGatewayResponseTypeV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
        sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
