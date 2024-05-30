package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * value，统一的返回结果的外层数据结构。
 */
public class ListMetricRelationsResultDataValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all")

    private List<Object> all = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private Object links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private Object groups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListMetricRelationsResultDataValue withAll(List<Object> all) {
        this.all = all;
        return this;
    }

    public ListMetricRelationsResultDataValue addAllItem(Object allItem) {
        if (this.all == null) {
            this.all = new ArrayList<>();
        }
        this.all.add(allItem);
        return this;
    }

    public ListMetricRelationsResultDataValue withAll(Consumer<List<Object>> allSetter) {
        if (this.all == null) {
            this.all = new ArrayList<>();
        }
        allSetter.accept(this.all);
        return this;
    }

    /**
     * 所有的业务指标信息。
     * @return all
     */
    public List<Object> getAll() {
        return all;
    }

    public void setAll(List<Object> all) {
        this.all = all;
    }

    public ListMetricRelationsResultDataValue withLinks(Object links) {
        this.links = links;
        return this;
    }

    /**
     * 指标关联。
     * @return links
     */
    public Object getLinks() {
        return links;
    }

    public void setLinks(Object links) {
        this.links = links;
    }

    public ListMetricRelationsResultDataValue withGroups(Object groups) {
        this.groups = groups;
        return this;
    }

    /**
     * 分组。
     * @return groups
     */
    public Object getGroups() {
        return groups;
    }

    public void setGroups(Object groups) {
        this.groups = groups;
    }

    public ListMetricRelationsResultDataValue withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMetricRelationsResultDataValue that = (ListMetricRelationsResultDataValue) obj;
        return Objects.equals(this.all, that.all) && Objects.equals(this.links, that.links)
            && Objects.equals(this.groups, that.groups) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(all, links, groups, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricRelationsResultDataValue {\n");
        sb.append("    all: ").append(toIndentedString(all)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
