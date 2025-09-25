package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskDto
 */
public class TaskDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_dir")

    private String outputDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private TaskResourceDto resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private VertexLocationDto location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<TaskParameterDto> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<TaskParameterDto> outputs = null;

    public TaskDto withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 子任务实际名称，取值范围[1,32]，只能以大小写字母开头，由大小写字母、数字、中划线（-）、下划线（_）组成，以大小写字符或数字结尾。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskDto withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用id，取值范围[1,135]，正则先不能有中文，两种格式。特殊id，采用{app_name}::{app_version}::{src_project_name}格式，用于手动创建场景；其他场景，app_id为系统分配的唯一标识
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public TaskDto withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 流程的子任务展示名称，最大长度64
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TaskDto withOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    /**
     * 子任务的输出存放路径，用户可显式指定;输出路径必须以斜杠（/）开头且不能以斜杠（/）结尾，不能包含两个以上相邻的斜杠（/），不能包含以下特殊字符：\\ : ; * ? < \" > | 。其中单个文件夹名称不能以中划线（-）开头，不能以英文句号（.）或斜杠（/）或空格开头或结尾
     * @return outputDir
     */
    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public TaskDto withResources(TaskResourceDto resources) {
        this.resources = resources;
        return this;
    }

    public TaskDto withResources(Consumer<TaskResourceDto> resourcesSetter) {
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

    public TaskDto withLocation(VertexLocationDto location) {
        this.location = location;
        return this;
    }

    public TaskDto withLocation(Consumer<VertexLocationDto> locationSetter) {
        if (this.location == null) {
            this.location = new VertexLocationDto();
            locationSetter.accept(this.location);
        }

        return this;
    }

    /**
     * Get location
     * @return location
     */
    public VertexLocationDto getLocation() {
        return location;
    }

    public void setLocation(VertexLocationDto location) {
        this.location = location;
    }

    public TaskDto withInputs(List<TaskParameterDto> inputs) {
        this.inputs = inputs;
        return this;
    }

    public TaskDto addInputsItem(TaskParameterDto inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public TaskDto withInputs(Consumer<List<TaskParameterDto>> inputsSetter) {
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

    public TaskDto withOutputs(List<TaskParameterDto> outputs) {
        this.outputs = outputs;
        return this;
    }

    public TaskDto addOutputsItem(TaskParameterDto outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public TaskDto withOutputs(Consumer<List<TaskParameterDto>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * **参数解释**： 任务的输出参数信息。 **约束限制**： 最多支持128个参数。 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return outputs
     */
    public List<TaskParameterDto> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<TaskParameterDto> outputs) {
        this.outputs = outputs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskDto that = (TaskDto) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.outputDir, that.outputDir)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.location, that.location)
            && Objects.equals(this.inputs, that.inputs) && Objects.equals(this.outputs, that.outputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, appId, displayName, outputDir, resources, location, inputs, outputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskDto {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    outputDir: ").append(toIndentedString(outputDir)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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
