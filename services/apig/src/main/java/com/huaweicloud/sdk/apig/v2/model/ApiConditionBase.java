package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ApiConditionBase
 */
public class ApiConditionBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_param_name")

    private String reqParamName;

    /**
     * 系统参数-网关内置参数名称。策略类型为system时必选。支持以下参数 - req_path：请求路径。如 /a/b - req_method：请求方法。如 GET 
     */
    public static final class SysParamNameEnum {

        /**
         * Enum REQ_PATH for value: "req_path"
         */
        public static final SysParamNameEnum REQ_PATH = new SysParamNameEnum("req_path");

        /**
         * Enum REQ_METHOD for value: "req_method"
         */
        public static final SysParamNameEnum REQ_METHOD = new SysParamNameEnum("req_method");

        private static final Map<String, SysParamNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SysParamNameEnum> createStaticFields() {
            Map<String, SysParamNameEnum> map = new HashMap<>();
            map.put("req_path", REQ_PATH);
            map.put("req_method", REQ_METHOD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SysParamNameEnum(String value) {
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
        public static SysParamNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SysParamNameEnum(value));
        }

        public static SysParamNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SysParamNameEnum) {
                return this.value.equals(((SysParamNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_param_name")

    private SysParamNameEnum sysParamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cookie_param_name")

    private String cookieParamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frontend_authorizer_param_name")

    private String frontendAuthorizerParamName;

    /**
     * 策略条件 - exact：绝对匹配 - enum：枚举 - pattern：正则  策略类型为param，system，cookie，frontend_authorizer时必选 
     */
    public static final class ConditionTypeEnum {

        /**
         * Enum EXACT for value: "exact"
         */
        public static final ConditionTypeEnum EXACT = new ConditionTypeEnum("exact");

        /**
         * Enum ENUM for value: "enum"
         */
        public static final ConditionTypeEnum ENUM = new ConditionTypeEnum("enum");

        /**
         * Enum PATTERN for value: "pattern"
         */
        public static final ConditionTypeEnum PATTERN = new ConditionTypeEnum("pattern");

        private static final Map<String, ConditionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionTypeEnum> createStaticFields() {
            Map<String, ConditionTypeEnum> map = new HashMap<>();
            map.put("exact", EXACT);
            map.put("enum", ENUM);
            map.put("pattern", PATTERN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConditionTypeEnum(String value) {
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
        public static ConditionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConditionTypeEnum(value));
        }

        public static ConditionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConditionTypeEnum) {
                return this.value.equals(((ConditionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_type")

    private ConditionTypeEnum conditionType;

    /**
     * 策略类型 - param：参数 - source：源IP - system: 系统参数-网关内置参数 - cookie: COOKIE参数 - frontend_authorizer: 系统参数-前端认证参数
     */
    public static final class ConditionOriginEnum {

        /**
         * Enum PARAM for value: "param"
         */
        public static final ConditionOriginEnum PARAM = new ConditionOriginEnum("param");

        /**
         * Enum SOURCE for value: "source"
         */
        public static final ConditionOriginEnum SOURCE = new ConditionOriginEnum("source");

        /**
         * Enum SYSTEM for value: "system"
         */
        public static final ConditionOriginEnum SYSTEM = new ConditionOriginEnum("system");

        /**
         * Enum COOKIE for value: "cookie"
         */
        public static final ConditionOriginEnum COOKIE = new ConditionOriginEnum("cookie");

        /**
         * Enum FRONTEND_AUTHORIZER for value: "frontend_authorizer"
         */
        public static final ConditionOriginEnum FRONTEND_AUTHORIZER = new ConditionOriginEnum("frontend_authorizer");

        private static final Map<String, ConditionOriginEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionOriginEnum> createStaticFields() {
            Map<String, ConditionOriginEnum> map = new HashMap<>();
            map.put("param", PARAM);
            map.put("source", SOURCE);
            map.put("system", SYSTEM);
            map.put("cookie", COOKIE);
            map.put("frontend_authorizer", FRONTEND_AUTHORIZER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConditionOriginEnum(String value) {
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
        public static ConditionOriginEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConditionOriginEnum(value));
        }

        public static ConditionOriginEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConditionOriginEnum) {
                return this.value.equals(((ConditionOriginEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_origin")

    private ConditionOriginEnum conditionOrigin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_value")

    private String conditionValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapped_param_name")

    private String mappedParamName;

    /**
     * 参数编排规则编排后生成的参数所在的位置，当condition_origin为orchestration的时候必填，并且生成的参数所在的位置必须在api绑定的编排规则中存在
     */
    public static final class MappedParamLocationEnum {

        /**
         * Enum HEADER for value: "header"
         */
        public static final MappedParamLocationEnum HEADER = new MappedParamLocationEnum("header");

        /**
         * Enum QUERY for value: "query"
         */
        public static final MappedParamLocationEnum QUERY = new MappedParamLocationEnum("query");

        private static final Map<String, MappedParamLocationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MappedParamLocationEnum> createStaticFields() {
            Map<String, MappedParamLocationEnum> map = new HashMap<>();
            map.put("header", HEADER);
            map.put("query", QUERY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MappedParamLocationEnum(String value) {
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
        public static MappedParamLocationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MappedParamLocationEnum(value));
        }

        public static MappedParamLocationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MappedParamLocationEnum) {
                return this.value.equals(((MappedParamLocationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapped_param_location")

    private MappedParamLocationEnum mappedParamLocation;

    public ApiConditionBase withReqParamName(String reqParamName) {
        this.reqParamName = reqParamName;
        return this;
    }

    /**
     * 关联的请求参数对象名称。策略类型为param时必选
     * @return reqParamName
     */
    public String getReqParamName() {
        return reqParamName;
    }

    public void setReqParamName(String reqParamName) {
        this.reqParamName = reqParamName;
    }

    public ApiConditionBase withSysParamName(SysParamNameEnum sysParamName) {
        this.sysParamName = sysParamName;
        return this;
    }

    /**
     * 系统参数-网关内置参数名称。策略类型为system时必选。支持以下参数 - req_path：请求路径。如 /a/b - req_method：请求方法。如 GET 
     * @return sysParamName
     */
    public SysParamNameEnum getSysParamName() {
        return sysParamName;
    }

    public void setSysParamName(SysParamNameEnum sysParamName) {
        this.sysParamName = sysParamName;
    }

    public ApiConditionBase withCookieParamName(String cookieParamName) {
        this.cookieParamName = cookieParamName;
        return this;
    }

    /**
     * COOKIE参数名称。策略类型为cookie时必选
     * @return cookieParamName
     */
    public String getCookieParamName() {
        return cookieParamName;
    }

    public void setCookieParamName(String cookieParamName) {
        this.cookieParamName = cookieParamName;
    }

    public ApiConditionBase withFrontendAuthorizerParamName(String frontendAuthorizerParamName) {
        this.frontendAuthorizerParamName = frontendAuthorizerParamName;
        return this;
    }

    /**
     * 系统参数-前端认证参数名称。策略类型为frontend_authorizer时必选，前端认证参数名称以\"$context.authorizer.frontend.\"字符串为前缀。例如，前端认证参数名称为user_name，加上前缀为$context.authorizer.frontend.user_name。
     * @return frontendAuthorizerParamName
     */
    public String getFrontendAuthorizerParamName() {
        return frontendAuthorizerParamName;
    }

    public void setFrontendAuthorizerParamName(String frontendAuthorizerParamName) {
        this.frontendAuthorizerParamName = frontendAuthorizerParamName;
    }

    public ApiConditionBase withConditionType(ConditionTypeEnum conditionType) {
        this.conditionType = conditionType;
        return this;
    }

    /**
     * 策略条件 - exact：绝对匹配 - enum：枚举 - pattern：正则  策略类型为param，system，cookie，frontend_authorizer时必选 
     * @return conditionType
     */
    public ConditionTypeEnum getConditionType() {
        return conditionType;
    }

    public void setConditionType(ConditionTypeEnum conditionType) {
        this.conditionType = conditionType;
    }

    public ApiConditionBase withConditionOrigin(ConditionOriginEnum conditionOrigin) {
        this.conditionOrigin = conditionOrigin;
        return this;
    }

    /**
     * 策略类型 - param：参数 - source：源IP - system: 系统参数-网关内置参数 - cookie: COOKIE参数 - frontend_authorizer: 系统参数-前端认证参数
     * @return conditionOrigin
     */
    public ConditionOriginEnum getConditionOrigin() {
        return conditionOrigin;
    }

    public void setConditionOrigin(ConditionOriginEnum conditionOrigin) {
        this.conditionOrigin = conditionOrigin;
    }

    public ApiConditionBase withConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
        return this;
    }

    /**
     * 策略值。
     * @return conditionValue
     */
    public String getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
    }

    public ApiConditionBase withMappedParamName(String mappedParamName) {
        this.mappedParamName = mappedParamName;
        return this;
    }

    /**
     * 参数编排规则编排后生成的参数名称，当condition_origin为orchestration的时候必填，并且生成的参数名称必须在api绑定的编排规则中存在
     * @return mappedParamName
     */
    public String getMappedParamName() {
        return mappedParamName;
    }

    public void setMappedParamName(String mappedParamName) {
        this.mappedParamName = mappedParamName;
    }

    public ApiConditionBase withMappedParamLocation(MappedParamLocationEnum mappedParamLocation) {
        this.mappedParamLocation = mappedParamLocation;
        return this;
    }

    /**
     * 参数编排规则编排后生成的参数所在的位置，当condition_origin为orchestration的时候必填，并且生成的参数所在的位置必须在api绑定的编排规则中存在
     * @return mappedParamLocation
     */
    public MappedParamLocationEnum getMappedParamLocation() {
        return mappedParamLocation;
    }

    public void setMappedParamLocation(MappedParamLocationEnum mappedParamLocation) {
        this.mappedParamLocation = mappedParamLocation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiConditionBase that = (ApiConditionBase) obj;
        return Objects.equals(this.reqParamName, that.reqParamName)
            && Objects.equals(this.sysParamName, that.sysParamName)
            && Objects.equals(this.cookieParamName, that.cookieParamName)
            && Objects.equals(this.frontendAuthorizerParamName, that.frontendAuthorizerParamName)
            && Objects.equals(this.conditionType, that.conditionType)
            && Objects.equals(this.conditionOrigin, that.conditionOrigin)
            && Objects.equals(this.conditionValue, that.conditionValue)
            && Objects.equals(this.mappedParamName, that.mappedParamName)
            && Objects.equals(this.mappedParamLocation, that.mappedParamLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reqParamName,
            sysParamName,
            cookieParamName,
            frontendAuthorizerParamName,
            conditionType,
            conditionOrigin,
            conditionValue,
            mappedParamName,
            mappedParamLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiConditionBase {\n");
        sb.append("    reqParamName: ").append(toIndentedString(reqParamName)).append("\n");
        sb.append("    sysParamName: ").append(toIndentedString(sysParamName)).append("\n");
        sb.append("    cookieParamName: ").append(toIndentedString(cookieParamName)).append("\n");
        sb.append("    frontendAuthorizerParamName: ")
            .append(toIndentedString(frontendAuthorizerParamName))
            .append("\n");
        sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
        sb.append("    conditionOrigin: ").append(toIndentedString(conditionOrigin)).append("\n");
        sb.append("    conditionValue: ").append(toIndentedString(conditionValue)).append("\n");
        sb.append("    mappedParamName: ").append(toIndentedString(mappedParamName)).append("\n");
        sb.append("    mappedParamLocation: ").append(toIndentedString(mappedParamLocation)).append("\n");
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
