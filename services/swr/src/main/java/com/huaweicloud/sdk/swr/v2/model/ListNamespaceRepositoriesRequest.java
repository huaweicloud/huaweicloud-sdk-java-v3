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
public class ListNamespaceRepositoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 排序字段，支持created_at、updated_at，默认为created_at
     */
    public static final class OrderColumnEnum {

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final OrderColumnEnum CREATED_AT = new OrderColumnEnum("created_at");

        /**
         * Enum UPDATED_AT for value: "updated_at"
         */
        public static final OrderColumnEnum UPDATED_AT = new OrderColumnEnum("updated_at");

        private static final Map<String, OrderColumnEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderColumnEnum> createStaticFields() {
            Map<String, OrderColumnEnum> map = new HashMap<>();
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderColumnEnum(String value) {
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
        public static OrderColumnEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderColumnEnum(value));
        }

        public static OrderColumnEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderColumnEnum) {
                return this.value.equals(((OrderColumnEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_column")

    private OrderColumnEnum orderColumn;

    /**
     * 排序方式，支持desc、asc，默认desc;order_column和order_type参数需要配套使用
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
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    public ListNamespaceRepositoriesRequest withInstanceId(String instanceId) {
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

    public ListNamespaceRepositoriesRequest withOffset(Integer offset) {
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

    public ListNamespaceRepositoriesRequest withLimit(Integer limit) {
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

    public ListNamespaceRepositoriesRequest withOrderColumn(OrderColumnEnum orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }

    /**
     * 排序字段，支持created_at、updated_at，默认为created_at
     * @return orderColumn
     */
    public OrderColumnEnum getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(OrderColumnEnum orderColumn) {
        this.orderColumn = orderColumn;
    }

    public ListNamespaceRepositoriesRequest withOrderType(OrderTypeEnum orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * 排序方式，支持desc、asc，默认desc;order_column和order_type参数需要配套使用
     * @return orderType
     */
    public OrderTypeEnum getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderTypeEnum orderType) {
        this.orderType = orderType;
    }

    public ListNamespaceRepositoriesRequest withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * 所属命名空间名称
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNamespaceRepositoriesRequest that = (ListNamespaceRepositoriesRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.orderColumn, that.orderColumn)
            && Objects.equals(this.orderType, that.orderType) && Objects.equals(this.namespaceName, that.namespaceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, orderColumn, orderType, namespaceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNamespaceRepositoriesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    orderColumn: ").append(toIndentedString(orderColumn)).append("\n");
        sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
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
