package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 特权容器告警信息
 */
public class ClusterSecurityCheckPrivilegedContainerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    /**
     * **参数解释**： 容器状态 **取值范围**： - running：运行中 - terminated：已结束 
     */
    public static final class ContainerStatusEnum {

        /**
         * Enum RUNNING for value: "running"
         */
        public static final ContainerStatusEnum RUNNING = new ContainerStatusEnum("running");

        /**
         * Enum TERMINATED for value: "terminated"
         */
        public static final ContainerStatusEnum TERMINATED = new ContainerStatusEnum("terminated");

        private static final Map<String, ContainerStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ContainerStatusEnum> createStaticFields() {
            Map<String, ContainerStatusEnum> map = new HashMap<>();
            map.put("running", RUNNING);
            map.put("terminated", TERMINATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ContainerStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ContainerStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ContainerStatusEnum(value));
        }

        public static ContainerStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ContainerStatusEnum) {
                return this.value.equals(((ContainerStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_status")

    private ContainerStatusEnum containerStatus;

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
    @JsonProperty(value = "event_abstract")

    private String eventAbstract;

    public ClusterSecurityCheckPrivilegedContainerInfo withContainerName(String containerName) {
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

    public ClusterSecurityCheckPrivilegedContainerInfo withContainerId(String containerId) {
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

    public ClusterSecurityCheckPrivilegedContainerInfo withContainerStatus(ContainerStatusEnum containerStatus) {
        this.containerStatus = containerStatus;
        return this;
    }

    /**
     * **参数解释**： 容器状态 **取值范围**： - running：运行中 - terminated：已结束 
     * @return containerStatus
     */
    public ContainerStatusEnum getContainerStatus() {
        return containerStatus;
    }

    public void setContainerStatus(ContainerStatusEnum containerStatus) {
        this.containerStatus = containerStatus;
    }

    public ClusterSecurityCheckPrivilegedContainerInfo withPodName(String podName) {
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

    public ClusterSecurityCheckPrivilegedContainerInfo withHostName(String hostName) {
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

    public ClusterSecurityCheckPrivilegedContainerInfo withPrivateIp(String privateIp) {
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

    public ClusterSecurityCheckPrivilegedContainerInfo withPublicIp(String publicIp) {
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

    public ClusterSecurityCheckPrivilegedContainerInfo withEventAbstract(String eventAbstract) {
        this.eventAbstract = eventAbstract;
        return this;
    }

    /**
     * **参数解释**： 事件摘要 **取值范围**： 不涉及 
     * @return eventAbstract
     */
    public String getEventAbstract() {
        return eventAbstract;
    }

    public void setEventAbstract(String eventAbstract) {
        this.eventAbstract = eventAbstract;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterSecurityCheckPrivilegedContainerInfo that = (ClusterSecurityCheckPrivilegedContainerInfo) obj;
        return Objects.equals(this.containerName, that.containerName)
            && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerStatus, that.containerStatus) && Objects.equals(this.podName, that.podName)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.eventAbstract, that.eventAbstract);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(containerName, containerId, containerStatus, podName, hostName, privateIp, publicIp, eventAbstract);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterSecurityCheckPrivilegedContainerInfo {\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerStatus: ").append(toIndentedString(containerStatus)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    eventAbstract: ").append(toIndentedString(eventAbstract)).append("\n");
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
