package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 基线信息
 */
public class RiskHandleInfoBaseLineInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_risk_host_num")

    private Long configRiskHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_risk_num")

    private Long configRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passed_rate")

    private Float passedRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beat_rate")

    private Float beatRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_pwd_num")

    private Long weakPwdNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passed_num")

    private Long passedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_config_risk_num")

    private Long totalConfigRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_recommend")

    private String versionRecommend;

    public RiskHandleInfoBaseLineInfo withConfigRiskHostNum(Long configRiskHostNum) {
        this.configRiskHostNum = configRiskHostNum;
        return this;
    }

    /**
     * **参数解释**: 存在配置风险的主机数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return configRiskHostNum
     */
    public Long getConfigRiskHostNum() {
        return configRiskHostNum;
    }

    public void setConfigRiskHostNum(Long configRiskHostNum) {
        this.configRiskHostNum = configRiskHostNum;
    }

    public RiskHandleInfoBaseLineInfo withConfigRiskNum(Long configRiskNum) {
        this.configRiskNum = configRiskNum;
        return this;
    }

    /**
     * **参数解释**: 存在的配置风险数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return configRiskNum
     */
    public Long getConfigRiskNum() {
        return configRiskNum;
    }

    public void setConfigRiskNum(Long configRiskNum) {
        this.configRiskNum = configRiskNum;
    }

    public RiskHandleInfoBaseLineInfo withPassedRate(Float passedRate) {
        this.passedRate = passedRate;
        return this;
    }

    /**
     * **参数解释**: 通过率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return passedRate
     */
    public Float getPassedRate() {
        return passedRate;
    }

    public void setPassedRate(Float passedRate) {
        this.passedRate = passedRate;
    }

    public RiskHandleInfoBaseLineInfo withBeatRate(Float beatRate) {
        this.beatRate = beatRate;
        return this;
    }

    /**
     * **参数解释**: 通过率击败的用户率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return beatRate
     */
    public Float getBeatRate() {
        return beatRate;
    }

    public void setBeatRate(Float beatRate) {
        this.beatRate = beatRate;
    }

    public RiskHandleInfoBaseLineInfo withWeakPwdNum(Long weakPwdNum) {
        this.weakPwdNum = weakPwdNum;
        return this;
    }

    /**
     * **参数解释**: 弱口令数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return weakPwdNum
     */
    public Long getWeakPwdNum() {
        return weakPwdNum;
    }

    public void setWeakPwdNum(Long weakPwdNum) {
        this.weakPwdNum = weakPwdNum;
    }

    public RiskHandleInfoBaseLineInfo withPassedNum(Long passedNum) {
        this.passedNum = passedNum;
        return this;
    }

    /**
     * **参数解释**: 通过量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return passedNum
     */
    public Long getPassedNum() {
        return passedNum;
    }

    public void setPassedNum(Long passedNum) {
        this.passedNum = passedNum;
    }

    public RiskHandleInfoBaseLineInfo withTotalConfigRiskNum(Long totalConfigRiskNum) {
        this.totalConfigRiskNum = totalConfigRiskNum;
        return this;
    }

    /**
     * **参数解释**: 总的风险数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalConfigRiskNum
     */
    public Long getTotalConfigRiskNum() {
        return totalConfigRiskNum;
    }

    public void setTotalConfigRiskNum(Long totalConfigRiskNum) {
        this.totalConfigRiskNum = totalConfigRiskNum;
    }

    public RiskHandleInfoBaseLineInfo withVersionRecommend(String versionRecommend) {
        this.versionRecommend = versionRecommend;
        return this;
    }

    /**
     * **参数解释**: 推荐版本，只支持企业版 hss.version.enterprise **取值范围**: 字符长度1-32位 
     * @return versionRecommend
     */
    public String getVersionRecommend() {
        return versionRecommend;
    }

    public void setVersionRecommend(String versionRecommend) {
        this.versionRecommend = versionRecommend;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RiskHandleInfoBaseLineInfo that = (RiskHandleInfoBaseLineInfo) obj;
        return Objects.equals(this.configRiskHostNum, that.configRiskHostNum)
            && Objects.equals(this.configRiskNum, that.configRiskNum)
            && Objects.equals(this.passedRate, that.passedRate) && Objects.equals(this.beatRate, that.beatRate)
            && Objects.equals(this.weakPwdNum, that.weakPwdNum) && Objects.equals(this.passedNum, that.passedNum)
            && Objects.equals(this.totalConfigRiskNum, that.totalConfigRiskNum)
            && Objects.equals(this.versionRecommend, that.versionRecommend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configRiskHostNum,
            configRiskNum,
            passedRate,
            beatRate,
            weakPwdNum,
            passedNum,
            totalConfigRiskNum,
            versionRecommend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RiskHandleInfoBaseLineInfo {\n");
        sb.append("    configRiskHostNum: ").append(toIndentedString(configRiskHostNum)).append("\n");
        sb.append("    configRiskNum: ").append(toIndentedString(configRiskNum)).append("\n");
        sb.append("    passedRate: ").append(toIndentedString(passedRate)).append("\n");
        sb.append("    beatRate: ").append(toIndentedString(beatRate)).append("\n");
        sb.append("    weakPwdNum: ").append(toIndentedString(weakPwdNum)).append("\n");
        sb.append("    passedNum: ").append(toIndentedString(passedNum)).append("\n");
        sb.append("    totalConfigRiskNum: ").append(toIndentedString(totalConfigRiskNum)).append("\n");
        sb.append("    versionRecommend: ").append(toIndentedString(versionRecommend)).append("\n");
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
