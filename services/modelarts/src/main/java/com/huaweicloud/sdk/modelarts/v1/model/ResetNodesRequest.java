package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResetNodesRequest
 */
public class ResetNodesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeNames")

    private List<String> nodeNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollingConfig")

    private ResetNodesRequestRollingConfig rollingConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeConfig")

    private ResetNodesRequestNodeConfig nodeConfig;

    public ResetNodesRequest withNodeNames(List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }

    public ResetNodesRequest addNodeNamesItem(String nodeNamesItem) {
        if (this.nodeNames == null) {
            this.nodeNames = new ArrayList<>();
        }
        this.nodeNames.add(nodeNamesItem);
        return this;
    }

    public ResetNodesRequest withNodeNames(Consumer<List<String>> nodeNamesSetter) {
        if (this.nodeNames == null) {
            this.nodeNames = new ArrayList<>();
        }
        nodeNamesSetter.accept(this.nodeNames);
        return this;
    }

    /**
     * **参数解释**：需要重置的节点名称列表。 **约束限制**：不涉及。
     * @return nodeNames
     */
    public List<String> getNodeNames() {
        return nodeNames;
    }

    public void setNodeNames(List<String> nodeNames) {
        this.nodeNames = nodeNames;
    }

    public ResetNodesRequest withRollingConfig(ResetNodesRequestRollingConfig rollingConfig) {
        this.rollingConfig = rollingConfig;
        return this;
    }

    public ResetNodesRequest withRollingConfig(Consumer<ResetNodesRequestRollingConfig> rollingConfigSetter) {
        if (this.rollingConfig == null) {
            this.rollingConfig = new ResetNodesRequestRollingConfig();
            rollingConfigSetter.accept(this.rollingConfig);
        }

        return this;
    }

    /**
     * Get rollingConfig
     * @return rollingConfig
     */
    public ResetNodesRequestRollingConfig getRollingConfig() {
        return rollingConfig;
    }

    public void setRollingConfig(ResetNodesRequestRollingConfig rollingConfig) {
        this.rollingConfig = rollingConfig;
    }

    public ResetNodesRequest withNodeConfig(ResetNodesRequestNodeConfig nodeConfig) {
        this.nodeConfig = nodeConfig;
        return this;
    }

    public ResetNodesRequest withNodeConfig(Consumer<ResetNodesRequestNodeConfig> nodeConfigSetter) {
        if (this.nodeConfig == null) {
            this.nodeConfig = new ResetNodesRequestNodeConfig();
            nodeConfigSetter.accept(this.nodeConfig);
        }

        return this;
    }

    /**
     * Get nodeConfig
     * @return nodeConfig
     */
    public ResetNodesRequestNodeConfig getNodeConfig() {
        return nodeConfig;
    }

    public void setNodeConfig(ResetNodesRequestNodeConfig nodeConfig) {
        this.nodeConfig = nodeConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetNodesRequest that = (ResetNodesRequest) obj;
        return Objects.equals(this.nodeNames, that.nodeNames) && Objects.equals(this.rollingConfig, that.rollingConfig)
            && Objects.equals(this.nodeConfig, that.nodeConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeNames, rollingConfig, nodeConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetNodesRequest {\n");
        sb.append("    nodeNames: ").append(toIndentedString(nodeNames)).append("\n");
        sb.append("    rollingConfig: ").append(toIndentedString(rollingConfig)).append("\n");
        sb.append("    nodeConfig: ").append(toIndentedString(nodeConfig)).append("\n");
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
