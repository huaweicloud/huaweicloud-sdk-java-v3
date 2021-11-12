package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** UpdateTaskRequestBody */
public class UpdateTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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

    public UpdateTaskRequestBody withName(String name) {
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

    public UpdateTaskRequestBody withDescription(String description) {
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

    public UpdateTaskRequestBody withTiming(TaskTiming timing) {
        this.timing = timing;
        return this;
    }

    public UpdateTaskRequestBody withTiming(Consumer<TaskTiming> timingSetter) {
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

    public UpdateTaskRequestBody withInput(TaskInput input) {
        this.input = input;
        return this;
    }

    public UpdateTaskRequestBody withInput(Consumer<TaskInput> inputSetter) {
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

    public UpdateTaskRequestBody withOutput(TaskOutput output) {
        this.output = output;
        return this;
    }

    public UpdateTaskRequestBody withOutput(Consumer<TaskOutput> outputSetter) {
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

    public UpdateTaskRequestBody withServiceConfig(TaskServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    public UpdateTaskRequestBody withServiceConfig(Consumer<TaskServiceConfig> serviceConfigSetter) {
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
        UpdateTaskRequestBody updateTaskRequestBody = (UpdateTaskRequestBody) o;
        return Objects.equals(this.name, updateTaskRequestBody.name)
            && Objects.equals(this.description, updateTaskRequestBody.description)
            && Objects.equals(this.timing, updateTaskRequestBody.timing)
            && Objects.equals(this.input, updateTaskRequestBody.input)
            && Objects.equals(this.output, updateTaskRequestBody.output)
            && Objects.equals(this.serviceConfig, updateTaskRequestBody.serviceConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, timing, input, output, serviceConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
