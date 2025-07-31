package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群防护策略列表
 */
public class ClusterItemResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_ns")

    private List<String> clusterNs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_labels")

    private List<String> clusterLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    public ClusterItemResponseInfo withClusterId(String clusterId) {
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

    public ClusterItemResponseInfo withClusterName(String clusterName) {
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

    public ClusterItemResponseInfo withClusterNs(List<String> clusterNs) {
        this.clusterNs = clusterNs;
        return this;
    }

    public ClusterItemResponseInfo addClusterNsItem(String clusterNsItem) {
        if (this.clusterNs == null) {
            this.clusterNs = new ArrayList<>();
        }
        this.clusterNs.add(clusterNsItem);
        return this;
    }

    public ClusterItemResponseInfo withClusterNs(Consumer<List<String>> clusterNsSetter) {
        if (this.clusterNs == null) {
            this.clusterNs = new ArrayList<>();
        }
        clusterNsSetter.accept(this.clusterNs);
        return this;
    }

    /**
     * 集群命名空间
     * @return clusterNs
     */
    public List<String> getClusterNs() {
        return clusterNs;
    }

    public void setClusterNs(List<String> clusterNs) {
        this.clusterNs = clusterNs;
    }

    public ClusterItemResponseInfo withClusterLabels(List<String> clusterLabels) {
        this.clusterLabels = clusterLabels;
        return this;
    }

    public ClusterItemResponseInfo addClusterLabelsItem(String clusterLabelsItem) {
        if (this.clusterLabels == null) {
            this.clusterLabels = new ArrayList<>();
        }
        this.clusterLabels.add(clusterLabelsItem);
        return this;
    }

    public ClusterItemResponseInfo withClusterLabels(Consumer<List<String>> clusterLabelsSetter) {
        if (this.clusterLabels == null) {
            this.clusterLabels = new ArrayList<>();
        }
        clusterLabelsSetter.accept(this.clusterLabels);
        return this;
    }

    /**
     * 集群标签
     * @return clusterLabels
     */
    public List<String> getClusterLabels() {
        return clusterLabels;
    }

    public void setClusterLabels(List<String> clusterLabels) {
        this.clusterLabels = clusterLabels;
    }

    public ClusterItemResponseInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 集群防护状态 | - \"0\" unprotected - \"1\" plugin error - \"2\" protected with policy - \"3\" deploy policy failed - \"4\" protected without policy - \"5\" uninstall failed - \"6\" uninstall - \"7\" installing
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterItemResponseInfo that = (ClusterItemResponseInfo) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.clusterNs, that.clusterNs) && Objects.equals(this.clusterLabels, that.clusterLabels)
            && Objects.equals(this.protectStatus, that.protectStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, clusterName, clusterNs, clusterLabels, protectStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterItemResponseInfo {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterNs: ").append(toIndentedString(clusterNs)).append("\n");
        sb.append("    clusterLabels: ").append(toIndentedString(clusterLabels)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
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
