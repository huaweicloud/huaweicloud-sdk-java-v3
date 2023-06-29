package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ContainerConfigsDTO
 */
public class ContainerConfigsDTO {

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
    @JsonProperty(value = "container_port_list")

    private List<ContainerPortDTO> containerPortList = null;

    public ContainerConfigsDTO withPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    /**
     * **参数说明**：开启容器特权模式。
     * @return privileged
     */
    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public ContainerConfigsDTO withHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    /**
     * **参数说明**：是否使用主机网络模式。
     * @return hostNetwork
     */
    public Boolean getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }

    public ContainerConfigsDTO withRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }

    /**
     * **参数说明**：重启策略，容器执行健康检查后失败后的策略。
     * @return restartPolicy
     */
    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public ContainerConfigsDTO withContainerPortList(List<ContainerPortDTO> containerPortList) {
        this.containerPortList = containerPortList;
        return this;
    }

    public ContainerConfigsDTO addContainerPortListItem(ContainerPortDTO containerPortListItem) {
        if (this.containerPortList == null) {
            this.containerPortList = new ArrayList<>();
        }
        this.containerPortList.add(containerPortListItem);
        return this;
    }

    public ContainerConfigsDTO withContainerPortList(Consumer<List<ContainerPortDTO>> containerPortListSetter) {
        if (this.containerPortList == null) {
            this.containerPortList = new ArrayList<>();
        }
        containerPortListSetter.accept(this.containerPortList);
        return this;
    }

    /**
     * **参数说明**：容器端口映射值。
     * @return containerPortList
     */
    public List<ContainerPortDTO> getContainerPortList() {
        return containerPortList;
    }

    public void setContainerPortList(List<ContainerPortDTO> containerPortList) {
        this.containerPortList = containerPortList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerConfigsDTO that = (ContainerConfigsDTO) obj;
        return Objects.equals(this.privileged, that.privileged) && Objects.equals(this.hostNetwork, that.hostNetwork)
            && Objects.equals(this.restartPolicy, that.restartPolicy)
            && Objects.equals(this.containerPortList, that.containerPortList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privileged, hostNetwork, restartPolicy, containerPortList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerConfigsDTO {\n");
        sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
        sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
        sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
        sb.append("    containerPortList: ").append(toIndentedString(containerPortList)).append("\n");
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
