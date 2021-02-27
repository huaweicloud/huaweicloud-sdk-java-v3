package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.SkuInventory;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSkuInventoriesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sku_inventories")
    
    private List<SkuInventory> skuInventories = null;
    
    public ListSkuInventoriesResponse withSkuInventories(List<SkuInventory> skuInventories) {
        this.skuInventories = skuInventories;
        return this;
    }

    
    public ListSkuInventoriesResponse addSkuInventoriesItem(SkuInventory skuInventoriesItem) {
        if (this.skuInventories == null) {
            this.skuInventories = new ArrayList<>();
        }
        this.skuInventories.add(skuInventoriesItem);
        return this;
    }

    public ListSkuInventoriesResponse withSkuInventories(Consumer<List<SkuInventory>> skuInventoriesSetter) {
        if(this.skuInventories == null ){
            this.skuInventories = new ArrayList<>();
        }
        skuInventoriesSetter.accept(this.skuInventories);
        return this;
    }

    /**
     * 库存的查询结果详情，具体参见表2。
     * @return skuInventories
     */
    public List<SkuInventory> getSkuInventories() {
        return skuInventories;
    }

    public void setSkuInventories(List<SkuInventory> skuInventories) {
        this.skuInventories = skuInventories;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSkuInventoriesResponse listSkuInventoriesResponse = (ListSkuInventoriesResponse) o;
        return Objects.equals(this.skuInventories, listSkuInventoriesResponse.skuInventories);
    }
    @Override
    public int hashCode() {
        return Objects.hash(skuInventories);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSkuInventoriesResponse {\n");
        sb.append("    skuInventories: ").append(toIndentedString(skuInventories)).append("\n");
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

