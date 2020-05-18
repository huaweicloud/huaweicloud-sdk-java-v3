package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class CreateSecurityGroupRuleOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="direction")
    
    private String direction;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ethertype")
    
    private String ethertype;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port_range_min")
    
    private Integer portRangeMin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port_range_max")
    
    private Integer portRangeMax;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remote_ip_prefix")
    
    private String remoteIpPrefix;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remote_group_id")
    
    private String remoteGroupId;

    public CreateSecurityGroupRuleOption withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 安全组ID
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateSecurityGroupRuleOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 功能说明：安全组规则描述 取值范围：0-255个字符，支持数字、字母、中文字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSecurityGroupRuleOption withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    


    /**
     * 功能说明：出入控制方向 取值范围： - egress：出方向 - ingress：入方向
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public CreateSecurityGroupRuleOption withEthertype(String ethertype) {
        this.ethertype = ethertype;
        return this;
    }

    


    /**
     * 功能说明：IP地址协议类型 取值范围：IPv4,IPv6 约束：默认值为IPv4
     * @return ethertype
     */
    public String getEthertype() {
        return ethertype;
    }

    public void setEthertype(String ethertype) {
        this.ethertype = ethertype;
    }

    public CreateSecurityGroupRuleOption withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 功能说明：协议类型 取值范围：tcp、udp、icmp或IP协议编号（0~255） 约束：为空表示支持所有协议
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
     * 功能说明：起始端口值 取值范围：1~65535 约束：不能大于port_range_max的值，为空表示所有端口，如果协议是icmp类型，取值范围请参见 [安全组规则icmp协议名称对应关系表](https://support.huaweicloud.com/api-vpc/vpc_api_0009.html)
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
     * 功能说明：结束端口值 取值范围：1~65535 约束：协议不为icmp时，取值不能小于port_range_min的值，为空表示所有端口，如果协议是icmp类型，取值范围请参见 [安全组规则icmp协议名称对应关系表](https://support.huaweicloud.com/api-vpc/vpc_api_0009.html)
     * @return portRangeMax
     */
    public Integer getPortRangeMax() {
        return portRangeMax;
    }

    public void setPortRangeMax(Integer portRangeMax) {
        this.portRangeMax = portRangeMax;
    }

    public CreateSecurityGroupRuleOption withRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
        return this;
    }

    


    /**
     * 功能说明：远端IP地址，当direction是egress时为虚拟机访问端的地址，当direction是ingress时为访问虚拟机的地址 取值范围：IP地址，或者cidr格式 约束：和remote_group_id互斥
     * @return remoteIpPrefix
     */
    public String getRemoteIpPrefix() {
        return remoteIpPrefix;
    }

    public void setRemoteIpPrefix(String remoteIpPrefix) {
        this.remoteIpPrefix = remoteIpPrefix;
    }

    public CreateSecurityGroupRuleOption withRemoteGroupId(String remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
        return this;
    }

    


    /**
     * 功能说明：对端安全组ID 约束：和remote_ip_prefix互斥
     * @return remoteGroupId
     */
    public String getRemoteGroupId() {
        return remoteGroupId;
    }

    public void setRemoteGroupId(String remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
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
        return Objects.equals(this.securityGroupId, createSecurityGroupRuleOption.securityGroupId) &&
            Objects.equals(this.description, createSecurityGroupRuleOption.description) &&
            Objects.equals(this.direction, createSecurityGroupRuleOption.direction) &&
            Objects.equals(this.ethertype, createSecurityGroupRuleOption.ethertype) &&
            Objects.equals(this.protocol, createSecurityGroupRuleOption.protocol) &&
            Objects.equals(this.portRangeMin, createSecurityGroupRuleOption.portRangeMin) &&
            Objects.equals(this.portRangeMax, createSecurityGroupRuleOption.portRangeMax) &&
            Objects.equals(this.remoteIpPrefix, createSecurityGroupRuleOption.remoteIpPrefix) &&
            Objects.equals(this.remoteGroupId, createSecurityGroupRuleOption.remoteGroupId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(securityGroupId, description, direction, ethertype, protocol, portRangeMin, portRangeMax, remoteIpPrefix, remoteGroupId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityGroupRuleOption {\n");
            sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
            sb.append("    ethertype: ").append(toIndentedString(ethertype)).append("\n");
            sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
            sb.append("    portRangeMin: ").append(toIndentedString(portRangeMin)).append("\n");
            sb.append("    portRangeMax: ").append(toIndentedString(portRangeMax)).append("\n");
            sb.append("    remoteIpPrefix: ").append(toIndentedString(remoteIpPrefix)).append("\n");
            sb.append("    remoteGroupId: ").append(toIndentedString(remoteGroupId)).append("\n");
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

