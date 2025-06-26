package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListInstanceWebhooksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_column")

    private String orderColumn;

    /**
     * 排序方式，支持desc、asc，默认desc;order_type需要与order_column配合使用
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OrderTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderTypeEnum(value));
        }

        public static OrderTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderTypeEnum) {
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
    @JsonProperty(value = "order_type")

    private OrderTypeEnum orderType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_id")

    private Integer namespaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListInstanceWebhooksRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 企业仓库实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListInstanceWebhooksRequest withOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }

    /**
     * 排序字段，支持created_at、updated_at、name，默认为created_at
     * @return orderColumn
     */
    public String getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
    }

    public ListInstanceWebhooksRequest withOrderType(OrderTypeEnum orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * 排序方式，支持desc、asc，默认desc;order_type需要与order_column配合使用
     * @return orderType
     */
    public OrderTypeEnum getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderTypeEnum orderType) {
        this.orderType = orderType;
    }

    public ListInstanceWebhooksRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称，模糊查询
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInstanceWebhooksRequest withNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * 所属命名空间ID
     * @return namespaceId
     */
    public Integer getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public ListInstanceWebhooksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 起始索引，默认值为0。**注意：offset和limit参数需要配套使用，offset必须为0或者为limit的倍数。**
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListInstanceWebhooksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回条数，默认为10，最大值为100。**注意：offset和limit参数需要配套使用，offset必须为0或者为limit的倍数。**
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceWebhooksRequest that = (ListInstanceWebhooksRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.orderColumn, that.orderColumn)
            && Objects.equals(this.orderType, that.orderType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespaceId, that.namespaceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, orderColumn, orderType, name, namespaceId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceWebhooksRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    orderColumn: ").append(toIndentedString(orderColumn)).append("\n");
        sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
