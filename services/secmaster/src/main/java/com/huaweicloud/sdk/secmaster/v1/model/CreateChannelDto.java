package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateChannelDto
 */
public class CreateChannelDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ChannelAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private List<CreateModuleVo> input = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<NodeVo> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private List<CreateModuleVo> output = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parser_id")

    private String parserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    public CreateChannelDto withAction(ChannelAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    public ChannelAction getAction() {
        return action;
    }

    public void setAction(ChannelAction action) {
        this.action = action;
    }

    public CreateChannelDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateChannelDto withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * UUID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public CreateChannelDto withInput(List<CreateModuleVo> input) {
        this.input = input;
        return this;
    }

    public CreateChannelDto addInputItem(CreateModuleVo inputItem) {
        if (this.input == null) {
            this.input = new ArrayList<>();
        }
        this.input.add(inputItem);
        return this;
    }

    public CreateChannelDto withInput(Consumer<List<CreateModuleVo>> inputSetter) {
        if (this.input == null) {
            this.input = new ArrayList<>();
        }
        inputSetter.accept(this.input);
        return this;
    }

    /**
     * 相关描述信息
     * @return input
     */
    public List<CreateModuleVo> getInput() {
        return input;
    }

    public void setInput(List<CreateModuleVo> input) {
        this.input = input;
    }

    public CreateChannelDto withNodes(List<NodeVo> nodes) {
        this.nodes = nodes;
        return this;
    }

    public CreateChannelDto addNodesItem(NodeVo nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public CreateChannelDto withNodes(Consumer<List<NodeVo>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 相关描述信息
     * @return nodes
     */
    public List<NodeVo> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodeVo> nodes) {
        this.nodes = nodes;
    }

    public CreateChannelDto withOutput(List<CreateModuleVo> output) {
        this.output = output;
        return this;
    }

    public CreateChannelDto addOutputItem(CreateModuleVo outputItem) {
        if (this.output == null) {
            this.output = new ArrayList<>();
        }
        this.output.add(outputItem);
        return this;
    }

    public CreateChannelDto withOutput(Consumer<List<CreateModuleVo>> outputSetter) {
        if (this.output == null) {
            this.output = new ArrayList<>();
        }
        outputSetter.accept(this.output);
        return this;
    }

    /**
     * 相关描述信息
     * @return output
     */
    public List<CreateModuleVo> getOutput() {
        return output;
    }

    public void setOutput(List<CreateModuleVo> output) {
        this.output = output;
    }

    public CreateChannelDto withParserId(String parserId) {
        this.parserId = parserId;
        return this;
    }

    /**
     * UUID
     * @return parserId
     */
    public String getParserId() {
        return parserId;
    }

    public void setParserId(String parserId) {
        this.parserId = parserId;
    }

    public CreateChannelDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 相关标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateChannelDto that = (CreateChannelDto) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.description, that.description)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.input, that.input)
            && Objects.equals(this.nodes, that.nodes) && Objects.equals(this.output, that.output)
            && Objects.equals(this.parserId, that.parserId) && Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, description, groupId, input, nodes, output, parserId, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChannelDto {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    parserId: ").append(toIndentedString(parserId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
