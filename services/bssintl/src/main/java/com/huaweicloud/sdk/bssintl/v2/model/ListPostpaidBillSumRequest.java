package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListPostpaidBillSumRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_cycle")

    private String billCycle;

    public ListPostpaidBillSumRequest withBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    /** |参数名称：账期，格式YYYY-MM示例：2020-07| |参数的约束及描述：|
     * 
     * @return billCycle */
    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPostpaidBillSumRequest listPostpaidBillSumRequest = (ListPostpaidBillSumRequest) o;
        return Objects.equals(this.billCycle, listPostpaidBillSumRequest.billCycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billCycle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPostpaidBillSumRequest {\n");
        sb.append("    billCycle: ").append(toIndentedString(billCycle)).append("\n");
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
