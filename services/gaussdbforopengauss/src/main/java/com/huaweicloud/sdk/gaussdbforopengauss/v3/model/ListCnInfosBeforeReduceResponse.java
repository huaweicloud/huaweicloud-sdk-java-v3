package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListCnInfosBeforeReduceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_reduction_num")

    private Integer maxReductionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<CnInfoBeforeReduce> nodes = null;

    public ListCnInfosBeforeReduceResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 实例ID。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListCnInfosBeforeReduceResponse withMaxReductionNum(Integer maxReductionNum) {
        this.maxReductionNum = maxReductionNum;
        return this;
    }

    /**
     * 单次缩容允许最大步长。
     * @return maxReductionNum
     */
    public Integer getMaxReductionNum() {
        return maxReductionNum;
    }

    public void setMaxReductionNum(Integer maxReductionNum) {
        this.maxReductionNum = maxReductionNum;
    }

    public ListCnInfosBeforeReduceResponse withNodes(List<CnInfoBeforeReduce> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ListCnInfosBeforeReduceResponse addNodesItem(CnInfoBeforeReduce nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ListCnInfosBeforeReduceResponse withNodes(Consumer<List<CnInfoBeforeReduce>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 节点信息列表。
     * @return nodes
     */
    public List<CnInfoBeforeReduce> getNodes() {
        return nodes;
    }

    public void setNodes(List<CnInfoBeforeReduce> nodes) {
        this.nodes = nodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCnInfosBeforeReduceResponse that = (ListCnInfosBeforeReduceResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.maxReductionNum, that.maxReductionNum) && Objects.equals(this.nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, maxReductionNum, nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCnInfosBeforeReduceResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    maxReductionNum: ").append(toIndentedString(maxReductionNum)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
