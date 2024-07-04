package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTasksRequestBody
 */
public class CreateTasksRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private TaskSchedule schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private TaskInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private TaskOutput output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private TaskServiceConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_version")

    private String serviceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_saved_as_template")

    private Boolean isSavedAsTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_order_id")

    private String resourceOrderId;

    public CreateTasksRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称，只能由中文、字母（a～z A～Z）、数字（0～9）、中划线（-）、下划线（_）组成，长度范围为[1，100]
     * @return name
     */
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

    /**
     * 任务的描述，选填。长度不超过500
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateTasksRequestBody withSchedule(TaskSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public CreateTasksRequestBody withSchedule(Consumer<TaskSchedule> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new TaskSchedule();
            scheduleSetter.accept(this.schedule);
        }

        return this;
    }

    /**
     * Get schedule
     * @return schedule
     */
    public TaskSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(TaskSchedule schedule) {
        this.schedule = schedule;
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

    /**
     * Get input
     * @return input
     */
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

    /**
     * Get output
     * @return output
     */
    public TaskOutput getOutput() {
        return output;
    }

    public void setOutput(TaskOutput output) {
        this.output = output;
    }

    public CreateTasksRequestBody withConfig(TaskServiceConfig config) {
        this.config = config;
        return this;
    }

    public CreateTasksRequestBody withConfig(Consumer<TaskServiceConfig> configSetter) {
        if (this.config == null) {
            this.config = new TaskServiceConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public TaskServiceConfig getConfig() {
        return config;
    }

    public void setConfig(TaskServiceConfig config) {
        this.config = config;
    }

    public CreateTasksRequestBody withServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /**
     * 服务版本号，需要满足正则：^[a-z0-9\\.]{3,32}$
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public CreateTasksRequestBody withIsSavedAsTemplate(Boolean isSavedAsTemplate) {
        this.isSavedAsTemplate = isSavedAsTemplate;
        return this;
    }

    /**
     * 是否保存为模板
     * @return isSavedAsTemplate
     */
    public Boolean getIsSavedAsTemplate() {
        return isSavedAsTemplate;
    }

    public void setIsSavedAsTemplate(Boolean isSavedAsTemplate) {
        this.isSavedAsTemplate = isSavedAsTemplate;
    }

    public CreateTasksRequestBody withResourceOrderId(String resourceOrderId) {
        this.resourceOrderId = resourceOrderId;
        return this;
    }

    /**
     * 资源订单id，与关联算法挂钩。非商用白名单的算法 就不用填，商用算法就为必填项，需要满足正则表达式^[a-z0-9-_]{4,36}$。
     * @return resourceOrderId
     */
    public String getResourceOrderId() {
        return resourceOrderId;
    }

    public void setResourceOrderId(String resourceOrderId) {
        this.resourceOrderId = resourceOrderId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTasksRequestBody that = (CreateTasksRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.input, that.input)
            && Objects.equals(this.output, that.output) && Objects.equals(this.config, that.config)
            && Objects.equals(this.serviceVersion, that.serviceVersion)
            && Objects.equals(this.isSavedAsTemplate, that.isSavedAsTemplate)
            && Objects.equals(this.resourceOrderId, that.resourceOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            schedule,
            input,
            output,
            config,
            serviceVersion,
            isSavedAsTemplate,
            resourceOrderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTasksRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
        sb.append("    isSavedAsTemplate: ").append(toIndentedString(isSavedAsTemplate)).append("\n");
        sb.append("    resourceOrderId: ").append(toIndentedString(resourceOrderId)).append("\n");
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
