package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 网络ACL规则。
 */
public class FirewallRule {

    /**
     * 策略是否允许  取值范围：allow，deny，reject
     */
    public static final class ActionEnum {

        /**
         * Enum ALLOW for value: "allow"
         */
        public static final ActionEnum ALLOW = new ActionEnum("allow");

        /**
         * Enum DENY for value: "deny"
         */
        public static final ActionEnum DENY = new ActionEnum("deny");

        /**
         * Enum REJECT for value: "reject"
         */
        public static final ActionEnum REJECT = new ActionEnum("reject");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("allow", ALLOW);
            map.put("deny", DENY);
            map.put("reject", REJECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_ip_address")

    private String destinationIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_port")

    private String destinationPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 网络ACL规则操作状态，作为请求时取值为\"add\"/\"modify\"/\"delete\"，作为返回值时为\"normal\"。 当请求更新规则时，本参数值为delete时，除id之外，本请求体其他参数均可为空。
     */
    public static final class OperateTypeEnum {

        /**
         * Enum ADD for value: "add"
         */
        public static final OperateTypeEnum ADD = new OperateTypeEnum("add");

        /**
         * Enum MODIFY for value: "modify"
         */
        public static final OperateTypeEnum MODIFY = new OperateTypeEnum("modify");

        /**
         * Enum DELETE for value: "delete"
         */
        public static final OperateTypeEnum DELETE = new OperateTypeEnum("delete");

        private static final Map<String, OperateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateTypeEnum> createStaticFields() {
            Map<String, OperateTypeEnum> map = new HashMap<>();
            map.put("add", ADD);
            map.put("modify", MODIFY);
            map.put("delete", DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperateTypeEnum(String value) {
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
        public static OperateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperateTypeEnum(value));
        }

        public static OperateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperateTypeEnum) {
                return this.value.equals(((OperateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private OperateTypeEnum operateType;

    /**
     * IP协议，为any时代表所有协议  取值范围：icmp，tcp，udp，[icmpv6，](tag:hide)any 
     */
    public static final class ProtocolEnum {

        /**
         * Enum ICMP for value: "icmp"
         */
        public static final ProtocolEnum ICMP = new ProtocolEnum("icmp");

        /**
         * Enum TCP for value: "tcp"
         */
        public static final ProtocolEnum TCP = new ProtocolEnum("tcp");

        /**
         * Enum UDP for value: "udp"
         */
        public static final ProtocolEnum UDP = new ProtocolEnum("udp");

        /**
         * Enum ANY_ for value: "any "
         */
        public static final ProtocolEnum ANY_ = new ProtocolEnum("any ");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("icmp", ICMP);
            map.put("tcp", TCP);
            map.put("udp", UDP);
            map.put("any ", ANY_);
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
    @JsonProperty(value = "source_ip_address")

    private String sourceIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_port")

    private String sourcePort;

    public FirewallRule withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 策略是否允许  取值范围：allow，deny，reject
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public FirewallRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 网络ACL规则描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FirewallRule withDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
        return this;
    }

    /**
     * 目的地IP地址，IPv4[或IPv6](tag:hide)的CIDR格式
     * @return destinationIpAddress
     */
    public String getDestinationIpAddress() {
        return destinationIpAddress;
    }

    public void setDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
    }

    public FirewallRule withDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    /**
     * 目的地端口范围  取值范围：整数，比如80，或者以\"-\"隔开的范围，比如80-90
     * @return destinationPort
     */
    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public FirewallRule withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 网络ACL规则使能开关。  取值范围：true，false
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public FirewallRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 网络ACL规则ID。  进行更新规则时，如果operate_type为add，则该值为空。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FirewallRule withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * IP协议版本  取值范围：4[、6](tag:hide)
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public FirewallRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 网络ACL规则名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirewallRule withOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 网络ACL规则操作状态，作为请求时取值为\"add\"/\"modify\"/\"delete\"，作为返回值时为\"normal\"。 当请求更新规则时，本参数值为delete时，除id之外，本请求体其他参数均可为空。
     * @return operateType
     */
    public OperateTypeEnum getOperateType() {
        return operateType;
    }

    public void setOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
    }

    public FirewallRule withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * IP协议，为any时代表所有协议  取值范围：icmp，tcp，udp，[icmpv6，](tag:hide)any 
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public FirewallRule withSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }

    /**
     * 源IP地址，IPv4[或IPv6](tag:hide)的CIDR格式
     * @return sourceIpAddress
     */
    public String getSourceIpAddress() {
        return sourceIpAddress;
    }

    public void setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
    }

    public FirewallRule withSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    /**
     * 源地端口范围  取值范围：整数，比如80，或者以\"-\"隔开的范围，比如80-90
     * @return sourcePort
     */
    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FirewallRule that = (FirewallRule) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.description, that.description)
            && Objects.equals(this.destinationIpAddress, that.destinationIpAddress)
            && Objects.equals(this.destinationPort, that.destinationPort) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.id, that.id) && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.name, that.name) && Objects.equals(this.operateType, that.operateType)
            && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.sourceIpAddress, that.sourceIpAddress)
            && Objects.equals(this.sourcePort, that.sourcePort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            description,
            destinationIpAddress,
            destinationPort,
            enabled,
            id,
            ipVersion,
            name,
            operateType,
            protocol,
            sourceIpAddress,
            sourcePort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirewallRule {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    destinationIpAddress: ").append(toIndentedString(destinationIpAddress)).append("\n");
        sb.append("    destinationPort: ").append(toIndentedString(destinationPort)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    sourceIpAddress: ").append(toIndentedString(sourceIpAddress)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
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
