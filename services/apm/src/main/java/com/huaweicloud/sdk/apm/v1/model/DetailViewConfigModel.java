package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 详情视图配置。
 */
public class DetailViewConfigModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_set")

    private String metricSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_prefix")

    private String filterPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_view_item_list")

    private List<DetailViewItem> detailViewItemList = null;

    public DetailViewConfigModel withMetricSet(String metricSet) {
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

    public DetailViewConfigModel withFilterPrefix(String filterPrefix) {
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

    public DetailViewConfigModel withDetailViewItemList(List<DetailViewItem> detailViewItemList) {
        this.detailViewItemList = detailViewItemList;
        return this;
    }

    public DetailViewConfigModel addDetailViewItemListItem(DetailViewItem detailViewItemListItem) {
        if (this.detailViewItemList == null) {
            this.detailViewItemList = new ArrayList<>();
        }
        this.detailViewItemList.add(detailViewItemListItem);
        return this;
    }

    public DetailViewConfigModel withDetailViewItemList(Consumer<List<DetailViewItem>> detailViewItemListSetter) {
        if (this.detailViewItemList == null) {
            this.detailViewItemList = new ArrayList<>();
        }
        detailViewItemListSetter.accept(this.detailViewItemList);
        return this;
    }

    /**
     * 视图函数集合。
     * @return detailViewItemList
     */
    public List<DetailViewItem> getDetailViewItemList() {
        return detailViewItemList;
    }

    public void setDetailViewItemList(List<DetailViewItem> detailViewItemList) {
        this.detailViewItemList = detailViewItemList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetailViewConfigModel detailViewConfigModel = (DetailViewConfigModel) o;
        return Objects.equals(this.metricSet, detailViewConfigModel.metricSet)
            && Objects.equals(this.filterPrefix, detailViewConfigModel.filterPrefix)
            && Objects.equals(this.detailViewItemList, detailViewConfigModel.detailViewItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricSet, filterPrefix, detailViewItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetailViewConfigModel {\n");
        sb.append("    metricSet: ").append(toIndentedString(metricSet)).append("\n");
        sb.append("    filterPrefix: ").append(toIndentedString(filterPrefix)).append("\n");
        sb.append("    detailViewItemList: ").append(toIndentedString(detailViewItemList)).append("\n");
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
