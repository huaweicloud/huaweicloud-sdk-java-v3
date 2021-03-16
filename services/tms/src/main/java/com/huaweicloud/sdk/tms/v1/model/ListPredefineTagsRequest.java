package com.huaweicloud.sdk.tms.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListPredefineTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_field")
    
    private String orderField;
    /**
     * Gets or Sets orderMethod
     */
    public static final class OrderMethodEnum {

        
        /**
         * Enum ASC for value: "asc"
         */
        public static final OrderMethodEnum ASC = new OrderMethodEnum("asc");
        
        /**
         * Enum DESC for value: "desc"
         */
        public static final OrderMethodEnum DESC = new OrderMethodEnum("desc");
        

        private static final Map<String, OrderMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderMethodEnum> createStaticFields() {
            Map<String, OrderMethodEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderMethodEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OrderMethodEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OrderMethodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OrderMethodEnum(value);
            }
            return result;
        }

        public static OrderMethodEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OrderMethodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OrderMethodEnum) {
                return this.value.equals(((OrderMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_method")
    
    private OrderMethodEnum orderMethod;

    public ListPredefineTagsRequest withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * Get key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    public ListPredefineTagsRequest withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * Get value
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    

    public ListPredefineTagsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListPredefineTagsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public ListPredefineTagsRequest withOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }

    


    /**
     * Get orderField
     * @return orderField
     */
    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    

    public ListPredefineTagsRequest withOrderMethod(OrderMethodEnum orderMethod) {
        this.orderMethod = orderMethod;
        return this;
    }

    


    /**
     * Get orderMethod
     * @return orderMethod
     */
    public OrderMethodEnum getOrderMethod() {
        return orderMethod;
    }

    public void setOrderMethod(OrderMethodEnum orderMethod) {
        this.orderMethod = orderMethod;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPredefineTagsRequest listPredefineTagsRequest = (ListPredefineTagsRequest) o;
        return Objects.equals(this.key, listPredefineTagsRequest.key) &&
            Objects.equals(this.value, listPredefineTagsRequest.value) &&
            Objects.equals(this.limit, listPredefineTagsRequest.limit) &&
            Objects.equals(this.marker, listPredefineTagsRequest.marker) &&
            Objects.equals(this.orderField, listPredefineTagsRequest.orderField) &&
            Objects.equals(this.orderMethod, listPredefineTagsRequest.orderMethod);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value, limit, marker, orderField, orderMethod);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPredefineTagsRequest {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    orderField: ").append(toIndentedString(orderField)).append("\n");
        sb.append("    orderMethod: ").append(toIndentedString(orderMethod)).append("\n");
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

