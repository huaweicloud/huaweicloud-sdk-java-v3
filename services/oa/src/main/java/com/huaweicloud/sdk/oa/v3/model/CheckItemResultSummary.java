package com.huaweicloud.sdk.oa.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckItemResultSummary
 */
public class CheckItemResultSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_id")

    private String checkItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_dimension")

    private String checkItemDimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_service")

    private String checkItemService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_risk_level")

    private String checkItemRiskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_status")

    private String checkItemStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_name")

    private String checkItemName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_description")

    private String checkItemDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_item_advice")

    private String checkItemAdvice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources_summary")

    private ResourcesSummary resourcesSummary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public CheckItemResultSummary withCheckItemId(String checkItemId) {
        this.checkItemId = checkItemId;
        return this;
    }

    /**
     * 检查项唯一编号
     * @return checkItemId
     */
    public String getCheckItemId() {
        return checkItemId;
    }

    public void setCheckItemId(String checkItemId) {
        this.checkItemId = checkItemId;
    }

    public CheckItemResultSummary withCheckItemDimension(String checkItemDimension) {
        this.checkItemDimension = checkItemDimension;
        return this;
    }

    /**
     * 检查项维度
     * @return checkItemDimension
     */
    public String getCheckItemDimension() {
        return checkItemDimension;
    }

    public void setCheckItemDimension(String checkItemDimension) {
        this.checkItemDimension = checkItemDimension;
    }

    public CheckItemResultSummary withCheckItemService(String checkItemService) {
        this.checkItemService = checkItemService;
        return this;
    }

    /**
     * 所属云服务
     * @return checkItemService
     */
    public String getCheckItemService() {
        return checkItemService;
    }

    public void setCheckItemService(String checkItemService) {
        this.checkItemService = checkItemService;
    }

    public CheckItemResultSummary withCheckItemRiskLevel(String checkItemRiskLevel) {
        this.checkItemRiskLevel = checkItemRiskLevel;
        return this;
    }

    /**
     * 检查项风险等级
     * @return checkItemRiskLevel
     */
    public String getCheckItemRiskLevel() {
        return checkItemRiskLevel;
    }

    public void setCheckItemRiskLevel(String checkItemRiskLevel) {
        this.checkItemRiskLevel = checkItemRiskLevel;
    }

    public CheckItemResultSummary withCheckItemStatus(String checkItemStatus) {
        this.checkItemStatus = checkItemStatus;
        return this;
    }

    /**
     * 检查项状态
     * @return checkItemStatus
     */
    public String getCheckItemStatus() {
        return checkItemStatus;
    }

    public void setCheckItemStatus(String checkItemStatus) {
        this.checkItemStatus = checkItemStatus;
    }

    public CheckItemResultSummary withCheckItemName(String checkItemName) {
        this.checkItemName = checkItemName;
        return this;
    }

    /**
     * 检查项名称
     * @return checkItemName
     */
    public String getCheckItemName() {
        return checkItemName;
    }

    public void setCheckItemName(String checkItemName) {
        this.checkItemName = checkItemName;
    }

    public CheckItemResultSummary withCheckItemDescription(String checkItemDescription) {
        this.checkItemDescription = checkItemDescription;
        return this;
    }

    /**
     * 检查项描述
     * @return checkItemDescription
     */
    public String getCheckItemDescription() {
        return checkItemDescription;
    }

    public void setCheckItemDescription(String checkItemDescription) {
        this.checkItemDescription = checkItemDescription;
    }

    public CheckItemResultSummary withCheckItemAdvice(String checkItemAdvice) {
        this.checkItemAdvice = checkItemAdvice;
        return this;
    }

    /**
     * 检查项描述
     * @return checkItemAdvice
     */
    public String getCheckItemAdvice() {
        return checkItemAdvice;
    }

    public void setCheckItemAdvice(String checkItemAdvice) {
        this.checkItemAdvice = checkItemAdvice;
    }

    public CheckItemResultSummary withResourcesSummary(ResourcesSummary resourcesSummary) {
        this.resourcesSummary = resourcesSummary;
        return this;
    }

    public CheckItemResultSummary withResourcesSummary(Consumer<ResourcesSummary> resourcesSummarySetter) {
        if (this.resourcesSummary == null) {
            this.resourcesSummary = new ResourcesSummary();
            resourcesSummarySetter.accept(this.resourcesSummary);
        }

        return this;
    }

    /**
     * Get resourcesSummary
     * @return resourcesSummary
     */
    public ResourcesSummary getResourcesSummary() {
        return resourcesSummary;
    }

    public void setResourcesSummary(ResourcesSummary resourcesSummary) {
        this.resourcesSummary = resourcesSummary;
    }

    public CheckItemResultSummary withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * minimum: 0
     * maximum: 4070880000000
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckItemResultSummary that = (CheckItemResultSummary) obj;
        return Objects.equals(this.checkItemId, that.checkItemId)
            && Objects.equals(this.checkItemDimension, that.checkItemDimension)
            && Objects.equals(this.checkItemService, that.checkItemService)
            && Objects.equals(this.checkItemRiskLevel, that.checkItemRiskLevel)
            && Objects.equals(this.checkItemStatus, that.checkItemStatus)
            && Objects.equals(this.checkItemName, that.checkItemName)
            && Objects.equals(this.checkItemDescription, that.checkItemDescription)
            && Objects.equals(this.checkItemAdvice, that.checkItemAdvice)
            && Objects.equals(this.resourcesSummary, that.resourcesSummary)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkItemId,
            checkItemDimension,
            checkItemService,
            checkItemRiskLevel,
            checkItemStatus,
            checkItemName,
            checkItemDescription,
            checkItemAdvice,
            resourcesSummary,
            endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckItemResultSummary {\n");
        sb.append("    checkItemId: ").append(toIndentedString(checkItemId)).append("\n");
        sb.append("    checkItemDimension: ").append(toIndentedString(checkItemDimension)).append("\n");
        sb.append("    checkItemService: ").append(toIndentedString(checkItemService)).append("\n");
        sb.append("    checkItemRiskLevel: ").append(toIndentedString(checkItemRiskLevel)).append("\n");
        sb.append("    checkItemStatus: ").append(toIndentedString(checkItemStatus)).append("\n");
        sb.append("    checkItemName: ").append(toIndentedString(checkItemName)).append("\n");
        sb.append("    checkItemDescription: ").append(toIndentedString(checkItemDescription)).append("\n");
        sb.append("    checkItemAdvice: ").append(toIndentedString(checkItemAdvice)).append("\n");
        sb.append("    resourcesSummary: ").append(toIndentedString(resourcesSummary)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
