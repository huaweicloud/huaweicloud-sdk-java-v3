package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 后端云服务器组的会话持久性。 当开启会话保持后，在一定时间内，来自同一客户端的请求会发送到同一个后端云服务器上。 当会话保持关闭时，该字段取值为null。
 */
public class SessionPersistence {

    /**
     * 会话保持的类型。SOURCE_IP：根据请求的源IP，将同一IP的请求发送到同一个后端云服务器上。HTTP_COOKIE：客户端第一次发送请求时，负载均衡器自动生成cookie并将该cookie插入响应消息中，后续请求会发送到处理第一个请求的后端云服务器上。APP_COOKIE：客户端第一次发送请求时，后端服务器生成cookie并将该cookie插入响应消息中，后续请求会发送到处理第一个请求的后端云服务器上。当后端云服务器的protocol为TCP时，只按SOURCE_IP生效当后端云服务器的protocol为HTTP时，只按HTTP_COOKIE或APP_COOKIE生效
     */
    public static final class TypeEnum {

        /**
         * Enum SOURCE_IP for value: "SOURCE_IP"
         */
        public static final TypeEnum SOURCE_IP = new TypeEnum("SOURCE_IP");

        /**
         * Enum HTTP_COOKIE for value: "HTTP_COOKIE"
         */
        public static final TypeEnum HTTP_COOKIE = new TypeEnum("HTTP_COOKIE");

        /**
         * Enum APP_COOKIE for value: "APP_COOKIE"
         */
        public static final TypeEnum APP_COOKIE = new TypeEnum("APP_COOKIE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SOURCE_IP", SOURCE_IP);
            map.put("HTTP_COOKIE", HTTP_COOKIE);
            map.put("APP_COOKIE", APP_COOKIE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
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

    @JacksonXmlProperty(localName = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cookie_name")

    @JacksonXmlProperty(localName = "cookie_name")

    private String cookieName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "persistence_timeout")

    @JacksonXmlProperty(localName = "persistence_timeout")

    private Integer persistenceTimeout;

    public SessionPersistence withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 会话保持的类型。SOURCE_IP：根据请求的源IP，将同一IP的请求发送到同一个后端云服务器上。HTTP_COOKIE：客户端第一次发送请求时，负载均衡器自动生成cookie并将该cookie插入响应消息中，后续请求会发送到处理第一个请求的后端云服务器上。APP_COOKIE：客户端第一次发送请求时，后端服务器生成cookie并将该cookie插入响应消息中，后续请求会发送到处理第一个请求的后端云服务器上。当后端云服务器的protocol为TCP时，只按SOURCE_IP生效当后端云服务器的protocol为HTTP时，只按HTTP_COOKIE或APP_COOKIE生效
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SessionPersistence withCookieName(String cookieName) {
        this.cookieName = cookieName;
        return this;
    }

    /**
     * cookie的名称。只有当会话保持的类型是APP_COOKIE时可以指定。
     * @return cookieName
     */
    public String getCookieName() {
        return cookieName;
    }

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    public SessionPersistence withPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }

    /**
     * 会话保持的超时时间。取值范围：[1,60]（分钟）：当后端云服务器的protocol为TCP、UDP时[1,1440]（分钟）：当后端云服务器的protocol为HTTP时。当type为APP_COOKIE时该字段不生效。
     * @return persistenceTimeout
     */
    public Integer getPersistenceTimeout() {
        return persistenceTimeout;
    }

    public void setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SessionPersistence sessionPersistence = (SessionPersistence) o;
        return Objects.equals(this.type, sessionPersistence.type)
            && Objects.equals(this.cookieName, sessionPersistence.cookieName)
            && Objects.equals(this.persistenceTimeout, sessionPersistence.persistenceTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cookieName, persistenceTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionPersistence {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
        sb.append("    persistenceTimeout: ").append(toIndentedString(persistenceTimeout)).append("\n");
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
