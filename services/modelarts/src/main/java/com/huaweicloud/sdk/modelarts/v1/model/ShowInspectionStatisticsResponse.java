package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInspectionStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_item_total")

    private Integer abnormalItemTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_category_statistic")

    private List<InspectionCategoryStatistic> itemCategoryStatistic = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_total")

    private Integer itemTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowInspectionStatisticsResponse withAbnormalItemTotal(Integer abnormalItemTotal) {
        this.abnormalItemTotal = abnormalItemTotal;
        return this;
    }

    /**
     * **参数解释**：异常巡检项总数。 **取值范围**：[0,1000]。
     * minimum: 0
     * maximum: 1000
     * @return abnormalItemTotal
     */
    public Integer getAbnormalItemTotal() {
        return abnormalItemTotal;
    }

    public void setAbnormalItemTotal(Integer abnormalItemTotal) {
        this.abnormalItemTotal = abnormalItemTotal;
    }

    public ShowInspectionStatisticsResponse withItemCategoryStatistic(
        List<InspectionCategoryStatistic> itemCategoryStatistic) {
        this.itemCategoryStatistic = itemCategoryStatistic;
        return this;
    }

    public ShowInspectionStatisticsResponse addItemCategoryStatisticItem(
        InspectionCategoryStatistic itemCategoryStatisticItem) {
        if (this.itemCategoryStatistic == null) {
            this.itemCategoryStatistic = new ArrayList<>();
        }
        this.itemCategoryStatistic.add(itemCategoryStatisticItem);
        return this;
    }

    public ShowInspectionStatisticsResponse withItemCategoryStatistic(
        Consumer<List<InspectionCategoryStatistic>> itemCategoryStatisticSetter) {
        if (this.itemCategoryStatistic == null) {
            this.itemCategoryStatistic = new ArrayList<>();
        }
        itemCategoryStatisticSetter.accept(this.itemCategoryStatistic);
        return this;
    }

    /**
     * **参数解释**：巡检项统计信息。
     * @return itemCategoryStatistic
     */
    public List<InspectionCategoryStatistic> getItemCategoryStatistic() {
        return itemCategoryStatistic;
    }

    public void setItemCategoryStatistic(List<InspectionCategoryStatistic> itemCategoryStatistic) {
        this.itemCategoryStatistic = itemCategoryStatistic;
    }

    public ShowInspectionStatisticsResponse withItemTotal(Integer itemTotal) {
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

    public ShowInspectionStatisticsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInspectionStatisticsResponse that = (ShowInspectionStatisticsResponse) obj;
        return Objects.equals(this.abnormalItemTotal, that.abnormalItemTotal)
            && Objects.equals(this.itemCategoryStatistic, that.itemCategoryStatistic)
            && Objects.equals(this.itemTotal, that.itemTotal) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abnormalItemTotal, itemCategoryStatistic, itemTotal, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInspectionStatisticsResponse {\n");
        sb.append("    abnormalItemTotal: ").append(toIndentedString(abnormalItemTotal)).append("\n");
        sb.append("    itemCategoryStatistic: ").append(toIndentedString(itemCategoryStatistic)).append("\n");
        sb.append("    itemTotal: ").append(toIndentedString(itemTotal)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
