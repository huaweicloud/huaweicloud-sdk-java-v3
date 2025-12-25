package com.huaweicloud.sdk.secmaster.v1.model;

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
public class ShowCollectorChannelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private ChannelErrorType error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private List<ShowModuleVo> input = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<NodeVo> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_status")

    private ChannelOperationStatus operationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private List<ShowModuleVo> output = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parser_id")

    private String parserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parser_name")

    private String parserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    public ShowCollectorChannelResponse withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * Iam用户ID
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ShowCollectorChannelResponse withDescription(String description) {
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

    public ShowCollectorChannelResponse withError(ChannelErrorType error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     * @return error
     */
    public ChannelErrorType getError() {
        return error;
    }

    public void setError(ChannelErrorType error) {
        this.error = error;
    }

    public ShowCollectorChannelResponse withGroupId(String groupId) {
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

    public ShowCollectorChannelResponse withInput(List<ShowModuleVo> input) {
        this.input = input;
        return this;
    }

    public ShowCollectorChannelResponse addInputItem(ShowModuleVo inputItem) {
        if (this.input == null) {
            this.input = new ArrayList<>();
        }
        this.input.add(inputItem);
        return this;
    }

    public ShowCollectorChannelResponse withInput(Consumer<List<ShowModuleVo>> inputSetter) {
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
    public List<ShowModuleVo> getInput() {
        return input;
    }

    public void setInput(List<ShowModuleVo> input) {
        this.input = input;
    }

    public ShowCollectorChannelResponse withNodes(List<NodeVo> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ShowCollectorChannelResponse addNodesItem(NodeVo nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ShowCollectorChannelResponse withNodes(Consumer<List<NodeVo>> nodesSetter) {
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

    public ShowCollectorChannelResponse withOperationStatus(ChannelOperationStatus operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    /**
     * Get operationStatus
     * @return operationStatus
     */
    public ChannelOperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(ChannelOperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public ShowCollectorChannelResponse withOutput(List<ShowModuleVo> output) {
        this.output = output;
        return this;
    }

    public ShowCollectorChannelResponse addOutputItem(ShowModuleVo outputItem) {
        if (this.output == null) {
            this.output = new ArrayList<>();
        }
        this.output.add(outputItem);
        return this;
    }

    public ShowCollectorChannelResponse withOutput(Consumer<List<ShowModuleVo>> outputSetter) {
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
    public List<ShowModuleVo> getOutput() {
        return output;
    }

    public void setOutput(List<ShowModuleVo> output) {
        this.output = output;
    }

    public ShowCollectorChannelResponse withParserId(String parserId) {
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

    public ShowCollectorChannelResponse withParserName(String parserName) {
        this.parserName = parserName;
        return this;
    }

    /**
     * 所属租户名称
     * @return parserName
     */
    public String getParserName() {
        return parserName;
    }

    public void setParserName(String parserName) {
        this.parserName = parserName;
    }

    public ShowCollectorChannelResponse withTitle(String title) {
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
        ShowCollectorChannelResponse that = (ShowCollectorChannelResponse) obj;
        return Objects.equals(this.createBy, that.createBy) && Objects.equals(this.description, that.description)
            && Objects.equals(this.error, that.error) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.input, that.input) && Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.operationStatus, that.operationStatus) && Objects.equals(this.output, that.output)
            && Objects.equals(this.parserId, that.parserId) && Objects.equals(this.parserName, that.parserName)
            && Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createBy,
            description,
            error,
            groupId,
            input,
            nodes,
            operationStatus,
            output,
            parserId,
            parserName,
            title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCollectorChannelResponse {\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    parserId: ").append(toIndentedString(parserId)).append("\n");
        sb.append("    parserName: ").append(toIndentedString(parserName)).append("\n");
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
