package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServerNetwork
 */
public class ServerNetwork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roce_id")

    private String roceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyper_cluster")

    private ServerNetworkHyperCluster hyperCluster;

    public ServerNetwork withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * **参数解释**：创建服务器是否启用IPv6。表示在创建服务器时是否启用IPv6支持。 **约束限制**：不涉及。 **取值范围**： - true：启用IPv6 - false：不启用IPv6 **默认取值**：不涉及。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public ServerNetwork withRoceId(String roceId) {
        this.roceId = roceId;
        return this;
    }

    /**
     * **参数解释**：服务器RoCE网络ID。表示服务器的RoCE网络ID。 **约束限制**：不涉及。 **取值范围**：必须是UUID格式的字符串。 **默认取值**：不涉及。
     * @return roceId
     */
    public String getRoceId() {
        return roceId;
    }

    public void setRoceId(String roceId) {
        this.roceId = roceId;
    }

    public ServerNetwork withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * **参数解释**：服务器所在的安全组ID。表示服务器所属的安全组ID。 **约束限制**：不涉及。 **取值范围**：必须是UUID格式的字符串。 **默认取值**：不涉及。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ServerNetwork withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释**：服务器所在子网ID。表示服务器所属的子网ID。 **约束限制**：不涉及。 **取值范围**：必须是UUID格式的字符串。 **默认取值**：不涉及。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ServerNetwork withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**：服务器所在虚拟私有云ID。表示服务器所属的虚拟私有云ID。 **约束限制**：不涉及。 **取值范围**：必须是UUID格式的字符串。 **默认取值**：不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ServerNetwork withHyperCluster(ServerNetworkHyperCluster hyperCluster) {
        this.hyperCluster = hyperCluster;
        return this;
    }

    public ServerNetwork withHyperCluster(Consumer<ServerNetworkHyperCluster> hyperClusterSetter) {
        if (this.hyperCluster == null) {
            this.hyperCluster = new ServerNetworkHyperCluster();
            hyperClusterSetter.accept(this.hyperCluster);
        }

        return this;
    }

    /**
     * Get hyperCluster
     * @return hyperCluster
     */
    public ServerNetworkHyperCluster getHyperCluster() {
        return hyperCluster;
    }

    public void setHyperCluster(ServerNetworkHyperCluster hyperCluster) {
        this.hyperCluster = hyperCluster;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerNetwork that = (ServerNetwork) obj;
        return Objects.equals(this.ipv6Enable, that.ipv6Enable) && Objects.equals(this.roceId, that.roceId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.hyperCluster, that.hyperCluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipv6Enable, roceId, securityGroupId, subnetId, vpcId, hyperCluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerNetwork {\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    roceId: ").append(toIndentedString(roceId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    hyperCluster: ").append(toIndentedString(hyperCluster)).append("\n");
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
