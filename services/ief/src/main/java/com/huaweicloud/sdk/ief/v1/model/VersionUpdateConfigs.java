package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 容器特殊参数 */
public class VersionUpdateConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged")

    private Boolean privileged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_network")

    private Boolean hostNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_policy")

    private String restartPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<AppPorts> ports = null;

    public VersionUpdateConfigs withPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    /** 默认为false，表示是否开启特权模式
     * 
     * @return privileged */
    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public VersionUpdateConfigs withHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    /** 默认为true，其中true表示主机网络，而false表示端口映射
     * 
     * @return hostNetwork */
    public Boolean getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public VersionUpdateConfigs withRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    /** 应用实例重启模式： 1. Always：当容器终止退出后，总是重启容器； 2. Onfailure：容器异常退出（退出码非0）时才重启容器； 3. Never：容器终止退出后，不重启容器；
     * 
     * @return restartPolicy */
    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public VersionUpdateConfigs withPorts(List<AppPorts> ports) {
        this.ports = ports;
        return this;
    }

    public VersionUpdateConfigs addPortsItem(AppPorts portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public VersionUpdateConfigs withPorts(Consumer<List<AppPorts>> portsSetter) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    /** 容器端口映射值
     * 
     * @return ports */
    public List<AppPorts> getPorts() {
        return ports;
    }

    public void setPorts(List<AppPorts> ports) {
        this.ports = ports;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionUpdateConfigs versionUpdateConfigs = (VersionUpdateConfigs) o;
        return Objects.equals(this.privileged, versionUpdateConfigs.privileged)
            && Objects.equals(this.hostNetwork, versionUpdateConfigs.hostNetwork)
            && Objects.equals(this.restartPolicy, versionUpdateConfigs.restartPolicy)
            && Objects.equals(this.ports, versionUpdateConfigs.ports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privileged, hostNetwork, restartPolicy, ports);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionUpdateConfigs {\n");
        sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
        sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
