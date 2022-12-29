package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AppDef
 */
public class AppDef {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_order_id")

    private String appOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_url")

    private String appUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_limit")

    private Integer channelLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_upper_limit")

    private Integer channelUpperLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "args")

    private List<String> args = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private List<String> command = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    private List<Env> envs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_modelbox")

    private Boolean isModelbox;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveness_probe")

    private Probe livenessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msgs")

    private List<Env> msgs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_type")

    private String npuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<HostContainerPortMapping> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileged")

    private Boolean privileged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readiness_probe")

    private Probe readinessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private ResQuest resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<Volume> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_resources")

    private ResQuest startResources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_resources")

    private ResQuest channelResources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_project_id")

    private String skillProjectId;

    public AppDef withAppOrderId(String appOrderId) {
        this.appOrderId = appOrderId;
        return this;
    }

    /**
     * app应用的订单ID，技能来源是市场时，如果不填，则自动选择默认订单。
     * @return appOrderId
     */
    public String getAppOrderId() {
        return appOrderId;
    }

    public void setAppOrderId(String appOrderId) {
        this.appOrderId = appOrderId;
    }

    public AppDef withAppUrl(String appUrl) {
        this.appUrl = appUrl;
        return this;
    }

    /**
     * app应用的地址，可以是镜像地址或者OBS地址
     * @return appUrl
     */
    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public AppDef withChannelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
        return this;
    }

    /**
     * 路数限制，添加作业的时候，摄像头和VCN的最大路数不超过该值，范围是0到1000
     * @return channelLimit
     */
    public Integer getChannelLimit() {
        return channelLimit;
    }

    public void setChannelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
    }

    public AppDef withChannelUpperLimit(Integer channelUpperLimit) {
        this.channelUpperLimit = channelUpperLimit;
        return this;
    }

    /**
     * 用户可以指定的路数限制上限，范围是0到1000
     * @return channelUpperLimit
     */
    public Integer getChannelUpperLimit() {
        return channelUpperLimit;
    }

    public void setChannelUpperLimit(Integer channelUpperLimit) {
        this.channelUpperLimit = channelUpperLimit;
    }

    public AppDef withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    public AppDef addArgsItem(String argsItem) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public AppDef withArgs(Consumer<List<String>> argsSetter) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        argsSetter.accept(this.args);
        return this;
    }

    /**
     * 容器启动参数，字符总长度最大为65536，不允许^#~^$|%&*<>()'\"\\[\\]{}]等特殊字符
     * @return args
     */
    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public AppDef withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    public AppDef addCommandItem(String commandItem) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(commandItem);
        return this;
    }

    public AppDef withCommand(Consumer<List<String>> commandSetter) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        commandSetter.accept(this.command);
        return this;
    }

    /**
     * 容器启动命令，字符总长度最大为65536。 command支持使用数组定义多条命令，但在IEF控制台界面只会显示第一条命令。不允许^#~^$|%&*<>()'\"\\[\\]{}]等特殊字符
     * @return command
     */
    public List<String> getCommand() {
        return command;
    }

    public void setCommand(List<String> command) {
        this.command = command;
    }

    public AppDef withEnvs(List<Env> envs) {
        this.envs = envs;
        return this;
    }

    public AppDef addEnvsItem(Env envsItem) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(envsItem);
        return this;
    }

    public AppDef withEnvs(Consumer<List<Env>> envsSetter) {
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

    public AppDef withIsModelbox(Boolean isModelbox) {
        this.isModelbox = isModelbox;
        return this;
    }

    /**
     * 是否是modelbox镜像
     * @return isModelbox
     */
    public Boolean getIsModelbox() {
        return isModelbox;
    }

    public void setIsModelbox(Boolean isModelbox) {
        this.isModelbox = isModelbox;
    }

    public AppDef withLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public AppDef withLivenessProbe(Consumer<Probe> livenessProbeSetter) {
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

    public AppDef withMsgs(List<Env> msgs) {
        this.msgs = msgs;
        return this;
    }

    public AppDef addMsgsItem(Env msgsItem) {
        if (this.msgs == null) {
            this.msgs = new ArrayList<>();
        }
        this.msgs.add(msgsItem);
        return this;
    }

    public AppDef withMsgs(Consumer<List<Env>> msgsSetter) {
        if (this.msgs == null) {
            this.msgs = new ArrayList<>();
        }
        msgsSetter.accept(this.msgs);
        return this;
    }

    /**
     * 消息变量
     * @return msgs
     */
    public List<Env> getMsgs() {
        return msgs;
    }

    public void setMsgs(List<Env> msgs) {
        this.msgs = msgs;
    }

    public AppDef withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名字，只允许英文小写字母、数字、中划线，最大长度32, 英文小写字母或数字开头和结尾。该名称同时对应技能名称，当不传订单id的时候，默认通过该名称和版本号version字段，选择指定技能版本，进行部署，并选择可用的订单（默认订单优先）扣除份额。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppDef withNpuType(String npuType) {
        this.npuType = npuType;
        return this;
    }

    /**
     * npu类型，支持D310类型和D910类型。D310表示D310类型。  D910表示D910类型。不填表示为D310类型
     * @return npuType
     */
    public String getNpuType() {
        return npuType;
    }

    public void setNpuType(String npuType) {
        this.npuType = npuType;
    }

    public AppDef withPorts(List<HostContainerPortMapping> ports) {
        this.ports = ports;
        return this;
    }

    public AppDef addPortsItem(HostContainerPortMapping portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public AppDef withPorts(Consumer<List<HostContainerPortMapping>> portsSetter) {
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

    public AppDef withPrivileged(Boolean privileged) {
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

    public AppDef withReadinessProbe(Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public AppDef withReadinessProbe(Consumer<Probe> readinessProbeSetter) {
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

    public AppDef withResources(ResQuest resources) {
        this.resources = resources;
        return this;
    }

    public AppDef withResources(Consumer<ResQuest> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ResQuest();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public ResQuest getResources() {
        return resources;
    }

    public void setResources(ResQuest resources) {
        this.resources = resources;
    }

    public AppDef withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号，长度不操作128，支持大小写数字，下划线，点，中划线
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AppDef withVolumes(List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }

    public AppDef addVolumesItem(Volume volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public AppDef withVolumes(Consumer<List<Volume>> volumesSetter) {
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
    public List<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    public AppDef withStartResources(ResQuest startResources) {
        this.startResources = startResources;
        return this;
    }

    public AppDef withStartResources(Consumer<ResQuest> startResourcesSetter) {
        if (this.startResources == null) {
            this.startResources = new ResQuest();
            startResourcesSetter.accept(this.startResources);
        }

        return this;
    }

    /**
     * Get startResources
     * @return startResources
     */
    public ResQuest getStartResources() {
        return startResources;
    }

    public void setStartResources(ResQuest startResources) {
        this.startResources = startResources;
    }

    public AppDef withChannelResources(ResQuest channelResources) {
        this.channelResources = channelResources;
        return this;
    }

    public AppDef withChannelResources(Consumer<ResQuest> channelResourcesSetter) {
        if (this.channelResources == null) {
            this.channelResources = new ResQuest();
            channelResourcesSetter.accept(this.channelResources);
        }

        return this;
    }

    /**
     * Get channelResources
     * @return channelResources
     */
    public ResQuest getChannelResources() {
        return channelResources;
    }

    public void setChannelResources(ResQuest channelResources) {
        this.channelResources = channelResources;
    }

    public AppDef withSkillProjectId(String skillProjectId) {
        this.skillProjectId = skillProjectId;
        return this;
    }

    /**
     * 技能管理ID，技能来源source是skill的时候，需要传入该ID
     * @return skillProjectId
     */
    public String getSkillProjectId() {
        return skillProjectId;
    }

    public void setSkillProjectId(String skillProjectId) {
        this.skillProjectId = skillProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppDef appDef = (AppDef) o;
        return Objects.equals(this.appOrderId, appDef.appOrderId) && Objects.equals(this.appUrl, appDef.appUrl)
            && Objects.equals(this.channelLimit, appDef.channelLimit)
            && Objects.equals(this.channelUpperLimit, appDef.channelUpperLimit)
            && Objects.equals(this.args, appDef.args) && Objects.equals(this.command, appDef.command)
            && Objects.equals(this.envs, appDef.envs) && Objects.equals(this.isModelbox, appDef.isModelbox)
            && Objects.equals(this.livenessProbe, appDef.livenessProbe) && Objects.equals(this.msgs, appDef.msgs)
            && Objects.equals(this.name, appDef.name) && Objects.equals(this.npuType, appDef.npuType)
            && Objects.equals(this.ports, appDef.ports) && Objects.equals(this.privileged, appDef.privileged)
            && Objects.equals(this.readinessProbe, appDef.readinessProbe)
            && Objects.equals(this.resources, appDef.resources) && Objects.equals(this.version, appDef.version)
            && Objects.equals(this.volumes, appDef.volumes)
            && Objects.equals(this.startResources, appDef.startResources)
            && Objects.equals(this.channelResources, appDef.channelResources)
            && Objects.equals(this.skillProjectId, appDef.skillProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appOrderId,
            appUrl,
            channelLimit,
            channelUpperLimit,
            args,
            command,
            envs,
            isModelbox,
            livenessProbe,
            msgs,
            name,
            npuType,
            ports,
            privileged,
            readinessProbe,
            resources,
            version,
            volumes,
            startResources,
            channelResources,
            skillProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppDef {\n");
        sb.append("    appOrderId: ").append(toIndentedString(appOrderId)).append("\n");
        sb.append("    appUrl: ").append(toIndentedString(appUrl)).append("\n");
        sb.append("    channelLimit: ").append(toIndentedString(channelLimit)).append("\n");
        sb.append("    channelUpperLimit: ").append(toIndentedString(channelUpperLimit)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    isModelbox: ").append(toIndentedString(isModelbox)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
        sb.append("    msgs: ").append(toIndentedString(msgs)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    npuType: ").append(toIndentedString(npuType)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
        sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    startResources: ").append(toIndentedString(startResources)).append("\n");
        sb.append("    channelResources: ").append(toIndentedString(channelResources)).append("\n");
        sb.append("    skillProjectId: ").append(toIndentedString(skillProjectId)).append("\n");
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
