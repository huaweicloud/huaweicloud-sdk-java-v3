package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowStatusAppItem
 */
public class ShowStatusAppItem {

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
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ShowStatusAppItem withSuccessRate(Double successRate) {
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

    public ShowStatusAppItem withFailRate(Double failRate) {
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

    public ShowStatusAppItem withSuccessCount(Long successCount) {
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

    public ShowStatusAppItem withTotalCount(Long totalCount) {
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

    public ShowStatusAppItem withAverageValue(Double averageValue) {
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

    public ShowStatusAppItem withTotalValue(Double totalValue) {
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

    public ShowStatusAppItem withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowStatusAppItem withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ShowStatusAppItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 应用状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatusAppItem that = (ShowStatusAppItem) obj;
        return Objects.equals(this.successRate, that.successRate) && Objects.equals(this.failRate, that.failRate)
            && Objects.equals(this.successCount, that.successCount) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.averageValue, that.averageValue) && Objects.equals(this.totalValue, that.totalValue)
            && Objects.equals(this.appId, that.appId) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(successRate, failRate, successCount, totalCount, averageValue, totalValue, appId, appName, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatusAppItem {\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    failRate: ").append(toIndentedString(failRate)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    averageValue: ").append(toIndentedString(averageValue)).append("\n");
        sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
