package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 组件节点。
 */
public class TxNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tx_node_id")

    private String txNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tx_node_name")

    private String txNodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tx_node_type")

    private String txNodeType;

    public TxNode withTxNodeId(String txNodeId) {
        this.txNodeId = txNodeId;
        return this;
    }

    /**
     * 节点id。
     * @return txNodeId
     */
    public String getTxNodeId() {
        return txNodeId;
    }

    public void setTxNodeId(String txNodeId) {
        this.txNodeId = txNodeId;
    }

    public TxNode withTxNodeName(String txNodeName) {
        this.txNodeName = txNodeName;
        return this;
    }

    /**
     * 节点名称。
     * @return txNodeName
     */
    public String getTxNodeName() {
        return txNodeName;
    }

    public void setTxNodeName(String txNodeName) {
        this.txNodeName = txNodeName;
    }

    public TxNode withTxNodeType(String txNodeType) {
        this.txNodeType = txNodeType;
        return this;
    }

    /**
     * 节点类型。
     * @return txNodeType
     */
    public String getTxNodeType() {
        return txNodeType;
    }

    public void setTxNodeType(String txNodeType) {
        this.txNodeType = txNodeType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TxNode txNode = (TxNode) o;
        return Objects.equals(this.txNodeId, txNode.txNodeId) && Objects.equals(this.txNodeName, txNode.txNodeName)
            && Objects.equals(this.txNodeType, txNode.txNodeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(txNodeId, txNodeName, txNodeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TxNode {\n");
        sb.append("    txNodeId: ").append(toIndentedString(txNodeId)).append("\n");
        sb.append("    txNodeName: ").append(toIndentedString(txNodeName)).append("\n");
        sb.append("    txNodeType: ").append(toIndentedString(txNodeType)).append("\n");
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
