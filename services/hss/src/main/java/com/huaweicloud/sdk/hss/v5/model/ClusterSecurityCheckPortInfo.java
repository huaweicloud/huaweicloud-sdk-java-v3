package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 端口信息
 */
public class ClusterSecurityCheckPortInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_name")

    private String podName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private Integer pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "laddr")

    private String laddr;

    public ClusterSecurityCheckPortInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： 端口号 **取值范围**： 不涉及 
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ClusterSecurityCheckPortInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**： 容器ID **取值范围**： 不涉及 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ClusterSecurityCheckPortInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**： 容器名称 **取值范围**： 不涉及 
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ClusterSecurityCheckPortInfo withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * **参数解释**： pod名称 **取值范围**： 不涉及 
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public ClusterSecurityCheckPortInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**： 节点名称 **取值范围**： 不涉及 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ClusterSecurityCheckPortInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**： 私有IP地址 **取值范围**： 不涉及 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ClusterSecurityCheckPortInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**： 公有IP地址 **取值范围**： 不涉及 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ClusterSecurityCheckPortInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**： 程序文件 **取值范围**： 不涉及 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ClusterSecurityCheckPortInfo withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * **参数解释**： 进程PID **取值范围**： 不涉及 
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public ClusterSecurityCheckPortInfo withLaddr(String laddr) {
        this.laddr = laddr;
        return this;
    }

    /**
     * **参数解释**： 监听IP **取值范围**： 不涉及 
     * @return laddr
     */
    public String getLaddr() {
        return laddr;
    }

    public void setLaddr(String laddr) {
        this.laddr = laddr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterSecurityCheckPortInfo that = (ClusterSecurityCheckPortInfo) obj;
        return Objects.equals(this.port, that.port) && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.podName, that.podName)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.path, that.path)
            && Objects.equals(this.pid, that.pid) && Objects.equals(this.laddr, that.laddr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, containerId, containerName, podName, hostName, privateIp, publicIp, path, pid, laddr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterSecurityCheckPortInfo {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    laddr: ").append(toIndentedString(laddr)).append("\n");
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
