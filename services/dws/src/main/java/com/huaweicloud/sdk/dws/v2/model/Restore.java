package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 恢复对象。 **取值范围**： 不涉及。
 */
public class Restore {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private PublicIp publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    public Restore withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 集群名称。 **取值范围**： 要求唯一性，必须以字母开头并只包含字母、数字、中划线，下划线，长度为4~64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Restore withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释**： 指定子网ID，用于集群网络配置。 **取值范围**： 默认值与原集群相同。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public Restore withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * **参数解释**： 指定安全组ID，用于集群网络配置。默认值与原集群相同。 **取值范围**： 不涉及。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public Restore withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**： 指定虚拟私有云ID，用于集群网络配置。默认值与原集群相同。 **取值范围**： 不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Restore withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * **参数解释**： 指定集群可用区。默认值与原集群相同。 **取值范围**： 不涉及。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Restore withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： 指定集群服务端口。 **取值范围**： 不涉及。
     * minimum: 8000
     * maximum: 30000
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Restore withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public Restore withPublicIp(Consumer<PublicIp> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new PublicIp();
            publicIpSetter.accept(this.publicIp);
        }

        return this;
    }

    /**
     * Get publicIp
     * @return publicIp
     */
    public PublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
    }

    public Restore withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID，对集群指定企业项目。如果未指定，则使用默认企业项目“default”的ID，即0。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public Restore withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * **参数解释**： 指定网络协议类型，表明是否支持IPv6，默认不使用IPv6。 **取值范围**： 不涉及。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Restore that = (Restore) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.port, that.port)
            && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.ipv6Enable, that.ipv6Enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            subnetId,
            securityGroupId,
            vpcId,
            availabilityZone,
            port,
            publicIp,
            enterpriseProjectId,
            ipv6Enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Restore {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
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
