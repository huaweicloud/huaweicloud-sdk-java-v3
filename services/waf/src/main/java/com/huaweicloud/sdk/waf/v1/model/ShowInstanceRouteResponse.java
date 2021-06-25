package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.RoutePutBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceRouteResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="items")
    
    private RoutePutBody items;

    public ShowInstanceRouteResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ShowInstanceRouteResponse withItems(RoutePutBody items) {
        this.items = items;
        return this;
    }

    public ShowInstanceRouteResponse withItems(Consumer<RoutePutBody> itemsSetter) {
        if(this.items == null ){
            this.items = new RoutePutBody();
            itemsSetter.accept(this.items);
        }
        
        return this;
    }


    /**
     * Get items
     * @return items
     */
    public RoutePutBody getItems() {
        return items;
    }

    public void setItems(RoutePutBody items) {
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
        ShowInstanceRouteResponse showInstanceRouteResponse = (ShowInstanceRouteResponse) o;
        return Objects.equals(this.total, showInstanceRouteResponse.total) &&
            Objects.equals(this.items, showInstanceRouteResponse.items);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, items);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceRouteResponse {\n");
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

