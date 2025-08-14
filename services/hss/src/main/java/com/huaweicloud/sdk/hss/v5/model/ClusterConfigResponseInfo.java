package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClusterConfigResponseInfo
 */
public class ClusterConfigResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_node_num")

    private Integer protectNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_interrupt_node_num")

    private Integer protectInterruptNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_degradation_node_num")

    private Integer protectDegradationNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unprotect_node_num")

    private Integer unprotectNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_total_num")

    private Integer nodeTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefer_packet_cycle")

    private Integer preferPacketCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_type")

    private String protectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    public ClusterConfigResponseInfo withClusterId(String clusterId) {
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

    public ClusterConfigResponseInfo withProtectNodeNum(Integer protectNodeNum) {
        this.protectNodeNum = protectNodeNum;
        return this;
    }

    /**
     * 集群开启防护节点数量
     * minimum: 0
     * maximum: 2000
     * @return protectNodeNum
     */
    public Integer getProtectNodeNum() {
        return protectNodeNum;
    }

    public void setProtectNodeNum(Integer protectNodeNum) {
        this.protectNodeNum = protectNodeNum;
    }

    public ClusterConfigResponseInfo withProtectInterruptNodeNum(Integer protectInterruptNodeNum) {
        this.protectInterruptNodeNum = protectInterruptNodeNum;
        return this;
    }

    /**
     * 集群防护中断节点数量
     * minimum: 0
     * maximum: 2000
     * @return protectInterruptNodeNum
     */
    public Integer getProtectInterruptNodeNum() {
        return protectInterruptNodeNum;
    }

    public void setProtectInterruptNodeNum(Integer protectInterruptNodeNum) {
        this.protectInterruptNodeNum = protectInterruptNodeNum;
    }

    public ClusterConfigResponseInfo withProtectDegradationNodeNum(Integer protectDegradationNodeNum) {
        this.protectDegradationNodeNum = protectDegradationNodeNum;
        return this;
    }

    /**
     * 集群防护降级节点数量
     * minimum: 0
     * maximum: 2000
     * @return protectDegradationNodeNum
     */
    public Integer getProtectDegradationNodeNum() {
        return protectDegradationNodeNum;
    }

    public void setProtectDegradationNodeNum(Integer protectDegradationNodeNum) {
        this.protectDegradationNodeNum = protectDegradationNodeNum;
    }

    public ClusterConfigResponseInfo withUnprotectNodeNum(Integer unprotectNodeNum) {
        this.unprotectNodeNum = unprotectNodeNum;
        return this;
    }

    /**
     * 集群防护中断节点数量
     * minimum: 0
     * maximum: 2000
     * @return unprotectNodeNum
     */
    public Integer getUnprotectNodeNum() {
        return unprotectNodeNum;
    }

    public void setUnprotectNodeNum(Integer unprotectNodeNum) {
        this.unprotectNodeNum = unprotectNodeNum;
    }

    public ClusterConfigResponseInfo withNodeTotalNum(Integer nodeTotalNum) {
        this.nodeTotalNum = nodeTotalNum;
        return this;
    }

    /**
     * 集群节点总数
     * minimum: 0
     * maximum: 2000
     * @return nodeTotalNum
     */
    public Integer getNodeTotalNum() {
        return nodeTotalNum;
    }

    public void setNodeTotalNum(Integer nodeTotalNum) {
        this.nodeTotalNum = nodeTotalNum;
    }

    public ClusterConfigResponseInfo withClusterName(String clusterName) {
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

    public ClusterConfigResponseInfo withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**: 付费模式           **约束限制**: 不涉及 **取值范围**: 包含以下两种： - on_demand：按需。 - free：免费。  **默认取值**: 不涉及 
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ClusterConfigResponseInfo withPreferPacketCycle(Integer preferPacketCycle) {
        this.preferPacketCycle = preferPacketCycle;
        return this;
    }

    /**
     * 优先使用包周期配额；默认0
     * minimum: 0
     * maximum: 10
     * @return preferPacketCycle
     */
    public Integer getPreferPacketCycle() {
        return preferPacketCycle;
    }

    public void setPreferPacketCycle(Integer preferPacketCycle) {
        this.preferPacketCycle = preferPacketCycle;
    }

    public ClusterConfigResponseInfo withProtectType(String protectType) {
        this.protectType = protectType;
        return this;
    }

    /**
     * cce集群防护类型
     * @return protectType
     */
    public String getProtectType() {
        return protectType;
    }

    public void setProtectType(String protectType) {
        this.protectType = protectType;
    }

    public ClusterConfigResponseInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * **参数解释**: 防护状态           **约束限制**: 不涉及 **取值范围**: - protecting：防护中。 - part_protect：部分防护。 - creating：开启中。 - error_protect：防护异常。 - unprotect：未防护。 - wait_protect：待防护。  **默认取值**: 不涉及 
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public ClusterConfigResponseInfo withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 集群类型
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public ClusterConfigResponseInfo withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * fail reason
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterConfigResponseInfo that = (ClusterConfigResponseInfo) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.protectNodeNum, that.protectNodeNum)
            && Objects.equals(this.protectInterruptNodeNum, that.protectInterruptNodeNum)
            && Objects.equals(this.protectDegradationNodeNum, that.protectDegradationNodeNum)
            && Objects.equals(this.unprotectNodeNum, that.unprotectNodeNum)
            && Objects.equals(this.nodeTotalNum, that.nodeTotalNum)
            && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.preferPacketCycle, that.preferPacketCycle)
            && Objects.equals(this.protectType, that.protectType)
            && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.clusterType, that.clusterType) && Objects.equals(this.failReason, that.failReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId,
            protectNodeNum,
            protectInterruptNodeNum,
            protectDegradationNodeNum,
            unprotectNodeNum,
            nodeTotalNum,
            clusterName,
            chargingMode,
            preferPacketCycle,
            protectType,
            protectStatus,
            clusterType,
            failReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterConfigResponseInfo {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    protectNodeNum: ").append(toIndentedString(protectNodeNum)).append("\n");
        sb.append("    protectInterruptNodeNum: ").append(toIndentedString(protectInterruptNodeNum)).append("\n");
        sb.append("    protectDegradationNodeNum: ").append(toIndentedString(protectDegradationNodeNum)).append("\n");
        sb.append("    unprotectNodeNum: ").append(toIndentedString(unprotectNodeNum)).append("\n");
        sb.append("    nodeTotalNum: ").append(toIndentedString(nodeTotalNum)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    preferPacketCycle: ").append(toIndentedString(preferPacketCycle)).append("\n");
        sb.append("    protectType: ").append(toIndentedString(protectType)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
