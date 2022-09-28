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
     * 子任务的输出存放路径，用户可显示指定;必须以/开头，结尾不能有/.;不能包含以下特殊字符\\:*?<\">|。
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskDto taskDto = (TaskDto) o;
        return Objects.equals(this.taskName, taskDto.taskName) && Objects.equals(this.appId, taskDto.appId)
            && Objects.equals(this.displayName, taskDto.displayName)
            && Objects.equals(this.outputDir, taskDto.outputDir) && Objects.equals(this.resources, taskDto.resources)
            && Objects.equals(this.location, taskDto.location) && Objects.equals(this.inputs, taskDto.inputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, appId, displayName, outputDir, resources, location, inputs);
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
