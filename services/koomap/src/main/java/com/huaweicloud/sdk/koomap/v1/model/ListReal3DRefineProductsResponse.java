package com.huaweicloud.sdk.koomap.v1.model;

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
public class ListReal3DRefineProductsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refine_products")

    private List<Real3DRefineProductVO> refineProducts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListReal3DRefineProductsResponse withRefineProducts(List<Real3DRefineProductVO> refineProducts) {
        this.refineProducts = refineProducts;
        return this;
    }

    public ListReal3DRefineProductsResponse addRefineProductsItem(Real3DRefineProductVO refineProductsItem) {
        if (this.refineProducts == null) {
            this.refineProducts = new ArrayList<>();
        }
        this.refineProducts.add(refineProductsItem);
        return this;
    }

    public ListReal3DRefineProductsResponse withRefineProducts(
        Consumer<List<Real3DRefineProductVO>> refineProductsSetter) {
        if (this.refineProducts == null) {
            this.refineProducts = new ArrayList<>();
        }
        refineProductsSetter.accept(this.refineProducts);
        return this;
    }

    /**
     * 精修后处理成果数据对象列表。
     * @return refineProducts
     */
    public List<Real3DRefineProductVO> getRefineProducts() {
        return refineProducts;
    }

    public void setRefineProducts(List<Real3DRefineProductVO> refineProducts) {
        this.refineProducts = refineProducts;
    }

    public ListReal3DRefineProductsResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListReal3DRefineProductsResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReal3DRefineProductsResponse that = (ListReal3DRefineProductsResponse) obj;
        return Objects.equals(this.refineProducts, that.refineProducts) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refineProducts, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReal3DRefineProductsResponse {\n");
        sb.append("    refineProducts: ").append(toIndentedString(refineProducts)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
