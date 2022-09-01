package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class BillbingCreateExtraInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "combined_order_id")

    @JacksonXmlProperty(localName = "combined_order_id")

    private String combinedOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "combined_order_ecs_num")

    @JacksonXmlProperty(localName = "combined_order_ecs_num")

    private Integer combinedOrderEcsNum;

    public BillbingCreateExtraInfo withCombinedOrderId(String combinedOrderId) {
        this.combinedOrderId = combinedOrderId;
        return this;
    }

    /**
     * 组合创建ID，组合创建时必传。
     * @return combinedOrderId
     */
    public String getCombinedOrderId() {
        return combinedOrderId;
    }

    public void setCombinedOrderId(String combinedOrderId) {
        this.combinedOrderId = combinedOrderId;
    }

    public BillbingCreateExtraInfo withCombinedOrderEcsNum(Integer combinedOrderEcsNum) {
        this.combinedOrderEcsNum = combinedOrderEcsNum;
        return this;
    }

    /**
     * 组合创建数量，组合创建时必填。
     * @return combinedOrderEcsNum
     */
    public Integer getCombinedOrderEcsNum() {
        return combinedOrderEcsNum;
    }

    public void setCombinedOrderEcsNum(Integer combinedOrderEcsNum) {
        this.combinedOrderEcsNum = combinedOrderEcsNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillbingCreateExtraInfo billbingCreateExtraInfo = (BillbingCreateExtraInfo) o;
        return Objects.equals(this.combinedOrderId, billbingCreateExtraInfo.combinedOrderId)
            && Objects.equals(this.combinedOrderEcsNum, billbingCreateExtraInfo.combinedOrderEcsNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(combinedOrderId, combinedOrderEcsNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillbingCreateExtraInfo {\n");
        sb.append("    combinedOrderId: ").append(toIndentedString(combinedOrderId)).append("\n");
        sb.append("    combinedOrderEcsNum: ").append(toIndentedString(combinedOrderEcsNum)).append("\n");
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
