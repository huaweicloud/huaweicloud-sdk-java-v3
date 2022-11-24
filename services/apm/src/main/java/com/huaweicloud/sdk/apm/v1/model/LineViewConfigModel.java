package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 指向线视图配置。
 */
public class LineViewConfigModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_set")

    private String metricSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_prefix")

    private String filterPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_view_item_list")

    private List<LineViewItem> lineViewItemList = null;

    public LineViewConfigModel withMetricSet(String metricSet) {
        this.metricSet = metricSet;
        return this;
    }

    /**
     * 视图对应的指标集的名称。
     * @return metricSet
     */
    public String getMetricSet() {
        return metricSet;
    }

    public void setMetricSet(String metricSet) {
        this.metricSet = metricSet;
    }

    public LineViewConfigModel withFilterPrefix(String filterPrefix) {
        this.filterPrefix = filterPrefix;
        return this;
    }

    /**
     * 过滤参数。
     * @return filterPrefix
     */
    public String getFilterPrefix() {
        return filterPrefix;
    }

    public void setFilterPrefix(String filterPrefix) {
        this.filterPrefix = filterPrefix;
    }

    public LineViewConfigModel withLineViewItemList(List<LineViewItem> lineViewItemList) {
        this.lineViewItemList = lineViewItemList;
        return this;
    }

    public LineViewConfigModel addLineViewItemListItem(LineViewItem lineViewItemListItem) {
        if (this.lineViewItemList == null) {
            this.lineViewItemList = new ArrayList<>();
        }
        this.lineViewItemList.add(lineViewItemListItem);
        return this;
    }

    public LineViewConfigModel withLineViewItemList(Consumer<List<LineViewItem>> lineViewItemListSetter) {
        if (this.lineViewItemList == null) {
            this.lineViewItemList = new ArrayList<>();
        }
        lineViewItemListSetter.accept(this.lineViewItemList);
        return this;
    }

    /**
     * 视图函数集合。
     * @return lineViewItemList
     */
    public List<LineViewItem> getLineViewItemList() {
        return lineViewItemList;
    }

    public void setLineViewItemList(List<LineViewItem> lineViewItemList) {
        this.lineViewItemList = lineViewItemList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LineViewConfigModel lineViewConfigModel = (LineViewConfigModel) o;
        return Objects.equals(this.metricSet, lineViewConfigModel.metricSet)
            && Objects.equals(this.filterPrefix, lineViewConfigModel.filterPrefix)
            && Objects.equals(this.lineViewItemList, lineViewConfigModel.lineViewItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricSet, filterPrefix, lineViewItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineViewConfigModel {\n");
        sb.append("    metricSet: ").append(toIndentedString(metricSet)).append("\n");
        sb.append("    filterPrefix: ").append(toIndentedString(filterPrefix)).append("\n");
        sb.append("    lineViewItemList: ").append(toIndentedString(lineViewItemList)).append("\n");
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
