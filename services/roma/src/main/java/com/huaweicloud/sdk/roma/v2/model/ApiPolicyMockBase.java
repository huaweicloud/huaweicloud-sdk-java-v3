package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ApiPolicyMockBase
 */
public class ApiPolicyMockBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_content")

    private String resultContent;

    /**
     * mock后端自定义状态码： \"200\": \"OK\", \"201\": \"Created\", \"202\": \"Accepted\", \"203\": \"NonAuthoritativeInformation\", \"204\": \"NoContent\", \"205\": \"ResetContent\", \"206\": \"PartialContent\", \"300\": \"MultipleChoices\", \"301\": \"MovedPermanently\", \"302\": \"Found\", \"303\": \"SeeOther\", \"304\": \"NotModified\", \"305\": \"UseProxy\", \"306\": \"Unused\", \"307\": \"TemporaryRedirect\", \"400\": \"BadRequest\", \"401\": \"Unauthorized\", \"402\": \"PaymentRequired\", \"403\": \"Forbidden\", \"404\": \"NotFound\", \"405\": \"MethodNotAllowed\", \"406\": \"NotAcceptable\", \"407\": \"ProxyAuthenticationRequired\", \"408\": \"RequestTimeout\", \"409\": \"Conflict\", \"410\": \"Gone\", \"411\": \"LengthRequired\", \"412\": \"PreconditionFailed\", \"413\": \"RequestEntityTooLarge\", \"414\": \"RequestURITooLong\", \"415\": \"UnsupportedMediaType\", \"416\": \"RequestedRangeNotSatisfiable\", \"417\": \"ExpectationFailed\", \"450\": \"ParameterRequried\", \"451\": \"MethodConnectException\", \"500\": \"InternalServerError\", \"501\": \"NotImplemented\", \"502\": \"BadGateway\", \"503\": \"ServiceUnavailable\", \"504\": \"GatewayTimeout\", \"505\": \"HTTPVersionNotSupported\",
     */
    public static final class StatusCodeEnum {

        /**
         * Enum NUMBER_200 for value: 200
         */
        public static final StatusCodeEnum NUMBER_200 = new StatusCodeEnum(200);

        /**
         * Enum NUMBER_201 for value: 201
         */
        public static final StatusCodeEnum NUMBER_201 = new StatusCodeEnum(201);

        /**
         * Enum NUMBER_202 for value: 202
         */
        public static final StatusCodeEnum NUMBER_202 = new StatusCodeEnum(202);

        /**
         * Enum NUMBER_203 for value: 203
         */
        public static final StatusCodeEnum NUMBER_203 = new StatusCodeEnum(203);

        /**
         * Enum NUMBER_204 for value: 204
         */
        public static final StatusCodeEnum NUMBER_204 = new StatusCodeEnum(204);

        /**
         * Enum NUMBER_205 for value: 205
         */
        public static final StatusCodeEnum NUMBER_205 = new StatusCodeEnum(205);

        /**
         * Enum NUMBER_206 for value: 206
         */
        public static final StatusCodeEnum NUMBER_206 = new StatusCodeEnum(206);

        /**
         * Enum NUMBER_300 for value: 300
         */
        public static final StatusCodeEnum NUMBER_300 = new StatusCodeEnum(300);

        /**
         * Enum NUMBER_301 for value: 301
         */
        public static final StatusCodeEnum NUMBER_301 = new StatusCodeEnum(301);

        /**
         * Enum NUMBER_302 for value: 302
         */
        public static final StatusCodeEnum NUMBER_302 = new StatusCodeEnum(302);

        /**
         * Enum NUMBER_303 for value: 303
         */
        public static final StatusCodeEnum NUMBER_303 = new StatusCodeEnum(303);

        /**
         * Enum NUMBER_304 for value: 304
         */
        public static final StatusCodeEnum NUMBER_304 = new StatusCodeEnum(304);

        /**
         * Enum NUMBER_305 for value: 305
         */
        public static final StatusCodeEnum NUMBER_305 = new StatusCodeEnum(305);

        /**
         * Enum NUMBER_306 for value: 306
         */
        public static final StatusCodeEnum NUMBER_306 = new StatusCodeEnum(306);

        /**
         * Enum NUMBER_307 for value: 307
         */
        public static final StatusCodeEnum NUMBER_307 = new StatusCodeEnum(307);

        /**
         * Enum NUMBER_400 for value: 400
         */
        public static final StatusCodeEnum NUMBER_400 = new StatusCodeEnum(400);

        /**
         * Enum NUMBER_401 for value: 401
         */
        public static final StatusCodeEnum NUMBER_401 = new StatusCodeEnum(401);

        /**
         * Enum NUMBER_402 for value: 402
         */
        public static final StatusCodeEnum NUMBER_402 = new StatusCodeEnum(402);

        /**
         * Enum NUMBER_403 for value: 403
         */
        public static final StatusCodeEnum NUMBER_403 = new StatusCodeEnum(403);

        /**
         * Enum NUMBER_404 for value: 404
         */
        public static final StatusCodeEnum NUMBER_404 = new StatusCodeEnum(404);

        /**
         * Enum NUMBER_405 for value: 405
         */
        public static final StatusCodeEnum NUMBER_405 = new StatusCodeEnum(405);

        /**
         * Enum NUMBER_406 for value: 406
         */
        public static final StatusCodeEnum NUMBER_406 = new StatusCodeEnum(406);

        /**
         * Enum NUMBER_407 for value: 407
         */
        public static final StatusCodeEnum NUMBER_407 = new StatusCodeEnum(407);

        /**
         * Enum NUMBER_408 for value: 408
         */
        public static final StatusCodeEnum NUMBER_408 = new StatusCodeEnum(408);

        /**
         * Enum NUMBER_409 for value: 409
         */
        public static final StatusCodeEnum NUMBER_409 = new StatusCodeEnum(409);

        /**
         * Enum NUMBER_410 for value: 410
         */
        public static final StatusCodeEnum NUMBER_410 = new StatusCodeEnum(410);

        /**
         * Enum NUMBER_411 for value: 411
         */
        public static final StatusCodeEnum NUMBER_411 = new StatusCodeEnum(411);

        /**
         * Enum NUMBER_412 for value: 412
         */
        public static final StatusCodeEnum NUMBER_412 = new StatusCodeEnum(412);

        /**
         * Enum NUMBER_413 for value: 413
         */
        public static final StatusCodeEnum NUMBER_413 = new StatusCodeEnum(413);

        /**
         * Enum NUMBER_414 for value: 414
         */
        public static final StatusCodeEnum NUMBER_414 = new StatusCodeEnum(414);

        /**
         * Enum NUMBER_415 for value: 415
         */
        public static final StatusCodeEnum NUMBER_415 = new StatusCodeEnum(415);

        /**
         * Enum NUMBER_416 for value: 416
         */
        public static final StatusCodeEnum NUMBER_416 = new StatusCodeEnum(416);

        /**
         * Enum NUMBER_417 for value: 417
         */
        public static final StatusCodeEnum NUMBER_417 = new StatusCodeEnum(417);

        /**
         * Enum NUMBER_450 for value: 450
         */
        public static final StatusCodeEnum NUMBER_450 = new StatusCodeEnum(450);

        /**
         * Enum NUMBER_451 for value: 451
         */
        public static final StatusCodeEnum NUMBER_451 = new StatusCodeEnum(451);

        /**
         * Enum NUMBER_500 for value: 500
         */
        public static final StatusCodeEnum NUMBER_500 = new StatusCodeEnum(500);

        /**
         * Enum NUMBER_501 for value: 501
         */
        public static final StatusCodeEnum NUMBER_501 = new StatusCodeEnum(501);

        /**
         * Enum NUMBER_502 for value: 502
         */
        public static final StatusCodeEnum NUMBER_502 = new StatusCodeEnum(502);

        /**
         * Enum NUMBER_503 for value: 503
         */
        public static final StatusCodeEnum NUMBER_503 = new StatusCodeEnum(503);

        /**
         * Enum NUMBER_504 for value: 504
         */
        public static final StatusCodeEnum NUMBER_504 = new StatusCodeEnum(504);

        /**
         * Enum NUMBER_505 for value: 505
         */
        public static final StatusCodeEnum NUMBER_505 = new StatusCodeEnum(505);

        private static final Map<Integer, StatusCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusCodeEnum> createStaticFields() {
            Map<Integer, StatusCodeEnum> map = new HashMap<>();
            map.put(200, NUMBER_200);
            map.put(201, NUMBER_201);
            map.put(202, NUMBER_202);
            map.put(203, NUMBER_203);
            map.put(204, NUMBER_204);
            map.put(205, NUMBER_205);
            map.put(206, NUMBER_206);
            map.put(300, NUMBER_300);
            map.put(301, NUMBER_301);
            map.put(302, NUMBER_302);
            map.put(303, NUMBER_303);
            map.put(304, NUMBER_304);
            map.put(305, NUMBER_305);
            map.put(306, NUMBER_306);
            map.put(307, NUMBER_307);
            map.put(400, NUMBER_400);
            map.put(401, NUMBER_401);
            map.put(402, NUMBER_402);
            map.put(403, NUMBER_403);
            map.put(404, NUMBER_404);
            map.put(405, NUMBER_405);
            map.put(406, NUMBER_406);
            map.put(407, NUMBER_407);
            map.put(408, NUMBER_408);
            map.put(409, NUMBER_409);
            map.put(410, NUMBER_410);
            map.put(411, NUMBER_411);
            map.put(412, NUMBER_412);
            map.put(413, NUMBER_413);
            map.put(414, NUMBER_414);
            map.put(415, NUMBER_415);
            map.put(416, NUMBER_416);
            map.put(417, NUMBER_417);
            map.put(450, NUMBER_450);
            map.put(451, NUMBER_451);
            map.put(500, NUMBER_500);
            map.put(501, NUMBER_501);
            map.put(502, NUMBER_502);
            map.put(503, NUMBER_503);
            map.put(504, NUMBER_504);
            map.put(505, NUMBER_505);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusCodeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusCodeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            StatusCodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusCodeEnum(value);
            }
            return result;
        }

        public static StatusCodeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            StatusCodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusCodeEnum) {
                return this.value.equals(((StatusCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private StatusCodeEnum statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header")

    private String header;

    public ApiPolicyMockBase withResultContent(String resultContent) {
        this.resultContent = resultContent;
        return this;
    }

    /**
     * 返回结果
     * @return resultContent
     */
    public String getResultContent() {
        return resultContent;
    }

    public void setResultContent(String resultContent) {
        this.resultContent = resultContent;
    }

    public ApiPolicyMockBase withStatusCode(StatusCodeEnum statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * mock后端自定义状态码： \"200\": \"OK\", \"201\": \"Created\", \"202\": \"Accepted\", \"203\": \"NonAuthoritativeInformation\", \"204\": \"NoContent\", \"205\": \"ResetContent\", \"206\": \"PartialContent\", \"300\": \"MultipleChoices\", \"301\": \"MovedPermanently\", \"302\": \"Found\", \"303\": \"SeeOther\", \"304\": \"NotModified\", \"305\": \"UseProxy\", \"306\": \"Unused\", \"307\": \"TemporaryRedirect\", \"400\": \"BadRequest\", \"401\": \"Unauthorized\", \"402\": \"PaymentRequired\", \"403\": \"Forbidden\", \"404\": \"NotFound\", \"405\": \"MethodNotAllowed\", \"406\": \"NotAcceptable\", \"407\": \"ProxyAuthenticationRequired\", \"408\": \"RequestTimeout\", \"409\": \"Conflict\", \"410\": \"Gone\", \"411\": \"LengthRequired\", \"412\": \"PreconditionFailed\", \"413\": \"RequestEntityTooLarge\", \"414\": \"RequestURITooLong\", \"415\": \"UnsupportedMediaType\", \"416\": \"RequestedRangeNotSatisfiable\", \"417\": \"ExpectationFailed\", \"450\": \"ParameterRequried\", \"451\": \"MethodConnectException\", \"500\": \"InternalServerError\", \"501\": \"NotImplemented\", \"502\": \"BadGateway\", \"503\": \"ServiceUnavailable\", \"504\": \"GatewayTimeout\", \"505\": \"HTTPVersionNotSupported\",
     * @return statusCode
     */
    public StatusCodeEnum getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCodeEnum statusCode) {
        this.statusCode = statusCode;
    }

    public ApiPolicyMockBase withHeader(String header) {
        this.header = header;
        return this;
    }

    /**
     * mock后端自定义响应头header  格式：[{\"key\":\"\",\"value\": \"\", \"remark:\"\"}, {\"key2\":\"\",\"value2\": \"\",\"remark2:\"\"}]  参数说明：  key：mock后端自定义响应头header key, 支持英文，数字，中划线，且只能以英文字母或数字开头，1 ~ 64字符  value： mock后端自定义响应头header value，中文字符必须为UTF-8或者unicode编码, 不能为空，最大长度为10240  remark：mock后端自定义响应头header remark，中文字符必须为UTF-8 或者unicode编码，可以为空，最大长度为2048
     * @return header
     */
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiPolicyMockBase apiPolicyMockBase = (ApiPolicyMockBase) o;
        return Objects.equals(this.resultContent, apiPolicyMockBase.resultContent)
            && Objects.equals(this.statusCode, apiPolicyMockBase.statusCode)
            && Objects.equals(this.header, apiPolicyMockBase.header);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultContent, statusCode, header);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiPolicyMockBase {\n");
        sb.append("    resultContent: ").append(toIndentedString(resultContent)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
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
