package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 可信节点部署详情
 */
public class TicsAgentDeployDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_access_address")

    private String agentAccessAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_cluster_id")

    private String cceClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_cluster_name")

    private String cceClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "console_ip")

    private String consoleIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "console_port")

    private Integer consolePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_path")

    private String hostPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_pvc_name")

    private String obsPvcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "persistence_id")

    private String persistenceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_port")

    private Integer webPort;

    public TicsAgentDeployDetail withAgentAccessAddress(String agentAccessAddress) {
        this.agentAccessAddress = agentAccessAddress;
        return this;
    }

    /**
     * 可信节点访问地址
     * @return agentAccessAddress
     */
    public String getAgentAccessAddress() {
        return agentAccessAddress;
    }

    public void setAgentAccessAddress(String agentAccessAddress) {
        this.agentAccessAddress = agentAccessAddress;
    }

    public TicsAgentDeployDetail withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 可信节点Id
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public TicsAgentDeployDetail withCceClusterId(String cceClusterId) {
        this.cceClusterId = cceClusterId;
        return this;
    }

    /**
     * 可信节点所在cce集群的Id
     * @return cceClusterId
     */
    public String getCceClusterId() {
        return cceClusterId;
    }

    public void setCceClusterId(String cceClusterId) {
        this.cceClusterId = cceClusterId;
    }

    public TicsAgentDeployDetail withCceClusterName(String cceClusterName) {
        this.cceClusterName = cceClusterName;
        return this;
    }

    /**
     * 可信节点所在cce集群的名称
     * @return cceClusterName
     */
    public String getCceClusterName() {
        return cceClusterName;
    }

    public void setCceClusterName(String cceClusterName) {
        this.cceClusterName = cceClusterName;
    }

    public TicsAgentDeployDetail withConsoleIp(String consoleIp) {
        this.consoleIp = consoleIp;
        return this;
    }

    /**
     * 可信节点所在ip
     * @return consoleIp
     */
    public String getConsoleIp() {
        return consoleIp;
    }

    public void setConsoleIp(String consoleIp) {
        this.consoleIp = consoleIp;
    }

    public TicsAgentDeployDetail withConsolePort(Integer consolePort) {
        this.consolePort = consolePort;
        return this;
    }

    /**
     * 可信节点服务端口
     * @return consolePort
     */
    public Integer getConsolePort() {
        return consolePort;
    }

    public void setConsolePort(Integer consolePort) {
        this.consolePort = consolePort;
    }

    public TicsAgentDeployDetail withHostPath(String hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    /**
     * 主机挂载路径，本地挂载才会有值
     * @return hostPath
     */
    public String getHostPath() {
        return hostPath;
    }

    public void setHostPath(String hostPath) {
        this.hostPath = hostPath;
    }

    public TicsAgentDeployDetail withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * 命名空间名称
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public TicsAgentDeployDetail withObsPvcName(String obsPvcName) {
        this.obsPvcName = obsPvcName;
        return this;
    }

    /**
     * 可信节点CCE部署场景，对象文件存储PVC
     * @return obsPvcName
     */
    public String getObsPvcName() {
        return obsPvcName;
    }

    public void setObsPvcName(String obsPvcName) {
        this.obsPvcName = obsPvcName;
    }

    public TicsAgentDeployDetail withPersistenceId(String persistenceId) {
        this.persistenceId = persistenceId;
        return this;
    }

    /**
     * 持久化存储唯一标识
     * @return persistenceId
     */
    public String getPersistenceId() {
        return persistenceId;
    }

    public void setPersistenceId(String persistenceId) {
        this.persistenceId = persistenceId;
    }

    public TicsAgentDeployDetail withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 代理部署规格
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public TicsAgentDeployDetail withWebPort(Integer webPort) {
        this.webPort = webPort;
        return this;
    }

    /**
     * 可信节点访问端口
     * @return webPort
     */
    public Integer getWebPort() {
        return webPort;
    }

    public void setWebPort(Integer webPort) {
        this.webPort = webPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicsAgentDeployDetail that = (TicsAgentDeployDetail) obj;
        return Objects.equals(this.agentAccessAddress, that.agentAccessAddress)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.cceClusterId, that.cceClusterId)
            && Objects.equals(this.cceClusterName, that.cceClusterName)
            && Objects.equals(this.consoleIp, that.consoleIp) && Objects.equals(this.consolePort, that.consolePort)
            && Objects.equals(this.hostPath, that.hostPath) && Objects.equals(this.namespaceName, that.namespaceName)
            && Objects.equals(this.obsPvcName, that.obsPvcName)
            && Objects.equals(this.persistenceId, that.persistenceId)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.webPort, that.webPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentAccessAddress,
            agentId,
            cceClusterId,
            cceClusterName,
            consoleIp,
            consolePort,
            hostPath,
            namespaceName,
            obsPvcName,
            persistenceId,
            resourceSpecCode,
            webPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicsAgentDeployDetail {\n");
        sb.append("    agentAccessAddress: ").append(toIndentedString(agentAccessAddress)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    cceClusterId: ").append(toIndentedString(cceClusterId)).append("\n");
        sb.append("    cceClusterName: ").append(toIndentedString(cceClusterName)).append("\n");
        sb.append("    consoleIp: ").append(toIndentedString(consoleIp)).append("\n");
        sb.append("    consolePort: ").append(toIndentedString(consolePort)).append("\n");
        sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    obsPvcName: ").append(toIndentedString(obsPvcName)).append("\n");
        sb.append("    persistenceId: ").append(toIndentedString(persistenceId)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    webPort: ").append(toIndentedString(webPort)).append("\n");
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
