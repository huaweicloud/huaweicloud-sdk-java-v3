package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowNetworkStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_cluster_total_num")

    private Integer protectedClusterTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_total_num")

    private Integer clusterTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_total_num")

    private Integer namespaceTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_policy_total_num")

    private Integer networkPolicyTotalNum;

    public ShowNetworkStatisticsResponse withProtectedClusterTotalNum(Integer protectedClusterTotalNum) {
        this.protectedClusterTotalNum = protectedClusterTotalNum;
        return this;
    }

    /**
     * 未保护集群数
     * minimum: 0
     * maximum: 10000
     * @return protectedClusterTotalNum
     */
    public Integer getProtectedClusterTotalNum() {
        return protectedClusterTotalNum;
    }

    public void setProtectedClusterTotalNum(Integer protectedClusterTotalNum) {
        this.protectedClusterTotalNum = protectedClusterTotalNum;
    }

    public ShowNetworkStatisticsResponse withClusterTotalNum(Integer clusterTotalNum) {
        this.clusterTotalNum = clusterTotalNum;
        return this;
    }

    /**
     * 集群数
     * minimum: 0
     * maximum: 10000
     * @return clusterTotalNum
     */
    public Integer getClusterTotalNum() {
        return clusterTotalNum;
    }

    public void setClusterTotalNum(Integer clusterTotalNum) {
        this.clusterTotalNum = clusterTotalNum;
    }

    public ShowNetworkStatisticsResponse withNamespaceTotalNum(Integer namespaceTotalNum) {
        this.namespaceTotalNum = namespaceTotalNum;
        return this;
    }

    /**
     * 命名空间数
     * minimum: 0
     * maximum: 100000
     * @return namespaceTotalNum
     */
    public Integer getNamespaceTotalNum() {
        return namespaceTotalNum;
    }

    public void setNamespaceTotalNum(Integer namespaceTotalNum) {
        this.namespaceTotalNum = namespaceTotalNum;
    }

    public ShowNetworkStatisticsResponse withNetworkPolicyTotalNum(Integer networkPolicyTotalNum) {
        this.networkPolicyTotalNum = networkPolicyTotalNum;
        return this;
    }

    /**
     * 策略数
     * minimum: 0
     * maximum: 100000
     * @return networkPolicyTotalNum
     */
    public Integer getNetworkPolicyTotalNum() {
        return networkPolicyTotalNum;
    }

    public void setNetworkPolicyTotalNum(Integer networkPolicyTotalNum) {
        this.networkPolicyTotalNum = networkPolicyTotalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNetworkStatisticsResponse that = (ShowNetworkStatisticsResponse) obj;
        return Objects.equals(this.protectedClusterTotalNum, that.protectedClusterTotalNum)
            && Objects.equals(this.clusterTotalNum, that.clusterTotalNum)
            && Objects.equals(this.namespaceTotalNum, that.namespaceTotalNum)
            && Objects.equals(this.networkPolicyTotalNum, that.networkPolicyTotalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectedClusterTotalNum, clusterTotalNum, namespaceTotalNum, networkPolicyTotalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNetworkStatisticsResponse {\n");
        sb.append("    protectedClusterTotalNum: ").append(toIndentedString(protectedClusterTotalNum)).append("\n");
        sb.append("    clusterTotalNum: ").append(toIndentedString(clusterTotalNum)).append("\n");
        sb.append("    namespaceTotalNum: ").append(toIndentedString(namespaceTotalNum)).append("\n");
        sb.append("    networkPolicyTotalNum: ").append(toIndentedString(networkPolicyTotalNum)).append("\n");
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
