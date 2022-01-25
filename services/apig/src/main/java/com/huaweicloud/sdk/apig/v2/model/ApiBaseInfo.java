package com.huaweicloud.sdk.apig.v2.model;

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

/** ApiBaseInfo */
public class ApiBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** API类型 - 1：公有API - 2：私有API */
    public static final class TypeEnum {

        /** Enum NUMBER_1 for value: 1 */
        public static final TypeEnum NUMBER_1 = new TypeEnum(1);

        /** Enum NUMBER_2 for value: 2 */
        public static final TypeEnum NUMBER_2 = new TypeEnum(2);

        private static final Map<Integer, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TypeEnum> createStaticFields() {
            Map<Integer, TypeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TypeEnum(Integer value) {
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
        public static TypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    /** API的请求协议 - HTTP - HTTPS - BOTH：同时支持HTTP和HTTPS */
    public static final class ReqProtocolEnum {

        /** Enum HTTP for value: "HTTP" */
        public static final ReqProtocolEnum HTTP = new ReqProtocolEnum("HTTP");

        /** Enum HTTPS for value: "HTTPS" */
        public static final ReqProtocolEnum HTTPS = new ReqProtocolEnum("HTTPS");

        /** Enum BOTH for value: "BOTH" */
        public static final ReqProtocolEnum BOTH = new ReqProtocolEnum("BOTH");

        private static final Map<String, ReqProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReqProtocolEnum> createStaticFields() {
            Map<String, ReqProtocolEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            map.put("BOTH", BOTH);
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
            ReqProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ReqProtocolEnum(value);
            }
            return result;
        }

        public static ReqProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ReqProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /** API的请求方式 */
    public static final class ReqMethodEnum {

        /** Enum GET for value: "GET" */
        public static final ReqMethodEnum GET = new ReqMethodEnum("GET");

        /** Enum POST for value: "POST" */
        public static final ReqMethodEnum POST = new ReqMethodEnum("POST");

        /** Enum PUT for value: "PUT" */
        public static final ReqMethodEnum PUT = new ReqMethodEnum("PUT");

        /** Enum DELETE for value: "DELETE" */
        public static final ReqMethodEnum DELETE = new ReqMethodEnum("DELETE");

        /** Enum HEAD for value: "HEAD" */
        public static final ReqMethodEnum HEAD = new ReqMethodEnum("HEAD");

        /** Enum PATCH for value: "PATCH" */
        public static final ReqMethodEnum PATCH = new ReqMethodEnum("PATCH");

        /** Enum OPTIONS for value: "OPTIONS" */
        public static final ReqMethodEnum OPTIONS = new ReqMethodEnum("OPTIONS");

        /** Enum ANY for value: "ANY" */
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
            ReqMethodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ReqMethodEnum(value);
            }
            return result;
        }

        public static ReqMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ReqMethodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /** API的认证方式 - NONE：无认证 - APP：APP认证 - IAM：IAM认证 - AUTHORIZER：自定义认证 */
    public static final class AuthTypeEnum {

        /** Enum NONE for value: "NONE" */
        public static final AuthTypeEnum NONE = new AuthTypeEnum("NONE");

        /** Enum APP for value: "APP" */
        public static final AuthTypeEnum APP = new AuthTypeEnum("APP");

        /** Enum IAM for value: "IAM" */
        public static final AuthTypeEnum IAM = new AuthTypeEnum("IAM");

        /** Enum AUTHORIZER for value: "AUTHORIZER" */
        public static final AuthTypeEnum AUTHORIZER = new AuthTypeEnum("AUTHORIZER");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("APP", APP);
            map.put("IAM", IAM);
            map.put("AUTHORIZER", AUTHORIZER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthTypeEnum(String value) {
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
        public static AuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthTypeEnum(value);
            }
            return result;
        }

        public static AuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthTypeEnum) {
                return this.value.equals(((AuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private AuthTypeEnum authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_opt")

    private AuthOpt authOpt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cors")

    private Boolean cors;

    /** API的匹配方式 - SWA：前缀匹配 - NORMAL：正常匹配（绝对匹配） 默认：NORMAL */
    public static final class MatchModeEnum {

        /** Enum SWA for value: "SWA" */
        public static final MatchModeEnum SWA = new MatchModeEnum("SWA");

        /** Enum NORMAL for value: "NORMAL" */
        public static final MatchModeEnum NORMAL = new MatchModeEnum("NORMAL");

        private static final Map<String, MatchModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MatchModeEnum> createStaticFields() {
            Map<String, MatchModeEnum> map = new HashMap<>();
            map.put("SWA", SWA);
            map.put("NORMAL", NORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MatchModeEnum(String value) {
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
        public static MatchModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MatchModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MatchModeEnum(value);
            }
            return result;
        }

        public static MatchModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MatchModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MatchModeEnum) {
                return this.value.equals(((MatchModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_mode")

    private MatchModeEnum matchMode;

    /** 后端类型 - HTTP：web后端 - FUNCTION：函数工作流 - MOCK：模拟的后端 */
    public static final class BackendTypeEnum {

        /** Enum HTTP for value: "HTTP" */
        public static final BackendTypeEnum HTTP = new BackendTypeEnum("HTTP");

        /** Enum FUNCTION for value: "FUNCTION" */
        public static final BackendTypeEnum FUNCTION = new BackendTypeEnum("FUNCTION");

        /** Enum MOCK for value: "MOCK" */
        public static final BackendTypeEnum MOCK = new BackendTypeEnum("MOCK");

        private static final Map<String, BackendTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackendTypeEnum> createStaticFields() {
            Map<String, BackendTypeEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("FUNCTION", FUNCTION);
            map.put("MOCK", MOCK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackendTypeEnum(String value) {
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
        public static BackendTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BackendTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BackendTypeEnum(value);
            }
            return result;
        }

        public static BackendTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BackendTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackendTypeEnum) {
                return this.value.equals(((BackendTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_type")

    private BackendTypeEnum backendType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body_remark")

    private String bodyRemark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_normal_sample")

    private String resultNormalSample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_failure_sample")

    private String resultFailureSample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_id")

    private String authorizerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_id")

    private String responseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roma_app_id")

    private String romaAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    /** 请求内容格式类型： application/json application/xml multipart/form-date text/plain 暂不支持 */
    public static final class ContentTypeEnum {

        /** Enum APPLICATION_JSON for value: "application/json" */
        public static final ContentTypeEnum APPLICATION_JSON = new ContentTypeEnum("application/json");

        /** Enum APPLICATION_XML for value: "application/xml" */
        public static final ContentTypeEnum APPLICATION_XML = new ContentTypeEnum("application/xml");

        /** Enum MULTIPART_FORM_DATE for value: "multipart/form-date" */
        public static final ContentTypeEnum MULTIPART_FORM_DATE = new ContentTypeEnum("multipart/form-date");

        /** Enum TEXT_PLAIN for value: "text/plain" */
        public static final ContentTypeEnum TEXT_PLAIN = new ContentTypeEnum("text/plain");

        private static final Map<String, ContentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ContentTypeEnum> createStaticFields() {
            Map<String, ContentTypeEnum> map = new HashMap<>();
            map.put("application/json", APPLICATION_JSON);
            map.put("application/xml", APPLICATION_XML);
            map.put("multipart/form-date", MULTIPART_FORM_DATE);
            map.put("text/plain", TEXT_PLAIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ContentTypeEnum(String value) {
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
        public static ContentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ContentTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ContentTypeEnum(value);
            }
            return result;
        }

        public static ContentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ContentTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ContentTypeEnum) {
                return this.value.equals(((ContentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    private ContentTypeEnum contentType;

    public ApiBaseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /** API名称。 长度为3 ~ 64位的字符串，字符串由中文、英文字母、数字、下划线组成，且只能以英文或中文开头。 > 中文字符必须为UTF-8或者unicode编码。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiBaseInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** API类型 - 1：公有API - 2：私有API
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ApiBaseInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /** API的版本
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ApiBaseInfo withReqProtocol(ReqProtocolEnum reqProtocol) {
        this.reqProtocol = reqProtocol;
        return this;
    }

    /** API的请求协议 - HTTP - HTTPS - BOTH：同时支持HTTP和HTTPS
     * 
     * @return reqProtocol */
    public ReqProtocolEnum getReqProtocol() {
        return reqProtocol;
    }

    public void setReqProtocol(ReqProtocolEnum reqProtocol) {
        this.reqProtocol = reqProtocol;
    }

    public ApiBaseInfo withReqMethod(ReqMethodEnum reqMethod) {
        this.reqMethod = reqMethod;
        return this;
    }

    /** API的请求方式
     * 
     * @return reqMethod */
    public ReqMethodEnum getReqMethod() {
        return reqMethod;
    }

    public void setReqMethod(ReqMethodEnum reqMethod) {
        this.reqMethod = reqMethod;
    }

    public ApiBaseInfo withReqUri(String reqUri) {
        this.reqUri = reqUri;
        return this;
    }

    /** 请求地址。可以包含请求参数，用{}标识，比如/getUserInfo/{userId}，支持 * % - _ . 等特殊字符，总长度不超过512，且满足URI规范。 > 需要服从URI规范。
     * 
     * @return reqUri */
    public String getReqUri() {
        return reqUri;
    }

    public void setReqUri(String reqUri) {
        this.reqUri = reqUri;
    }

    public ApiBaseInfo withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /** API的认证方式 - NONE：无认证 - APP：APP认证 - IAM：IAM认证 - AUTHORIZER：自定义认证
     * 
     * @return authType */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public ApiBaseInfo withAuthOpt(AuthOpt authOpt) {
        this.authOpt = authOpt;
        return this;
    }

    public ApiBaseInfo withAuthOpt(Consumer<AuthOpt> authOptSetter) {
        if (this.authOpt == null) {
            this.authOpt = new AuthOpt();
            authOptSetter.accept(this.authOpt);
        }

        return this;
    }

    /** Get authOpt
     * 
     * @return authOpt */
    public AuthOpt getAuthOpt() {
        return authOpt;
    }

    public void setAuthOpt(AuthOpt authOpt) {
        this.authOpt = authOpt;
    }

    public ApiBaseInfo withCors(Boolean cors) {
        this.cors = cors;
        return this;
    }

    /** 是否支持跨域 - TRUE：支持 - FALSE：不支持
     * 
     * @return cors */
    public Boolean getCors() {
        return cors;
    }

    public void setCors(Boolean cors) {
        this.cors = cors;
    }

    public ApiBaseInfo withMatchMode(MatchModeEnum matchMode) {
        this.matchMode = matchMode;
        return this;
    }

    /** API的匹配方式 - SWA：前缀匹配 - NORMAL：正常匹配（绝对匹配） 默认：NORMAL
     * 
     * @return matchMode */
    public MatchModeEnum getMatchMode() {
        return matchMode;
    }

    public void setMatchMode(MatchModeEnum matchMode) {
        this.matchMode = matchMode;
    }

    public ApiBaseInfo withBackendType(BackendTypeEnum backendType) {
        this.backendType = backendType;
        return this;
    }

    /** 后端类型 - HTTP：web后端 - FUNCTION：函数工作流 - MOCK：模拟的后端
     * 
     * @return backendType */
    public BackendTypeEnum getBackendType() {
        return backendType;
    }

    public void setBackendType(BackendTypeEnum backendType) {
        this.backendType = backendType;
    }

    public ApiBaseInfo withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /** API描述。字符长度不超过255 > 中文字符必须为UTF-8或者unicode编码。
     * 
     * @return remark */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ApiBaseInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** API所属的分组编号
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ApiBaseInfo withBodyRemark(String bodyRemark) {
        this.bodyRemark = bodyRemark;
        return this;
    }

    /** API请求体描述，可以是请求体示例、媒体类型、参数等信息。字符长度不超过20480 > 中文字符必须为UTF-8或者unicode编码。
     * 
     * @return bodyRemark */
    public String getBodyRemark() {
        return bodyRemark;
    }

    public void setBodyRemark(String bodyRemark) {
        this.bodyRemark = bodyRemark;
    }

    public ApiBaseInfo withResultNormalSample(String resultNormalSample) {
        this.resultNormalSample = resultNormalSample;
        return this;
    }

    /** 正常响应示例，描述API的正常返回信息。字符长度不超过20480 > 中文字符必须为UTF-8或者unicode编码。
     * 
     * @return resultNormalSample */
    public String getResultNormalSample() {
        return resultNormalSample;
    }

    public void setResultNormalSample(String resultNormalSample) {
        this.resultNormalSample = resultNormalSample;
    }

    public ApiBaseInfo withResultFailureSample(String resultFailureSample) {
        this.resultFailureSample = resultFailureSample;
        return this;
    }

    /** 失败返回示例，描述API的异常返回信息。字符长度不超过20480 > 中文字符必须为UTF-8或者unicode编码。
     * 
     * @return resultFailureSample */
    public String getResultFailureSample() {
        return resultFailureSample;
    }

    public void setResultFailureSample(String resultFailureSample) {
        this.resultFailureSample = resultFailureSample;
    }

    public ApiBaseInfo withAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }

    /** 前端自定义认证对象的ID
     * 
     * @return authorizerId */
    public String getAuthorizerId() {
        return authorizerId;
    }

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    public ApiBaseInfo withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ApiBaseInfo addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ApiBaseInfo withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 标签。 支持英文，数字，下划线，且只能以英文开头。支持输入多个标签，不同标签以英文逗号分割。
     * 
     * @return tags */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ApiBaseInfo withResponseId(String responseId) {
        this.responseId = responseId;
        return this;
    }

    /** 分组自定义响应ID
     * 
     * @return responseId */
    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public ApiBaseInfo withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    /** 集成应用ID 暂不支持
     * 
     * @return romaAppId */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    public ApiBaseInfo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /** API绑定的自定义域名 暂不支持
     * 
     * @return domainName */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ApiBaseInfo withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /** 标签 待废弃，优先使用tags字段
     * 
     * @return tag */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ApiBaseInfo withContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
        return this;
    }

    /** 请求内容格式类型： application/json application/xml multipart/form-date text/plain 暂不支持
     * 
     * @return contentType */
    public ContentTypeEnum getContentType() {
        return contentType;
    }

    public void setContentType(ContentTypeEnum contentType) {
        this.contentType = contentType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiBaseInfo apiBaseInfo = (ApiBaseInfo) o;
        return Objects.equals(this.name, apiBaseInfo.name) && Objects.equals(this.type, apiBaseInfo.type)
            && Objects.equals(this.version, apiBaseInfo.version)
            && Objects.equals(this.reqProtocol, apiBaseInfo.reqProtocol)
            && Objects.equals(this.reqMethod, apiBaseInfo.reqMethod) && Objects.equals(this.reqUri, apiBaseInfo.reqUri)
            && Objects.equals(this.authType, apiBaseInfo.authType) && Objects.equals(this.authOpt, apiBaseInfo.authOpt)
            && Objects.equals(this.cors, apiBaseInfo.cors) && Objects.equals(this.matchMode, apiBaseInfo.matchMode)
            && Objects.equals(this.backendType, apiBaseInfo.backendType)
            && Objects.equals(this.remark, apiBaseInfo.remark) && Objects.equals(this.groupId, apiBaseInfo.groupId)
            && Objects.equals(this.bodyRemark, apiBaseInfo.bodyRemark)
            && Objects.equals(this.resultNormalSample, apiBaseInfo.resultNormalSample)
            && Objects.equals(this.resultFailureSample, apiBaseInfo.resultFailureSample)
            && Objects.equals(this.authorizerId, apiBaseInfo.authorizerId)
            && Objects.equals(this.tags, apiBaseInfo.tags) && Objects.equals(this.responseId, apiBaseInfo.responseId)
            && Objects.equals(this.romaAppId, apiBaseInfo.romaAppId)
            && Objects.equals(this.domainName, apiBaseInfo.domainName) && Objects.equals(this.tag, apiBaseInfo.tag)
            && Objects.equals(this.contentType, apiBaseInfo.contentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            type,
            version,
            reqProtocol,
            reqMethod,
            reqUri,
            authType,
            authOpt,
            cors,
            matchMode,
            backendType,
            remark,
            groupId,
            bodyRemark,
            resultNormalSample,
            resultFailureSample,
            authorizerId,
            tags,
            responseId,
            romaAppId,
            domainName,
            tag,
            contentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiBaseInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    reqProtocol: ").append(toIndentedString(reqProtocol)).append("\n");
        sb.append("    reqMethod: ").append(toIndentedString(reqMethod)).append("\n");
        sb.append("    reqUri: ").append(toIndentedString(reqUri)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    authOpt: ").append(toIndentedString(authOpt)).append("\n");
        sb.append("    cors: ").append(toIndentedString(cors)).append("\n");
        sb.append("    matchMode: ").append(toIndentedString(matchMode)).append("\n");
        sb.append("    backendType: ").append(toIndentedString(backendType)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    bodyRemark: ").append(toIndentedString(bodyRemark)).append("\n");
        sb.append("    resultNormalSample: ").append(toIndentedString(resultNormalSample)).append("\n");
        sb.append("    resultFailureSample: ").append(toIndentedString(resultFailureSample)).append("\n");
        sb.append("    authorizerId: ").append(toIndentedString(authorizerId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
