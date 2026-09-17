package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InPlaceMigratetoNodesSpec
 */
public class InPlaceMigratetoNodesSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<InplaceMigrateNodeItem> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataDiskCleanUpOption")

    private DataDiskCleanUpOption dataDiskCleanUpOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private InPlaceMigrateNodeExtendParam extendParam;

    public InPlaceMigratetoNodesSpec withNodes(List<InplaceMigrateNodeItem> nodes) {
        this.nodes = nodes;
        return this;
    }

    public InPlaceMigratetoNodesSpec addNodesItem(InplaceMigrateNodeItem nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public InPlaceMigratetoNodesSpec withNodes(Consumer<List<InplaceMigrateNodeItem>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**： 腾挪节点列表 **约束限制**： 不涉及 
     * @return nodes
     */
    public List<InplaceMigrateNodeItem> getNodes() {
        return nodes;
    }

    public void setNodes(List<InplaceMigrateNodeItem> nodes) {
        this.nodes = nodes;
    }

    public InPlaceMigratetoNodesSpec withDataDiskCleanUpOption(DataDiskCleanUpOption dataDiskCleanUpOption) {
        this.dataDiskCleanUpOption = dataDiskCleanUpOption;
        return this;
    }

    public InPlaceMigratetoNodesSpec withDataDiskCleanUpOption(
        Consumer<DataDiskCleanUpOption> dataDiskCleanUpOptionSetter) {
        if (this.dataDiskCleanUpOption == null) {
            this.dataDiskCleanUpOption = new DataDiskCleanUpOption();
            dataDiskCleanUpOptionSetter.accept(this.dataDiskCleanUpOption);
        }

        return this;
    }

    /**
     * Get dataDiskCleanUpOption
     * @return dataDiskCleanUpOption
     */
    public DataDiskCleanUpOption getDataDiskCleanUpOption() {
        return dataDiskCleanUpOption;
    }

    public void setDataDiskCleanUpOption(DataDiskCleanUpOption dataDiskCleanUpOption) {
        this.dataDiskCleanUpOption = dataDiskCleanUpOption;
    }

    public InPlaceMigratetoNodesSpec withExtendParam(InPlaceMigrateNodeExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public InPlaceMigratetoNodesSpec withExtendParam(Consumer<InPlaceMigrateNodeExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new InPlaceMigrateNodeExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public InPlaceMigrateNodeExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(InPlaceMigrateNodeExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InPlaceMigratetoNodesSpec that = (InPlaceMigratetoNodesSpec) obj;
        return Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.dataDiskCleanUpOption, that.dataDiskCleanUpOption)
            && Objects.equals(this.extendParam, that.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes, dataDiskCleanUpOption, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InPlaceMigratetoNodesSpec {\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    dataDiskCleanUpOption: ").append(toIndentedString(dataDiskCleanUpOption)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
