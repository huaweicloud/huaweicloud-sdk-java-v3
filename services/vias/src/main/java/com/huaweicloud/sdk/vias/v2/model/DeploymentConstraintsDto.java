package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建模型参数deployment_constraints
 */
public class DeploymentConstraintsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_mode")

    private String requestMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_type")

    private String cpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accelerators")

    private List<AcceleratorsDto> accelerators = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_types")

    private List<String> inputTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_types")

    private List<String> outputTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_config")

    private String serviceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_config")

    private String taskConfig;

    public DeploymentConstraintsDto withRequestMode(String requestMode) {
        this.requestMode = requestMode;
        return this;
    }

    /**
     * 请求模式，取值为“sync”或者“async”
     * @return requestMode
     */
    public String getRequestMode() {
        return requestMode;
    }

    public void setRequestMode(String requestMode) {
        this.requestMode = requestMode;
    }

    public DeploymentConstraintsDto withCpuType(String cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    /**
     * CPU类型，取值为“x86_64”或者“aarch64”
     * @return cpuType
     */
    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public DeploymentConstraintsDto withAccelerators(List<AcceleratorsDto> accelerators) {
        this.accelerators = accelerators;
        return this;
    }

    public DeploymentConstraintsDto addAcceleratorsItem(AcceleratorsDto acceleratorsItem) {
        if (this.accelerators == null) {
            this.accelerators = new ArrayList<>();
        }
        this.accelerators.add(acceleratorsItem);
        return this;
    }

    public DeploymentConstraintsDto withAccelerators(Consumer<List<AcceleratorsDto>> acceleratorsSetter) {
        if (this.accelerators == null) {
            this.accelerators = new ArrayList<>();
        }
        acceleratorsSetter.accept(this.accelerators);
        return this;
    }

    /**
     * 推理加速卡
     * @return accelerators
     */
    public List<AcceleratorsDto> getAccelerators() {
        return accelerators;
    }

    public void setAccelerators(List<AcceleratorsDto> accelerators) {
        this.accelerators = accelerators;
    }

    public DeploymentConstraintsDto withInputTypes(List<String> inputTypes) {
        this.inputTypes = inputTypes;
        return this;
    }

    public DeploymentConstraintsDto addInputTypesItem(String inputTypesItem) {
        if (this.inputTypes == null) {
            this.inputTypes = new ArrayList<>();
        }
        this.inputTypes.add(inputTypesItem);
        return this;
    }

    public DeploymentConstraintsDto withInputTypes(Consumer<List<String>> inputTypesSetter) {
        if (this.inputTypes == null) {
            this.inputTypes = new ArrayList<>();
        }
        inputTypesSetter.accept(this.inputTypes);
        return this;
    }

    /**
     * 支持的输入类型，列表元素取值为“OBS”、“URL”、“Restful”、“VCN”、“EdgeCamera”
     * @return inputTypes
     */
    public List<String> getInputTypes() {
        return inputTypes;
    }

    public void setInputTypes(List<String> inputTypes) {
        this.inputTypes = inputTypes;
    }

    public DeploymentConstraintsDto withOutputTypes(List<String> outputTypes) {
        this.outputTypes = outputTypes;
        return this;
    }

    public DeploymentConstraintsDto addOutputTypesItem(String outputTypesItem) {
        if (this.outputTypes == null) {
            this.outputTypes = new ArrayList<>();
        }
        this.outputTypes.add(outputTypesItem);
        return this;
    }

    public DeploymentConstraintsDto withOutputTypes(Consumer<List<String>> outputTypesSetter) {
        if (this.outputTypes == null) {
            this.outputTypes = new ArrayList<>();
        }
        outputTypesSetter.accept(this.outputTypes);
        return this;
    }

    /**
     * 支持的输出类型，列表元素取值为“OBS”、“DIS”或者“Webhook”
     * @return outputTypes
     */
    public List<String> getOutputTypes() {
        return outputTypes;
    }

    public void setOutputTypes(List<String> outputTypes) {
        this.outputTypes = outputTypes;
    }

    public DeploymentConstraintsDto withServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    /**
     * 服务启动参数
     * @return serviceConfig
     */
    public String getServiceConfig() {
        return serviceConfig;
    }

    public void setServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    public DeploymentConstraintsDto withTaskConfig(String taskConfig) {
        this.taskConfig = taskConfig;
        return this;
    }

    /**
     * 作业配置参数
     * @return taskConfig
     */
    public String getTaskConfig() {
        return taskConfig;
    }

    public void setTaskConfig(String taskConfig) {
        this.taskConfig = taskConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeploymentConstraintsDto that = (DeploymentConstraintsDto) obj;
        return Objects.equals(this.requestMode, that.requestMode) && Objects.equals(this.cpuType, that.cpuType)
            && Objects.equals(this.accelerators, that.accelerators) && Objects.equals(this.inputTypes, that.inputTypes)
            && Objects.equals(this.outputTypes, that.outputTypes)
            && Objects.equals(this.serviceConfig, that.serviceConfig)
            && Objects.equals(this.taskConfig, that.taskConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestMode, cpuType, accelerators, inputTypes, outputTypes, serviceConfig, taskConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentConstraintsDto {\n");
        sb.append("    requestMode: ").append(toIndentedString(requestMode)).append("\n");
        sb.append("    cpuType: ").append(toIndentedString(cpuType)).append("\n");
        sb.append("    accelerators: ").append(toIndentedString(accelerators)).append("\n");
        sb.append("    inputTypes: ").append(toIndentedString(inputTypes)).append("\n");
        sb.append("    outputTypes: ").append(toIndentedString(outputTypes)).append("\n");
        sb.append("    serviceConfig: ").append(toIndentedString(serviceConfig)).append("\n");
        sb.append("    taskConfig: ").append(toIndentedString(taskConfig)).append("\n");
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
