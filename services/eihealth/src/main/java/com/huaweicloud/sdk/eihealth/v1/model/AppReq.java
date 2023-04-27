package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用请求体
 */
public class AppReq {

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
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commands")

    private List<String> commands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private ResourceDto resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<AppInputParameterDto> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<AppOutputParameterDto> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_labels")

    private List<String> nodeLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    public AppReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称 目标应用名称 取值范围：长度为[1,56]，以大小写字母开头，允许出现中划线(-)、下划线(_)、小写字母和数字，且必须以大小写字母或数字结尾。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppReq withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 应用版本 取值范围：[1,24]，以小写字母或数字或大写字母开头，允许出现中划线，必须以小写字母或数字或大写字母结尾。更新应用时，应用版本不支持修改。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AppReq withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * 应用简述 取值范围[0,128]
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public AppReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用描述 取值范围[0,65535]，后续支持markdown文本
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppReq withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public AppReq addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public AppReq withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 应用标签 取值范围[0,5]，单个标签最大长度32字符，支持中文、字母、数字、空格、下划线和中划线，且不能以空格开头或者结尾。
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public AppReq withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * docker镜像地址 取值范围[5-255]，不能包含中文字符
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public AppReq withCommands(List<String> commands) {
        this.commands = commands;
        return this;
    }

    public AppReq addCommandsItem(String commandsItem) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        this.commands.add(commandsItem);
        return this;
    }

    public AppReq withCommands(Consumer<List<String>> commandsSetter) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        commandsSetter.accept(this.commands);
        return this;
    }

    /**
     * docker启动时执行命令 取值范围[1-300]，单个命令长度取值范围[0-256]，不能包含中文字符
     * @return commands
     */
    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public AppReq withResources(ResourceDto resources) {
        this.resources = resources;
        return this;
    }

    public AppReq withResources(Consumer<ResourceDto> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ResourceDto();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public ResourceDto getResources() {
        return resources;
    }

    public void setResources(ResourceDto resources) {
        this.resources = resources;
    }

    public AppReq withInputs(List<AppInputParameterDto> inputs) {
        this.inputs = inputs;
        return this;
    }

    public AppReq addInputsItem(AppInputParameterDto inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public AppReq withInputs(Consumer<List<AppInputParameterDto>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 应用的输入参数列表
     * @return inputs
     */
    public List<AppInputParameterDto> getInputs() {
        return inputs;
    }

    public void setInputs(List<AppInputParameterDto> inputs) {
        this.inputs = inputs;
    }

    public AppReq withOutputs(List<AppOutputParameterDto> outputs) {
        this.outputs = outputs;
        return this;
    }

    public AppReq addOutputsItem(AppOutputParameterDto outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public AppReq withOutputs(Consumer<List<AppOutputParameterDto>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * 应用的输出参数列表
     * @return outputs
     */
    public List<AppOutputParameterDto> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<AppOutputParameterDto> outputs) {
        this.outputs = outputs;
    }

    public AppReq withNodeLabels(List<String> nodeLabels) {
        this.nodeLabels = nodeLabels;
        return this;
    }

    public AppReq addNodeLabelsItem(String nodeLabelsItem) {
        if (this.nodeLabels == null) {
            this.nodeLabels = new ArrayList<>();
        }
        this.nodeLabels.add(nodeLabelsItem);
        return this;
    }

    public AppReq withNodeLabels(Consumer<List<String>> nodeLabelsSetter) {
        if (this.nodeLabels == null) {
            this.nodeLabels = new ArrayList<>();
        }
        nodeLabelsSetter.accept(this.nodeLabels);
        return this;
    }

    /**
     * 节点标签 取值范围[0,1]，单个标签最大长度63字符
     * @return nodeLabels
     */
    public List<String> getNodeLabels() {
        return nodeLabels;
    }

    public void setNodeLabels(List<String> nodeLabels) {
        this.nodeLabels = nodeLabels;
    }

    public AppReq withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 图标base64编码
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppReq appReq = (AppReq) o;
        return Objects.equals(this.name, appReq.name) && Objects.equals(this.version, appReq.version)
            && Objects.equals(this.summary, appReq.summary) && Objects.equals(this.description, appReq.description)
            && Objects.equals(this.labels, appReq.labels) && Objects.equals(this.image, appReq.image)
            && Objects.equals(this.commands, appReq.commands) && Objects.equals(this.resources, appReq.resources)
            && Objects.equals(this.inputs, appReq.inputs) && Objects.equals(this.outputs, appReq.outputs)
            && Objects.equals(this.nodeLabels, appReq.nodeLabels) && Objects.equals(this.icon, appReq.icon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            version,
            summary,
            description,
            labels,
            image,
            commands,
            resources,
            inputs,
            outputs,
            nodeLabels,
            icon);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    nodeLabels: ").append(toIndentedString(nodeLabels)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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
