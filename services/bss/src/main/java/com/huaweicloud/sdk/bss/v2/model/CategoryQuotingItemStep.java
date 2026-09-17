package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 分类报价项阶梯信息
 */
public class CategoryQuotingItemStep {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_id")

    private String stepId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_no")

    private String stepNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_start")

    private BigDecimal stepStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_measure_id")

    private Integer startMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_end")

    private BigDecimal stepEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_measure_id")

    private Integer endMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_code")

    private String siteCode;

    public CategoryQuotingItemStep withStepId(String stepId) {
        this.stepId = stepId;
        return this;
    }

    /**
     * 阶梯ID
     * @return stepId
     */
    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public CategoryQuotingItemStep withStepNo(String stepNo) {
        this.stepNo = stepNo;
        return this;
    }

    /**
     * 阶梯编号
     * @return stepNo
     */
    public String getStepNo() {
        return stepNo;
    }

    public void setStepNo(String stepNo) {
        this.stepNo = stepNo;
    }

    public CategoryQuotingItemStep withStepStart(BigDecimal stepStart) {
        this.stepStart = stepStart;
        return this;
    }

    /**
     * 阶梯起始值
     * @return stepStart
     */
    public BigDecimal getStepStart() {
        return stepStart;
    }

    public void setStepStart(BigDecimal stepStart) {
        this.stepStart = stepStart;
    }

    public CategoryQuotingItemStep withStartMeasureId(Integer startMeasureId) {
        this.startMeasureId = startMeasureId;
        return this;
    }

    /**
     * 起始值度量单位
     * @return startMeasureId
     */
    public Integer getStartMeasureId() {
        return startMeasureId;
    }

    public void setStartMeasureId(Integer startMeasureId) {
        this.startMeasureId = startMeasureId;
    }

    public CategoryQuotingItemStep withStepEnd(BigDecimal stepEnd) {
        this.stepEnd = stepEnd;
        return this;
    }

    /**
     * 阶梯结束值
     * @return stepEnd
     */
    public BigDecimal getStepEnd() {
        return stepEnd;
    }

    public void setStepEnd(BigDecimal stepEnd) {
        this.stepEnd = stepEnd;
    }

    public CategoryQuotingItemStep withEndMeasureId(Integer endMeasureId) {
        this.endMeasureId = endMeasureId;
        return this;
    }

    /**
     * 结束值度量单位
     * @return endMeasureId
     */
    public Integer getEndMeasureId() {
        return endMeasureId;
    }

    public void setEndMeasureId(Integer endMeasureId) {
        this.endMeasureId = endMeasureId;
    }

    public CategoryQuotingItemStep withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 阶梯生效时间，UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public CategoryQuotingItemStep withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 阶梯失效时间，UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public CategoryQuotingItemStep withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * 运营站点编码
     * @return siteCode
     */
    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CategoryQuotingItemStep that = (CategoryQuotingItemStep) obj;
        return Objects.equals(this.stepId, that.stepId) && Objects.equals(this.stepNo, that.stepNo)
            && Objects.equals(this.stepStart, that.stepStart)
            && Objects.equals(this.startMeasureId, that.startMeasureId) && Objects.equals(this.stepEnd, that.stepEnd)
            && Objects.equals(this.endMeasureId, that.endMeasureId)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.siteCode, that.siteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepId,
            stepNo,
            stepStart,
            startMeasureId,
            stepEnd,
            endMeasureId,
            effectiveTime,
            expireTime,
            siteCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryQuotingItemStep {\n");
        sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
        sb.append("    stepNo: ").append(toIndentedString(stepNo)).append("\n");
        sb.append("    stepStart: ").append(toIndentedString(stepStart)).append("\n");
        sb.append("    startMeasureId: ").append(toIndentedString(startMeasureId)).append("\n");
        sb.append("    stepEnd: ").append(toIndentedString(stepEnd)).append("\n");
        sb.append("    endMeasureId: ").append(toIndentedString(endMeasureId)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    siteCode: ").append(toIndentedString(siteCode)).append("\n");
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
