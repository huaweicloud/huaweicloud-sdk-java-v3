package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowMeteringResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info_list")

    private List<ProductInfo> productInfoList = null;

    public ShowMeteringResponse withProductInfoList(List<ProductInfo> productInfoList) {
        this.productInfoList = productInfoList;
        return this;
    }

    public ShowMeteringResponse addProductInfoListItem(ProductInfo productInfoListItem) {
        if (this.productInfoList == null) {
            this.productInfoList = new ArrayList<>();
        }
        this.productInfoList.add(productInfoListItem);
        return this;
    }

    public ShowMeteringResponse withProductInfoList(Consumer<List<ProductInfo>> productInfoListSetter) {
        if (this.productInfoList == null) {
            this.productInfoList = new ArrayList<>();
        }
        productInfoListSetter.accept(this.productInfoList);
        return this;
    }

    /**
     * 资源信息列表。
     * @return productInfoList
     */
    public List<ProductInfo> getProductInfoList() {
        return productInfoList;
    }

    public void setProductInfoList(List<ProductInfo> productInfoList) {
        this.productInfoList = productInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMeteringResponse that = (ShowMeteringResponse) obj;
        return Objects.equals(this.productInfoList, that.productInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMeteringResponse {\n");
        sb.append("    productInfoList: ").append(toIndentedString(productInfoList)).append("\n");
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
