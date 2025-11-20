package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点重装配置参数
 */
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
    @JsonProperty(value = "initializedConditions")

    private List<String> initializedConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private ReinstallExtendParam extendParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostnameConfig")

    private HostnameConfig hostnameConfig;

    /**
     * **参数解释**： 指定节点安全加固类型，当前仅支持HCE2.0镜像等保2.0三级安全加固。 等保加固会对身份鉴别、访问控制、安全审计、入侵防范、恶意代码防范进行检查并加固。[详情请参见[Huawei Cloud EulerOS 2.0等保2.0三级版镜像概述](https://support.huaweicloud.com/productdesc-hce/hce_sec_0001.html)。](tag:hws) 若未指定此参数，则尝试用原有的值补全。如：原先HCE2.0镜像已配置安全加固，更新节点池时未指定此参数，则仍旧保持安全加固配置，若要取消，需显式指定参数值为\"null\"。 **约束限制**： 不涉及 **取值范围**： - 空值：表示不开启等保加固 - cybersecurity：表示开启等保加固  **默认取值**： 不涉及
     */
    public static final class SecurityReinforcementTypeEnum {

        /**
         * Enum NULL for value: "null"
         */
        public static final SecurityReinforcementTypeEnum NULL = new SecurityReinforcementTypeEnum("null");

        /**
         * Enum CYBERSECURITY for value: "cybersecurity"
         */
        public static final SecurityReinforcementTypeEnum CYBERSECURITY =
            new SecurityReinforcementTypeEnum("cybersecurity");

        private static final Map<String, SecurityReinforcementTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SecurityReinforcementTypeEnum> createStaticFields() {
            Map<String, SecurityReinforcementTypeEnum> map = new HashMap<>();
            map.put("null", NULL);
            map.put("cybersecurity", CYBERSECURITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SecurityReinforcementTypeEnum(String value) {
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
        public static SecurityReinforcementTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new SecurityReinforcementTypeEnum(value));
        }

        public static SecurityReinforcementTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SecurityReinforcementTypeEnum) {
                return this.value.equals(((SecurityReinforcementTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securityReinforcementType")

    private SecurityReinforcementTypeEnum securityReinforcementType;

    public ReinstallNodeSpec withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * **参数解释**： 操作系统。指定自定义镜像场景将以IMS镜像的实际操作系统版本为准。请选择当前集群支持的操作系统版本。[例如Huawei Cloud EulerOS 2.0、Ubuntu 22.04、EulerOS 2.9、CentOS 7.6、EulerOS 2.8。](tag:hws,hws_hk) **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return os
     */
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

    /**
     * Get login
     * @return login
     */
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

    /**
     * **参数解释**： 节点名称 > 重装时指定将修改节点名称，且服务器名称会同步修改。默认以服务器当前名称作为节点名称。  **约束限制**： 命名规则：以小写字母开头，由小写字母、数字、中划线(-)、点(.)组成，长度范围1-56位。 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return name
     */
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

    /**
     * Get serverConfig
     * @return serverConfig
     */
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

    /**
     * Get volumeConfig
     * @return volumeConfig
     */
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

    /**
     * Get runtimeConfig
     * @return runtimeConfig
     */
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

    /**
     * Get k8sOptions
     * @return k8sOptions
     */
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

    /**
     * Get lifecycle
     * @return lifecycle
     */
    public NodeLifecycleConfig getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(NodeLifecycleConfig lifecycle) {
        this.lifecycle = lifecycle;
    }

    public ReinstallNodeSpec withInitializedConditions(List<String> initializedConditions) {
        this.initializedConditions = initializedConditions;
        return this;
    }

    public ReinstallNodeSpec addInitializedConditionsItem(String initializedConditionsItem) {
        if (this.initializedConditions == null) {
            this.initializedConditions = new ArrayList<>();
        }
        this.initializedConditions.add(initializedConditionsItem);
        return this;
    }

    public ReinstallNodeSpec withInitializedConditions(Consumer<List<String>> initializedConditionsSetter) {
        if (this.initializedConditions == null) {
            this.initializedConditions = new ArrayList<>();
        }
        initializedConditionsSetter.accept(this.initializedConditions);
        return this;
    }

    /**
     * **参数解释**： 自定义初始化标记，默认值为空。  CCE节点在初始化完成之前，会打上初始化未完成污点（node.cloudprovider.kubernetes.io/uninitialized）防止pod调度到节点上。用户在纳管/重置节点时，可以通过设置initializedConditions参数，控制污点的移除时间（默认不设置超时时间）。  使用示例如下： 1. 纳管/重置节点，传入参数 \"initializedConditions\": [\"CCEInitial\", \"CustomedInitial\"]； 2. 用户在执行完自定义初始化操作后，调用k8s接口（例如PATCH /v1/nodes/{node_ip}/status）更新节点的conditions，插入type为CCEInitial、CustomedInitial的两个标记，状态为True； 3. CCE组件轮询节点的status.Conditions，查看是否存在type为CCEInitial、CustomedInitial的condition，若存在且status字段值为True，认为节点初始化完成，则移除初始化污点； 4. initializedConditions支持设置超时时间，用户可以在创节点时传入，如：\"initializedConditions\": [\"CCEInitial:15m\", \"CustomedInitial:15m\"]，表示超时时间为15分钟，达到超时时间后，当CCE组件轮询到节点时会自动忽略初始化condition，移除初始化污点。  节点Conditions示例如下： ``` status:   conditions:   - type: CCEInitial     status: 'True'   - type: CustomedInitial     status: 'True' ```  **约束限制**： - initializedConditions中超时时间取值范围为[1-99]秒 - 必须以字母、数字组成，长度范围1-20位。 - 标记数量不超过2个。 - 超时时间仅支持分钟(m)单位。 
     * @return initializedConditions
     */
    public List<String> getInitializedConditions() {
        return initializedConditions;
    }

    public void setInitializedConditions(List<String> initializedConditions) {
        this.initializedConditions = initializedConditions;
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

    /**
     * Get extendParam
     * @return extendParam
     */
    public ReinstallExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(ReinstallExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    public ReinstallNodeSpec withHostnameConfig(HostnameConfig hostnameConfig) {
        this.hostnameConfig = hostnameConfig;
        return this;
    }

    public ReinstallNodeSpec withHostnameConfig(Consumer<HostnameConfig> hostnameConfigSetter) {
        if (this.hostnameConfig == null) {
            this.hostnameConfig = new HostnameConfig();
            hostnameConfigSetter.accept(this.hostnameConfig);
        }

        return this;
    }

    /**
     * Get hostnameConfig
     * @return hostnameConfig
     */
    public HostnameConfig getHostnameConfig() {
        return hostnameConfig;
    }

    public void setHostnameConfig(HostnameConfig hostnameConfig) {
        this.hostnameConfig = hostnameConfig;
    }

    public ReinstallNodeSpec withSecurityReinforcementType(SecurityReinforcementTypeEnum securityReinforcementType) {
        this.securityReinforcementType = securityReinforcementType;
        return this;
    }

    /**
     * **参数解释**： 指定节点安全加固类型，当前仅支持HCE2.0镜像等保2.0三级安全加固。 等保加固会对身份鉴别、访问控制、安全审计、入侵防范、恶意代码防范进行检查并加固。[详情请参见[Huawei Cloud EulerOS 2.0等保2.0三级版镜像概述](https://support.huaweicloud.com/productdesc-hce/hce_sec_0001.html)。](tag:hws) 若未指定此参数，则尝试用原有的值补全。如：原先HCE2.0镜像已配置安全加固，更新节点池时未指定此参数，则仍旧保持安全加固配置，若要取消，需显式指定参数值为\"null\"。 **约束限制**： 不涉及 **取值范围**： - 空值：表示不开启等保加固 - cybersecurity：表示开启等保加固  **默认取值**： 不涉及
     * @return securityReinforcementType
     */
    public SecurityReinforcementTypeEnum getSecurityReinforcementType() {
        return securityReinforcementType;
    }

    public void setSecurityReinforcementType(SecurityReinforcementTypeEnum securityReinforcementType) {
        this.securityReinforcementType = securityReinforcementType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReinstallNodeSpec that = (ReinstallNodeSpec) obj;
        return Objects.equals(this.os, that.os) && Objects.equals(this.login, that.login)
            && Objects.equals(this.name, that.name) && Objects.equals(this.serverConfig, that.serverConfig)
            && Objects.equals(this.volumeConfig, that.volumeConfig)
            && Objects.equals(this.runtimeConfig, that.runtimeConfig)
            && Objects.equals(this.k8sOptions, that.k8sOptions) && Objects.equals(this.lifecycle, that.lifecycle)
            && Objects.equals(this.initializedConditions, that.initializedConditions)
            && Objects.equals(this.extendParam, that.extendParam)
            && Objects.equals(this.hostnameConfig, that.hostnameConfig)
            && Objects.equals(this.securityReinforcementType, that.securityReinforcementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(os,
            login,
            name,
            serverConfig,
            volumeConfig,
            runtimeConfig,
            k8sOptions,
            lifecycle,
            initializedConditions,
            extendParam,
            hostnameConfig,
            securityReinforcementType);
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
        sb.append("    initializedConditions: ").append(toIndentedString(initializedConditions)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    hostnameConfig: ").append(toIndentedString(hostnameConfig)).append("\n");
        sb.append("    securityReinforcementType: ").append(toIndentedString(securityReinforcementType)).append("\n");
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
