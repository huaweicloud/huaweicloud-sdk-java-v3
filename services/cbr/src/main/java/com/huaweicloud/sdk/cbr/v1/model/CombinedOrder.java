package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 组合订单
 */
public class CombinedOrder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "combined_order_id")

    private String combinedOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "combined_order_ecs_num")

    private Integer combinedOrderEcsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "combined_order_num")

    private Integer combinedOrderNum;

    public CombinedOrder withCombinedOrderId(String combinedOrderId) {
        this.combinedOrderId = combinedOrderId;
        return this;
    }

    /**
     * 组合订单 ID
     * @return combinedOrderId
     */
    public String getCombinedOrderId() {
        return combinedOrderId;
    }

    public void setCombinedOrderId(String combinedOrderId) {
        this.combinedOrderId = combinedOrderId;
    }

    public CombinedOrder withCombinedOrderEcsNum(Integer combinedOrderEcsNum) {
        this.combinedOrderEcsNum = combinedOrderEcsNum;
        return this;
    }

    /**
     * 组合订单中 ECS 服务器数量，当前批量最大为 500。  最小值：1  最大值：1000
     * minimum: 1
     * maximum: 1000
     * @return combinedOrderEcsNum
     */
    public Integer getCombinedOrderEcsNum() {
        return combinedOrderEcsNum;
    }

    public void setCombinedOrderEcsNum(Integer combinedOrderEcsNum) {
        this.combinedOrderEcsNum = combinedOrderEcsNum;
    }

    public CombinedOrder withCombinedOrderNum(Integer combinedOrderNum) {
        this.combinedOrderNum = combinedOrderNum;
        return this;
    }

    /**
     * 组合订单数量。  最小值：1  最大值：1000
     * minimum: 1
     * maximum: 1000
     * @return combinedOrderNum
     */
    public Integer getCombinedOrderNum() {
        return combinedOrderNum;
    }

    public void setCombinedOrderNum(Integer combinedOrderNum) {
        this.combinedOrderNum = combinedOrderNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CombinedOrder that = (CombinedOrder) obj;
        return Objects.equals(this.combinedOrderId, that.combinedOrderId)
            && Objects.equals(this.combinedOrderEcsNum, that.combinedOrderEcsNum)
            && Objects.equals(this.combinedOrderNum, that.combinedOrderNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(combinedOrderId, combinedOrderEcsNum, combinedOrderNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CombinedOrder {\n");
        sb.append("    combinedOrderId: ").append(toIndentedString(combinedOrderId)).append("\n");
        sb.append("    combinedOrderEcsNum: ").append(toIndentedString(combinedOrderEcsNum)).append("\n");
        sb.append("    combinedOrderNum: ").append(toIndentedString(combinedOrderNum)).append("\n");
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
