package com.huaweicloud.sdk.gsl.v3.model;

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
public class ShowMonthUsagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "month_usages")

    private List<MonthUsageVo> monthUsages = null;

    public ShowMonthUsagesResponse withMonthUsages(List<MonthUsageVo> monthUsages) {
        this.monthUsages = monthUsages;
        return this;
    }

    public ShowMonthUsagesResponse addMonthUsagesItem(MonthUsageVo monthUsagesItem) {
        if (this.monthUsages == null) {
            this.monthUsages = new ArrayList<>();
        }
        this.monthUsages.add(monthUsagesItem);
        return this;
    }

    public ShowMonthUsagesResponse withMonthUsages(Consumer<List<MonthUsageVo>> monthUsagesSetter) {
        if (this.monthUsages == null) {
            this.monthUsages = new ArrayList<>();
        }
        monthUsagesSetter.accept(this.monthUsages);
        return this;
    }

    /**
     * 月用量列表
     * @return monthUsages
     */
    public List<MonthUsageVo> getMonthUsages() {
        return monthUsages;
    }

    public void setMonthUsages(List<MonthUsageVo> monthUsages) {
        this.monthUsages = monthUsages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMonthUsagesResponse that = (ShowMonthUsagesResponse) obj;
        return Objects.equals(this.monthUsages, that.monthUsages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monthUsages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMonthUsagesResponse {\n");
        sb.append("    monthUsages: ").append(toIndentedString(monthUsages)).append("\n");
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
