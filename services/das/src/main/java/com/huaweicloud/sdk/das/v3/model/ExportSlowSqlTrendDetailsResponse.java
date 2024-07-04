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
public class ExportSlowSqlTrendDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sql_trend_items")

    private List<SlowSqlTrendItem> slowSqlTrendItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval_millis")

    private Long intervalMillis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ExportSlowSqlTrendDetailsResponse withSlowSqlTrendItems(List<SlowSqlTrendItem> slowSqlTrendItems) {
        this.slowSqlTrendItems = slowSqlTrendItems;
        return this;
    }

    public ExportSlowSqlTrendDetailsResponse addSlowSqlTrendItemsItem(SlowSqlTrendItem slowSqlTrendItemsItem) {
        if (this.slowSqlTrendItems == null) {
            this.slowSqlTrendItems = new ArrayList<>();
        }
        this.slowSqlTrendItems.add(slowSqlTrendItemsItem);
        return this;
    }

    public ExportSlowSqlTrendDetailsResponse withSlowSqlTrendItems(
        Consumer<List<SlowSqlTrendItem>> slowSqlTrendItemsSetter) {
        if (this.slowSqlTrendItems == null) {
            this.slowSqlTrendItems = new ArrayList<>();
        }
        slowSqlTrendItemsSetter.accept(this.slowSqlTrendItems);
        return this;
    }

    /**
     * 慢SQL数量趋势。
     * @return slowSqlTrendItems
     */
    public List<SlowSqlTrendItem> getSlowSqlTrendItems() {
        return slowSqlTrendItems;
    }

    public void setSlowSqlTrendItems(List<SlowSqlTrendItem> slowSqlTrendItems) {
        this.slowSqlTrendItems = slowSqlTrendItems;
    }

    public ExportSlowSqlTrendDetailsResponse withIntervalMillis(Long intervalMillis) {
        this.intervalMillis = intervalMillis;
        return this;
    }

    /**
     * 返回列表两个时间点之间的时间间隔。总查询时长3小时之内间隔1分钟，3小时到6小时范围内间隔5分钟，6小时到12小时范围内间隔30分钟，12小时以上间隔1小时。单位为毫秒。
     * @return intervalMillis
     */
    public Long getIntervalMillis() {
        return intervalMillis;
    }

    public void setIntervalMillis(Long intervalMillis) {
        this.intervalMillis = intervalMillis;
    }

    public ExportSlowSqlTrendDetailsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 趋势数据总数。
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
        ExportSlowSqlTrendDetailsResponse that = (ExportSlowSqlTrendDetailsResponse) obj;
        return Objects.equals(this.slowSqlTrendItems, that.slowSqlTrendItems)
            && Objects.equals(this.intervalMillis, that.intervalMillis)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slowSqlTrendItems, intervalMillis, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportSlowSqlTrendDetailsResponse {\n");
        sb.append("    slowSqlTrendItems: ").append(toIndentedString(slowSqlTrendItems)).append("\n");
        sb.append("    intervalMillis: ").append(toIndentedString(intervalMillis)).append("\n");
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
