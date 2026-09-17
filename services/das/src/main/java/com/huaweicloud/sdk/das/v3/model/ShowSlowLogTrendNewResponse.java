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
public class ShowSlowLogTrendNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trend_data")

    private List<SlowLogTrendPoint> trendData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Long interval;

    public ShowSlowLogTrendNewResponse withTrendData(List<SlowLogTrendPoint> trendData) {
        this.trendData = trendData;
        return this;
    }

    public ShowSlowLogTrendNewResponse addTrendDataItem(SlowLogTrendPoint trendDataItem) {
        if (this.trendData == null) {
            this.trendData = new ArrayList<>();
        }
        this.trendData.add(trendDataItem);
        return this;
    }

    public ShowSlowLogTrendNewResponse withTrendData(Consumer<List<SlowLogTrendPoint>> trendDataSetter) {
        if (this.trendData == null) {
            this.trendData = new ArrayList<>();
        }
        trendDataSetter.accept(this.trendData);
        return this;
    }

    /**
     * 趋势数量列表
     * @return trendData
     */
    public List<SlowLogTrendPoint> getTrendData() {
        return trendData;
    }

    public void setTrendData(List<SlowLogTrendPoint> trendData) {
        this.trendData = trendData;
    }

    public ShowSlowLogTrendNewResponse withInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 时间间隔
     * @return interval
     */
    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSlowLogTrendNewResponse that = (ShowSlowLogTrendNewResponse) obj;
        return Objects.equals(this.trendData, that.trendData) && Objects.equals(this.interval, that.interval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trendData, interval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSlowLogTrendNewResponse {\n");
        sb.append("    trendData: ").append(toIndentedString(trendData)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
