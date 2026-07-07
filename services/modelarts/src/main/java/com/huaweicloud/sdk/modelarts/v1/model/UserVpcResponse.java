package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：用户VPC配置。
 */
public class UserVpcResponse {

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

    private String connectCidrs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private List<String> portId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_ip")

    private String portIp;

    public UserVpcResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**：虚拟私有网络（VPC）ID。 **取值范围**：不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public UserVpcResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释**：子网ID。 **取值范围**：不涉及。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public UserVpcResponse withSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public UserVpcResponse addSecurityGroupIdsItem(String securityGroupIdsItem) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupIdsItem);
        return this;
    }

    public UserVpcResponse withSecurityGroupIds(Consumer<List<String>> securityGroupIdsSetter) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        securityGroupIdsSetter.accept(this.securityGroupIds);
        return this;
    }

    /**
     * **参数解释**：安全组ID列表。 **取值范围**：不涉及。
     * @return securityGroupIds
     */
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public UserVpcResponse withConnectCidrs(String connectCidrs) {
        this.connectCidrs = connectCidrs;
        return this;
    }

    /**
     * **参数解释**：连接的CIDR地址列表。 **取值范围**：不涉及。
     * @return connectCidrs
     */
    public String getConnectCidrs() {
        return connectCidrs;
    }

    public void setConnectCidrs(String connectCidrs) {
        this.connectCidrs = connectCidrs;
    }

    public UserVpcResponse withPortId(List<String> portId) {
        this.portId = portId;
        return this;
    }

    public UserVpcResponse addPortIdItem(String portIdItem) {
        if (this.portId == null) {
            this.portId = new ArrayList<>();
        }
        this.portId.add(portIdItem);
        return this;
    }

    public UserVpcResponse withPortId(Consumer<List<String>> portIdSetter) {
        if (this.portId == null) {
            this.portId = new ArrayList<>();
        }
        portIdSetter.accept(this.portId);
        return this;
    }

    /**
     * **参数解释**：网卡ID。 **取值范围**：不涉及。
     * @return portId
     */
    public List<String> getPortId() {
        return portId;
    }

    public void setPortId(List<String> portId) {
        this.portId = portId;
    }

    public UserVpcResponse withPortIp(String portIp) {
        this.portIp = portIp;
        return this;
    }

    /**
     * **参数解释**：网卡ip。 **取值范围**：不涉及。
     * @return portIp
     */
    public String getPortIp() {
        return portIp;
    }

    public void setPortIp(String portIp) {
        this.portIp = portIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserVpcResponse that = (UserVpcResponse) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupIds, that.securityGroupIds)
            && Objects.equals(this.connectCidrs, that.connectCidrs) && Objects.equals(this.portId, that.portId)
            && Objects.equals(this.portIp, that.portIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, subnetId, securityGroupIds, connectCidrs, portId, portIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserVpcResponse {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
        sb.append("    connectCidrs: ").append(toIndentedString(connectCidrs)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    portIp: ").append(toIndentedString(portIp)).append("\n");
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
