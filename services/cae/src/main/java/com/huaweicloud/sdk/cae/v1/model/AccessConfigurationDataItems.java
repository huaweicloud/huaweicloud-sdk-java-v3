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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private AccessConfigurationMetadata metadata;

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

    private List<String> domainNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_control")

    private AccessControl accessControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<AccessConfigurationPort> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_id")

    private String elbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    public AccessConfigurationDataItems withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 配置模式。 - 如果operator值为空，则表示使用全量覆盖模式进行配置，否则表示使用增删改模式进行配置。且此级列表的所有元素的operator值必须同时全为空或者非空。 - 当使用增删改模式时，operator取值支持\"add\",\"copy\",\"modify\",\"delete\"，分别表示新增，复制指定uid的元素修改后新增，修改指定uid的元素，删除指定uid的元素。 - 当operator取值为\"copy\",\"modify\",\"delete\"时，uid的值必须为非空，且存在于最后一次生效的配置中。 - 当operator取值为\"copy\",\"modify\"时，与operator同级别的字段中除uid外的所有字段如不写，置空或者为空列表，则表示保留在最后一次生效配置中指定uid的元素的同一字段的值。 
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public AccessConfigurationDataItems withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 访问方式的uid。
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public AccessConfigurationDataItems withMetadata(AccessConfigurationMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public AccessConfigurationDataItems withMetadata(Consumer<AccessConfigurationMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new AccessConfigurationMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public AccessConfigurationMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(AccessConfigurationMetadata metadata) {
        this.metadata = metadata;
    }

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

    public AccessConfigurationDataItems withDomainNames(List<String> domainNames) {
        this.domainNames = domainNames;
        return this;
    }

    public AccessConfigurationDataItems addDomainNamesItem(String domainNamesItem) {
        if (this.domainNames == null) {
            this.domainNames = new ArrayList<>();
        }
        this.domainNames.add(domainNamesItem);
        return this;
    }

    public AccessConfigurationDataItems withDomainNames(Consumer<List<String>> domainNamesSetter) {
        if (this.domainNames == null) {
            this.domainNames = new ArrayList<>();
        }
        domainNamesSetter.accept(this.domainNames);
        return this;
    }

    /**
     * 内网访问方式域名。
     * @return domainNames
     */
    public List<String> getDomainNames() {
        return domainNames;
    }

    public void setDomainNames(List<String> domainNames) {
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

    public AccessConfigurationDataItems withElbId(String elbId) {
        this.elbId = elbId;
        return this;
    }

    /**
     * 用户选择的elb的ID。
     * @return elbId
     */
    public String getElbId() {
        return elbId;
    }

    public void setElbId(String elbId) {
        this.elbId = elbId;
    }

    public AccessConfigurationDataItems withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 响应体参数，用户选择的elb的公网ip。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public AccessConfigurationDataItems withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 响应体参数，用户选择的elb的私网ip。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
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
        return Objects.equals(this.operator, that.operator) && Objects.equals(this.uid, that.uid)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.type, that.type)
            && Objects.equals(this.domainNames, that.domainNames)
            && Objects.equals(this.accessControl, that.accessControl) && Objects.equals(this.ports, that.ports)
            && Objects.equals(this.elbId, that.elbId) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.privateIp, that.privateIp);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(operator, uid, metadata, type, domainNames, accessControl, ports, elbId, publicIp, privateIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigurationDataItems {\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
        sb.append("    accessControl: ").append(toIndentedString(accessControl)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    elbId: ").append(toIndentedString(elbId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
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
