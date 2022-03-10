package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 会话持久性对象。 */
public class CreatePoolSessionPersistenceOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cookie_name")

    private String cookieName;

    /** 会话保持类型。 取值范围：SOURCE_IP、HTTP_COOKIE、APP_COOKIE。 [使用说明： -
     * 当pool的protocol为TCP、UDP，无论type取值如何，都会被忽略，会话保持只按SOURCE_IP生效； -
     * 当pool的protocol为HTTP、HTTPS时。如果是独享型负载均衡器的pool，则type只能为HTTP_COOKIE，其他取值会话保持失效。如果是共享型负载均衡器的pool，则type可以为HTTP_COOKIE和APP_COOKIE，其他取值会话保持失效。](tag:hws,hws_hk,ocb,tlf,ctc,hcso,sbc,g42,tm,cmcc,hk-g42,dt,dt_test)
     * [使用说明： - 当pool的protocol为TCP、UDP，无论type取值如何，都会被忽略，会话保持只按SOURCE_IP生效； -
     * 当pool的protocol为HTTP、HTTPS时。type只能为HTTP_COOKIE，其他取值会话保持失效。](tag:hcso_dt) */
    public static final class TypeEnum {

        /** Enum SOURCE_IP for value: "SOURCE_IP" */
        public static final TypeEnum SOURCE_IP = new TypeEnum("SOURCE_IP");

        /** Enum HTTP_COOKIE for value: "HTTP_COOKIE" */
        public static final TypeEnum HTTP_COOKIE = new TypeEnum("HTTP_COOKIE");

        /** Enum APP_COOKIE for value: "APP_COOKIE" */
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

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "persistence_timeout")

    private Integer persistenceTimeout;

    public CreatePoolSessionPersistenceOption withCookieName(String cookieName) {
        this.cookieName = cookieName;
        return this;
    }

    /** cookie名称。 格式：仅支持字母、数字、中划线(-)、下划线(_)和点号(.)。 使用说明： - 只有当type为APP_COOKIE时才有效。其他情况下传该字段会报错。
     * 
     * @return cookieName */
    public String getCookieName() {
        return cookieName;
    }

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    public CreatePoolSessionPersistenceOption withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 会话保持类型。 取值范围：SOURCE_IP、HTTP_COOKIE、APP_COOKIE。 [使用说明： -
     * 当pool的protocol为TCP、UDP，无论type取值如何，都会被忽略，会话保持只按SOURCE_IP生效； -
     * 当pool的protocol为HTTP、HTTPS时。如果是独享型负载均衡器的pool，则type只能为HTTP_COOKIE，其他取值会话保持失效。如果是共享型负载均衡器的pool，则type可以为HTTP_COOKIE和APP_COOKIE，其他取值会话保持失效。](tag:hws,hws_hk,ocb,tlf,ctc,hcso,sbc,g42,tm,cmcc,hk-g42,dt,dt_test)
     * [使用说明： - 当pool的protocol为TCP、UDP，无论type取值如何，都会被忽略，会话保持只按SOURCE_IP生效； -
     * 当pool的protocol为HTTP、HTTPS时。type只能为HTTP_COOKIE，其他取值会话保持失效。](tag:hcso_dt)
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreatePoolSessionPersistenceOption withPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }

    /** 会话保持的时间。当type为APP_COOKIE时不生效。
     * 适用范围：如果pool的protocol为TCP、UDP则范围为[1,60]（分钟），默认值1；如果pool的protocol为HTTP和HTTPS则范围为[1,1440]（分钟），默认值1440。
     * 
     * @return persistenceTimeout */
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
        CreatePoolSessionPersistenceOption createPoolSessionPersistenceOption = (CreatePoolSessionPersistenceOption) o;
        return Objects.equals(this.cookieName, createPoolSessionPersistenceOption.cookieName)
            && Objects.equals(this.type, createPoolSessionPersistenceOption.type)
            && Objects.equals(this.persistenceTimeout, createPoolSessionPersistenceOption.persistenceTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cookieName, type, persistenceTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePoolSessionPersistenceOption {\n");
        sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    persistenceTimeout: ").append(toIndentedString(persistenceTimeout)).append("\n");
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
