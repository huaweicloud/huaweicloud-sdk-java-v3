package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ExportTopSqlTrendDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval_millis")

    private Long intervalMillis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_sql_trend_items")

    private List<TopSqlTrendItem> topSqlTrendItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ExportTopSqlTrendDetailsResponse withIntervalMillis(Long intervalMillis) {
        this.intervalMillis = intervalMillis;
        return this;
    }

    /**
     * 返回列表两个时间点之间的时间间隔。总查询时长一小时之内间隔10s，一小时到六小时范围内间隔60s。单位为毫秒。
     * @return intervalMillis
     */
    public Long getIntervalMillis() {
        return intervalMillis;
    }

    public void setIntervalMillis(Long intervalMillis) {
        this.intervalMillis = intervalMillis;
    }

    public ExportTopSqlTrendDetailsResponse withTopSqlTrendItems(List<TopSqlTrendItem> topSqlTrendItems) {
        this.topSqlTrendItems = topSqlTrendItems;
        return this;
    }

    public ExportTopSqlTrendDetailsResponse addTopSqlTrendItemsItem(TopSqlTrendItem topSqlTrendItemsItem) {
        if (this.topSqlTrendItems == null) {
            this.topSqlTrendItems = new ArrayList<>();
        }
        this.topSqlTrendItems.add(topSqlTrendItemsItem);
        return this;
    }

    public ExportTopSqlTrendDetailsResponse withTopSqlTrendItems(
        Consumer<List<TopSqlTrendItem>> topSqlTrendItemsSetter) {
        if (this.topSqlTrendItems == null) {
            this.topSqlTrendItems = new ArrayList<>();
        }
        topSqlTrendItemsSetter.accept(this.topSqlTrendItems);
        return this;
    }

    /**
     * SQL执行耗时区间数据。
     * @return topSqlTrendItems
     */
    public List<TopSqlTrendItem> getTopSqlTrendItems() {
        return topSqlTrendItems;
    }

    public void setTopSqlTrendItems(List<TopSqlTrendItem> topSqlTrendItems) {
        this.topSqlTrendItems = topSqlTrendItems;
    }

    public ExportTopSqlTrendDetailsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 耗时区间数据总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportTopSqlTrendDetailsResponse that = (ExportTopSqlTrendDetailsResponse) obj;
        return Objects.equals(this.intervalMillis, that.intervalMillis)
            && Objects.equals(this.topSqlTrendItems, that.topSqlTrendItems)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intervalMillis, topSqlTrendItems, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportTopSqlTrendDetailsResponse {\n");
        sb.append("    intervalMillis: ").append(toIndentedString(intervalMillis)).append("\n");
        sb.append("    topSqlTrendItems: ").append(toIndentedString(topSqlTrendItems)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
