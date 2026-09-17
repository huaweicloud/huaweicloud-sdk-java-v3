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
public class ShowIndexUsageTrendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trend_list")

    private List<IndexUsageTrendPoint> trendList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fragmentation_trend")

    private IndexUsagePercent fragmentationTrend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_trend")

    private IndexUsagePercent usageTrend;

    public ShowIndexUsageTrendResponse withTrendList(List<IndexUsageTrendPoint> trendList) {
        this.trendList = trendList;
        return this;
    }

    public ShowIndexUsageTrendResponse addTrendListItem(IndexUsageTrendPoint trendListItem) {
        if (this.trendList == null) {
            this.trendList = new ArrayList<>();
        }
        this.trendList.add(trendListItem);
        return this;
    }

    public ShowIndexUsageTrendResponse withTrendList(Consumer<List<IndexUsageTrendPoint>> trendListSetter) {
        if (this.trendList == null) {
            this.trendList = new ArrayList<>();
        }
        trendListSetter.accept(this.trendList);
        return this;
    }

    /**
     * 趋势数量列表
     * @return trendList
     */
    public List<IndexUsageTrendPoint> getTrendList() {
        return trendList;
    }

    public void setTrendList(List<IndexUsageTrendPoint> trendList) {
        this.trendList = trendList;
    }

    public ShowIndexUsageTrendResponse withFragmentationTrend(IndexUsagePercent fragmentationTrend) {
        this.fragmentationTrend = fragmentationTrend;
        return this;
    }

    public ShowIndexUsageTrendResponse withFragmentationTrend(Consumer<IndexUsagePercent> fragmentationTrendSetter) {
        if (this.fragmentationTrend == null) {
            this.fragmentationTrend = new IndexUsagePercent();
            fragmentationTrendSetter.accept(this.fragmentationTrend);
        }

        return this;
    }

    /**
     * Get fragmentationTrend
     * @return fragmentationTrend
     */
    public IndexUsagePercent getFragmentationTrend() {
        return fragmentationTrend;
    }

    public void setFragmentationTrend(IndexUsagePercent fragmentationTrend) {
        this.fragmentationTrend = fragmentationTrend;
    }

    public ShowIndexUsageTrendResponse withUsageTrend(IndexUsagePercent usageTrend) {
        this.usageTrend = usageTrend;
        return this;
    }

    public ShowIndexUsageTrendResponse withUsageTrend(Consumer<IndexUsagePercent> usageTrendSetter) {
        if (this.usageTrend == null) {
            this.usageTrend = new IndexUsagePercent();
            usageTrendSetter.accept(this.usageTrend);
        }

        return this;
    }

    /**
     * Get usageTrend
     * @return usageTrend
     */
    public IndexUsagePercent getUsageTrend() {
        return usageTrend;
    }

    public void setUsageTrend(IndexUsagePercent usageTrend) {
        this.usageTrend = usageTrend;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIndexUsageTrendResponse that = (ShowIndexUsageTrendResponse) obj;
        return Objects.equals(this.trendList, that.trendList)
            && Objects.equals(this.fragmentationTrend, that.fragmentationTrend)
            && Objects.equals(this.usageTrend, that.usageTrend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trendList, fragmentationTrend, usageTrend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIndexUsageTrendResponse {\n");
        sb.append("    trendList: ").append(toIndentedString(trendList)).append("\n");
        sb.append("    fragmentationTrend: ").append(toIndentedString(fragmentationTrend)).append("\n");
        sb.append("    usageTrend: ").append(toIndentedString(usageTrend)).append("\n");
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
