package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateEdgeApplicationVersionDTO
 */
public class CreateEdgeApplicationVersionDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sdk_version")

    private String sdkVersion;

    /**
     * 应用部署类型，分为docker容器部署类型和process进程部署类型，兼容之前数据，此字段可以为空，为空情况为docker类型
     */
    public static final class DeployTypeEnum {

        /**
         * Enum DOCKER for value: "docker"
         */
        public static final DeployTypeEnum DOCKER = new DeployTypeEnum("docker");

        /**
         * Enum PROCESS for value: "process"
         */
        public static final DeployTypeEnum PROCESS = new DeployTypeEnum("process");

        private static final Map<String, DeployTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeployTypeEnum> createStaticFields() {
            Map<String, DeployTypeEnum> map = new HashMap<>();
            map.put("docker", DOCKER);
            map.put("process", PROCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeployTypeEnum(String value) {
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
        public static DeployTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeployTypeEnum(value));
        }

        public static DeployTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeployTypeEnum) {
                return this.value.equals(((DeployTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private DeployTypeEnum deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_multi_instance")

    private Boolean deployMultiInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_settings")

    private ContainerSettingsDTO containerSettings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveness_probe")

    private ProbeDTO livenessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readiness_probe")

    private ProbeDTO readinessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private Object arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private Object command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "args")

    private Object args;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private Object outputs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private Object inputs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "services")

    private Object services;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supplier")

    private String supplier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    public CreateEdgeApplicationVersionDTO withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 应用版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateEdgeApplicationVersionDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateEdgeApplicationVersionDTO withSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }

    /**
     * 应用集成的边缘SDK版本
     * @return sdkVersion
     */
    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public CreateEdgeApplicationVersionDTO withDeployType(DeployTypeEnum deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * 应用部署类型，分为docker容器部署类型和process进程部署类型，兼容之前数据，此字段可以为空，为空情况为docker类型
     * @return deployType
     */
    public DeployTypeEnum getDeployType() {
        return deployType;
    }

    public void setDeployType(DeployTypeEnum deployType) {
        this.deployType = deployType;
    }

    public CreateEdgeApplicationVersionDTO withDeployMultiInstance(Boolean deployMultiInstance) {
        this.deployMultiInstance = deployMultiInstance;
        return this;
    }

    /**
     * 是否允许部署多实例
     * @return deployMultiInstance
     */
    public Boolean getDeployMultiInstance() {
        return deployMultiInstance;
    }

    public void setDeployMultiInstance(Boolean deployMultiInstance) {
        this.deployMultiInstance = deployMultiInstance;
    }

    public CreateEdgeApplicationVersionDTO withContainerSettings(ContainerSettingsDTO containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    public CreateEdgeApplicationVersionDTO withContainerSettings(
        Consumer<ContainerSettingsDTO> containerSettingsSetter) {
        if (this.containerSettings == null) {
            this.containerSettings = new ContainerSettingsDTO();
            containerSettingsSetter.accept(this.containerSettings);
        }

        return this;
    }

    /**
     * Get containerSettings
     * @return containerSettings
     */
    public ContainerSettingsDTO getContainerSettings() {
        return containerSettings;
    }

    public void setContainerSettings(ContainerSettingsDTO containerSettings) {
        this.containerSettings = containerSettings;
    }

    public CreateEdgeApplicationVersionDTO withLivenessProbe(ProbeDTO livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public CreateEdgeApplicationVersionDTO withLivenessProbe(Consumer<ProbeDTO> livenessProbeSetter) {
        if (this.livenessProbe == null) {
            this.livenessProbe = new ProbeDTO();
            livenessProbeSetter.accept(this.livenessProbe);
        }

        return this;
    }

    /**
     * Get livenessProbe
     * @return livenessProbe
     */
    public ProbeDTO getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(ProbeDTO livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public CreateEdgeApplicationVersionDTO withReadinessProbe(ProbeDTO readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public CreateEdgeApplicationVersionDTO withReadinessProbe(Consumer<ProbeDTO> readinessProbeSetter) {
        if (this.readinessProbe == null) {
            this.readinessProbe = new ProbeDTO();
            readinessProbeSetter.accept(this.readinessProbe);
        }

        return this;
    }

    /**
     * Get readinessProbe
     * @return readinessProbe
     */
    public ProbeDTO getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(ProbeDTO readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public CreateEdgeApplicationVersionDTO withArch(Object arch) {
        this.arch = arch;
        return this;
    }

    /**
     * 架构
     * @return arch
     */
    public Object getArch() {
        return arch;
    }

    public void setArch(Object arch) {
        this.arch = arch;
    }

    public CreateEdgeApplicationVersionDTO withCommand(Object command) {
        this.command = command;
        return this;
    }

    /**
     * 启动命令
     * @return command
     */
    public Object getCommand() {
        return command;
    }

    public void setCommand(Object command) {
        this.command = command;
    }

    public CreateEdgeApplicationVersionDTO withArgs(Object args) {
        this.args = args;
        return this;
    }

    /**
     * 启动参数
     * @return args
     */
    public Object getArgs() {
        return args;
    }

    public void setArgs(Object args) {
        this.args = args;
    }

    public CreateEdgeApplicationVersionDTO withOutputs(Object outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * 应用输出路由端点
     * @return outputs
     */
    public Object getOutputs() {
        return outputs;
    }

    public void setOutputs(Object outputs) {
        this.outputs = outputs;
    }

    public CreateEdgeApplicationVersionDTO withInputs(Object inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * 应用输入路由
     * @return inputs
     */
    public Object getInputs() {
        return inputs;
    }

    public void setInputs(Object inputs) {
        this.inputs = inputs;
    }

    public CreateEdgeApplicationVersionDTO withServices(Object services) {
        this.services = services;
        return this;
    }

    /**
     * 应用实现的服务列表
     * @return services
     */
    public Object getServices() {
        return services;
    }

    public void setServices(Object services) {
        this.services = services;
    }

    public CreateEdgeApplicationVersionDTO withSupplier(String supplier) {
        this.supplier = supplier;
        return this;
    }

    /**
     * 驱动厂商
     * @return supplier
     */
    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public CreateEdgeApplicationVersionDTO withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 模板id
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEdgeApplicationVersionDTO that = (CreateEdgeApplicationVersionDTO) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.description, that.description)
            && Objects.equals(this.sdkVersion, that.sdkVersion) && Objects.equals(this.deployType, that.deployType)
            && Objects.equals(this.deployMultiInstance, that.deployMultiInstance)
            && Objects.equals(this.containerSettings, that.containerSettings)
            && Objects.equals(this.livenessProbe, that.livenessProbe)
            && Objects.equals(this.readinessProbe, that.readinessProbe) && Objects.equals(this.arch, that.arch)
            && Objects.equals(this.command, that.command) && Objects.equals(this.args, that.args)
            && Objects.equals(this.outputs, that.outputs) && Objects.equals(this.inputs, that.inputs)
            && Objects.equals(this.services, that.services) && Objects.equals(this.supplier, that.supplier)
            && Objects.equals(this.tplId, that.tplId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            description,
            sdkVersion,
            deployType,
            deployMultiInstance,
            containerSettings,
            livenessProbe,
            readinessProbe,
            arch,
            command,
            args,
            outputs,
            inputs,
            services,
            supplier,
            tplId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEdgeApplicationVersionDTO {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sdkVersion: ").append(toIndentedString(sdkVersion)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    deployMultiInstance: ").append(toIndentedString(deployMultiInstance)).append("\n");
        sb.append("    containerSettings: ").append(toIndentedString(containerSettings)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
        sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
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
