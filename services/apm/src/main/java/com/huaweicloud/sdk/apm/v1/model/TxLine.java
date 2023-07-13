package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 组件之间调用指向线。
 */
public class TxLine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tx_from_node")

    private String txFromNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tx_to_node")

    private String txToNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoke_count")

    private Long invokeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rt")

    private Double rt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_count")

    private Long errorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    public TxLine withTxFromNode(String txFromNode) {
        this.txFromNode = txFromNode;
        return this;
    }

    /**
     * 开始节点。
     * @return txFromNode
     */
    public String getTxFromNode() {
        return txFromNode;
    }

    public void setTxFromNode(String txFromNode) {
        this.txFromNode = txFromNode;
    }

    public TxLine withTxToNode(String txToNode) {
        this.txToNode = txToNode;
        return this;
    }

    /**
     * 结束节点。
     * @return txToNode
     */
    public String getTxToNode() {
        return txToNode;
    }

    public void setTxToNode(String txToNode) {
        this.txToNode = txToNode;
    }

    public TxLine withInvokeCount(Long invokeCount) {
        this.invokeCount = invokeCount;
        return this;
    }

    /**
     * 调用次数。
     * @return invokeCount
     */
    public Long getInvokeCount() {
        return invokeCount;
    }

    public void setInvokeCount(Long invokeCount) {
        this.invokeCount = invokeCount;
    }

    public TxLine withRt(Double rt) {
        this.rt = rt;
        return this;
    }

    /**
     * 平均响应时间。
     * @return rt
     */
    public Double getRt() {
        return rt;
    }

    public void setRt(Double rt) {
        this.rt = rt;
    }

    public TxLine withErrorCount(Long errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * 错误数。
     * @return errorCount
     */
    public Long getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Long errorCount) {
        this.errorCount = errorCount;
    }

    public TxLine withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TxLine withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 指向。
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TxLine that = (TxLine) obj;
        return Objects.equals(this.txFromNode, that.txFromNode) && Objects.equals(this.txToNode, that.txToNode)
            && Objects.equals(this.invokeCount, that.invokeCount) && Objects.equals(this.rt, that.rt)
            && Objects.equals(this.errorCount, that.errorCount) && Objects.equals(this.type, that.type)
            && Objects.equals(this.direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(txFromNode, txToNode, invokeCount, rt, errorCount, type, direction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TxLine {\n");
        sb.append("    txFromNode: ").append(toIndentedString(txFromNode)).append("\n");
        sb.append("    txToNode: ").append(toIndentedString(txToNode)).append("\n");
        sb.append("    invokeCount: ").append(toIndentedString(invokeCount)).append("\n");
        sb.append("    rt: ").append(toIndentedString(rt)).append("\n");
        sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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
