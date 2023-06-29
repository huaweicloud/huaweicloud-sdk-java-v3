package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ContainerResp
 */
public class ContainerResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "args")

    private List<String> args = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private List<String> command = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    private List<EnvPods> envs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveness_probe")

    private Probe livenessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readiness_probe")

    private Probe readinessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<HostContainerPort> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private DeploymentResources resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<Volumes> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restarts")

    private Long restarts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ready")

    private String isReady;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged")

    private Boolean privileged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_type")

    private String npuType;

    public ContainerResp withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    public ContainerResp addArgsItem(String argsItem) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public ContainerResp withArgs(Consumer<List<String>> argsSetter) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        argsSetter.accept(this.args);
        return this;
    }

    /**
     * 容器启动参数，字符总长度最大为65536
     * @return args
     */
    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public ContainerResp withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    public ContainerResp addCommandItem(String commandItem) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(commandItem);
        return this;
    }

    public ContainerResp withCommand(Consumer<List<String>> commandSetter) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        commandSetter.accept(this.command);
        return this;
    }

    /**
     * 容器启动命令，字符总长度最大为65536。 command支持使用数组定义多条命令，但在IEF控制台界面只会显示第一条命令。
     * @return command
     */
    public List<String> getCommand() {
        return command;
    }

    public void setCommand(List<String> command) {
        this.command = command;
    }

    public ContainerResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 容器名称，只允许英文小写字母、数字、中划线，最大长度32， 英文小写字母或数字开头和结尾
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContainerResp withEnvs(List<EnvPods> envs) {
        this.envs = envs;
        return this;
    }

    public ContainerResp addEnvsItem(EnvPods envsItem) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(envsItem);
        return this;
    }

    public ContainerResp withEnvs(Consumer<List<EnvPods>> envsSetter) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        envsSetter.accept(this.envs);
        return this;
    }

    /**
     * 环境变量
     * @return envs
     */
    public List<EnvPods> getEnvs() {
        return envs;
    }

    public void setEnvs(List<EnvPods> envs) {
        this.envs = envs;
    }

    public ContainerResp withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 容器镜像URL
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ContainerResp withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 容器镜像版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ContainerResp withLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public ContainerResp withLivenessProbe(Consumer<Probe> livenessProbeSetter) {
        if (this.livenessProbe == null) {
            this.livenessProbe = new Probe();
            livenessProbeSetter.accept(this.livenessProbe);
        }

        return this;
    }

    /**
     * Get livenessProbe
     * @return livenessProbe
     */
    public Probe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public ContainerResp withReadinessProbe(Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public ContainerResp withReadinessProbe(Consumer<Probe> readinessProbeSetter) {
        if (this.readinessProbe == null) {
            this.readinessProbe = new Probe();
            readinessProbeSetter.accept(this.readinessProbe);
        }

        return this;
    }

    /**
     * Get readinessProbe
     * @return readinessProbe
     */
    public Probe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public ContainerResp withPorts(List<HostContainerPort> ports) {
        this.ports = ports;
        return this;
    }

    public ContainerResp addPortsItem(HostContainerPort portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public ContainerResp withPorts(Consumer<List<HostContainerPort>> portsSetter) {
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
    public List<HostContainerPort> getPorts() {
        return ports;
    }

    public void setPorts(List<HostContainerPort> ports) {
        this.ports = ports;
    }

    public ContainerResp withResources(DeploymentResources resources) {
        this.resources = resources;
        return this;
    }

    public ContainerResp withResources(Consumer<DeploymentResources> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new DeploymentResources();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public DeploymentResources getResources() {
        return resources;
    }

    public void setResources(DeploymentResources resources) {
        this.resources = resources;
    }

    public ContainerResp withVolumes(List<Volumes> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ContainerResp addVolumesItem(Volumes volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ContainerResp withVolumes(Consumer<List<Volumes>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 卷配置
     * @return volumes
     */
    public List<Volumes> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Volumes> volumes) {
        this.volumes = volumes;
    }

    public ContainerResp withRestarts(Long restarts) {
        this.restarts = restarts;
        return this;
    }

    /**
     * 容器重启次数
     * @return restarts
     */
    public Long getRestarts() {
        return restarts;
    }

    public void setRestarts(Long restarts) {
        this.restarts = restarts;
    }

    public ContainerResp withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 容器故障详情
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ContainerResp withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 容器故障原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ContainerResp withIsReady(String isReady) {
        this.isReady = isReady;
        return this;
    }

    /**
     * 健康检查结果
     * @return isReady
     */
    public String getIsReady() {
        return isReady;
    }

    public void setIsReady(String isReady) {
        this.isReady = isReady;
    }

    public ContainerResp withPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    /**
     * 是否启用特权容器，默认值false
     * @return privileged
     */
    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public ContainerResp withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * 容器ID
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ContainerResp withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 容器状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ContainerResp withNpuType(String npuType) {
        this.npuType = npuType;
        return this;
    }

    /**
     * NPU类型，支持D310类型和D910类型。 - D310表示D310类型。 - D910表示D910类型。 - 不填表示为D310类型。
     * @return npuType
     */
    public String getNpuType() {
        return npuType;
    }

    public void setNpuType(String npuType) {
        this.npuType = npuType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerResp that = (ContainerResp) obj;
        return Objects.equals(this.args, that.args) && Objects.equals(this.command, that.command)
            && Objects.equals(this.name, that.name) && Objects.equals(this.envs, that.envs)
            && Objects.equals(this.imageUrl, that.imageUrl) && Objects.equals(this.version, that.version)
            && Objects.equals(this.livenessProbe, that.livenessProbe)
            && Objects.equals(this.readinessProbe, that.readinessProbe) && Objects.equals(this.ports, that.ports)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.volumes, that.volumes)
            && Objects.equals(this.restarts, that.restarts) && Objects.equals(this.message, that.message)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.isReady, that.isReady)
            && Objects.equals(this.privileged, that.privileged) && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.state, that.state) && Objects.equals(this.npuType, that.npuType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(args,
            command,
            name,
            envs,
            imageUrl,
            version,
            livenessProbe,
            readinessProbe,
            ports,
            resources,
            volumes,
            restarts,
            message,
            reason,
            isReady,
            privileged,
            containerId,
            state,
            npuType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerResp {\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
        sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    restarts: ").append(toIndentedString(restarts)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    isReady: ").append(toIndentedString(isReady)).append("\n");
        sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    npuType: ").append(toIndentedString(npuType)).append("\n");
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
