package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ResDetailDTO
 */
public class ResDetailDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sumCount")

    @JacksonXmlProperty(localName = "sumCount")

    private Integer sumCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trialCount")

    @JacksonXmlProperty(localName = "trialCount")

    private Integer trialCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiredCount")

    @JacksonXmlProperty(localName = "expiredCount")

    private Integer expiredCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiringCount")

    @JacksonXmlProperty(localName = "expiringCount")

    private Integer expiringCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usedCount")

    @JacksonXmlProperty(localName = "usedCount")

    private Integer usedCount;

    public ResDetailDTO withSumCount(Integer sumCount) {
        this.sumCount = sumCount;
        return this;
    }

    /**
     * 总数
     * @return sumCount
     */
    public Integer getSumCount() {
        return sumCount;
    }

    public void setSumCount(Integer sumCount) {
        this.sumCount = sumCount;
    }

    public ResDetailDTO withTrialCount(Integer trialCount) {
        this.trialCount = trialCount;
        return this;
    }

    /**
     * 赠送数量
     * @return trialCount
     */
    public Integer getTrialCount() {
        return trialCount;
    }

    public void setTrialCount(Integer trialCount) {
        this.trialCount = trialCount;
    }

    public ResDetailDTO withExpiredCount(Integer expiredCount) {
        this.expiredCount = expiredCount;
        return this;
    }

    /**
     * 到期数量
     * @return expiredCount
     */
    public Integer getExpiredCount() {
        return expiredCount;
    }

    public void setExpiredCount(Integer expiredCount) {
        this.expiredCount = expiredCount;
    }

    public ResDetailDTO withExpiringCount(Integer expiringCount) {
        this.expiringCount = expiringCount;
        return this;
    }

    /**
     * 即将到期数量，到期时间在30天内
     * @return expiringCount
     */
    public Integer getExpiringCount() {
        return expiringCount;
    }

    public void setExpiringCount(Integer expiringCount) {
        this.expiringCount = expiringCount;
    }

    public ResDetailDTO withUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
        return this;
    }

    /**
     * 已使用数（录播存储空间、会议并发、推流并发方数暂无法查询）。
     * @return usedCount
     */
    public Integer getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResDetailDTO resDetailDTO = (ResDetailDTO) o;
        return Objects.equals(this.sumCount, resDetailDTO.sumCount)
            && Objects.equals(this.trialCount, resDetailDTO.trialCount)
            && Objects.equals(this.expiredCount, resDetailDTO.expiredCount)
            && Objects.equals(this.expiringCount, resDetailDTO.expiringCount)
            && Objects.equals(this.usedCount, resDetailDTO.usedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sumCount, trialCount, expiredCount, expiringCount, usedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResDetailDTO {\n");
        sb.append("    sumCount: ").append(toIndentedString(sumCount)).append("\n");
        sb.append("    trialCount: ").append(toIndentedString(trialCount)).append("\n");
        sb.append("    expiredCount: ").append(toIndentedString(expiredCount)).append("\n");
        sb.append("    expiringCount: ").append(toIndentedString(expiringCount)).append("\n");
        sb.append("    usedCount: ").append(toIndentedString(usedCount)).append("\n");
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
