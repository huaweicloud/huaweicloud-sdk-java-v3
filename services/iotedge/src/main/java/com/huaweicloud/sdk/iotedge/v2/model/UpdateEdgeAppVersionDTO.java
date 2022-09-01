package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.ContainerSettingsDTO;
import com.huaweicloud.sdk.iotedge.v2.model.ProbeDTO;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateEdgeAppVersionDTO
 */
public class UpdateEdgeAppVersionDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    @JacksonXmlProperty(localName = "description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deploy_type")
    
    @JacksonXmlProperty(localName = "deploy_type")
    
    private String deployType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deploy_multi_instance")
    
    @JacksonXmlProperty(localName = "deploy_multi_instance")
    
    private Boolean deployMultiInstance;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_settings")
    
    @JacksonXmlProperty(localName = "container_settings")
    
    private ContainerSettingsDTO containerSettings;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="liveness_probe")
    
    @JacksonXmlProperty(localName = "liveness_probe")
    
    private ProbeDTO livenessProbe;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="readiness_probe")
    
    @JacksonXmlProperty(localName = "readiness_probe")
    
    private ProbeDTO readinessProbe;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sdk_version")
    
    @JacksonXmlProperty(localName = "sdk_version")
    
    private String sdkVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    @JacksonXmlProperty(localName = "arch")
    
    private Object arch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="command")
    
    @JacksonXmlProperty(localName = "command")
    
    private Object command;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="args")
    
    @JacksonXmlProperty(localName = "args")
    
    private Object args;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="outputs")
    
    @JacksonXmlProperty(localName = "outputs")
    
    private Object outputs;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="inputs")
    
    @JacksonXmlProperty(localName = "inputs")
    
    private Object inputs;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="services")
    
    @JacksonXmlProperty(localName = "services")
    
    private Object services;

    public UpdateEdgeAppVersionDTO withDescription(String description) {
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

    

    public UpdateEdgeAppVersionDTO withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    


    /**
     * 部署类型docker|process
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    

    public UpdateEdgeAppVersionDTO withDeployMultiInstance(Boolean deployMultiInstance) {
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

    

    public UpdateEdgeAppVersionDTO withContainerSettings(ContainerSettingsDTO containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    public UpdateEdgeAppVersionDTO withContainerSettings(Consumer<ContainerSettingsDTO> containerSettingsSetter) {
        if(this.containerSettings == null ){
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

    

    public UpdateEdgeAppVersionDTO withLivenessProbe(ProbeDTO livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public UpdateEdgeAppVersionDTO withLivenessProbe(Consumer<ProbeDTO> livenessProbeSetter) {
        if(this.livenessProbe == null ){
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

    

    public UpdateEdgeAppVersionDTO withReadinessProbe(ProbeDTO readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public UpdateEdgeAppVersionDTO withReadinessProbe(Consumer<ProbeDTO> readinessProbeSetter) {
        if(this.readinessProbe == null ){
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

    

    public UpdateEdgeAppVersionDTO withSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }

    


    /**
     * 应用集成的边缘升得快版本
     * @return sdkVersion
     */
    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    

    public UpdateEdgeAppVersionDTO withArch(Object arch) {
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

    

    public UpdateEdgeAppVersionDTO withCommand(Object command) {
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

    

    public UpdateEdgeAppVersionDTO withArgs(Object args) {
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

    

    public UpdateEdgeAppVersionDTO withOutputs(Object outputs) {
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

    

    public UpdateEdgeAppVersionDTO withInputs(Object inputs) {
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

    

    public UpdateEdgeAppVersionDTO withServices(Object services) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEdgeAppVersionDTO updateEdgeAppVersionDTO = (UpdateEdgeAppVersionDTO) o;
        return Objects.equals(this.description, updateEdgeAppVersionDTO.description) &&
            Objects.equals(this.deployType, updateEdgeAppVersionDTO.deployType) &&
            Objects.equals(this.deployMultiInstance, updateEdgeAppVersionDTO.deployMultiInstance) &&
            Objects.equals(this.containerSettings, updateEdgeAppVersionDTO.containerSettings) &&
            Objects.equals(this.livenessProbe, updateEdgeAppVersionDTO.livenessProbe) &&
            Objects.equals(this.readinessProbe, updateEdgeAppVersionDTO.readinessProbe) &&
            Objects.equals(this.sdkVersion, updateEdgeAppVersionDTO.sdkVersion) &&
            Objects.equals(this.arch, updateEdgeAppVersionDTO.arch) &&
            Objects.equals(this.command, updateEdgeAppVersionDTO.command) &&
            Objects.equals(this.args, updateEdgeAppVersionDTO.args) &&
            Objects.equals(this.outputs, updateEdgeAppVersionDTO.outputs) &&
            Objects.equals(this.inputs, updateEdgeAppVersionDTO.inputs) &&
            Objects.equals(this.services, updateEdgeAppVersionDTO.services);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, deployType, deployMultiInstance, containerSettings, livenessProbe, readinessProbe, sdkVersion, arch, command, args, outputs, inputs, services);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeAppVersionDTO {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    deployMultiInstance: ").append(toIndentedString(deployMultiInstance)).append("\n");
        sb.append("    containerSettings: ").append(toIndentedString(containerSettings)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
        sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
        sb.append("    sdkVersion: ").append(toIndentedString(sdkVersion)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

