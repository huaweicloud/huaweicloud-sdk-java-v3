package com.huaweicloud.sdk.cae.v1.model;

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
 * 访问方式配置项。
 */
public class AccessConfigurationDataItems {

    /**
     * 访问方式类型。
     */
    public static final class TypeEnum {

        /**
         * Enum CLUSTERIP for value: "ClusterIP"
         */
        public static final TypeEnum CLUSTERIP = new TypeEnum("ClusterIP");

        /**
         * Enum LOADBALANCER for value: "LoadBalancer"
         */
        public static final TypeEnum LOADBALANCER = new TypeEnum("LoadBalancer");

        /**
         * Enum INGRESS for value: "Ingress"
         */
        public static final TypeEnum INGRESS = new TypeEnum("Ingress");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ClusterIP", CLUSTERIP);
            map.put("LoadBalancer", LOADBALANCER);
            map.put("Ingress", INGRESS);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_names")

    private String domainNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_control")

    private AccessControl accessControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<AccessConfigurationPort> ports = null;

    public AccessConfigurationDataItems withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 访问方式类型。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AccessConfigurationDataItems withDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }

    /**
     * 内网访问方式域名。
     * @return domainNames
     */
    public String getDomainNames() {
        return domainNames;
    }

    public void setDomainNames(String domainNames) {
        this.domainNames = domainNames;
    }

    public AccessConfigurationDataItems withAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    public AccessConfigurationDataItems withAccessControl(Consumer<AccessControl> accessControlSetter) {
        if (this.accessControl == null) {
            this.accessControl = new AccessControl();
            accessControlSetter.accept(this.accessControl);
        }

        return this;
    }

    /**
     * Get accessControl
     * @return accessControl
     */
    public AccessControl getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
    }

    public AccessConfigurationDataItems withPorts(List<AccessConfigurationPort> ports) {
        this.ports = ports;
        return this;
    }

    public AccessConfigurationDataItems addPortsItem(AccessConfigurationPort portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public AccessConfigurationDataItems withPorts(Consumer<List<AccessConfigurationPort>> portsSetter) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    /**
     * 访问方式配置端口、协议、证书、URL路径等信息列表。
     * @return ports
     */
    public List<AccessConfigurationPort> getPorts() {
        return ports;
    }

    public void setPorts(List<AccessConfigurationPort> ports) {
        this.ports = ports;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessConfigurationDataItems that = (AccessConfigurationDataItems) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.domainNames, that.domainNames)
            && Objects.equals(this.accessControl, that.accessControl) && Objects.equals(this.ports, that.ports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, domainNames, accessControl, ports);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigurationDataItems {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
        sb.append("    accessControl: ").append(toIndentedString(accessControl)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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
