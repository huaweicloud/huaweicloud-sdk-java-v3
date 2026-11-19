package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TrendRiskInfo
 */
public class TrendRiskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_risk_num")

    private Integer baselineRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_risk_num")

    private Integer assetRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_risk_num")

    private Integer alarmRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_risk_num")

    private Integer vulRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Float score;

    public TrendRiskInfo withBaselineRiskNum(Integer baselineRiskNum) {
        this.baselineRiskNum = baselineRiskNum;
        return this;
    }

    /**
     * **参数解释**: 基线风险数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return baselineRiskNum
     */
    public Integer getBaselineRiskNum() {
        return baselineRiskNum;
    }

    public void setBaselineRiskNum(Integer baselineRiskNum) {
        this.baselineRiskNum = baselineRiskNum;
    }

    public TrendRiskInfo withAssetRiskNum(Integer assetRiskNum) {
        this.assetRiskNum = assetRiskNum;
        return this;
    }

    /**
     * **参数解释**: 资产风险数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return assetRiskNum
     */
    public Integer getAssetRiskNum() {
        return assetRiskNum;
    }

    public void setAssetRiskNum(Integer assetRiskNum) {
        this.assetRiskNum = assetRiskNum;
    }

    public TrendRiskInfo withAlarmRiskNum(Integer alarmRiskNum) {
        this.alarmRiskNum = alarmRiskNum;
        return this;
    }

    /**
     * **参数解释**: 告警数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return alarmRiskNum
     */
    public Integer getAlarmRiskNum() {
        return alarmRiskNum;
    }

    public void setAlarmRiskNum(Integer alarmRiskNum) {
        this.alarmRiskNum = alarmRiskNum;
    }

    public TrendRiskInfo withVulRiskNum(Integer vulRiskNum) {
        this.vulRiskNum = vulRiskNum;
        return this;
    }

    /**
     * **参数解释**: 漏洞数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return vulRiskNum
     */
    public Integer getVulRiskNum() {
        return vulRiskNum;
    }

    public void setVulRiskNum(Integer vulRiskNum) {
        this.vulRiskNum = vulRiskNum;
    }

    public TrendRiskInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间 **取值范围**： 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public TrendRiskInfo withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * **参数解释**: 时间，毫秒级时间戳 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public TrendRiskInfo withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * **参数解释**: 分数 **取值范围**: 最小值0，最大值100 
     * minimum: 0
     * maximum: 1E+2
     * @return score
     */
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrendRiskInfo that = (TrendRiskInfo) obj;
        return Objects.equals(this.baselineRiskNum, that.baselineRiskNum)
            && Objects.equals(this.assetRiskNum, that.assetRiskNum)
            && Objects.equals(this.alarmRiskNum, that.alarmRiskNum) && Objects.equals(this.vulRiskNum, that.vulRiskNum)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.time, that.time)
            && Objects.equals(this.score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baselineRiskNum, assetRiskNum, alarmRiskNum, vulRiskNum, updateTime, time, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrendRiskInfo {\n");
        sb.append("    baselineRiskNum: ").append(toIndentedString(baselineRiskNum)).append("\n");
        sb.append("    assetRiskNum: ").append(toIndentedString(assetRiskNum)).append("\n");
        sb.append("    alarmRiskNum: ").append(toIndentedString(alarmRiskNum)).append("\n");
        sb.append("    vulRiskNum: ").append(toIndentedString(vulRiskNum)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
