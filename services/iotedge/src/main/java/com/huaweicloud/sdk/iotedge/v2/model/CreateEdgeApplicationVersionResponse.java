package com.huaweicloud.sdk.iotedge.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.ContainerSettingsDTO;
import com.huaweicloud.sdk.iotedge.v2.model.ProbeDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateEdgeApplicationVersionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_id")
    
    @JacksonXmlProperty(localName = "edge_app_id")
    
    private String edgeAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deploy_type")
    
    @JacksonXmlProperty(localName = "deploy_type")
    
    private String deployType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deploy_multi_instance")
    
    @JacksonXmlProperty(localName = "deploy_multi_instance")
    
    private Boolean deployMultiInstance;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    @JacksonXmlProperty(localName = "version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sdk_version")
    
    @JacksonXmlProperty(localName = "sdk_version")
    
    private String sdkVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    @JacksonXmlProperty(localName = "description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    @JacksonXmlProperty(localName = "create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    @JacksonXmlProperty(localName = "update_time")
    
    private String updateTime;
    /**
     * 应用版本状态
     */
    public static final class StateEnum {

        
        /**
         * Enum DRAFT for value: "DRAFT"
         */
        public static final StateEnum DRAFT = new StateEnum("DRAFT");
        
        /**
         * Enum PUBLISHED for value: "PUBLISHED"
         */
        public static final StateEnum PUBLISHED = new StateEnum("PUBLISHED");
        
        /**
         * Enum OFF_SHELF for value: "OFF_SHELF"
         */
        public static final StateEnum OFF_SHELF = new StateEnum("OFF_SHELF");
        

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("DRAFT", DRAFT);
            map.put("PUBLISHED", PUBLISHED);
            map.put("OFF_SHELF", OFF_SHELF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    @JacksonXmlProperty(localName = "state")
    
    private StateEnum state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="liveness_probe")
    
    @JacksonXmlProperty(localName = "liveness_probe")
    
    private ProbeDTO livenessProbe;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="readiness_probe")
    
    @JacksonXmlProperty(localName = "readiness_probe")
    
    private ProbeDTO readinessProbe;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    @JacksonXmlProperty(localName = "arch")
    
    private List<String> arch = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="command")
    
    @JacksonXmlProperty(localName = "command")
    
    private List<String> command = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="args")
    
    @JacksonXmlProperty(localName = "args")
    
    private List<String> args = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_settings")
    
    @JacksonXmlProperty(localName = "container_settings")
    
    private ContainerSettingsDTO containerSettings;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="outputs")
    
    @JacksonXmlProperty(localName = "outputs")
    
    private List<String> outputs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="inputs")
    
    @JacksonXmlProperty(localName = "inputs")
    
    private List<String> inputs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="services")
    
    @JacksonXmlProperty(localName = "services")
    
    private List<String> services = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_time")
    
    @JacksonXmlProperty(localName = "publish_time")
    
    private String publishTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="off_shelf_time")
    
    @JacksonXmlProperty(localName = "off_shelf_time")
    
    private String offShelfTime;

    public CreateEdgeApplicationVersionResponse withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    


    /**
     * 应用ID
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    

    public CreateEdgeApplicationVersionResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 应用名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateEdgeApplicationVersionResponse withDeployType(String deployType) {
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

    

    public CreateEdgeApplicationVersionResponse withDeployMultiInstance(Boolean deployMultiInstance) {
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

    

    public CreateEdgeApplicationVersionResponse withVersion(String version) {
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

    

    public CreateEdgeApplicationVersionResponse withSdkVersion(String sdkVersion) {
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

    

    public CreateEdgeApplicationVersionResponse withDescription(String description) {
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

    

    public CreateEdgeApplicationVersionResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public CreateEdgeApplicationVersionResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 最后一次修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    public CreateEdgeApplicationVersionResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    


    /**
     * 应用版本状态
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    

    public CreateEdgeApplicationVersionResponse withLivenessProbe(ProbeDTO livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public CreateEdgeApplicationVersionResponse withLivenessProbe(Consumer<ProbeDTO> livenessProbeSetter) {
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

    

    public CreateEdgeApplicationVersionResponse withReadinessProbe(ProbeDTO readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public CreateEdgeApplicationVersionResponse withReadinessProbe(Consumer<ProbeDTO> readinessProbeSetter) {
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

    

    public CreateEdgeApplicationVersionResponse withArch(List<String> arch) {
        this.arch = arch;
        return this;
    }

    
    public CreateEdgeApplicationVersionResponse addArchItem(String archItem) {
        if(this.arch == null) {
            this.arch = new ArrayList<>();
        }
        this.arch.add(archItem);
        return this;
    }

    public CreateEdgeApplicationVersionResponse withArch(Consumer<List<String>> archSetter) {
        if(this.arch == null) {
            this.arch = new ArrayList<>();
        }
        archSetter.accept(this.arch);
        return this;
    }

    /**
     * 架构
     * @return arch
     */
    public List<String> getArch() {
        return arch;
    }

    public void setArch(List<String> arch) {
        this.arch = arch;
    }

    

    public CreateEdgeApplicationVersionResponse withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    
    public CreateEdgeApplicationVersionResponse addCommandItem(String commandItem) {
        if(this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(commandItem);
        return this;
    }

    public CreateEdgeApplicationVersionResponse withCommand(Consumer<List<String>> commandSetter) {
        if(this.command == null) {
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

    

    public CreateEdgeApplicationVersionResponse withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    
    public CreateEdgeApplicationVersionResponse addArgsItem(String argsItem) {
        if(this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public CreateEdgeApplicationVersionResponse withArgs(Consumer<List<String>> argsSetter) {
        if(this.args == null) {
            this.args = new ArrayList<>();
        }
        argsSetter.accept(this.args);
        return this;
    }

    /**
     * 启动参数
     * @return args
     */
    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    

    public CreateEdgeApplicationVersionResponse withContainerSettings(ContainerSettingsDTO containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    public CreateEdgeApplicationVersionResponse withContainerSettings(Consumer<ContainerSettingsDTO> containerSettingsSetter) {
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

    

    public CreateEdgeApplicationVersionResponse withOutputs(List<String> outputs) {
        this.outputs = outputs;
        return this;
    }

    
    public CreateEdgeApplicationVersionResponse addOutputsItem(String outputsItem) {
        if(this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public CreateEdgeApplicationVersionResponse withOutputs(Consumer<List<String>> outputsSetter) {
        if(this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * 应用输出路由端点
     * @return outputs
     */
    public List<String> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<String> outputs) {
        this.outputs = outputs;
    }

    

    public CreateEdgeApplicationVersionResponse withInputs(List<String> inputs) {
        this.inputs = inputs;
        return this;
    }

    
    public CreateEdgeApplicationVersionResponse addInputsItem(String inputsItem) {
        if(this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public CreateEdgeApplicationVersionResponse withInputs(Consumer<List<String>> inputsSetter) {
        if(this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 应用输入路由
     * @return inputs
     */
    public List<String> getInputs() {
        return inputs;
    }

    public void setInputs(List<String> inputs) {
        this.inputs = inputs;
    }

    

    public CreateEdgeApplicationVersionResponse withServices(List<String> services) {
        this.services = services;
        return this;
    }

    
    public CreateEdgeApplicationVersionResponse addServicesItem(String servicesItem) {
        if(this.services == null) {
            this.services = new ArrayList<>();
        }
        this.services.add(servicesItem);
        return this;
    }

    public CreateEdgeApplicationVersionResponse withServices(Consumer<List<String>> servicesSetter) {
        if(this.services == null) {
            this.services = new ArrayList<>();
        }
        servicesSetter.accept(this.services);
        return this;
    }

    /**
     * 应用实现的服务列表
     * @return services
     */
    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    

    public CreateEdgeApplicationVersionResponse withPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    


    /**
     * 发布时间
     * @return publishTime
     */
    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    

    public CreateEdgeApplicationVersionResponse withOffShelfTime(String offShelfTime) {
        this.offShelfTime = offShelfTime;
        return this;
    }

    


    /**
     * 下线时间
     * @return offShelfTime
     */
    public String getOffShelfTime() {
        return offShelfTime;
    }

    public void setOffShelfTime(String offShelfTime) {
        this.offShelfTime = offShelfTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEdgeApplicationVersionResponse createEdgeApplicationVersionResponse = (CreateEdgeApplicationVersionResponse) o;
        return Objects.equals(this.edgeAppId, createEdgeApplicationVersionResponse.edgeAppId) &&
            Objects.equals(this.name, createEdgeApplicationVersionResponse.name) &&
            Objects.equals(this.deployType, createEdgeApplicationVersionResponse.deployType) &&
            Objects.equals(this.deployMultiInstance, createEdgeApplicationVersionResponse.deployMultiInstance) &&
            Objects.equals(this.version, createEdgeApplicationVersionResponse.version) &&
            Objects.equals(this.sdkVersion, createEdgeApplicationVersionResponse.sdkVersion) &&
            Objects.equals(this.description, createEdgeApplicationVersionResponse.description) &&
            Objects.equals(this.createTime, createEdgeApplicationVersionResponse.createTime) &&
            Objects.equals(this.updateTime, createEdgeApplicationVersionResponse.updateTime) &&
            Objects.equals(this.state, createEdgeApplicationVersionResponse.state) &&
            Objects.equals(this.livenessProbe, createEdgeApplicationVersionResponse.livenessProbe) &&
            Objects.equals(this.readinessProbe, createEdgeApplicationVersionResponse.readinessProbe) &&
            Objects.equals(this.arch, createEdgeApplicationVersionResponse.arch) &&
            Objects.equals(this.command, createEdgeApplicationVersionResponse.command) &&
            Objects.equals(this.args, createEdgeApplicationVersionResponse.args) &&
            Objects.equals(this.containerSettings, createEdgeApplicationVersionResponse.containerSettings) &&
            Objects.equals(this.outputs, createEdgeApplicationVersionResponse.outputs) &&
            Objects.equals(this.inputs, createEdgeApplicationVersionResponse.inputs) &&
            Objects.equals(this.services, createEdgeApplicationVersionResponse.services) &&
            Objects.equals(this.publishTime, createEdgeApplicationVersionResponse.publishTime) &&
            Objects.equals(this.offShelfTime, createEdgeApplicationVersionResponse.offShelfTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, name, deployType, deployMultiInstance, version, sdkVersion, description, createTime, updateTime, state, livenessProbe, readinessProbe, arch, command, args, containerSettings, outputs, inputs, services, publishTime, offShelfTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEdgeApplicationVersionResponse {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    deployMultiInstance: ").append(toIndentedString(deployMultiInstance)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    sdkVersion: ").append(toIndentedString(sdkVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
        sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    containerSettings: ").append(toIndentedString(containerSettings)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    offShelfTime: ").append(toIndentedString(offShelfTime)).append("\n");
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

