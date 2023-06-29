package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskDefinitionDto
 */
public class TaskDefinitionDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_dir")

    private String outputDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whole_output_dir")

    private String wholeOutputDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_acc_type")

    private String ioAccType;

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
    @JsonProperty(value = "app_info")

    private AppInfoDto appInfo;

    public TaskDefinitionDto withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 子任务实际名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskDefinitionDto withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 流程的子任务展示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TaskDefinitionDto withOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    /**
     * 子任务的输出存放路径
     * @return outputDir
     */
    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public TaskDefinitionDto withWholeOutputDir(String wholeOutputDir) {
        this.wholeOutputDir = wholeOutputDir;
        return this;
    }

    /**
     * 子任务的完整输出路径，查看流程不会返回，查看作业时才会返回完整输出路径
     * @return wholeOutputDir
     */
    public String getWholeOutputDir() {
        return wholeOutputDir;
    }

    public void setWholeOutputDir(String wholeOutputDir) {
        this.wholeOutputDir = wholeOutputDir;
    }

    public TaskDefinitionDto withIoAccType(String ioAccType) {
        this.ioAccType = ioAccType;
        return this;
    }

    /**
     * 子任务使用的IO加速类型，不填表示不使用；
     * @return ioAccType
     */
    public String getIoAccType() {
        return ioAccType;
    }

    public void setIoAccType(String ioAccType) {
        this.ioAccType = ioAccType;
    }

    public TaskDefinitionDto withResources(TaskResourceDto resources) {
        this.resources = resources;
        return this;
    }

    public TaskDefinitionDto withResources(Consumer<TaskResourceDto> resourcesSetter) {
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

    public TaskDefinitionDto withLocation(VertexLocationDto location) {
        this.location = location;
        return this;
    }

    public TaskDefinitionDto withLocation(Consumer<VertexLocationDto> locationSetter) {
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

    public TaskDefinitionDto withInputs(List<TaskParameterDto> inputs) {
        this.inputs = inputs;
        return this;
    }

    public TaskDefinitionDto addInputsItem(TaskParameterDto inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public TaskDefinitionDto withInputs(Consumer<List<TaskParameterDto>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 子任务的输入参数信息
     * @return inputs
     */
    public List<TaskParameterDto> getInputs() {
        return inputs;
    }

    public void setInputs(List<TaskParameterDto> inputs) {
        this.inputs = inputs;
    }

    public TaskDefinitionDto withAppInfo(AppInfoDto appInfo) {
        this.appInfo = appInfo;
        return this;
    }

    public TaskDefinitionDto withAppInfo(Consumer<AppInfoDto> appInfoSetter) {
        if (this.appInfo == null) {
            this.appInfo = new AppInfoDto();
            appInfoSetter.accept(this.appInfo);
        }

        return this;
    }

    /**
     * Get appInfo
     * @return appInfo
     */
    public AppInfoDto getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(AppInfoDto appInfo) {
        this.appInfo = appInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskDefinitionDto that = (TaskDefinitionDto) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.outputDir, that.outputDir)
            && Objects.equals(this.wholeOutputDir, that.wholeOutputDir)
            && Objects.equals(this.ioAccType, that.ioAccType) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.location, that.location) && Objects.equals(this.inputs, that.inputs)
            && Objects.equals(this.appInfo, that.appInfo);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(taskName, displayName, outputDir, wholeOutputDir, ioAccType, resources, location, inputs, appInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskDefinitionDto {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    outputDir: ").append(toIndentedString(outputDir)).append("\n");
        sb.append("    wholeOutputDir: ").append(toIndentedString(wholeOutputDir)).append("\n");
        sb.append("    ioAccType: ").append(toIndentedString(ioAccType)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    appInfo: ").append(toIndentedString(appInfo)).append("\n");
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
