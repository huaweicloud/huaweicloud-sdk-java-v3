package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 节点重装配置参数 */
public class ReinstallNodeSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login")

    private Login login;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverConfig")

    private ReinstallServerConfig serverConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeConfig")

    private ReinstallVolumeConfig volumeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtimeConfig")

    private ReinstallRuntimeConfig runtimeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "k8sOptions")

    private ReinstallK8sOptionsConfig k8sOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifecycle")

    private NodeLifecycleConfig lifecycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private ReinstallExtendParam extendParam;

    public ReinstallNodeSpec withOs(String os) {
        this.os = os;
        return this;
    }

    /** 操作系统。指定自定义镜像场景将以IMS镜像的实际操作系统版本为准。请选择当前集群支持的操作系统版本，例如EulerOS 2.5、CentOS 7.6、EulerOS 2.8。
     * 
     * @return os */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public ReinstallNodeSpec withLogin(Login login) {
        this.login = login;
        return this;
    }

    public ReinstallNodeSpec withLogin(Consumer<Login> loginSetter) {
        if (this.login == null) {
            this.login = new Login();
            loginSetter.accept(this.login);
        }

        return this;
    }

    /** Get login
     * 
     * @return login */
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public ReinstallNodeSpec withName(String name) {
        this.name = name;
        return this;
    }

    /** 节点名称 > 重装时指定将修改节点名称，且服务器名称会同步修改。默认以服务器当前名称作为节点名称。 > > 命名规则：以小写字母开头，由小写字母、数字、中划线(-)组成，长度范围1-56位，且不能以中划线(-)结尾。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReinstallNodeSpec withServerConfig(ReinstallServerConfig serverConfig) {
        this.serverConfig = serverConfig;
        return this;
    }

    public ReinstallNodeSpec withServerConfig(Consumer<ReinstallServerConfig> serverConfigSetter) {
        if (this.serverConfig == null) {
            this.serverConfig = new ReinstallServerConfig();
            serverConfigSetter.accept(this.serverConfig);
        }

        return this;
    }

    /** Get serverConfig
     * 
     * @return serverConfig */
    public ReinstallServerConfig getServerConfig() {
        return serverConfig;
    }

    public void setServerConfig(ReinstallServerConfig serverConfig) {
        this.serverConfig = serverConfig;
    }

    public ReinstallNodeSpec withVolumeConfig(ReinstallVolumeConfig volumeConfig) {
        this.volumeConfig = volumeConfig;
        return this;
    }

    public ReinstallNodeSpec withVolumeConfig(Consumer<ReinstallVolumeConfig> volumeConfigSetter) {
        if (this.volumeConfig == null) {
            this.volumeConfig = new ReinstallVolumeConfig();
            volumeConfigSetter.accept(this.volumeConfig);
        }

        return this;
    }

    /** Get volumeConfig
     * 
     * @return volumeConfig */
    public ReinstallVolumeConfig getVolumeConfig() {
        return volumeConfig;
    }

    public void setVolumeConfig(ReinstallVolumeConfig volumeConfig) {
        this.volumeConfig = volumeConfig;
    }

    public ReinstallNodeSpec withRuntimeConfig(ReinstallRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }

    public ReinstallNodeSpec withRuntimeConfig(Consumer<ReinstallRuntimeConfig> runtimeConfigSetter) {
        if (this.runtimeConfig == null) {
            this.runtimeConfig = new ReinstallRuntimeConfig();
            runtimeConfigSetter.accept(this.runtimeConfig);
        }

        return this;
    }

    /** Get runtimeConfig
     * 
     * @return runtimeConfig */
    public ReinstallRuntimeConfig getRuntimeConfig() {
        return runtimeConfig;
    }

    public void setRuntimeConfig(ReinstallRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    public ReinstallNodeSpec withK8sOptions(ReinstallK8sOptionsConfig k8sOptions) {
        this.k8sOptions = k8sOptions;
        return this;
    }

    public ReinstallNodeSpec withK8sOptions(Consumer<ReinstallK8sOptionsConfig> k8sOptionsSetter) {
        if (this.k8sOptions == null) {
            this.k8sOptions = new ReinstallK8sOptionsConfig();
            k8sOptionsSetter.accept(this.k8sOptions);
        }

        return this;
    }

    /** Get k8sOptions
     * 
     * @return k8sOptions */
    public ReinstallK8sOptionsConfig getK8sOptions() {
        return k8sOptions;
    }

    public void setK8sOptions(ReinstallK8sOptionsConfig k8sOptions) {
        this.k8sOptions = k8sOptions;
    }

    public ReinstallNodeSpec withLifecycle(NodeLifecycleConfig lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    public ReinstallNodeSpec withLifecycle(Consumer<NodeLifecycleConfig> lifecycleSetter) {
        if (this.lifecycle == null) {
            this.lifecycle = new NodeLifecycleConfig();
            lifecycleSetter.accept(this.lifecycle);
        }

        return this;
    }

    /** Get lifecycle
     * 
     * @return lifecycle */
    public NodeLifecycleConfig getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(NodeLifecycleConfig lifecycle) {
        this.lifecycle = lifecycle;
    }

    public ReinstallNodeSpec withExtendParam(ReinstallExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public ReinstallNodeSpec withExtendParam(Consumer<ReinstallExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new ReinstallExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /** Get extendParam
     * 
     * @return extendParam */
    public ReinstallExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(ReinstallExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReinstallNodeSpec reinstallNodeSpec = (ReinstallNodeSpec) o;
        return Objects.equals(this.os, reinstallNodeSpec.os) && Objects.equals(this.login, reinstallNodeSpec.login)
            && Objects.equals(this.name, reinstallNodeSpec.name)
            && Objects.equals(this.serverConfig, reinstallNodeSpec.serverConfig)
            && Objects.equals(this.volumeConfig, reinstallNodeSpec.volumeConfig)
            && Objects.equals(this.runtimeConfig, reinstallNodeSpec.runtimeConfig)
            && Objects.equals(this.k8sOptions, reinstallNodeSpec.k8sOptions)
            && Objects.equals(this.lifecycle, reinstallNodeSpec.lifecycle)
            && Objects.equals(this.extendParam, reinstallNodeSpec.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(os, login, name, serverConfig, volumeConfig, runtimeConfig, k8sOptions, lifecycle, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallNodeSpec {\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serverConfig: ").append(toIndentedString(serverConfig)).append("\n");
        sb.append("    volumeConfig: ").append(toIndentedString(volumeConfig)).append("\n");
        sb.append("    runtimeConfig: ").append(toIndentedString(runtimeConfig)).append("\n");
        sb.append("    k8sOptions: ").append(toIndentedString(k8sOptions)).append("\n");
        sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
