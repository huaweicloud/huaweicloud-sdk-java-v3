package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FilterSnake
 */
public class FilterSnake {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criteria")

    private List<CriteriaSnake> criteria = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    private Long pageNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Long pageSize;

    /**
     * 排序字段. - 1 修改日期 - 2 插件名称 - 3 插件作者名称
     */
    public static final class SortByEnum {

        /**
         * Enum NUMBER_1 for value: 1L
         */
        public static final SortByEnum NUMBER_1 = new SortByEnum(1L);

        /**
         * Enum NUMBER_2 for value: 2L
         */
        public static final SortByEnum NUMBER_2 = new SortByEnum(2L);

        /**
         * Enum NUMBER_3 for value: 3L
         */
        public static final SortByEnum NUMBER_3 = new SortByEnum(3L);

        private static final Map<Long, SortByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Long, SortByEnum> createStaticFields() {
            Map<Long, SortByEnum> map = new HashMap<>();
            map.put(1L, NUMBER_1);
            map.put(2L, NUMBER_2);
            map.put(3L, NUMBER_3);
            return Collections.unmodifiableMap(map);
        }

        private Long value;

        SortByEnum(Long value) {
            this.value = value;
        }

        @JsonValue
        public Long getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SortByEnum fromValue(Long value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortByEnum(value));
        }

        public static SortByEnum valueOf(Long value) {
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
     * 排序顺序. - 1 升序 - 2 降序
     */
    public static final class SortOrderEnum {

        /**
         * Enum NUMBER_1 for value: 1L
         */
        public static final SortOrderEnum NUMBER_1 = new SortOrderEnum(1L);

        /**
         * Enum NUMBER_2 for value: 2L
         */
        public static final SortOrderEnum NUMBER_2 = new SortOrderEnum(2L);

        private static final Map<Long, SortOrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Long, SortOrderEnum> createStaticFields() {
            Map<Long, SortOrderEnum> map = new HashMap<>();
            map.put(1L, NUMBER_1);
            map.put(2L, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Long value;

        SortOrderEnum(Long value) {
            this.value = value;
        }

        @JsonValue
        public Long getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SortOrderEnum fromValue(Long value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortOrderEnum(value));
        }

        public static SortOrderEnum valueOf(Long value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortOrderEnum) {
                return this.value.equals(((SortOrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_order")

    private SortOrderEnum sortOrder;

    public FilterSnake withCriteria(List<CriteriaSnake> criteria) {
        this.criteria = criteria;
        return this;
    }

    public FilterSnake addCriteriaItem(CriteriaSnake criteriaItem) {
        if (this.criteria == null) {
            this.criteria = new ArrayList<>();
        }
        this.criteria.add(criteriaItem);
        return this;
    }

    public FilterSnake withCriteria(Consumer<List<CriteriaSnake>> criteriaSetter) {
        if (this.criteria == null) {
            this.criteria = new ArrayList<>();
        }
        criteriaSetter.accept(this.criteria);
        return this;
    }

    /**
     * 过滤集合
     * @return criteria
     */
    public List<CriteriaSnake> getCriteria() {
        return criteria;
    }

    public void setCriteria(List<CriteriaSnake> criteria) {
        this.criteria = criteria;
    }

    public FilterSnake withPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * 页码
     * minimum: 1
     * maximum: 10000
     * @return pageNumber
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public FilterSnake withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页大小
     * minimum: 1
     * maximum: 10000
     * @return pageSize
     */
    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public FilterSnake withSortBy(SortByEnum sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * 排序字段. - 1 修改日期 - 2 插件名称 - 3 插件作者名称
     * @return sortBy
     */
    public SortByEnum getSortBy() {
        return sortBy;
    }

    public void setSortBy(SortByEnum sortBy) {
        this.sortBy = sortBy;
    }

    public FilterSnake withSortOrder(SortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * 排序顺序. - 1 升序 - 2 降序
     * @return sortOrder
     */
    public SortOrderEnum getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(SortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FilterSnake that = (FilterSnake) obj;
        return Objects.equals(this.criteria, that.criteria) && Objects.equals(this.pageNumber, that.pageNumber)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.sortBy, that.sortBy)
            && Objects.equals(this.sortOrder, that.sortOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criteria, pageNumber, pageSize, sortBy, sortOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilterSnake {\n");
        sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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
