package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.AttackUrlTopListInfoItems;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSourceUrlTop5Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="items")
    
    private List<AttackUrlTopListInfoItems> items = null;
    
    public ListSourceUrlTop5Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 攻击源ip的总数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListSourceUrlTop5Response withItems(List<AttackUrlTopListInfoItems> items) {
        this.items = items;
        return this;
    }

    
    public ListSourceUrlTop5Response addItemsItem(AttackUrlTopListInfoItems itemsItem) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListSourceUrlTop5Response withItems(Consumer<List<AttackUrlTopListInfoItems>> itemsSetter) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 对象数组
     * @return items
     */
    public List<AttackUrlTopListInfoItems> getItems() {
        return items;
    }

    public void setItems(List<AttackUrlTopListInfoItems> items) {
        this.items = items;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSourceUrlTop5Response listSourceUrlTop5Response = (ListSourceUrlTop5Response) o;
        return Objects.equals(this.total, listSourceUrlTop5Response.total) &&
            Objects.equals(this.items, listSourceUrlTop5Response.items);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, items);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSourceUrlTop5Response {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

