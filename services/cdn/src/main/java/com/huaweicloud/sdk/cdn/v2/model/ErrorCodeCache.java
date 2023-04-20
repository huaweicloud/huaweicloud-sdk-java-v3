package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CDN状态码缓存时间
 */
public class ErrorCodeCache {

    /**
     * 允许配置的错误码: 400, 403, 404, 405, 414, 500, 501, 502, 503, 504
     */
    public static final class CodeEnum {

        /**
         * Enum NUMBER_400 for value: 400
         */
        public static final CodeEnum NUMBER_400 = new CodeEnum(400);

        /**
         * Enum NUMBER_403 for value: 403
         */
        public static final CodeEnum NUMBER_403 = new CodeEnum(403);

        /**
         * Enum NUMBER_404 for value: 404
         */
        public static final CodeEnum NUMBER_404 = new CodeEnum(404);

        /**
         * Enum NUMBER_405 for value: 405
         */
        public static final CodeEnum NUMBER_405 = new CodeEnum(405);

        /**
         * Enum NUMBER_414 for value: 414
         */
        public static final CodeEnum NUMBER_414 = new CodeEnum(414);

        /**
         * Enum NUMBER_500 for value: 500
         */
        public static final CodeEnum NUMBER_500 = new CodeEnum(500);

        /**
         * Enum NUMBER_501 for value: 501
         */
        public static final CodeEnum NUMBER_501 = new CodeEnum(501);

        /**
         * Enum NUMBER_502 for value: 502
         */
        public static final CodeEnum NUMBER_502 = new CodeEnum(502);

        /**
         * Enum NUMBER_503 for value: 503
         */
        public static final CodeEnum NUMBER_503 = new CodeEnum(503);

        /**
         * Enum NUMBER_504 for value: 504
         */
        public static final CodeEnum NUMBER_504 = new CodeEnum(504);

        private static final Map<Integer, CodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, CodeEnum> createStaticFields() {
            Map<Integer, CodeEnum> map = new HashMap<>();
            map.put(400, NUMBER_400);
            map.put(403, NUMBER_403);
            map.put(404, NUMBER_404);
            map.put(405, NUMBER_405);
            map.put(414, NUMBER_414);
            map.put(500, NUMBER_500);
            map.put(501, NUMBER_501);
            map.put(502, NUMBER_502);
            map.put(503, NUMBER_503);
            map.put(504, NUMBER_504);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        CodeEnum(Integer value) {
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
        public static CodeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            CodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CodeEnum(value);
            }
            return result;
        }

        public static CodeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            CodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CodeEnum) {
                return this.value.equals(((CodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private CodeEnum code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    public ErrorCodeCache withCode(CodeEnum code) {
        this.code = code;
        return this;
    }

    /**
     * 允许配置的错误码: 400, 403, 404, 405, 414, 500, 501, 502, 503, 504
     * @return code
     */
    public CodeEnum getCode() {
        return code;
    }

    public void setCode(CodeEnum code) {
        this.code = code;
    }

    public ErrorCodeCache withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 错误码缓存时间，单位为秒，范围0-31,536,000(一年默认为365天)
     * minimum: 0
     * maximum: 31536000
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorCodeCache errorCodeCache = (ErrorCodeCache) o;
        return Objects.equals(this.code, errorCodeCache.code) && Objects.equals(this.ttl, errorCodeCache.ttl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, ttl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorCodeCache {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
