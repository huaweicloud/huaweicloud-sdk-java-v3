package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BestPracticeCheckItemDetail
 */
public class BestPracticeCheckItemDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item")

    private Integer checkItem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_name")

    private String checkItemName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_description")

    private String riskDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private String scene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    public BestPracticeCheckItemDetail withCheckItem(Integer checkItem) {
        this.checkItem = checkItem;
        return this;
    }

    /**
     * 检查项编号
     * @return checkItem
     */
    public Integer getCheckItem() {
        return checkItem;
    }

    public void setCheckItem(Integer checkItem) {
        this.checkItem = checkItem;
    }

    public BestPracticeCheckItemDetail withCheckItemName(String checkItemName) {
        this.checkItemName = checkItemName;
        return this;
    }

    /**
     * 检查项描述
     * @return checkItemName
     */
    public String getCheckItemName() {
        return checkItemName;
    }

    public void setCheckItemName(String checkItemName) {
        this.checkItemName = checkItemName;
    }

    public BestPracticeCheckItemDetail withRiskDescription(String riskDescription) {
        this.riskDescription = riskDescription;
        return this;
    }

    /**
     * 检查项风险描述
     * @return riskDescription
     */
    public String getRiskDescription() {
        return riskDescription;
    }

    public void setRiskDescription(String riskDescription) {
        this.riskDescription = riskDescription;
    }

    public BestPracticeCheckItemDetail withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 检测结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public BestPracticeCheckItemDetail withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 八大领域的细分场景
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public BestPracticeCheckItemDetail withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BestPracticeCheckItemDetail that = (BestPracticeCheckItemDetail) obj;
        return Objects.equals(this.checkItem, that.checkItem) && Objects.equals(this.checkItemName, that.checkItemName)
            && Objects.equals(this.riskDescription, that.riskDescription) && Objects.equals(this.result, that.result)
            && Objects.equals(this.scene, that.scene) && Objects.equals(this.riskLevel, that.riskLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkItem, checkItemName, riskDescription, result, scene, riskLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BestPracticeCheckItemDetail {\n");
        sb.append("    checkItem: ").append(toIndentedString(checkItem)).append("\n");
        sb.append("    checkItemName: ").append(toIndentedString(checkItemName)).append("\n");
        sb.append("    riskDescription: ").append(toIndentedString(riskDescription)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
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
