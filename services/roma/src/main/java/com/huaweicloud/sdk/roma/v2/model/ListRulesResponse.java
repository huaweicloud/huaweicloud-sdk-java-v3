package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.Rule;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRulesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="items")
    
    private List<Rule> items = null;
    
    public ListRulesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListRulesResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 本次返回数量
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public ListRulesResponse withItems(List<Rule> items) {
        this.items = items;
        return this;
    }

    
    public ListRulesResponse addItemsItem(Rule itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    public ListRulesResponse withItems(Consumer<List<Rule>> itemsSetter) {
        if(this.items == null ){
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 规则列表
     * @return items
     */
    public List<Rule> getItems() {
        return items;
    }

    public void setItems(List<Rule> items) {
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
        ListRulesResponse listRulesResponse = (ListRulesResponse) o;
        return Objects.equals(this.total, listRulesResponse.total) &&
            Objects.equals(this.size, listRulesResponse.size) &&
            Objects.equals(this.items, listRulesResponse.items);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, size, items);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRulesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

