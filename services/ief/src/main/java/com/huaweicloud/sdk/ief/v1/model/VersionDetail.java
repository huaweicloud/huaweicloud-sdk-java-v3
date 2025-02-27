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
public class VersionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    private List<Env> envs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<Volumes> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private AppConfigs configs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private Resources resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private List<String> command = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "args")

    private List<String> args = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveness_probe")

    private ProbeDetail livenessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readiness_probe")

    private ProbeDetail readinessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_type")

    private String npuType;

    public VersionDetail withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 应用版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VersionDetail withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * 镜像存储地址
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public VersionDetail withEnvs(List<Env> envs) {
        this.envs = envs;
        return this;
    }

    public VersionDetail addEnvsItem(Env envsItem) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(envsItem);
        return this;
    }

    public VersionDetail withEnvs(Consumer<List<Env>> envsSetter) {
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

    public VersionDetail withVolumes(List<Volumes> volumes) {
        this.volumes = volumes;
        return this;
    }

    public VersionDetail addVolumesItem(Volumes volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public VersionDetail withVolumes(Consumer<List<Volumes>> volumesSetter) {
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

    public VersionDetail withConfigs(AppConfigs configs) {
        this.configs = configs;
        return this;
    }

    public VersionDetail withConfigs(Consumer<AppConfigs> configsSetter) {
        if (this.configs == null) {
            this.configs = new AppConfigs();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /**
     * Get configs
     * @return configs
     */
    public AppConfigs getConfigs() {
        return configs;
    }

    public void setConfigs(AppConfigs configs) {
        this.configs = configs;
    }

    public VersionDetail withResources(Resources resources) {
        this.resources = resources;
        return this;
    }

    public VersionDetail withResources(Consumer<Resources> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new Resources();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public VersionDetail withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * 架构
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public VersionDetail withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    public VersionDetail addCommandItem(String commandItem) {
        if (this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(commandItem);
        return this;
    }

    public VersionDetail withCommand(Consumer<List<String>> commandSetter) {
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

    public VersionDetail withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    public VersionDetail addArgsItem(String argsItem) {
        if (this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public VersionDetail withArgs(Consumer<List<String>> argsSetter) {
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

    public VersionDetail withLivenessProbe(ProbeDetail livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public VersionDetail withLivenessProbe(Consumer<ProbeDetail> livenessProbeSetter) {
        if (this.livenessProbe == null) {
            this.livenessProbe = new ProbeDetail();
            livenessProbeSetter.accept(this.livenessProbe);
        }

        return this;
    }

    /**
     * Get livenessProbe
     * @return livenessProbe
     */
    public ProbeDetail getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(ProbeDetail livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public VersionDetail withReadinessProbe(ProbeDetail readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public VersionDetail withReadinessProbe(Consumer<ProbeDetail> readinessProbeSetter) {
        if (this.readinessProbe == null) {
            this.readinessProbe = new ProbeDetail();
            readinessProbeSetter.accept(this.readinessProbe);
        }

        return this;
    }

    /**
     * Get readinessProbe
     * @return readinessProbe
     */
    public ProbeDetail getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(ProbeDetail readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public VersionDetail withNpuType(String npuType) {
        this.npuType = npuType;
        return this;
    }

    /**
     * NPU类型，支持D310、D310B，支持填写： - D310：D310类型 - D310B：D310B类型 - 不填表示为D310类型。
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
        VersionDetail that = (VersionDetail) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.imageUrl, that.imageUrl)
            && Objects.equals(this.envs, that.envs) && Objects.equals(this.volumes, that.volumes)
            && Objects.equals(this.configs, that.configs) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.arch, that.arch) && Objects.equals(this.command, that.command)
            && Objects.equals(this.args, that.args) && Objects.equals(this.livenessProbe, that.livenessProbe)
            && Objects.equals(this.readinessProbe, that.readinessProbe) && Objects.equals(this.npuType, that.npuType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            imageUrl,
            envs,
            volumes,
            configs,
            resources,
            arch,
            command,
            args,
            livenessProbe,
            readinessProbe,
            npuType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionDetail {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
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
