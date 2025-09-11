package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListSessionStatisticsRequest {

    /**
     * **参数解释**: 语言。 **约束限制**: 不涉及。 **取值范围**:   - zh-cn   - en-us  **默认取值**: en-us
     */
    public static final class XLanguageEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XLanguageEnum(value));
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private XLanguageEnum xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * **参数解释**  统计维度。 **约束限制**: 不涉及。 **取值范围** - usename：用户名。 - client_addr：访问来源。 - datname：数据库名。  **默认取值**: 不涉及。 
     */
    public static final class DimensionEnum {

        /**
         * Enum USENAME for value: "usename"
         */
        public static final DimensionEnum USENAME = new DimensionEnum("usename");

        /**
         * Enum CLIENT_ADDR for value: "client_addr"
         */
        public static final DimensionEnum CLIENT_ADDR = new DimensionEnum("client_addr");

        /**
         * Enum DATNAME for value: "datname"
         */
        public static final DimensionEnum DATNAME = new DimensionEnum("datname");

        private static final Map<String, DimensionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DimensionEnum> createStaticFields() {
            Map<String, DimensionEnum> map = new HashMap<>();
            map.put("usename", USENAME);
            map.put("client_addr", CLIENT_ADDR);
            map.put("datname", DATNAME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DimensionEnum(String value) {
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
        public static DimensionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DimensionEnum(value));
        }

        public static DimensionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DimensionEnum) {
                return this.value.equals(((DimensionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private DimensionEnum dimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * **参数解释** 实时会话统计排序字段。 **约束限制**: 不涉及。 **取值范围** - active_num：活跃会话数。 - total_num：总会话数。  **默认取值**: 不涉及。 
     */
    public static final class OrderFieldEnum {

        /**
         * Enum ACTIVE_NUM for value: "active_num"
         */
        public static final OrderFieldEnum ACTIVE_NUM = new OrderFieldEnum("active_num");

        /**
         * Enum TOTAL_NUM for value: "total_num"
         */
        public static final OrderFieldEnum TOTAL_NUM = new OrderFieldEnum("total_num");

        private static final Map<String, OrderFieldEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderFieldEnum> createStaticFields() {
            Map<String, OrderFieldEnum> map = new HashMap<>();
            map.put("active_num", ACTIVE_NUM);
            map.put("total_num", TOTAL_NUM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderFieldEnum(String value) {
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
        public static OrderFieldEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderFieldEnum(value));
        }

        public static OrderFieldEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderFieldEnum) {
                return this.value.equals(((OrderFieldEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_field")

    private OrderFieldEnum orderField;

    /**
     * **参数解释** 实时会话统计排序方式。 **约束限制**: 不涉及。 **取值范围** - ASC：根据order_field值升序。 - DESC：根据order_field值降序。  **默认取值** ASC 
     */
    public static final class OrderEnum {

        /**
         * Enum ASC for value: "ASC"
         */
        public static final OrderEnum ASC = new OrderEnum("ASC");

        /**
         * Enum DESC for value: "DESC"
         */
        public static final OrderEnum DESC = new OrderEnum("DESC");

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("ASC", ASC);
            map.put("DESC", DESC);
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

    public ListSessionStatisticsRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * **参数解释**: 语言。 **约束限制**: 不涉及。 **取值范围**:   - zh-cn   - en-us  **默认取值**: en-us
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListSessionStatisticsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 实例ID，此参数是用户创建实例的唯一标识。 **约束限制**: 不涉及。 **取值范围**: 只能由英文字母、数字组成，且长度为36个字符。 **默认取值**: 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListSessionStatisticsRequest withDimension(DimensionEnum dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * **参数解释**  统计维度。 **约束限制**: 不涉及。 **取值范围** - usename：用户名。 - client_addr：访问来源。 - datname：数据库名。  **默认取值**: 不涉及。 
     * @return dimension
     */
    public DimensionEnum getDimension() {
        return dimension;
    }

    public void setDimension(DimensionEnum dimension) {
        this.dimension = dimension;
    }

    public ListSessionStatisticsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释** 索引位置，偏移量。从第一条数据偏移offset条数据后开始查询。 **约束限制**: 不涉及。 **取值范围** [0, 2^31-1] **默认取值** 默认为0（偏移0条数据，表示从第一条数据开始查询）。 
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSessionStatisticsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释** 查询记录数。 **约束限制**: 不涉及。 **取值范围** [1, 100] **默认取值** 默认为100。 
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSessionStatisticsRequest withOrderField(OrderFieldEnum orderField) {
        this.orderField = orderField;
        return this;
    }

    /**
     * **参数解释** 实时会话统计排序字段。 **约束限制**: 不涉及。 **取值范围** - active_num：活跃会话数。 - total_num：总会话数。  **默认取值**: 不涉及。 
     * @return orderField
     */
    public OrderFieldEnum getOrderField() {
        return orderField;
    }

    public void setOrderField(OrderFieldEnum orderField) {
        this.orderField = orderField;
    }

    public ListSessionStatisticsRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释** 实时会话统计排序方式。 **约束限制**: 不涉及。 **取值范围** - ASC：根据order_field值升序。 - DESC：根据order_field值降序。  **默认取值** ASC 
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSessionStatisticsRequest that = (ListSessionStatisticsRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.dimension, that.dimension) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.orderField, that.orderField)
            && Objects.equals(this.order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, dimension, offset, limit, orderField, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSessionStatisticsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    orderField: ").append(toIndentedString(orderField)).append("\n");
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
