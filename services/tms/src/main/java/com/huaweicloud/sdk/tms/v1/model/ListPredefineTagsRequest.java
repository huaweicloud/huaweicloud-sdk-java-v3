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
     * order_field字段的排序方法。 可输入的值包含（区分大小写）： asc（升序） desc（降序） 只能选择以上值的其中之一。 不传则默认值为：desc
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
     * 键，支持模糊查询，不区分大小写，如果包含“non-URL-safe”的字符，需要进行“urlencoded”。
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
     * 值，支持模糊查询，不区分大小写，如果包含“non-URL-safe”的字符，需要进行“urlencoded”。
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
     * 查询记录数。 最小为1，最大为1000，未输入时默认为10，为0时不限制查询数据条数。
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
     * 分页位置标识（索引）。 从marker指定索引的下一条数据开始查询。 说明： 查询第一页数据时，不需要传入此参数，查询后续页码数据时，将查询前一页数据响应体中marker值配入此参数，当返回的tags为空列表时表示查询到最后一页。
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
     * 排序字段： 可输入的值包含（区分大小写）：update_time（更新时间）、key（键）、value（值）。 只能选择以上排序字段中的一个，并按照排序方法字段order_method进行排序，如果不传则默认值为：update_time。 如以下： 若该字段为update_time，则剩余两个默认字段排序为key升序，value升序。 若该字段如为key，则剩余两个默认字段排序为update_time降序，value升序。 若该字段如为value，则剩余两个默认字段排序为update_time降序，key升序。 若该字段不传，默认字段为update_time，则剩余两个默认字段排序为key升序，value升序。
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
     * order_field字段的排序方法。 可输入的值包含（区分大小写）： asc（升序） desc（降序） 只能选择以上值的其中之一。 不传则默认值为：desc
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

