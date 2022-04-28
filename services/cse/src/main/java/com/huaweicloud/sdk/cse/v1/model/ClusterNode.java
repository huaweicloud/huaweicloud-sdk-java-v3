package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClusterNode
 */
public class ClusterNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az")

    private String az;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ClusterNode withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 微服务引擎专享版CCE节点ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClusterNode withAz(String az) {
        this.az = az;
        return this;
    }

    /**
     * 微服务引擎专享版CCE节点所属可用区
     * @return az
     */
    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public ClusterNode withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 微服务引擎专享版CCE节点IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ClusterNode withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 微服务引擎专享版CCE节点标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ClusterNode withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 微服务引擎专享版CCE节点状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterNode clusterNode = (ClusterNode) o;
        return Objects.equals(this.id, clusterNode.id) && Objects.equals(this.az, clusterNode.az)
            && Objects.equals(this.ip, clusterNode.ip) && Objects.equals(this.label, clusterNode.label)
            && Objects.equals(this.status, clusterNode.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, az, ip, label, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterNode {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
