package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * URL跟踪视图。
 */
public class TxItemVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tx_display_name")

    private String txDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private Long businessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private Long envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private Long appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tx_name")

    private String txName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoke_count")

    private Integer invokeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_time")

    private Integer totalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_count")

    private Integer errorCount;

    public TxItemVo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 组件名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public TxItemVo withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * 环境名称。
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public TxItemVo withTxDisplayName(String txDisplayName) {
        this.txDisplayName = txDisplayName;
        return this;
    }

    /**
     * 事务显示名称。
     * @return txDisplayName
     */
    public String getTxDisplayName() {
        return txDisplayName;
    }

    public void setTxDisplayName(String txDisplayName) {
        this.txDisplayName = txDisplayName;
    }

    public TxItemVo withBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 应用id。
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public TxItemVo withEnvId(Long envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境id。
     * @return envId
     */
    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public TxItemVo withAppId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 组件id。
     * @return appId
     */
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public TxItemVo withTxName(String txName) {
        this.txName = txName;
        return this;
    }

    /**
     * 事务名称。
     * @return txName
     */
    public String getTxName() {
        return txName;
    }

    public void setTxName(String txName) {
        this.txName = txName;
    }

    public TxItemVo withInvokeCount(Integer invokeCount) {
        this.invokeCount = invokeCount;
        return this;
    }

    /**
     * 调用次数。
     * @return invokeCount
     */
    public Integer getInvokeCount() {
        return invokeCount;
    }

    public void setInvokeCount(Integer invokeCount) {
        this.invokeCount = invokeCount;
    }

    public TxItemVo withTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
        return this;
    }

    /**
     * 总耗时。
     * @return totalTime
     */
    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    public TxItemVo withErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    /**
     * 错误次数。
     * @return errorCount
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TxItemVo txItemVo = (TxItemVo) o;
        return Objects.equals(this.appName, txItemVo.appName) && Objects.equals(this.envName, txItemVo.envName)
            && Objects.equals(this.txDisplayName, txItemVo.txDisplayName)
            && Objects.equals(this.businessId, txItemVo.businessId) && Objects.equals(this.envId, txItemVo.envId)
            && Objects.equals(this.appId, txItemVo.appId) && Objects.equals(this.txName, txItemVo.txName)
            && Objects.equals(this.invokeCount, txItemVo.invokeCount)
            && Objects.equals(this.totalTime, txItemVo.totalTime)
            && Objects.equals(this.errorCount, txItemVo.errorCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName,
            envName,
            txDisplayName,
            businessId,
            envId,
            appId,
            txName,
            invokeCount,
            totalTime,
            errorCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TxItemVo {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    txDisplayName: ").append(toIndentedString(txDisplayName)).append("\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    txName: ").append(toIndentedString(txName)).append("\n");
        sb.append("    invokeCount: ").append(toIndentedString(invokeCount)).append("\n");
        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
        sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
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
