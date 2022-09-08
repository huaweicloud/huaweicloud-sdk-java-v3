package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floating_ip")

    private String floatingIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_name")

    private String subnetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datavolume_id")

    private String datavolumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "res_subnet_ip")

    private String resSubnetIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "systemvolume_id")

    private String systemvolumeId;

    public ShowNodeResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 节点状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowNodeResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowNodeResponse withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点id。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ShowNodeResponse withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 节点私有ip。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ShowNodeResponse withFloatingIp(String floatingIp) {
        this.floatingIp = floatingIp;
        return this;
    }

    /**
     * 节点浮动ip。
     * @return floatingIp
     */
    public String getFloatingIp() {
        return floatingIp;
    }

    public void setFloatingIp(String floatingIp) {
        this.floatingIp = floatingIp;
    }

    public ShowNodeResponse withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 虚机id。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ShowNodeResponse withSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * 子网名称。
     * @return subnetName
     */
    public String getSubnetName() {
        return subnetName;
    }

    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    public ShowNodeResponse withDatavolumeId(String datavolumeId) {
        this.datavolumeId = datavolumeId;
        return this;
    }

    /**
     * 数据盘id。
     * @return datavolumeId
     */
    public String getDatavolumeId() {
        return datavolumeId;
    }

    public void setDatavolumeId(String datavolumeId) {
        this.datavolumeId = datavolumeId;
    }

    public ShowNodeResponse withResSubnetIp(String resSubnetIp) {
        this.resSubnetIp = resSubnetIp;
        return this;
    }

    /**
     * 资源子网ip。
     * @return resSubnetIp
     */
    public String getResSubnetIp() {
        return resSubnetIp;
    }

    public void setResSubnetIp(String resSubnetIp) {
        this.resSubnetIp = resSubnetIp;
    }

    public ShowNodeResponse withSystemvolumeId(String systemvolumeId) {
        this.systemvolumeId = systemvolumeId;
        return this;
    }

    /**
     * 系统盘id。
     * @return systemvolumeId
     */
    public String getSystemvolumeId() {
        return systemvolumeId;
    }

    public void setSystemvolumeId(String systemvolumeId) {
        this.systemvolumeId = systemvolumeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowNodeResponse showNodeResponse = (ShowNodeResponse) o;
        return Objects.equals(this.status, showNodeResponse.status) && Objects.equals(this.name, showNodeResponse.name)
            && Objects.equals(this.nodeId, showNodeResponse.nodeId)
            && Objects.equals(this.privateIp, showNodeResponse.privateIp)
            && Objects.equals(this.floatingIp, showNodeResponse.floatingIp)
            && Objects.equals(this.serverId, showNodeResponse.serverId)
            && Objects.equals(this.subnetName, showNodeResponse.subnetName)
            && Objects.equals(this.datavolumeId, showNodeResponse.datavolumeId)
            && Objects.equals(this.resSubnetIp, showNodeResponse.resSubnetIp)
            && Objects.equals(this.systemvolumeId, showNodeResponse.systemvolumeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            name,
            nodeId,
            privateIp,
            floatingIp,
            serverId,
            subnetName,
            datavolumeId,
            resSubnetIp,
            systemvolumeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNodeResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    floatingIp: ").append(toIndentedString(floatingIp)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
        sb.append("    datavolumeId: ").append(toIndentedString(datavolumeId)).append("\n");
        sb.append("    resSubnetIp: ").append(toIndentedString(resSubnetIp)).append("\n");
        sb.append("    systemvolumeId: ").append(toIndentedString(systemvolumeId)).append("\n");
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
