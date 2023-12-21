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
 * 创建安全组规则参数
 */
public class CreateSecurityGroupRuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    /**
     * 出入控制方向。  取值范围：  - egress：出方向  - ingress：入方向
     */
    public static final class DirectionEnum {

        /**
         * Enum INGRESS for value: "ingress"
         */
        public static final DirectionEnum INGRESS = new DirectionEnum("ingress");

        /**
         * Enum EGRESS for value: "egress"
         */
        public static final DirectionEnum EGRESS = new DirectionEnum("egress");

        private static final Map<String, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DirectionEnum> createStaticFields() {
            Map<String, DirectionEnum> map = new HashMap<>();
            map.put("ingress", INGRESS);
            map.put("egress", EGRESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DirectionEnum(String value) {
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
        public static DirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DirectionEnum(value));
        }

        public static DirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private DirectionEnum direction;

    /**
     * IP协议类型。  取值范围：IPv4,IPv6
     */
    public static final class EthertypeEnum {

        /**
         * Enum IPV4 for value: "IPv4"
         */
        public static final EthertypeEnum IPV4 = new EthertypeEnum("IPv4");

        /**
         * Enum IPV6 for value: "IPv6"
         */
        public static final EthertypeEnum IPV6 = new EthertypeEnum("IPv6");

        private static final Map<String, EthertypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EthertypeEnum> createStaticFields() {
            Map<String, EthertypeEnum> map = new HashMap<>();
            map.put("IPv4", IPV4);
            map.put("IPv6", IPV6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EthertypeEnum(String value) {
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
        public static EthertypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EthertypeEnum(value));
        }

        public static EthertypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EthertypeEnum) {
                return this.value.equals(((EthertypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ethertype")

    private EthertypeEnum ethertype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_range_min")

    private Integer portRangeMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_range_max")

    private Integer portRangeMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_group_id")

    private String remoteGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_ip_prefix")

    private String remoteIpPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    public CreateSecurityGroupRuleOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 安全组规则描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSecurityGroupRuleOption withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateSecurityGroupRuleOption withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 出入控制方向。  取值范围：  - egress：出方向  - ingress：入方向
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public CreateSecurityGroupRuleOption withEthertype(EthertypeEnum ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    /**
     * IP协议类型。  取值范围：IPv4,IPv6
     * @return ethertype
     */
    public EthertypeEnum getEthertype() {
        return ethertype;
    }

    public void setEthertype(EthertypeEnum ethertype) {
        this.ethertype = ethertype;
    }

    public CreateSecurityGroupRuleOption withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型。  取值范围：icmp、tcp、udp、icmpv6或IP协议号（0~255）  约束：为空表示支持所有协议
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public CreateSecurityGroupRuleOption withPortRangeMin(Integer portRangeMin) {
        this.portRangeMin = portRangeMin;
        return this;
    }

    /**
     * 起始端口值。  取值范围：1~65535  约束：取值不能大于port_range_max的值，为空表示所有端口。 
     * @return portRangeMin
     */
    public Integer getPortRangeMin() {
        return portRangeMin;
    }

    public void setPortRangeMin(Integer portRangeMin) {
        this.portRangeMin = portRangeMin;
    }

    public CreateSecurityGroupRuleOption withPortRangeMax(Integer portRangeMax) {
        this.portRangeMax = portRangeMax;
        return this;
    }

    /**
     * 结束端口值。  取值范围：1~65535  约束：取值不能小于port_range_min的值，为空表示所有端口。 
     * @return portRangeMax
     */
    public Integer getPortRangeMax() {
        return portRangeMax;
    }

    public void setPortRangeMax(Integer portRangeMax) {
        this.portRangeMax = portRangeMax;
    }

    public CreateSecurityGroupRuleOption withRemoteGroupId(String remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
        return this;
    }

    /**
     * 对端安全组id。  约束：和remote_ip_prefix互斥 
     * @return remoteGroupId
     */
    public String getRemoteGroupId() {
        return remoteGroupId;
    }

    public void setRemoteGroupId(String remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
    }

    public CreateSecurityGroupRuleOption withRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
        return this;
    }

    /**
     * 远端IP地址，当direction是egress时为虚拟机访问端的地址，当direction是ingress时为访问虚拟机的地址。  取值范围：IP地址，或者cidr格式  约束：和remote_group_id互斥
     * @return remoteIpPrefix
     */
    public String getRemoteIpPrefix() {
        return remoteIpPrefix;
    }

    public void setRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
    }

    public CreateSecurityGroupRuleOption withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 安全组规则生效策略 取值范围：allow 允许，deny 拒绝  约束：默认值为allow
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CreateSecurityGroupRuleOption withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 规则在安全组中的优先级  取值范围：1~100，1代表最高优先级  约束：默认值为1
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSecurityGroupRuleOption that = (CreateSecurityGroupRuleOption) obj;
        return Objects.equals(this.description, that.description)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.direction, that.direction) && Objects.equals(this.ethertype, that.ethertype)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.portRangeMin, that.portRangeMin)
            && Objects.equals(this.portRangeMax, that.portRangeMax)
            && Objects.equals(this.remoteGroupId, that.remoteGroupId)
            && Objects.equals(this.remoteIpPrefix, that.remoteIpPrefix) && Objects.equals(this.action, that.action)
            && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            securityGroupId,
            direction,
            ethertype,
            protocol,
            portRangeMin,
            portRangeMax,
            remoteGroupId,
            remoteIpPrefix,
            action,
            priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityGroupRuleOption {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    ethertype: ").append(toIndentedString(ethertype)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    portRangeMin: ").append(toIndentedString(portRangeMin)).append("\n");
        sb.append("    portRangeMax: ").append(toIndentedString(portRangeMax)).append("\n");
        sb.append("    remoteGroupId: ").append(toIndentedString(remoteGroupId)).append("\n");
        sb.append("    remoteIpPrefix: ").append(toIndentedString(remoteIpPrefix)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
