package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateBatchTasksRequestBody
 */
public class CreateBatchTasksRequestBody {

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
    @JsonProperty(value = "batch_input")

    private BatchTaskInputDto batchInput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private TaskOutput output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private TaskServiceConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_version")

    private String serviceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_saved_as_template")

    private Boolean isSavedAsTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_order_id")

    private String resourceOrderId;

    public CreateBatchTasksRequestBody withName(String name) {
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

    public CreateBatchTasksRequestBody withDescription(String description) {
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

    public CreateBatchTasksRequestBody withSchedule(TaskSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public CreateBatchTasksRequestBody withSchedule(Consumer<TaskSchedule> scheduleSetter) {
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

    public CreateBatchTasksRequestBody withBatchInput(BatchTaskInputDto batchInput) {
        this.batchInput = batchInput;
        return this;
    }

    public CreateBatchTasksRequestBody withBatchInput(Consumer<BatchTaskInputDto> batchInputSetter) {
        if (this.batchInput == null) {
            this.batchInput = new BatchTaskInputDto();
            batchInputSetter.accept(this.batchInput);
        }

        return this;
    }

    /**
     * Get batchInput
     * @return batchInput
     */
    public BatchTaskInputDto getBatchInput() {
        return batchInput;
    }

    public void setBatchInput(BatchTaskInputDto batchInput) {
        this.batchInput = batchInput;
    }

    public CreateBatchTasksRequestBody withOutput(TaskOutput output) {
        this.output = output;
        return this;
    }

    public CreateBatchTasksRequestBody withOutput(Consumer<TaskOutput> outputSetter) {
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

    public CreateBatchTasksRequestBody withConfig(TaskServiceConfig config) {
        this.config = config;
        return this;
    }

    public CreateBatchTasksRequestBody withConfig(Consumer<TaskServiceConfig> configSetter) {
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

    public CreateBatchTasksRequestBody withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 算法api标识，需要满足正则：^[\\u4E00-\\u9FA5a-zA-Z0-9_-]{1,100}$。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public CreateBatchTasksRequestBody withServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /**
     * 服务版本号，输入需要满足正则：^[a-z0-9\\.]{3,32}$。
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    public CreateBatchTasksRequestBody withIsSavedAsTemplate(Boolean isSavedAsTemplate) {
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

    public CreateBatchTasksRequestBody withResourceOrderId(String resourceOrderId) {
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
        CreateBatchTasksRequestBody that = (CreateBatchTasksRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.batchInput, that.batchInput)
            && Objects.equals(this.output, that.output) && Objects.equals(this.config, that.config)
            && Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.serviceVersion, that.serviceVersion)
            && Objects.equals(this.isSavedAsTemplate, that.isSavedAsTemplate)
            && Objects.equals(this.resourceOrderId, that.resourceOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            schedule,
            batchInput,
            output,
            config,
            serviceName,
            serviceVersion,
            isSavedAsTemplate,
            resourceOrderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBatchTasksRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    batchInput: ").append(toIndentedString(batchInput)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
