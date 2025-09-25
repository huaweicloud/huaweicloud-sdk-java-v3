package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSecurityRiskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_risk")

    private AlarmRiskInfo alarmRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_risk")

    private SecurityRiskResponseBaselineRisk baselineRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_risk")

    private SecurityRiskResponseAssetRisk assetRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_protect_risk")

    private SecurityRiskResponseSecurityProtectRisk securityProtectRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_risk")

    private SecurityRiskResponseVulRisk vulRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_risk")

    private SecurityRiskResponseImageRisk imageRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_risk_num")

    private Integer totalRiskNum;

    public ListSecurityRiskResponse withAlarmRisk(AlarmRiskInfo alarmRisk) {
        this.alarmRisk = alarmRisk;
        return this;
    }

    public ListSecurityRiskResponse withAlarmRisk(Consumer<AlarmRiskInfo> alarmRiskSetter) {
        if (this.alarmRisk == null) {
            this.alarmRisk = new AlarmRiskInfo();
            alarmRiskSetter.accept(this.alarmRisk);
        }

        return this;
    }

    /**
     * Get alarmRisk
     * @return alarmRisk
     */
    public AlarmRiskInfo getAlarmRisk() {
        return alarmRisk;
    }

    public void setAlarmRisk(AlarmRiskInfo alarmRisk) {
        this.alarmRisk = alarmRisk;
    }

    public ListSecurityRiskResponse withBaselineRisk(SecurityRiskResponseBaselineRisk baselineRisk) {
        this.baselineRisk = baselineRisk;
        return this;
    }

    public ListSecurityRiskResponse withBaselineRisk(Consumer<SecurityRiskResponseBaselineRisk> baselineRiskSetter) {
        if (this.baselineRisk == null) {
            this.baselineRisk = new SecurityRiskResponseBaselineRisk();
            baselineRiskSetter.accept(this.baselineRisk);
        }

        return this;
    }

    /**
     * Get baselineRisk
     * @return baselineRisk
     */
    public SecurityRiskResponseBaselineRisk getBaselineRisk() {
        return baselineRisk;
    }

    public void setBaselineRisk(SecurityRiskResponseBaselineRisk baselineRisk) {
        this.baselineRisk = baselineRisk;
    }

    public ListSecurityRiskResponse withAssetRisk(SecurityRiskResponseAssetRisk assetRisk) {
        this.assetRisk = assetRisk;
        return this;
    }

    public ListSecurityRiskResponse withAssetRisk(Consumer<SecurityRiskResponseAssetRisk> assetRiskSetter) {
        if (this.assetRisk == null) {
            this.assetRisk = new SecurityRiskResponseAssetRisk();
            assetRiskSetter.accept(this.assetRisk);
        }

        return this;
    }

    /**
     * Get assetRisk
     * @return assetRisk
     */
    public SecurityRiskResponseAssetRisk getAssetRisk() {
        return assetRisk;
    }

    public void setAssetRisk(SecurityRiskResponseAssetRisk assetRisk) {
        this.assetRisk = assetRisk;
    }

    public ListSecurityRiskResponse withSecurityProtectRisk(
        SecurityRiskResponseSecurityProtectRisk securityProtectRisk) {
        this.securityProtectRisk = securityProtectRisk;
        return this;
    }

    public ListSecurityRiskResponse withSecurityProtectRisk(
        Consumer<SecurityRiskResponseSecurityProtectRisk> securityProtectRiskSetter) {
        if (this.securityProtectRisk == null) {
            this.securityProtectRisk = new SecurityRiskResponseSecurityProtectRisk();
            securityProtectRiskSetter.accept(this.securityProtectRisk);
        }

        return this;
    }

    /**
     * Get securityProtectRisk
     * @return securityProtectRisk
     */
    public SecurityRiskResponseSecurityProtectRisk getSecurityProtectRisk() {
        return securityProtectRisk;
    }

    public void setSecurityProtectRisk(SecurityRiskResponseSecurityProtectRisk securityProtectRisk) {
        this.securityProtectRisk = securityProtectRisk;
    }

    public ListSecurityRiskResponse withVulRisk(SecurityRiskResponseVulRisk vulRisk) {
        this.vulRisk = vulRisk;
        return this;
    }

    public ListSecurityRiskResponse withVulRisk(Consumer<SecurityRiskResponseVulRisk> vulRiskSetter) {
        if (this.vulRisk == null) {
            this.vulRisk = new SecurityRiskResponseVulRisk();
            vulRiskSetter.accept(this.vulRisk);
        }

        return this;
    }

    /**
     * Get vulRisk
     * @return vulRisk
     */
    public SecurityRiskResponseVulRisk getVulRisk() {
        return vulRisk;
    }

    public void setVulRisk(SecurityRiskResponseVulRisk vulRisk) {
        this.vulRisk = vulRisk;
    }

    public ListSecurityRiskResponse withImageRisk(SecurityRiskResponseImageRisk imageRisk) {
        this.imageRisk = imageRisk;
        return this;
    }

    public ListSecurityRiskResponse withImageRisk(Consumer<SecurityRiskResponseImageRisk> imageRiskSetter) {
        if (this.imageRisk == null) {
            this.imageRisk = new SecurityRiskResponseImageRisk();
            imageRiskSetter.accept(this.imageRisk);
        }

        return this;
    }

    /**
     * Get imageRisk
     * @return imageRisk
     */
    public SecurityRiskResponseImageRisk getImageRisk() {
        return imageRisk;
    }

    public void setImageRisk(SecurityRiskResponseImageRisk imageRisk) {
        this.imageRisk = imageRisk;
    }

    public ListSecurityRiskResponse withTotalRiskNum(Integer totalRiskNum) {
        this.totalRiskNum = totalRiskNum;
        return this;
    }

    /**
     * **参数解释**： 总风险数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalRiskNum
     */
    public Integer getTotalRiskNum() {
        return totalRiskNum;
    }

    public void setTotalRiskNum(Integer totalRiskNum) {
        this.totalRiskNum = totalRiskNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityRiskResponse that = (ListSecurityRiskResponse) obj;
        return Objects.equals(this.alarmRisk, that.alarmRisk) && Objects.equals(this.baselineRisk, that.baselineRisk)
            && Objects.equals(this.assetRisk, that.assetRisk)
            && Objects.equals(this.securityProtectRisk, that.securityProtectRisk)
            && Objects.equals(this.vulRisk, that.vulRisk) && Objects.equals(this.imageRisk, that.imageRisk)
            && Objects.equals(this.totalRiskNum, that.totalRiskNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRisk, baselineRisk, assetRisk, securityProtectRisk, vulRisk, imageRisk, totalRiskNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityRiskResponse {\n");
        sb.append("    alarmRisk: ").append(toIndentedString(alarmRisk)).append("\n");
        sb.append("    baselineRisk: ").append(toIndentedString(baselineRisk)).append("\n");
        sb.append("    assetRisk: ").append(toIndentedString(assetRisk)).append("\n");
        sb.append("    securityProtectRisk: ").append(toIndentedString(securityProtectRisk)).append("\n");
        sb.append("    vulRisk: ").append(toIndentedString(vulRisk)).append("\n");
        sb.append("    imageRisk: ").append(toIndentedString(imageRisk)).append("\n");
        sb.append("    totalRiskNum: ").append(toIndentedString(totalRiskNum)).append("\n");
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
