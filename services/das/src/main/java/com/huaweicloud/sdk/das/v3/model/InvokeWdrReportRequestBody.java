package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 获取WDR数据请求体
 */
public class InvokeWdrReportRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_snapshot_id")

    private Long startSnapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_snapshot_id")

    private Long endSnapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    public InvokeWdrReportRequestBody withStartSnapshotId(Long startSnapshotId) {
        this.startSnapshotId = startSnapshotId;
        return this;
    }

    /**
     * WDR快照开始ID
     * @return startSnapshotId
     */
    public Long getStartSnapshotId() {
        return startSnapshotId;
    }

    public void setStartSnapshotId(Long startSnapshotId) {
        this.startSnapshotId = startSnapshotId;
    }

    public InvokeWdrReportRequestBody withEndSnapshotId(Long endSnapshotId) {
        this.endSnapshotId = endSnapshotId;
        return this;
    }

    /**
     * WDR快照结束ID
     * @return endSnapshotId
     */
    public Long getEndSnapshotId() {
        return endSnapshotId;
    }

    public void setEndSnapshotId(Long endSnapshotId) {
        this.endSnapshotId = endSnapshotId;
    }

    public InvokeWdrReportRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 实例节点ID，实例节点的唯一标识
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InvokeWdrReportRequestBody that = (InvokeWdrReportRequestBody) obj;
        return Objects.equals(this.startSnapshotId, that.startSnapshotId)
            && Objects.equals(this.endSnapshotId, that.endSnapshotId) && Objects.equals(this.nodeId, that.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startSnapshotId, endSnapshotId, nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvokeWdrReportRequestBody {\n");
        sb.append("    startSnapshotId: ").append(toIndentedString(startSnapshotId)).append("\n");
        sb.append("    endSnapshotId: ").append(toIndentedString(endSnapshotId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
