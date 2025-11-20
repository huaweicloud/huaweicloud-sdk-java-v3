package com.huaweicloud.sdk.esw.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RemoteInfosResult
 */
public class RemoteInfosResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segmentation_id")

    private Integer segmentationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_ip")

    private String tunnelIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_port")

    private Integer tunnelPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_type")

    private String tunnelType;

    public RemoteInfosResult withSegmentationId(Integer segmentationId) {
        this.segmentationId = segmentationId;
        return this;
    }

    /**
     * - 参数解释：二层连接的隧道号，对应VXLAN网络标识VNI。 - 约束限制：需与对端VXLAN设置的VNI保持一致。 - 取值范围：1-16777216。 - 默认取值：不涉及。
     * @return segmentationId
     */
    public Integer getSegmentationId() {
        return segmentationId;
    }

    public void setSegmentationId(Integer segmentationId) {
        this.segmentationId = segmentationId;
    }

    public RemoteInfosResult withTunnelIp(String tunnelIp) {
        this.tunnelIp = tunnelIp;
        return this;
    }

    /**
     * - 参数解释：ESW实例的远端隧道IP。 - 约束限制：不能与已存在的子网IP冲突。 - 取值范围：标准的IPv4格式，例：192.168.1.1。 - 默认取值：不涉及。
     * @return tunnelIp
     */
    public String getTunnelIp() {
        return tunnelIp;
    }

    public void setTunnelIp(String tunnelIp) {
        this.tunnelIp = tunnelIp;
    }

    public RemoteInfosResult withTunnelPort(Integer tunnelPort) {
        this.tunnelPort = tunnelPort;
        return this;
    }

    /**
     * - 参数解释：二层连接的远端隧道端口。 - 约束限制：不涉及。 - 取值范围：4789。 - 默认取值：不涉及。
     * @return tunnelPort
     */
    public Integer getTunnelPort() {
        return tunnelPort;
    }

    public void setTunnelPort(Integer tunnelPort) {
        this.tunnelPort = tunnelPort;
    }

    public RemoteInfosResult withTunnelType(String tunnelType) {
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
        RemoteInfosResult that = (RemoteInfosResult) obj;
        return Objects.equals(this.segmentationId, that.segmentationId) && Objects.equals(this.tunnelIp, that.tunnelIp)
            && Objects.equals(this.tunnelPort, that.tunnelPort) && Objects.equals(this.tunnelType, that.tunnelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segmentationId, tunnelIp, tunnelPort, tunnelType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoteInfosResult {\n");
        sb.append("    segmentationId: ").append(toIndentedString(segmentationId)).append("\n");
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
