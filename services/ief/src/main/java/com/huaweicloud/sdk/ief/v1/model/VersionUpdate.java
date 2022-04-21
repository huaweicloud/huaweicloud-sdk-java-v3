package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用模板版本配置
 */
public class VersionUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    private List<Env> envs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<Volumes> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private VersionUpdateConfigs configs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private VersionDetailResources resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private List<String> command = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "args")

    private List<String> args = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveness_probe")

    private String livenessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readiness_probe")

    private String readinessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_type")

    private String npuType;

    public VersionUpdate withEnvs(List<Env> envs) {
        this.envs = envs;
        return this;
    }

    public VersionUpdate addEnvsItem(Env envsItem) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(envsItem);
        return this;
    }

    public VersionUpdate withEnvs(Consumer<List<Env>> envsSetter) {
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

    public VersionUpdate withVolumes(List<Volumes> volumes) {
        this.volumes = volumes;
        return this;
    }

    public VersionUpdate addVolumesItem(Volumes volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public VersionUpdate withVolumes(Consumer<List<Volumes>> volumesSetter) {
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

    public VersionUpdate withConfigs(VersionUpdateConfigs configs) {
        this.configs = configs;
        return this;
    }

    public VersionUpdate withConfigs(Consumer<VersionUpdateConfigs> configsSetter) {
        if (this.configs == null) {
            this.configs = new VersionUpdateConfigs();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /**
     * Get configs
     * @return configs
     */
    public VersionUpdateConfigs getConfigs() {
        return configs;
    }

    public void setConfigs(VersionUpdateConfigs configs) {
        this.configs = configs;
    }

    public VersionUpdate withResources(VersionDetailResources resources) {
        this.resources = resources;
        return this;
    }

    public VersionUpdate withResources(Consumer<VersionDetailResources> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new VersionDetailResources();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public VersionDetailResources getResources() {
        return resources;
    }

    public void setResources(VersionDetailResources resources) {
        this.resources = resources;
    }

    public VersionUpdate withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    public VersionUpdate addCommandItem(String commandItem) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(commandItem);
        return this;
    }

    public VersionUpdate withCommand(Consumer<List<String>> commandSetter) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        commandSetter.accept(this.command);
        return this;
    }

    /**
     * 启动命令
     * @return command
     */
    public List<String> getCommand() {
        return command;
    }

    public void setCommand(List<String> command) {
        this.command = command;
    }

    public VersionUpdate withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    public VersionUpdate addArgsItem(String argsItem) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public VersionUpdate withArgs(Consumer<List<String>> argsSetter) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        argsSetter.accept(this.args);
        return this;
    }

    /**
     * 参数
     * @return args
     */
    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public VersionUpdate withLivenessProbe(String livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    /**
     * 工作负载存活探针
     * @return livenessProbe
     */
    public String getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(String livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public VersionUpdate withReadinessProbe(String readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    /**
     * 工作负载业务探针
     * @return readinessProbe
     */
    public String getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(String readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public VersionUpdate withNpuType(String npuType) {
        this.npuType = npuType;
        return this;
    }

    /**
     * npu类型，支持D310类型和D910类型。 - D310表示D310类型。 - D910表示D910类型。 - 不填表示为D310类型。
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
        VersionUpdate versionUpdate = (VersionUpdate) o;
        return Objects.equals(this.envs, versionUpdate.envs) && Objects.equals(this.volumes, versionUpdate.volumes)
            && Objects.equals(this.configs, versionUpdate.configs)
            && Objects.equals(this.resources, versionUpdate.resources)
            && Objects.equals(this.command, versionUpdate.command) && Objects.equals(this.args, versionUpdate.args)
            && Objects.equals(this.livenessProbe, versionUpdate.livenessProbe)
            && Objects.equals(this.readinessProbe, versionUpdate.readinessProbe)
            && Objects.equals(this.npuType, versionUpdate.npuType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envs, volumes, configs, resources, command, args, livenessProbe, readinessProbe, npuType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionUpdate {\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
        sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
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
