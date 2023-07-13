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
 * BackendParam
 */
public class BackendParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 参数位置：PATH、QUERY、HEADER
     */
    public static final class LocationEnum {

        /**
         * Enum PATH for value: "PATH"
         */
        public static final LocationEnum PATH = new LocationEnum("PATH");

        /**
         * Enum QUERY for value: "QUERY"
         */
        public static final LocationEnum QUERY = new LocationEnum("QUERY");

        /**
         * Enum HEADER for value: "HEADER"
         */
        public static final LocationEnum HEADER = new LocationEnum("HEADER");

        private static final Map<String, LocationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LocationEnum> createStaticFields() {
            Map<String, LocationEnum> map = new HashMap<>();
            map.put("PATH", PATH);
            map.put("QUERY", QUERY);
            map.put("HEADER", HEADER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LocationEnum(String value) {
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
        public static LocationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LocationEnum(value));
        }

        public static LocationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LocationEnum) {
                return this.value.equals(((LocationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private LocationEnum location;

    /**
     * 参数类别：REQUEST、CONSTANT、SYSTEM
     */
    public static final class OriginEnum {

        /**
         * Enum REQUEST for value: "REQUEST"
         */
        public static final OriginEnum REQUEST = new OriginEnum("REQUEST");

        /**
         * Enum CONSTANT for value: "CONSTANT"
         */
        public static final OriginEnum CONSTANT = new OriginEnum("CONSTANT");

        /**
         * Enum SYSTEM for value: "SYSTEM"
         */
        public static final OriginEnum SYSTEM = new OriginEnum("SYSTEM");

        private static final Map<String, OriginEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OriginEnum> createStaticFields() {
            Map<String, OriginEnum> map = new HashMap<>();
            map.put("REQUEST", REQUEST);
            map.put("CONSTANT", CONSTANT);
            map.put("SYSTEM", SYSTEM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OriginEnum(String value) {
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
        public static OriginEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OriginEnum(value));
        }

        public static OriginEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OriginEnum) {
                return this.value.equals(((OriginEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin")

    private OriginEnum origin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_param_id")

    private String reqParamId;

    public BackendParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名称。 字符串由英文字母、数字、中划线、下划线、英文句号组成，且只能以英文开头。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackendParam withLocation(LocationEnum location) {
        this.location = location;
        return this;
    }

    /**
     * 参数位置：PATH、QUERY、HEADER
     * @return location
     */
    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    public BackendParam withOrigin(OriginEnum origin) {
        this.origin = origin;
        return this;
    }

    /**
     * 参数类别：REQUEST、CONSTANT、SYSTEM
     * @return origin
     */
    public OriginEnum getOrigin() {
        return origin;
    }

    public void setOrigin(OriginEnum origin) {
        this.origin = origin;
    }

    public BackendParam withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 参数值。字符长度不超过255 origin类别为REQUEST时，此字段值为req_params中的参数名称；  origin类别为CONSTANT时，此字段值为参数真正的值；  origin类别为SYSTEM时，此字段值为系统参数名称，系统参数分为网关内置参数、前端认证参数和后端认证参数，当api前端安全认证方式为自定义认证时，可以填写前端认证参数，当api开启后端认证时，可以填写后端认证参数。  网关内置参数取值及对应含义： - $context.sourceIp：API调用者的源地址 - $context.stage：API调用的部署环境 - $context.apiName: API的名称 - $context.apiId：API的ID - $context.appName: API调用者的APP对象名称 - $context.appId：API调用者的APP对象ID - $context.requestId：当次API调用生成跟踪ID - $context.serverAddr：网关的服务器地址 - $context.serverName：网关的服务器名称 - $context.handleTime：本次API调用的处理时间 - $context.providerAppId：API拥有者的应用对象ID，暂不支持使用  前端认证参数取值：以“$context.authorizer.frontend.”为前缀，如希望自定义认证校验通过返回的参数为aaa，那么此字段填写为$context.authorizer.frontend.aaa  后端认证参数取值：以“$context.authorizer.backend.”为前缀，如希望自定义认证校验通过返回的参数为aaa，那么此字段填写为$context.authorizer.backend.aaa
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BackendParam withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 描述。 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BackendParam withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BackendParam withReqParamId(String reqParamId) {
        this.reqParamId = reqParamId;
        return this;
    }

    /**
     * 对应的请求参数编号
     * @return reqParamId
     */
    public String getReqParamId() {
        return reqParamId;
    }

    public void setReqParamId(String reqParamId) {
        this.reqParamId = reqParamId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackendParam that = (BackendParam) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.location, that.location)
            && Objects.equals(this.origin, that.origin) && Objects.equals(this.value, that.value)
            && Objects.equals(this.remark, that.remark) && Objects.equals(this.id, that.id)
            && Objects.equals(this.reqParamId, that.reqParamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, origin, value, remark, id, reqParamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackendParam {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    reqParamId: ").append(toIndentedString(reqParamId)).append("\n");
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
