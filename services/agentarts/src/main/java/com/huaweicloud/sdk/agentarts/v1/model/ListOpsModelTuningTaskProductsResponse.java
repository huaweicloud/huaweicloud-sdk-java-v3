package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListOpsModelTuningTaskProductsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "products")

    private List<OpsTuningProduct> products = null;

    public ListOpsModelTuningTaskProductsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 满足条件的产物记录总数，用于计算分页总页数，单位：条。  **取值范围：** 大于等于0的整数。
     * minimum: 0
     * maximum: 100
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListOpsModelTuningTaskProductsResponse withProducts(List<OpsTuningProduct> products) {
        this.products = products;
        return this;
    }

    public ListOpsModelTuningTaskProductsResponse addProductsItem(OpsTuningProduct productsItem) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(productsItem);
        return this;
    }

    public ListOpsModelTuningTaskProductsResponse withProducts(Consumer<List<OpsTuningProduct>> productsSetter) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        productsSetter.accept(this.products);
        return this;
    }

    /**
     * **参数解释：** 模型产物列表，包含模型产物的详细信息。  **取值范围：** 符合OpsTuningProduct定义的对象数组。
     * @return products
     */
    public List<OpsTuningProduct> getProducts() {
        return products;
    }

    public void setProducts(List<OpsTuningProduct> products) {
        this.products = products;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsModelTuningTaskProductsResponse that = (ListOpsModelTuningTaskProductsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, products);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsModelTuningTaskProductsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    products: ").append(toIndentedString(products)).append("\n");
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
