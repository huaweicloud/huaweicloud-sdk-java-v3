package com.huaweicloud.sdk.esw.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TunnelInfoResult
 */
public class TunnelInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_ip")

    private String tunnelIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_port")

    private Integer tunnelPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_type")

    private String tunnelType;

    public TunnelInfoResult withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * - 参数解释：ESW所在VPC资源ID。 - 约束限制：   - 需要使用本租户下可操作的VPC资源的ID。   - 带“-”的UUID格式。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public TunnelInfoResult withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * - 参数解释：ESW所在隧道子网ID。 - 约束限制：   - 需要使用本租户下可操作的子网资源的ID；此值即为子网详情中的“网络ID”参数值。   - 带“-”的UUID格式。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public TunnelInfoResult withTunnelIp(String tunnelIp) {
        this.tunnelIp = tunnelIp;
        return this;
    }

    /**
     * - 参数解释：ESW实例的本端隧道IP。 - 约束限制：不能与已存在的子网IP冲突。 - 取值范围：标准的IPv4格式，例：192.168.1.1。 - 默认取值：不涉及。
     * @return tunnelIp
     */
    public String getTunnelIp() {
        return tunnelIp;
    }

    public void setTunnelIp(String tunnelIp) {
        this.tunnelIp = tunnelIp;
    }

    public TunnelInfoResult withTunnelPort(Integer tunnelPort) {
        this.tunnelPort = tunnelPort;
        return this;
    }

    /**
     * - 参数解释：ESW实例的隧道端口。 - 约束限制：不涉及。 - 取值范围：4789。 - 默认取值：不涉及。
     * @return tunnelPort
     */
    public Integer getTunnelPort() {
        return tunnelPort;
    }

    public void setTunnelPort(Integer tunnelPort) {
        this.tunnelPort = tunnelPort;
    }

    public TunnelInfoResult withTunnelType(String tunnelType) {
        this.tunnelType = tunnelType;
        return this;
    }

    /**
     * - 参数解释：ESW实例的隧道协议类型。 - 约束限制：不涉及。 - 取值范围：vxlan。 - 默认取值：不涉及。
     * @return tunnelType
     */
    public String getTunnelType() {
        return tunnelType;
    }

    public void setTunnelType(String tunnelType) {
        this.tunnelType = tunnelType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TunnelInfoResult that = (TunnelInfoResult) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.virsubnetId, that.virsubnetId)
            && Objects.equals(this.tunnelIp, that.tunnelIp) && Objects.equals(this.tunnelPort, that.tunnelPort)
            && Objects.equals(this.tunnelType, that.tunnelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, virsubnetId, tunnelIp, tunnelPort, tunnelType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TunnelInfoResult {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    tunnelIp: ").append(toIndentedString(tunnelIp)).append("\n");
        sb.append("    tunnelPort: ").append(toIndentedString(tunnelPort)).append("\n");
        sb.append("    tunnelType: ").append(toIndentedString(tunnelType)).append("\n");
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
