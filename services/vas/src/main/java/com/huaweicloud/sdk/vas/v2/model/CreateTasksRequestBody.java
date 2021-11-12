package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** CreateTasksRequestBody */
public class CreateTasksRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_version")

    private String serviceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_pool_id")

    private String edgePoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_order_id")

    private String resourceOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timing")

    private TaskTiming timing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private TaskInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private TaskOutput output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_config")

    private TaskServiceConfig serviceConfig;

    public CreateTasksRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 作业的名称，必填。仅能包含汉字、字母、数字、中划线和下划线，长度介于1~100之间。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateTasksRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 作业的描述，选填。长度不超过500。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateTasksRequestBody withServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /** 作业对应服务的版本号，必填。由两个介于0~999的整数和一个点号分隔符组成。
     * 
     * @return serviceVersion */
    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public CreateTasksRequestBody withEdgePoolId(String edgePoolId) {
        this.edgePoolId = edgePoolId;
        return this;
    }

    /** 作业运行指定的边缘运行池ID，仅边缘场景需填且必填。
     * 
     * @return edgePoolId */
    public String getEdgePoolId() {
        return edgePoolId;
    }

    public void setEdgePoolId(String edgePoolId) {
        this.edgePoolId = edgePoolId;
    }

    public CreateTasksRequestBody withResourceOrderId(String resourceOrderId) {
        this.resourceOrderId = resourceOrderId;
        return this;
    }

    /** 作业指定的算法能力包包周期订单ID，仅部分服务需填且必填。
     * 
     * @return resourceOrderId */
    public String getResourceOrderId() {
        return resourceOrderId;
    }

    public void setResourceOrderId(String resourceOrderId) {
        this.resourceOrderId = resourceOrderId;
    }

    public CreateTasksRequestBody withTiming(TaskTiming timing) {
        this.timing = timing;
        return this;
    }

    public CreateTasksRequestBody withTiming(Consumer<TaskTiming> timingSetter) {
        if (this.timing == null) {
            this.timing = new TaskTiming();
            timingSetter.accept(this.timing);
        }

        return this;
    }

    /** Get timing
     * 
     * @return timing */
    public TaskTiming getTiming() {
        return timing;
    }

    public void setTiming(TaskTiming timing) {
        this.timing = timing;
    }

    public CreateTasksRequestBody withInput(TaskInput input) {
        this.input = input;
        return this;
    }

    public CreateTasksRequestBody withInput(Consumer<TaskInput> inputSetter) {
        if (this.input == null) {
            this.input = new TaskInput();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /** Get input
     * 
     * @return input */
    public TaskInput getInput() {
        return input;
    }

    public void setInput(TaskInput input) {
        this.input = input;
    }

    public CreateTasksRequestBody withOutput(TaskOutput output) {
        this.output = output;
        return this;
    }

    public CreateTasksRequestBody withOutput(Consumer<TaskOutput> outputSetter) {
        if (this.output == null) {
            this.output = new TaskOutput();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /** Get output
     * 
     * @return output */
    public TaskOutput getOutput() {
        return output;
    }

    public void setOutput(TaskOutput output) {
        this.output = output;
    }

    public CreateTasksRequestBody withServiceConfig(TaskServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    public CreateTasksRequestBody withServiceConfig(Consumer<TaskServiceConfig> serviceConfigSetter) {
        if (this.serviceConfig == null) {
            this.serviceConfig = new TaskServiceConfig();
            serviceConfigSetter.accept(this.serviceConfig);
        }

        return this;
    }

    /** Get serviceConfig
     * 
     * @return serviceConfig */
    public TaskServiceConfig getServiceConfig() {
        return serviceConfig;
    }

    public void setServiceConfig(TaskServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTasksRequestBody createTasksRequestBody = (CreateTasksRequestBody) o;
        return Objects.equals(this.name, createTasksRequestBody.name)
            && Objects.equals(this.description, createTasksRequestBody.description)
            && Objects.equals(this.serviceVersion, createTasksRequestBody.serviceVersion)
            && Objects.equals(this.edgePoolId, createTasksRequestBody.edgePoolId)
            && Objects.equals(this.resourceOrderId, createTasksRequestBody.resourceOrderId)
            && Objects.equals(this.timing, createTasksRequestBody.timing)
            && Objects.equals(this.input, createTasksRequestBody.input)
            && Objects.equals(this.output, createTasksRequestBody.output)
            && Objects.equals(this.serviceConfig, createTasksRequestBody.serviceConfig);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, serviceVersion, edgePoolId, resourceOrderId, timing, input, output, serviceConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTasksRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
        sb.append("    edgePoolId: ").append(toIndentedString(edgePoolId)).append("\n");
        sb.append("    resourceOrderId: ").append(toIndentedString(resourceOrderId)).append("\n");
        sb.append("    timing: ").append(toIndentedString(timing)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    serviceConfig: ").append(toIndentedString(serviceConfig)).append("\n");
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
