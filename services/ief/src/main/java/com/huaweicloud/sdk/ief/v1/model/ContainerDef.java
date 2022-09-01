package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ContainerDef
 */
public class ContainerDef {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    @JacksonXmlProperty(localName = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "args")

    @JacksonXmlProperty(localName = "args")

    private List<String> args = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    @JacksonXmlProperty(localName = "command")

    private List<String> command = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    @JacksonXmlProperty(localName = "resources")

    private DeploymentResources resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    @JacksonXmlProperty(localName = "envs")

    private List<Env> envs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    @JacksonXmlProperty(localName = "ports")

    private List<HostContainerPortMapping> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged")

    @JacksonXmlProperty(localName = "privileged")

    private Boolean privileged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readiness_probe")

    @JacksonXmlProperty(localName = "readiness_probe")

    private Probe readinessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveness_probe")

    @JacksonXmlProperty(localName = "liveness_probe")

    private Probe livenessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    @JacksonXmlProperty(localName = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    @JacksonXmlProperty(localName = "volumes")

    private List<Volumes> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_type")

    @JacksonXmlProperty(localName = "npu_type")

    private String npuType;

    public ContainerDef withName(String name) {
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

    public ContainerDef withImageUrl(String imageUrl) {
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

    public ContainerDef withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    public ContainerDef addArgsItem(String argsItem) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public ContainerDef withArgs(Consumer<List<String>> argsSetter) {
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

    public ContainerDef withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    public ContainerDef addCommandItem(String commandItem) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(commandItem);
        return this;
    }

    public ContainerDef withCommand(Consumer<List<String>> commandSetter) {
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

    public ContainerDef withResources(DeploymentResources resources) {
        this.resources = resources;
        return this;
    }

    public ContainerDef withResources(Consumer<DeploymentResources> resourcesSetter) {
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

    public ContainerDef withEnvs(List<Env> envs) {
        this.envs = envs;
        return this;
    }

    public ContainerDef addEnvsItem(Env envsItem) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(envsItem);
        return this;
    }

    public ContainerDef withEnvs(Consumer<List<Env>> envsSetter) {
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
    public List<Env> getEnvs() {
        return envs;
    }

    public void setEnvs(List<Env> envs) {
        this.envs = envs;
    }

    public ContainerDef withPorts(List<HostContainerPortMapping> ports) {
        this.ports = ports;
        return this;
    }

    public ContainerDef addPortsItem(HostContainerPortMapping portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public ContainerDef withPorts(Consumer<List<HostContainerPortMapping>> portsSetter) {
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
    public List<HostContainerPortMapping> getPorts() {
        return ports;
    }

    public void setPorts(List<HostContainerPortMapping> ports) {
        this.ports = ports;
    }

    public ContainerDef withPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    /**
     * 是否启用特权容器,默认值false
     * @return privileged
     */
    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public ContainerDef withReadinessProbe(Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public ContainerDef withReadinessProbe(Consumer<Probe> readinessProbeSetter) {
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

    public ContainerDef withLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public ContainerDef withLivenessProbe(Consumer<Probe> livenessProbeSetter) {
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

    public ContainerDef withVersion(String version) {
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

    public ContainerDef withVolumes(List<Volumes> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ContainerDef addVolumesItem(Volumes volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ContainerDef withVolumes(Consumer<List<Volumes>> volumesSetter) {
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

    public ContainerDef withNpuType(String npuType) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContainerDef containerDef = (ContainerDef) o;
        return Objects.equals(this.name, containerDef.name) && Objects.equals(this.imageUrl, containerDef.imageUrl)
            && Objects.equals(this.args, containerDef.args) && Objects.equals(this.command, containerDef.command)
            && Objects.equals(this.resources, containerDef.resources) && Objects.equals(this.envs, containerDef.envs)
            && Objects.equals(this.ports, containerDef.ports)
            && Objects.equals(this.privileged, containerDef.privileged)
            && Objects.equals(this.readinessProbe, containerDef.readinessProbe)
            && Objects.equals(this.livenessProbe, containerDef.livenessProbe)
            && Objects.equals(this.version, containerDef.version) && Objects.equals(this.volumes, containerDef.volumes)
            && Objects.equals(this.npuType, containerDef.npuType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            imageUrl,
            args,
            command,
            resources,
            envs,
            ports,
            privileged,
            readinessProbe,
            livenessProbe,
            version,
            volumes,
            npuType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerDef {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
        sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
