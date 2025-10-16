package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowResourceDetailAccessKeyResponseBodyAkList
 */
public class ShowResourceDetailAccessKeyResponseBodyAkList {

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
    @JsonProperty(value = "access_key_id")

    private String accessKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key_name")

    private String accessKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_access_time")

    private Long lastAccessTime;

    public ShowResourceDetailAccessKeyResponseBodyAkList withSuccessRate(Double successRate) {
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

    public ShowResourceDetailAccessKeyResponseBodyAkList withFailRate(Double failRate) {
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

    public ShowResourceDetailAccessKeyResponseBodyAkList withSuccessCount(Long successCount) {
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

    public ShowResourceDetailAccessKeyResponseBodyAkList withTotalCount(Long totalCount) {
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

    public ShowResourceDetailAccessKeyResponseBodyAkList withAverageValue(Double averageValue) {
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

    public ShowResourceDetailAccessKeyResponseBodyAkList withTotalValue(Double totalValue) {
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

    public ShowResourceDetailAccessKeyResponseBodyAkList withAppId(String appId) {
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

    public ShowResourceDetailAccessKeyResponseBodyAkList withAppName(String appName) {
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

    public ShowResourceDetailAccessKeyResponseBodyAkList withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * 访问密钥ID
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public ShowResourceDetailAccessKeyResponseBodyAkList withAccessKeyName(String accessKeyName) {
        this.accessKeyName = accessKeyName;
        return this;
    }

    /**
     * 访问密钥名称
     * @return accessKeyName
     */
    public String getAccessKeyName() {
        return accessKeyName;
    }

    public void setAccessKeyName(String accessKeyName) {
        this.accessKeyName = accessKeyName;
    }

    public ShowResourceDetailAccessKeyResponseBodyAkList withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 访问密钥状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowResourceDetailAccessKeyResponseBodyAkList withLastAccessTime(Long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }

    /**
     * 最后访问时间，UNIX时间戳，单位毫秒
     * @return lastAccessTime
     */
    public Long getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(Long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceDetailAccessKeyResponseBodyAkList that = (ShowResourceDetailAccessKeyResponseBodyAkList) obj;
        return Objects.equals(this.successRate, that.successRate) && Objects.equals(this.failRate, that.failRate)
            && Objects.equals(this.successCount, that.successCount) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.averageValue, that.averageValue) && Objects.equals(this.totalValue, that.totalValue)
            && Objects.equals(this.appId, that.appId) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.accessKeyId, that.accessKeyId)
            && Objects.equals(this.accessKeyName, that.accessKeyName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.lastAccessTime, that.lastAccessTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successRate,
            failRate,
            successCount,
            totalCount,
            averageValue,
            totalValue,
            appId,
            appName,
            accessKeyId,
            accessKeyName,
            status,
            lastAccessTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceDetailAccessKeyResponseBodyAkList {\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    failRate: ").append(toIndentedString(failRate)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    averageValue: ").append(toIndentedString(averageValue)).append("\n");
        sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    accessKeyName: ").append(toIndentedString(accessKeyName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lastAccessTime: ").append(toIndentedString(lastAccessTime)).append("\n");
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
