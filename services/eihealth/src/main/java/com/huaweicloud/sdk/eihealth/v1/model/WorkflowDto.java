package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流程请求体
 */
public class WorkflowDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private String summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_dir")

    private String outputDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<TaskDto> tasks = null;

    public WorkflowDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流程名称，取值范围[1,56]，允许大小写字母、数字、以及特殊字符中划线(-)和下划线(_)。更新流程时，流程名称不支持修改。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkflowDto withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 流程版本，取值范围[1,24]，以小写字母或数字或大写字母开头，允许出现中划线，必须以小写字母或数字或大写字母结尾。更新流程时，流程版本不支持修改。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public WorkflowDto withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * 流程简述 取值范围[0,128]
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public WorkflowDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 流程描述 取值范围[0,65535]，后续支持markdown文本
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkflowDto withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public WorkflowDto addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public WorkflowDto withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 流程标签，取值范围[0,5]，单个标签最大长度32字符，仅包含小写字母或数字或大写字母
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public WorkflowDto withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 流程超时时间，取值范围[1,144000]，单位分钟，默认1440
     * minimum: 1
     * maximum: 144000
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public WorkflowDto withOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    /**
     * 流程的当前工作目录，默认为根目录，用户可显式指定;输出路径必须以斜杠（/）开头且不能以斜杠（/）结尾，不能包含两个以上相邻的斜杠（/），不能包含以下特殊字符：\\ : ; * ? < \" > | 。其中单个文件夹名称不能以中划线（-）开头，不能以英文句号（.）或斜杠（/）或空格开头或结尾
     * @return outputDir
     */
    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public WorkflowDto withTasks(List<TaskDto> tasks) {
        this.tasks = tasks;
        return this;
    }

    public WorkflowDto addTasksItem(TaskDto tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public WorkflowDto withTasks(Consumer<List<TaskDto>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 流程中子任务的描述信息，子任务数量取值范围:[1,64]
     * @return tasks
     */
    public List<TaskDto> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskDto> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowDto workflowDto = (WorkflowDto) o;
        return Objects.equals(this.name, workflowDto.name) && Objects.equals(this.version, workflowDto.version)
            && Objects.equals(this.summary, workflowDto.summary)
            && Objects.equals(this.description, workflowDto.description)
            && Objects.equals(this.labels, workflowDto.labels) && Objects.equals(this.timeout, workflowDto.timeout)
            && Objects.equals(this.outputDir, workflowDto.outputDir) && Objects.equals(this.tasks, workflowDto.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, summary, description, labels, timeout, outputDir, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    outputDir: ").append(toIndentedString(outputDir)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
