package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskInstanceStatusRsp
 */
public class TaskInstanceStatusRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_ip")

    private String podIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_statuses")

    private List<TaskInstanceContainerStatusRsp> containerStatuses = null;

    public TaskInstanceStatusRsp withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 实例执行状态
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public TaskInstanceStatusRsp withPodIp(String podIp) {
        this.podIp = podIp;
        return this;
    }

    /**
     * 实例IP
     * @return podIp
     */
    public String getPodIp() {
        return podIp;
    }

    public void setPodIp(String podIp) {
        this.podIp = podIp;
    }

    public TaskInstanceStatusRsp withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 实例所在节点IP
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public TaskInstanceStatusRsp withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 计算节点的名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public TaskInstanceStatusRsp withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 实例创建时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public TaskInstanceStatusRsp withContainerStatuses(List<TaskInstanceContainerStatusRsp> containerStatuses) {
        this.containerStatuses = containerStatuses;
        return this;
    }

    public TaskInstanceStatusRsp addContainerStatusesItem(TaskInstanceContainerStatusRsp containerStatusesItem) {
        if (this.containerStatuses == null) {
            this.containerStatuses = new ArrayList<>();
        }
        this.containerStatuses.add(containerStatusesItem);
        return this;
    }

    public TaskInstanceStatusRsp withContainerStatuses(
        Consumer<List<TaskInstanceContainerStatusRsp>> containerStatusesSetter) {
        if (this.containerStatuses == null) {
            this.containerStatuses = new ArrayList<>();
        }
        containerStatusesSetter.accept(this.containerStatuses);
        return this;
    }

    /**
     * 实例状态信息
     * @return containerStatuses
     */
    public List<TaskInstanceContainerStatusRsp> getContainerStatuses() {
        return containerStatuses;
    }

    public void setContainerStatuses(List<TaskInstanceContainerStatusRsp> containerStatuses) {
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
        TaskInstanceStatusRsp that = (TaskInstanceStatusRsp) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.podIp, that.podIp)
            && Objects.equals(this.hostIp, that.hostIp) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.containerStatuses, that.containerStatuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, podIp, hostIp, hostName, startTime, containerStatuses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInstanceStatusRsp {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    podIp: ").append(toIndentedString(podIp)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
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
