package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * proxy实例修改权重请求体
 */
public class TaurusModifyProxyWeightRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_weight")

    private Integer masterWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly_nodes")

    private List<ModifyProxyWeightReadonlyNode> readonlyNodes = null;

    public TaurusModifyProxyWeightRequest withMasterWeight(Integer masterWeight) {
        this.masterWeight = masterWeight;
        return this;
    }

    /**
     * 主节点权重
     * @return masterWeight
     */
    public Integer getMasterWeight() {
        return masterWeight;
    }

    public void setMasterWeight(Integer masterWeight) {
        this.masterWeight = masterWeight;
    }

    public TaurusModifyProxyWeightRequest withReadonlyNodes(List<ModifyProxyWeightReadonlyNode> readonlyNodes) {
        this.readonlyNodes = readonlyNodes;
        return this;
    }

    public TaurusModifyProxyWeightRequest addReadonlyNodesItem(ModifyProxyWeightReadonlyNode readonlyNodesItem) {
        if (this.readonlyNodes == null) {
            this.readonlyNodes = new ArrayList<>();
        }
        this.readonlyNodes.add(readonlyNodesItem);
        return this;
    }

    public TaurusModifyProxyWeightRequest withReadonlyNodes(
        Consumer<List<ModifyProxyWeightReadonlyNode>> readonlyNodesSetter) {
        if (this.readonlyNodes == null) {
            this.readonlyNodes = new ArrayList<>();
        }
        readonlyNodesSetter.accept(this.readonlyNodes);
        return this;
    }

    /**
     * 只读节点权重配置信息
     * @return readonlyNodes
     */
    public List<ModifyProxyWeightReadonlyNode> getReadonlyNodes() {
        return readonlyNodes;
    }

    public void setReadonlyNodes(List<ModifyProxyWeightReadonlyNode> readonlyNodes) {
        this.readonlyNodes = readonlyNodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaurusModifyProxyWeightRequest that = (TaurusModifyProxyWeightRequest) obj;
        return Objects.equals(this.masterWeight, that.masterWeight)
            && Objects.equals(this.readonlyNodes, that.readonlyNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masterWeight, readonlyNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaurusModifyProxyWeightRequest {\n");
        sb.append("    masterWeight: ").append(toIndentedString(masterWeight)).append("\n");
        sb.append("    readonlyNodes: ").append(toIndentedString(readonlyNodes)).append("\n");
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
