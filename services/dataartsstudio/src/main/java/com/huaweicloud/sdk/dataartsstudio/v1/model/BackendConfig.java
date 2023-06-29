package com.huaweicloud.sdk.dataartsstudio.v1.model;

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

/**
 * BackendConfig
 */
public class BackendConfig {

    /**
     * 后端请求类型
     */
    public static final class TypeEnum {

        /**
         * Enum REQUEST_TYPE_POST for value: "REQUEST_TYPE_POST"
         */
        public static final TypeEnum REQUEST_TYPE_POST = new TypeEnum("REQUEST_TYPE_POST");

        /**
         * Enum REQUEST_TYPE_GET for value: "REQUEST_TYPE_GET"
         */
        public static final TypeEnum REQUEST_TYPE_GET = new TypeEnum("REQUEST_TYPE_GET");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("REQUEST_TYPE_POST", REQUEST_TYPE_POST);
            map.put("REQUEST_TYPE_GET", REQUEST_TYPE_GET);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * 后端请求协议类型
     */
    public static final class ProtocolEnum {

        /**
         * Enum PROTOCOL_TYPE_HTTP for value: "PROTOCOL_TYPE_HTTP"
         */
        public static final ProtocolEnum PROTOCOL_TYPE_HTTP = new ProtocolEnum("PROTOCOL_TYPE_HTTP");

        /**
         * Enum PROTOCOL_TYPE_HTTPS for value: "PROTOCOL_TYPE_HTTPS"
         */
        public static final ProtocolEnum PROTOCOL_TYPE_HTTPS = new ProtocolEnum("PROTOCOL_TYPE_HTTPS");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("PROTOCOL_TYPE_HTTP", PROTOCOL_TYPE_HTTP);
            map.put("PROTOCOL_TYPE_HTTPS", PROTOCOL_TYPE_HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_paras")

    private List<BackendRequestPara> backendParas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constant_paras")

    private List<BackendConstant> constantParas = null;

    public BackendConfig withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 后端请求类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public BackendConfig withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 后端请求协议类型
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public BackendConfig withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 后端host
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public BackendConfig withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 后端超时时间
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public BackendConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 后端请求Path
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BackendConfig withBackendParas(List<BackendRequestPara> backendParas) {
        this.backendParas = backendParas;
        return this;
    }

    public BackendConfig addBackendParasItem(BackendRequestPara backendParasItem) {
        if (this.backendParas == null) {
            this.backendParas = new ArrayList<>();
        }
        this.backendParas.add(backendParasItem);
        return this;
    }

    public BackendConfig withBackendParas(Consumer<List<BackendRequestPara>> backendParasSetter) {
        if (this.backendParas == null) {
            this.backendParas = new ArrayList<>();
        }
        backendParasSetter.accept(this.backendParas);
        return this;
    }

    /**
     * API后端参数
     * @return backendParas
     */
    public List<BackendRequestPara> getBackendParas() {
        return backendParas;
    }

    public void setBackendParas(List<BackendRequestPara> backendParas) {
        this.backendParas = backendParas;
    }

    public BackendConfig withConstantParas(List<BackendConstant> constantParas) {
        this.constantParas = constantParas;
        return this;
    }

    public BackendConfig addConstantParasItem(BackendConstant constantParasItem) {
        if (this.constantParas == null) {
            this.constantParas = new ArrayList<>();
        }
        this.constantParas.add(constantParasItem);
        return this;
    }

    public BackendConfig withConstantParas(Consumer<List<BackendConstant>> constantParasSetter) {
        if (this.constantParas == null) {
            this.constantParas = new ArrayList<>();
        }
        constantParasSetter.accept(this.constantParas);
        return this;
    }

    /**
     * 后端常量参数
     * @return constantParas
     */
    public List<BackendConstant> getConstantParas() {
        return constantParas;
    }

    public void setConstantParas(List<BackendConstant> constantParas) {
        this.constantParas = constantParas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackendConfig that = (BackendConfig) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.host, that.host) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.path, that.path) && Objects.equals(this.backendParas, that.backendParas)
            && Objects.equals(this.constantParas, that.constantParas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, protocol, host, timeout, path, backendParas, constantParas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackendConfig {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    backendParas: ").append(toIndentedString(backendParas)).append("\n");
        sb.append("    constantParas: ").append(toIndentedString(constantParas)).append("\n");
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
