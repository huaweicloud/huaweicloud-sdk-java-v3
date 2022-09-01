package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 创建SNAT规则的请求体。
 */
public class CreateNatGatewaySnatRuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_gateway_id")

    @JacksonXmlProperty(localName = "nat_gateway_id")

    private String natGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    @JacksonXmlProperty(localName = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_id")

    @JacksonXmlProperty(localName = "network_id")

    private String networkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    @JacksonXmlProperty(localName = "source_type")

    private Integer sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floating_ip_id")

    @JacksonXmlProperty(localName = "floating_ip_id")

    private String floatingIpId;

    public CreateNatGatewaySnatRuleOption withNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    /**
     * 公网NAT网关实例的ID。
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public CreateNatGatewaySnatRuleOption withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * cidr，可以是网段或者主机格式，与network_id参数二选一。 Source_type=0时，cidr必须是vpc 子网网段的子集(不能相等）; Source_type=1时，cidr必须指定专线侧网段。 
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public CreateNatGatewaySnatRuleOption withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * 规则使用的网络id。与cidr参数二选一。
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public CreateNatGatewaySnatRuleOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * SNAT规则的描述，长度限制为255。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateNatGatewaySnatRuleOption withSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 0：VPC侧，可以指定network_id 或者cidr 1：专线侧，只能指定cidr 不输入默认为0（VPC） 
     * @return sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public CreateNatGatewaySnatRuleOption withFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
        return this;
    }

    /**
     * 功能说明：弹性公网IP的id，多个弹性公网IP使用逗号分隔。 取值范围：最大长度4096字节。 约束：弹性公网IP的id个数不能超过20个。 
     * @return floatingIpId
     */
    public String getFloatingIpId() {
        return floatingIpId;
    }

    public void setFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateNatGatewaySnatRuleOption createNatGatewaySnatRuleOption = (CreateNatGatewaySnatRuleOption) o;
        return Objects.equals(this.natGatewayId, createNatGatewaySnatRuleOption.natGatewayId)
            && Objects.equals(this.cidr, createNatGatewaySnatRuleOption.cidr)
            && Objects.equals(this.networkId, createNatGatewaySnatRuleOption.networkId)
            && Objects.equals(this.description, createNatGatewaySnatRuleOption.description)
            && Objects.equals(this.sourceType, createNatGatewaySnatRuleOption.sourceType)
            && Objects.equals(this.floatingIpId, createNatGatewaySnatRuleOption.floatingIpId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natGatewayId, cidr, networkId, description, sourceType, floatingIpId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNatGatewaySnatRuleOption {\n");
        sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    floatingIpId: ").append(toIndentedString(floatingIpId)).append("\n");
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
