package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 创建安全组规则参数 */
public class CreateSecurityGroupRuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    /** 出入控制方向。 取值范围： - egress：出方向 - ingress：入方向 */
    public static final class DirectionEnum {

        /** Enum INGRESS for value: "ingress" */
        public static final DirectionEnum INGRESS = new DirectionEnum("ingress");

        /** Enum EGRESS for value: "egress" */
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
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DirectionEnum(value);
            }
            return result;
        }

        public static DirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /** IP协议类型。 取值范围：IPv4[,IPv6](tag:hide) */
    public static final class EthertypeEnum {

        /** Enum IPV4 for value: "IPv4" */
        public static final EthertypeEnum IPV4 = new EthertypeEnum("IPv4");

        private static final Map<String, EthertypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EthertypeEnum> createStaticFields() {
            Map<String, EthertypeEnum> map = new HashMap<>();
            map.put("IPv4", IPV4);
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
            EthertypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EthertypeEnum(value);
            }
            return result;
        }

        public static EthertypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EthertypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public CreateSecurityGroupRuleOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 安全组规则描述信息。
     * 
     * @return description */
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

    /** 安全组ID。
     * 
     * @return securityGroupId */
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

    /** 出入控制方向。 取值范围： - egress：出方向 - ingress：入方向
     * 
     * @return direction */
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

    /** IP协议类型。 取值范围：IPv4[,IPv6](tag:hide)
     * 
     * @return ethertype */
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

    /** 协议类型。 取值范围：icmp、tcp、udp等 约束：为空表示支持所有协议
     * 
     * @return protocol */
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

    /** 起始端口值。 取值范围：1~65535 约束：取值不能大于port_range_max的值，为空表示所有端口。
     * 
     * @return portRangeMin */
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

    /** 结束端口值。 取值范围：1~65535 约束：取值不能小于port_range_min的值，为空表示所有端口。
     * 
     * @return portRangeMax */
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

    /** 对端安全组id。 约束：和remote_ip_prefix互斥
     * 
     * @return remoteGroupId */
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

    /** 远端IP地址，当direction是egress时为虚拟机访问端的地址，当direction是ingress时为访问虚拟机的地址。 取值范围：IP地址，或者cidr格式 约束：和remote_group_id互斥
     * 
     * @return remoteIpPrefix */
    public String getRemoteIpPrefix() {
        return remoteIpPrefix;
    }

    public void setRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSecurityGroupRuleOption createSecurityGroupRuleOption = (CreateSecurityGroupRuleOption) o;
        return Objects.equals(this.description, createSecurityGroupRuleOption.description)
            && Objects.equals(this.securityGroupId, createSecurityGroupRuleOption.securityGroupId)
            && Objects.equals(this.direction, createSecurityGroupRuleOption.direction)
            && Objects.equals(this.ethertype, createSecurityGroupRuleOption.ethertype)
            && Objects.equals(this.protocol, createSecurityGroupRuleOption.protocol)
            && Objects.equals(this.portRangeMin, createSecurityGroupRuleOption.portRangeMin)
            && Objects.equals(this.portRangeMax, createSecurityGroupRuleOption.portRangeMax)
            && Objects.equals(this.remoteGroupId, createSecurityGroupRuleOption.remoteGroupId)
            && Objects.equals(this.remoteIpPrefix, createSecurityGroupRuleOption.remoteIpPrefix);
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
            remoteIpPrefix);
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
