package com.huaweicloud.sdk.modelarts.v1.model;

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
public class GetAuthorizationsRequest {

    /**
     * **参数解释**：指定排序字段。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - user_name：IAM用户名称。 - create_time：创建时间。 **默认取值**：user_name。
     */
    public static final class SortByEnum {

        /**
         * Enum USER_NAME for value: "user_name"
         */
        public static final SortByEnum USER_NAME = new SortByEnum("user_name");

        /**
         * Enum CREATE_TIME for value: "create_time"
         */
        public static final SortByEnum CREATE_TIME = new SortByEnum("create_time");

        private static final Map<String, SortByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortByEnum> createStaticFields() {
            Map<String, SortByEnum> map = new HashMap<>();
            map.put("user_name", USER_NAME);
            map.put("create_time", CREATE_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortByEnum(String value) {
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
        public static SortByEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortByEnum(value));
        }

        public static SortByEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortByEnum) {
                return this.value.equals(((SortByEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private SortByEnum sortBy;

    /**
     * **参数解释**：排序方式。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - ASC：递增排序。 - DESC：递减排序。 **默认取值**：ASC。
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
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderEnum(value));
        }

        public static OrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "order")

    private OrderEnum order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public GetAuthorizationsRequest withSortBy(SortByEnum sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * **参数解释**：指定排序字段。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - user_name：IAM用户名称。 - create_time：创建时间。 **默认取值**：user_name。
     * @return sortBy
     */
    public SortByEnum getSortBy() {
        return sortBy;
    }

    public void setSortBy(SortByEnum sortBy) {
        this.sortBy = sortBy;
    }

    public GetAuthorizationsRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释**：排序方式。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - ASC：递增排序。 - DESC：递减排序。 **默认取值**：ASC。
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public GetAuthorizationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：指定每一页返回的最大条目数。 **约束限制**：不涉及。 **取值范围**：[1,1000]。 **默认取值**：1000。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public GetAuthorizationsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：分页列表的起始页。 **约束限制**：不涉及。 **取值范围**：非负整数。 **默认取值**：0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetAuthorizationsRequest that = (GetAuthorizationsRequest) obj;
        return Objects.equals(this.sortBy, that.sortBy) && Objects.equals(this.order, that.order)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortBy, order, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAuthorizationsRequest {\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
