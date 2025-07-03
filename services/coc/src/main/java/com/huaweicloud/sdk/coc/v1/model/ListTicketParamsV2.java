package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListTicketParamsV2
 */
public class ListTicketParamsV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<String> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count_filters")

    private List<ListTicketParamsV2CountFilters> countFilters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "string_filters")

    private List<ObjectFilterV2> stringFilters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by_filter")

    private ObjectFilterV2 groupByFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "int_filters")

    private List<ObjectFilterV2> intFilters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_filter")

    private ObjectFilterV2 sortFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    public ListTicketParamsV2 withFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public ListTicketParamsV2 addFieldsItem(String fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ListTicketParamsV2 withFields(Consumer<List<String>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 返回字段
     * @return fields
     */
    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public ListTicketParamsV2 withCountFilters(List<ListTicketParamsV2CountFilters> countFilters) {
        this.countFilters = countFilters;
        return this;
    }

    public ListTicketParamsV2 addCountFiltersItem(ListTicketParamsV2CountFilters countFiltersItem) {
        if (this.countFilters == null) {
            this.countFilters = new ArrayList<>();
        }
        this.countFilters.add(countFiltersItem);
        return this;
    }

    public ListTicketParamsV2 withCountFilters(Consumer<List<ListTicketParamsV2CountFilters>> countFiltersSetter) {
        if (this.countFilters == null) {
            this.countFilters = new ArrayList<>();
        }
        countFiltersSetter.accept(this.countFilters);
        return this;
    }

    /**
     * 批量计数
     * @return countFilters
     */
    public List<ListTicketParamsV2CountFilters> getCountFilters() {
        return countFilters;
    }

    public void setCountFilters(List<ListTicketParamsV2CountFilters> countFilters) {
        this.countFilters = countFilters;
    }

    public ListTicketParamsV2 withStringFilters(List<ObjectFilterV2> stringFilters) {
        this.stringFilters = stringFilters;
        return this;
    }

    public ListTicketParamsV2 addStringFiltersItem(ObjectFilterV2 stringFiltersItem) {
        if (this.stringFilters == null) {
            this.stringFilters = new ArrayList<>();
        }
        this.stringFilters.add(stringFiltersItem);
        return this;
    }

    public ListTicketParamsV2 withStringFilters(Consumer<List<ObjectFilterV2>> stringFiltersSetter) {
        if (this.stringFilters == null) {
            this.stringFilters = new ArrayList<>();
        }
        stringFiltersSetter.accept(this.stringFilters);
        return this;
    }

    /**
     * 字符串搜索条件
     * @return stringFilters
     */
    public List<ObjectFilterV2> getStringFilters() {
        return stringFilters;
    }

    public void setStringFilters(List<ObjectFilterV2> stringFilters) {
        this.stringFilters = stringFilters;
    }

    public ListTicketParamsV2 withGroupByFilter(ObjectFilterV2 groupByFilter) {
        this.groupByFilter = groupByFilter;
        return this;
    }

    public ListTicketParamsV2 withGroupByFilter(Consumer<ObjectFilterV2> groupByFilterSetter) {
        if (this.groupByFilter == null) {
            this.groupByFilter = new ObjectFilterV2();
            groupByFilterSetter.accept(this.groupByFilter);
        }

        return this;
    }

    /**
     * Get groupByFilter
     * @return groupByFilter
     */
    public ObjectFilterV2 getGroupByFilter() {
        return groupByFilter;
    }

    public void setGroupByFilter(ObjectFilterV2 groupByFilter) {
        this.groupByFilter = groupByFilter;
    }

    public ListTicketParamsV2 withIntFilters(List<ObjectFilterV2> intFilters) {
        this.intFilters = intFilters;
        return this;
    }

    public ListTicketParamsV2 addIntFiltersItem(ObjectFilterV2 intFiltersItem) {
        if (this.intFilters == null) {
            this.intFilters = new ArrayList<>();
        }
        this.intFilters.add(intFiltersItem);
        return this;
    }

    public ListTicketParamsV2 withIntFilters(Consumer<List<ObjectFilterV2>> intFiltersSetter) {
        if (this.intFilters == null) {
            this.intFilters = new ArrayList<>();
        }
        intFiltersSetter.accept(this.intFilters);
        return this;
    }

    /**
     * 整形过滤器
     * @return intFilters
     */
    public List<ObjectFilterV2> getIntFilters() {
        return intFilters;
    }

    public void setIntFilters(List<ObjectFilterV2> intFilters) {
        this.intFilters = intFilters;
    }

    public ListTicketParamsV2 withSortFilter(ObjectFilterV2 sortFilter) {
        this.sortFilter = sortFilter;
        return this;
    }

    public ListTicketParamsV2 withSortFilter(Consumer<ObjectFilterV2> sortFilterSetter) {
        if (this.sortFilter == null) {
            this.sortFilter = new ObjectFilterV2();
            sortFilterSetter.accept(this.sortFilter);
        }

        return this;
    }

    /**
     * Get sortFilter
     * @return sortFilter
     */
    public ObjectFilterV2 getSortFilter() {
        return sortFilter;
    }

    public void setSortFilter(ObjectFilterV2 sortFilter) {
        this.sortFilter = sortFilter;
    }

    public ListTicketParamsV2 withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 表达式，对复杂表达式进行组装，可以用英文括号()、与&、或|。示例：( filterName1 & filterName2) | filterName3。filterName*：取自string_filters ObjectFilter.name。如果为空，string_filters中的条件默认是与的关系
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTicketParamsV2 that = (ListTicketParamsV2) obj;
        return Objects.equals(this.fields, that.fields) && Objects.equals(this.countFilters, that.countFilters)
            && Objects.equals(this.stringFilters, that.stringFilters)
            && Objects.equals(this.groupByFilter, that.groupByFilter)
            && Objects.equals(this.intFilters, that.intFilters) && Objects.equals(this.sortFilter, that.sortFilter)
            && Objects.equals(this.condition, that.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, countFilters, stringFilters, groupByFilter, intFilters, sortFilter, condition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTicketParamsV2 {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    countFilters: ").append(toIndentedString(countFilters)).append("\n");
        sb.append("    stringFilters: ").append(toIndentedString(stringFilters)).append("\n");
        sb.append("    groupByFilter: ").append(toIndentedString(groupByFilter)).append("\n");
        sb.append("    intFilters: ").append(toIndentedString(intFilters)).append("\n");
        sb.append("    sortFilter: ").append(toIndentedString(sortFilter)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
