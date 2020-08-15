package com.huaweicloud.sdk.bss.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.SkuItem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QuerySkuInventoriesReq
 */
public class QuerySkuInventoriesReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sku_items")
    
    private List<SkuItem> skuItems = new ArrayList<>();
    
    public QuerySkuInventoriesReq withSkuItems(List<SkuItem> skuItems) {
        this.skuItems = skuItems;
        return this;
    }

    
    public QuerySkuInventoriesReq addSkuItemsItem(SkuItem skuItemsItem) {
        this.skuItems.add(skuItemsItem);
        return this;
    }

    public QuerySkuInventoriesReq withSkuItems(Consumer<List<SkuItem>> skuItemsSetter) {
        if(this.skuItems == null ){
            this.skuItems = new ArrayList<>();
        }
        skuItemsSetter.accept(this.skuItems);
        return this;
    }

    /**
     * |参数名称：待查询库存项| |参数约束以及描述：待查询库存项|
     * @return skuItems
     */
    public List<SkuItem> getSkuItems() {
        return skuItems;
    }

    public void setSkuItems(List<SkuItem> skuItems) {
        this.skuItems = skuItems;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuerySkuInventoriesReq querySkuInventoriesReq = (QuerySkuInventoriesReq) o;
        return Objects.equals(this.skuItems, querySkuInventoriesReq.skuItems);
    }
    @Override
    public int hashCode() {
        return Objects.hash(skuItems);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySkuInventoriesReq {\n");
        sb.append("    skuItems: ").append(toIndentedString(skuItems)).append("\n");
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

