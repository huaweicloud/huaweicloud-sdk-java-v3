package com.huaweicloud.sdk.swr.v2.model;




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
public class ListRepositoryTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository")
    
    private String repository;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private String limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_column")
    
    private String orderColumn;
    /**
     * 排序类型，可设置为desc（降序）、asc（升序） 
     */
    public static final class OrderTypeEnum {

        
        /**
         * Enum DESC for value: "desc"
         */
        public static final OrderTypeEnum DESC = new OrderTypeEnum("desc");
        
        /**
         * Enum ASC for value: "asc"
         */
        public static final OrderTypeEnum ASC = new OrderTypeEnum("asc");
        

        private static final Map<String, OrderTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderTypeEnum> createStaticFields() {
            Map<String, OrderTypeEnum> map = new HashMap<>();
            map.put("desc", DESC);
            map.put("asc", ASC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderTypeEnum(String value) {
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
        public static OrderTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OrderTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OrderTypeEnum(value);
            }
            return result;
        }

        public static OrderTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OrderTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OrderTypeEnum) {
                return this.value.equals(((OrderTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_type")
    
    private OrderTypeEnum orderType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    private String tag;

    public ListRepositoryTagsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 组织名称
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public ListRepositoryTagsRequest withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    


    /**
     * 镜像仓库名称
     * @return repository
     */
    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    

    public ListRepositoryTagsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 起始索引。**注意：offset和limit参数需要配套使用** 
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    

    public ListRepositoryTagsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 返回条数。**注意：offset和limit参数需要配套使用* 
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    

    public ListRepositoryTagsRequest withOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }

    


    /**
     * 按列排序，可设置为updated_at（按更新时间排序） 
     * @return orderColumn
     */
    public String getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
    }

    

    public ListRepositoryTagsRequest withOrderType(OrderTypeEnum orderType) {
        this.orderType = orderType;
        return this;
    }

    


    /**
     * 排序类型，可设置为desc（降序）、asc（升序） 
     * @return orderType
     */
    public OrderTypeEnum getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderTypeEnum orderType) {
        this.orderType = orderType;
    }

    

    public ListRepositoryTagsRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * 镜像版本名
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRepositoryTagsRequest listRepositoryTagsRequest = (ListRepositoryTagsRequest) o;
        return Objects.equals(this.namespace, listRepositoryTagsRequest.namespace) &&
            Objects.equals(this.repository, listRepositoryTagsRequest.repository) &&
            Objects.equals(this.offset, listRepositoryTagsRequest.offset) &&
            Objects.equals(this.limit, listRepositoryTagsRequest.limit) &&
            Objects.equals(this.orderColumn, listRepositoryTagsRequest.orderColumn) &&
            Objects.equals(this.orderType, listRepositoryTagsRequest.orderType) &&
            Objects.equals(this.tag, listRepositoryTagsRequest.tag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namespace, repository, offset, limit, orderColumn, orderType, tag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRepositoryTagsRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    orderColumn: ").append(toIndentedString(orderColumn)).append("\n");
        sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

