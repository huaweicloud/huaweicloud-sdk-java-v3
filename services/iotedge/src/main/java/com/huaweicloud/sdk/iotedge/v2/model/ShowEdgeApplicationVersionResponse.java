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
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowEdgeApplicationVersionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_id")
    
    
    private String edgeAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deploy_type")
    
    
    private String deployType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    
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
    
    
    private StateEnum state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="liveness_probe")
    
    
    private ProbeDTO livenessProbe;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="readiness_probe")
    
    
    private ProbeDTO readinessProbe;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    
    private List<String> arch = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="command")
    
    
    private List<String> command = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="args")
    
    
    private List<String> args = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_settings")
    
    
    private ContainerSettingsDTO containerSettings;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="outputs")
    
    
    private List<String> outputs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="inputs")
    
    
    private List<String> inputs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="services")
    
    
    private List<String> services = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_time")
    
    
    private String publishTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="off_shelf_time")
    
    
    private String offShelfTime;

    public ShowEdgeApplicationVersionResponse withEdgeAppId(String edgeAppId) {
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

    

    public ShowEdgeApplicationVersionResponse withName(String name) {
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

    

    public ShowEdgeApplicationVersionResponse withDeployType(String deployType) {
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

    

    public ShowEdgeApplicationVersionResponse withVersion(String version) {
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

    

    public ShowEdgeApplicationVersionResponse withDescription(String description) {
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

    

    public ShowEdgeApplicationVersionResponse withCreateTime(String createTime) {
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

    

    public ShowEdgeApplicationVersionResponse withUpdateTime(String updateTime) {
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

    

    public ShowEdgeApplicationVersionResponse withState(StateEnum state) {
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

    

    public ShowEdgeApplicationVersionResponse withLivenessProbe(ProbeDTO livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public ShowEdgeApplicationVersionResponse withLivenessProbe(Consumer<ProbeDTO> livenessProbeSetter) {
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

    

    public ShowEdgeApplicationVersionResponse withReadinessProbe(ProbeDTO readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public ShowEdgeApplicationVersionResponse withReadinessProbe(Consumer<ProbeDTO> readinessProbeSetter) {
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

    

    public ShowEdgeApplicationVersionResponse withArch(List<String> arch) {
        this.arch = arch;
        return this;
    }

    
    public ShowEdgeApplicationVersionResponse addArchItem(String archItem) {
        if(this.arch == null) {
            this.arch = new ArrayList<>();
        }
        this.arch.add(archItem);
        return this;
    }

    public ShowEdgeApplicationVersionResponse withArch(Consumer<List<String>> archSetter) {
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

    

    public ShowEdgeApplicationVersionResponse withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    
    public ShowEdgeApplicationVersionResponse addCommandItem(String commandItem) {
        if(this.command == null) {
            this.command = new ArrayList<>();
        }
        this.command.add(commandItem);
        return this;
    }

    public ShowEdgeApplicationVersionResponse withCommand(Consumer<List<String>> commandSetter) {
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

    

    public ShowEdgeApplicationVersionResponse withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    
    public ShowEdgeApplicationVersionResponse addArgsItem(String argsItem) {
        if(this.args == null) {
            this.args = new ArrayList<>();
        }
        this.args.add(argsItem);
        return this;
    }

    public ShowEdgeApplicationVersionResponse withArgs(Consumer<List<String>> argsSetter) {
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

    

    public ShowEdgeApplicationVersionResponse withContainerSettings(ContainerSettingsDTO containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    public ShowEdgeApplicationVersionResponse withContainerSettings(Consumer<ContainerSettingsDTO> containerSettingsSetter) {
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

    

    public ShowEdgeApplicationVersionResponse withOutputs(List<String> outputs) {
        this.outputs = outputs;
        return this;
    }

    
    public ShowEdgeApplicationVersionResponse addOutputsItem(String outputsItem) {
        if(this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public ShowEdgeApplicationVersionResponse withOutputs(Consumer<List<String>> outputsSetter) {
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

    

    public ShowEdgeApplicationVersionResponse withInputs(List<String> inputs) {
        this.inputs = inputs;
        return this;
    }

    
    public ShowEdgeApplicationVersionResponse addInputsItem(String inputsItem) {
        if(this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public ShowEdgeApplicationVersionResponse withInputs(Consumer<List<String>> inputsSetter) {
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

    

    public ShowEdgeApplicationVersionResponse withServices(List<String> services) {
        this.services = services;
        return this;
    }

    
    public ShowEdgeApplicationVersionResponse addServicesItem(String servicesItem) {
        if(this.services == null) {
            this.services = new ArrayList<>();
        }
        this.services.add(servicesItem);
        return this;
    }

    public ShowEdgeApplicationVersionResponse withServices(Consumer<List<String>> servicesSetter) {
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

    

    public ShowEdgeApplicationVersionResponse withPublishTime(String publishTime) {
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

    

    public ShowEdgeApplicationVersionResponse withOffShelfTime(String offShelfTime) {
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
        ShowEdgeApplicationVersionResponse showEdgeApplicationVersionResponse = (ShowEdgeApplicationVersionResponse) o;
        return Objects.equals(this.edgeAppId, showEdgeApplicationVersionResponse.edgeAppId) &&
            Objects.equals(this.name, showEdgeApplicationVersionResponse.name) &&
            Objects.equals(this.deployType, showEdgeApplicationVersionResponse.deployType) &&
            Objects.equals(this.version, showEdgeApplicationVersionResponse.version) &&
            Objects.equals(this.description, showEdgeApplicationVersionResponse.description) &&
            Objects.equals(this.createTime, showEdgeApplicationVersionResponse.createTime) &&
            Objects.equals(this.updateTime, showEdgeApplicationVersionResponse.updateTime) &&
            Objects.equals(this.state, showEdgeApplicationVersionResponse.state) &&
            Objects.equals(this.livenessProbe, showEdgeApplicationVersionResponse.livenessProbe) &&
            Objects.equals(this.readinessProbe, showEdgeApplicationVersionResponse.readinessProbe) &&
            Objects.equals(this.arch, showEdgeApplicationVersionResponse.arch) &&
            Objects.equals(this.command, showEdgeApplicationVersionResponse.command) &&
            Objects.equals(this.args, showEdgeApplicationVersionResponse.args) &&
            Objects.equals(this.containerSettings, showEdgeApplicationVersionResponse.containerSettings) &&
            Objects.equals(this.outputs, showEdgeApplicationVersionResponse.outputs) &&
            Objects.equals(this.inputs, showEdgeApplicationVersionResponse.inputs) &&
            Objects.equals(this.services, showEdgeApplicationVersionResponse.services) &&
            Objects.equals(this.publishTime, showEdgeApplicationVersionResponse.publishTime) &&
            Objects.equals(this.offShelfTime, showEdgeApplicationVersionResponse.offShelfTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, name, deployType, version, description, createTime, updateTime, state, livenessProbe, readinessProbe, arch, command, args, containerSettings, outputs, inputs, services, publishTime, offShelfTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEdgeApplicationVersionResponse {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

