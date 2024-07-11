package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeploymentHostRequestExternal
 */
public class DeploymentHostRequestExternal {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "as_proxy")

    private Boolean asProxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization")

    private DeploymentHostAuthorizationBody authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_host_id")

    private String proxyHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync")

    private Boolean sync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_icagent")

    private Boolean installIcagent;

    public DeploymentHostRequestExternal withAsProxy(Boolean asProxy) {
        this.asProxy = asProxy;
        return this;
    }

    /**
     * 是否为代理主机
     * @return asProxy
     */
    public Boolean getAsProxy() {
        return asProxy;
    }

    public void setAsProxy(Boolean asProxy) {
        this.asProxy = asProxy;
    }

    public DeploymentHostRequestExternal withAuthorization(DeploymentHostAuthorizationBody authorization) {
        this.authorization = authorization;
        return this;
    }

    public DeploymentHostRequestExternal withAuthorization(
        Consumer<DeploymentHostAuthorizationBody> authorizationSetter) {
        if (this.authorization == null) {
            this.authorization = new DeploymentHostAuthorizationBody();
            authorizationSetter.accept(this.authorization);
        }

        return this;
    }

    /**
     * Get authorization
     * @return authorization
     */
    public DeploymentHostAuthorizationBody getAuthorization() {
        return authorization;
    }

    public void setAuthorization(DeploymentHostAuthorizationBody authorization) {
        this.authorization = authorization;
    }

    public DeploymentHostRequestExternal withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public DeploymentHostRequestExternal withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 主机ip，如：161.17.101.12
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public DeploymentHostRequestExternal withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * ssh端口，如：22
     * minimum: 0
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public DeploymentHostRequestExternal withProxyHostId(String proxyHostId) {
        this.proxyHostId = proxyHostId;
        return this;
    }

    /**
     * 代理主机id
     * @return proxyHostId
     */
    public String getProxyHostId() {
        return proxyHostId;
    }

    public void setProxyHostId(String proxyHostId) {
        this.proxyHostId = proxyHostId;
    }

    public DeploymentHostRequestExternal withSync(Boolean sync) {
        this.sync = sync;
        return this;
    }

    /**
     * 是否同步主机信息
     * @return sync
     */
    public Boolean getSync() {
        return sync;
    }

    public void setSync(Boolean sync) {
        this.sync = sync;
    }

    public DeploymentHostRequestExternal withInstallIcagent(Boolean installIcagent) {
        this.installIcagent = installIcagent;
        return this;
    }

    /**
     * 是否安装icAgent
     * @return installIcagent
     */
    public Boolean getInstallIcagent() {
        return installIcagent;
    }

    public void setInstallIcagent(Boolean installIcagent) {
        this.installIcagent = installIcagent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeploymentHostRequestExternal that = (DeploymentHostRequestExternal) obj;
        return Objects.equals(this.asProxy, that.asProxy) && Objects.equals(this.authorization, that.authorization)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.port, that.port) && Objects.equals(this.proxyHostId, that.proxyHostId)
            && Objects.equals(this.sync, that.sync) && Objects.equals(this.installIcagent, that.installIcagent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asProxy, authorization, hostName, ip, port, proxyHostId, sync, installIcagent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentHostRequestExternal {\n");
        sb.append("    asProxy: ").append(toIndentedString(asProxy)).append("\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    proxyHostId: ").append(toIndentedString(proxyHostId)).append("\n");
        sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
        sb.append("    installIcagent: ").append(toIndentedString(installIcagent)).append("\n");
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
