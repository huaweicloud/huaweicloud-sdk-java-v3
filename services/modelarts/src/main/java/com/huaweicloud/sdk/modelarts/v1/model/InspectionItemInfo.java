package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：巡检项信息。 **取值范围**：不涉及。
 */
public class InspectionItemInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_node_count")

    private Integer abnormalNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_status")

    private ExecuteStatus executeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_category")

    private InspectionItemCategory itemCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_category_name")

    private String itemCategoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_type")

    private InspectionItemType itemType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_type_name")

    private String itemTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_count")

    private Integer nodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_status")

    private ResultStatus resultStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_message")

    private String statusMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    public InspectionItemInfo withAbnormalNodeCount(Integer abnormalNodeCount) {
        this.abnormalNodeCount = abnormalNodeCount;
        return this;
    }

    /**
     * **参数解释**：异常节点数量。 **取值范围**：[0,1000]。
     * @return abnormalNodeCount
     */
    public Integer getAbnormalNodeCount() {
        return abnormalNodeCount;
    }

    public void setAbnormalNodeCount(Integer abnormalNodeCount) {
        this.abnormalNodeCount = abnormalNodeCount;
    }

    public InspectionItemInfo withExecuteStatus(ExecuteStatus executeStatus) {
        this.executeStatus = executeStatus;
        return this;
    }

    /**
     * Get executeStatus
     * @return executeStatus
     */
    public ExecuteStatus getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(ExecuteStatus executeStatus) {
        this.executeStatus = executeStatus;
    }

    public InspectionItemInfo withItemCategory(InspectionItemCategory itemCategory) {
        this.itemCategory = itemCategory;
        return this;
    }

    /**
     * Get itemCategory
     * @return itemCategory
     */
    public InspectionItemCategory getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(InspectionItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }

    public InspectionItemInfo withItemCategoryName(String itemCategoryName) {
        this.itemCategoryName = itemCategoryName;
        return this;
    }

    /**
     * **参数解释**：巡检类目名称。 **取值范围**：[0,50]。
     * @return itemCategoryName
     */
    public String getItemCategoryName() {
        return itemCategoryName;
    }

    public void setItemCategoryName(String itemCategoryName) {
        this.itemCategoryName = itemCategoryName;
    }

    public InspectionItemInfo withItemType(InspectionItemType itemType) {
        this.itemType = itemType;
        return this;
    }

    /**
     * Get itemType
     * @return itemType
     */
    public InspectionItemType getItemType() {
        return itemType;
    }

    public void setItemType(InspectionItemType itemType) {
        this.itemType = itemType;
    }

    public InspectionItemInfo withItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
        return this;
    }

    /**
     * **参数解释**：巡检项名称。 **取值范围**：[0,50]。
     * @return itemTypeName
     */
    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    public InspectionItemInfo withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * **参数解释**：节点数量。 **取值范围**：[0,1000]。
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public InspectionItemInfo withResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }

    /**
     * Get resultStatus
     * @return resultStatus
     */
    public ResultStatus getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
    }

    public InspectionItemInfo withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * **参数解释**：状态信息，如执行失败的失败信息。 **取值范围**：[0,500]。
     * @return statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public InspectionItemInfo withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * **参数解释**：处理建议。 **取值范围**：[0,500]。
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public InspectionItemInfo withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * **参数解释**：巡检详情。 **取值范围**：[0,5000]。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InspectionItemInfo that = (InspectionItemInfo) obj;
        return Objects.equals(this.abnormalNodeCount, that.abnormalNodeCount)
            && Objects.equals(this.executeStatus, that.executeStatus)
            && Objects.equals(this.itemCategory, that.itemCategory)
            && Objects.equals(this.itemCategoryName, that.itemCategoryName)
            && Objects.equals(this.itemType, that.itemType) && Objects.equals(this.itemTypeName, that.itemTypeName)
            && Objects.equals(this.nodeCount, that.nodeCount) && Objects.equals(this.resultStatus, that.resultStatus)
            && Objects.equals(this.statusMessage, that.statusMessage)
            && Objects.equals(this.suggestion, that.suggestion) && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abnormalNodeCount,
            executeStatus,
            itemCategory,
            itemCategoryName,
            itemType,
            itemTypeName,
            nodeCount,
            resultStatus,
            statusMessage,
            suggestion,
            detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InspectionItemInfo {\n");
        sb.append("    abnormalNodeCount: ").append(toIndentedString(abnormalNodeCount)).append("\n");
        sb.append("    executeStatus: ").append(toIndentedString(executeStatus)).append("\n");
        sb.append("    itemCategory: ").append(toIndentedString(itemCategory)).append("\n");
        sb.append("    itemCategoryName: ").append(toIndentedString(itemCategoryName)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    itemTypeName: ").append(toIndentedString(itemTypeName)).append("\n");
        sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
        sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
