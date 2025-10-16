package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowStatusClusterItem
 */
public class ShowStatusClusterItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_rate")

    private Double successRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_rate")

    private Double failRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Long successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_value")

    private Double averageValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_value")

    private Double totalValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Boolean limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    public ShowStatusClusterItem withSuccessRate(Double successRate) {
        this.successRate = successRate;
        return this;
    }

    /**
     * 成功率
     * @return successRate
     */
    public Double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Double successRate) {
        this.successRate = successRate;
    }

    public ShowStatusClusterItem withFailRate(Double failRate) {
        this.failRate = failRate;
        return this;
    }

    /**
     * 失败率
     * @return failRate
     */
    public Double getFailRate() {
        return failRate;
    }

    public void setFailRate(Double failRate) {
        this.failRate = failRate;
    }

    public ShowStatusClusterItem withSuccessCount(Long successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 成功次数
     * @return successCount
     */
    public Long getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Long successCount) {
        this.successCount = successCount;
    }

    public ShowStatusClusterItem withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总次数
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ShowStatusClusterItem withAverageValue(Double averageValue) {
        this.averageValue = averageValue;
        return this;
    }

    /**
     * 平均值
     * @return averageValue
     */
    public Double getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(Double averageValue) {
        this.averageValue = averageValue;
    }

    public ShowStatusClusterItem withTotalValue(Double totalValue) {
        this.totalValue = totalValue;
        return this;
    }

    /**
     * 总数
     * @return totalValue
     */
    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public ShowStatusClusterItem withLimit(Boolean limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 指标是否超出限制
     * @return limit
     */
    public Boolean getLimit() {
        return limit;
    }

    public void setLimit(Boolean limit) {
        this.limit = limit;
    }

    public ShowStatusClusterItem withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowStatusClusterItem withClusterName(String clusterName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatusClusterItem that = (ShowStatusClusterItem) obj;
        return Objects.equals(this.successRate, that.successRate) && Objects.equals(this.failRate, that.failRate)
            && Objects.equals(this.successCount, that.successCount) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.averageValue, that.averageValue) && Objects.equals(this.totalValue, that.totalValue)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterName, that.clusterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successRate,
            failRate,
            successCount,
            totalCount,
            averageValue,
            totalValue,
            limit,
            clusterId,
            clusterName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatusClusterItem {\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    failRate: ").append(toIndentedString(failRate)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    averageValue: ").append(toIndentedString(averageValue)).append("\n");
        sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
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
