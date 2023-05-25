package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 存储库创建参数
 */
public class VaultCreateParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "combined_order")

    private CombinedOrder combinedOrder;

    public VaultCreateParameters withCombinedOrder(CombinedOrder combinedOrder) {
        this.combinedOrder = combinedOrder;
        return this;
    }

    public VaultCreateParameters withCombinedOrder(Consumer<CombinedOrder> combinedOrderSetter) {
        if (this.combinedOrder == null) {
            this.combinedOrder = new CombinedOrder();
            combinedOrderSetter.accept(this.combinedOrder);
        }

        return this;
    }

    /**
     * Get combinedOrder
     * @return combinedOrder
     */
    public CombinedOrder getCombinedOrder() {
        return combinedOrder;
    }

    public void setCombinedOrder(CombinedOrder combinedOrder) {
        this.combinedOrder = combinedOrder;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VaultCreateParameters vaultCreateParameters = (VaultCreateParameters) o;
        return Objects.equals(this.combinedOrder, vaultCreateParameters.combinedOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(combinedOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultCreateParameters {\n");
        sb.append("    combinedOrder: ").append(toIndentedString(combinedOrder)).append("\n");
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
