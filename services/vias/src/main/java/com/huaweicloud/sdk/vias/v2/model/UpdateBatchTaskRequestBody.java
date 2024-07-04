package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateBatchTaskRequestBody
 */
public class UpdateBatchTaskRequestBody {

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
    @JsonProperty(value = "is_saved_as_template")

    private Boolean isSavedAsTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_order_id")

    private String resourceOrderId;

    public UpdateBatchTaskRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务的名称，必填。仅能包含汉字、字母、数字、中划线和下划线，长度介于1~100之间
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateBatchTaskRequestBody withDescription(String description) {
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

    public UpdateBatchTaskRequestBody withSchedule(TaskSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public UpdateBatchTaskRequestBody withSchedule(Consumer<TaskSchedule> scheduleSetter) {
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

    public UpdateBatchTaskRequestBody withBatchInput(BatchTaskInputDto batchInput) {
        this.batchInput = batchInput;
        return this;
    }

    public UpdateBatchTaskRequestBody withBatchInput(Consumer<BatchTaskInputDto> batchInputSetter) {
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

    public UpdateBatchTaskRequestBody withOutput(TaskOutput output) {
        this.output = output;
        return this;
    }

    public UpdateBatchTaskRequestBody withOutput(Consumer<TaskOutput> outputSetter) {
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

    public UpdateBatchTaskRequestBody withConfig(TaskServiceConfig config) {
        this.config = config;
        return this;
    }

    public UpdateBatchTaskRequestBody withConfig(Consumer<TaskServiceConfig> configSetter) {
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

    public UpdateBatchTaskRequestBody withIsSavedAsTemplate(Boolean isSavedAsTemplate) {
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

    public UpdateBatchTaskRequestBody withResourceOrderId(String resourceOrderId) {
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
        UpdateBatchTaskRequestBody that = (UpdateBatchTaskRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.batchInput, that.batchInput)
            && Objects.equals(this.output, that.output) && Objects.equals(this.config, that.config)
            && Objects.equals(this.isSavedAsTemplate, that.isSavedAsTemplate)
            && Objects.equals(this.resourceOrderId, that.resourceOrderId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, schedule, batchInput, output, config, isSavedAsTemplate, resourceOrderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBatchTaskRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    batchInput: ").append(toIndentedString(batchInput)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
