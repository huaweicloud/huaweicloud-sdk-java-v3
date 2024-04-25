package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class FirewallUpdateRuleItemOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ip_address")

    private String sourceIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_ip_address")

    private String destinationIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_port")

    private String sourcePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_port")

    private String destinationPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_address_group_id")

    private String sourceAddressGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_address_group_id")

    private String destinationAddressGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public FirewallUpdateRuleItemOption withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 功能说明：ACL规则唯一标识 取值范围：合法UUID的字符串
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FirewallUpdateRuleItemOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：ACL规则名称 取值范围：0-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirewallUpdateRuleItemOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：ACL规则描述信息 取值范围：0-255个字符 约束：不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FirewallUpdateRuleItemOption withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 功能说明：ACL规则对流量执行的操作放通或拒绝 取值范围：allow放通；deny拒绝
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public FirewallUpdateRuleItemOption withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 功能说明：ACL规则协议 取值范围：支持tcp,udp,icmp,icmpv6或者协议号（0-255），any表示全部协议
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public FirewallUpdateRuleItemOption withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * 功能说明：ACL规则的ip版本 取值范围：4, 表示ipv4；6, 表示ipv6
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public FirewallUpdateRuleItemOption withSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
        return this;
    }

    /**
     * 功能说明：ACL规则源IP地址或者CIDR 约束：source_ip_address和source_address_group_id不能同时设置
     * @return sourceIpAddress
     */
    public String getSourceIpAddress() {
        return sourceIpAddress;
    }

    public void setSourceIpAddress(String sourceIpAddress) {
        this.sourceIpAddress = sourceIpAddress;
    }

    public FirewallUpdateRuleItemOption withDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
        return this;
    }

    /**
     * 功能说明：ACL规则目的IP地址或者CIDR 约束：destination_ip_address和destination_address_group_id不能同时设置
     * @return destinationIpAddress
     */
    public String getDestinationIpAddress() {
        return destinationIpAddress;
    }

    public void setDestinationIpAddress(String destinationIpAddress) {
        this.destinationIpAddress = destinationIpAddress;
    }

    public FirewallUpdateRuleItemOption withSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    /**
     * 功能说明：ACL规则的源端口 取值范围：支持端口号，一段端口范围，多个以逗号分隔 约束：支持的端口组的数量默认为20
     * @return sourcePort
     */
    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    public FirewallUpdateRuleItemOption withDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    /**
     * 功能说明：ACL规则的目的端口 取值范围：支持端口号，一段端口范围，多个以逗号分隔 约束：支持的端口组的数量默认为20
     * @return destinationPort
     */
    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public FirewallUpdateRuleItemOption withSourceAddressGroupId(String sourceAddressGroupId) {
        this.sourceAddressGroupId = sourceAddressGroupId;
        return this;
    }

    /**
     * 功能说明：ACL规则的源地址组ID 约束：source_ip_address和source_address_group_id不能同时设置
     * @return sourceAddressGroupId
     */
    public String getSourceAddressGroupId() {
        return sourceAddressGroupId;
    }

    public void setSourceAddressGroupId(String sourceAddressGroupId) {
        this.sourceAddressGroupId = sourceAddressGroupId;
    }

    public FirewallUpdateRuleItemOption withDestinationAddressGroupId(String destinationAddressGroupId) {
        this.destinationAddressGroupId = destinationAddressGroupId;
        return this;
    }

    /**
     * 功能说明：ACL规则的目的地址组ID 约束：destination_ip_address和destination_address_group_id不能同时设置
     * @return destinationAddressGroupId
     */
    public String getDestinationAddressGroupId() {
        return destinationAddressGroupId;
    }

    public void setDestinationAddressGroupId(String destinationAddressGroupId) {
        this.destinationAddressGroupId = destinationAddressGroupId;
    }

    public FirewallUpdateRuleItemOption withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 功能说明：是否启用ACL规则。 取值范围：true，表示启用；false，表示停用。 默认值：true。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FirewallUpdateRuleItemOption that = (FirewallUpdateRuleItemOption) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.action, that.action)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.sourceIpAddress, that.sourceIpAddress)
            && Objects.equals(this.destinationIpAddress, that.destinationIpAddress)
            && Objects.equals(this.sourcePort, that.sourcePort)
            && Objects.equals(this.destinationPort, that.destinationPort)
            && Objects.equals(this.sourceAddressGroupId, that.sourceAddressGroupId)
            && Objects.equals(this.destinationAddressGroupId, that.destinationAddressGroupId)
            && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            action,
            protocol,
            ipVersion,
            sourceIpAddress,
            destinationIpAddress,
            sourcePort,
            destinationPort,
            sourceAddressGroupId,
            destinationAddressGroupId,
            enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirewallUpdateRuleItemOption {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    sourceIpAddress: ").append(toIndentedString(sourceIpAddress)).append("\n");
        sb.append("    destinationIpAddress: ").append(toIndentedString(destinationIpAddress)).append("\n");
        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
        sb.append("    destinationPort: ").append(toIndentedString(destinationPort)).append("\n");
        sb.append("    sourceAddressGroupId: ").append(toIndentedString(sourceAddressGroupId)).append("\n");
        sb.append("    destinationAddressGroupId: ").append(toIndentedString(destinationAddressGroupId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
