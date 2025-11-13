package com.huaweicloud.sdk.eihealth.v2.model;

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
public class ShowDrugJobStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quantity_statistics")

    private List<QuantityStatistics> quantityStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_statistics")

    private List<UsageStatistics> usageStatistics = null;

    public ShowDrugJobStatisticsResponse withQuantityStatistics(List<QuantityStatistics> quantityStatistics) {
        this.quantityStatistics = quantityStatistics;
        return this;
    }

    public ShowDrugJobStatisticsResponse addQuantityStatisticsItem(QuantityStatistics quantityStatisticsItem) {
        if (this.quantityStatistics == null) {
            this.quantityStatistics = new ArrayList<>();
        }
        this.quantityStatistics.add(quantityStatisticsItem);
        return this;
    }

    public ShowDrugJobStatisticsResponse withQuantityStatistics(
        Consumer<List<QuantityStatistics>> quantityStatisticsSetter) {
        if (this.quantityStatistics == null) {
            this.quantityStatistics = new ArrayList<>();
        }
        quantityStatisticsSetter.accept(this.quantityStatistics);
        return this;
    }

    /**
     * **参数解释**： 药物设计作业数量统计结果。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return quantityStatistics
     */
    public List<QuantityStatistics> getQuantityStatistics() {
        return quantityStatistics;
    }

    public void setQuantityStatistics(List<QuantityStatistics> quantityStatistics) {
        this.quantityStatistics = quantityStatistics;
    }

    public ShowDrugJobStatisticsResponse withUsageStatistics(List<UsageStatistics> usageStatistics) {
        this.usageStatistics = usageStatistics;
        return this;
    }

    public ShowDrugJobStatisticsResponse addUsageStatisticsItem(UsageStatistics usageStatisticsItem) {
        if (this.usageStatistics == null) {
            this.usageStatistics = new ArrayList<>();
        }
        this.usageStatistics.add(usageStatisticsItem);
        return this;
    }

    public ShowDrugJobStatisticsResponse withUsageStatistics(Consumer<List<UsageStatistics>> usageStatisticsSetter) {
        if (this.usageStatistics == null) {
            this.usageStatistics = new ArrayList<>();
        }
        usageStatisticsSetter.accept(this.usageStatistics);
        return this;
    }

    /**
     * **参数解释**： 药物设计作业使用量统计结果。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return usageStatistics
     */
    public List<UsageStatistics> getUsageStatistics() {
        return usageStatistics;
    }

    public void setUsageStatistics(List<UsageStatistics> usageStatistics) {
        this.usageStatistics = usageStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDrugJobStatisticsResponse that = (ShowDrugJobStatisticsResponse) obj;
        return Objects.equals(this.quantityStatistics, that.quantityStatistics)
            && Objects.equals(this.usageStatistics, that.usageStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantityStatistics, usageStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDrugJobStatisticsResponse {\n");
        sb.append("    quantityStatistics: ").append(toIndentedString(quantityStatistics)).append("\n");
        sb.append("    usageStatistics: ").append(toIndentedString(usageStatistics)).append("\n");
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
