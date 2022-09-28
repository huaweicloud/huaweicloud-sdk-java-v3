package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_name")

    private String sourceProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_resource_id")

    private String sourceResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_labels")

    private List<String> nodeLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    public ShowAppResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowAppResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowAppResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 应用版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowAppResponse withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * 应用短描述
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ShowAppResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowAppResponse withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ShowAppResponse addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ShowAppResponse withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 应用标签
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public ShowAppResponse withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 应用镜像
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ShowAppResponse withCommands(List<String> commands) {
        this.commands = commands;
        return this;
    }

    public ShowAppResponse addCommandsItem(String commandsItem) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        this.commands.add(commandsItem);
        return this;
    }

    public ShowAppResponse withCommands(Consumer<List<String>> commandsSetter) {
        if (this.commands == null) {
            this.commands = new ArrayList<>();
        }
        commandsSetter.accept(this.commands);
        return this;
    }

    /**
     * 应用命令
     * @return commands
     */
    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public ShowAppResponse withResources(ResourceDto resources) {
        this.resources = resources;
        return this;
    }

    public ShowAppResponse withResources(Consumer<ResourceDto> resourcesSetter) {
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

    public ShowAppResponse withInputs(List<AppInputParameterDto> inputs) {
        this.inputs = inputs;
        return this;
    }

    public ShowAppResponse addInputsItem(AppInputParameterDto inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public ShowAppResponse withInputs(Consumer<List<AppInputParameterDto>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 应用的输入参数信息
     * @return inputs
     */
    public List<AppInputParameterDto> getInputs() {
        return inputs;
    }

    public void setInputs(List<AppInputParameterDto> inputs) {
        this.inputs = inputs;
    }

    public ShowAppResponse withOutputs(List<AppOutputParameterDto> outputs) {
        this.outputs = outputs;
        return this;
    }

    public ShowAppResponse addOutputsItem(AppOutputParameterDto outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public ShowAppResponse withOutputs(Consumer<List<AppOutputParameterDto>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * 应用的输出参数信息
     * @return outputs
     */
    public List<AppOutputParameterDto> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<AppOutputParameterDto> outputs) {
        this.outputs = outputs;
    }

    public ShowAppResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建应用时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowAppResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新应用时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowAppResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 创建应用的用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowAppResponse withSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
        return this;
    }

    /**
     * 源项目名称
     * @return sourceProjectName
     */
    public String getSourceProjectName() {
        return sourceProjectName;
    }

    public void setSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
    }

    public ShowAppResponse withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * 源资源id
     * @return sourceResourceId
     */
    public String getSourceResourceId() {
        return sourceResourceId;
    }

    public void setSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
    }

    public ShowAppResponse withNodeLabels(List<String> nodeLabels) {
        this.nodeLabels = nodeLabels;
        return this;
    }

    public ShowAppResponse addNodeLabelsItem(String nodeLabelsItem) {
        if (this.nodeLabels == null) {
            this.nodeLabels = new ArrayList<>();
        }
        this.nodeLabels.add(nodeLabelsItem);
        return this;
    }

    public ShowAppResponse withNodeLabels(Consumer<List<String>> nodeLabelsSetter) {
        if (this.nodeLabels == null) {
            this.nodeLabels = new ArrayList<>();
        }
        nodeLabelsSetter.accept(this.nodeLabels);
        return this;
    }

    /**
     * 节点标签
     * @return nodeLabels
     */
    public List<String> getNodeLabels() {
        return nodeLabels;
    }

    public void setNodeLabels(List<String> nodeLabels) {
        this.nodeLabels = nodeLabels;
    }

    public ShowAppResponse withIcon(String icon) {
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
        ShowAppResponse showAppResponse = (ShowAppResponse) o;
        return Objects.equals(this.id, showAppResponse.id) && Objects.equals(this.name, showAppResponse.name)
            && Objects.equals(this.version, showAppResponse.version)
            && Objects.equals(this.summary, showAppResponse.summary)
            && Objects.equals(this.description, showAppResponse.description)
            && Objects.equals(this.labels, showAppResponse.labels) && Objects.equals(this.image, showAppResponse.image)
            && Objects.equals(this.commands, showAppResponse.commands)
            && Objects.equals(this.resources, showAppResponse.resources)
            && Objects.equals(this.inputs, showAppResponse.inputs)
            && Objects.equals(this.outputs, showAppResponse.outputs)
            && Objects.equals(this.createTime, showAppResponse.createTime)
            && Objects.equals(this.updateTime, showAppResponse.updateTime)
            && Objects.equals(this.userName, showAppResponse.userName)
            && Objects.equals(this.sourceProjectName, showAppResponse.sourceProjectName)
            && Objects.equals(this.sourceResourceId, showAppResponse.sourceResourceId)
            && Objects.equals(this.nodeLabels, showAppResponse.nodeLabels)
            && Objects.equals(this.icon, showAppResponse.icon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            version,
            summary,
            description,
            labels,
            image,
            commands,
            resources,
            inputs,
            outputs,
            createTime,
            updateTime,
            userName,
            sourceProjectName,
            sourceResourceId,
            nodeLabels,
            icon);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    sourceProjectName: ").append(toIndentedString(sourceProjectName)).append("\n");
        sb.append("    sourceResourceId: ").append(toIndentedString(sourceResourceId)).append("\n");
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
