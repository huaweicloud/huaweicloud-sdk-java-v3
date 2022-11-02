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
 * 导入的微服务API的响应对象
 */
public class MicroserviceImportApiResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_uri")

    private String reqUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_method")

    private String reqMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * API的匹配方式 - SWA：前缀匹配 - NORMAL：正常匹配（绝对匹配） 默认：SWA
     */
    public static final class MatchModeEnum {

        /**
         * Enum SWA for value: "SWA"
         */
        public static final MatchModeEnum SWA = new MatchModeEnum("SWA");

        /**
         * Enum NORMAL for value: "NORMAL"
         */
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

    public MicroserviceImportApiResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * API名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MicroserviceImportApiResp withReqUri(String reqUri) {
        this.reqUri = reqUri;
        return this;
    }

    /**
     * API请求路径
     * @return reqUri
     */
    public String getReqUri() {
        return reqUri;
    }

    public void setReqUri(String reqUri) {
        this.reqUri = reqUri;
    }

    public MicroserviceImportApiResp withReqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
        return this;
    }

    /**
     * API请求方法
     * @return reqMethod
     */
    public String getReqMethod() {
        return reqMethod;
    }

    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
    }

    public MicroserviceImportApiResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * API编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MicroserviceImportApiResp withMatchMode(MatchModeEnum matchMode) {
        this.matchMode = matchMode;
        return this;
    }

    /**
     * API的匹配方式 - SWA：前缀匹配 - NORMAL：正常匹配（绝对匹配） 默认：SWA
     * @return matchMode
     */
    public MatchModeEnum getMatchMode() {
        return matchMode;
    }

    public void setMatchMode(MatchModeEnum matchMode) {
        this.matchMode = matchMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MicroserviceImportApiResp microserviceImportApiResp = (MicroserviceImportApiResp) o;
        return Objects.equals(this.name, microserviceImportApiResp.name)
            && Objects.equals(this.reqUri, microserviceImportApiResp.reqUri)
            && Objects.equals(this.reqMethod, microserviceImportApiResp.reqMethod)
            && Objects.equals(this.id, microserviceImportApiResp.id)
            && Objects.equals(this.matchMode, microserviceImportApiResp.matchMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, reqUri, reqMethod, id, matchMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicroserviceImportApiResp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    reqUri: ").append(toIndentedString(reqUri)).append("\n");
        sb.append("    reqMethod: ").append(toIndentedString(reqMethod)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    matchMode: ").append(toIndentedString(matchMode)).append("\n");
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
