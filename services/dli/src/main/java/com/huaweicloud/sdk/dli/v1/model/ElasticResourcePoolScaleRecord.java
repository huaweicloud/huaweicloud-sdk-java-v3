package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 扩缩容历史记录接口返回数组中的数据
 */
public class ElasticResourcePoolScaleRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cu")

    private Integer maxCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_cu")

    private Integer minCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_cu")

    private Integer currentCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_cu")

    private Integer originCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_cu")

    private Integer targetCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private Long recordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    public ElasticResourcePoolScaleRecord withMaxCu(Integer maxCu) {
        this.maxCu = maxCu;
        return this;
    }

    /**
     * 最大Cu
     * @return maxCu
     */
    public Integer getMaxCu() {
        return maxCu;
    }

    public void setMaxCu(Integer maxCu) {
        this.maxCu = maxCu;
    }

    public ElasticResourcePoolScaleRecord withMinCu(Integer minCu) {
        this.minCu = minCu;
        return this;
    }

    /**
     * 最小CU
     * @return minCu
     */
    public Integer getMinCu() {
        return minCu;
    }

    public void setMinCu(Integer minCu) {
        this.minCu = minCu;
    }

    public ElasticResourcePoolScaleRecord withCurrentCu(Integer currentCu) {
        this.currentCu = currentCu;
        return this;
    }

    /**
     * 扩缩容后CU
     * @return currentCu
     */
    public Integer getCurrentCu() {
        return currentCu;
    }

    public void setCurrentCu(Integer currentCu) {
        this.currentCu = currentCu;
    }

    public ElasticResourcePoolScaleRecord withOriginCu(Integer originCu) {
        this.originCu = originCu;
        return this;
    }

    /**
     * 扩缩容前CU
     * @return originCu
     */
    public Integer getOriginCu() {
        return originCu;
    }

    public void setOriginCu(Integer originCu) {
        this.originCu = originCu;
    }

    public ElasticResourcePoolScaleRecord withTargetCu(Integer targetCu) {
        this.targetCu = targetCu;
        return this;
    }

    /**
     * 扩缩容预期CU
     * @return targetCu
     */
    public Integer getTargetCu() {
        return targetCu;
    }

    public void setTargetCu(Integer targetCu) {
        this.targetCu = targetCu;
    }

    public ElasticResourcePoolScaleRecord withRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /**
     * 操作完成时间
     * @return recordTime
     */
    public Long getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
    }

    public ElasticResourcePoolScaleRecord withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 扩缩容成功或者失败的状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ElasticResourcePoolScaleRecord withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 失败原因
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
        ElasticResourcePoolScaleRecord that = (ElasticResourcePoolScaleRecord) obj;
        return Objects.equals(this.maxCu, that.maxCu) && Objects.equals(this.minCu, that.minCu)
            && Objects.equals(this.currentCu, that.currentCu) && Objects.equals(this.originCu, that.originCu)
            && Objects.equals(this.targetCu, that.targetCu) && Objects.equals(this.recordTime, that.recordTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.failReason, that.failReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxCu, minCu, currentCu, originCu, targetCu, recordTime, status, failReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ElasticResourcePoolScaleRecord {\n");
        sb.append("    maxCu: ").append(toIndentedString(maxCu)).append("\n");
        sb.append("    minCu: ").append(toIndentedString(minCu)).append("\n");
        sb.append("    currentCu: ").append(toIndentedString(currentCu)).append("\n");
        sb.append("    originCu: ").append(toIndentedString(originCu)).append("\n");
        sb.append("    targetCu: ").append(toIndentedString(targetCu)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
