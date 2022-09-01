package com.huaweicloud.sdk.aom.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 返回列表的排序方式，可以为空。
 */
public class EventQueryParamSort  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_by")
    
    @JacksonXmlProperty(localName = "order_by")
    
    private List<String> orderBy = null;
        /**
     * 排序方式枚举值。asc代表正序，desc代表倒叙。
     */
    public static final class OrderEnum {

        
        /**
         * Enum ASC for value: "asc"
         */
        public static final OrderEnum ASC = new OrderEnum("asc");
        
        /**
         * Enum DESC for value: "desc"
         */
        public static final OrderEnum DESC = new OrderEnum("desc");
        

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OrderEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OrderEnum(value);
            }
            return result;
        }

        public static OrderEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderEnum) {
                return this.value.equals(((OrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order")
    
    @JacksonXmlProperty(localName = "order")
    
    private OrderEnum order;

    public EventQueryParamSort withOrderBy(List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    
    public EventQueryParamSort addOrderByItem(String orderByItem) {
        if(this.orderBy == null) {
            this.orderBy = new ArrayList<>();
        }
        this.orderBy.add(orderByItem);
        return this;
    }

    public EventQueryParamSort withOrderBy(Consumer<List<String>> orderBySetter) {
        if(this.orderBy == null) {
            this.orderBy = new ArrayList<>();
        }
        orderBySetter.accept(this.orderBy);
        return this;
    }

    /**
     * 排序字段列表。会根据列表中定义顺序对返回列表进行排序。
     * @return orderBy
     */
    public List<String> getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(List<String> orderBy) {
        this.orderBy = orderBy;
    }

    

    public EventQueryParamSort withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    


    /**
     * 排序方式枚举值。asc代表正序，desc代表倒叙。
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventQueryParamSort eventQueryParamSort = (EventQueryParamSort) o;
        return Objects.equals(this.orderBy, eventQueryParamSort.orderBy) &&
            Objects.equals(this.order, eventQueryParamSort.order);
    }
    @Override
    public int hashCode() {
        return Objects.hash(orderBy, order);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventQueryParamSort {\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

