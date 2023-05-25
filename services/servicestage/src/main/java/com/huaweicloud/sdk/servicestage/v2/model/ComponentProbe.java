package com.huaweicloud.sdk.servicestage.v2.model;

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
 * ComponentProbe
 */
public class ComponentProbe {

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum HTTP for value: "http"
         */
        public static final TypeEnum HTTP = new TypeEnum("http");

        /**
         * Enum TCP for value: "tcp"
         */
        public static final TypeEnum TCP = new TypeEnum("tcp");

        /**
         * Enum COMMAND for value: "command"
         */
        public static final TypeEnum COMMAND = new TypeEnum("command");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("http", HTTP);
            map.put("tcp", TCP);
            map.put("command", COMMAND);
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
    @JsonProperty(value = "delay")

    private Integer delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private ProbeParameter parameters;

    public ComponentProbe withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ComponentProbe withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 表示启动后多久开始探测
     * @return delay
     */
    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public ComponentProbe withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 表示探测超时时间
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ComponentProbe withParameters(ProbeParameter parameters) {
        this.parameters = parameters;
        return this;
    }

    public ComponentProbe withParameters(Consumer<ProbeParameter> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ProbeParameter();
            parametersSetter.accept(this.parameters);
        }

        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public ProbeParameter getParameters() {
        return parameters;
    }

    public void setParameters(ProbeParameter parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentProbe componentProbe = (ComponentProbe) o;
        return Objects.equals(this.type, componentProbe.type) && Objects.equals(this.delay, componentProbe.delay)
            && Objects.equals(this.timeout, componentProbe.timeout)
            && Objects.equals(this.parameters, componentProbe.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, delay, timeout, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentProbe {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
