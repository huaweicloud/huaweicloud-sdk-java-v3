package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowContainerNodeStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unprotected_num")

    private Integer unprotectedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_num")

    private Integer protectedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_num_on_demand")

    private Integer protectedNumOnDemand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_num_packet_cycle")

    private Integer protectedNumPacketCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_node_not_installed_num")

    private Integer clusterNodeNotInstalledNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_cluster_node_not_installed_num")

    private Integer notClusterNodeNotInstalledNum;

    public ShowContainerNodeStatisticsResponse withUnprotectedNum(Integer unprotectedNum) {
        this.unprotectedNum = unprotectedNum;
        return this;
    }

    /**
     * 未防护服务器数
     * minimum: 0
     * maximum: 2147483647
     * @return unprotectedNum
     */
    public Integer getUnprotectedNum() {
        return unprotectedNum;
    }

    public void setUnprotectedNum(Integer unprotectedNum) {
        this.unprotectedNum = unprotectedNum;
    }

    public ShowContainerNodeStatisticsResponse withProtectedNum(Integer protectedNum) {
        this.protectedNum = protectedNum;
        return this;
    }

    /**
     * 开启防护节点
     * minimum: 0
     * maximum: 2147483647
     * @return protectedNum
     */
    public Integer getProtectedNum() {
        return protectedNum;
    }

    public void setProtectedNum(Integer protectedNum) {
        this.protectedNum = protectedNum;
    }

    public ShowContainerNodeStatisticsResponse withProtectedNumOnDemand(Integer protectedNumOnDemand) {
        this.protectedNumOnDemand = protectedNumOnDemand;
        return this;
    }

    /**
     * 按需开启防护节点
     * minimum: 0
     * maximum: 2147483647
     * @return protectedNumOnDemand
     */
    public Integer getProtectedNumOnDemand() {
        return protectedNumOnDemand;
    }

    public void setProtectedNumOnDemand(Integer protectedNumOnDemand) {
        this.protectedNumOnDemand = protectedNumOnDemand;
    }

    public ShowContainerNodeStatisticsResponse withProtectedNumPacketCycle(Integer protectedNumPacketCycle) {
        this.protectedNumPacketCycle = protectedNumPacketCycle;
        return this;
    }

    /**
     * 按配额开启防护节点
     * minimum: 0
     * maximum: 2147483647
     * @return protectedNumPacketCycle
     */
    public Integer getProtectedNumPacketCycle() {
        return protectedNumPacketCycle;
    }

    public void setProtectedNumPacketCycle(Integer protectedNumPacketCycle) {
        this.protectedNumPacketCycle = protectedNumPacketCycle;
    }

    public ShowContainerNodeStatisticsResponse withClusterNodeNotInstalledNum(Integer clusterNodeNotInstalledNum) {
        this.clusterNodeNotInstalledNum = clusterNodeNotInstalledNum;
        return this;
    }

    /**
     * 未安装集群节点
     * minimum: 0
     * maximum: 2147483647
     * @return clusterNodeNotInstalledNum
     */
    public Integer getClusterNodeNotInstalledNum() {
        return clusterNodeNotInstalledNum;
    }

    public void setClusterNodeNotInstalledNum(Integer clusterNodeNotInstalledNum) {
        this.clusterNodeNotInstalledNum = clusterNodeNotInstalledNum;
    }

    public ShowContainerNodeStatisticsResponse withNotClusterNodeNotInstalledNum(
        Integer notClusterNodeNotInstalledNum) {
        this.notClusterNodeNotInstalledNum = notClusterNodeNotInstalledNum;
        return this;
    }

    /**
     * 未安装非集群节点
     * minimum: 0
     * maximum: 2147483647
     * @return notClusterNodeNotInstalledNum
     */
    public Integer getNotClusterNodeNotInstalledNum() {
        return notClusterNodeNotInstalledNum;
    }

    public void setNotClusterNodeNotInstalledNum(Integer notClusterNodeNotInstalledNum) {
        this.notClusterNodeNotInstalledNum = notClusterNodeNotInstalledNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowContainerNodeStatisticsResponse that = (ShowContainerNodeStatisticsResponse) obj;
        return Objects.equals(this.unprotectedNum, that.unprotectedNum)
            && Objects.equals(this.protectedNum, that.protectedNum)
            && Objects.equals(this.protectedNumOnDemand, that.protectedNumOnDemand)
            && Objects.equals(this.protectedNumPacketCycle, that.protectedNumPacketCycle)
            && Objects.equals(this.clusterNodeNotInstalledNum, that.clusterNodeNotInstalledNum)
            && Objects.equals(this.notClusterNodeNotInstalledNum, that.notClusterNodeNotInstalledNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unprotectedNum,
            protectedNum,
            protectedNumOnDemand,
            protectedNumPacketCycle,
            clusterNodeNotInstalledNum,
            notClusterNodeNotInstalledNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowContainerNodeStatisticsResponse {\n");
        sb.append("    unprotectedNum: ").append(toIndentedString(unprotectedNum)).append("\n");
        sb.append("    protectedNum: ").append(toIndentedString(protectedNum)).append("\n");
        sb.append("    protectedNumOnDemand: ").append(toIndentedString(protectedNumOnDemand)).append("\n");
        sb.append("    protectedNumPacketCycle: ").append(toIndentedString(protectedNumPacketCycle)).append("\n");
        sb.append("    clusterNodeNotInstalledNum: ").append(toIndentedString(clusterNodeNotInstalledNum)).append("\n");
        sb.append("    notClusterNodeNotInstalledNum: ")
            .append(toIndentedString(notClusterNodeNotInstalledNum))
            .append("\n");
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
