package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务下的集群扫描详情信息
 */
public class ListTaskResourcesResponseInfoClusterScanDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_version")

    private String clusterVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_detail_list")

    private List<ListTaskResourcesResponseInfoScanDetailList> scanDetailList = null;

    public ListTaskResourcesResponseInfoClusterScanDataList withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ListTaskResourcesResponseInfoClusterScanDataList withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListTaskResourcesResponseInfoClusterScanDataList withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 集群类型，包含如下： - cce：CCE集群 - ali：阿里云集群 - tencent：腾讯云集群 - azure：微软云集群 - aws：亚马逊集群 - self_built_hw：华为云自建集群 - self_built_idc：IDC自建集群
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public ListTaskResourcesResponseInfoClusterScanDataList withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * 集群版本
     * @return clusterVersion
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    public ListTaskResourcesResponseInfoClusterScanDataList withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * 集群的扫描状态，包含如下：   - scanning：扫描中   - success：扫描成功   - failed：扫描失败
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public ListTaskResourcesResponseInfoClusterScanDataList withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 该集群扫描开始的时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListTaskResourcesResponseInfoClusterScanDataList withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 该集群扫描结束的时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListTaskResourcesResponseInfoClusterScanDataList withScanDetailList(
        List<ListTaskResourcesResponseInfoScanDetailList> scanDetailList) {
        this.scanDetailList = scanDetailList;
        return this;
    }

    public ListTaskResourcesResponseInfoClusterScanDataList addScanDetailListItem(
        ListTaskResourcesResponseInfoScanDetailList scanDetailListItem) {
        if (this.scanDetailList == null) {
            this.scanDetailList = new ArrayList<>();
        }
        this.scanDetailList.add(scanDetailListItem);
        return this;
    }

    public ListTaskResourcesResponseInfoClusterScanDataList withScanDetailList(
        Consumer<List<ListTaskResourcesResponseInfoScanDetailList>> scanDetailListSetter) {
        if (this.scanDetailList == null) {
            this.scanDetailList = new ArrayList<>();
        }
        scanDetailListSetter.accept(this.scanDetailList);
        return this;
    }

    /**
     * 当前集群的扫描详情信息
     * @return scanDetailList
     */
    public List<ListTaskResourcesResponseInfoScanDetailList> getScanDetailList() {
        return scanDetailList;
    }

    public void setScanDetailList(List<ListTaskResourcesResponseInfoScanDetailList> scanDetailList) {
        this.scanDetailList = scanDetailList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTaskResourcesResponseInfoClusterScanDataList that = (ListTaskResourcesResponseInfoClusterScanDataList) obj;
        return Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.clusterVersion, that.clusterVersion)
            && Objects.equals(this.scanStatus, that.scanStatus) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.scanDetailList, that.scanDetailList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(clusterName, clusterId, clusterType, clusterVersion, scanStatus, startTime, endTime, scanDetailList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskResourcesResponseInfoClusterScanDataList {\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    scanDetailList: ").append(toIndentedString(scanDetailList)).append("\n");
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
