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
         * Enum NUMBER_1 for value: 1l
         */
        public static final SortByEnum NUMBER_1 = new SortByEnum(1l);

        /**
         * Enum NUMBER_2 for value: 2l
         */
        public static final SortByEnum NUMBER_2 = new SortByEnum(2l);

        /**
         * Enum NUMBER_3 for value: 3l
         */
        public static final SortByEnum NUMBER_3 = new SortByEnum(3l);

        private static final Map<Long, SortByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Long, SortByEnum> createStaticFields() {
            Map<Long, SortByEnum> map = new HashMap<>();
            map.put(1l, NUMBER_1);
            map.put(2l, NUMBER_2);
            map.put(3l, NUMBER_3);
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
            SortByEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortByEnum(value);
            }
            return result;
        }

        public static SortByEnum valueOf(Long value) {
            if (value == null) {
                return null;
            }
            SortByEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
         * Enum NUMBER_1 for value: 1l
         */
        public static final SortOrderEnum NUMBER_1 = new SortOrderEnum(1l);

        /**
         * Enum NUMBER_2 for value: 2l
         */
        public static final SortOrderEnum NUMBER_2 = new SortOrderEnum(2l);

        private static final Map<Long, SortOrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Long, SortOrderEnum> createStaticFields() {
            Map<Long, SortOrderEnum> map = new HashMap<>();
            map.put(1l, NUMBER_1);
            map.put(2l, NUMBER_2);
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
            SortOrderEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortOrderEnum(value);
            }
            return result;
        }

        public static SortOrderEnum valueOf(Long value) {
            if (value == null) {
                return null;
            }
            SortOrderEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilterSnake filterSnake = (FilterSnake) o;
        return Objects.equals(this.criteria, filterSnake.criteria)
            && Objects.equals(this.pageNumber, filterSnake.pageNumber)
            && Objects.equals(this.pageSize, filterSnake.pageSize) && Objects.equals(this.sortBy, filterSnake.sortBy)
            && Objects.equals(this.sortOrder, filterSnake.sortOrder);
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
