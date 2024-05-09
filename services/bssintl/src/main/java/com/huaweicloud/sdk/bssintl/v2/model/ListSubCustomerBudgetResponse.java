package com.huaweicloud.sdk.bssintl.v2.model;

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
public class ListSubCustomerBudgetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "budget_infos")

    private List<BudgetInfo> budgetInfos = null;

    public ListSubCustomerBudgetResponse withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * |参数名称：金额单位。||参数的约束及描述：非必填参数|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public ListSubCustomerBudgetResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * |参数名称：货币，CNY：人民币，USD：美元||参数的约束及描述：非必填参数|
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ListSubCustomerBudgetResponse withBudgetInfos(List<BudgetInfo> budgetInfos) {
        this.budgetInfos = budgetInfos;
        return this;
    }

    public ListSubCustomerBudgetResponse addBudgetInfosItem(BudgetInfo budgetInfosItem) {
        if (this.budgetInfos == null) {
            this.budgetInfos = new ArrayList<>();
        }
        this.budgetInfos.add(budgetInfosItem);
        return this;
    }

    public ListSubCustomerBudgetResponse withBudgetInfos(Consumer<List<BudgetInfo>> budgetInfosSetter) {
        if (this.budgetInfos == null) {
            this.budgetInfos = new ArrayList<>();
        }
        budgetInfosSetter.accept(this.budgetInfos);
        return this;
    }

    /**
     * |参数名称：客户预算信息||参数的约束及描述：必填参数|
     * @return budgetInfos
     */
    public List<BudgetInfo> getBudgetInfos() {
        return budgetInfos;
    }

    public void setBudgetInfos(List<BudgetInfo> budgetInfos) {
        this.budgetInfos = budgetInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubCustomerBudgetResponse that = (ListSubCustomerBudgetResponse) obj;
        return Objects.equals(this.measureId, that.measureId) && Objects.equals(this.currency, that.currency)
            && Objects.equals(this.budgetInfos, that.budgetInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(measureId, currency, budgetInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomerBudgetResponse {\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    budgetInfos: ").append(toIndentedString(budgetInfos)).append("\n");
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
