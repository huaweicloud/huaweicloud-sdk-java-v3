package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 镜像构建指令风险信息
 */
public class ImageBuildCommandRiskResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_scan_time")

    private Long latestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_num")

    private Integer imageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_id")

    private String riskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_name")

    private String riskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    public ImageBuildCommandRiskResponseInfo withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最后一次检测时间，时间单位 毫秒（ms） **取值范围**: 大小0-9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return latestScanTime
     */
    public Long getLatestScanTime() {
        return latestScanTime;
    }

    public void setLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
    }

    public ImageBuildCommandRiskResponseInfo withImageNum(Integer imageNum) {
        this.imageNum = imageNum;
        return this;
    }

    /**
     * **参数解释**: 受影响的镜像的数量，进行了当前构建指令的镜像数量 **取值范围**: 大小0-2097152 
     * minimum: 0
     * maximum: 2097152
     * @return imageNum
     */
    public Integer getImageNum() {
        return imageNum;
    }

    public void setImageNum(Integer imageNum) {
        this.imageNum = imageNum;
    }

    public ImageBuildCommandRiskResponseInfo withRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }

    /**
     * **参数解释** 风险id **取值范围** 字符长度1-64位
     * @return riskId
     */
    public String getRiskId() {
        return riskId;
    }

    public void setRiskId(String riskId) {
        this.riskId = riskId;
    }

    public ImageBuildCommandRiskResponseInfo withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * **参数解释** 风险检测规则id **取值范围** 字符长度1-64位
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public ImageBuildCommandRiskResponseInfo withRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }

    /**
     * **参数解释** 风险名称 **取值范围** 字符长度1-512位
     * @return riskName
     */
    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName;
    }

    public ImageBuildCommandRiskResponseInfo withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * **参数解释** 风险程度 **取值范围** - critical：严重。 - high：高危。 - medium：中危。 - low：低危。
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public ImageBuildCommandRiskResponseInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释** 风险描述 **取值范围** 字符长度0-65534位
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageBuildCommandRiskResponseInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释** 镜像类型 **取值范围** 字符长度1-32位
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageBuildCommandRiskResponseInfo that = (ImageBuildCommandRiskResponseInfo) obj;
        return Objects.equals(this.latestScanTime, that.latestScanTime) && Objects.equals(this.imageNum, that.imageNum)
            && Objects.equals(this.riskId, that.riskId) && Objects.equals(this.ruleId, that.ruleId)
            && Objects.equals(this.riskName, that.riskName) && Objects.equals(this.riskLevel, that.riskLevel)
            && Objects.equals(this.description, that.description) && Objects.equals(this.imageType, that.imageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latestScanTime, imageNum, riskId, ruleId, riskName, riskLevel, description, imageType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageBuildCommandRiskResponseInfo {\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    imageNum: ").append(toIndentedString(imageNum)).append("\n");
        sb.append("    riskId: ").append(toIndentedString(riskId)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    riskName: ").append(toIndentedString(riskName)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
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
