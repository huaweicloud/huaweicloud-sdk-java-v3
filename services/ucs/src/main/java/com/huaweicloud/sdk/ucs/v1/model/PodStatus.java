package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用于表示 Pod 状态信息
 */
public class PodStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostIP")

    private String hostIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containerStatuses")

    private List<ContainerStatus> containerStatuses = null;

    public PodStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 表示Pod的生命周期状态，有 5 种取值： - Pending：Pod 已被接受但尚未完全就绪 - Running：Pod 已绑定到节点且至少有一个容器在运行 - Succeeded：Pod 中所有容器都已成功终止，且不会被重启 - Failed：Pod 中至少一个容器失败终止 - Unknown：无法获取 Pod 状态
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public PodStatus withHostIP(String hostIP) {
        this.hostIP = hostIP;
        return this;
    }

    /**
     * Pod所在主机的IP地址
     * @return hostIP
     */
    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(String hostIP) {
        this.hostIP = hostIP;
    }

    public PodStatus withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 记录Pod被Kubelet认可的时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public PodStatus withContainerStatuses(List<ContainerStatus> containerStatuses) {
        this.containerStatuses = containerStatuses;
        return this;
    }

    public PodStatus addContainerStatusesItem(ContainerStatus containerStatusesItem) {
        if (this.containerStatuses == null) {
            this.containerStatuses = new ArrayList<>();
        }
        this.containerStatuses.add(containerStatusesItem);
        return this;
    }

    public PodStatus withContainerStatuses(Consumer<List<ContainerStatus>> containerStatusesSetter) {
        if (this.containerStatuses == null) {
            this.containerStatuses = new ArrayList<>();
        }
        containerStatusesSetter.accept(this.containerStatuses);
        return this;
    }

    /**
     * 容器的状态列表
     * @return containerStatuses
     */
    public List<ContainerStatus> getContainerStatuses() {
        return containerStatuses;
    }

    public void setContainerStatuses(List<ContainerStatus> containerStatuses) {
        this.containerStatuses = containerStatuses;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PodStatus that = (PodStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.hostIP, that.hostIP)
            && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.containerStatuses, that.containerStatuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, hostIP, startTime, containerStatuses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PodStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    containerStatuses: ").append(toIndentedString(containerStatuses)).append("\n");
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
