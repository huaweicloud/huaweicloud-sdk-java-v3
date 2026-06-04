package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 排序顺序字段，用于定义排序规则。
 */
public class IcebergSortField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private Integer sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform")

    private String transform;

    /**
     * 排序方向。
     */
    public static final class DirectionEnum {

        /**
         * Enum ASC for value: "ASC"
         */
        public static final DirectionEnum ASC = new DirectionEnum("ASC");

        /**
         * Enum DESC for value: "DESC"
         */
        public static final DirectionEnum DESC = new DirectionEnum("DESC");

        private static final Map<String, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DirectionEnum> createStaticFields() {
            Map<String, DirectionEnum> map = new HashMap<>();
            map.put("ASC", ASC);
            map.put("DESC", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DirectionEnum(String value) {
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
        public static DirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DirectionEnum(value));
        }

        public static DirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private DirectionEnum direction;

    /**
     * null值的排序。
     */
    public static final class NullOrderEnum {

        /**
         * Enum NULLS_FIRST for value: "NULLS_FIRST"
         */
        public static final NullOrderEnum NULLS_FIRST = new NullOrderEnum("NULLS_FIRST");

        /**
         * Enum NULLS_LAST for value: "NULLS_LAST"
         */
        public static final NullOrderEnum NULLS_LAST = new NullOrderEnum("NULLS_LAST");

        private static final Map<String, NullOrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NullOrderEnum> createStaticFields() {
            Map<String, NullOrderEnum> map = new HashMap<>();
            map.put("NULLS_FIRST", NULLS_FIRST);
            map.put("NULLS_LAST", NULLS_LAST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NullOrderEnum(String value) {
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
        public static NullOrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NullOrderEnum(value));
        }

        public static NullOrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NullOrderEnum) {
                return this.value.equals(((NullOrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "null_order")

    private NullOrderEnum nullOrder;

    public IcebergSortField withSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 源字段的id。
     * minimum: 0
     * maximum: 2147483647
     * @return sourceId
     */
    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public IcebergSortField withTransform(String transform) {
        this.transform = transform;
        return this;
    }

    /**
     * 转换函数。
     * @return transform
     */
    public String getTransform() {
        return transform;
    }

    public void setTransform(String transform) {
        this.transform = transform;
    }

    public IcebergSortField withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 排序方向。
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public IcebergSortField withNullOrder(NullOrderEnum nullOrder) {
        this.nullOrder = nullOrder;
        return this;
    }

    /**
     * null值的排序。
     * @return nullOrder
     */
    public NullOrderEnum getNullOrder() {
        return nullOrder;
    }

    public void setNullOrder(NullOrderEnum nullOrder) {
        this.nullOrder = nullOrder;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IcebergSortField that = (IcebergSortField) obj;
        return Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.transform, that.transform)
            && Objects.equals(this.direction, that.direction) && Objects.equals(this.nullOrder, that.nullOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, transform, direction, nullOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IcebergSortField {\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    nullOrder: ").append(toIndentedString(nullOrder)).append("\n");
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
