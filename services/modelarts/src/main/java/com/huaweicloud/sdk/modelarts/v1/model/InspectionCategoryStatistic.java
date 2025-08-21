package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：巡检项统计信息。
 */
public class InspectionCategoryStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_item_total")

    private Integer abnormalItemTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private InspectionItemCategory category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_name")

    private String categoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_total")

    private Integer itemTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public InspectionCategoryStatistic withAbnormalItemTotal(Integer abnormalItemTotal) {
        this.abnormalItemTotal = abnormalItemTotal;
        return this;
    }

    /**
     * **参数解释**：结果异常的巡检项数量。 **取值范围**：[0,1000]。
     * @return abnormalItemTotal
     */
    public Integer getAbnormalItemTotal() {
        return abnormalItemTotal;
    }

    public void setAbnormalItemTotal(Integer abnormalItemTotal) {
        this.abnormalItemTotal = abnormalItemTotal;
    }

    public InspectionCategoryStatistic withCategory(InspectionItemCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    public InspectionItemCategory getCategory() {
        return category;
    }

    public void setCategory(InspectionItemCategory category) {
        this.category = category;
    }

    public InspectionCategoryStatistic withCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * **参数解释**：巡检类目名称。 **取值范围**：[0,50]。
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public InspectionCategoryStatistic withItemTotal(Integer itemTotal) {
        this.itemTotal = itemTotal;
        return this;
    }

    /**
     * **参数解释**：巡检项总数。 **取值范围**：[0,1000]。
     * minimum: 0
     * maximum: 1000
     * @return itemTotal
     */
    public Integer getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(Integer itemTotal) {
        this.itemTotal = itemTotal;
    }

    public InspectionCategoryStatistic withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**：巡检异常信息。 **取值范围**：[0,500]。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InspectionCategoryStatistic that = (InspectionCategoryStatistic) obj;
        return Objects.equals(this.abnormalItemTotal, that.abnormalItemTotal)
            && Objects.equals(this.category, that.category) && Objects.equals(this.categoryName, that.categoryName)
            && Objects.equals(this.itemTotal, that.itemTotal) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abnormalItemTotal, category, categoryName, itemTotal, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InspectionCategoryStatistic {\n");
        sb.append("    abnormalItemTotal: ").append(toIndentedString(abnormalItemTotal)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
        sb.append("    itemTotal: ").append(toIndentedString(itemTotal)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
