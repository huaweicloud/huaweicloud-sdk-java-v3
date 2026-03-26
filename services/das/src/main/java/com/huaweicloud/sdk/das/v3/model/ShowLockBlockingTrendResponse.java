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
public class ShowLockBlockingTrendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval_millis")

    private Long intervalMillis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trend_list")

    private List<ShowLockBlockingTrendRespTrendList> trendList = null;

    public ShowLockBlockingTrendResponse withIntervalMillis(Long intervalMillis) {
        this.intervalMillis = intervalMillis;
        return this;
    }

    /**
     * 时间间隔（ms）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return intervalMillis
     */
    public Long getIntervalMillis() {
        return intervalMillis;
    }

    public void setIntervalMillis(Long intervalMillis) {
        this.intervalMillis = intervalMillis;
    }

    public ShowLockBlockingTrendResponse withTrendList(List<ShowLockBlockingTrendRespTrendList> trendList) {
        this.trendList = trendList;
        return this;
    }

    public ShowLockBlockingTrendResponse addTrendListItem(ShowLockBlockingTrendRespTrendList trendListItem) {
        if (this.trendList == null) {
            this.trendList = new ArrayList<>();
        }
        this.trendList.add(trendListItem);
        return this;
    }

    public ShowLockBlockingTrendResponse withTrendList(
        Consumer<List<ShowLockBlockingTrendRespTrendList>> trendListSetter) {
        if (this.trendList == null) {
            this.trendList = new ArrayList<>();
        }
        trendListSetter.accept(this.trendList);
        return this;
    }

    /**
     * 锁阻塞趋势列表
     * @return trendList
     */
    public List<ShowLockBlockingTrendRespTrendList> getTrendList() {
        return trendList;
    }

    public void setTrendList(List<ShowLockBlockingTrendRespTrendList> trendList) {
        this.trendList = trendList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLockBlockingTrendResponse that = (ShowLockBlockingTrendResponse) obj;
        return Objects.equals(this.intervalMillis, that.intervalMillis)
            && Objects.equals(this.trendList, that.trendList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intervalMillis, trendList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLockBlockingTrendResponse {\n");
        sb.append("    intervalMillis: ").append(toIndentedString(intervalMillis)).append("\n");
        sb.append("    trendList: ").append(toIndentedString(trendList)).append("\n");
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
