package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.AttackDomainTopListInfoItems;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSourceDomainTop5Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="items")
    
    private List<AttackDomainTopListInfoItems> items = null;
    
    public ListSourceDomainTop5Response withTotal(Integer total) {
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

    

    public ListSourceDomainTop5Response withItems(List<AttackDomainTopListInfoItems> items) {
        this.items = items;
        return this;
    }

    
    public ListSourceDomainTop5Response addItemsItem(AttackDomainTopListInfoItems itemsItem) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListSourceDomainTop5Response withItems(Consumer<List<AttackDomainTopListInfoItems>> itemsSetter) {
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
    public List<AttackDomainTopListInfoItems> getItems() {
        return items;
    }

    public void setItems(List<AttackDomainTopListInfoItems> items) {
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
        ListSourceDomainTop5Response listSourceDomainTop5Response = (ListSourceDomainTop5Response) o;
        return Objects.equals(this.total, listSourceDomainTop5Response.total) &&
            Objects.equals(this.items, listSourceDomainTop5Response.items);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, items);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSourceDomainTop5Response {\n");
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

