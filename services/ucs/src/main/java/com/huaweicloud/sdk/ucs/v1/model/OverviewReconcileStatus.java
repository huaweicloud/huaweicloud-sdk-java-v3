package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OverviewReconcileStatus
 */
public class OverviewReconcileStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configSetTotalNum")

    private Integer configSetTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthStatusNum")

    private Integer healthStatusNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedStatusNum")

    private Integer failedStatusNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unknownStatusNum")

    private Integer unknownStatusNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progressingStatusNum")

    private Integer progressingStatusNum;

    public OverviewReconcileStatus withConfigSetTotalNum(Integer configSetTotalNum) {
        this.configSetTotalNum = configSetTotalNum;
        return this;
    }

    /**
     * 配置集合总数
     * @return configSetTotalNum
     */
    public Integer getConfigSetTotalNum() {
        return configSetTotalNum;
    }

    public void setConfigSetTotalNum(Integer configSetTotalNum) {
        this.configSetTotalNum = configSetTotalNum;
    }

    public OverviewReconcileStatus withHealthStatusNum(Integer healthStatusNum) {
        this.healthStatusNum = healthStatusNum;
        return this;
    }

    /**
     * 健康状态的配置集合数量
     * @return healthStatusNum
     */
    public Integer getHealthStatusNum() {
        return healthStatusNum;
    }

    public void setHealthStatusNum(Integer healthStatusNum) {
        this.healthStatusNum = healthStatusNum;
    }

    public OverviewReconcileStatus withFailedStatusNum(Integer failedStatusNum) {
        this.failedStatusNum = failedStatusNum;
        return this;
    }

    /**
     * 失败状态的配置集合数量
     * @return failedStatusNum
     */
    public Integer getFailedStatusNum() {
        return failedStatusNum;
    }

    public void setFailedStatusNum(Integer failedStatusNum) {
        this.failedStatusNum = failedStatusNum;
    }

    public OverviewReconcileStatus withUnknownStatusNum(Integer unknownStatusNum) {
        this.unknownStatusNum = unknownStatusNum;
        return this;
    }

    /**
     * 未知状态的配置集合数量
     * @return unknownStatusNum
     */
    public Integer getUnknownStatusNum() {
        return unknownStatusNum;
    }

    public void setUnknownStatusNum(Integer unknownStatusNum) {
        this.unknownStatusNum = unknownStatusNum;
    }

    public OverviewReconcileStatus withProgressingStatusNum(Integer progressingStatusNum) {
        this.progressingStatusNum = progressingStatusNum;
        return this;
    }

    /**
     * 正在处理中的配置集合数量
     * @return progressingStatusNum
     */
    public Integer getProgressingStatusNum() {
        return progressingStatusNum;
    }

    public void setProgressingStatusNum(Integer progressingStatusNum) {
        this.progressingStatusNum = progressingStatusNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OverviewReconcileStatus that = (OverviewReconcileStatus) obj;
        return Objects.equals(this.configSetTotalNum, that.configSetTotalNum)
            && Objects.equals(this.healthStatusNum, that.healthStatusNum)
            && Objects.equals(this.failedStatusNum, that.failedStatusNum)
            && Objects.equals(this.unknownStatusNum, that.unknownStatusNum)
            && Objects.equals(this.progressingStatusNum, that.progressingStatusNum);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(configSetTotalNum, healthStatusNum, failedStatusNum, unknownStatusNum, progressingStatusNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverviewReconcileStatus {\n");
        sb.append("    configSetTotalNum: ").append(toIndentedString(configSetTotalNum)).append("\n");
        sb.append("    healthStatusNum: ").append(toIndentedString(healthStatusNum)).append("\n");
        sb.append("    failedStatusNum: ").append(toIndentedString(failedStatusNum)).append("\n");
        sb.append("    unknownStatusNum: ").append(toIndentedString(unknownStatusNum)).append("\n");
        sb.append("    progressingStatusNum: ").append(toIndentedString(progressingStatusNum)).append("\n");
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
