package com.huaweicloud.sdk.iotda.v5.model;

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
public class ListFunctionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_functions")

    private List<FunctionDTO> productFunctions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListFunctionsResponse withProductFunctions(List<FunctionDTO> productFunctions) {
        this.productFunctions = productFunctions;
        return this;
    }

    public ListFunctionsResponse addProductFunctionsItem(FunctionDTO productFunctionsItem) {
        if (this.productFunctions == null) {
            this.productFunctions = new ArrayList<>();
        }
        this.productFunctions.add(productFunctionsItem);
        return this;
    }

    public ListFunctionsResponse withProductFunctions(Consumer<List<FunctionDTO>> productFunctionsSetter) {
        if (this.productFunctions == null) {
            this.productFunctions = new ArrayList<>();
        }
        productFunctionsSetter.accept(this.productFunctions);
        return this;
    }

    /**
     * **参数说明**：编解码函数列表。
     * @return productFunctions
     */
    public List<FunctionDTO> getProductFunctions() {
        return productFunctions;
    }

    public void setProductFunctions(List<FunctionDTO> productFunctions) {
        this.productFunctions = productFunctions;
    }

    public ListFunctionsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数说明**：满足查询条件的记录总数。
     * minimum: 0
     * maximum: 100
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFunctionsResponse that = (ListFunctionsResponse) obj;
        return Objects.equals(this.productFunctions, that.productFunctions) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productFunctions, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionsResponse {\n");
        sb.append("    productFunctions: ").append(toIndentedString(productFunctions)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
