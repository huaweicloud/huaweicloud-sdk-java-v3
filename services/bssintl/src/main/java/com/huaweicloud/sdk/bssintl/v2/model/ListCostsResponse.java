package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListCostsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_data")

    private List<CostDataByDimension> costData = null;

    public ListCostsResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /** |参数名称：总条数| |参数约束及描述：总条数|
     * 
     * @return currency */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ListCostsResponse withCostData(List<CostDataByDimension> costData) {
        this.costData = costData;
        return this;
    }

    public ListCostsResponse addCostDataItem(CostDataByDimension costDataItem) {
        if (this.costData == null) {
            this.costData = new ArrayList<>();
        }
        this.costData.add(costDataItem);
        return this;
    }

    public ListCostsResponse withCostData(Consumer<List<CostDataByDimension>> costDataSetter) {
        if (this.costData == null) {
            this.costData = new ArrayList<>();
        }
        costDataSetter.accept(this.costData);
        return this;
    }

    /** |参数名称：币种| |参数约束以及描述：币种|
     * 
     * @return costData */
    public List<CostDataByDimension> getCostData() {
        return costData;
    }

    public void setCostData(List<CostDataByDimension> costData) {
        this.costData = costData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCostsResponse listCostsResponse = (ListCostsResponse) o;
        return Objects.equals(this.currency, listCostsResponse.currency)
            && Objects.equals(this.costData, listCostsResponse.costData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, costData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCostsResponse {\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    costData: ").append(toIndentedString(costData)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
