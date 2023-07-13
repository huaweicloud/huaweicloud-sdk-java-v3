package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * JobTaskDto
 */
public class JobTaskDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<TaskParameterDto> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private TaskResourceDto resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_acc_type")

    private String ioAccType;

    public JobTaskDto withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 子任务实际名称，取值范围[1,32]，只能以大小写字母开头，由大小写字母、数字、中划线（-）、下划线（_）组成，以大小写字符或数字结尾。需要和已有子任务的名称一致。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public JobTaskDto withInputs(List<TaskParameterDto> inputs) {
        this.inputs = inputs;
        return this;
    }

    public JobTaskDto addInputsItem(TaskParameterDto inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public JobTaskDto withInputs(Consumer<List<TaskParameterDto>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 任务的输入参数信息
     * @return inputs
     */
    public List<TaskParameterDto> getInputs() {
        return inputs;
    }

    public void setInputs(List<TaskParameterDto> inputs) {
        this.inputs = inputs;
    }

    public JobTaskDto withResources(TaskResourceDto resources) {
        this.resources = resources;
        return this;
    }

    public JobTaskDto withResources(Consumer<TaskResourceDto> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new TaskResourceDto();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public TaskResourceDto getResources() {
        return resources;
    }

    public void setResources(TaskResourceDto resources) {
        this.resources = resources;
    }

    public JobTaskDto withIoAccType(String ioAccType) {
        this.ioAccType = ioAccType;
        return this;
    }

    /**
     * 子任务使用的IO加速实例类型，不填表示不使用；
     * @return ioAccType
     */
    public String getIoAccType() {
        return ioAccType;
    }

    public void setIoAccType(String ioAccType) {
        this.ioAccType = ioAccType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobTaskDto that = (JobTaskDto) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.inputs, that.inputs)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.ioAccType, that.ioAccType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, inputs, resources, ioAccType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobTaskDto {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    ioAccType: ").append(toIndentedString(ioAccType)).append("\n");
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
