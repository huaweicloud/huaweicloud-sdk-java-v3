package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExtensionQueryParamSnake
 */
public class ExtensionQueryParamSnake {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    private List<FilterSnake> filters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flags")

    private Integer flags;

    public ExtensionQueryParamSnake withFilters(List<FilterSnake> filters) {
        this.filters = filters;
        return this;
    }

    public ExtensionQueryParamSnake addFiltersItem(FilterSnake filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public ExtensionQueryParamSnake withFilters(Consumer<List<FilterSnake>> filtersSetter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * 过滤字段
     * @return filters
     */
    public List<FilterSnake> getFilters() {
        return filters;
    }

    public void setFilters(List<FilterSnake> filters) {
        this.filters = filters;
    }

    public ExtensionQueryParamSnake withFlags(Integer flags) {
        this.flags = flags;
        return this;
    }

    /**
     * 插件flag;通过传递flag参数来进行过滤或其他操作。flag的基础数字是2\\4\\8\\16;传递的参数只能是这四个数字加法组合而成数字 利用它们之间二进制的运算获取的值进行其他操作.比如6=0110=0010+0100也就是2和4的集合flags
     * minimum: 2
     * maximum: 30
     * @return flags
     */
    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtensionQueryParamSnake extensionQueryParamSnake = (ExtensionQueryParamSnake) o;
        return Objects.equals(this.filters, extensionQueryParamSnake.filters)
            && Objects.equals(this.flags, extensionQueryParamSnake.flags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filters, flags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionQueryParamSnake {\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
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
