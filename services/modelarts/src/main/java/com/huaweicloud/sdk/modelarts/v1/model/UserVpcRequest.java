package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：用户VPC配置。 **约束限制**：不涉及。
 */
public class UserVpcRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_ids")

    private List<String> securityGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_cidrs")

    private List<String> connectCidrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_id")

    private String natId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id")

    private String eipId;

    public UserVpcRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**：虚拟私有网络（VPC） ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public UserVpcRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释**：子网ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public UserVpcRequest withSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public UserVpcRequest addSecurityGroupIdsItem(String securityGroupIdsItem) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupIdsItem);
        return this;
    }

    public UserVpcRequest withSecurityGroupIds(Consumer<List<String>> securityGroupIdsSetter) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        securityGroupIdsSetter.accept(this.securityGroupIds);
        return this;
    }

    /**
     * **参数解释**：安全组ID列表。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return securityGroupIds
     */
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public UserVpcRequest withConnectCidrs(List<String> connectCidrs) {
        this.connectCidrs = connectCidrs;
        return this;
    }

    public UserVpcRequest addConnectCidrsItem(String connectCidrsItem) {
        if (this.connectCidrs == null) {
            this.connectCidrs = new ArrayList<>();
        }
        this.connectCidrs.add(connectCidrsItem);
        return this;
    }

    public UserVpcRequest withConnectCidrs(Consumer<List<String>> connectCidrsSetter) {
        if (this.connectCidrs == null) {
            this.connectCidrs = new ArrayList<>();
        }
        connectCidrsSetter.accept(this.connectCidrs);
        return this;
    }

    /**
     * **参数解释**：连接的CIDR地址列表。 **约束限制**：选填参数，适用场景：用户希望通过挂载的网卡，访问其他网段的地址。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return connectCidrs
     */
    public List<String> getConnectCidrs() {
        return connectCidrs;
    }

    public void setConnectCidrs(List<String> connectCidrs) {
        this.connectCidrs = connectCidrs;
    }

    public UserVpcRequest withNatId(String natId) {
        this.natId = natId;
        return this;
    }

    /**
     * **参数解释**：NAT ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return natId
     */
    public String getNatId() {
        return natId;
    }

    public void setNatId(String natId) {
        this.natId = natId;
    }

    public UserVpcRequest withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    /**
     * **参数解释**：EIP ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserVpcRequest that = (UserVpcRequest) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupIds, that.securityGroupIds)
            && Objects.equals(this.connectCidrs, that.connectCidrs) && Objects.equals(this.natId, that.natId)
            && Objects.equals(this.eipId, that.eipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, subnetId, securityGroupIds, connectCidrs, natId, eipId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserVpcRequest {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
        sb.append("    connectCidrs: ").append(toIndentedString(connectCidrs)).append("\n");
        sb.append("    natId: ").append(toIndentedString(natId)).append("\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
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
