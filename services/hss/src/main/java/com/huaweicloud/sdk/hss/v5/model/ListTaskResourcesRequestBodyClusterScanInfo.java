package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群扫描任务特有的查询条件，任务类型为“cluster_scan”可用
 */
public class ListTaskResourcesRequestBodyClusterScanInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    public ListTaskResourcesRequestBodyClusterScanInfo withScanStatus(String scanStatus) {
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

    public ListTaskResourcesRequestBodyClusterScanInfo withClusterName(String clusterName) {
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

    public ListTaskResourcesRequestBodyClusterScanInfo withClusterId(String clusterId) {
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

    public ListTaskResourcesRequestBodyClusterScanInfo withClusterType(String clusterType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTaskResourcesRequestBodyClusterScanInfo that = (ListTaskResourcesRequestBodyClusterScanInfo) obj;
        return Objects.equals(this.scanStatus, that.scanStatus) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterType, that.clusterType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanStatus, clusterName, clusterId, clusterType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskResourcesRequestBodyClusterScanInfo {\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
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
