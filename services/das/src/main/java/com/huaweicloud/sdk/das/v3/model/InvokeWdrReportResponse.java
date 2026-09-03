package com.huaweicloud.sdk.das.v3.model;

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
public class InvokeWdrReportResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_wdr")

    private String instanceWdr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_wdr_name")

    private String instanceWdrName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_wdr_list")

    private List<NodeWdrDto> nodeWdrList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wdr_status")

    private Integer wdrStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_snapshot_id")

    private Long startSnapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_snapshot_id")

    private Long endSnapshotId;

    public InvokeWdrReportResponse withInstanceWdr(String instanceWdr) {
        this.instanceWdr = instanceWdr;
        return this;
    }

    /**
     * 实例WDR报表下载地址
     * @return instanceWdr
     */
    public String getInstanceWdr() {
        return instanceWdr;
    }

    public void setInstanceWdr(String instanceWdr) {
        this.instanceWdr = instanceWdr;
    }

    public InvokeWdrReportResponse withInstanceWdrName(String instanceWdrName) {
        this.instanceWdrName = instanceWdrName;
        return this;
    }

    /**
     * WDR报表名称
     * @return instanceWdrName
     */
    public String getInstanceWdrName() {
        return instanceWdrName;
    }

    public void setInstanceWdrName(String instanceWdrName) {
        this.instanceWdrName = instanceWdrName;
    }

    public InvokeWdrReportResponse withNodeWdrList(List<NodeWdrDto> nodeWdrList) {
        this.nodeWdrList = nodeWdrList;
        return this;
    }

    public InvokeWdrReportResponse addNodeWdrListItem(NodeWdrDto nodeWdrListItem) {
        if (this.nodeWdrList == null) {
            this.nodeWdrList = new ArrayList<>();
        }
        this.nodeWdrList.add(nodeWdrListItem);
        return this;
    }

    public InvokeWdrReportResponse withNodeWdrList(Consumer<List<NodeWdrDto>> nodeWdrListSetter) {
        if (this.nodeWdrList == null) {
            this.nodeWdrList = new ArrayList<>();
        }
        nodeWdrListSetter.accept(this.nodeWdrList);
        return this;
    }

    /**
     * 节点WDR报表列表
     * @return nodeWdrList
     */
    public List<NodeWdrDto> getNodeWdrList() {
        return nodeWdrList;
    }

    public void setNodeWdrList(List<NodeWdrDto> nodeWdrList) {
        this.nodeWdrList = nodeWdrList;
    }

    public InvokeWdrReportResponse withWdrStatus(Integer wdrStatus) {
        this.wdrStatus = wdrStatus;
        return this;
    }

    /**
     * WDR报表状态。取值范围：0（无报表）、1（生成中）、2（生成成功）、3（生成失败）
     * @return wdrStatus
     */
    public Integer getWdrStatus() {
        return wdrStatus;
    }

    public void setWdrStatus(Integer wdrStatus) {
        this.wdrStatus = wdrStatus;
    }

    public InvokeWdrReportResponse withStartSnapshotId(Long startSnapshotId) {
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

    public InvokeWdrReportResponse withEndSnapshotId(Long endSnapshotId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InvokeWdrReportResponse that = (InvokeWdrReportResponse) obj;
        return Objects.equals(this.instanceWdr, that.instanceWdr)
            && Objects.equals(this.instanceWdrName, that.instanceWdrName)
            && Objects.equals(this.nodeWdrList, that.nodeWdrList) && Objects.equals(this.wdrStatus, that.wdrStatus)
            && Objects.equals(this.startSnapshotId, that.startSnapshotId)
            && Objects.equals(this.endSnapshotId, that.endSnapshotId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceWdr, instanceWdrName, nodeWdrList, wdrStatus, startSnapshotId, endSnapshotId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvokeWdrReportResponse {\n");
        sb.append("    instanceWdr: ").append(toIndentedString(instanceWdr)).append("\n");
        sb.append("    instanceWdrName: ").append(toIndentedString(instanceWdrName)).append("\n");
        sb.append("    nodeWdrList: ").append(toIndentedString(nodeWdrList)).append("\n");
        sb.append("    wdrStatus: ").append(toIndentedString(wdrStatus)).append("\n");
        sb.append("    startSnapshotId: ").append(toIndentedString(startSnapshotId)).append("\n");
        sb.append("    endSnapshotId: ").append(toIndentedString(endSnapshotId)).append("\n");
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
