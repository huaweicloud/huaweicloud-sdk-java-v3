package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CostDataByDimension
 */
public class CostDataByDimension {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private List<DimensionGroup> dimensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "costs")

    private List<Cost> costs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount_by_costs")

    private String amountByCosts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_amount_by_costs")

    private String officialAmountByCosts;

    public CostDataByDimension withDimensions(List<DimensionGroup> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public CostDataByDimension addDimensionsItem(DimensionGroup dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public CostDataByDimension withDimensions(Consumer<List<DimensionGroup>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 维度列表，具体请参见表 DimensionGroup。
     * @return dimensions
     */
    public List<DimensionGroup> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<DimensionGroup> dimensions) {
        this.dimensions = dimensions;
    }

    public CostDataByDimension withCosts(List<Cost> costs) {
        this.costs = costs;
        return this;
    }

    public CostDataByDimension addCostsItem(Cost costsItem) {
        if (this.costs == null) {
            this.costs = new ArrayList<>();
        }
        this.costs.add(costsItem);
        return this;
    }

    public CostDataByDimension withCosts(Consumer<List<Cost>> costsSetter) {
        if (this.costs == null) {
            this.costs = new ArrayList<>();
        }
        costsSetter.accept(this.costs);
        return this;
    }

    /**
     * 成本值，具体请参见表 Cost。
     * @return costs
     */
    public List<Cost> getCosts() {
        return costs;
    }

    public void setCosts(List<Cost> costs) {
        this.costs = costs;
    }

    public CostDataByDimension withAmountByCosts(String amountByCosts) {
        this.amountByCosts = amountByCosts;
        return this;
    }

    /**
     * 此维度值对应整个时间跨度的成本汇总金额。
     * @return amountByCosts
     */
    public String getAmountByCosts() {
        return amountByCosts;
    }

    public void setAmountByCosts(String amountByCosts) {
        this.amountByCosts = amountByCosts;
    }

    public CostDataByDimension withOfficialAmountByCosts(String officialAmountByCosts) {
        this.officialAmountByCosts = officialAmountByCosts;
        return this;
    }

    /**
     * 此维度值对应整个时间跨度的官网价汇总金额。
     * @return officialAmountByCosts
     */
    public String getOfficialAmountByCosts() {
        return officialAmountByCosts;
    }

    public void setOfficialAmountByCosts(String officialAmountByCosts) {
        this.officialAmountByCosts = officialAmountByCosts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CostDataByDimension that = (CostDataByDimension) obj;
        return Objects.equals(this.dimensions, that.dimensions) && Objects.equals(this.costs, that.costs)
            && Objects.equals(this.amountByCosts, that.amountByCosts)
            && Objects.equals(this.officialAmountByCosts, that.officialAmountByCosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, costs, amountByCosts, officialAmountByCosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CostDataByDimension {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
        sb.append("    amountByCosts: ").append(toIndentedString(amountByCosts)).append("\n");
        sb.append("    officialAmountByCosts: ").append(toIndentedString(officialAmountByCosts)).append("\n");
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
