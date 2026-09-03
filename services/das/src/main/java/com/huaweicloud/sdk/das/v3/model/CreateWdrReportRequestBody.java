package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 触发WDR请求体
 */
public class CreateWdrReportRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_snapshot_id")

    private Long startSnapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_snapshot_id")

    private Long endSnapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    public CreateWdrReportRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 实例节点ID，实例节点的唯一标识。仅支持GaussDB实例节点
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public CreateWdrReportRequestBody withStartSnapshotId(Long startSnapshotId) {
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

    public CreateWdrReportRequestBody withEndSnapshotId(Long endSnapshotId) {
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

    public CreateWdrReportRequestBody withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区。格式：Asia/Shanghai
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWdrReportRequestBody that = (CreateWdrReportRequestBody) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.startSnapshotId, that.startSnapshotId)
            && Objects.equals(this.endSnapshotId, that.endSnapshotId) && Objects.equals(this.timeZone, that.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, startSnapshotId, endSnapshotId, timeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWdrReportRequestBody {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    startSnapshotId: ").append(toIndentedString(startSnapshotId)).append("\n");
        sb.append("    endSnapshotId: ").append(toIndentedString(endSnapshotId)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
