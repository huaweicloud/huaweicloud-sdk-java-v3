package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EntrypointItem
 */
public class EntrypointItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masterEntrypoint")

    private String masterEntrypoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "masterEntrypointIpv6")

    private String masterEntrypointIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slaveEntrypoint")

    private String slaveEntrypoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slaveEntrypointIpv6")

    private String slaveEntrypointIpv6;

    /**
     * 微服务引擎组件类型
     */
    public static final class TypeEnum {

        /**
         * Enum REGISTRY for value: "REGISTRY"
         */
        public static final TypeEnum REGISTRY = new TypeEnum("REGISTRY");

        /**
         * Enum SERVICE for value: "SERVICE"
         */
        public static final TypeEnum SERVICE = new TypeEnum("SERVICE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("REGISTRY", REGISTRY);
            map.put("SERVICE", SERVICE);
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

    public EntrypointItem withMasterEntrypoint(String masterEntrypoint) {
        this.masterEntrypoint = masterEntrypoint;
        return this;
    }

    /**
     * 微服务引擎组件的ipv4主接入地址
     * @return masterEntrypoint
     */
    public String getMasterEntrypoint() {
        return masterEntrypoint;
    }

    public void setMasterEntrypoint(String masterEntrypoint) {
        this.masterEntrypoint = masterEntrypoint;
    }

    public EntrypointItem withMasterEntrypointIpv6(String masterEntrypointIpv6) {
        this.masterEntrypointIpv6 = masterEntrypointIpv6;
        return this;
    }

    /**
     * 微服务引擎组件的ipv6主接入地址
     * @return masterEntrypointIpv6
     */
    public String getMasterEntrypointIpv6() {
        return masterEntrypointIpv6;
    }

    public void setMasterEntrypointIpv6(String masterEntrypointIpv6) {
        this.masterEntrypointIpv6 = masterEntrypointIpv6;
    }

    public EntrypointItem withSlaveEntrypoint(String slaveEntrypoint) {
        this.slaveEntrypoint = slaveEntrypoint;
        return this;
    }

    /**
     * 微服务引擎组件的ipv4备接入地址
     * @return slaveEntrypoint
     */
    public String getSlaveEntrypoint() {
        return slaveEntrypoint;
    }

    public void setSlaveEntrypoint(String slaveEntrypoint) {
        this.slaveEntrypoint = slaveEntrypoint;
    }

    public EntrypointItem withSlaveEntrypointIpv6(String slaveEntrypointIpv6) {
        this.slaveEntrypointIpv6 = slaveEntrypointIpv6;
        return this;
    }

    /**
     * 微服务引擎组件的ipv6备接入地址
     * @return slaveEntrypointIpv6
     */
    public String getSlaveEntrypointIpv6() {
        return slaveEntrypointIpv6;
    }

    public void setSlaveEntrypointIpv6(String slaveEntrypointIpv6) {
        this.slaveEntrypointIpv6 = slaveEntrypointIpv6;
    }

    public EntrypointItem withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 微服务引擎组件类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EntrypointItem that = (EntrypointItem) obj;
        return Objects.equals(this.masterEntrypoint, that.masterEntrypoint)
            && Objects.equals(this.masterEntrypointIpv6, that.masterEntrypointIpv6)
            && Objects.equals(this.slaveEntrypoint, that.slaveEntrypoint)
            && Objects.equals(this.slaveEntrypointIpv6, that.slaveEntrypointIpv6)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masterEntrypoint, masterEntrypointIpv6, slaveEntrypoint, slaveEntrypointIpv6, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EntrypointItem {\n");
        sb.append("    masterEntrypoint: ").append(toIndentedString(masterEntrypoint)).append("\n");
        sb.append("    masterEntrypointIpv6: ").append(toIndentedString(masterEntrypointIpv6)).append("\n");
        sb.append("    slaveEntrypoint: ").append(toIndentedString(slaveEntrypoint)).append("\n");
        sb.append("    slaveEntrypointIpv6: ").append(toIndentedString(slaveEntrypointIpv6)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
