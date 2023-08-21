package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用模板网络参数配置
 */
public class AppConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged")

    private Boolean privileged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_as_user")

    private Integer runAsUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_network")

    private Boolean hostNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_policy")

    private String restartPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<Ports> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_pid")

    private Boolean hostPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_policy")

    private String dnsPolicy;

    public AppConfigs withPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    /**
     * 默认为false，表示是否开启特权模式
     * @return privileged
     */
    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public AppConfigs withRunAsUser(Integer runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    /**
     * 容器运行用户ID，输入范围为0~65534的整数
     * @return runAsUser
     */
    public Integer getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(Integer runAsUser) {
        this.runAsUser = runAsUser;
    }

    public AppConfigs withHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    /**
     * 默认为true，其中true表示主机网络，而false表示端口映射
     * @return hostNetwork
     */
    public Boolean getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public AppConfigs withRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    /**
     * 应用实例重启模式： - Always：当容器终止退出后，总是重启容器 - Onfailure：容器异常退出（退出码非0）时才重启容器 - Never：容器终止退出后，不重启容器
     * @return restartPolicy
     */
    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public AppConfigs withPorts(List<Ports> ports) {
        this.ports = ports;
        return this;
    }

    public AppConfigs addPortsItem(Ports portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public AppConfigs withPorts(Consumer<List<Ports>> portsSetter) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    /**
     * 容器端口映射值
     * @return ports
     */
    public List<Ports> getPorts() {
        return ports;
    }

    public void setPorts(List<Ports> ports) {
        this.ports = ports;
    }

    public AppConfigs withHostPid(Boolean hostPid) {
        this.hostPid = hostPid;
        return this;
    }

    /**
     * 应用实例是否与主机共PID命名空间，默认值false
     * @return hostPid
     */
    public Boolean getHostPid() {
        return hostPid;
    }

    public void setHostPid(Boolean hostPid) {
        this.hostPid = hostPid;
    }

    public AppConfigs withDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
        return this;
    }

    /**
     * 应用实例DNS策略，可选值Default、ClusterFirst、ClusterFirstWithHostNet，默认为Default。应用实例启用主机网络时只能选填Default、ClusterFirstWithHostNet，不启用主机网络时只能选填Default、ClusterFirst
     * @return dnsPolicy
     */
    public String getDnsPolicy() {
        return dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppConfigs that = (AppConfigs) obj;
        return Objects.equals(this.privileged, that.privileged) && Objects.equals(this.runAsUser, that.runAsUser)
            && Objects.equals(this.hostNetwork, that.hostNetwork)
            && Objects.equals(this.restartPolicy, that.restartPolicy) && Objects.equals(this.ports, that.ports)
            && Objects.equals(this.hostPid, that.hostPid) && Objects.equals(this.dnsPolicy, that.dnsPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privileged, runAsUser, hostNetwork, restartPolicy, ports, hostPid, dnsPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppConfigs {\n");
        sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
        sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
        sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    hostPid: ").append(toIndentedString(hostPid)).append("\n");
        sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
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
